package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.b;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "Lkotlin/j;", "onValueChange", "", "editable", "singleLine", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "textFieldKeyInput", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldKeyInputKt {
    public static final Modifier textFieldKeyInput(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final l<? super TextFieldValue, j> lVar, final boolean z, final boolean z2, final OffsetMapping offsetMapping, final UndoManager undoManager) {
        m.h(modifier, "<this>");
        m.h(textFieldState, "state");
        m.h(textFieldSelectionManager, "manager");
        m.h(textFieldValue, "value");
        m.h(lVar, "onValueChange");
        m.h(offsetMapping, "offsetMapping");
        m.h(undoManager, "undoManager");
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.2

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: TextFieldKeyInput.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements l<KeyEvent, Boolean> {
                public AnonymousClass1(Object obj) {
                    super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m883invokeZmokQxo(((KeyEvent) obj).m4001unboximpl());
                }

                /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m883invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    m.h(keyEvent, "p0");
                    return Boolean.valueOf(((TextFieldKeyInput) ((CallableReference) this).receiver).m882processZmokQxo(keyEvent));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, 58482146)) {
                    ComposerKt.traceEventStart(58482146, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:242)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new TextPreparedSelectionState();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new DeadKeyCombiner();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.INSTANCE, new AnonymousClass1(new TextFieldKeyInput(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) objRememberedValue2, null, lVar, Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING, null)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierOnKeyEvent;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }, 1, null);
    }
}
