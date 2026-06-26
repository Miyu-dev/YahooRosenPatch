package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.ExperimentalComposeApi;
import dj.e;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Ldj/e$b;", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeApi
public interface SnapshotContextElement extends e.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: SnapshotContextElement.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r, p<? super R, ? super e.b, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) pVar.invoke(r, snapshotContextElement);
        }

        public static <E extends e.b> E get(SnapshotContextElement snapshotContextElement, e.c<E> cVar) {
            m.h(cVar, "key");
            return (E) e.b.a.a(snapshotContextElement, cVar);
        }

        public static e minusKey(SnapshotContextElement snapshotContextElement, e.c<?> cVar) {
            m.h(cVar, "key");
            return e.b.a.b(snapshotContextElement, cVar);
        }

        public static e plus(SnapshotContextElement snapshotContextElement, e eVar) {
            m.h(eVar, "context");
            return e.a.a(snapshotContextElement, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotContextElement$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SnapshotContextElement.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Ldj/e$c;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements e.c<SnapshotContextElement> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* synthetic */ <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar);

    /* synthetic */ <E extends e.b> E get(e.c<E> cVar);

    /* synthetic */ e.c<?> getKey();

    /* synthetic */ e minusKey(e.c<?> cVar);

    /* synthetic */ e plus(e eVar);
}
