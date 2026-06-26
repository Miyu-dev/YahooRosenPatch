package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007\u001a/\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a/\u0010\u000f\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a9\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0019\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aE\u0010\"\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aE\u0010&\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001b\u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001aE\u0010)\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001b\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001aE\u0010+\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010 \u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001aE\u0010-\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010 \u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u0010/\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u00101\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u00103\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a1\u00105\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\nH\u0007ø\u0001\u0000\u001a\f\u00106\u001a\u00020\u001a*\u00020#H\u0002\u001a\f\u00106\u001a\u00020\u001a*\u00020'H\u0002\u001a1\u0010>\u001a\u00020=*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?\u001aB\u0010D\u001a\u00020=*\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u000208072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A2\u0006\u0010C\u001a\u00020;H\u0002\u001aB\u0010H\u001a\u00020=*\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u000208072\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0A2\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0A2\u0006\u0010C\u001a\u00020;H\u0002\"#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bK\u0010L\"\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0P8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bS\u0010R\"\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0P8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bT\u0010R\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "initialOffset", "slideIn", "targetOffset", "slideOut", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "shrinkTowards", "targetSize", "shrinkOut", "Landroidx/compose/ui/Alignment$Horizontal;", "", "initialWidth", "expandHorizontally", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "expandVertically", "targetWidth", "shrinkHorizontally", "targetHeight", "shrinkVertically", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "toAlignment", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "transition", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "labelPrefix", "slideInOut", "Landroidx/compose/animation/ChangeSize;", "expand", "shrink", "shrinkExpand", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/runtime/MutableState;", "DefaultAlpha", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new l<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m71invoke__ExYCQ(((TransformOrigin) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m71invoke__ExYCQ(long j) {
            return new AnimationVector2D(TransformOrigin.m3174getPivotFractionXimpl(j), TransformOrigin.m3175getPivotFractionYimpl(j));
        }
    }, new l<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return TransformOrigin.m3166boximpl(m72invokeLIALnN8((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m72invokeLIALnN8(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final MutableState<Float> DefaultAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r27, final androidx.compose.animation.EnterTransition r28, final androidx.compose.animation.ExitTransition r29, java.lang.String r30, androidx.compose.runtime.Composer r31, int r32) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    private static final boolean createModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createModifier$lambda$13(State<TransformOrigin> state) {
        return state.getValue().getPackedValue();
    }

    private static final void createModifier$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean createModifier$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createModifier$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(horizontal, "expandFrom");
        m.h(lVar, "initialWidth");
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m5419boximpl(m73invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m73invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(((Number) lVar.invoke(Integer.valueOf(IntSize.m5427getWidthimpl(j)))).intValue(), IntSize.m5426getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                public final Integer invoke(int i3) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, lVar);
    }

    @Stable
    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, l<? super IntSize, IntSize> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(alignment, "expandFrom");
        m.h(lVar, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m5419boximpl(m74invokemzRDjE0(((IntSize) obj2).getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m74invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, lVar);
    }

    @Stable
    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(vertical, "expandFrom");
        m.h(lVar, "initialHeight");
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m5419boximpl(m75invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m75invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m5427getWidthimpl(j), ((Number) lVar.invoke(Integer.valueOf(IntSize.m5426getHeightimpl(j)))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                public final Integer invoke(int i3) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, lVar);
    }

    @Stable
    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        m.h(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    @Stable
    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        m.h(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    @Stable
    @ExperimentalAnimationApi
    /* JADX INFO: renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m67scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        m.h(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m68scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j = TransformOrigin.INSTANCE.m3179getCenterSzJe1aQ();
        }
        return m67scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    @Stable
    @ExperimentalAnimationApi
    /* JADX INFO: renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m69scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        m.h(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m70scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j = TransformOrigin.INSTANCE.m3179getCenterSzJe1aQ();
        }
        return m69scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition<EnterExitState> transition, final State<ChangeSize> state, final State<ChangeSize> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, int r23) {
                /*
                    Method dump skipped, instruction units count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.C01321.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }, 1, null);
    }

    @Stable
    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(horizontal, "shrinkTowards");
        m.h(lVar, "targetWidth");
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m5419boximpl(m76invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m76invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(((Number) lVar.invoke(Integer.valueOf(IntSize.m5427getWidthimpl(j)))).intValue(), IntSize.m5426getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                public final Integer invoke(int i3) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, lVar);
    }

    @Stable
    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, l<? super IntSize, IntSize> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(alignment, "shrinkTowards");
        m.h(lVar, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m5419boximpl(m77invokemzRDjE0(((IntSize) obj2).getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m77invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, lVar);
    }

    @Stable
    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(vertical, "shrinkTowards");
        m.h(lVar, "targetHeight");
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m5419boximpl(m78invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m78invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m5427getWidthimpl(j), ((Number) lVar.invoke(Integer.valueOf(IntSize.m5426getHeightimpl(j)))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5419boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                public final Integer invoke(int i3) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, lVar);
    }

    @Stable
    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super IntSize, IntOffset> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(lVar, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, lVar);
    }

    @Stable
    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(lVar, "initialOffsetX");
        return slideIn(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m5376boximpl(m79invokemHKZG7I(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m79invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(((Number) lVar.invoke(Integer.valueOf(IntSize.m5427getWidthimpl(j)))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, lVar);
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition<EnterExitState> transition, final State<Slide> state, final State<Slide> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, 158379472)) {
                    ComposerKt.traceEventStart(158379472, i2, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:951)");
                }
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    invoke$lambda$2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    invoke$lambda$2(mutableState, true);
                }
                if (invoke$lambda$1(mutableState)) {
                    Transition<EnterExitState> transition3 = transition;
                    TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                    String str2 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = str2 + " slide";
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) objRememberedValue2, composer, 448, 0);
                    Transition<EnterExitState> transition4 = transition;
                    State<Slide> state3 = state;
                    State<Slide> state4 = state2;
                    composer.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer.changed(transition4);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SlideModifier(deferredAnimationCreateDeferredAnimation, state3, state4);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    modifier2 = modifier2.then((SlideModifier) objRememberedValue3);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifier2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }, 1, null);
    }

    @Stable
    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(lVar, "initialOffsetY");
        return slideIn(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m5376boximpl(m80invokemHKZG7I(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m80invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, ((Number) lVar.invoke(Integer.valueOf(IntSize.m5426getHeightimpl(j)))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, lVar);
    }

    @Stable
    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super IntSize, IntOffset> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(lVar, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, lVar);
    }

    @Stable
    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(lVar, "targetOffsetX");
        return slideOut(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m5376boximpl(m81invokemHKZG7I(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m81invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(((Number) lVar.invoke(Integer.valueOf(IntSize.m5427getWidthimpl(j)))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, lVar);
    }

    @Stable
    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final l<? super Integer, Integer> lVar) {
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(lVar, "targetOffsetY");
        return slideOut(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m5376boximpl(m82invokemHKZG7I(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m82invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, ((Number) lVar.invoke(Integer.valueOf(IntSize.m5426getHeightimpl(j)))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, lVar);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return m.c(horizontal, companion.getStart()) ? companion.getCenterStart() : m.c(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return m.c(vertical, companion.getTop()) ? companion.getTopCenter() : m.c(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
