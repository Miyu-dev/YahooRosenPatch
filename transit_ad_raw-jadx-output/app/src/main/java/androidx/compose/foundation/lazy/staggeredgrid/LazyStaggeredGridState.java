package androidx.compose.foundation.lazy.staggeredgrid;

import a.f;
import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import ej.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kj.a;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import qj.e;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ¥\u00012\u00020\u0001:\u0002¥\u0001B\u001d\b\u0002\u0012\u0007\u0010\u009e\u0001\u001a\u00020-\u0012\u0007\u0010\u009f\u0001\u001a\u00020-¢\u0006\u0006\b \u0001\u0010¡\u0001B!\b\u0016\u0012\t\b\u0002\u0010¢\u0001\u001a\u00020\f\u0012\t\b\u0002\u0010£\u0001\u001a\u00020\f¢\u0006\u0006\b \u0001\u0010¤\u0001J?\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0014\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010'\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0002J\u0018\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\fH\u0002R\u001b\u00103\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001a\u00108\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020(0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR+\u0010K\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010>\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010O\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010W\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\"\u0010[\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR\u001a\u0010`\u001a\u00020_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010f\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\"\u0010j\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u00102\"\u0004\bm\u0010nR\"\u0010o\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010\\\u001a\u0004\bp\u0010H\"\u0004\bq\u0010JR\"\u0010r\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010y\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010kR%\u0010\u0082\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0014\u0010\u0097\u0001\u001a\u00020(8F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010,\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u00102R\u0015\u0010\u009c\u0001\u001a\u00030\u0099\u00018F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009d\u0001\u001a\u00020D8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¦\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Ldj/c;", "Lkotlin/j;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "", "index", "scrollOffset", "scrollToItem", "(IILdj/c;)Ljava/lang/Object;", "animateScrollToItem", "snapToItemInternal$foundation_release", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "snapToItemInternal", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;)V", "updateScrollPositionIfTheFirstItemWasMoved", "", "delta", "dispatchRawDelta", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "applyMeasureResult", "distance", "onScroll", "notifyPrefetch", "", "prefetchHandlesUsed", "clearLeftoverPrefetchHandles", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "info", "cancelPrefetchIfVisibleItemsChanged", "itemIndex", "laneCount", "", "fillNearestIndices", "firstVisibleItemIndex$delegate", "Landroidx/compose/runtime/State;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "firstVisibleItemScrollOffset$delegate", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<set-?>", "canScrollForward$delegate", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "measurePassCount", "I", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "laneWidthsPrefixSum", "[I", "getLaneWidthsPrefixSum$foundation_release", "()[I", "setLaneWidthsPrefixSum$foundation_release", "([I)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentItemPrefetchHandles", "Ljava/util/Map;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "getLaneCount$foundation_release", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "<init>", "([I[I)V", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridState implements ScrollableState {
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;

    /* JADX INFO: renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private Density density;

    /* JADX INFO: renamed from: firstVisibleItemIndex$delegate, reason: from kotlin metadata */
    private final State firstVisibleItemIndex;

    /* JADX INFO: renamed from: firstVisibleItemScrollOffset$delegate, reason: from kotlin metadata */
    private final State firstVisibleItemScrollOffset;
    private boolean isVertical;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private int[] laneWidthsPrefixSum;
    private final MutableState<LazyStaggeredGridLayoutInfo> layoutInfoState;
    private int measurePassCount;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private LazyStaggeredGridSpanProvider spanProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new p<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        public final List<int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            m.h(saverScope, "$this$listSaver");
            m.h(lazyStaggeredGridState, "state");
            return f.V(lazyStaggeredGridState.getScrollPosition().getIndices(), lazyStaggeredGridState.getScrollPosition().getOffsets());
        }
    }, new l<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        public final LazyStaggeredGridState invoke(List<int[]> list) {
            m.h(list, "it");
            return new LazyStaggeredGridState(list.get(0), list.get(1), null);
        }
    });

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2, int i3, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$index = i2;
            this.$scrollOffset = i3;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = LazyStaggeredGridState.this.new AnonymousClass2(this.$index, this.$scrollOffset, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(ScrollScope scrollScope, dj.c<? super j> cVar) {
            return create(scrollScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release((ScrollScope) this.L$0, this.$index, this.$scrollOffset);
            return j.a;
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, dj.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i2, i3, cVar);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1) {
            if (!visibleItemsInfo.isEmpty()) {
                int index = ((LazyStaggeredGridItemInfo) y.r1(visibleItemsInfo)).getIndex();
                int index2 = ((LazyStaggeredGridItemInfo) y.z1(visibleItemsInfo)).getIndex();
                int i2 = this.prefetchBaseIndex;
                if (index <= i2 && i2 <= index2) {
                    return;
                }
                this.prefetchBaseIndex = -1;
                Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
                while (it.hasNext()) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                }
                this.currentItemPrefetchHandles.clear();
            }
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int itemIndex, int laneCount) {
        int[] iArr = new int[laneCount];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(itemIndex)) {
            n.w0(iArr, itemIndex, 0, 6);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(itemIndex + laneCount);
        int lane = this.laneInfo.getLane(itemIndex);
        int iMin = lane != -1 ? Math.min(lane, laneCount) : 0;
        int i2 = iMin - 1;
        int iFindPreviousItemIndex = itemIndex;
        while (true) {
            if (-1 >= i2) {
                break;
            }
            iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i2);
            iArr[i2] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                n.w0(iArr, -1, i2, 2);
                break;
            }
            i2--;
        }
        iArr[iMin] = itemIndex;
        for (int i3 = iMin + 1; i3 < laneCount; i3++) {
            itemIndex = this.laneInfo.findNextItemIndex(itemIndex, i3);
            iArr[i3] = itemIndex;
        }
        return iArr;
    }

    private final void notifyPrefetch(float f) {
        LazyStaggeredGridLayoutInfo value = this.layoutInfoState.getValue();
        if (!value.getVisibleItemsInfo().isEmpty()) {
            boolean z = f < 0.0f;
            int index = z ? ((LazyStaggeredGridItemInfo) y.z1(value.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridItemInfo) y.r1(value.getVisibleItemsInfo())).getIndex();
            if (index == this.prefetchBaseIndex) {
                return;
            }
            this.prefetchBaseIndex = index;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = this.laneWidthsPrefixSum.length;
            for (int i2 = 0; i2 < length; i2++) {
                index = z ? this.laneInfo.findNextItemIndex(index, i2) : this.laneInfo.findPreviousItemIndex(index, i2);
                if (!(index >= 0 && index < value.getTotalItemsCount()) || linkedHashSet.contains(Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(index));
                if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                    LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                    boolean z2 = lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index);
                    int i3 = z2 ? 0 : i2;
                    int laneCount$foundation_release = z2 ? getLaneCount$foundation_release() : 1;
                    int[] iArr = this.laneWidthsPrefixSum;
                    int i4 = iArr[(laneCount$foundation_release + i3) - 1] - (i3 == 0 ? 0 : iArr[i3 - 1]);
                    this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m679schedulePrefetch0kLqBqw(index, this.isVertical ? Constraints.INSTANCE.m5245fixedWidthOenEA2s(i4) : Constraints.INSTANCE.m5244fixedHeightOenEA2s(i4)));
                }
            }
            clearLeftoverPrefetchHandles(linkedHashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float distance) {
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.scrollToBeConsumed;
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            if (this.prefetchingEnabled) {
                notifyPrefetch(f2 - this.scrollToBeConsumed);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, dj.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i2, i3, cVar);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    public final Object animateScrollToItem(int i2, int i3, dj.c<? super j> cVar) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i2, i3, cVar);
        return objAnimateScrollToItem == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateScrollToItem : j.a;
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult result) {
        m.h(result, "result");
        this.scrollToBeConsumed -= result.getConsumedScroll();
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.layoutInfoState.setValue(result);
        cancelPrefetchIfVisibleItemsChanged(result);
        this.scrollPosition.updateFromMeasureResult(result);
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return ((Number) this.firstVisibleItemIndex.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.firstVisibleItemScrollOffset.getValue()).intValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        return this.laneWidthsPrefixSum.length;
    }

    /* JADX INFO: renamed from: getLaneInfo$foundation_release, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* JADX INFO: renamed from: getLaneWidthsPrefixSum$foundation_release, reason: from getter */
    public final int[] getLaneWidthsPrefixSum() {
        return this.laneWidthsPrefixSum;
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: getMeasurePassCount$foundation_release, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    /* JADX INFO: renamed from: getMutableInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* JADX INFO: renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* JADX INFO: renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* JADX INFO: renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX INFO: renamed from: getSpanProvider$foundation_release, reason: from getter */
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX INFO: renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, pVar, cVar);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : j.a;
    }

    public final Object scrollToItem(int i2, int i3, dj.c<? super j> cVar) {
        Object objE = androidx.compose.foundation.gestures.c.e(this, null, new AnonymousClass2(i2, i3, null), cVar, 1, null);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : j.a;
    }

    public final void setDensity$foundation_release(Density density) {
        m.h(density, "<set-?>");
        this.density = density;
    }

    public final void setLaneWidthsPrefixSum$foundation_release(int[] iArr) {
        m.h(iArr, "<set-?>");
        this.laneWidthsPrefixSum = iArr;
    }

    public final void setMeasurePassCount$foundation_release(int i2) {
        this.measurePassCount = i2;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void setSpanProvider$foundation_release(LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical = z;
    }

    public final void snapToItemInternal$foundation_release(ScrollScope scrollScope, int i2, int i3) {
        m.h(scrollScope, "<this>");
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i2);
        if (lazyStaggeredGridItemInfoFindVisibleItem != null) {
            boolean z = this.isVertical;
            long offset = lazyStaggeredGridItemInfoFindVisibleItem.getOffset();
            scrollScope.scrollBy((z ? IntOffset.m5386getYimpl(offset) : IntOffset.m5385getXimpl(offset)) + i3);
        } else {
            this.scrollPosition.requestPosition(i2, i3);
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider itemProvider) {
        m.h(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.firstVisibleItemIndex = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$firstVisibleItemIndex$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m717invoke() {
                Integer num;
                int[] indices = this.this$0.getScrollPosition().getIndices();
                if (indices.length == 0) {
                    num = null;
                } else {
                    int i2 = indices[0];
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    e eVarD = new qj.f(1, indices.length - 1).d();
                    while (eVarD.c) {
                        int i3 = indices[eVarD.nextInt()];
                        if (i3 == -1) {
                            i3 = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(i3);
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                }
                return Integer.valueOf(num != null ? num.intValue() : 0);
            }
        });
        this.firstVisibleItemScrollOffset = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$firstVisibleItemScrollOffset$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m718invoke() {
                int[] offsets = this.this$0.getScrollPosition().getOffsets();
                LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
                int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
                int[] indices = lazyStaggeredGridState.getScrollPosition().getIndices();
                int length = offsets.length;
                int iMin = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < length; i2++) {
                    if (indices[i2] == firstVisibleItemIndex) {
                        iMin = Math.min(iMin, offsets[i2]);
                    }
                }
                return Integer.valueOf(iMin != Integer.MAX_VALUE ? iMin : 0);
            }
        });
        this.scrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, null, 2, null);
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean all(l lVar) {
                return b.a(this, lVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean any(l lVar) {
                return b.b(this, lVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldIn(Object obj, p pVar) {
                return b.c(this, obj, pVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldOut(Object obj, p pVar) {
                return b.d(this, obj, pVar);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                m.h(remeasurement, "remeasurement");
                this.this$0.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public final /* synthetic */ Modifier then(Modifier modifier) {
                return androidx.compose.ui.a.a(this, modifier);
            }
        };
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f) {
                return Float.valueOf(-this.this$0.onScroll(-f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        });
        this.laneWidthsPrefixSum = new int[0];
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
    }

    public /* synthetic */ LazyStaggeredGridState(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public LazyStaggeredGridState(int i2, int i3) {
        this(new int[]{i2}, new int[]{i3});
    }
}
