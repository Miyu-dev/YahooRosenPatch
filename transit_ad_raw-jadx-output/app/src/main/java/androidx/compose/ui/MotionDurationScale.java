package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import dj.e;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MotionDurationScale.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Ldj/e$b;", "", "getScaleFactor", "()F", "scaleFactor", "Ldj/e$c;", "getKey", "()Ldj/e$c;", "key", "Key", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface MotionDurationScale extends e.b {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r, p<? super R, ? super e.b, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) pVar.invoke(r, motionDurationScale);
        }

        public static <E extends e.b> E get(MotionDurationScale motionDurationScale, e.c<E> cVar) {
            m.h(cVar, "key");
            return (E) e.b.a.a(motionDurationScale, cVar);
        }

        public static e minusKey(MotionDurationScale motionDurationScale, e.c<?> cVar) {
            m.h(cVar, "key");
            return e.b.a.b(motionDurationScale, cVar);
        }

        public static e plus(MotionDurationScale motionDurationScale, e eVar) {
            m.h(eVar, "context");
            return e.a.a(motionDurationScale, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.MotionDurationScale$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Ldj/e$c;", "Landroidx/compose/ui/MotionDurationScale;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements e.c<MotionDurationScale> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* synthetic */ <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar);

    /* synthetic */ <E extends e.b> E get(e.c<E> cVar);

    e.c<?> getKey();

    float getScaleFactor();

    /* synthetic */ e minusKey(e.c<?> cVar);

    /* synthetic */ e plus(e eVar);
}
