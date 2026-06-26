package androidx.compose.foundation.pager;

import a.f;
import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ej.c;
import java.util.List;
import java.util.ListIterator;
import kj.a;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u0000 }2\u00020\u0001:\u0001}B\u001b\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\b{\u0010|J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\f\u0010\"\u001a\u00020\u0002*\u00020\u0002H\u0002R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010*\"\u0004\b/\u00100R/\u00106\u001a\u0004\u0018\u00010\u001b2\b\u0010+\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u001eR+\u0010;\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010&\"\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010&R+\u0010F\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010&\"\u0004\bE\u0010:R+\u0010J\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010&\"\u0004\bI\u0010:R\u001b\u0010M\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010&R\u001b\u0010P\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bO\u0010&R\u001b\u0010S\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010*R\u0014\u0010U\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010&R\u0014\u0010Y\u001a\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010&R\u0016\u0010_\u001a\u0004\u0018\u00010\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010c\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010h\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010fR\u0014\u0010j\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010fR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\\0o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010&R\u0014\u0010v\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010*R\u0016\u0010x\u001a\u0004\u0018\u00010\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010^R\u0014\u0010z\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006~"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "page", "", "pageOffsetFraction", "Lkotlin/j;", "scrollToPage", "(IFLdj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Ldj/c;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "updateOnScrollStopped$foundation_release", "()V", "updateOnScrollStopped", "Landroidx/compose/foundation/lazy/LazyListState;", "newState", "loadNewState$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "loadNewState", "awaitScrollDependencies", "(Ldj/c;)Ljava/lang/Object;", "coerceInPageRange", "initialPage", "I", "getInitialPage", "()I", "initialPageOffsetFraction", "F", "getInitialPageOffsetFraction", "()F", "<set-?>", "snapRemainingScrollOffset$delegate", "Landroidx/compose/runtime/MutableState;", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset", "lazyListState$delegate", "getLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setLazyListState", "lazyListState", "pageSpacing$delegate", "getPageSpacing$foundation_release", "setPageSpacing$foundation_release", "(I)V", "pageSpacing", "Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "awaitLazyListStateSet", "Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "currentPage$delegate", "Landroidx/compose/runtime/State;", "getCurrentPage", "currentPage", "animationTargetPage$delegate", "getAnimationTargetPage", "setAnimationTargetPage", "animationTargetPage", "settledPageState$delegate", "getSettledPageState", "setSettledPageState", "settledPageState", "settledPage$delegate", "getSettledPage", "settledPage", "targetPage$delegate", "getTargetPage", "targetPage", "currentPageOffsetFraction$delegate", "getCurrentPageOffsetFraction", "currentPageOffsetFraction", "getPageSize$foundation_release", "pageSize", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "getPageCount$foundation_release", "pageCount", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getFirstVisiblePage$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "firstVisiblePage", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "isScrollInProgress", "()Z", "getCanScrollForward", "canScrollForward", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "", "getVisiblePages", "()Ljava/util/List;", "visiblePages", "getPageAvailableSpace", "pageAvailableSpace", "getPositionThresholdFraction", "positionThresholdFraction", "getClosestPageToSnappedPosition", "closestPageToSnappedPosition", "getDistanceToSnapPosition", "distanceToSnapPosition", "<init>", "(IF)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<PagerState, ?> Saver = ListSaverKt.listSaver(new p<SaverScope, PagerState, List<? extends Object>>() { // from class: androidx.compose.foundation.pager.PagerState$Companion$Saver$1
        public final List<Object> invoke(SaverScope saverScope, PagerState pagerState) {
            m.h(saverScope, "$this$listSaver");
            m.h(pagerState, "it");
            return f.V(Integer.valueOf(pagerState.getCurrentPage()), Float.valueOf(pagerState.getCurrentPageOffsetFraction()));
        }
    }, new l<List, PagerState>() { // from class: androidx.compose.foundation.pager.PagerState$Companion$Saver$2
        public final PagerState invoke(List<? extends Object> list) {
            m.h(list, "it");
            Object obj = list.get(0);
            m.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            m.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new PagerState(iIntValue, ((Float) obj2).floatValue());
        }
    });

    /* JADX INFO: renamed from: animationTargetPage$delegate, reason: from kotlin metadata */
    private final MutableState animationTargetPage;
    private final AwaitLazyListStateSet awaitLazyListStateSet;

    /* JADX INFO: renamed from: currentPage$delegate, reason: from kotlin metadata */
    private final State currentPage;

    /* JADX INFO: renamed from: currentPageOffsetFraction$delegate, reason: from kotlin metadata */
    private final State currentPageOffsetFraction;
    private final int initialPage;
    private final float initialPageOffsetFraction;

    /* JADX INFO: renamed from: lazyListState$delegate, reason: from kotlin metadata */
    private final MutableState lazyListState;

    /* JADX INFO: renamed from: pageSpacing$delegate, reason: from kotlin metadata */
    private final MutableState pageSpacing;

    /* JADX INFO: renamed from: settledPage$delegate, reason: from kotlin metadata */
    private final State settledPage;

    /* JADX INFO: renamed from: settledPageState$delegate, reason: from kotlin metadata */
    private final MutableState settledPageState;

    /* JADX INFO: renamed from: snapRemainingScrollOffset$delegate, reason: from kotlin metadata */
    private final MutableState snapRemainingScrollOffset;

    /* JADX INFO: renamed from: targetPage$delegate, reason: from kotlin metadata */
    private final State targetPage;

    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<PagerState, ?> getSaver() {
            return PagerState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @c(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {292, TypedValues.AttributesType.TYPE_EASING, 329}, m = "animateScrollToPage")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PagerState.kt */
    @c(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {334, 335}, m = "awaitScrollDependencies")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C02541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02541(dj.c<? super C02541> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.awaitScrollDependencies(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PagerState.kt */
    @c(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {263, 269}, m = "scrollToPage")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C02551 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02551(dj.c<? super C02551> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.scrollToPage(0, 0.0f, this);
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i2, float f, AnimationSpec animationSpec, dj.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if ((i3 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return pagerState.animateScrollToPage(i2, f, animationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitScrollDependencies(dj.c<? super kotlin.j> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerState.C02541
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = (androidx.compose.foundation.pager.PagerState.C02541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = new androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            li.c.O(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            li.c.O(r6)
            goto L4b
        L3a:
            li.c.O(r6)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r6 = r5.awaitLazyListStateSet
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.waitFinalLazyListSetting(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.getLazyListState()
            if (r6 == 0) goto L64
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r6 = r6.getAwaitLayoutModifier()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.waitForFirstLayout(r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            kotlin.j r6 = kotlin.j.a
            return r6
        L64:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.awaitScrollDependencies(dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i2) {
        if (getPageCount$foundation_release() > 0) {
            return a.l.i(i2, 0, getPageCount$foundation_release() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getAnimationTargetPage() {
        return ((Number) this.animationTargetPage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LazyListItemInfo getClosestPageToSnappedPosition() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        if (visiblePages.isEmpty()) {
            lazyListItemInfo = null;
        } else {
            LazyListItemInfo lazyListItemInfo2 = visiblePages.get(0);
            float f = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo2, PagerStateKt.getSnapAlignmentStartToStart()));
            int I = f.I(visiblePages);
            int i2 = 1;
            if (1 <= I) {
                while (true) {
                    LazyListItemInfo lazyListItemInfo3 = visiblePages.get(i2);
                    float f2 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo3, PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f, f2) < 0) {
                        lazyListItemInfo2 = lazyListItemInfo3;
                        f = f2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
            lazyListItemInfo = lazyListItemInfo2;
        }
        return lazyListItemInfo;
    }

    private final Density getDensity() {
        Density density$foundation_release;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (density$foundation_release = lazyListState.getDensity$foundation_release()) == null) ? PagerStateKt.UnitDensity : density$foundation_release;
    }

    private final float getDistanceToSnapPosition() {
        LazyListItemInfo closestPageToSnappedPosition = getClosestPageToSnappedPosition();
        if (closestPageToSnappedPosition != null) {
            return LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), closestPageToSnappedPosition, PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LazyListState getLazyListState() {
        return (LazyListState) this.lazyListState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSpacing$foundation_release() + getPageSize$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(getDensity().mo348toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getSettledPageState() {
        return ((Number) this.settledPageState.getValue()).intValue();
    }

    private final List<LazyListItemInfo> getVisiblePages() {
        return getLayoutInfo$foundation_release().getVisibleItemsInfo();
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i2, float f, dj.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i2, f, cVar);
    }

    private final void setAnimationTargetPage(int i2) {
        this.animationTargetPage.setValue(Integer.valueOf(i2));
    }

    private final void setLazyListState(LazyListState lazyListState) {
        this.lazyListState.setValue(lazyListState);
    }

    private final void setSettledPageState(int i2) {
        this.settledPageState.setValue(Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r18, float r19, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r20, dj.c<? super kotlin.j> r21) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, dj.c):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.dispatchRawDelta(delta);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollBackward();
        }
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollForward();
        }
        return true;
    }

    public final int getCurrentPage() {
        return ((Number) this.currentPage.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction.getValue()).floatValue();
    }

    public final LazyListItemInfo getFirstVisiblePage$foundation_release() {
        LazyListItemInfo lazyListItemInfoPrevious;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        ListIterator<LazyListItemInfo> listIterator = visiblePages.listIterator(visiblePages.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfoPrevious = null;
                break;
            }
            lazyListItemInfoPrevious = listIterator.previous();
            if (LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfoPrevious, PagerStateKt.getSnapAlignmentStartToStart()) <= 0.0f) {
                break;
            }
        }
        return lazyListItemInfoPrevious;
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    public final InteractionSource getInteractionSource() {
        InteractionSource interactionSource;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (interactionSource = lazyListState.getInteractionSource()) == null) ? PagerStateKt.EmptyInteractionSources : interactionSource;
    }

    public final LazyListLayoutInfo getLayoutInfo$foundation_release() {
        LazyListLayoutInfo layoutInfo;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (layoutInfo = lazyListState.getLayoutInfo()) == null) ? PagerStateKt.EmptyLayoutInfo : layoutInfo;
    }

    public final int getPageCount$foundation_release() {
        return getLayoutInfo$foundation_release().getTotalItemsCount();
    }

    public final int getPageSize$foundation_release() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) y.t1(getVisiblePages());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getSize();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getPageSpacing$foundation_release() {
        return ((Number) this.pageSpacing.getValue()).intValue();
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getSnapRemainingScrollOffset$foundation_release() {
        return ((Number) this.snapRemainingScrollOffset.getValue()).floatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.isScrollInProgress();
        }
        return false;
    }

    public final void loadNewState$foundation_release(LazyListState newState) {
        m.h(newState, "newState");
        setLazyListState(newState);
        this.awaitLazyListStateSet.onStateLoaded();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null) {
            return j.a;
        }
        Object objScroll = lazyListState.scroll(mutatePriority, pVar, cVar);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : j.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollToPage(int r11, float r12, dj.c<? super kotlin.j> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.pager.PagerState.C02551
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState.C02551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$scrollToPage$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            li.c.O(r13)
            goto L83
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            float r12 = r0.F$0
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            li.c.O(r13)
            goto L51
        L3e:
            li.c.O(r13)
            r0.L$0 = r10
            r0.I$0 = r11
            r0.F$0 = r12
            r0.label = r4
            java.lang.Object r13 = r10.awaitScrollDependencies(r0)
            if (r13 != r1) goto L50
            return r1
        L50:
            r2 = r10
        L51:
            double r5 = (double) r12
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r7 = 0
            if (r13 > 0) goto L60
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 > 0) goto L60
            goto L61
        L60:
            r4 = r7
        L61:
            if (r4 == 0) goto L92
            int r11 = r2.coerceInPageRange(r11)
            int r13 = r2.getPageAvailableSpace()
            float r13 = (float) r13
            float r13 = r13 * r12
            int r12 = a.f.f0(r13)
            androidx.compose.foundation.lazy.LazyListState r13 = r2.getLazyListState()
            if (r13 == 0) goto L86
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r13.scrollToItem(r11, r12, r0)
            if (r11 != r1) goto L83
            return r1
        L83:
            kotlin.j r11 = kotlin.j.a
            return r11
        L86:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L92:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "pageOffsetFraction "
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r12 = " is not within the range -0.5 to 0.5"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scrollToPage(int, float, dj.c):java.lang.Object");
    }

    public final void setPageSpacing$foundation_release(int i2) {
        this.pageSpacing.setValue(Integer.valueOf(i2));
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.snapRemainingScrollOffset.setValue(Float.valueOf(f));
    }

    public final void updateOnScrollStopped$foundation_release() {
        setSettledPageState(getCurrentPage());
    }

    public PagerState(int i2, float f) {
        this.initialPage = i2;
        this.initialPageOffsetFraction = f;
        double d = f;
        if (!(-0.5d <= d && d <= 0.5d)) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.snapRemainingScrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.lazyListState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.pageSpacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.awaitLazyListStateSet = new AwaitLazyListStateSet();
        this.currentPage = SnapshotStateKt.derivedStateOf(new a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$currentPage$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m742invoke() {
                LazyListItemInfo closestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
                return Integer.valueOf(closestPageToSnappedPosition != null ? closestPageToSnappedPosition.getIndex() : this.this$0.getInitialPage());
            }
        });
        this.animationTargetPage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        this.settledPageState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
        this.settledPage = SnapshotStateKt.derivedStateOf(new a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m744invoke() {
                int iCoerceInPageRange;
                if (this.this$0.getPageCount$foundation_release() == 0) {
                    iCoerceInPageRange = 0;
                } else {
                    PagerState pagerState = this.this$0;
                    iCoerceInPageRange = pagerState.coerceInPageRange(pagerState.getSettledPageState());
                }
                return Integer.valueOf(iCoerceInPageRange);
            }
        });
        this.targetPage = SnapshotStateKt.derivedStateOf(new a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m745invoke() {
                int currentPage;
                int iF0;
                int currentPage2;
                if (!this.this$0.isScrollInProgress()) {
                    currentPage2 = this.this$0.getCurrentPage();
                } else if (this.this$0.getAnimationTargetPage() != -1) {
                    currentPage2 = this.this$0.getAnimationTargetPage();
                } else {
                    if (!(this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f)) {
                        float snapRemainingScrollOffset$foundation_release = this.this$0.getSnapRemainingScrollOffset$foundation_release() / this.this$0.getPageAvailableSpace();
                        currentPage = this.this$0.getCurrentPage();
                        iF0 = f.f0(snapRemainingScrollOffset$foundation_release);
                    } else if (Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction())) {
                        iF0 = this.this$0.getCurrentPage();
                        currentPage = (int) Math.signum(this.this$0.getCurrentPageOffsetFraction());
                    } else {
                        currentPage2 = this.this$0.getCurrentPage();
                    }
                    currentPage2 = iF0 + currentPage;
                }
                return Integer.valueOf(this.this$0.coerceInPageRange(currentPage2));
            }
        });
        this.currentPageOffsetFraction = SnapshotStateKt.derivedStateOf(new a<Float>() { // from class: androidx.compose.foundation.pager.PagerState$currentPageOffsetFraction$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Float m743invoke() {
                LazyListItemInfo closestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
                int offset = closestPageToSnappedPosition != null ? closestPageToSnappedPosition.getOffset() : 0;
                float pageAvailableSpace = this.this$0.getPageAvailableSpace();
                return Float.valueOf(pageAvailableSpace == 0.0f ? this.this$0.getInitialPageOffsetFraction() : a.l.h((-offset) / pageAvailableSpace, -0.5f, 0.5f));
            }
        });
    }

    public /* synthetic */ PagerState(int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? 0.0f : f);
    }
}
