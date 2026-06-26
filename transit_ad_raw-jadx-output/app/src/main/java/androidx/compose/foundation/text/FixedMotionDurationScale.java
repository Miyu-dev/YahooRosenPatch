package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.c;
import dj.e;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/FixedMotionDurationScale;", "Landroidx/compose/ui/MotionDurationScale;", "()V", "scaleFactor", "", "getScaleFactor", "()F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
final class FixedMotionDurationScale implements MotionDurationScale {
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, pVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public <E extends e.b> E get(e.c<E> cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public final /* synthetic */ e.c getKey() {
        return c.a(this);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public e minusKey(e.c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public e plus(e eVar) {
        return MotionDurationScale.DefaultImpls.plus(this, eVar);
    }
}
