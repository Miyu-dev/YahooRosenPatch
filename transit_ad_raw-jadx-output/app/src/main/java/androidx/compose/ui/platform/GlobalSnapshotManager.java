package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "Lkotlin/j;", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    /* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements kj.p<CoroutineScope, dj.c<? super kotlin.j>, Object> {
        final /* synthetic */ Channel<kotlin.j> $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Channel<kotlin.j> channel, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$channel = channel;
        }

        public final dj.c<kotlin.j> create(Object obj, dj.c<?> cVar) {
            return new AnonymousClass1(this.$channel, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:16:0x003f, B:18:0x0047), top: B:33:0x003f }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0039 -> B:33:0x003f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r3 = r6.L$0
                kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
                li.c.O(r7)     // Catch: java.lang.Throwable -> L61
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r6
                goto L3f
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                li.c.O(r7)
                kotlinx.coroutines.channels.Channel<kotlin.j> r3 = r6.$channel
                kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L61
                r1 = r7
                r7 = r6
            L2c:
                r7.L$0 = r3     // Catch: java.lang.Throwable -> L61
                r7.L$1 = r1     // Catch: java.lang.Throwable -> L61
                r7.label = r2     // Catch: java.lang.Throwable -> L61
                java.lang.Object r4 = r1.hasNext(r7)     // Catch: java.lang.Throwable -> L61
                if (r4 != r0) goto L39
                return r0
            L39:
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L3f:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L5e
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L5e
                if (r7 == 0) goto L57
                java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L5e
                kotlin.j r7 = (kotlin.j) r7     // Catch: java.lang.Throwable -> L5e
                androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L5e
                r7.sendApplyNotifications()     // Catch: java.lang.Throwable -> L5e
                r7 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2c
            L57:
                r7 = 0
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
                kotlin.j r7 = kotlin.j.a
                return r7
            L5e:
                r7 = move-exception
                r3 = r4
                goto L62
            L61:
                r7 = move-exception
            L62:
                throw r7     // Catch: java.lang.Throwable -> L63
            L63:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super kotlin.j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(kotlin.j.a);
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final Channel channelChannel$default = ChannelKt.Channel$default(-1, (BufferOverflow) null, (kj.l) null, 6, (Object) null);
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.INSTANCE.getMain()), (dj.e) null, (CoroutineStart) null, new AnonymousClass1(channelChannel$default, null), 3, (Object) null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new kj.l<Object, kotlin.j>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m4580invoke(obj);
                    return kotlin.j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4580invoke(Object obj) {
                    kotlin.jvm.internal.m.h(obj, "it");
                    channelChannel$default.trySend-JP2dKIU(kotlin.j.a);
                }
            });
        }
    }
}
