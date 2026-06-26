package androidx.compose.ui.platform;

import androidx.appcompat.R;
import dj.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Ldj/e$b;", "R", "Lkotlin/Function1;", "Ldj/c;", "", "block", "onInfiniteOperation", "(Lkj/l;Ldj/c;)Ljava/lang/Object;", "Ldj/e$c;", "getKey", "()Ldj/e$c;", "key", "Key", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface InfiniteAnimationPolicy extends e.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, kj.p<? super R, ? super e.b, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) pVar.invoke(r, infiniteAnimationPolicy);
        }

        public static <E extends e.b> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, e.c<E> cVar) {
            kotlin.jvm.internal.m.h(cVar, "key");
            return (E) e.b.a.a(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        public static e.c<?> getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return k.a(infiniteAnimationPolicy);
        }

        public static dj.e minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, e.c<?> cVar) {
            kotlin.jvm.internal.m.h(cVar, "key");
            return e.b.a.b(infiniteAnimationPolicy, cVar);
        }

        public static dj.e plus(InfiniteAnimationPolicy infiniteAnimationPolicy, dj.e eVar) {
            kotlin.jvm.internal.m.h(eVar, "context");
            return e.a.a(infiniteAnimationPolicy, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Ldj/e$c;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements e.c<InfiniteAnimationPolicy> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* synthetic */ <R> R fold(R r, kj.p<? super R, ? super e.b, ? extends R> pVar);

    /* synthetic */ <E extends e.b> E get(e.c<E> cVar);

    e.c<?> getKey();

    /* synthetic */ dj.e minusKey(e.c<?> cVar);

    <R> Object onInfiniteOperation(kj.l<? super dj.c<? super R>, ? extends Object> lVar, dj.c<? super R> cVar);

    /* synthetic */ dj.e plus(dj.e eVar);
}
