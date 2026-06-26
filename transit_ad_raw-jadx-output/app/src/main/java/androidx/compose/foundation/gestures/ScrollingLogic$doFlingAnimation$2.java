package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {442}, m = "invokeSuspend")
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j, dj.c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, cVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invoke(ScrollScope scrollScope, dj.c<? super j> cVar) {
        return create(scrollScope, cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            final l<Offset, Offset> lVar = new l<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return Offset.m2574boximpl(m372invokeMKHz9U(((Offset) obj2).getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
                public final long m372invokeMKHz9U(long j2) {
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.m364reverseIfNeededMKHz9U(scrollingLogic4.m360dispatchScroll3eAAhYA(scrollScope, scrollingLogic4.m364reverseIfNeededMKHz9U(j2), NestedScrollSource.INSTANCE.m4042getFlingWNlRxjI()));
                }
            };
            final ScrollingLogic scrollingLogic4 = this.this$0;
            ScrollScope scrollScope2 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    ScrollingLogic scrollingLogic5 = scrollingLogic4;
                    return scrollingLogic5.m368toFloatk4lQ0M(((Offset) lVar.invoke(Offset.m2574boximpl(scrollingLogic5.m369toOffsettuRUvjQ(pixels)))).getPackedValue());
                }
            };
            scrollingLogic = this.this$0;
            Ref.LongRef longRef2 = this.$result;
            long j2 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.getFlingBehavior();
            long j3 = longRef2.element;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m367toFloatTH1AsA0(j2));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = longRef2;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope2, fReverseIfNeeded, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            longRef = longRef2;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            li.c.O(obj);
        }
        longRef.element = scrollingLogic.m370updateQWom1Mo(j, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return j.a;
    }
}
