package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0096\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008c\u0001\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020 H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "slotSizesSums", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/j;", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkj/p;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkj/l;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyGridMeasurePolicy", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkj/p;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/Composer;II)Lkj/p;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyGrid(androidx.compose.ui.Modifier r32, final androidx.compose.foundation.lazy.grid.LazyGridState r33, final kj.p<? super androidx.compose.ui.unit.Density, ? super androidx.compose.ui.unit.Constraints, ? extends java.util.List<java.lang.Integer>> r34, androidx.compose.foundation.layout.PaddingValues r35, boolean r36, final boolean r37, androidx.compose.foundation.gestures.FlingBehavior r38, final boolean r39, final androidx.compose.foundation.layout.Arrangement.Vertical r40, final androidx.compose.foundation.layout.Arrangement.Horizontal r41, final kj.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.j> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, kj.p, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kj.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(950944068);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyGridItemProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950944068, i2, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:139)");
            }
            if (lazyGridItemProvider.getItemCount() > 0) {
                lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.ScrollPositionUpdater.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                LazyGridKt.ScrollPositionUpdater(lazyGridItemProvider, lazyGridState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @Composable
    private static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, final p<? super Density, ? super Constraints, ? extends List<Integer>> pVar, final PaddingValues paddingValues, final boolean z, final boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(237903564);
        final Arrangement.Horizontal horizontal2 = (i3 & 64) != 0 ? null : horizontal;
        final Arrangement.Vertical vertical2 = (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : vertical;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(237903564, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:150)");
        }
        Object[] objArr = {lazyGridState, pVar, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal2, vertical2, lazyGridItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i4 = 0; i4 < 8; i4++) {
            zChanged |= composer.changed(objArr[i4]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m634invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m634invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    float spacing;
                    float spacing2;
                    long jIntOffset;
                    int firstVisibleItemScrollOffset;
                    int iM648getLineIndexOfItem_Ze7BM;
                    m.h(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m202checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo342roundToPx0680j_4 = z2 ? lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.mo442calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo342roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo342roundToPx0680j_42 = z2 ? lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.mo443calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo342roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo342roundToPx0680j_43 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.getTop());
                    int iMo342roundToPx0680j_44 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(paddingValues.getBottom());
                    final int i5 = iMo342roundToPx0680j_43 + iMo342roundToPx0680j_44;
                    final int i6 = iMo342roundToPx0680j_4 + iMo342roundToPx0680j_42;
                    boolean z3 = z2;
                    int i7 = z3 ? i5 : i6;
                    int i8 = (!z3 || z) ? (z3 && z) ? iMo342roundToPx0680j_44 : (z3 || z) ? iMo342roundToPx0680j_42 : iMo342roundToPx0680j_4 : iMo342roundToPx0680j_43;
                    final int i9 = i7 - i8;
                    long jM5251offsetNN6EwU = ConstraintsKt.m5251offsetNN6EwU(j, -i6, -i5);
                    lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
                    final List list = (List) pVar.invoke(lazyLayoutMeasureScope, Constraints.m5223boximpl(j));
                    spanLayoutProvider.setSlotsPerLine(list.size());
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(list.size());
                    if (z2) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical3.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal3.getSpacing();
                    }
                    int iMo342roundToPx0680j_45 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(spacing);
                    if (z2) {
                        Arrangement.Horizontal horizontal4 = horizontal2;
                        spacing2 = horizontal4 != null ? horizontal4.getSpacing() : Dp.m5267constructorimpl(0);
                    } else {
                        Arrangement.Vertical vertical4 = vertical2;
                        spacing2 = vertical4 != null ? vertical4.getSpacing() : Dp.m5267constructorimpl(0);
                    }
                    final int iMo342roundToPx0680j_46 = lazyLayoutMeasureScope.mo342roundToPx0680j_4(spacing2);
                    int itemCount = lazyGridItemProvider.getItemCount();
                    int iM5234getMaxHeightimpl = z2 ? Constraints.m5234getMaxHeightimpl(j) - i5 : Constraints.m5235getMaxWidthimpl(j) - i6;
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
                    LazyGridItemProvider lazyGridItemProvider2 = lazyGridItemProvider;
                    final boolean z5 = z2;
                    final boolean z6 = z;
                    final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = lazyGridItemPlacementAnimator;
                    final int i10 = i8;
                    int i11 = i8;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(lazyGridItemProvider2, lazyLayoutMeasureScope, iMo342roundToPx0680j_45, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredItemFactory
                        /* JADX INFO: renamed from: createItem-PU_OBEw, reason: not valid java name */
                        public final LazyGridMeasuredItem mo636createItemPU_OBEw(int i12, Object obj, int i13, int i14, List<? extends Placeable> list2) {
                            m.h(obj, "key");
                            m.h(list2, "placeables");
                            return new LazyGridMeasuredItem(i12, obj, z5, i13, i14, z6, lazyLayoutMeasureScope.getLayoutDirection(), i10, i9, list2, lazyGridItemPlacementAnimator2, j2, null);
                        }
                    });
                    final boolean z7 = z2;
                    final LazyMeasuredLineProvider lazyMeasuredLineProvider = new LazyMeasuredLineProvider(z7, list, iMo342roundToPx0680j_46, itemCount, iMo342roundToPx0680j_45, lazyMeasuredItemProvider, spanLayoutProvider, new MeasuredLineFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredLineFactory
                        /* JADX INFO: renamed from: createLine-H9FfpSk, reason: not valid java name */
                        public final LazyGridMeasuredLine mo637createLineH9FfpSk(int i12, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list2, int i13) {
                            m.h(lazyGridMeasuredItemArr, "items");
                            m.h(list2, "spans");
                            return new LazyGridMeasuredLine(i12, lazyGridMeasuredItemArr, list2, z7, list.size(), lazyLayoutMeasureScope.getLayoutDirection(), i13, iMo342roundToPx0680j_46, null);
                        }
                    });
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new l<LineIndex, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return m635invokebKFJvoY(((LineIndex) obj).m668unboximpl());
                        }

                        /* JADX INFO: renamed from: invoke-bKFJvoY, reason: not valid java name */
                        public final ArrayList<Pair<Integer, Constraints>> m635invokebKFJvoY(int i12) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i12);
                            int iM603constructorimpl = ItemIndex.m603constructorimpl(lineConfiguration.getFirstItemIndex());
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyMeasuredLineProvider lazyMeasuredLineProvider2 = lazyMeasuredLineProvider;
                            int size = spans.size();
                            int i13 = 0;
                            for (int i14 = 0; i14 < size; i14++) {
                                int iM597getCurrentLineSpanimpl = GridItemSpan.m597getCurrentLineSpanimpl(spans.get(i14).getPackedValue());
                                arrayList.add(new Pair<>(Integer.valueOf(iM603constructorimpl), Constraints.m5223boximpl(lazyMeasuredLineProvider2.m653childConstraintsJhjzzOo$foundation_release(i13, iM597getCurrentLineSpanimpl))));
                                iM603constructorimpl = ItemIndex.m603constructorimpl(iM603constructorimpl + 1);
                                i13 += iM597getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            if (lazyGridState2.getFirstVisibleItemIndex() < itemCount || itemCount <= 0) {
                                int iM648getLineIndexOfItem_Ze7BM2 = spanLayoutProvider.m648getLineIndexOfItem_Ze7BM(lazyGridState2.getFirstVisibleItemIndex());
                                firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                                iM648getLineIndexOfItem_Ze7BM = iM648getLineIndexOfItem_Ze7BM2;
                            } else {
                                iM648getLineIndexOfItem_Ze7BM = spanLayoutProvider.m648getLineIndexOfItem_Ze7BM(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                            }
                            j jVar = j.a;
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyGridMeasureResult lazyGridMeasureResultM638measureLazyGridt5wl_D8 = LazyGridMeasureKt.m638measureLazyGridt5wl_D8(itemCount, lazyGridItemProvider, lazyMeasuredLineProvider, lazyMeasuredItemProvider, iM5234getMaxHeightimpl, i11, i9, iMo342roundToPx0680j_45, iM648getLineIndexOfItem_Ze7BM, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), jM5251offsetNN6EwU, z2, vertical2, horizontal2, z, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator, spanLayoutProvider, lazyGridState.getPinnedItems(), new q<Integer, Integer, l<? super Placeable.PlacementScope, ? extends j>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (l<? super Placeable.PlacementScope, j>) obj3);
                                }

                                public final MeasureResult invoke(int i12, int i13, l<? super Placeable.PlacementScope, j> lVar) {
                                    m.h(lVar, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m5249constrainWidthK40F9xA(j, i12 + i6), ConstraintsKt.m5248constrainHeightK40F9xA(j, i13 + i5), a0.a, lVar);
                                }
                            });
                            lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResultM638measureLazyGridt5wl_D8);
                            return lazyGridMeasureResultM638measureLazyGridt5wl_D8;
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
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar2 = (p) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar2;
    }
}
