package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import dj.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/MotionDurationScaleImpl;", "Landroidx/compose/ui/MotionDurationScale;", "()V", "<set-?>", "", "scaleFactor", "getScaleFactor", "()F", "setScaleFactor", "(F)V", "scaleFactor$delegate", "Landroidx/compose/runtime/MutableState;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
final class MotionDurationScaleImpl implements MotionDurationScale {

    /* JADX INFO: renamed from: scaleFactor$delegate, reason: from kotlin metadata */
    private final MutableState scaleFactor = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    @Override // androidx.compose.ui.MotionDurationScale
    public <R> R fold(R r, kj.p<? super R, ? super e.b, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, pVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public <E extends e.b> E get(e.c<E> cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public final /* synthetic */ e.c getKey() {
        return androidx.compose.ui.c.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return ((Number) this.scaleFactor.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public dj.e minusKey(e.c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public dj.e plus(dj.e eVar) {
        return MotionDurationScale.DefaultImpls.plus(this, eVar);
    }

    public void setScaleFactor(float f) {
        this.scaleFactor.setValue(Float.valueOf(f));
    }
}
