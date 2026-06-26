package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0095\u0001\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0094\u0001\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/j;", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkj/l;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyListMeasurePolicy", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Lkj/p;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyList(final androidx.compose.ui.Modifier r36, final androidx.compose.foundation.lazy.LazyListState r37, final androidx.compose.foundation.layout.PaddingValues r38, final boolean r39, final boolean r40, final androidx.compose.foundation.gestures.FlingBehavior r41, final boolean r42, int r43, androidx.compose.ui.Alignment.Horizontal r44, androidx.compose.foundation.layout.Arrangement.Vertical r45, androidx.compose.ui.Alignment.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, final kj.l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.j> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kj.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalFoundationApi
    public static final void ScrollPositionUpdater(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(3173830);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyListItemProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(3173830, i2, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if (lazyListItemProvider.getItemCount() > 0) {
                lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.LazyListKt.ScrollPositionUpdater.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                LazyListKt.ScrollPositionUpdater(lazyListItemProvider, lazyListState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @Composable
    @ExperimentalFoundationApi
    private static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, final LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, final PaddingValues paddingValues, final boolean z, final boolean z2, final int i2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i3, int i4, int i5) {
        composer.startReplaceableGroup(-966179815);
        final Alignment.Horizontal horizontal3 = (i5 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i5 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? null : vertical;
        final Arrangement.Horizontal horizontal4 = (i5 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : horizontal2;
        final Arrangement.Vertical vertical4 = (i5 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? null : vertical2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-966179815, i3, i4, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, lazyListBeyondBoundsInfo, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4, lazyListItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i6 = 0; i6 < 10; i6++) {
            zChanged |= composer.changed(objArr[i6]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m573invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m573invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    float spacing;
                    long jIntOffset;
                    m.h(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m202checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo342roundToPx0680j_4 = z2 ? lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.mo442calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo342roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo342roundToPx0680j_42 = z2 ? lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.mo443calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo342roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo342roundToPx0680j_43 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.getTop());
                    int iMo342roundToPx0680j_44 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.getBottom());
                    final int i7 = iMo342roundToPx0680j_43 + iMo342roundToPx0680j_44;
                    final int i8 = iMo342roundToPx0680j_4 + iMo342roundToPx0680j_42;
                    boolean z3 = z2;
                    int i9 = z3 ? i7 : i8;
                    int i10 = (!z3 || z) ? (z3 && z) ? iMo342roundToPx0680j_44 : (z3 || z) ? iMo342roundToPx0680j_42 : iMo342roundToPx0680j_4 : iMo342roundToPx0680j_43;
                    final int i11 = i9 - i10;
                    long jM5251offsetNN6EwU = ConstraintsKt.m5251offsetNN6EwU(j, -i8, -i7);
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyListItemProvider.getItemScope().setMaxSize(Constraints.m5235getMaxWidthimpl(jM5251offsetNN6EwU), Constraints.m5234getMaxHeightimpl(jM5251offsetNN6EwU));
                    if (z2) {
                        Arrangement.Vertical vertical5 = vertical4;
                        if (vertical5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical5.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal5 = horizontal4;
                        if (horizontal5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal5.getSpacing();
                    }
                    final int iMo342roundToPx0680j_45 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProvider.getItemCount();
                    int iM5234getMaxHeightimpl = z2 ? Constraints.m5234getMaxHeightimpl(j) - i7 : Constraints.m5235getMaxWidthimpl(j) - i8;
                    if (!z || iM5234getMaxHeightimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo342roundToPx0680j_4, iMo342roundToPx0680j_43);
                    } else {
                        boolean z4 = z2;
                        if (!z4) {
                            iMo342roundToPx0680j_4 += iM5234getMaxHeightimpl;
                        }
                        if (z4) {
                            iMo342roundToPx0680j_43 += iM5234getMaxHeightimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo342roundToPx0680j_4, iMo342roundToPx0680j_43);
                    }
                    final long j2 = jIntOffset;
                    final boolean z5 = z2;
                    LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                    final Alignment.Horizontal horizontal6 = horizontal3;
                    final Alignment.Vertical vertical6 = vertical3;
                    final boolean z6 = z;
                    final LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = lazyListItemPlacementAnimator;
                    final int i12 = i10;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(jM5251offsetNN6EwU, z5, lazyListItemProvider2, lazyLayoutMeasureScope, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo574createItemHK0c1C0(int i13, Object obj, List<? extends Placeable> list) {
                            m.h(obj, "key");
                            m.h(list, "placeables");
                            return new LazyMeasuredItem(i13, list, z5, horizontal6, vertical6, lazyLayoutMeasureScope.getLayoutDirection(), z6, i12, i11, lazyListItemPlacementAnimator2, i13 == itemCount + (-1) ? 0 : iMo342roundToPx0680j_45, j2, obj, null);
                        }
                    }, null);
                    lazyListState.m586setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iM550constructorimpl = DataIndex.m550constructorimpl(lazyListState2.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                            j jVar = j.a;
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyListMeasureResult lazyListMeasureResultM577measureLazyListHh3qtAg = LazyListMeasureKt.m577measureLazyListHh3qtAg(itemCount, lazyListItemProvider, lazyMeasuredItemProvider, iM5234getMaxHeightimpl, i10, i11, iMo342roundToPx0680j_45, iM550constructorimpl, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), jM5251offsetNN6EwU, z2, lazyListItemProvider.getHeaderIndexes(), vertical4, horizontal4, z, lazyLayoutMeasureScope, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, i2, lazyListState.getPinnedItems(), new q<Integer, Integer, l<? super Placeable.PlacementScope, ? extends j>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (l<? super Placeable.PlacementScope, j>) obj3);
                                }

                                public final MeasureResult invoke(int i13, int i14, l<? super Placeable.PlacementScope, j> lVar) {
                                    m.h(lVar, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m5249constrainWidthK40F9xA(j, i13 + i8), ConstraintsKt.m5248constrainHeightK40F9xA(j, i14 + i7), a0.a, lVar);
                                }
                            });
                            lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM577measureLazyListHh3qtAg);
                            return lazyListMeasureResultM577measureLazyListHh3qtAg;
                        } finally {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        }
                    } catch (Throwable th) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar = (p) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }
}
