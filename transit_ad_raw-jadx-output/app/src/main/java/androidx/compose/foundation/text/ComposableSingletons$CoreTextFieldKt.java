package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static q<p<? super Composer, ? super Integer, j>, Composer, Integer, j> f5lambda1 = ComposableLambdaKt.composableLambdaInstance(671295101, false, new q<p<? super Composer, ? super Integer, ? extends j>, Composer, Integer, j>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((p<? super Composer, ? super Integer, j>) obj, (Composer) obj2, ((Number) obj3).intValue());
            return j.a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
            m.h(pVar, "innerTextField");
            if ((i2 & 14) == 0) {
                i2 |= composer.changedInstance(pVar) ? 4 : 2;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(671295101, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:197)");
            }
            pVar.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final q<p<? super Composer, ? super Integer, j>, Composer, Integer, j> m803getLambda1$foundation_release() {
        return f5lambda1;
    }
}
