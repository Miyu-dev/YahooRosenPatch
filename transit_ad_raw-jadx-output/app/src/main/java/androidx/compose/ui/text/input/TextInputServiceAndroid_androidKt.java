package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import com.mapbox.maps.renderer.MapboxRenderThread;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Lkotlin/j;", "updateWithEmojiCompat", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "update", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "", "bits", "flag", "", "hasFlag", "", "DEBUG_CLASS", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(final Choreographer choreographer) {
        m.h(choreographer, "<this>");
        final int i2 = 0;
        return new Executor() { // from class: androidx.compose.ui.text.input.e
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                int i3 = i2;
                Object obj = choreographer;
                switch (i3) {
                    case 0:
                        TextInputServiceAndroid_androidKt.asExecutor$lambda$1((Choreographer) obj, runnable);
                        break;
                    default:
                        ((Handler) obj).post(runnable);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$1(Choreographer choreographer, final Runnable runnable) {
        m.h(choreographer, "$this_asExecutor");
        final int i2 = 0;
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                int i3 = i2;
                Object obj = runnable;
                switch (i3) {
                    case 0:
                        ((Runnable) obj).run();
                        break;
                    default:
                        MapboxRenderThread.a((MapboxRenderThread) obj, j);
                        break;
                }
            }
        });
    }

    private static final boolean hasFlag(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        m.h(editorInfo, "<this>");
        m.h(imeOptions, "imeOptions");
        m.h(textFieldValue, "textFieldValue");
        int iM4969getImeActioneUduSuo = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i2 = 6;
        if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4958getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4962getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4960getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4961getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4963getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4964getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4965getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m4946equalsimpl0(iM4969getImeActioneUduSuo, companion.m4959getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i2;
        int iM4970getKeyboardTypePjHm6EE = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5012getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5005getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5008getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5011getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5013getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5007getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5010getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5009getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m4992equalsimpl0(iM4970getKeyboardTypePjHm6EE, companion2.m5006getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m4946equalsimpl0(imeOptions.getImeAction(), companion.m4958getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM4968getCapitalizationIUNYP9k = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m4977equalsimpl0(iM4968getCapitalizationIUNYP9k, companion3.m4985getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m4977equalsimpl0(iM4968getCapitalizationIUNYP9k, companion3.m4988getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m4977equalsimpl0(iM4968getCapitalizationIUNYP9k, companion3.m4987getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m4811getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m4806getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
