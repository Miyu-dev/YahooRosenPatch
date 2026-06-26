package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.concurrent.CancellationException;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1", f = "Transformable.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
public final class TransformableKt$transformable$2$block$1$1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
    final /* synthetic */ Channel<TransformEvent> $channel;
    final /* synthetic */ State<Boolean> $updatePanZoomLock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1", f = "Transformable.kt", l = {R.styleable.AppCompatTheme_ratingBarStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ PointerInputScope $$this$null;
        final /* synthetic */ Channel<TransformEvent> $channel;
        final /* synthetic */ State<Boolean> $updatePanZoomLock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Transformable.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1$1", f = "Transformable.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
        public static final class C00361 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Channel<TransformEvent> $channel;
            final /* synthetic */ State<Boolean> $updatePanZoomLock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00361(State<Boolean> state, Channel<TransformEvent> channel, CoroutineScope coroutineScope, dj.c<? super C00361> cVar) {
                super(2, cVar);
                this.$updatePanZoomLock = state;
                this.$channel = channel;
                this.$$this$coroutineScope = coroutineScope;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C00361 c00361 = new C00361(this.$updatePanZoomLock, this.$channel, this.$$this$coroutineScope, cVar);
                c00361.L$0 = obj;
                return c00361;
            }

            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    try {
                        if (i2 == 0) {
                            li.c.O(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            State<Boolean> state = this.$updatePanZoomLock;
                            Channel<TransformEvent> channel = this.$channel;
                            this.label = 1;
                            if (TransformableKt.detectZoom(awaitPointerEventScope, state, channel, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            li.c.O(obj);
                        }
                    } catch (CancellationException e) {
                        if (!CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                            throw e;
                        }
                    }
                    return j.a;
                } finally {
                    this.$channel.trySend-JP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, State<Boolean> state, Channel<TransformEvent> channel, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$null = pointerInputScope;
            this.$updatePanZoomLock = state;
            this.$channel = channel;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$null, this.$updatePanZoomLock, this.$channel, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$null;
                C00361 c00361 = new C00361(this.$updatePanZoomLock, this.$channel, coroutineScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00361, this) == coroutineSingletons) {
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
    public TransformableKt$transformable$2$block$1$1(State<Boolean> state, Channel<TransformEvent> channel, dj.c<? super TransformableKt$transformable$2$block$1$1> cVar) {
        super(2, cVar);
        this.$updatePanZoomLock = state;
        this.$channel = channel;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = new TransformableKt$transformable$2$block$1$1(this.$updatePanZoomLock, this.$channel, cVar);
        transformableKt$transformable$2$block$1$1.L$0 = obj;
        return transformableKt$transformable$2$block$1$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
        return create(pointerInputScope, cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$updatePanZoomLock, this.$channel, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
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
