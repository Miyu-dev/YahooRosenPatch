package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+BA\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060$\u0012\u001a\b\u0002\u0010(\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/material3/DismissState;", "", "", "requireOffset", "Landroidx/compose/material3/DismissDirection;", "direction", "", "isDismissed", "Landroidx/compose/material3/DismissValue;", "targetValue", "Lkotlin/j;", "snapTo", "(Landroidx/compose/material3/DismissValue;Ldj/c;)Ljava/lang/Object;", "reset", "(Ldj/c;)Ljava/lang/Object;", "dismiss", "(Landroidx/compose/material3/DismissDirection;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableV2State;", "swipeableState", "Landroidx/compose/material3/SwipeableV2State;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableV2State;", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "()Landroidx/compose/material3/DismissValue;", "currentValue", "getTargetValue", "getProgress", "()F", "progress", "getDismissDirection", "()Landroidx/compose/material3/DismissDirection;", "dismissDirection", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "positionalThreshold", "<init>", "(Landroidx/compose/material3/DismissValue;Lkj/l;Lkj/p;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DismissState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SwipeableV2State<DismissValue> swipeableState;

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/DismissState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material3/DismissValue;", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "positionalThreshold", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DismissState;", "Saver", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<DismissState, DismissValue> Saver(final l<? super DismissValue, Boolean> lVar, final p<? super Density, ? super Float, Float> pVar) {
            m.h(lVar, "confirmValueChange");
            m.h(pVar, "positionalThreshold");
            return SaverKt.Saver(new p<SaverScope, DismissState, DismissValue>() { // from class: androidx.compose.material3.DismissState$Companion$Saver$1
                public final DismissValue invoke(SaverScope saverScope, DismissState dismissState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(dismissState, "it");
                    return dismissState.getCurrentValue();
                }
            }, new l<DismissValue, DismissState>() { // from class: androidx.compose.material3.DismissState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final DismissState invoke(DismissValue dismissValue) {
                    m.h(dismissValue, "it");
                    return new DismissState(dismissValue, lVar, pVar);
                }
            });
        }

        private Companion() {
        }
    }

    public DismissState(DismissValue dismissValue, l<? super DismissValue, Boolean> lVar, p<? super Density, ? super Float, Float> pVar) {
        m.h(dismissValue, "initialValue");
        m.h(lVar, "confirmValueChange");
        m.h(pVar, "positionalThreshold");
        this.swipeableState = new SwipeableV2State<>(dismissValue, null, lVar, pVar, SwipeToDismissKt.DismissThreshold, 2, null);
    }

    public final Object dismiss(DismissDirection dismissDirection, dj.c<? super j> cVar) {
        Object objAnimateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart, 0.0f, cVar, 2, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : j.a;
    }

    public final DismissValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final DismissDirection getDismissDirection() {
        if (m.b(getOffset$material3_release(), 0.0f) || getOffset$material3_release() == null) {
            return null;
        }
        Float offset$material3_release = getOffset$material3_release();
        m.e(offset$material3_release);
        return offset$material3_release.floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final Float getOffset$material3_release() {
        return this.swipeableState.getOffset();
    }

    public final float getProgress() {
        return this.swipeableState.getProgress();
    }

    public final SwipeableV2State<DismissValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    public final DismissValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final boolean isDismissed(DismissDirection direction) {
        m.h(direction, "direction");
        return getCurrentValue() == (direction == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    public final float requireOffset() {
        return this.swipeableState.requireOffset();
    }

    public final Object reset(dj.c<? super j> cVar) {
        Object objAnimateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, DismissValue.Default, 0.0f, cVar, 2, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : j.a;
    }

    public final Object snapTo(DismissValue dismissValue, dj.c<? super j> cVar) {
        Object objSnapTo = this.swipeableState.snapTo(dismissValue, cVar);
        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : j.a;
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, l lVar, p pVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i2 & 2) != 0 ? new l<DismissValue, Boolean>() { // from class: androidx.compose.material3.DismissState.1
            public final Boolean invoke(DismissValue dismissValue2) {
                m.h(dismissValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar, (i2 & 4) != 0 ? SwipeToDismissDefaults.INSTANCE.getFixedPositionalThreshold() : pVar);
    }
}
