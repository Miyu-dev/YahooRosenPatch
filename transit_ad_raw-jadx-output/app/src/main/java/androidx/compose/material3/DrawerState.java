package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B%\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160(¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00168F¢\u0006\f\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b!\u0010\u0015\u001a\u0004\b \u0010\u001bR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\"8F¢\u0006\f\u0012\u0004\b%\u0010\u0015\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "Lkotlin/j;", "open", "(Ldj/c;)Ljava/lang/Object;", "close", "Landroidx/compose/material3/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material3/DrawerValue;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableState;", "swipeableState", "Landroidx/compose/material3/SwipeableState;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableState;", "getSwipeableState$material3_release$annotations", "()V", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "getCurrentValue$annotations", "currentValue", "isAnimationRunning", "isAnimationRunning$annotations", "getTargetValue", "getTargetValue$annotations", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lkj/l;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DrawerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SwipeableState<DrawerValue> swipeableState;

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<DrawerState, DrawerValue> Saver(final l<? super DrawerValue, Boolean> lVar) {
            m.h(lVar, "confirmStateChange");
            return SaverKt.Saver(new p<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(drawerState, "it");
                    return drawerState.getCurrentValue();
                }
            }, new l<DrawerValue, DrawerState>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final DrawerState invoke(DrawerValue drawerValue) {
                    m.h(drawerValue, "it");
                    return new DrawerState(drawerValue, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    public DrawerState(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar) {
        m.h(drawerValue, "initialValue");
        m.h(lVar, "confirmStateChange");
        this.swipeableState = new SwipeableState<>(drawerValue, NavigationDrawerKt.AnimationSpec, lVar);
    }

    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, dj.c<? super j> cVar) {
        Object objAnimateTo$material3_release = this.swipeableState.animateTo$material3_release(drawerValue, animationSpec, cVar);
        return objAnimateTo$material3_release == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release : j.a;
    }

    public final Object close(dj.c<? super j> cVar) {
        Object objAnimateTo = animateTo(DrawerValue.Closed, NavigationDrawerKt.AnimationSpec, cVar);
        return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : j.a;
    }

    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    public final SwipeableState<DrawerValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue$material3_release();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final Object open(dj.c<? super j> cVar) {
        Object objAnimateTo = animateTo(DrawerValue.Open, NavigationDrawerKt.AnimationSpec, cVar);
        return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : j.a;
    }

    public final Object snapTo(DrawerValue drawerValue, dj.c<? super j> cVar) {
        Object objSnapTo$material3_release = this.swipeableState.snapTo$material3_release(drawerValue, cVar);
        return objSnapTo$material3_release == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo$material3_release : j.a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i2 & 2) != 0 ? new l<DrawerValue, Boolean>() { // from class: androidx.compose.material3.DrawerState.1
            public final Boolean invoke(DrawerValue drawerValue2) {
                m.h(drawerValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    public static /* synthetic */ void getCurrentValue$annotations() {
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public static /* synthetic */ void getSwipeableState$material3_release$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public static /* synthetic */ void isAnimationRunning$annotations() {
    }
}
