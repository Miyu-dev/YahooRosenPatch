package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B2\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ)\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0013\u0010\u0014\u001a\u00020\u000fH\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010,\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R+\u00103\u001a\u00020-2\u0006\u0010!\u001a\u00020-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u0010:\u001a\u0002042\u0006\u0010!\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u00107\"\u0004\b8\u00109R4\u0010?\u001a\u00020;2\u0006\u0010!\u001a\u00020;8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u0010#\u001a\u0004\b=\u0010%\"\u0004\b>\u0010'R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u001dR\u001b\u0010I\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010%\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/MarqueeModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/j;", "draw", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "runAnimation", "(Ldj/c;)Ljava/lang/Object;", "", "iterations", "I", "delayMillis", "initialDelayMillis", "Landroidx/compose/ui/unit/Dp;", "velocity", "F", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "<set-?>", "contentWidth$delegate", "Landroidx/compose/runtime/MutableState;", "getContentWidth", "()I", "setContentWidth", "(I)V", "contentWidth", "containerWidth$delegate", "getContainerWidth", "setContainerWidth", "containerWidth", "", "hasFocus$delegate", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing$delegate", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "spacing", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode$delegate", "getAnimationMode-ZbEOnfQ", "setAnimationMode-97h66l8", "animationMode", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/animation/core/Animatable;", "direction", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "getSpacingPx", "spacingPx", "<init>", "(IIIFLandroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class MarqueeModifier implements Modifier.Element, LayoutModifier, DrawModifier, FocusEventModifier {

    /* JADX INFO: renamed from: animationMode$delegate, reason: from kotlin metadata */
    private final MutableState animationMode;

    /* JADX INFO: renamed from: containerWidth$delegate, reason: from kotlin metadata */
    private final MutableState containerWidth;

    /* JADX INFO: renamed from: contentWidth$delegate, reason: from kotlin metadata */
    private final MutableState contentWidth;
    private final int delayMillis;
    private final Density density;
    private final float direction;

    /* JADX INFO: renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private final int initialDelayMillis;
    private final int iterations;
    private final Animatable<Float, AnimationVector1D> offset;

    /* JADX INFO: renamed from: spacing$delegate, reason: from kotlin metadata */
    private final MutableState spacing;

    /* JADX INFO: renamed from: spacingPx$delegate, reason: from kotlin metadata */
    private final State spacingPx;
    private final float velocity;

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2", f = "BasicMarquee.kt", l = {272}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BasicMarquee.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "contentWithSpacingWidth", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2$2", f = "BasicMarquee.kt", l = {285, 287, 289, 289}, m = "invokeSuspend")
        public static final class C00222 extends SuspendLambda implements p<Float, dj.c<? super j>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00222(MarqueeModifier marqueeModifier, dj.c<? super C00222> cVar) {
                super(2, cVar);
                this.this$0 = marqueeModifier;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C00222 c00222 = new C00222(this.this$0, cVar);
                c00222.L$0 = obj;
                return c00222;
            }

            public final Object invoke(Float f, dj.c<? super j> cVar) {
                return create(f, cVar).invokeSuspend(j.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifier.AnonymousClass2.C00222.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return MarqueeModifier.this.new AnonymousClass2(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final MarqueeModifier marqueeModifier = MarqueeModifier.this;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new kj.a<Float>() { // from class: androidx.compose.foundation.MarqueeModifier.runAnimation.2.1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Float m255invoke() {
                        if (marqueeModifier.getContentWidth() <= marqueeModifier.getContainerWidth()) {
                            return null;
                        }
                        if (!MarqueeAnimationMode.m245equalsimpl0(marqueeModifier.m253getAnimationModeZbEOnfQ(), MarqueeAnimationMode.INSTANCE.m252getWhileFocusedZbEOnfQ()) || marqueeModifier.getHasFocus()) {
                            return Float.valueOf(marqueeModifier.getContentWidth() + marqueeModifier.getSpacingPx());
                        }
                        return null;
                    }
                });
                C00222 c00222 = new C00222(MarqueeModifier.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, c00222, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    public /* synthetic */ MarqueeModifier(int i2, int i3, int i4, float f, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, f, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getContainerWidth() {
        return ((Number) this.containerWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getContentWidth() {
        return ((Number) this.contentWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    private final void setContainerWidth(int i2) {
        this.containerWidth.setValue(Integer.valueOf(i2));
    }

    private final void setContentWidth(int i2) {
        this.contentWidth.setValue(Integer.valueOf(i2));
    }

    private final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        m.h(contentDrawScope, "<this>");
        float fFloatValue = this.offset.getValue().floatValue();
        float f = this.direction;
        float f2 = fFloatValue * f;
        boolean z = !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? this.offset.getValue().floatValue() >= ((float) getContainerWidth()) : this.offset.getValue().floatValue() >= ((float) getContentWidth());
        boolean z2 = !((this.direction > 1.0f ? 1 : (this.direction == 1.0f ? 0 : -1)) == 0) ? this.offset.getValue().floatValue() <= ((float) getSpacingPx()) : this.offset.getValue().floatValue() <= ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = this.direction == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float fM2651getHeightimpl = Size.m2651getHeightimpl(contentDrawScope.mo3254getSizeNHjbRc());
        int iM2807getIntersectrtfAjoo = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3263clipRectN_I0leg(f2, 0.0f, f2 + getContainerWidth(), fM2651getHeightimpl, iM2807getIntersectrtfAjoo);
        if (z) {
            contentDrawScope.drawContent();
        }
        if (z2) {
            contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m253getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode.getValue()).getValue();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing.getValue();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        m.h(measureScope, "$this$measure");
        m.h(measurable, "measurable");
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m5249constrainWidthK40F9xA(j, placeableMo4235measureBRTryo0.getWidth()));
        setContentWidth(placeableMo4235measureBRTryo0.getWidth());
        return MeasureScope.CC.p(measureScope, getContainerWidth(), placeableMo4235measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.foundation.MarqueeModifier$measure$1
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
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo4235measureBRTryo0, a.f.f0((-((Number) this.offset.getValue()).floatValue()) * this.direction), 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifier
    public void onFocusEvent(FocusState focusState) {
        m.h(focusState, "focusState");
        setHasFocus(focusState.getHasFocus());
    }

    public final Object runAnimation(dj.c<? super j> cVar) {
        if (this.iterations <= 0) {
            return j.a;
        }
        Object objWithContext = BuildersKt.withContext(FixedMotionDurationScale.INSTANCE, new AnonymousClass2(null), cVar);
        return objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithContext : j.a;
    }

    /* JADX INFO: renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m254setAnimationMode97h66l8(int i2) {
        this.animationMode.setValue(MarqueeAnimationMode.m242boximpl(i2));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        m.h(marqueeSpacing, "<set-?>");
        this.spacing.setValue(marqueeSpacing);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    private MarqueeModifier(int i2, int i3, int i4, float f, Density density) {
        this.iterations = i2;
        this.delayMillis = i3;
        this.initialDelayMillis = i4;
        this.velocity = f;
        this.density = density;
        this.contentWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.containerWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BasicMarqueeKt.getDefaultMarqueeSpacing(), null, 2, null);
        this.animationMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m242boximpl(MarqueeAnimationMode.INSTANCE.m251getImmediatelyZbEOnfQ()), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.direction = Math.signum(f);
        this.spacingPx = SnapshotStateKt.derivedStateOf(new kj.a<Integer>() { // from class: androidx.compose.foundation.MarqueeModifier$spacingPx$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m256invoke() {
                MarqueeSpacing spacing = this.this$0.getSpacing();
                MarqueeModifier marqueeModifier = this.this$0;
                return Integer.valueOf(spacing.calculateSpacing(marqueeModifier.density, marqueeModifier.getContentWidth(), marqueeModifier.getContainerWidth()));
            }
        });
    }
}
