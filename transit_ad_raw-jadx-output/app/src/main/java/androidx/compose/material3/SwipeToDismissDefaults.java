package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/SwipeToDismissDefaults;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "FixedPositionalThreshold", "Lkj/p;", "getFixedPositionalThreshold", "()Lkj/p;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SwipeToDismissDefaults {
    public static final int $stable = 0;
    public static final SwipeToDismissDefaults INSTANCE = new SwipeToDismissDefaults();
    private static final p<Density, Float, Float> FixedPositionalThreshold = new p<Density, Float, Float>() { // from class: androidx.compose.material3.SwipeToDismissDefaults$FixedPositionalThreshold$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Density) obj, ((Number) obj2).floatValue());
        }

        public final Float invoke(Density density, float f) {
            m.h(density, "$this$null");
            return Float.valueOf(density.mo348toPx0680j_4(Dp.m5267constructorimpl(56)));
        }
    };

    private SwipeToDismissDefaults() {
    }

    public final p<Density, Float, Float> getFixedPositionalThreshold() {
        return FixedPositionalThreshold;
    }
}
