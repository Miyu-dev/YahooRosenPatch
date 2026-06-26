package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import dj.e;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001:\u0001-B \u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0001¢\u0006\u0004\b+\u0010,J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R9\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R/\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "targetSize", "animateTo-mzRDjE0", "(J)J", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "animSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "Lkotlin/j;", "listener", "Lkj/p;", "getListener", "()Lkj/p;", "setListener", "(Lkj/p;)V", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "<set-?>", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifier$AnimData;)V", "animData", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/CoroutineScope;)V", "AnimData", "animation_release"}, k = 1, mv = {1, 8, 0})
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* JADX INFO: renamed from: animData$delegate, reason: from kotlin metadata */
    private final MutableState animData;
    private final AnimationSpec<IntSize> animSpec;
    private p<? super IntSize, ? super IntSize, j> listener;
    private final CoroutineScope scope;

    /* JADX INFO: compiled from: AnimationModifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B$\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003ø\u0001\u0000J\u0019\u0010\u0010\u001a\u00020\u0004HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ6\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "anim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "startSize", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "getStartSize-YbymL2g", "()J", "setStartSize-ozmzZPI", "(J)V", "J", "component1", "component2", "component2-YbymL2g", "copy", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "equals", "", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final /* data */ class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m95copyO0kMr_c$default(AnimData animData, Animatable animatable, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i2 & 2) != 0) {
                j = animData.startSize;
            }
            return animData.m97copyO0kMr_c(animatable, j);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name and from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m97copyO0kMr_c(Animatable<IntSize, AnimationVector2D> anim, long startSize) {
            m.h(anim, "anim");
            return new AnimData(anim, startSize, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return m.c(this.anim, animData.anim) && IntSize.m5425equalsimpl0(this.startSize, animData.startSize);
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m98getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return IntSize.m5428hashCodeimpl(this.startSize) + (this.anim.hashCode() * 31);
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m99setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m5430toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }
    }

    public SizeAnimationModifier(AnimationSpec<IntSize> animationSpec, CoroutineScope coroutineScope) {
        m.h(animationSpec, "animSpec");
        m.h(coroutineScope, "scope");
        this.animSpec = animationSpec;
        this.scope = coroutineScope;
        this.animData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m94animateTomzRDjE0(long targetSize) {
        AnimData animData = getAnimData();
        if (animData == null) {
            animData = new AnimData(new Animatable(IntSize.m5419boximpl(targetSize), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), IntSize.m5419boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), targetSize, null);
        } else if (!IntSize.m5425equalsimpl0(targetSize, animData.getAnim().getTargetValue().getPackedValue())) {
            animData.m99setStartSizeozmzZPI(animData.getAnim().getValue().getPackedValue());
            BuildersKt.launch$default(this.scope, (e) null, (CoroutineStart) null, new SizeAnimationModifier$animateTo$data$1$1(animData, targetSize, this, null), 3, (Object) null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData getAnimData() {
        return (AnimData) this.animData.getValue();
    }

    public final AnimationSpec<IntSize> getAnimSpec() {
        return this.animSpec;
    }

    public final p<IntSize, IntSize, j> getListener() {
        return this.listener;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        m.h(measureScope, "$this$measure");
        m.h(measurable, "measurable");
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
        long jM94animateTomzRDjE0 = m94animateTomzRDjE0(IntSizeKt.IntSize(placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight()));
        return MeasureScope.CC.p(measureScope, IntSize.m5427getWidthimpl(jM94animateTomzRDjE0), IntSize.m5426getHeightimpl(jM94animateTomzRDjE0), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.animation.SizeAnimationModifier$measure$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                m.h(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setAnimData(AnimData animData) {
        this.animData.setValue(animData);
    }

    public final void setListener(p<? super IntSize, ? super IntSize, j> pVar) {
        this.listener = pVar;
    }
}
