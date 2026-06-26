package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00102\u001a\u00020)\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020706\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bP\u0010QJ\u001a\u0010\u0006\u001a\u00020\u0003*\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u0002*\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u0002*\u00020\rø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\rø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0014\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0015\u001a\u00020\u0002*\u00020\u0002J\u0017\u0010\u0015\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\bJ'\u0010\u001d\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\bJ!\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\rH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b'\u0010$J\u0006\u0010*\u001a\u00020)J\u000e\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020)R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00102\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010=\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020)0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u00105\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006R"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "(J)J", "singleAxisOffset", "toFloat-k-4lQ0M", "(J)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-TH1AsA0", "singleAxisVelocity-AH228Gc", "singleAxisVelocity", "newValue", "update-QWom1Mo", "(JF)J", "update", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "Landroidx/compose/foundation/gestures/ScrollScope;", "availableDelta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "dispatchScroll", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "initialVelocity", "Lkotlin/j;", "onDragStopped-sF-c-tU", "(JLdj/c;)Ljava/lang/Object;", "onDragStopped", "available", "doFlingAnimation-QWom1Mo", "doFlingAnimation", "", "shouldScrollImmediately", "isFlinging", "registerNestedFling", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "Z", "getReverseDirection", "()Z", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/runtime/MutableState;", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getShouldDispatchOverscroll", "shouldDispatchOverscroll", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ScrollingLogic {
    private final FlingBehavior flingBehavior;
    private final MutableState<Boolean> isNestedFlinging;
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState scrollableState;

    public ScrollingLogic(Orientation orientation, boolean z, State<NestedScrollDispatcher> state, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        m.h(orientation, "orientation");
        m.h(state, "nestedScrollDispatcher");
        m.h(scrollableState, "scrollableState");
        m.h(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = state;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
        this.isNestedFlinging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: renamed from: dispatchScroll-3eAAhYA, reason: not valid java name */
    public final long m360dispatchScroll3eAAhYA(final ScrollScope scrollScope, long j, final int i2) {
        m.h(scrollScope, "$this$dispatchScroll");
        long jM365singleAxisOffsetMKHz9U = m365singleAxisOffsetMKHz9U(j);
        l<Offset, Offset> lVar = new l<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Offset.m2574boximpl(m371invokeMKHz9U(((Offset) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
            public final long m371invokeMKHz9U(long j2) {
                NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
                long jM4029dispatchPreScrollOzD1aCk = value.m4029dispatchPreScrollOzD1aCk(j2, i2);
                long jM2589minusMKHz9U = Offset.m2589minusMKHz9U(j2, jM4029dispatchPreScrollOzD1aCk);
                ScrollingLogic scrollingLogic = this.this$0;
                long jM364reverseIfNeededMKHz9U = scrollingLogic.m364reverseIfNeededMKHz9U(scrollingLogic.m369toOffsettuRUvjQ(scrollScope.scrollBy(scrollingLogic.m368toFloatk4lQ0M(scrollingLogic.m364reverseIfNeededMKHz9U(jM2589minusMKHz9U)))));
                return Offset.m2590plusMKHz9U(Offset.m2590plusMKHz9U(jM4029dispatchPreScrollOzD1aCk, jM364reverseIfNeededMKHz9U), value.m4027dispatchPostScrollDzOQY0M(jM364reverseIfNeededMKHz9U, Offset.m2589minusMKHz9U(jM2589minusMKHz9U, jM364reverseIfNeededMKHz9U), i2));
            }
        };
        return (this.overscrollEffect == null || !getShouldDispatchOverscroll()) ? ((Offset) lVar.invoke(Offset.m2574boximpl(jM365singleAxisOffsetMKHz9U))).getPackedValue() : this.overscrollEffect.mo177applyToScrollRhakbz0(jM365singleAxisOffsetMKHz9U, i2, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m361doFlingAnimationQWom1Mo(long r13, dj.c<? super androidx.compose.ui.unit.Velocity> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r13 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref.LongRef) r13
            li.c.O(r15)
            goto L5b
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            li.c.O(r15)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            r15.element = r13
            androidx.compose.foundation.gestures.ScrollableState r1 = r12.scrollableState
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = androidx.compose.foundation.gestures.c.e(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5a
            return r0
        L5a:
            r13 = r15
        L5b:
            long r13 = r13.element
            androidx.compose.ui.unit.Velocity r13 = androidx.compose.ui.unit.Velocity.m5483boximpl(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m361doFlingAnimationQWom1Mo(long, dj.c):java.lang.Object");
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m362onDragStoppedsFctU(long r6, dj.c<? super kotlin.j> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            li.c.O(r8)
            goto L6f
        L37:
            li.c.O(r8)
            r5.registerNestedFling(r4)
            long r6 = r5.m366singleAxisVelocityAH228Gc(r6)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r8 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r8.<init>(r5, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            if (r2 == 0) goto L60
            boolean r2 = r5.getShouldDispatchOverscroll()
            if (r2 == 0) goto L60
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r2.mo176applyToFlingBMRW4eQ(r6, r8, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r6 = r5
            goto L6f
        L60:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m5483boximpl(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L6f:
            r7 = 0
            r6.registerNestedFling(r7)
            kotlin.j r6 = kotlin.j.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m362onDragStoppedsFctU(long, dj.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m363performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m2601getZeroF1C5BW0() : m369toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m368toFloatk4lQ0M(scroll)))));
    }

    public final void registerNestedFling(boolean z) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z));
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m364reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m2592timestuRUvjQ(j, -1.0f) : j;
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m365singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m2579copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m2579copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    public final long m366singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5488copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m5488copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m367toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5492getXimpl(j) : Velocity.m5493getYimpl(j);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m368toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m2585getXimpl(j) : Offset.m2586getYimpl(j);
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m369toOffsettuRUvjQ(float f) {
        return (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m370updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5488copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m5488copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }
}
