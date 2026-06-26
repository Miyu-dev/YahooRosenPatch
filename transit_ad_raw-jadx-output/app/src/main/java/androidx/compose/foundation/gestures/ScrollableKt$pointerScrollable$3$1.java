package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
public final class ScrollableKt$pointerScrollable$3$1 extends SuspendLambda implements q<CoroutineScope, Velocity, dj.c<? super j>, Object> {
    final /* synthetic */ MutableState<NestedScrollDispatcher> $nestedScrollDispatcher;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;
    /* synthetic */ long J$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", l = {278}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ State<ScrollingLogic> $scrollLogic;
        final /* synthetic */ long $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State<ScrollingLogic> state, long j, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$scrollLogic = state;
            this.$velocity = j;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new AnonymousClass1(this.$scrollLogic, this.$velocity, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                ScrollingLogic value = this.$scrollLogic.getValue();
                long j = this.$velocity;
                this.label = 1;
                if (value.m362onDragStoppedsFctU(j, this) == coroutineSingletons) {
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
    public ScrollableKt$pointerScrollable$3$1(MutableState<NestedScrollDispatcher> mutableState, State<ScrollingLogic> state, dj.c<? super ScrollableKt$pointerScrollable$3$1> cVar) {
        super(3, cVar);
        this.$nestedScrollDispatcher = mutableState;
        this.$scrollLogic = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m355invokeLuvzFrg((CoroutineScope) obj, ((Velocity) obj2).getPackedValue(), (dj.c) obj3);
    }

    /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m355invokeLuvzFrg(CoroutineScope coroutineScope, long j, dj.c<? super j> cVar) {
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.$nestedScrollDispatcher, this.$scrollLogic, cVar);
        scrollableKt$pointerScrollable$3$1.J$0 = j;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        li.c.O(obj);
        BuildersKt.launch$default(this.$nestedScrollDispatcher.getValue().getCoroutineScope(), (dj.e) null, (CoroutineStart) null, new AnonymousClass1(this.$scrollLogic, this.J$0, null), 3, (Object) null);
        return j.a;
    }
}
