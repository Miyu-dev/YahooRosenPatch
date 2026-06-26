package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/util/Vector;", "", "", "i", "", "get", "value", "Lkotlin/j;", "set", "a", "times", "norm", "length", "I", "getLength", "()I", "", "elements", "[Ljava/lang/Float;", "getElements", "()[Ljava/lang/Float;", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class Vector {
    private final Float[] elements;
    private final int length;

    public Vector(int i2) {
        this.length = i2;
        Float[] fArr = new Float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = Float.valueOf(0.0f);
        }
        this.elements = fArr;
    }

    public final float get(int i2) {
        return this.elements[i2].floatValue();
    }

    public final Float[] getElements() {
        return this.elements;
    }

    public final int getLength() {
        return this.length;
    }

    public final float norm() {
        return (float) Math.sqrt(times(this));
    }

    public final void set(int i2, float f) {
        this.elements[i2] = Float.valueOf(f);
    }

    public final float times(Vector a2) {
        m.h(a2, "a");
        int i2 = this.length;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            f += get(i3) * a2.get(i3);
        }
        return f;
    }
}
