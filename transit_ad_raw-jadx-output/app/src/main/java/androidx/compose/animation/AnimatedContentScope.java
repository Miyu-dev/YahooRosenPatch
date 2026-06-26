package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.animation.core.c;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003XYZB'\b\u0000\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bV\u0010WJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0087\u0004JA\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R4\u0010=\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038@@@X\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R/\u0010@\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030?0>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR-\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020J*\u00020\u000e8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001b\u0010O\u001a\u00020J*\u00020\u000e8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010LR\u001d\u0010\u0005\u001a\u00020\u00038BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u0010:R\u0014\u0010S\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010R\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculateOffset-emnUabE", "(JJ)J", "calculateOffset", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkj/l;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkj/l;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/State;", "targetSizeMap", "Ljava/util/Map;", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "animatedSize", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "", "isLeft-9jb1Dl8", "(I)Z", "isLeft", "isRight-9jb1Dl8", "isRight", "getCurrentSize-YbymL2g", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "ChildData", "SizeModifier", "SlideDirection", "animation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalAnimationApi
public final class AnimatedContentScope<S> implements Transition.Segment<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: measuredSize$delegate, reason: from kotlin metadata */
    private final MutableState measuredSize;
    private final Map<S, State<IntSize>> targetSizeMap;
    private final Transition<S> transition;

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final /* data */ class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public ChildData(boolean z) {
            this.isTarget = z;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = childData.isTarget;
            }
            return childData.copy(z);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean all(l lVar) {
            return androidx.compose.ui.b.a(this, lVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean any(l lVar) {
            return androidx.compose.ui.b.b(this, lVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        public final ChildData copy(boolean isTarget) {
            return new ChildData(isTarget);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildData) && this.isTarget == ((ChildData) other).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldIn(Object obj, p pVar) {
            return androidx.compose.ui.b.c(this, obj, pVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldOut(Object obj, p pVar) {
            return androidx.compose.ui.b.d(this, obj, pVar);
        }

        public int hashCode() {
            boolean z = this.isTarget;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            m.h(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }

        @Override // androidx.compose.ui.Modifier
        public final /* synthetic */ Modifier then(Modifier modifier) {
            return androidx.compose.ui.a.a(this, modifier);
        }

        public String toString() {
            return a.d(new StringBuilder("ChildData(isTarget="), this.isTarget, ')');
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B6\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001\u0000¢\u0006\u0002\u0010\nJ)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ExperimentalAnimationApi
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;
        final /* synthetic */ AnimatedContentScope<S> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(AnimatedContentScope animatedContentScope, Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state) {
            m.h(deferredAnimation, "sizeAnimation");
            m.h(state, "sizeTransform");
            this.this$0 = animatedContentScope;
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            m.h(measureScope, "$this$measure");
            m.h(measurable, "measurable");
            final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            final AnimatedContentScope<S> animatedContentScope = this.this$0;
            l<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> lVar = new l<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                    FiniteAnimationSpec<IntSize> finiteAnimationSpecMo100createAnimationSpecTemP2vQ;
                    m.h(segment, "$this$animate");
                    State<IntSize> state = animatedContentScope.getTargetSizeMap$animation_release().get(segment.getInitialState());
                    long packedValue = state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g();
                    State<IntSize> state2 = animatedContentScope.getTargetSizeMap$animation_release().get(segment.getTargetState());
                    long packedValue2 = state2 != null ? state2.getValue().getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g();
                    SizeTransform value = this.getSizeTransform().getValue();
                    return (value == null || (finiteAnimationSpecMo100createAnimationSpecTemP2vQ = value.mo100createAnimationSpecTemP2vQ(packedValue, packedValue2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : finiteAnimationSpecMo100createAnimationSpecTemP2vQ;
                }
            };
            final AnimatedContentScope<S> animatedContentScope2 = this.this$0;
            State<IntSize> stateAnimate = deferredAnimation.animate(lVar, (l<? super S, ? extends IntSize>) new l<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return IntSize.m5419boximpl(m48invokeYEO4UFw(obj));
                }

                /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m48invokeYEO4UFw(S s) {
                    State<IntSize> state = animatedContentScope2.getTargetSizeMap$animation_release().get(s);
                    return state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g();
                }
            });
            this.this$0.setAnimatedSize$animation_release(stateAnimate);
            final long jMo2476alignKFBX0sM = this.this$0.getContentAlignment().mo2476alignKFBX0sM(IntSizeKt.IntSize(placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight()), stateAnimate.getValue().getPackedValue(), LayoutDirection.Ltr);
            return MeasureScope.CC.p(measureScope, IntSize.m5427getWidthimpl(stateAnimate.getValue().getPackedValue()), IntSize.m5426getHeightimpl(stateAnimate.getValue().getPackedValue()), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return j.a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    m.h(placementScope, "$this$layout");
                    Placeable.PlacementScope.m4272place70tqf50$default(placementScope, placeableMo4235measureBRTryo0, jMo2476alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    public AnimatedContentScope(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        m.h(transition, "transition");
        m.h(alignment, "contentAlignment");
        m.h(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5419boximpl(IntSize.INSTANCE.m5432getZeroYbymL2g()), null, 2, null);
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m37calculateOffsetemnUabE(long fullSize, long currentSize) {
        return this.contentAlignment.mo2476alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m38getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().getPackedValue() : m43getMeasuredSizeYbymL2g$animation_release();
    }

    /* JADX INFO: renamed from: isLeft-9jb1Dl8, reason: not valid java name */
    private final boolean m39isLeft9jb1Dl8(int i2) {
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m52equalsimpl0(i2, companion.m58getLeftaUPqQNE()) || (SlideDirection.m52equalsimpl0(i2, companion.m60getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr) || (SlideDirection.m52equalsimpl0(i2, companion.m57getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    /* JADX INFO: renamed from: isRight-9jb1Dl8, reason: not valid java name */
    private final boolean m40isRight9jb1Dl8(int i2) {
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m52equalsimpl0(i2, companion.m59getRightaUPqQNE()) || (SlideDirection.m52equalsimpl0(i2, companion.m60getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl) || (SlideDirection.m52equalsimpl0(i2, companion.m57getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideIntoContainer-HTTW7Ok$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m41slideIntoContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i2, FiniteAnimationSpec finiteAnimationSpec, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i3 & 4) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$1
                public final Integer invoke(int i4) {
                    return Integer.valueOf(i4);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentScope.m45slideIntoContainerHTTW7Ok(i2, finiteAnimationSpec, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideOutOfContainer-HTTW7Ok$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m42slideOutOfContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i2, FiniteAnimationSpec finiteAnimationSpec, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i3 & 4) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$1
                public final Integer invoke(int i4) {
                    return Integer.valueOf(i4);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentScope.m46slideOutOfContainerHTTW7Ok(i2, finiteAnimationSpec, lVar);
    }

    @Composable
    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i2) {
        Modifier modifier;
        m.h(contentTransform, "contentTransform");
        composer.startReplaceableGroup(-1349251863);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1349251863, i2, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:489)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean z = false;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (m.c(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    z = true;
                }
                Modifier modifierClipToBounds = Modifier.INSTANCE;
                if (!z) {
                    modifierClipToBounds = ClipKt.clipToBounds(modifierClipToBounds);
                }
                objRememberedValue2 = modifierClipToBounds.then(new SizeModifier(this, deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState));
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) objRememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    /* JADX INFO: renamed from: getContentAlignment$animation_release, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    /* JADX INFO: renamed from: getLayoutDirection$animation_release, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m43getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public final /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return c.a(this, obj, obj2);
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(Alignment alignment) {
        m.h(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        m.h(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m44setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize.setValue(IntSize.m5419boximpl(j));
    }

    /* JADX INFO: renamed from: slideIntoContainer-HTTW7Ok, reason: not valid java name */
    public final EnterTransition m45slideIntoContainerHTTW7Ok(int towards, FiniteAnimationSpec<IntOffset> animationSpec, final l<? super Integer, Integer> initialOffset) {
        m.h(animationSpec, "animationSpec");
        m.h(initialOffset, "initialOffset");
        if (m39isLeft9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i2) {
                    return (Integer) initialOffset.invoke(Integer.valueOf(IntSize.m5427getWidthimpl(this.m38getCurrentSizeYbymL2g()) - IntOffset.m5385getXimpl(this.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), this.m38getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (m40isRight9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i2) {
                    return (Integer) initialOffset.invoke(Integer.valueOf((-IntOffset.m5385getXimpl(this.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), this.m38getCurrentSizeYbymL2g()))) - i2));
                }
            });
        }
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m52equalsimpl0(towards, companion.m61getUpaUPqQNE()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return (Integer) initialOffset.invoke(Integer.valueOf(IntSize.m5426getHeightimpl(this.m38getCurrentSizeYbymL2g()) - IntOffset.m5386getYimpl(this.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), this.m38getCurrentSizeYbymL2g()))));
            }
        }) : SlideDirection.m52equalsimpl0(towards, companion.m56getDownaUPqQNE()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return (Integer) initialOffset.invoke(Integer.valueOf((-IntOffset.m5386getYimpl(this.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), this.m38getCurrentSizeYbymL2g()))) - i2));
            }
        }) : EnterTransition.INSTANCE.getNone();
    }

    /* JADX INFO: renamed from: slideOutOfContainer-HTTW7Ok, reason: not valid java name */
    public final ExitTransition m46slideOutOfContainerHTTW7Ok(int towards, FiniteAnimationSpec<IntOffset> animationSpec, final l<? super Integer, Integer> targetOffset) {
        m.h(animationSpec, "animationSpec");
        m.h(targetOffset, "targetOffset");
        if (m39isLeft9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i2) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    return (Integer) targetOffset.invoke(Integer.valueOf((-IntOffset.m5385getXimpl(this.this$0.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g()))) - i2));
                }
            });
        }
        if (m40isRight9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$3
                final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i2) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g();
                    return (Integer) targetOffset.invoke(Integer.valueOf(IntSize.m5427getWidthimpl(packedValue) + (-IntOffset.m5385getXimpl(this.this$0.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), packedValue)))));
                }
            });
        }
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m52equalsimpl0(towards, companion.m61getUpaUPqQNE()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentScope<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                return (Integer) targetOffset.invoke(Integer.valueOf((-IntOffset.m5386getYimpl(this.this$0.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g()))) - i2));
            }
        }) : SlideDirection.m52equalsimpl0(towards, companion.m56getDownaUPqQNE()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$5
            final /* synthetic */ AnimatedContentScope<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m5432getZeroYbymL2g();
                return (Integer) targetOffset.invoke(Integer.valueOf(IntSize.m5426getHeightimpl(packedValue) + (-IntOffset.m5386getYimpl(this.this$0.m37calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), packedValue)))));
            }
        }) : ExitTransition.INSTANCE.getNone();
    }

    @ExperimentalAnimationApi
    public final ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        m.h(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @Immutable
    public static final class SlideDirection {
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Left = m50constructorimpl(0);
        private static final int Right = m50constructorimpl(1);
        private static final int Up = m50constructorimpl(2);
        private static final int Down = m50constructorimpl(3);
        private static final int Start = m50constructorimpl(4);
        private static final int End = m50constructorimpl(5);

        /* JADX INFO: compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "getDown-aUPqQNE", "()I", "I", "End", "getEnd-aUPqQNE", "Left", "getLeft-aUPqQNE", "Right", "getRight-aUPqQNE", "Start", "getStart-aUPqQNE", "Up", "getUp-aUPqQNE", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDown-aUPqQNE, reason: not valid java name */
            public final int m56getDownaUPqQNE() {
                return SlideDirection.Down;
            }

            /* JADX INFO: renamed from: getEnd-aUPqQNE, reason: not valid java name */
            public final int m57getEndaUPqQNE() {
                return SlideDirection.End;
            }

            /* JADX INFO: renamed from: getLeft-aUPqQNE, reason: not valid java name */
            public final int m58getLeftaUPqQNE() {
                return SlideDirection.Left;
            }

            /* JADX INFO: renamed from: getRight-aUPqQNE, reason: not valid java name */
            public final int m59getRightaUPqQNE() {
                return SlideDirection.Right;
            }

            /* JADX INFO: renamed from: getStart-aUPqQNE, reason: not valid java name */
            public final int m60getStartaUPqQNE() {
                return SlideDirection.Start;
            }

            /* JADX INFO: renamed from: getUp-aUPqQNE, reason: not valid java name */
            public final int m61getUpaUPqQNE() {
                return SlideDirection.Up;
            }

            private Companion() {
            }
        }

        private /* synthetic */ SlideDirection(int i2) {
            this.value = i2;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m49boximpl(int i2) {
            return new SlideDirection(i2);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m51equalsimpl(int i2, Object obj) {
            return (obj instanceof SlideDirection) && i2 == ((SlideDirection) obj).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m52equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m54toStringimpl(int i2) {
            return m52equalsimpl0(i2, Left) ? "Left" : m52equalsimpl0(i2, Right) ? "Right" : m52equalsimpl0(i2, Up) ? "Up" : m52equalsimpl0(i2, Down) ? "Down" : m52equalsimpl0(i2, Start) ? "Start" : m52equalsimpl0(i2, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m51equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m53hashCodeimpl(this.value);
        }

        public String toString() {
            return m54toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m50constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m53hashCodeimpl(int i2) {
            return i2;
        }
    }
}
