package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u001a#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Landroidx/compose/foundation/gestures/ScrollableState;", "ScrollableState", "rememberScrollableState", "(Lkj/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(l<? super Float, Float> lVar) {
        m.h(lVar, "consumeScrollDelta");
        return new DefaultScrollableState(lVar);
    }

    @Composable
    public static final ScrollableState rememberScrollableState(l<? super Float, Float> lVar, Composer composer, int i2) {
        m.h(lVar, "consumeScrollDelta");
        composer.startReplaceableGroup(-180460798);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i2, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Float invoke(float f) {
                    return (Float) stateRememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).floatValue());
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollableState scrollableState = (ScrollableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollableState;
    }
}
