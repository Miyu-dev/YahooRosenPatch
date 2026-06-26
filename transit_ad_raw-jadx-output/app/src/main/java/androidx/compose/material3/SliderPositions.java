package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "other", "", "equals", "", "hashCode", "Lqj/b;", "", "<set-?>", "activeRange$delegate", "Landroidx/compose/runtime/MutableState;", "getActiveRange", "()Lqj/b;", "setActiveRange$material3_release", "(Lqj/b;)V", "activeRange", "", "tickFractions$delegate", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions", "initialActiveRange", "initialTickFractions", "<init>", "(Lqj/b;[F)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SliderPositions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: activeRange$delegate, reason: from kotlin metadata */
    private final MutableState activeRange;

    /* JADX INFO: renamed from: tickFractions$delegate, reason: from kotlin metadata */
    private final MutableState tickFractions;

    public SliderPositions() {
        this(null, null, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) other;
        return m.c(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final qj.b<Float> getActiveRange() {
        return (qj.b) this.activeRange.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions.getValue();
    }

    public int hashCode() {
        return Arrays.hashCode(getTickFractions()) + (getActiveRange().hashCode() * 31);
    }

    public final void setActiveRange$material3_release(qj.b<Float> bVar) {
        m.h(bVar, "<set-?>");
        this.activeRange.setValue(bVar);
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        m.h(fArr, "<set-?>");
        this.tickFractions.setValue(fArr);
    }

    public SliderPositions(qj.b bVar, float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new qj.a(0.0f, 1.0f) : bVar, (i2 & 2) != 0 ? new float[0] : fArr);
    }

    public SliderPositions(qj.b<Float> bVar, float[] fArr) {
        m.h(bVar, "initialActiveRange");
        m.h(fArr, "initialTickFractions");
        this.activeRange = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
        this.tickFractions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }
}
