package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J?\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DragScope;", "", "pixels", "Lkotlin/j;", "dragBy", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Ldj/c;", "", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollLogic", "Landroidx/compose/runtime/State;", "getScrollLogic", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollScope;", "latestScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "getLatestScrollScope", "()Landroidx/compose/foundation/gestures/ScrollScope;", "setLatestScrollScope", "(Landroidx/compose/foundation/gestures/ScrollScope;)V", "<init>", "(Landroidx/compose/runtime/State;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ScrollDraggableState implements DraggableState, DragScope {
    private ScrollScope latestScrollScope;
    private final State<ScrollingLogic> scrollLogic;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollDraggableState$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {476}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
        final /* synthetic */ p<DragScope, dj.c<? super j>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super DragScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = ScrollDraggableState.this.new AnonymousClass2(this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(ScrollScope scrollScope, dj.c<? super j> cVar) {
            return create(scrollScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                ScrollDraggableState.this.setLatestScrollScope((ScrollScope) this.L$0);
                p<DragScope, dj.c<? super j>, Object> pVar = this.$block;
                ScrollDraggableState scrollDraggableState = ScrollDraggableState.this;
                this.label = 1;
                if (pVar.invoke(scrollDraggableState, this) == coroutineSingletons) {
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
    }

    public ScrollDraggableState(State<ScrollingLogic> state) {
        m.h(state, "scrollLogic");
        this.scrollLogic = state;
        this.latestScrollScope = ScrollableKt.NoOpScrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m363performRawScrollMKHz9U(value.m369toOffsettuRUvjQ(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, p<? super DragScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        Object objScroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new AnonymousClass2(pVar, null), cVar);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : j.a;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m360dispatchScroll3eAAhYA(this.latestScrollScope, value.m369toOffsettuRUvjQ(f), NestedScrollSource.INSTANCE.m4041getDragWNlRxjI());
    }

    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        m.h(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
