package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a´\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u008a\u0001\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\"\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0017\u0010#\u001a\u00020\"8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkj/p;Lkj/p;Lkj/p;Lkj/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "Scaffold", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkj/p;Lkj/q;Lkj/p;Lkj/p;Landroidx/compose/foundation/layout/WindowInsets;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "FabSpacing", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new kj.a<FabPlacement>() { // from class: androidx.compose.material3.ScaffoldKt$LocalFabPlacement$1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final FabPlacement m1462invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m5267constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* JADX INFO: renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1459ScaffoldTvnljyQ(androidx.compose.ui.Modifier r29, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r30, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r31, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r32, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r33, int r34, long r35, long r37, androidx.compose.foundation.layout.WindowInsets r39, final kj.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m1459ScaffoldTvnljyQ(androidx.compose.ui.Modifier, kj.p, kj.p, kj.p, kj.p, int, long, long, androidx.compose.foundation.layout.WindowInsets, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* JADX INFO: renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m1460ScaffoldLayoutFMILGgc(final int i2, final p<? super Composer, ? super Integer, j> pVar, final q<? super PaddingValues, ? super Composer, ? super Integer, j> qVar, final p<? super Composer, ? super Integer, j> pVar2, final p<? super Composer, ? super Integer, j> pVar3, final WindowInsets windowInsets, final p<? super Composer, ? super Integer, j> pVar4, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        int i5 = (i3 & 14) == 0 ? (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3 : i3;
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(qVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(pVar2) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(pVar4) ? 1048576 : 524288;
        }
        final int i6 = i5;
        if ((2995931 & i6) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i6, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:111)");
            }
            Object[] objArr = {pVar, pVar2, windowInsets, pVar3, FabPosition.m1288boximpl(i2), pVar4, qVar};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i7 = 0;
            boolean zChanged = false;
            for (int i8 = 7; i7 < i8; i8 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i7]);
                i7++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i4 = 0;
                composer2 = composerStartRestartGroup;
                p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar5 = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m1463invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                    }

                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1463invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        m.h(subcomposeMeasureScope, "$this$SubcomposeLayout");
                        final int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
                        final int iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
                        final long jM5226copyZbe2FdA$default = Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final p<Composer, Integer, j> pVar6 = pVar;
                        final p<Composer, Integer, j> pVar7 = pVar2;
                        final p<Composer, Integer, j> pVar8 = pVar3;
                        final int i9 = i2;
                        final WindowInsets windowInsets2 = windowInsets;
                        final p<Composer, Integer, j> pVar9 = pVar4;
                        final int i10 = i6;
                        final q<PaddingValues, Composer, Integer, j> qVar2 = qVar;
                        return MeasureScope.CC.p(subcomposeMeasureScope, iM5235getMaxWidthimpl, iM5234getMaxHeightimpl, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return j.a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                Object next;
                                Object next2;
                                Object next3;
                                final FabPlacement fabPlacement;
                                Object next4;
                                Integer numValueOf;
                                Object next5;
                                Object next6;
                                m.h(placementScope, "$this$layout");
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, pVar6);
                                long j2 = jM5226copyZbe2FdA$default;
                                final ArrayList arrayList = new ArrayList(jj.a.Q0(listSubcompose, 10));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo4235measureBRTryo0(j2));
                                }
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((Placeable) next).getHeight();
                                        do {
                                            Object next7 = it2.next();
                                            int height2 = ((Placeable) next7).getHeight();
                                            if (height < height2) {
                                                next = next7;
                                                height = height2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                Placeable placeable = (Placeable) next;
                                final int height3 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, pVar7);
                                WindowInsets windowInsets3 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                long j3 = jM5226copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(jj.a.Q0(listSubcompose2, 10));
                                Iterator<T> it3 = listSubcompose2.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((Measurable) it3.next()).mo4235measureBRTryo0(ConstraintsKt.m5251offsetNN6EwU(j3, (-windowInsets3.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope2))));
                                }
                                Iterator it4 = arrayList2.iterator();
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (it4.hasNext()) {
                                        int height4 = ((Placeable) next2).getHeight();
                                        do {
                                            Object next8 = it4.next();
                                            int height5 = ((Placeable) next8).getHeight();
                                            if (height4 < height5) {
                                                next2 = next8;
                                                height4 = height5;
                                            }
                                        } while (it4.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                Placeable placeable2 = (Placeable) next2;
                                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                                Iterator it5 = arrayList2.iterator();
                                if (it5.hasNext()) {
                                    next3 = it5.next();
                                    if (it5.hasNext()) {
                                        int width = ((Placeable) next3).getWidth();
                                        do {
                                            Object next9 = it5.next();
                                            int width2 = ((Placeable) next9).getWidth();
                                            if (width < width2) {
                                                next3 = next9;
                                                width = width2;
                                            }
                                        } while (it5.hasNext());
                                    }
                                } else {
                                    next3 = null;
                                }
                                Placeable placeable3 = (Placeable) next3;
                                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, pVar8);
                                WindowInsets windowInsets4 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                long j4 = jM5226copyZbe2FdA$default;
                                ArrayList<Placeable> arrayList3 = new ArrayList();
                                Iterator<T> it6 = listSubcompose3.iterator();
                                while (it6.hasNext()) {
                                    Placeable placeableMo4235measureBRTryo0 = ((Measurable) it6.next()).mo4235measureBRTryo0(ConstraintsKt.m5251offsetNN6EwU(j4, (-windowInsets4.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope3)));
                                    if (!((placeableMo4235measureBRTryo0.getHeight() == 0 || placeableMo4235measureBRTryo0.getWidth() == 0) ? false : true)) {
                                        placeableMo4235measureBRTryo0 = null;
                                    }
                                    if (placeableMo4235measureBRTryo0 != null) {
                                        arrayList3.add(placeableMo4235measureBRTryo0);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    Iterator it7 = arrayList3.iterator();
                                    if (it7.hasNext()) {
                                        next5 = it7.next();
                                        if (it7.hasNext()) {
                                            int width4 = ((Placeable) next5).getWidth();
                                            do {
                                                Object next10 = it7.next();
                                                int width5 = ((Placeable) next10).getWidth();
                                                if (width4 < width5) {
                                                    next5 = next10;
                                                    width4 = width5;
                                                }
                                            } while (it7.hasNext());
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                    m.e(next5);
                                    int width6 = ((Placeable) next5).getWidth();
                                    Iterator it8 = arrayList3.iterator();
                                    if (it8.hasNext()) {
                                        next6 = it8.next();
                                        if (it8.hasNext()) {
                                            int height7 = ((Placeable) next6).getHeight();
                                            do {
                                                Object next11 = it8.next();
                                                int height8 = ((Placeable) next11).getHeight();
                                                if (height7 < height8) {
                                                    next6 = next11;
                                                    height7 = height8;
                                                }
                                            } while (it8.hasNext());
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                    m.e(next6);
                                    fabPlacement = new FabPlacement(FabPosition.m1291equalsimpl0(i9, FabPosition.INSTANCE.m1296getEndERTFSPs()) ? subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr ? (iM5235getMaxWidthimpl - subcomposeMeasureScope.mo342roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width6 : subcomposeMeasureScope.mo342roundToPx0680j_4(ScaffoldKt.FabSpacing) : (iM5235getMaxWidthimpl - width6) / 2, width6, ((Placeable) next6).getHeight());
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final p<Composer, Integer, j> pVar10 = pVar9;
                                final int i11 = i10;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope4.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return j.a;
                                    }

                                    @Composable
                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1455477816, i12, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:193)");
                                        }
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(fabPlacement)}, pVar10, composer3, ((i11 >> 15) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                long j5 = jM5226copyZbe2FdA$default;
                                final ArrayList arrayList4 = new ArrayList(jj.a.Q0(listSubcompose4, 10));
                                Iterator<T> it9 = listSubcompose4.iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(((Measurable) it9.next()).mo4235measureBRTryo0(j5));
                                }
                                Iterator it10 = arrayList4.iterator();
                                if (it10.hasNext()) {
                                    next4 = it10.next();
                                    if (it10.hasNext()) {
                                        int height9 = ((Placeable) next4).getHeight();
                                        while (true) {
                                            Object next12 = it10.next();
                                            int height10 = ((Placeable) next12).getHeight();
                                            if (height9 < height10) {
                                                next4 = next12;
                                                height9 = height10;
                                            }
                                            if (!it10.hasNext()) {
                                                break;
                                            } else {
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                    }
                                } else {
                                    next4 = null;
                                }
                                Placeable placeable4 = (Placeable) next4;
                                Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope5 = subcomposeMeasureScope;
                                    numValueOf = Integer.valueOf(numValueOf2 == null ? windowInsets2.getBottom(subcomposeMeasureScope5) + subcomposeMeasureScope5.mo342roundToPx0680j_4(ScaffoldKt.FabSpacing) + fabPlacement.getHeight() : subcomposeMeasureScope5.mo342roundToPx0680j_4(ScaffoldKt.FabSpacing) + fabPlacement.getHeight() + numValueOf2.intValue());
                                } else {
                                    numValueOf = null;
                                }
                                int iIntValue = height6 != 0 ? height6 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(subcomposeMeasureScope)) : 0;
                                final SubcomposeMeasureScope subcomposeMeasureScope6 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final WindowInsets windowInsets5 = windowInsets2;
                                final q<PaddingValues, Composer, Integer, j> qVar3 = qVar2;
                                final int i12 = i10;
                                ArrayList arrayList5 = arrayList2;
                                final Integer num = numValueOf2;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope6.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return j.a;
                                    }

                                    @Composable
                                    public final void invoke(Composer composer3, int i13) {
                                        Integer num2;
                                        if ((i13 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1643221465, i13, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:220)");
                                        }
                                        PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope6);
                                        qVar3.invoke(PaddingKt.m457PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope6.getLayoutDirection()), arrayList.isEmpty() ? paddingValuesAsPaddingValues.getTop() : subcomposeMeasureScope6.mo345toDpu2uoSUM(height3), PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope6.getLayoutDirection()), (arrayList4.isEmpty() || (num2 = num) == null) ? paddingValuesAsPaddingValues.getBottom() : subcomposeMeasureScope6.mo345toDpu2uoSUM(num2.intValue())), composer3, Integer.valueOf((i12 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                long j6 = jM5226copyZbe2FdA$default;
                                ArrayList arrayList6 = new ArrayList(jj.a.Q0(listSubcompose5, 10));
                                Iterator<T> it11 = listSubcompose5.iterator();
                                while (it11.hasNext()) {
                                    arrayList6.add(((Measurable) it11.next()).mo4235measureBRTryo0(j6));
                                }
                                Iterator it12 = arrayList6.iterator();
                                while (it12.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it12.next(), 0, 0, 0.0f, 4, null);
                                    arrayList = arrayList;
                                    arrayList4 = arrayList4;
                                }
                                ArrayList arrayList7 = arrayList4;
                                Iterator it13 = arrayList.iterator();
                                while (it13.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it13.next(), 0, 0, 0.0f, 4, null);
                                }
                                int i13 = iM5235getMaxWidthimpl;
                                WindowInsets windowInsets6 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope7 = subcomposeMeasureScope;
                                int i14 = iM5234getMaxHeightimpl;
                                Iterator it14 = arrayList5.iterator();
                                while (it14.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it14.next(), windowInsets6.getLeft(subcomposeMeasureScope7, subcomposeMeasureScope7.getLayoutDirection()) + ((i13 - width3) / 2), i14 - iIntValue, 0.0f, 4, null);
                                }
                                int i15 = iM5234getMaxHeightimpl;
                                Iterator it15 = arrayList7.iterator();
                                while (it15.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it15.next(), 0, i15 - (numValueOf2 != null ? numValueOf2.intValue() : 0), 0.0f, 4, null);
                                }
                                if (fabPlacement != null) {
                                    int i16 = iM5234getMaxHeightimpl;
                                    for (Placeable placeable5 : arrayList3) {
                                        int left = fabPlacement.getLeft();
                                        m.e(numValueOf);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i16 - numValueOf.intValue(), 0.0f, 4, null);
                                    }
                                    j jVar = j.a;
                                }
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(pVar5);
                objRememberedValue = pVar5;
            } else {
                i4 = 0;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (p) objRememberedValue, composer2, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i9) {
                ScaffoldKt.m1460ScaffoldLayoutFMILGgc(i2, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
