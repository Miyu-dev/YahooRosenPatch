package androidx.compose.material3;

import a.f;
import androidx.appcompat.widget.s;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import dj.e;
import java.util.Map;
import java.util.Set;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aþ\u0001\u0010\u001f\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010#\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0017H\u0007¢\u0006\u0004\b#\u0010$\u001a9\u0010)\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020%2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140\u00002\b\b\u0002\u0010(\u001a\u00020\u0014H\u0007¢\u0006\u0004\b)\u0010*\u001a\u008b\u0001\u00105\u001a\u00020\u00022\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u00032\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a¥\u0001\u0010=\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u00032\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u00032\u0006\u0010\n\u001a\u00020\t2\f\u00109\u001a\b\u0012\u0004\u0012\u00020-0\u00122\u0006\u0010:\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001aD\u0010B\u001a\b\u0012\u0004\u0012\u00020%0A2\u0006\u0010+\u001a\u00020 2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020>2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020\u0000H\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-6cEcpDs", "(Lkj/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FLandroidx/compose/ui/graphics/Shape;JJFFLkj/p;ZLkj/p;Lkj/q;JJLkj/q;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "rememberStandardBottomSheetState", "(Landroidx/compose/material3/SheetValue;Lkj/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "state", "peekHeight", "", "layoutHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-8oydGBM", "(Landroidx/compose/material3/SheetState;FZFLandroidx/compose/ui/graphics/Shape;JJFFLkj/p;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "StandardBottomSheet", "body", "", "bottomSheet", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-PxNyym8", "(Landroidx/compose/ui/Modifier;Lkj/p;Lkj/q;Lkj/q;Lkj/p;FLkj/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "Lkotlin/Function2;", "animateTo", "snapTo", "Landroidx/compose/material3/AnchorChangeHandler;", "BottomSheetScaffoldAnchorChangeHandler", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class BottomSheetScaffoldKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomSheetScaffold-6cEcpDs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1048BottomSheetScaffold6cEcpDs(final kj.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r31, androidx.compose.ui.Modifier r32, androidx.compose.material3.BottomSheetScaffoldState r33, float r34, androidx.compose.ui.graphics.Shape r35, long r36, long r38, float r40, float r41, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r42, boolean r43, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r44, kj.q<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r45, long r46, long r48, final kj.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m1048BottomSheetScaffold6cEcpDs(kj.q, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, androidx.compose.ui.graphics.Shape, long, long, float, float, kj.p, boolean, kj.p, kj.q, long, long, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    public static final AnchorChangeHandler<SheetValue> BottomSheetScaffoldAnchorChangeHandler(final SheetState sheetState, final p<? super SheetValue, ? super Float, j> pVar, final l<? super SheetValue, j> lVar) {
        return new AnchorChangeHandler<SheetValue>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.BottomSheetScaffoldAnchorChangeHandler.1

            /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1$WhenMappings */
            /* JADX INFO: compiled from: BottomSheetScaffold.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.compose.material3.AnchorChangeHandler
            public final void onAnchorsChanged(SheetValue sheetValue, Map<SheetValue, Float> map, Map<SheetValue, Float> map2) throws NoWhenBranchMatchedException {
                SheetValue sheetValue2;
                m.h(sheetValue, "previousTarget");
                m.h(map, "previousAnchors");
                m.h(map2, "newAnchors");
                Float f = map.get(sheetValue);
                int i2 = WhenMappings.$EnumSwitchMapping$0[sheetValue.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    sheetValue2 = SheetValue.PartiallyExpanded;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sheetValue2 = SheetValue.Expanded;
                    if (!map2.containsKey(sheetValue2)) {
                        sheetValue2 = SheetValue.PartiallyExpanded;
                    }
                }
                if (f != null && ((Number) i0.L(sheetValue2, map2)).floatValue() == f.floatValue()) {
                    return;
                }
                if (sheetState.getSwipeableState$material3_release().isAnimationRunning()) {
                    pVar.invoke(sheetValue2, Float.valueOf(sheetState.getSwipeableState$material3_release().getLastVelocity()));
                } else {
                    lVar.invoke(sheetValue2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]")
    /* JADX INFO: renamed from: BottomSheetScaffoldLayout-PxNyym8, reason: not valid java name */
    public static final void m1049BottomSheetScaffoldLayoutPxNyym8(final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar, final q<? super PaddingValues, ? super Composer, ? super Integer, j> qVar, final q<? super Integer, ? super Composer, ? super Integer, j> qVar2, final p<? super Composer, ? super Integer, j> pVar2, final float f, final kj.a<Float> aVar, final SheetState sheetState, final long j, final long j2, Composer composer, final int i2) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120561936);
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2 : i2;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(qVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(qVar2) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar2) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 67108864 : 33554432;
        }
        if ((i2 & 1879048192) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 536870912 : 268435456;
        }
        if ((i3 & 1533916891) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:316)");
            }
            Object[] objArr = {qVar2, aVar, pVar, modifier, Color.m2808boximpl(j), Color.m2808boximpl(j2), qVar, Dp.m5265boximpl(f), pVar2, sheetState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i4 = 0; i4 < 10; i4++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i4]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final int i5 = i3;
                composer2 = composerStartRestartGroup;
                p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar3 = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m1054invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1054invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j3) throws NoWhenBranchMatchedException {
                        Placeable placeableMo4235measureBRTryo0;
                        final int height;
                        m.h(subcomposeMeasureScope, "$this$SubcomposeLayout");
                        int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j3);
                        final int iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j3);
                        long jM5226copyZbe2FdA$default = Constraints.m5226copyZbe2FdA$default(j3, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final q<Integer, Composer, Integer, j> qVar3 = qVar2;
                        final int i6 = i5;
                        final Placeable placeableMo4235measureBRTryo02 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(-1192048628, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
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
                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1192048628, i7, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:333)");
                                }
                                qVar3.invoke(Integer.valueOf(iM5234getMaxHeightimpl), composer3, Integer.valueOf((i6 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })).get(0).mo4235measureBRTryo0(jM5226copyZbe2FdA$default);
                        final int iF0 = f.f0(((Number) aVar.invoke()).floatValue());
                        final int iMax = Math.max(0, (iM5235getMaxWidthimpl - placeableMo4235measureBRTryo02.getWidth()) / 2);
                        final p<Composer, Integer, j> pVar4 = pVar;
                        if (pVar4 != null) {
                            final int i7 = i5;
                            placeableMo4235measureBRTryo0 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(-873203005, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return j.a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-873203005, i8, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
                                    }
                                    pVar4.invoke(composer3, Integer.valueOf((i7 >> 3) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            })).get(0).mo4235measureBRTryo0(jM5226copyZbe2FdA$default);
                        } else {
                            placeableMo4235measureBRTryo0 = null;
                        }
                        final Placeable placeable = placeableMo4235measureBRTryo0;
                        int height2 = placeable != null ? placeable.getHeight() : 0;
                        long jM5226copyZbe2FdA$default2 = Constraints.m5226copyZbe2FdA$default(jM5226copyZbe2FdA$default, 0, 0, 0, iM5234getMaxHeightimpl - height2, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Modifier modifier2 = modifier;
                        final long j4 = j;
                        final long j5 = j2;
                        final int i8 = i5;
                        final q<PaddingValues, Composer, Integer, j> qVar4 = qVar;
                        final float f2 = f;
                        final Placeable placeableMo4235measureBRTryo03 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(-1459220575, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return j.a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1459220575, i9, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:346)");
                                }
                                Modifier modifier3 = modifier2;
                                long j6 = j4;
                                long j7 = j5;
                                final q<PaddingValues, Composer, Integer, j> qVar5 = qVar4;
                                final float f3 = f2;
                                final int i10 = i8;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1725620860, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return j.a;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1725620860, i11, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:351)");
                                        }
                                        qVar5.invoke(PaddingKt.m458PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f3, 7, null), composer4, Integer.valueOf((i10 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                int i11 = i8;
                                SurfaceKt.m1590SurfaceT9BRK9s(modifier3, null, j6, j7, 0.0f, 0.0f, null, composableLambda, composer3, (i11 & 14) | 12582912 | ((i11 >> 18) & 896) | ((i11 >> 18) & 7168), androidx.appcompat.R.styleable.AppCompatTheme_tooltipForegroundColor);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })).get(0).mo4235measureBRTryo0(jM5226copyZbe2FdA$default2);
                        final Placeable placeableMo4235measureBRTryo04 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, pVar2).get(0).mo4235measureBRTryo0(jM5226copyZbe2FdA$default);
                        final int width = (iM5235getMaxWidthimpl - placeableMo4235measureBRTryo04.getWidth()) / 2;
                        int i9 = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
                        if (i9 == 1) {
                            height = iF0 - placeableMo4235measureBRTryo04.getHeight();
                        } else {
                            if (i9 != 2 && i9 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            height = iM5234getMaxHeightimpl - placeableMo4235measureBRTryo04.getHeight();
                        }
                        final int i10 = height2;
                        return MeasureScope.CC.p(subcomposeMeasureScope, iM5235getMaxWidthimpl, iM5234getMaxHeightimpl, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
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
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo03, 0, i10, 0.0f, 4, null);
                                Placeable placeable2 = placeable;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo02, iMax, iF0, 0.0f, 4, null);
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo04, width, height, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(pVar3);
                objRememberedValue = pVar3;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (p) objRememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i6) {
                BottomSheetScaffoldKt.m1049BottomSheetScaffoldLayoutPxNyym8(modifier, pVar, qVar, qVar2, pVar2, f, aVar, sheetState, j, j2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: StandardBottomSheet-8oydGBM, reason: not valid java name */
    public static final void m1050StandardBottomSheet8oydGBM(final SheetState sheetState, final float f, final boolean z, final float f2, final Shape shape, final long j, final long j2, final float f3, final float f4, final p<? super Composer, ? super Integer, j> pVar, final q<? super ColumnScope, ? super Composer, ? super Integer, j> qVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-763942484);
        if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f4) ? 67108864 : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(qVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 1533916891) == 306783378 && (i5 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763942484, i4, i5, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:196)");
            }
            Object objD = s.d(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            final int i6 = i4;
            if (objD == companion.getEmpty()) {
                objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final float fMo348toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo348toPx0680j_4(f);
            final int i7 = i5;
            Orientation orientation = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(sheetState) | composerStartRestartGroup.changed(coroutineScope);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = BottomSheetScaffoldAnchorChangeHandler(sheetState, new p<SheetValue, Float, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1$1", f = "BottomSheetScaffold.kt", l = {220}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ SheetState $state;
                        final /* synthetic */ SheetValue $target;
                        final /* synthetic */ float $velocity;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(SheetState sheetState, SheetValue sheetValue, float f, dj.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$state = sheetState;
                            this.$target = sheetValue;
                            this.$velocity = f;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new AnonymousClass1(this.$state, this.$target, this.$velocity, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                li.c.O(obj);
                                SwipeableV2State<SheetValue> swipeableState$material3_release = this.$state.getSwipeableState$material3_release();
                                SheetValue sheetValue = this.$target;
                                float f = this.$velocity;
                                this.label = 1;
                                if (swipeableState$material3_release.animateTo(sheetValue, f, this) == coroutineSingletons) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((SheetValue) obj, ((Number) obj2).floatValue());
                        return j.a;
                    }

                    public final void invoke(SheetValue sheetValue, float f5) {
                        m.h(sheetValue, TypedValues.AttributesType.S_TARGET);
                        BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(sheetState, sheetValue, f5, null), 3, (Object) null);
                    }
                }, new l<SheetValue, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$2

                    /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$2$1", f = "BottomSheetScaffold.kt", l = {226}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ SheetState $state;
                        final /* synthetic */ SheetValue $target;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(SheetState sheetState, SheetValue sheetValue, dj.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$state = sheetState;
                            this.$target = sheetValue;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new AnonymousClass1(this.$state, this.$target, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                li.c.O(obj);
                                SwipeableV2State<SheetValue> swipeableState$material3_release = this.$state.getSwipeableState$material3_release();
                                SheetValue sheetValue = this.$target;
                                this.label = 1;
                                if (swipeableState$material3_release.snapTo(sheetValue, this) == coroutineSingletons) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SheetValue) obj);
                        return j.a;
                    }

                    public final void invoke(SheetValue sheetValue) {
                        m.h(sheetValue, TypedValues.AttributesType.S_TARGET);
                        BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(sheetState, sheetValue, null), 3, (Object) null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AnchorChangeHandler anchorChangeHandler = (AnchorChangeHandler) objRememberedValue;
            Modifier modifierM495requiredHeightInVpY3zN4$default = SizeKt.m495requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m511widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), f, 0.0f, 2, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release = sheetState.getSwipeableState$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(swipeableState$material3_release);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new l<Float, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$1", f = "BottomSheetScaffold.kt", l = {240}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(SheetState sheetState, float f, dj.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$state = sheetState;
                            this.$it = f;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new AnonymousClass1(this.$state, this.$it, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                li.c.O(obj);
                                SheetState sheetState = this.$state;
                                float f = this.$it;
                                this.label = 1;
                                if (sheetState.settle$material3_release(f, this) == coroutineSingletons) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return j.a;
                    }

                    public final void invoke(float f5) {
                        BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(sheetState, f5, null), 3, (Object) null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(NestedScrollModifierKt.nestedScroll$default(modifierM495requiredHeightInVpY3zN4$default, (NestedScrollConnection) objRememberedValue2, null, 2, null), sheetState.getSwipeableState$material3_release(), orientation, z, false, null, 24, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release2 = sheetState.getSwipeableState$material3_release();
            Set setL = cg.e.l(new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded});
            Float fValueOf = Float.valueOf(f2);
            Float fValueOf2 = Float.valueOf(fMo348toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged3 = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(sheetState) | composerStartRestartGroup.changed(fValueOf2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new p<SheetValue, IntSize, Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1

                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m1055invokeO0kMr_c((SheetValue) obj, ((IntSize) obj2).getPackedValue());
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                    public final Float m1055invokeO0kMr_c(SheetValue sheetValue, long j3) throws NoWhenBranchMatchedException {
                        m.h(sheetValue, "value");
                        int i8 = WhenMappings.$EnumSwitchMapping$0[sheetValue.ordinal()];
                        if (i8 == 1) {
                            if (sheetState.getSkipPartiallyExpanded()) {
                                return null;
                            }
                            return Float.valueOf(f2 - fMo348toPx0680j_4);
                        }
                        if (i8 == 2) {
                            if (IntSize.m5426getHeightimpl(j3) == f.f0(fMo348toPx0680j_4)) {
                                return null;
                            }
                            return Float.valueOf(Math.max(0.0f, f2 - IntSize.m5426getHeightimpl(j3)));
                        }
                        if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (sheetState.getSkipHiddenState()) {
                            return null;
                        }
                        return Float.valueOf(f2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i8 = i6 >> 9;
            SurfaceKt.m1590SurfaceT9BRK9s(SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material3_release2, setL, anchorChangeHandler, (p) objRememberedValue3), shape, j, j2, f3, f4, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1381492089, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i9) {
                    ColumnScopeInstance columnScopeInstance;
                    int i10;
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1381492089, i9, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:269)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    p<Composer, Integer, j> pVar2 = pVar;
                    q<ColumnScope, Composer, Integer, j> qVar2 = qVar;
                    int i11 = i7;
                    final SheetState sheetState2 = sheetState;
                    final boolean z2 = z;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    int i12 = i6;
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC = a.b.c(companion3, top, composer2, 0, -1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor = companion4.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer2);
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl, measurePolicyC, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-176229648);
                    if (pVar2 != null) {
                        Strings.Companion companion5 = Strings.INSTANCE;
                        final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(companion5.m1522getBottomSheetPartialExpandDescriptionadMyvUU(), composer2, 6);
                        final String strM1581getStringNWtq282 = Strings_androidKt.m1581getStringNWtq28(companion5.m1519getBottomSheetDismissDescriptionadMyvUU(), composer2, 6);
                        final String strM1581getStringNWtq283 = Strings_androidKt.m1581getStringNWtq28(companion5.m1521getBottomSheetExpandDescriptionadMyvUU(), composer2, 6);
                        Modifier modifierSemantics = SemanticsModifierKt.semantics(columnScopeInstance2.align(companion2, companion3.getCenterHorizontally()), true, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1
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
                                final SheetState sheetState3 = sheetState2;
                                boolean z3 = z2;
                                String str = strM1581getStringNWtq283;
                                String str2 = strM1581getStringNWtq28;
                                String str3 = strM1581getStringNWtq282;
                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                if (sheetState3.getSwipeableState$material3_release().getAnchors$material3_release().size() <= 1 || !z3) {
                                    return;
                                }
                                SheetValue currentValue = sheetState3.getCurrentValue();
                                SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                if (currentValue == sheetValue) {
                                    if (((Boolean) sheetState3.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded)).booleanValue()) {
                                        SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new kj.a<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1

                                            /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                                            @ej.c(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1", f = "BottomSheetScaffold.kt", l = {287}, m = "invokeSuspend")
                                            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(SheetState sheetState, dj.c<? super AnonymousClass1> cVar) {
                                                    super(2, cVar);
                                                    this.$this_with = sheetState;
                                                }

                                                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                                    return new AnonymousClass1(this.$this_with, cVar);
                                                }

                                                public final Object invokeSuspend(Object obj) {
                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    int i2 = this.label;
                                                    if (i2 == 0) {
                                                        li.c.O(obj);
                                                        SheetState sheetState = this.$this_with;
                                                        this.label = 1;
                                                        if (sheetState.expand(this) == coroutineSingletons) {
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

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                            public final Boolean m1056invoke() {
                                                BuildersKt.launch$default(coroutineScope3, (e) null, (CoroutineStart) null, new AnonymousClass1(sheetState3, null), 3, (Object) null);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                } else if (((Boolean) sheetState3.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue)).booleanValue()) {
                                    SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new kj.a<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$2

                                        /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$2$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                                        @ej.c(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$2$1", f = "BottomSheetScaffold.kt", l = {293}, m = "invokeSuspend")
                                        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                                            final /* synthetic */ SheetState $this_with;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(SheetState sheetState, dj.c<? super AnonymousClass1> cVar) {
                                                super(2, cVar);
                                                this.$this_with = sheetState;
                                            }

                                            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                                return new AnonymousClass1(this.$this_with, cVar);
                                            }

                                            public final Object invokeSuspend(Object obj) {
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                int i2 = this.label;
                                                if (i2 == 0) {
                                                    li.c.O(obj);
                                                    SheetState sheetState = this.$this_with;
                                                    this.label = 1;
                                                    if (sheetState.partialExpand(this) == coroutineSingletons) {
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

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                        public final Boolean m1057invoke() {
                                            BuildersKt.launch$default(coroutineScope3, (e) null, (CoroutineStart) null, new AnonymousClass1(sheetState3, null), 3, (Object) null);
                                            return Boolean.TRUE;
                                        }
                                    });
                                }
                                if (sheetState3.getSkipHiddenState()) {
                                    return;
                                }
                                SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new kj.a<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3

                                    /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                                    @ej.c(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3$1", f = "BottomSheetScaffold.kt", l = {299}, m = "invokeSuspend")
                                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                                        final /* synthetic */ SheetState $this_with;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(SheetState sheetState, dj.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$this_with = sheetState;
                                        }

                                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                            return new AnonymousClass1(this.$this_with, cVar);
                                        }

                                        public final Object invokeSuspend(Object obj) {
                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            int i2 = this.label;
                                            if (i2 == 0) {
                                                li.c.O(obj);
                                                SheetState sheetState = this.$this_with;
                                                this.label = 1;
                                                if (sheetState.hide(this) == coroutineSingletons) {
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

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                    public final Boolean m1058invoke() {
                                        BuildersKt.launch$default(coroutineScope3, (e) null, (CoroutineStart) null, new AnonymousClass1(sheetState3, null), 3, (Object) null);
                                        return Boolean.TRUE;
                                    }
                                });
                            }
                        });
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion3, false, composer2, 0, -1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        kj.a<ComposeUiNode> constructor2 = companion4.getConstructor();
                        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierSemantics);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer2);
                        columnScopeInstance = columnScopeInstance2;
                        i10 = 6;
                        androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        androidx.appcompat.view.menu.a.l((i12 >> 27) & 14, pVar2, composer2);
                    } else {
                        columnScopeInstance = columnScopeInstance2;
                        i10 = 6;
                    }
                    composer2.endReplaceableGroup();
                    qVar2.invoke(columnScopeInstance, composer2, Integer.valueOf(i10 | ((i11 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i9) {
                BottomSheetScaffoldKt.m1050StandardBottomSheet8oydGBM(sheetState, f, z, f2, shape, j, j2, f3, f4, pVar, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
            }
        });
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1474606134);
        if ((i3 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((i3 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i2, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:166)");
        }
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(sheetState) | composer.changed(snackbarHostState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, l<? super SheetValue, Boolean> lVar, boolean z, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(678511581);
        if ((i3 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i3 & 2) != 0) {
            lVar = new l<SheetValue, Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                public final Boolean invoke(SheetValue sheetValue3) {
                    m.h(sheetValue3, "it");
                    return Boolean.TRUE;
                }
            };
        }
        l<? super SheetValue, Boolean> lVar2 = lVar;
        if ((i3 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i2, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:188)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, lVar2, sheetValue2, z2, composer, (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i2 << 6) & 896) | ((i2 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetStateRememberSheetState;
    }
}
