package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001a\u00020\u00112\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0013\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aU\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0001\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0013\u001aU\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001a\u00020!2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0013\u001a\u007f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b)\u0010*\u001aO\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010+\u001aK\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001aK\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001a\u00020\u00112\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001aK\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010/\u001aE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u00101\u001aE\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u00102\u001aK\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0001\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010/\u001aK\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001a\u00020!2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010/\u001au\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b)\u00105\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0000068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\r068\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u00108\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011068\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u00108\"\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u00108\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0018068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108\"\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u00108\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020!068\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "Lkotlin/j;", "finishedListener", "Landroidx/compose/runtime/State;", "animateFloatAsState", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-YLp_XPw", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-7362WCg", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Rect;", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-HyPO7BM", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-4goxYXU", "animateIntSizeAsState", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "animateValueAsState", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateOffsetAsState-N6fFfp4", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-8f6pmRE", "animateIntSizeAsState-zTRF_AQ", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/SpringSpec;", "defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "dpDefaultSpring", "sizeDefaultSpring", "offsetDefaultSpring", "rectDefaultSpring", "intDefaultSpring", "intOffsetDefaultSpring", "intSizeDefaultSpring", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m5265boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2642boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2574boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(l.a)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3, reason: invalid class name */
    /* JADX INFO: compiled from: AnimateAsState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ Channel<T> $channel;
        final /* synthetic */ State<kj.l<T, j>> $listener$delegate;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: AnimateAsState.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
            final /* synthetic */ Animatable<T, V> $animatable;
            final /* synthetic */ State<kj.l<T, j>> $listener$delegate;
            final /* synthetic */ T $newTarget;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(T t, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends kj.l<? super T, j>> state2, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$newTarget = t;
                this.$animatable = animatable;
                this.$animSpec$delegate = state;
                this.$listener$delegate = state2;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    if (!m.c(this.$newTarget, this.$animatable.getTargetValue())) {
                        Animatable<T, V> animatable = this.$animatable;
                        T t = this.$newTarget;
                        AnimationSpec animationSpecAnimateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, t, animationSpecAnimateValueAsState$lambda$6, null, null, this, 12, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return j.a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
                kj.l lVarAnimateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(this.$listener$delegate);
                if (lVarAnimateValueAsState$lambda$4 != null) {
                    lVarAnimateValueAsState$lambda$4.invoke(this.$animatable.getValue());
                }
                return j.a;
            }

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Channel<T> channel, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends kj.l<? super T, j>> state2, dj.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$channel = channel;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:12:0x0042). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                li.c.O(r18)
                r6 = r18
                r5 = r0
                goto L42
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                li.c.O(r18)
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.channels.Channel<T> r4 = r0.$channel
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L35:
                r5.L$0 = r4
                r5.L$1 = r2
                r5.label = r3
                java.lang.Object r6 = r2.hasNext(r5)
                if (r6 != r1) goto L42
                return r1
            L42:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L76
                java.lang.Object r6 = r2.next()
                kotlinx.coroutines.channels.Channel<T> r7 = r5.$channel
                java.lang.Object r7 = r7.tryReceive-PtdJZtk()
                java.lang.Object r7 = kotlinx.coroutines.channels.ChannelResult.getOrNull-impl(r7)
                if (r7 != 0) goto L5c
                r9 = r6
                goto L5d
            L5c:
                r9 = r7
            L5d:
                r6 = 0
                r14 = 0
                androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
                androidx.compose.animation.core.Animatable<T, V> r10 = r5.$animatable
                androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r11 = r5.$animSpec$delegate
                androidx.compose.runtime.State<kj.l<T, kotlin.j>> r12 = r5.$listener$delegate
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                goto L35
            L76:
                kotlin.j r1 = kotlin.j.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    @Composable
    /* JADX INFO: renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m105animateDpAsStateAjpBEmI(float f, AnimationSpec<Dp> animationSpec, String str, kj.l<? super Dp, j> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1407150062);
        AnimationSpec<Dp> animationSpec2 = (i3 & 2) != 0 ? dpDefaultSpring : animationSpec;
        String str2 = (i3 & 4) != 0 ? "DpAnimation" : str;
        kj.l<? super Dp, j> lVar2 = (i3 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        int i4 = i2 << 6;
        State<Dp> stateAnimateValueAsState = animateValueAsState(Dp.m5265boximpl(f), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m106animateDpAsStateKz89ssw(float f, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(704104481);
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        kj.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:458)");
        }
        State stateAnimateValueAsState = animateValueAsState(Dp.m5265boximpl(f), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    public static final State<Float> animateFloatAsState(float f, AnimationSpec<Float> animationSpec, float f2, String str, kj.l<? super Float, j> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(668842840);
        AnimationSpec<Float> animationSpec2 = (i3 & 2) != 0 ? defaultAnimation : animationSpec;
        float f3 = (i3 & 4) != 0 ? 0.01f : f2;
        String str2 = (i3 & 8) != 0 ? "FloatAnimation" : str;
        kj.l<? super Float, j> lVar2 = (i3 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        composer.startReplaceableGroup(841393662);
        if (animationSpec2 == defaultAnimation) {
            Float fValueOf = Float.valueOf(f3);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(fValueOf);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) objRememberedValue;
        }
        composer.endReplaceableGroup();
        int i4 = i2 << 3;
        State<Float> stateAnimateValueAsState = animateValueAsState(Float.valueOf(f), VectorConvertersKt.getVectorConverter(i.a), animationSpec2, Float.valueOf(f3), str2, lVar2, composer, (i4 & 7168) | (i2 & 14) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    public static final State<Integer> animateIntAsState(int i2, AnimationSpec<Integer> animationSpec, String str, kj.l<? super Integer, j> lVar, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(428074472);
        AnimationSpec<Integer> animationSpec2 = (i4 & 2) != 0 ? intDefaultSpring : animationSpec;
        String str2 = (i4 & 4) != 0 ? "IntAnimation" : str;
        kj.l<? super Integer, j> lVar2 = (i4 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:268)");
        }
        int i5 = i3 << 6;
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(l.a), animationSpec2, null, str2, lVar2, composer, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i5) | (i5 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m107animateIntOffsetAsState8f6pmRE(long j, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1010307371);
        AnimationSpec animationSpec2 = (i3 & 2) != 0 ? intOffsetDefaultSpring : animationSpec;
        kj.l lVar2 = (i3 & 4) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:539)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntOffset.m5376boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m108animateIntOffsetAsStateHyPO7BM(long j, AnimationSpec<IntOffset> animationSpec, String str, kj.l<? super IntOffset, j> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-696782904);
        AnimationSpec<IntOffset> animationSpec2 = (i3 & 2) != 0 ? intOffsetDefaultSpring : animationSpec;
        String str2 = (i3 & 4) != 0 ? "IntOffsetAnimation" : str;
        kj.l<? super IntOffset, j> lVar2 = (i3 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:308)");
        }
        int i4 = i2 << 6;
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m5376boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m109animateIntSizeAsState4goxYXU(long j, AnimationSpec<IntSize> animationSpec, String str, kj.l<? super IntSize, j> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(582576328);
        AnimationSpec<IntSize> animationSpec2 = (i3 & 2) != 0 ? intSizeDefaultSpring : animationSpec;
        String str2 = (i3 & 4) != 0 ? "IntSizeAnimation" : str;
        kj.l<? super IntSize, j> lVar2 = (i3 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:346)");
        }
        int i4 = i2 << 6;
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m5419boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m110animateIntSizeAsStatezTRF_AQ(long j, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1749239765);
        AnimationSpec animationSpec2 = (i3 & 2) != 0 ? intSizeDefaultSpring : animationSpec;
        kj.l lVar2 = (i3 & 4) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:554)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntSize.m5419boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m111animateOffsetAsState7362WCg(long j, AnimationSpec<Offset> animationSpec, String str, kj.l<? super Offset, j> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(357896800);
        AnimationSpec<Offset> animationSpec2 = (i3 & 2) != 0 ? offsetDefaultSpring : animationSpec;
        String str2 = (i3 & 4) != 0 ? "OffsetAnimation" : str;
        kj.l<? super Offset, j> lVar2 = (i3 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:189)");
        }
        int i4 = i2 << 6;
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m2574boximpl(j), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m112animateOffsetAsStateN6fFfp4(long j, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-456513133);
        AnimationSpec animationSpec2 = (i3 & 2) != 0 ? offsetDefaultSpring : animationSpec;
        kj.l lVar2 = (i3 & 4) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:494)");
        }
        State stateAnimateValueAsState = animateValueAsState(Offset.m2574boximpl(j), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, String str, kj.l<? super Rect, j> lVar, Composer composer, int i2, int i3) {
        m.h(rect, "targetValue");
        composer.startReplaceableGroup(536062978);
        AnimationSpec<Rect> animationSpec2 = (i3 & 2) != 0 ? rectDefaultSpring : animationSpec;
        String str2 = (i3 & 4) != 0 ? "RectAnimation" : str;
        kj.l<? super Rect, j> lVar2 = (i3 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:230)");
        }
        int i4 = i2 << 6;
        State<Rect> stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m113animateSizeAsStateLjSzlW0(long j, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(875212471);
        AnimationSpec animationSpec2 = (i3 & 2) != 0 ? sizeDefaultSpring : animationSpec;
        kj.l lVar2 = (i3 & 4) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:476)");
        }
        State stateAnimateValueAsState = animateValueAsState(Size.m2642boximpl(j), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    /* JADX INFO: renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m114animateSizeAsStateYLp_XPw(long j, AnimationSpec<Size> animationSpec, String str, kj.l<? super Size, j> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1374633148);
        AnimationSpec<Size> animationSpec2 = (i3 & 2) != 0 ? sizeDefaultSpring : animationSpec;
        String str2 = (i3 & 4) != 0 ? "SizeAnimation" : str;
        kj.l<? super Size, j> lVar2 = (i3 & 8) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:149)");
        }
        int i4 = i2 << 6;
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m2642boximpl(j), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t2, String str, kj.l<? super T, j> lVar, Composer composer, int i2, int i3) {
        AnimationSpec<T> animationSpecSpring;
        m.h(twoWayConverter, "typeConverter");
        composer.startReplaceableGroup(-1994373980);
        if ((i3 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpecSpring = (AnimationSpec) objRememberedValue;
        } else {
            animationSpecSpring = animationSpec;
        }
        T t3 = (i3 & 8) != 0 ? null : t2;
        String str2 = (i3 & 16) != 0 ? "ValueAnimation" : str;
        kj.l<? super T, j> lVar2 = (i3 & 32) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue3;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar2, composer, (i2 >> 15) & 14);
        if (t3 != null && (animationSpecSpring instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpecSpring;
            if (!m.c(springSpec.getVisibilityThreshold(), t3)) {
                animationSpecSpring = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t3);
            }
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpecSpring, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = ChannelKt.Channel$default(-1, (BufferOverflow) null, (kj.l) null, 6, (Object) null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        final Channel channel = (Channel) objRememberedValue4;
        EffectsKt.SideEffect(new kj.a<j>() { // from class: androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m115invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m115invoke() {
                channel.trySend-JP2dKIU(t);
            }
        }, composer, 0);
        EffectsKt.LaunchedEffect(channel, new AnonymousClass3(channel, animatable, stateRememberUpdatedState2, stateRememberUpdatedState, null), composer, 72);
        State<T> stateAsState = (State) mutableState.getValue();
        if (stateAsState == null) {
            stateAsState = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> kj.l<T, j> animateValueAsState$lambda$4(State<? extends kj.l<? super T, j>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    @Composable
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i2, int i3) {
        m.h(rect, "targetValue");
        composer.startReplaceableGroup(-782613967);
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        kj.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:509)");
        }
        State stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    public static final /* synthetic */ State animateIntAsState(int i2, AnimationSpec animationSpec, kj.l lVar, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-842612981);
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        kj.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:524)");
        }
        State stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(l.a), animationSpec2, null, null, lVar2, composer, (i3 & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    public static final /* synthetic */ State animateFloatAsState(float f, AnimationSpec animationSpec, float f2, kj.l lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1091643291);
        if ((i3 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            f2 = 0.01f;
        }
        float f3 = f2;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        kj.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:441)");
        }
        State<Float> stateAnimateFloatAsState = animateFloatAsState(f, animationSpec2, f3, null, lVar2, composer, (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | ((i2 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateFloatAsState;
    }

    @Composable
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, kj.l lVar, Composer composer, int i2, int i3) {
        AnimationSpec animationSpec2;
        m.h(twoWayConverter, "typeConverter");
        composer.startReplaceableGroup(-846382129);
        if ((i3 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) objRememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        Object obj3 = (i3 & 8) != 0 ? null : obj2;
        kj.l lVar2 = (i3 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:569)");
        }
        int i4 = i2 & 8;
        State stateAnimateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", lVar2, composer, (i4 << 9) | i4 | 24576 | (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (i2 & 7168) | ((i2 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }
}
