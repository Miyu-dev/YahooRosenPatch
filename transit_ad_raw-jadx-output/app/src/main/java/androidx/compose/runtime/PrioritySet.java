package androidx.compose.runtime;

import androidx.appcompat.widget.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "", "value", "Lkotlin/j;", "add", "", "isEmpty", "isNotEmpty", "peek", "takeMax", "validateHeap", "", "list", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PrioritySet {
    private final List<Integer> list;

    /* JADX WARN: Illegal instructions before constructor call */
    public PrioritySet() {
        List list = null;
        this(list, 1, list);
    }

    public final void add(int i2) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == i2) {
                return;
            }
            if (this.list.get(r0.size() - 1).intValue() == i2) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i2));
        while (size > 0) {
            int i3 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i3).intValue();
            if (i2 <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i3;
        }
        this.list.set(size, Integer.valueOf(i2));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) y.r1(this.list)).intValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final int takeMax() throws KotlinNothingValueException {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            throw s.k("Set is empty");
        }
        int iIntValue2 = this.list.get(0).intValue();
        while ((!this.list.isEmpty()) && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, (Integer) y.z1(list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i2 = 0;
            while (i2 < size2) {
                int iIntValue3 = this.list.get(i2).intValue();
                int i3 = (i2 + 1) * 2;
                int i4 = i3 - 1;
                int iIntValue4 = this.list.get(i4).intValue();
                if (i3 >= size || (iIntValue = this.list.get(i3).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.list.set(i2, Integer.valueOf(iIntValue4));
                        this.list.set(i4, Integer.valueOf(iIntValue3));
                        i2 = i4;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.list.set(i2, Integer.valueOf(iIntValue));
                    this.list.set(i3, Integer.valueOf(iIntValue3));
                    i2 = i3;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        int size = this.list.size();
        int i2 = size / 2;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int i5 = i4 * 2;
            boolean z = true;
            if (!(this.list.get(i3).intValue() >= this.list.get(i5 + (-1)).intValue())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (i5 < size && this.list.get(i3).intValue() < this.list.get(i5).intValue()) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i3 = i4;
        }
    }

    public PrioritySet(List<Integer> list) {
        m.h(list, "list");
        this.list = list;
    }

    public /* synthetic */ PrioritySet(List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list);
    }
}
