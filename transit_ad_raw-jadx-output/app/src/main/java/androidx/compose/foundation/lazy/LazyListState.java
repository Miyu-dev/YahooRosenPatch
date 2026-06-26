package androidx.compose.foundation.lazy;

import a.f;
import androidx.appcompat.R;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import ej.c;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0094\u00012\u00020\u0001:\u0002\u0094\u0001B\u001e\u0012\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u0093\u0001\u0010\tJ%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0002R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020'008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u00109\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R+\u0010C\u001a\u00020=2\u0006\u00108\u001a\u00020=8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00102\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010F\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010GR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010LR/\u0010\\\u001a\u0004\u0018\u00010V2\b\u00108\u001a\u0004\u0018\u00010V8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bW\u00102\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010^\u001a\u00020]8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR/\u0010m\u001a\u0004\u0018\u00010g2\b\u00108\u001a\u0004\u0018\u00010g8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bh\u00102\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR4\u0010t\u001a\u00020n2\u0006\u00108\u001a\u00020n8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bo\u00102\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010v\u001a\u00020u8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR+\u0010}\u001a\u00020J2\u0006\u00108\u001a\u00020J8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bz\u00102\u001a\u0004\b{\u0010N\"\u0004\b|\u0010PR-\u0010\u0081\u0001\u001a\u00020J2\u0006\u00108\u001a\u00020J8V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b~\u00102\u001a\u0004\b\u007f\u0010N\"\u0005\b\u0080\u0001\u0010PR \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0013\u0010\u0088\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010IR\u0013\u0010\u008a\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010IR\u0014\u0010\u008d\u0001\u001a\u00020'8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0015\u0010\u0091\u0001\u001a\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0092\u0001\u001a\u00020J8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0095\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "index", "scrollOffset", "Lkotlin/j;", "scrollToItem", "(IILdj/c;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "(II)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Ldj/c;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "distance", "onScroll$foundation_release", "(F)F", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;)V", "updateScrollPositionIfTheFirstItemWasMoved", "notifyPrefetch", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "info", "cancelPrefetchIfVisibleItemsChanged", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<set-?>", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "Landroidx/compose/ui/unit/Density;", "density$delegate", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", "I", "getNumMeasurePasses$foundation_release", "()I", "", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator$delegate", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "setPlacementAnimator$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;)V", "placementAnimator", "Landroidx/compose/ui/unit/Constraints;", "premeasureConstraints$delegate", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(new p<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
            m.h(saverScope, "$this$listSaver");
            m.h(lazyListState, "it");
            return f.V(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
        }
    }, new l<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        public final LazyListState invoke(List<Integer> list) {
            m.h(list, "it");
            return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
        }
    });
    private final LazyListAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    /* JADX INFO: renamed from: density$delegate, reason: from kotlin metadata */
    private final MutableState density;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<LazyListLayoutInfo> layoutInfoState;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: placementAnimator$delegate, reason: from kotlin metadata */
    private final MutableState placementAnimator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: premeasureConstraints$delegate, reason: from kotlin metadata */
    private final MutableState premeasureConstraints;

    /* JADX INFO: renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final MutableState remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private boolean wasScrollingForward;

    /* JADX INFO: compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$scroll$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyListState.kt */
    @c(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {267, 268}, m = "scroll")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyListState.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$scrollToItem$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2, int i3, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$index = i2;
            this.$scrollOffset = i3;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return LazyListState.this.new AnonymousClass2(this.$index, this.$scrollOffset, cVar);
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
            LazyListState.this.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return j.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListState() {
        int i2 = 0;
        this(i2, i2, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i2, int i3, dj.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.animateScrollToItem(i2, i3, cVar);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.indexToPrefetch == -1 || !(!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((LazyListItemInfo) y.z1(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) y.r1(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    private final void notifyPrefetch(float f) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (this.prefetchingEnabled) {
            LazyListLayoutInfo layoutInfo = getLayoutInfo();
            if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                boolean z = f < 0.0f;
                int index = z ? ((LazyListItemInfo) y.z1(layoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) y.r1(layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
                if (index != this.indexToPrefetch) {
                    if (index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                        if (this.wasScrollingForward != z && (prefetchHandle = this.currentPrefetchHandle) != null) {
                            prefetchHandle.cancel();
                        }
                        this.wasScrollingForward = z;
                        this.indexToPrefetch = index;
                        this.currentPrefetchHandle = this.prefetchState.m679schedulePrefetch0kLqBqw(index, m585getPremeasureConstraintsmsEJaDk$foundation_release());
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i2, int i3, dj.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.scrollToItem(i2, i3, cVar);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    public final Object animateScrollToItem(int i2, int i3, dj.c<? super j> cVar) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i2, i3, cVar);
        return objAnimateScrollToItem == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateScrollToItem : j.a;
    }

    public final void applyMeasureResult$foundation_release(LazyListMeasureResult result) {
        m.h(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        LazyMeasuredItem firstVisibleItem = result.getFirstVisibleItem();
        setCanScrollBackward(((firstVisibleItem != null ? firstVisibleItem.getIndex() : 0) == 0 && result.getFirstVisibleItemScrollOffset() == 0) ? false : true);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    /* JADX INFO: renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
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

    public final Density getDensity$foundation_release() {
        return (Density) this.density.getValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.m582getIndexjQJCoq8();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* JADX INFO: renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LazyListItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyListItemPlacementAnimator) this.placementAnimator.getValue();
    }

    /* JADX INFO: renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m585getPremeasureConstraintsmsEJaDk$foundation_release() {
        return ((Constraints) this.premeasureConstraints.getValue()).getValue();
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    /* JADX INFO: renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float distance) {
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
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, kj.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super dj.c<? super kotlin.j>, ? extends java.lang.Object> r7, dj.c<? super kotlin.j> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            li.c.O(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kj.p r7 = (kj.p) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            li.c.O(r8)
            goto L58
        L43:
            li.c.O(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            kotlin.j r6 = kotlin.j.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, kj.p, dj.c):java.lang.Object");
    }

    public final Object scrollToItem(int i2, int i3, dj.c<? super j> cVar) {
        Object objE = androidx.compose.foundation.gestures.c.e(this, null, new AnonymousClass2(i2, i3, null), cVar, 1, null);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : j.a;
    }

    public final void setDensity$foundation_release(Density density) {
        m.h(density, "<set-?>");
        this.density.setValue(density);
    }

    public final void setPlacementAnimator$foundation_release(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyListItemPlacementAnimator);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    /* JADX INFO: renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m586setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.premeasureConstraints.setValue(Constraints.m5223boximpl(j));
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.scrollPosition.m583requestPositionAhXoVpI(DataIndex.m550constructorimpl(index), scrollOffset);
        LazyListItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyListItemProvider itemProvider) {
        m.h(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    public LazyListState(int i2, int i3) {
        this.scrollPosition = new LazyListScrollPosition(i2, i3);
        this.animateScrollScope = new LazyListAnimateScrollScope(this);
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyListLayoutInfo.INSTANCE, null, 2, null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.density = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DensityKt.Density(1.0f, 1.0f), null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f) {
                return Float.valueOf(-this.this$0.onScroll$foundation_release(-f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean all(l lVar) {
                return androidx.compose.ui.b.a(this, lVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean any(l lVar) {
                return androidx.compose.ui.b.b(this, lVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldIn(Object obj, p pVar) {
                return androidx.compose.ui.b.c(this, obj, pVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldOut(Object obj, p pVar) {
                return androidx.compose.ui.b.d(this, obj, pVar);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                m.h(remeasurement, "remeasurement");
                this.this$0.setRemeasurement(remeasurement);
            }

            @Override // androidx.compose.ui.Modifier
            public final /* synthetic */ Modifier then(Modifier modifier) {
                return androidx.compose.ui.a.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.placementAnimator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.premeasureConstraints = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Constraints.m5223boximpl(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null)), null, 2, null);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyListState(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
