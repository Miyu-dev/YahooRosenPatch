package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b}\u0010~Jo\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00109\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R4\u0010@\u001a\u00020:2\u0006\u00102\u001a\u00020:8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00104R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010V\u001a\u00020P2\u0006\u00102\u001a\u00020P8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u00104\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R+\u0010^\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u00104\u001a\u0004\b\\\u00106\"\u0004\b]\u00108R+\u0010b\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00104\u001a\u0004\b`\u00106\"\u0004\ba\u00108R+\u0010f\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00104\u001a\u0004\bd\u00106\"\u0004\be\u00108R$\u0010g\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010X\u001a\u0004\bg\u00106R\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010l\u001a\u0004\bm\u0010nR&\u0010p\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u000f0\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010l\u001a\u0004\bq\u0010nR\u0017\u0010s\u001a\u00020r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR(\u0010|\u001a\u0004\u0018\u00010I2\b\u0010w\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Lkotlin/j;", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkj/l;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "Landroidx/compose/ui/text/input/TextInputSession;", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "<set-?>", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField$delegate", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResultState", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", "handleState$delegate", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "showFloatingToolbar", "Z", "getShowFloatingToolbar", "setShowFloatingToolbar", "showSelectionHandleStart$delegate", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", "showSelectionHandleEnd$delegate", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "isLayoutResultStale", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "onValueChangeOriginal", "Lkj/l;", "getOnValueChange", "()Lkj/l;", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "getOnImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "value", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldState {

    /* JADX INFO: renamed from: handleState$delegate, reason: from kotlin metadata */
    private final MutableState handleState;

    /* JADX INFO: renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private TextInputSession inputSession;
    private boolean isLayoutResultStale;
    private final KeyboardActionRunner keyboardActionRunner;
    private LayoutCoordinates layoutCoordinates;
    private final MutableState<TextLayoutResultProxy> layoutResultState;

    /* JADX INFO: renamed from: minHeightForSingleLineField$delegate, reason: from kotlin metadata */
    private final MutableState minHeightForSingleLineField;
    private final l<ImeAction, j> onImeActionPerformed;
    private final l<TextFieldValue, j> onValueChange;
    private l<? super TextFieldValue, j> onValueChangeOriginal;
    private final EditProcessor processor;
    private final RecomposeScope recomposeScope;
    private final Paint selectionPaint;

    /* JADX INFO: renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final MutableState showCursorHandle;
    private boolean showFloatingToolbar;

    /* JADX INFO: renamed from: showSelectionHandleEnd$delegate, reason: from kotlin metadata */
    private final MutableState showSelectionHandleEnd;

    /* JADX INFO: renamed from: showSelectionHandleStart$delegate, reason: from kotlin metadata */
    private final MutableState showSelectionHandleStart;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public TextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope) {
        m.h(textDelegate, "textDelegate");
        m.h(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5265boximpl(Dp.m5267constructorimpl(0)), null, 2, null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showSelectionHandleStart = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.keyboardActionRunner = new KeyboardActionRunner();
        this.onValueChangeOriginal = new l<TextFieldValue, j>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
            public final void invoke(TextFieldValue textFieldValue) {
                m.h(textFieldValue, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return j.a;
            }
        };
        this.onValueChange = new l<TextFieldValue, j>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return j.a;
            }

            public final void invoke(TextFieldValue textFieldValue) {
                m.h(textFieldValue, "it");
                String text = textFieldValue.getText();
                AnnotatedString untransformedText = this.this$0.getUntransformedText();
                if (!m.c(text, untransformedText != null ? untransformedText.getText() : null)) {
                    this.this$0.setHandleState(HandleState.None);
                }
                this.this$0.onValueChangeOriginal.invoke(textFieldValue);
                this.this$0.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new l<ImeAction, j>() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m898invokeKlQnJC8(((ImeAction) obj).getValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m898invokeKlQnJC8(int i2) {
                this.this$0.keyboardActionRunner.m821runActionKlQnJC8(i2);
            }
        };
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState getHandleState() {
        return (HandleState) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m895getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField.getValue()).m5281unboximpl();
    }

    public final l<ImeAction, j> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final l<TextFieldValue, j> getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    /* JADX INFO: renamed from: isLayoutResultStale, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setHandleState(HandleState handleState) {
        m.h(handleState, "<set-?>");
        this.handleState.setValue(handleState);
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m896setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField.setValue(Dp.m5265boximpl(f));
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar = z;
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        m.h(textDelegate, "<set-?>");
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* JADX INFO: renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m897updatefnh65Uc(AnnotatedString untransformedText, AnnotatedString visualText, TextStyle textStyle, boolean softWrap, Density density, FontFamily.Resolver fontFamilyResolver, l<? super TextFieldValue, j> onValueChange, KeyboardActions keyboardActions, FocusManager focusManager, long selectionBackgroundColor) {
        m.h(untransformedText, "untransformedText");
        m.h(visualText, "visualText");
        m.h(textStyle, "textStyle");
        m.h(density, "density");
        m.h(fontFamilyResolver, "fontFamilyResolver");
        m.h(onValueChange, "onValueChange");
        m.h(keyboardActions, "keyboardActions");
        m.h(focusManager, "focusManager");
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo2706setColor8_81llA(selectionBackgroundColor);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        keyboardActionRunner.setInputSession(this.inputSession);
        this.untransformedText = untransformedText;
        TextDelegate textDelegateM813updateTextDelegaterm0N8CA = CoreTextKt.m813updateTextDelegaterm0N8CA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (448 & 32) != 0 ? true : softWrap, (448 & 64) != 0 ? TextOverflow.INSTANCE.m5219getClipgIe3tQ8() : 0, (448 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Integer.MAX_VALUE : 0, (448 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? 1 : 0, EmptyList.INSTANCE);
        if (this.textDelegate != textDelegateM813updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateM813updateTextDelegaterm0N8CA;
    }
}
