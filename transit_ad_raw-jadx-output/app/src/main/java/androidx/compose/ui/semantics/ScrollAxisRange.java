package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "", "toString", "Lkotlin/Function0;", "", "value", "Lkj/a;", "getValue", "()Lkj/a;", "maxValue", "getMaxValue", "", "reverseScrolling", "Z", "getReverseScrolling", "()Z", "<init>", "(Lkj/a;Lkj/a;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final kj.a<Float> maxValue;
    private final boolean reverseScrolling;
    private final kj.a<Float> value;

    public ScrollAxisRange(kj.a<Float> aVar, kj.a<Float> aVar2, boolean z) {
        m.h(aVar, "value");
        m.h(aVar2, "maxValue");
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z;
    }

    public final kj.a<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final kj.a<Float> getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.value.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.maxValue.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return androidx.compose.animation.a.d(sb, this.reverseScrolling, ')');
    }

    public /* synthetic */ ScrollAxisRange(kj.a aVar, kj.a aVar2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i2 & 4) != 0 ? false : z);
    }
}
