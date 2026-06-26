package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import dj.c;
import java.util.List;
import kj.q;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0003\u001e!$\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0017\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b\"\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"2\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001d\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "Lkotlin/j;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Ldj/c;)Ljava/lang/Object;", "animateToPreviousPage", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "MinPageOffset", "F", "MaxPageOffset", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/Density;", "SnapAlignmentStartToStart", "Lkj/q;", "getSnapAlignmentStartToStart", "()Lkj/q;", "Landroidx/compose/ui/unit/Dp;", "DefaultPositionThreshold", "getDefaultPositionThreshold", "()F", "MaxPagesForAnimateScroll", "I", "androidx/compose/foundation/pager/PagerStateKt$EmptyLayoutInfo$1", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerStateKt$EmptyLayoutInfo$1;", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "UnitDensity", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "androidx/compose/foundation/pager/PagerStateKt$EmptyInteractionSources$1", "EmptyInteractionSources", "Landroidx/compose/foundation/pager/PagerStateKt$EmptyInteractionSources$1;", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    private static final float MinPageOffset = -0.5f;
    private static final q<Density, Float, Float, Float> SnapAlignmentStartToStart = new q<Density, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerStateKt$SnapAlignmentStartToStart$1
        public final Float invoke(Density density, float f, float f2) {
            m.h(density, "$this$null");
            return Float.valueOf(0.0f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Density) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
        }
    };
    private static final float DefaultPositionThreshold = Dp.m5267constructorimpl(56);
    private static final PagerStateKt$EmptyLayoutInfo$1 EmptyLayoutInfo = new LazyListLayoutInfo() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final int mainAxisItemSpacing;
        private final int totalItemsCount;
        private final int viewportEndOffset;
        private final int viewportStartOffset;
        private final List<LazyListItemInfo> visibleItemsInfo = EmptyList.INSTANCE;

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public final /* synthetic */ int getAfterContentPadding() {
            return b.a(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public final /* synthetic */ int getBeforeContentPadding() {
            return b.b(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getMainAxisItemSpacing() {
            return this.mainAxisItemSpacing;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public final /* synthetic */ Orientation getOrientation() {
            return b.d(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public final /* synthetic */ boolean getReverseLayout() {
            return b.e(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getTotalItemsCount() {
            return this.totalItemsCount;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getViewportEndOffset() {
            return this.viewportEndOffset;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        /* JADX INFO: renamed from: getViewportSize-YbymL2g */
        public final /* synthetic */ long mo561getViewportSizeYbymL2g() {
            return b.f(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getViewportStartOffset() {
            return this.viewportStartOffset;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public List<LazyListItemInfo> getVisibleItemsInfo() {
            return this.visibleItemsInfo;
        }
    };
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final /* synthetic */ int mo341roundToPxR2X_6o(long j) {
            return a.a(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final /* synthetic */ int mo342roundToPx0680j_4(float f) {
            return a.b(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final /* synthetic */ float mo343toDpGaN1DYA(long j) {
            return a.c(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo344toDpu2uoSUM(float f) {
            return a.d(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final /* synthetic */ long mo346toDpSizekrfVVM(long j) {
            return a.f(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final /* synthetic */ float mo347toPxR2X_6o(long j) {
            return a.g(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final /* synthetic */ float mo348toPx0680j_4(float f) {
            return a.h(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        public final /* synthetic */ Rect toRect(DpRect dpRect) {
            return a.i(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final /* synthetic */ long mo349toSizeXkaWNTQ(long j) {
            return a.j(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final /* synthetic */ long mo350toSp0xMU5do(float f) {
            return a.k(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo351toSpkPz2Gy4(float f) {
            return a.l(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo345toDpu2uoSUM(int i2) {
            return a.e(this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo352toSpkPz2Gy4(int i2) {
            return a.m(this, i2);
        }
    };
    private static final PagerStateKt$EmptyInteractionSources$1 EmptyInteractionSources = new InteractionSource() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyInteractionSources$1
        @Override // androidx.compose.foundation.interaction.InteractionSource
        public Flow<Interaction> getInteractions() {
            return FlowKt.emptyFlow();
        }
    };

    public static final Object animateToNextPage(PagerState pagerState, c<? super j> cVar) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount$foundation_release()) {
            return j.a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, cVar, 6, null);
        return objAnimateScrollToPage$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateScrollToPage$default : j.a;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, c<? super j> cVar) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return j.a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, cVar, 6, null);
        return objAnimateScrollToPage$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateScrollToPage$default : j.a;
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final q<Density, Float, Float, Float> getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final PagerState rememberPagerState(final int i2, final float f, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(144687223);
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(144687223, i3, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:66)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerState, ?> saver = PagerState.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i2);
        Float fValueOf = Float.valueOf(f);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(fValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new kj.a<PagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final PagerState m746invoke() {
                    return new PagerState(i2, f);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PagerState pagerState = (PagerState) RememberSaveableKt.m2460rememberSaveable(objArr, (Saver) saver, (String) null, (kj.a) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerState;
    }

    private static final void debugLog(kj.a<String> aVar) {
    }
}
