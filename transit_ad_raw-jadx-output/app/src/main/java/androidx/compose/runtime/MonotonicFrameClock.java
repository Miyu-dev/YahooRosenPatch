package androidx.compose.runtime;

import dj.e;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Ldj/e$b;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkj/l;Ldj/c;)Ljava/lang/Object;", "Ldj/e$c;", "getKey", "()Ldj/e$c;", "key", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0})
public interface MonotonicFrameClock extends e.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r, p<? super R, ? super e.b, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) pVar.invoke(r, monotonicFrameClock);
        }

        public static <E extends e.b> E get(MonotonicFrameClock monotonicFrameClock, e.c<E> cVar) {
            m.h(cVar, "key");
            return (E) e.b.a.a(monotonicFrameClock, cVar);
        }

        @Deprecated
        public static e.c<?> getKey(MonotonicFrameClock monotonicFrameClock) {
            return c.a(monotonicFrameClock);
        }

        public static e minusKey(MonotonicFrameClock monotonicFrameClock, e.c<?> cVar) {
            m.h(cVar, "key");
            return e.b.a.b(monotonicFrameClock, cVar);
        }

        public static e plus(MonotonicFrameClock monotonicFrameClock, e eVar) {
            m.h(eVar, "context");
            return e.a.a(monotonicFrameClock, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.MonotonicFrameClock$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Ldj/e$c;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements e.c<MonotonicFrameClock> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* synthetic */ <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar);

    /* synthetic */ <E extends e.b> E get(e.c<E> cVar);

    e.c<?> getKey();

    /* synthetic */ e minusKey(e.c<?> cVar);

    /* synthetic */ e plus(e eVar);

    <R> Object withFrameNanos(l<? super Long, ? extends R> lVar, dj.c<? super R> cVar);
}
