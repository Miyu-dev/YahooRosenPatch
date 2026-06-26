package androidx.compose.foundation.pager;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import dj.c;
import dj.e;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import qj.b;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a¼\u0001\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a¼\u0001\u0010#\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a¸\u0001\u0010(\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a*\u0010+\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a&\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002\u001a#\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0011H\u0003¢\u0006\u0004\b6\u00107\u001a\u0017\u0010;\u001a\u00020\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0082\b\"\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>\"\u0014\u0010@\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, d2 = {"", "pageCount", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "", "key", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "pageContent", "HorizontalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkj/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "VerticalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkj/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Pager-wKDqQAw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/foundation/pager/PageSize;FLandroidx/compose/foundation/gestures/Orientation;ILandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkj/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "Pager", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateContentPaddings", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "isVertical", "pagerSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "ConsumeHorizontalFlingNestedScrollConnection", "Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "ConsumeVerticalFlingNestedScrollConnection", "DEBUG", "Z", "LowVelocityAnimationDefaultDuration", "I", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class PagerKt {
    private static final ConsumeAllFlingOnDirection ConsumeHorizontalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Horizontal);
    private static final ConsumeAllFlingOnDirection ConsumeVerticalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Vertical);
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: HorizontalPager-AlbwjTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m734HorizontalPagerAlbwjTQ(final int r36, androidx.compose.ui.Modifier r37, androidx.compose.foundation.pager.PagerState r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.ui.Alignment.Vertical r43, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, kj.l<? super java.lang.Integer, ? extends java.lang.Object> r47, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r48, final kj.q<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m734HorizontalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kj.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Pager-wKDqQAw, reason: not valid java name */
    public static final void m735PagerwKDqQAw(final Modifier modifier, final PagerState pagerState, final int i2, final PageSize pageSize, final float f, final Orientation orientation, final int i3, Alignment.Vertical vertical, Alignment.Horizontal horizontal, final PaddingValues paddingValues, final SnapFlingBehavior snapFlingBehavior, final boolean z, final boolean z2, final l<? super Integer, ? extends Object> lVar, final NestedScrollConnection nestedScrollConnection, final q<? super Integer, ? super Composer, ? super Integer, j> qVar, Composer composer, final int i4, final int i5, final int i6) {
        m.h(modifier, "modifier");
        m.h(pagerState, "state");
        m.h(pageSize, "pageSize");
        m.h(orientation, "orientation");
        m.h(paddingValues, "contentPadding");
        m.h(snapFlingBehavior, "flingBehavior");
        m.h(nestedScrollConnection, "pageNestedScrollConnection");
        m.h(qVar, "pageContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-765777783);
        Alignment.Vertical centerVertically = (i6 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
        Alignment.Horizontal centerHorizontally = (i6 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Alignment.INSTANCE.getCenterHorizontally() : horizontal;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-765777783, i4, i5, "androidx.compose.foundation.pager.Pager (Pager.kt:240)");
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(a.c("beyondBoundsPageCount should be greater than or equal to 0, you selected ", i3).toString());
        }
        final boolean z3 = orientation == Orientation.Vertical;
        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged = composerStartRestartGroup.changed(paddingValues) | composerStartRestartGroup.changed(orientation) | composerStartRestartGroup.changed(layoutDirection);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Dp.m5265boximpl(calculateContentPaddings(paddingValues, orientation, layoutDirection));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final float fM5281unboximpl = ((Dp) objRememberedValue).m5281unboximpl();
        int i7 = i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(snapFlingBehavior) | composerStartRestartGroup.changed(pagerState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objRememberedValue2;
        Dp dpM5265boximpl = Dp.m5265boximpl(f);
        Dp dpM5265boximpl2 = Dp.m5265boximpl(f);
        int i8 = (i4 >> 6) & 896;
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged3 = composerStartRestartGroup.changed(dpM5265boximpl2) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(pagerState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new PagerKt$Pager$2$1(density, pagerState, f, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(density, pagerState, dpM5265boximpl, (p) objRememberedValue3, composerStartRestartGroup, i8 | i7 | 4096);
        int i9 = (i4 >> 3) & 14;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(pagerState);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new PagerKt$Pager$3$1(pagerState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(pagerState, (p<? super CoroutineScope, ? super c<? super j>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i9 | 64);
        composerStartRestartGroup.startReplaceableGroup(1445594592);
        Modifier modifierPagerSemantics = z ? pagerSemantics(Modifier.INSTANCE, pagerState, z3, composerStartRestartGroup, i7 | 6) : Modifier.INSTANCE;
        composerStartRestartGroup.endReplaceableGroup();
        final Alignment.Horizontal horizontal2 = centerHorizontally;
        final Alignment.Vertical vertical2 = centerVertically;
        BoxWithConstraintsKt.BoxWithConstraints(modifier.then(modifierPagerSemantics), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1677736225, true, new q<BoxWithConstraintsScope, Composer, Integer, j>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return j.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r26, androidx.compose.runtime.Composer r27, int r28) {
                /*
                    Method dump skipped, instruction units count: 432
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$Pager$4.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
            }
        }), composerStartRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Alignment.Vertical vertical3 = centerVertically;
        final Alignment.Horizontal horizontal3 = centerHorizontally;
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i10) {
                PagerKt.m735PagerwKDqQAw(modifier, pagerState, i2, pageSize, f, orientation, i3, vertical3, horizontal3, paddingValues, snapFlingBehavior, z, z2, lVar, nestedScrollConnection, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final DecayAnimationSpec<Float> decayAnimationSpec) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt.SnapLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(Density density, float f) {
                int currentPage;
                LazyListItemInfo lazyListItemInfo;
                m.h(density, "<this>");
                int pageSpacing$foundation_release = pagerState.getPageSpacing$foundation_release() + pagerState.getPageSize$foundation_release();
                float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f);
                LazyListItemInfo firstVisiblePage$foundation_release = pagerState.getFirstVisiblePage$foundation_release();
                if (firstVisiblePage$foundation_release != null) {
                    currentPage = firstVisiblePage$foundation_release.getIndex();
                    if (f < 0.0f) {
                        currentPage++;
                    }
                } else {
                    currentPage = pagerState.getCurrentPage();
                }
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        lazyListItemInfo = null;
                        break;
                    }
                    lazyListItemInfo = visibleItemsInfo.get(i2);
                    if (lazyListItemInfo.getIndex() == currentPage) {
                        break;
                    }
                    i2++;
                }
                LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
                float f2 = ((currentPage * pageSpacing$foundation_release) + fCalculateTargetValue) / pageSpacing$foundation_release;
                int iAbs = Math.abs((a.l.i(pagerSnapDistance.calculateTargetPage(currentPage, a.l.i((int) (f > 0.0f ? Math.ceil(f2) : Math.floor(f2)), 0, pagerState.getPageCount$foundation_release()), f, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount$foundation_release()) - currentPage) * pageSpacing$foundation_release) - Math.abs(lazyListItemInfo2 != null ? lazyListItemInfo2.getOffset() : 0);
                int i3 = iAbs >= 0 ? iAbs : 0;
                return i3 == 0 ? i3 : i3 * Math.signum(f);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(Density density) {
                m.h(density, "<this>");
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (!(!layoutInfo.getVisibleItemsInfo().isEmpty())) {
                    return 0.0f;
                }
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int size2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    size2 += visibleItemsInfo.get(i2).getSize();
                }
                return size2 / layoutInfo.getVisibleItemsInfo().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public b<Float> calculateSnappingOffsetBounds(Density density) {
                m.h(density, "<this>");
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    float fCalculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i2), PagerStateKt.getSnapAlignmentStartToStart());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f) {
                        f = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return new qj.a(f, f2);
            }

            public final LazyListLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo$foundation_release();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: VerticalPager-AlbwjTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m736VerticalPagerAlbwjTQ(final int r36, androidx.compose.ui.Modifier r37, androidx.compose.foundation.pager.PagerState r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.ui.Alignment.Horizontal r43, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, kj.l<? super java.lang.Integer, ? extends java.lang.Object> r47, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r48, final kj.q<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m736VerticalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kj.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateContentPaddings(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        Orientation orientation2 = Orientation.Vertical;
        return Dp.m5267constructorimpl((orientation == orientation2 ? paddingValues.getTop() : paddingValues.mo442calculateLeftPaddingu2uoSUM(layoutDirection)) + (orientation == orientation2 ? paddingValues.getBottom() : paddingValues.mo443calculateRightPaddingu2uoSUM(layoutDirection)));
    }

    @Composable
    private static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z, Composer composer, int i2) {
        composer.startReplaceableGroup(1509835088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i2, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:738)");
        }
        Object objD = s.d(composer, 773894976, -492369756);
        if (objD == Composer.INSTANCE.getEmpty()) {
            objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                if (z) {
                    final PagerState pagerState2 = pagerState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new kj.a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Boolean m738invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState2, coroutineScope2));
                        }
                    }, 1, null);
                    final PagerState pagerState3 = pagerState;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new kj.a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Boolean m739invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState3, coroutineScope3));
                        }
                    }, 1, null);
                    return;
                }
                final PagerState pagerState4 = pagerState;
                final CoroutineScope coroutineScope4 = coroutineScope;
                SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new kj.a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m740invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState4, coroutineScope4));
                    }
                }, 1, null);
                final PagerState pagerState5 = pagerState;
                final CoroutineScope coroutineScope5 = coroutineScope;
                SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new kj.a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m741invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState5, coroutineScope5));
                    }
                }, 1, null);
            }
        }, 1, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, (Object) null);
        return true;
    }

    private static final void debugLog(kj.a<String> aVar) {
    }
}
