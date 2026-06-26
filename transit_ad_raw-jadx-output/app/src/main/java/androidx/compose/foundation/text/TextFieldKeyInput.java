package androidx.compose.foundation.text;

import a.f;
import android.view.KeyEvent;
import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010<\u001a\u00020;\u0012\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b@\u0010AJ\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0002J\u001b\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/j;", "apply", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "block", "commandExecutionContext", "", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "Z", "getEditable", "()Z", "singleLine", "getSingleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "onValueChange", "Lkj/l;", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkj/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldKeyInput {
    private final boolean editable;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final l<TextFieldValue, j> onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final TextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l<? super TextFieldValue, j> lVar) {
        m.h(textFieldState, "state");
        m.h(textFieldSelectionManager, "selectionManager");
        m.h(textFieldValue, "value");
        m.h(textPreparedSelectionState, "preparedSelectionState");
        m.h(offsetMapping, "offsetMapping");
        m.h(deadKeyCombiner, "keyCombiner");
        m.h(keyMapping, "keyMapping");
        m.h(lVar, "onValueChange");
        this.state = textFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        ArrayList arrayListY1 = y.Y1(list);
        arrayListY1.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(arrayListY1));
    }

    private final void commandExecutionContext(l<? super TextFieldPreparedSelection, j> lVar) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        lVar.invoke(textFieldPreparedSelection);
        if (TextRange.m4804equalsimpl0(textFieldPreparedSelection.getSelection(), this.value.getSelection()) && m.c(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }

    /* JADX INFO: renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m881typedCommandZmokQxo(KeyEvent event) {
        Integer numM817consumeZmokQxo;
        if (!TextFieldKeyInput_androidKt.m884isTypedEventZmokQxo(event) || (numM817consumeZmokQxo = this.keyCombiner.m817consumeZmokQxo(event)) == null) {
            return null;
        }
        String string = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), numM817consumeZmokQxo.intValue()).toString();
        m.g(string, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new CommitTextCommand(string, 1);
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final TextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m882processZmokQxo(KeyEvent event) {
        final KeyCommand keyCommandMo819mapZmokQxo;
        m.h(event, "event");
        CommitTextCommand commitTextCommandM881typedCommandZmokQxo = m881typedCommandZmokQxo(event);
        if (commitTextCommandM881typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(commitTextCommandM881typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m4005equalsimpl0(KeyEvent_androidKt.m4013getTypeZmokQxo(event), KeyEventType.INSTANCE.m4009getKeyDownCS__XNY()) || (keyCommandMo819mapZmokQxo = this.keyMapping.mo819mapZmokQxo(event)) == null || (keyCommandMo819mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        commandExecutionContext(new l<TextFieldPreparedSelection, j>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            /* JADX INFO: compiled from: TextFieldKeyInput.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    try {
                        iArr[KeyCommand.COPY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KeyCommand.PASTE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[KeyCommand.CUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[KeyCommand.UP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[KeyCommand.DOWN.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[KeyCommand.HOME.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[KeyCommand.END.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[KeyCommand.TAB.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[KeyCommand.UNDO.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[KeyCommand.REDO.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldPreparedSelection) obj);
                return j.a;
            }

            public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                TextFieldValue textFieldValueUndo;
                TextFieldValue textFieldValueRedo;
                m.h(textFieldPreparedSelection, "$this$commandExecutionContext");
                switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo819mapZmokQxo.ordinal()]) {
                    case 1:
                        this.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        this.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        this.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        textFieldPreparedSelection.collapseLeftOr(new l<TextFieldPreparedSelection, j>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldPreparedSelection) obj);
                                return j.a;
                            }

                            public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$collapseLeftOr");
                                textFieldPreparedSelection2.moveCursorLeft();
                            }
                        });
                        break;
                    case 5:
                        textFieldPreparedSelection.collapseRightOr(new l<TextFieldPreparedSelection, j>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldPreparedSelection) obj);
                                return j.a;
                            }

                            public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$collapseRightOr");
                                textFieldPreparedSelection2.moveCursorRight();
                            }
                        });
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorLeftByWord();
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorRightByWord();
                        break;
                    case 8:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        break;
                    case 10:
                        textFieldPreparedSelection.moveCursorUpByLine();
                        break;
                    case 11:
                        textFieldPreparedSelection.moveCursorDownByLine();
                        break;
                    case 12:
                        textFieldPreparedSelection.moveCursorUpByPage();
                        break;
                    case 13:
                        textFieldPreparedSelection.moveCursorDownByPage();
                        break;
                    case 14:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        break;
                    case 15:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        break;
                    case 16:
                        textFieldPreparedSelection.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        textFieldPreparedSelection.moveCursorToLineRightSide();
                        break;
                    case 18:
                        textFieldPreparedSelection.moveCursorToHome();
                        break;
                    case 19:
                        textFieldPreparedSelection.moveCursorToEnd();
                        break;
                    case 20:
                        List<EditCommand> listDeleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$deleteIfSelectedOr");
                                return new DeleteSurroundingTextCommand(TextRange.m4806getEndimpl(textFieldPreparedSelection2.getSelection()) - textFieldPreparedSelection2.getPrecedingCharacterIndex(), 0);
                            }
                        });
                        if (listDeleteIfSelectedOr != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr);
                        }
                        break;
                    case 21:
                        List<EditCommand> listDeleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$deleteIfSelectedOr");
                                int nextCharacterIndex = textFieldPreparedSelection2.getNextCharacterIndex();
                                if (nextCharacterIndex != -1) {
                                    return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m4806getEndimpl(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listDeleteIfSelectedOr2 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr2);
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionModeCutDrawable /* 22 */:
                        List<EditCommand> listDeleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$deleteIfSelectedOr");
                                Integer previousWordOffset = textFieldPreparedSelection2.getPreviousWordOffset();
                                if (previousWordOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m4806getEndimpl(textFieldPreparedSelection2.getSelection()) - previousWordOffset.intValue(), 0);
                            }
                        });
                        if (listDeleteIfSelectedOr3 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr3);
                        }
                        break;
                    case 23:
                        List<EditCommand> listDeleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$deleteIfSelectedOr");
                                Integer nextWordOffset = textFieldPreparedSelection2.getNextWordOffset();
                                if (nextWordOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m4806getEndimpl(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listDeleteIfSelectedOr4 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr4);
                        }
                        break;
                    case 24:
                        List<EditCommand> listDeleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$deleteIfSelectedOr");
                                Integer lineStartByOffset = textFieldPreparedSelection2.getLineStartByOffset();
                                if (lineStartByOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m4806getEndimpl(textFieldPreparedSelection2.getSelection()) - lineStartByOffset.intValue(), 0);
                            }
                        });
                        if (listDeleteIfSelectedOr5 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr5);
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionModePopupWindowStyle /* 25 */:
                        List<EditCommand> listDeleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                m.h(textFieldPreparedSelection2, "$this$deleteIfSelectedOr");
                                Integer lineEndByOffset = textFieldPreparedSelection2.getLineEndByOffset();
                                if (lineEndByOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m4806getEndimpl(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listDeleteIfSelectedOr6 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr6);
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionModeSelectAllDrawable /* 26 */:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\n", 1));
                        } else {
                            booleanRef.element = false;
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionModeShareDrawable /* 27 */:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\t", 1));
                        } else {
                            booleanRef.element = false;
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionModeSplitBackground /* 28 */:
                        textFieldPreparedSelection.selectAll();
                        break;
                    case R.styleable.AppCompatTheme_actionModeStyle /* 29 */:
                        textFieldPreparedSelection.moveCursorLeft().selectMovement();
                        break;
                    case 30:
                        textFieldPreparedSelection.moveCursorRight().selectMovement();
                        break;
                    case 31:
                        textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                        break;
                    case 32:
                        textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                        break;
                    case 33:
                        textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        textFieldPreparedSelection.moveCursorToHome().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        textFieldPreparedSelection.deselect();
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                        }
                        UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (textFieldValueUndo = undoManager2.undo()) != null) {
                            this.onValueChange.invoke(textFieldValueUndo);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (textFieldValueRedo = undoManager3.redo()) != null) {
                            this.onValueChange.invoke(textFieldValueRedo);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        KeyEventHelpers_androidKt.showCharacterPalette();
                        break;
                }
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        apply(f.U(editCommand));
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i2 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : undoManager, deadKeyCombiner, (i2 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i2 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? new l<TextFieldValue, j>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void invoke(TextFieldValue textFieldValue2) {
                m.h(textFieldValue2, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return j.a;
            }
        } : lVar);
    }
}
