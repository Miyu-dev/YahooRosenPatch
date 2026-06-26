package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BH\u0012\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013R\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aø\u0001\u0001¢\u0006\u0004\b)\u0010*J#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0012\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013R\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR2\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$0\"8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/EnterExitState;", "targetState", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "Landroidx/compose/ui/unit/IntOffset;", "targetValueByState-oFUgxo0", "(Landroidx/compose/animation/EnterExitState;J)J", "targetValueByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "lazyAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getLazyAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideIn", "Landroidx/compose/runtime/State;", "getSlideIn", "()Landroidx/compose/runtime/State;", "slideOut", "getSlideOut", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "Lkj/l;", "getTransitionSpec", "()Lkj/l;", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;
    private final State<Slide> slideIn;
    private final State<Slide> slideOut;
    private final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SlideModifier(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation, State<Slide> state, State<Slide> state2) {
        m.h(deferredAnimation, "lazyAnimation");
        m.h(state, "slideIn");
        m.h(state2, "slideOut");
        this.lazyAnimation = deferredAnimation;
        this.slideIn = state;
        this.slideOut = state2;
        this.transitionSpec = new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
                FiniteAnimationSpec<IntOffset> animationSpec;
                FiniteAnimationSpec<IntOffset> animationSpec2;
                m.h(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Slide value = this.this$0.getSlideIn().getValue();
                    return (value == null || (animationSpec2 = value.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec2;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                }
                Slide value2 = this.this$0.getSlideOut().getValue();
                return (value2 == null || (animationSpec = value2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec;
            }
        };
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    public final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        m.h(measureScope, "$this$measure");
        m.h(measurable, "measurable");
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
        final long jIntSize = IntSizeKt.IntSize(placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight());
        return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.animation.SlideModifier$measure$1
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
                Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation = this.this$0.getLazyAnimation();
                l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec = this.this$0.getTransitionSpec();
                final SlideModifier slideModifier = this.this$0;
                final long j2 = jIntSize;
                Placeable.PlacementScope.m4275placeWithLayeraW9wM$default(placementScope, placeableMo4235measureBRTryo0, lazyAnimation.animate(transitionSpec, new l<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return IntOffset.m5376boximpl(m102invokeBjo55l4((EnterExitState) obj));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m102invokeBjo55l4(EnterExitState enterExitState) {
                        m.h(enterExitState, "it");
                        return slideModifier.m101targetValueByStateoFUgxo0(enterExitState, j2);
                    }
                }).getValue().getPackedValue(), 0.0f, null, 6, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: targetValueByState-oFUgxo0, reason: not valid java name */
    public final long m101targetValueByStateoFUgxo0(EnterExitState targetState, long fullSize) throws NoWhenBranchMatchedException {
        l<IntSize, IntOffset> slideOffset;
        l<IntSize, IntOffset> slideOffset2;
        m.h(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        long jM5395getZeronOccac = (value == null || (slideOffset2 = value.getSlideOffset()) == null) ? IntOffset.INSTANCE.m5395getZeronOccac() : ((IntOffset) slideOffset2.invoke(IntSize.m5419boximpl(fullSize))).getPackedValue();
        Slide value2 = this.slideOut.getValue();
        long jM5395getZeronOccac2 = (value2 == null || (slideOffset = value2.getSlideOffset()) == null) ? IntOffset.INSTANCE.m5395getZeronOccac() : ((IntOffset) slideOffset.invoke(IntSize.m5419boximpl(fullSize))).getPackedValue();
        int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i2 == 1) {
            return IntOffset.INSTANCE.m5395getZeronOccac();
        }
        if (i2 == 2) {
            return jM5395getZeronOccac;
        }
        if (i2 == 3) {
            return jM5395getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
