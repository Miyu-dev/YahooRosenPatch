package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.o;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ej.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kj.l;
import kj.p;
import kj.q;
import kj.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"J9\u0010-\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J?\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u001b\u00106\u001a\u00020\u00192\u0006\u00103\u001a\u00020&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\b\u00107\u001a\u00020\u0019H\u0002J\b\u00108\u001a\u00020\u0019H\u0002J\b\u0010:\u001a\u000209H\u0002J.\u0010>\u001a\u00020\u0019*\u00020;2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190<H\u0082@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010C\u001a\u00020@*\u00020@2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190AH\u0002J'\u0010H\u001a\u0004\u0018\u00010&2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020&H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ-\u0010K\u001a\u00020\u00192\u0006\u00103\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010R\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR0\u0010X\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00190<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010_\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010m\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010t\u001a\u00020s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR+\u0010~\u001a\u00020\"2\u0006\u0010z\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010Q\u001a\u0004\b|\u0010U\"\u0004\b}\u0010WR!\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010\u007fR5\u0010\u0081\u0001\u001a\u0004\u0018\u00010\b2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010\n\"\u0006\b\u0084\u0001\u0010\u0085\u0001R9\u0010\u008a\u0001\u001a\u00020&2\u0006\u0010z\u001a\u00020&8@@BX\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u0086\u0001\u0010Q\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u00105R9\u0010\u008e\u0001\u001a\u00020&2\u0006\u0010z\u001a\u00020&8@@BX\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u008b\u0001\u0010Q\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001\"\u0005\b\u008d\u0001\u00105R=\u0010.\u001a\u0004\u0018\u00010&2\b\u0010z\u001a\u0004\u0018\u00010&8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010Q\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R=\u0010/\u001a\u0004\u0018\u00010&2\b\u0010z\u001a\u0004\u0018\u00010&8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u0094\u0001\u0010Q\u001a\u0006\b\u0095\u0001\u0010\u0091\u0001\"\u0006\b\u0096\u0001\u0010\u0093\u0001R7\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0097\u00012\t\u0010z\u001a\u0005\u0018\u00010\u0097\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0098\u0001\u0010Q\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R>\u0010¡\u0001\u001a\u0004\u0018\u00010&2\b\u0010z\u001a\u0004\u0018\u00010&8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u009e\u0001\u0010Q\u001a\u0006\b\u009f\u0001\u0010\u0091\u0001\"\u0006\b \u0001\u0010\u0093\u0001R.\u0010¦\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010©\u0001\u001a\u00020@8F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010U\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006®\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "", "selectAll$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "selectAll", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "Lkotlin/j;", "copy$foundation_release", "()V", "copy", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "onRelease", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "Landroidx/compose/ui/geometry/Offset;", "newPosition", "previousPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "updateSelection-RHHTvR4$foundation_release", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "updateHandleOffsets", "updateSelectionToolbarPosition", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "onTap", "detectNonConsumingTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkj/l;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "onClearSelectionRequested", "layoutCoordinates", TypedValues.CycleType.S_WAVE_OFFSET, "convertToContainerCoordinates-Q7Q5hAU", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", "convertToContainerCoordinates", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "startSelection", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "_selection", "Landroidx/compose/runtime/MutableState;", "touchMode", "Z", "getTouchMode", "()Z", "setTouchMode", "(Z)V", "onSelectionChange", "Lkj/l;", "getOnSelectionChange", "()Lkj/l;", "setOnSelectionChange", "(Lkj/l;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus$delegate", "getHasFocus", "setHasFocus", "hasFocus", "Landroidx/compose/ui/geometry/Offset;", "value", "containerLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "dragBeginPosition$delegate", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "dragBeginPosition", "dragTotalDistance$delegate", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "startHandlePosition$delegate", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "endHandlePosition$delegate", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "getShouldShowMagnifier", "shouldShowMagnifier", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class SelectionManager {
    private final MutableState<Selection> _selection;
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;

    /* JADX INFO: renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;

    /* JADX INFO: renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    private final MutableState dragBeginPosition;

    /* JADX INFO: renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    private final MutableState dragTotalDistance;

    /* JADX INFO: renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState endHandlePosition;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private l<? super Selection, j> onSelectionChange;
    private Offset previousPosition;
    private final SelectionRegistrarImpl selectionRegistrar;

    /* JADX INFO: renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState startHandlePosition;
    private TextToolbar textToolbar;
    private boolean touchMode;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {627}, m = "invokeSuspend")
    public static final class C02732 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ l<Offset, j> $onTap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02732(l<? super Offset, j> lVar, dj.c<? super C02732> cVar) {
            super(2, cVar);
            this.$onTap = lVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C02732 c02732 = new C02732(this.$onTap, cVar);
            c02732.L$0 = obj;
            return c02732;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.$onTap.invoke(Offset.m2574boximpl(pointerInputChange.getPosition()));
            }
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {634}, m = "invokeSuspend")
    public static final class C02751 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ kj.a<j> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02751(kj.a<j> aVar, dj.c<? super C02751> cVar) {
            super(2, cVar);
            this.$block = aVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C02751 c02751 = SelectionManager.this.new C02751(this.$block, cVar);
            c02751.L$0 = obj;
            return c02751;
        }

        public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
            return create(pointerInputScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                SelectionManager selectionManager = SelectionManager.this;
                final kj.a<j> aVar = this.$block;
                l<Offset, j> lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m968invokek4lQ0M(((Offset) obj2).getPackedValue());
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m968invokek4lQ0M(long j) {
                        aVar.invoke();
                    }
                };
                this.label = 1;
                if (selectionManager.detectNonConsumingTap(pointerInputScope, lVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        m.h(selectionRegistrarImpl, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrarImpl;
        this._selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.touchMode = true;
        this.onSelectionChange = new l<Selection, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
            public final void invoke(Selection selection) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Selection) obj);
                return j.a;
            }
        };
        this.focusRequester = new FocusRequester();
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2574boximpl(companion.m2601getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2574boximpl(companion.m2601getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new l<Long, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return j.a;
            }

            public final void invoke(long j) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (!((selection == null || (start = selection.getStart()) == null || j != start.getSelectableId()) ? false : true)) {
                    Selection selection2 = SelectionManager.this.getSelection();
                    if (!((selection2 == null || (end = selection2.getEnd()) == null || j != end.getSelectableId()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbarPosition();
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new q<LayoutCoordinates, Offset, SelectionAdjustment, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m963invoked4ec7I((LayoutCoordinates) obj, ((Offset) obj2).getPackedValue(), (SelectionAdjustment) obj3);
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final void m963invoked4ec7I(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment) {
                m.h(layoutCoordinates, "layoutCoordinates");
                m.h(selectionAdjustment, "selectionMode");
                Offset offsetM948convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m948convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j);
                if (offsetM948convertToContainerCoordinatesQ7Q5hAU != null) {
                    SelectionManager.this.m954startSelection9KIMszo(offsetM948convertToContainerCoordinatesQ7Q5hAU.getPackedValue(), false, selectionAdjustment);
                    SelectionManager.this.getFocusRequester().requestFocus();
                    SelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new l<Long, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return j.a;
            }

            public final void invoke(long j) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, Map<Long, Selection>> pairSelectAll$foundation_release = selectionManager.selectAll$foundation_release(j, selectionManager.getSelection());
                Selection selection = (Selection) pairSelectAll$foundation_release.component1();
                Map<Long, Selection> map = (Map) pairSelectAll$foundation_release.component2();
                if (!m.c(selection, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(map);
                    SelectionManager.this.getOnSelectionChange().invoke(selection);
                }
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new s<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(5);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return m964invoke5iVPX68((LayoutCoordinates) obj, ((Offset) obj2).getPackedValue(), ((Offset) obj3).getPackedValue(), ((Boolean) obj4).booleanValue(), (SelectionAdjustment) obj5);
            }

            /* JADX INFO: renamed from: invoke-5iVPX68, reason: not valid java name */
            public final Boolean m964invoke5iVPX68(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
                m.h(layoutCoordinates, "layoutCoordinates");
                m.h(selectionAdjustment, "selectionMode");
                return Boolean.valueOf(SelectionManager.this.m962updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m948convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j), SelectionManager.this.m948convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j2), z, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new kj.a<j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m965invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m965invoke() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m949setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new l<Long, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return j.a;
            }

            public final void invoke(long j) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j))) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new l<Long, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return j.a;
            }

            public final void invoke(long j) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (!((selection == null || (start = selection.getStart()) == null || j != start.getSelectableId()) ? false : true)) {
                    Selection selection2 = SelectionManager.this.getSelection();
                    if (!((selection2 == null || (end = selection2.getEnd()) == null || j != end.getSelectableId()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.m953setStartHandlePosition_kEHs6E(null);
                SelectionManager.this.m952setEndHandlePosition_kEHs6E(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public final Offset m948convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m2574boximpl(requireContainerCoordinates$foundation_release().mo4240localPositionOfR5De75A(layoutCoordinates, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, l<? super Offset, j> lVar, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C02732(lVar, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.INSTANCE.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
            return Rect.INSTANCE.getZero();
        }
        if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        if (layoutCoordinates3 == null || !layoutCoordinates3.isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        long jMo4240localPositionOfR5De75A = layoutCoordinates3.mo4240localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo917getHandlePositiondBAh8RU(selection, true));
        long jMo4240localPositionOfR5De75A2 = layoutCoordinates3.mo4240localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo917getHandlePositiondBAh8RU(selection, false));
        long jMo4241localToRootMKHz9U = layoutCoordinates3.mo4241localToRootMKHz9U(jMo4240localPositionOfR5De75A);
        long jMo4241localToRootMKHz9U2 = layoutCoordinates3.mo4241localToRootMKHz9U(jMo4240localPositionOfR5De75A2);
        return new Rect(Math.min(Offset.m2585getXimpl(jMo4241localToRootMKHz9U), Offset.m2585getXimpl(jMo4241localToRootMKHz9U2)), Math.min(Offset.m2586getYimpl(layoutCoordinates3.mo4241localToRootMKHz9U(layoutCoordinates3.mo4240localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m2586getYimpl(layoutCoordinates3.mo4241localToRootMKHz9U(layoutCoordinates3.mo4240localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m2585getXimpl(jMo4241localToRootMKHz9U), Offset.m2585getXimpl(jMo4241localToRootMKHz9U2)), Math.max(Offset.m2586getYimpl(jMo4241localToRootMKHz9U), Offset.m2586getYimpl(jMo4241localToRootMKHz9U2)) + ((float) (((double) SelectionHandlesKt.getHandleHeight()) * 4.0d)));
    }

    private final boolean getShouldShowMagnifier() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, kj.a<j> aVar) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, j.a, new C02751(aVar, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m949setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m950setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition.setValue(Offset.m2574boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m951setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance.setValue(Offset.m2574boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m952setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m953setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m954startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        m961updateSelection3R_tFg$foundation_release(position, position, null, isStartHandle, adjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        Selectable anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            m953setStartHandlePosition_kEHs6E(null);
            m952setEndHandlePosition_kEHs6E(null);
            return;
        }
        boolean z = true;
        long jMo4240localPositionOfR5De75A = layoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release.mo917getHandlePositiondBAh8RU(selection, true));
        long jMo4240localPositionOfR5De75A2 = layoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates3, anchorSelectable$foundation_release2.mo917getHandlePositiondBAh8RU(selection, false));
        Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        Offset offsetM2574boximpl = Offset.m2574boximpl(jMo4240localPositionOfR5De75A);
        offsetM2574boximpl.getPackedValue();
        if (!(SelectionManagerKt.m971containsInclusiveUv8p0NA(rectVisibleBounds, jMo4240localPositionOfR5De75A) || getDraggingHandle() == Handle.SelectionStart)) {
            offsetM2574boximpl = null;
        }
        m953setStartHandlePosition_kEHs6E(offsetM2574boximpl);
        Offset offsetM2574boximpl2 = Offset.m2574boximpl(jMo4240localPositionOfR5De75A2);
        offsetM2574boximpl2.getPackedValue();
        if (!SelectionManagerKt.m971containsInclusiveUv8p0NA(rectVisibleBounds, jMo4240localPositionOfR5De75A2) && getDraggingHandle() != Handle.SelectionEnd) {
            z = false;
        }
        m952setEndHandlePosition_kEHs6E(z ? offsetM2574boximpl2 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m955contextMenuOpenAdjustmentk4lQ0M(long position) {
        Selection selection = getSelection();
        if (selection != null ? TextRange.m4805getCollapsedimpl(selection.m925toTextRanged9O1mEE()) : true) {
            m954startSelection9KIMszo(position, true, SelectionAdjustment.INSTANCE.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchor) {
        m.h(anchor, "anchor");
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m956getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m957getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m958getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m959getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final Modifier getModifier() {
        Modifier modifierSelectionMagnifier = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifierSelectionMagnifier, new kj.a<j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m966invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m966invoke() {
                this.this$0.onRelease();
            }
        }), new l<LayoutCoordinates, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return j.a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                m.h(layoutCoordinates, "it");
                this.this$0.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new l<FocusState, j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return j.a;
            }

            public final void invoke(FocusState focusState) {
                m.h(focusState, "focusState");
                if (!focusState.isFocused() && this.this$0.getHasFocus()) {
                    this.this$0.onRelease();
                }
                this.this$0.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m967invokeZmokQxo(((KeyEvent) obj).m4001unboximpl());
            }

            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m967invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                m.h(keyEvent, "it");
                if (SelectionManager_androidKt.m972isCopyKeyEventZmokQxo(keyEvent)) {
                    this.this$0.copy$foundation_release();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        if (getShouldShowMagnifier()) {
            modifierSelectionMagnifier = SelectionManager_androidKt.selectionMagnifier(modifierSelectionMagnifier, this);
        }
        return modifierOnKeyEvent.then(modifierSelectionMagnifier);
    }

    public final l<Selection, j> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString annotatedStringPlus;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (annotatedString != null && (annotatedStringPlus = annotatedString.plus(currentSelectedText)) != null) {
                    currentSelectedText = annotatedStringPlus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    return currentSelectedText;
                }
                annotatedString = currentSelectedText;
            }
        }
        return annotatedString;
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m960getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m949setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo863onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                Selection selection = SelectionManager.this.getSelection();
                if (selection == null) {
                    return;
                }
                Selectable anchorSelectable$foundation_release = SelectionManager.this.getAnchorSelectable$foundation_release(isStartHandle ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long jM935getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo917getHandlePositiondBAh8RU(selection, isStartHandle));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m949setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo4240localPositionOfR5De75A(layoutCoordinates, jM935getAdjustedCoordinatesk4lQ0M)));
                SelectionManager.this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo864onDragk4lQ0M(long delta) {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m951setDragTotalDistancek4lQ0M(Offset.m2590plusMKHz9U(selectionManager.m958getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long jM2590plusMKHz9U = Offset.m2590plusMKHz9U(SelectionManager.this.m957getDragBeginPositionF1C5BW0$foundation_release(), SelectionManager.this.m958getDragTotalDistanceF1C5BW0$foundation_release());
                if (SelectionManager.this.m962updateSelectionRHHTvR4$foundation_release(Offset.m2574boximpl(jM2590plusMKHz9U), Offset.m2574boximpl(SelectionManager.this.m957getDragBeginPositionF1C5BW0$foundation_release()), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.m950setDragBeginPositionk4lQ0M(jM2590plusMKHz9U);
                    SelectionManager.this.m951setDragTotalDistancek4lQ0M(Offset.INSTANCE.m2601getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo865onStartk4lQ0M(long startPoint) {
                LayoutCoordinates layoutCoordinates;
                long jMo917getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                m.e(selection);
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                if (isStartHandle) {
                    layoutCoordinates = selectable != null ? selectable.getLayoutCoordinates() : null;
                    m.e(layoutCoordinates);
                } else {
                    layoutCoordinates = selectable2 != null ? selectable2.getLayoutCoordinates() : null;
                    m.e(layoutCoordinates);
                }
                if (isStartHandle) {
                    m.e(selectable);
                    jMo917getHandlePositiondBAh8RU = selectable.mo917getHandlePositiondBAh8RU(selection, true);
                } else {
                    m.e(selectable2);
                    jMo917getHandlePositiondBAh8RU = selectable2.mo917getHandlePositiondBAh8RU(selection, false);
                }
                long jM935getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(jMo917getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m950setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo4240localPositionOfR5De75A(layoutCoordinates, jM935getAdjustedCoordinatesk4lQ0M));
                SelectionManager.this.m951setDragTotalDistancek4lQ0M(Offset.INSTANCE.m2601getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m949setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m949setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(a0.a);
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke((Object) null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3390performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3399getTextHandleMove5zf0vsI());
            }
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (!(layoutCoordinates != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final Pair<Selection, Map<Long, Selection>> selectAll$foundation_release(long selectableId, Selection previousSelection) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (!m.c(selectionMerge, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3390performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3399getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, linkedHashMap);
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM2574boximpl = layoutCoordinates != null ? Offset.m2574boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (m.c(this.previousPosition, offsetM2574boximpl)) {
            return;
        }
        this.previousPosition = offsetM2574boximpl;
        updateHandleOffsets();
        updateSelectionToolbarPosition();
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        m.h(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final void setOnSelectionChange(l<? super Selection, j> lVar) {
        m.h(lVar, "<set-?>");
        this.onSelectionChange = lVar;
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTouchMode(boolean z) {
        this.touchMode = z;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (!getHasFocus() || getSelection() == null || (textToolbar = this.textToolbar) == null) {
            return;
        }
        o.a(textToolbar, getContentRect(), new kj.a<j>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$showSelectionToolbar$1$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m969invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m969invoke() {
                this.this$0.copy$foundation_release();
                this.this$0.onRelease();
            }
        }, null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: updateSelection-3R_-tFg$foundation_release, reason: not valid java name */
    public final boolean m961updateSelection3R_tFg$foundation_release(long startHandlePosition, long endHandlePosition, Offset previousHandlePosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        m.h(adjustment, "adjustment");
        setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        m949setCurrentDragPosition_kEHs6E(isStartHandle ? Offset.m2574boximpl(startHandlePosition) : Offset.m2574boximpl(endHandlePosition));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            Selectable selectable = listSort.get(i2);
            int i3 = i2;
            Selection selection = selectionMerge;
            Pair<Selection, Boolean> pairMo919updateSelectionqCDeeow = selectable.mo919updateSelectionqCDeeow(startHandlePosition, endHandlePosition, previousHandlePosition, isStartHandle, requireContainerCoordinates$foundation_release(), adjustment, this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection selection2 = (Selection) pairMo919updateSelectionqCDeeow.component1();
            z = z || ((Boolean) pairMo919updateSelectionqCDeeow.component2()).booleanValue();
            if (selection2 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection2);
            }
            selectionMerge = SelectionManagerKt.merge(selection, selection2);
            i2 = i3 + 1;
        }
        Selection selection3 = selectionMerge;
        if (!m.c(selection3, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3390performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3399getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection3);
        }
        return z;
    }

    /* JADX INFO: renamed from: updateSelection-RHHTvR4$foundation_release, reason: not valid java name */
    public final boolean m962updateSelectionRHHTvR4$foundation_release(Offset newPosition, Offset previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        Selection selection;
        Offset offsetM948convertToContainerCoordinatesQ7Q5hAU;
        m.h(adjustment, "adjustment");
        if (newPosition == null || (selection = getSelection()) == null) {
            return false;
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(isStartHandle ? selection.getEnd().getSelectableId() : selection.getStart().getSelectableId()));
        if (selectable == null) {
            offsetM948convertToContainerCoordinatesQ7Q5hAU = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            m.e(layoutCoordinates);
            offsetM948convertToContainerCoordinatesQ7Q5hAU = m948convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(selectable.mo917getHandlePositiondBAh8RU(selection, !isStartHandle)));
        }
        if (offsetM948convertToContainerCoordinatesQ7Q5hAU == null) {
            return false;
        }
        long packedValue = offsetM948convertToContainerCoordinatesQ7Q5hAU.getPackedValue();
        long packedValue2 = isStartHandle ? newPosition.getPackedValue() : packedValue;
        if (!isStartHandle) {
            packedValue = newPosition.getPackedValue();
        }
        return m961updateSelection3R_tFg$foundation_release(packedValue2, packedValue, previousPosition, isStartHandle, adjustment);
    }
}
