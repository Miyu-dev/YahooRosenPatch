package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Stable;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007\u001aK\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a4\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aC\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a,\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "data", "convert", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/TweenSpec;", "tween", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/SpringSpec;", "spring", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Lkotlin/j;", "init", "Landroidx/compose/animation/core/KeyframesSpec;", "keyframes", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "Landroidx/compose/animation/core/RepeatableSpec;", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "repeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable", "Landroidx/compose/animation/core/SnapSpec;", "snap", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return (V) twoWayConverter.getConvertToVector().invoke(t);
    }

    @Stable
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        m.h(durationBasedAnimationSpec, "animation");
        m.h(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m116infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        m.h(durationBasedAnimationSpec, "animation");
        m.h(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m117infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 4) != 0) {
            j = StartOffset.m139constructorimpl$default(0, 0, 2, null);
        }
        return m116infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j);
    }

    @Stable
    public static final <T> KeyframesSpec<T> keyframes(l<? super KeyframesSpec.KeyframesSpecConfig<T>, j> lVar) {
        m.h(lVar, "init");
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        lVar.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @Stable
    public static final /* synthetic */ RepeatableSpec repeatable(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        m.h(durationBasedAnimationSpec, "animation");
        m.h(repeatMode, "repeatMode");
        return new RepeatableSpec(i2, durationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i2, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* JADX INFO: renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m118repeatable91I0pcU(int i2, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        m.h(durationBasedAnimationSpec, "animation");
        m.h(repeatMode, "repeatMode");
        return new RepeatableSpec<>(i2, durationBasedAnimationSpec, repeatMode, j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m119repeatable91I0pcU$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i3 & 8) != 0) {
            j = StartOffset.m139constructorimpl$default(0, 0, 2, null);
        }
        return m118repeatable91I0pcU(i2, durationBasedAnimationSpec, repeatMode, j);
    }

    @Stable
    public static final <T> SnapSpec<T> snap(int i2) {
        return new SnapSpec<>(i2);
    }

    public static /* synthetic */ SnapSpec snap$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return snap(i2);
    }

    @Stable
    public static final <T> SpringSpec<T> spring(float f, float f2, T t) {
        return new SpringSpec<>(f, f2, t);
    }

    public static /* synthetic */ SpringSpec spring$default(float f, float f2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return spring(f, f2, obj);
    }

    @Stable
    public static final <T> TweenSpec<T> tween(int i2, int i3, Easing easing) {
        m.h(easing, "easing");
        return new TweenSpec<>(i2, i3, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i2, int i3, Easing easing, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = AnimationConstants.DefaultDurationMillis;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i2, i3, easing);
    }
}
