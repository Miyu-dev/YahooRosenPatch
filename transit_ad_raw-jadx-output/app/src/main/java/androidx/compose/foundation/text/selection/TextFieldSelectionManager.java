package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\rJ \u0010\"\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J \u0010'\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010\rJ\u000f\u0010+\u001a\u00020\u000bH\u0000¢\u0006\u0004\b*\u0010\rJ\u001b\u0010.\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u000f\u00101\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100J\b\u00103\u001a\u000202H\u0002J0\u0010;\u001a\u00020\u000b2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010:\u001a\u000209H\u0002J\u0010\u0010>\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<H\u0002J%\u0010E\u001a\u0002042\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DR\u0019\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR.\u0010S\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000b0R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R+\u00105\u001a\u0002042\u0006\u0010`\u001a\u0002048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010o\u001a\u0004\u0018\u00010n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010v\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010}\u001a\u0004\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R/\u0010\u008d\u0001\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010b\u001a\u0005\b\u008b\u0001\u00100\"\u0005\b\u008c\u0001\u0010\u0018R\"\u0010\u008e\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0092\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008f\u0001R7\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0093\u00012\t\u0010`\u001a\u0005\u0018\u00010\u0093\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0094\u0001\u0010b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R=\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010`\u001a\u0004\u0018\u00010\u00118F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u009a\u0001\u0010b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0005\b\u009d\u0001\u0010\u0014R\u0019\u0010\u009f\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001e\u0010¡\u0001\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0005\b£\u0001\u0010\tR \u0010¥\u0001\u001a\u00030¤\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006«\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "Lkotlin/j;", "enterSelectionMode$foundation_release", "()V", "enterSelectionMode", "exitSelectionMode$foundation_release", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", "position", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "cancelSelection", "copy$foundation_release", "(Z)V", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "isTextChanged$foundation_release", "()Z", "isTextChanged", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "transformedStartOffset", "transformedEndOffset", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "updateSelection", "Landroidx/compose/foundation/text/HandleState;", "handleState", "setHandleState", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Lkotlin/Function1;", "onValueChange", "Lkj/l;", "getOnValueChange$foundation_release", "()Lkj/l;", "setOnValueChange$foundation_release", "(Lkj/l;)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "editable$delegate", "getEditable", "setEditable", "editable", "dragBeginPosition", "J", "dragBeginOffsetInText", "Ljava/lang/Integer;", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;

    /* JADX INFO: renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* JADX INFO: renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private l<? super TextFieldValue, j> onValueChange;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;
    private VisualTransformation visualTransformation;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextFieldSelectionManager() {
        UndoManager undoManager = null;
        this(undoManager, 1, undoManager);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m984createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m985deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m988deselect_kEHs6E$foundation_release(offset);
    }

    private final Rect getContentRect() {
        float fM2586getYimpl;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.getIsLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m4811getStartimpl(getValue$foundation_release().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m4806getEndimpl(getValue$foundation_release().getSelection()));
                TextFieldState textFieldState2 = this.state;
                long jM2601getZeroF1C5BW0 = (textFieldState2 == null || (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m2601getZeroF1C5BW0() : layoutCoordinates4.mo4241localToRootMKHz9U(m991getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldState textFieldState3 = this.state;
                long jM2601getZeroF1C5BW02 = (textFieldState3 == null || (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m2601getZeroF1C5BW0() : layoutCoordinates3.mo4241localToRootMKHz9U(m991getHandlePositiontuRUvjQ$foundation_release(false));
                TextFieldState textFieldState4 = this.state;
                float fM2586getYimpl2 = 0.0f;
                if (textFieldState4 == null || (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) == null) {
                    fM2586getYimpl = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    fM2586getYimpl = Offset.m2586getYimpl(layoutCoordinates2.mo4241localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                TextFieldState textFieldState5 = this.state;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    fM2586getYimpl2 = Offset.m2586getYimpl(layoutCoordinates.mo4241localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m2585getXimpl(jM2601getZeroF1C5BW0), Offset.m2585getXimpl(jM2601getZeroF1C5BW02)), Math.min(fM2586getYimpl, fM2586getYimpl2), Math.max(Offset.m2585getXimpl(jM2601getZeroF1C5BW0), Offset.m2585getXimpl(jM2601getZeroF1C5BW02)), (textFieldState.getTextDelegate().getDensity().getDensity() * Dp.m5267constructorimpl(25)) + Math.max(Offset.m2586getYimpl(jM2601getZeroF1C5BW0), Offset.m2586getYimpl(jM2601getZeroF1C5BW02)));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m986setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue textFieldValue, int i2, int i3, boolean z, SelectionAdjustment selectionAdjustment) {
        TextLayoutResultProxy layoutResult;
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m4811getStartimpl(textFieldValue.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m4806getEndimpl(textFieldValue.getSelection())));
        TextFieldState textFieldState = this.state;
        long jM981getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m981getTextFieldSelectionbb3KNj8((textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue(), i2, i3, TextRange.m4805getCollapsedimpl(jTextRange) ? null : TextRange.m4799boximpl(jTextRange), z, selectionAdjustment);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m4811getStartimpl(jM981getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m4806getEndimpl(jM981getTextFieldSelectionbb3KNj8)));
        if (TextRange.m4804equalsimpl0(jTextRange2, textFieldValue.getSelection())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo3390performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3399getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m984createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), jTextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m987contextMenuOpenAdjustmentk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) {
            return;
        }
        int iM901getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(layoutResult, position, false, 2, null);
        if (TextRange.m4802containsimpl(getValue$foundation_release().getSelection(), iM901getOffsetForPosition3MmeM6k$default)) {
            return;
        }
        updateSelection(getValue$foundation_release(), iM901getOffsetForPosition3MmeM6k$default, iM901getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m4805getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (cancelSelection) {
            int iM4808getMaximpl = TextRange.m4808getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(m984createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM4808getMaximpl, iM4808getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo863onDownk4lQ0M(long point) {
                this.this$0.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m991getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo864onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m2590plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(Offset.m2590plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetM989getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m989getCurrentDragPosition_m7T9E();
                m.e(offsetM989getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(value.m4783getOffsetForPositionk4lQ0M(offsetM989getCurrentDragPosition_m7T9E.getPackedValue()));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m4804equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.mo3390performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3399getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m984createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo865onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m991getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(textFieldSelectionManager2.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m2601getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m986setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m986setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m4805getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM4809getMinimpl = TextRange.m4809getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m984createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM4809getMinimpl, iM4809getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m988deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset r9) {
        /*
            r8 = this;
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.getValue$foundation_release()
            long r0 = r0.getSelection()
            boolean r0 = androidx.compose.ui.text.TextRange.m4805getCollapsedimpl(r0)
            if (r0 != 0) goto L50
            androidx.compose.foundation.text.TextFieldState r0 = r8.state
            if (r0 == 0) goto L17
            androidx.compose.foundation.text.TextLayoutResultProxy r0 = r0.getLayoutResult()
            goto L18
        L17:
            r0 = 0
        L18:
            r1 = r0
            if (r9 == 0) goto L2f
            if (r1 == 0) goto L2f
            androidx.compose.ui.text.input.OffsetMapping r0 = r8.offsetMapping
            long r2 = r9.getPackedValue()
            r4 = 0
            r5 = 2
            r6 = 0
            int r1 = androidx.compose.foundation.text.TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(r1, r2, r4, r5, r6)
            int r0 = r0.transformedToOriginal(r1)
            goto L3b
        L2f:
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.getValue$foundation_release()
            long r0 = r0.getSelection()
            int r0 = androidx.compose.ui.text.TextRange.m4808getMaximpl(r0)
        L3b:
            androidx.compose.ui.text.input.TextFieldValue r1 = r8.getValue$foundation_release()
            r2 = 0
            long r3 = androidx.compose.ui.text.TextRangeKt.TextRange(r0)
            r5 = 0
            r6 = 5
            r7 = 0
            androidx.compose.ui.text.input.TextFieldValue r0 = androidx.compose.ui.text.input.TextFieldValue.m5015copy3r_uNRQ$default(r1, r2, r3, r5, r6, r7)
            kj.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.j> r1 = r8.onValueChange
            r1.invoke(r0)
        L50:
            if (r9 == 0) goto L68
            androidx.compose.ui.text.input.TextFieldValue r9 = r8.getValue$foundation_release()
            java.lang.String r9 = r9.getText()
            int r9 = r9.length()
            if (r9 <= 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            if (r9 == 0) goto L68
            androidx.compose.foundation.text.HandleState r9 = androidx.compose.foundation.text.HandleState.Cursor
            goto L6a
        L68:
            androidx.compose.foundation.text.HandleState r9 = androidx.compose.foundation.text.HandleState.None
        L6a:
            r8.setHandleState(r9)
            r8.hideSelectionToolbar$foundation_release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.m988deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset):void");
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z = true;
        }
        if (z && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    /* JADX INFO: renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m989getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX INFO: renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m990getCursorPositiontuRUvjQ$foundation_release(Density density) {
        m.h(density, "density");
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m4811getStartimpl(getValue$foundation_release().getSelection()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        m.e(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(a.l.i(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset((density.mo348toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2) + cursorRect.getLeft(), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m991getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        long selection = getValue$foundation_release().getSelection();
        int iM4811getStartimpl = isStartHandle ? TextRange.m4811getStartimpl(selection) : TextRange.m4806getEndimpl(selection);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        m.e(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(iM4811getStartimpl), isStartHandle, TextRange.m4810getReversedimpl(getValue$foundation_release().getSelection()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX INFO: renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* JADX INFO: renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final l<TextFieldValue, j> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: getState$foundation_release, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* JADX INFO: renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    /* JADX INFO: renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo863onDownk4lQ0M(long point) {
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m991getHandlePositiontuRUvjQ$foundation_release(isStartHandle))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo864onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                int iOriginalToTransformed;
                int iM4783getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m2590plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    boolean z = isStartHandle;
                    textFieldSelectionManager2.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(Offset.m2590plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                    if (z) {
                        Offset offsetM989getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m989getCurrentDragPosition_m7T9E();
                        m.e(offsetM989getCurrentDragPosition_m7T9E);
                        iOriginalToTransformed = value.m4783getOffsetForPositionk4lQ0M(offsetM989getCurrentDragPosition_m7T9E.getPackedValue());
                    } else {
                        iOriginalToTransformed = textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m4811getStartimpl(textFieldSelectionManager2.getValue$foundation_release().getSelection()));
                    }
                    int i2 = iOriginalToTransformed;
                    if (z) {
                        iM4783getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m4806getEndimpl(textFieldSelectionManager2.getValue$foundation_release().getSelection()));
                    } else {
                        Offset offsetM989getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m989getCurrentDragPosition_m7T9E();
                        m.e(offsetM989getCurrentDragPosition_m7T9E2);
                        iM4783getOffsetForPositionk4lQ0M = value.m4783getOffsetForPositionk4lQ0M(offsetM989getCurrentDragPosition_m7T9E2.getPackedValue());
                    }
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i2, iM4783getOffsetForPositionk4lQ0M, z, SelectionAdjustment.INSTANCE.getCharacter());
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo865onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m935getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m991getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(textFieldSelectionManager2.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m2601getZeroF1C5BW0();
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldState state = this.this$0.getState();
                if (state == null) {
                    return;
                }
                state.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m986setCurrentDragPosition_kEHs6E(null);
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = this.this$0.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    this.this$0.showSelectionToolbar$foundation_release();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m986setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !m.c(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int length = text.length() + TextRange.m4809getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m984createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(length, length)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM984createTextFieldValueFDrldGo = m984createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM984createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m5015copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM984createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setShowFloatingToolbar(true);
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        m.h(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(l<? super TextFieldValue, j> lVar) {
        m.h(lVar, "<set-?>");
        this.onValueChange = lVar;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        m.h(textFieldValue, "<set-?>");
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        m.h(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showSelectionToolbar$foundation_release() {
        /*
            r9 = this;
            androidx.compose.ui.text.input.VisualTransformation r0 = r9.visualTransformation
            boolean r0 = r0 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            long r1 = r1.getSelection()
            boolean r1 = androidx.compose.ui.text.TextRange.m4805getCollapsedimpl(r1)
            r2 = 0
            if (r1 != 0) goto L1c
            if (r0 != 0) goto L1c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r1.<init>()
            r5 = r1
            goto L1d
        L1c:
            r5 = r2
        L1d:
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            long r3 = r1.getSelection()
            boolean r1 = androidx.compose.ui.text.TextRange.m4805getCollapsedimpl(r3)
            if (r1 != 0) goto L3a
            boolean r1 = r9.getEditable()
            if (r1 == 0) goto L3a
            if (r0 != 0) goto L3a
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r0.<init>()
            r7 = r0
            goto L3b
        L3a:
            r7 = r2
        L3b:
            boolean r0 = r9.getEditable()
            if (r0 == 0) goto L57
            androidx.compose.ui.platform.ClipboardManager r0 = r9.clipboardManager
            r1 = 0
            if (r0 == 0) goto L4e
            boolean r0 = r0.hasText()
            r3 = 1
            if (r0 != r3) goto L4e
            r1 = r3
        L4e:
            if (r1 == 0) goto L57
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r0.<init>()
            r6 = r0
            goto L58
        L57:
            r6 = r2
        L58:
            androidx.compose.ui.text.input.TextFieldValue r0 = r9.getValue$foundation_release()
            long r0 = r0.getSelection()
            int r0 = androidx.compose.ui.text.TextRange.m4807getLengthimpl(r0)
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            if (r0 == r1) goto L77
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r2.<init>()
        L77:
            r8 = r2
            androidx.compose.ui.platform.TextToolbar r3 = r9.textToolbar
            if (r3 == 0) goto L83
            androidx.compose.ui.geometry.Rect r4 = r9.getContentRect()
            r3.showMenu(r4, r5, r6, r7, r8)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar$foundation_release():void");
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new l<TextFieldValue, j>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            public final void invoke(TextFieldValue textFieldValue) {
                m.h(textFieldValue, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return j.a;
            }
        };
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        this.editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m2601getZeroF1C5BW0();
        this.dragTotalDistance = companion.m2601getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo864onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m2590plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    textFieldSelectionManager2.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(Offset.m2590plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                    Integer num = textFieldSelectionManager2.dragBeginOffsetInText;
                    int iIntValue = num != null ? num.intValue() : layoutResult.m903getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false);
                    Offset offsetM989getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m989getCurrentDragPosition_m7T9E();
                    m.e(offsetM989getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), iIntValue, layoutResult.m903getOffsetForPosition3MmeM6k(offsetM989getCurrentDragPosition_m7T9E.getPackedValue(), false), false, SelectionAdjustment.INSTANCE.getWord());
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo865onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state;
                TextLayoutResultProxy layoutResult2;
                TextLayoutResultProxy layoutResult3;
                if (this.this$0.getDraggingHandle() != null) {
                    return;
                }
                this.this$0.setDraggingHandle(Handle.SelectionEnd);
                this.this$0.hideSelectionToolbar$foundation_release();
                TextFieldState state2 = this.this$0.getState();
                if (!((state2 == null || (layoutResult3 = state2.getLayoutResult()) == null || !layoutResult3.m904isPositionOnTextk4lQ0M(startPoint)) ? false : true) && (state = this.this$0.getState()) != null && (layoutResult2 = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                    int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult2, layoutResult2.getLineForVerticalPosition(Offset.m2586getYimpl(startPoint)), false, 2, null));
                    HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo3390performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3399getTextHandleMove5zf0vsI());
                    }
                    TextFieldValue textFieldValueM984createTextFieldValueFDrldGo = textFieldSelectionManager.m984createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                    textFieldSelectionManager.enterSelectionMode$foundation_release();
                    textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM984createTextFieldValueFDrldGo);
                    return;
                }
                if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                this.this$0.enterSelectionMode$foundation_release();
                TextFieldState state3 = this.this$0.getState();
                if (state3 != null && (layoutResult = state3.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    int iM901getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(layoutResult, startPoint, false, 2, null);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), iM901getOffsetForPosition3MmeM6k$default, iM901getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
                    textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(iM901getOffsetForPosition3MmeM6k$default);
                }
                this.this$0.dragBeginPosition = startPoint;
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                textFieldSelectionManager3.m986setCurrentDragPosition_kEHs6E(Offset.m2574boximpl(textFieldSelectionManager3.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m2601getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m986setCurrentDragPosition_kEHs6E(null);
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = this.this$0.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    this.this$0.showSelectionToolbar$foundation_release();
                }
                this.this$0.dragBeginOffsetInText = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo863onDownk4lQ0M(long point) {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onDrag-3MmeM6k */
            public boolean mo866onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                m.h(adjustment, "adjustment");
                if ((this.this$0.getValue$foundation_release().getText().length() == 0) || (state = this.this$0.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                int iM903getOffsetForPosition3MmeM6k = layoutResult.m903getOffsetForPosition3MmeM6k(dragPosition, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                Integer num = textFieldSelectionManager.dragBeginOffsetInText;
                m.e(num);
                textFieldSelectionManager.updateSelection(value$foundation_release, num.intValue(), iM903getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtend-k-4lQ0M */
            public boolean mo867onExtendk4lQ0M(long downPosition) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m4811getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo868onExtendDragk4lQ0M(long dragPosition) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                if ((this.this$0.getValue$foundation_release().getText().length() == 0) || (state = this.this$0.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m4811getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), layoutResult.m903getOffsetForPosition3MmeM6k(dragPosition, false), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onStart-3MmeM6k */
            public boolean mo869onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                m.h(adjustment, "adjustment");
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                this.this$0.dragBeginPosition = downPosition;
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null));
                int iM901getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(layoutResult, textFieldSelectionManager.dragBeginPosition, false, 2, null);
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), iM901getOffsetForPosition3MmeM6k$default, iM901getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : undoManager);
    }
}
