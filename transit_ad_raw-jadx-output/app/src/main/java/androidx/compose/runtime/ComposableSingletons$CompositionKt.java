package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kj.p;
import kotlin.Metadata;
import kotlin.j;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<Composer, Integer, j> f36lambda1 = ComposableLambdaKt.composableLambdaInstance(954879418, false, new p<Composer, Integer, j>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954879418, i2, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:505)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<Composer, Integer, j> f37lambda2 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, new p<Composer, Integer, j>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1918065384, i2, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:596)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final p<Composer, Integer, j> m2399getLambda1$runtime_release() {
        return f36lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$runtime_release, reason: not valid java name */
    public final p<Composer, Integer, j> m2400getLambda2$runtime_release() {
        return f37lambda2;
    }
}
