package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "itemIndex", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "getIntervalForIndex", "index", "Lkotlin/j;", "checkIndexBounds", "", "contains", "size", "value", "addInterval", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "forEach", "get", "Landroidx/compose/runtime/collection/MutableVector;", "intervals", "Landroidx/compose/runtime/collection/MutableVector;", "<set-?>", "I", "getSize", "()I", "lastInterval", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < getSize()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbG = androidx.appcompat.view.menu.a.g("Index ", i2, ", size ");
        sbG.append(getSize());
        throw new IndexOutOfBoundsException(sbG.toString());
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i2) {
        return i2 < interval.getSize() + interval.getStartIndex() && interval.getStartIndex() <= i2;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int itemIndex) {
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, itemIndex)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.getContent()[IntervalListKt.binarySearch(mutableVector, itemIndex)];
        this.lastInterval = interval2;
        return interval2;
    }

    public final void addInterval(int size, T value) {
        if (!(size >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.c("size should be >=0, but was ", size).toString());
        }
        if (size == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i2, int i3, l<? super IntervalList.Interval<? extends T>, j> lVar) {
        m.h(lVar, "block");
        checkIndexBounds(i2);
        checkIndexBounds(i3);
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("toIndex (" + i3 + ") should be not smaller than fromIndex (" + i2 + ')').toString());
        }
        int iBinarySearch = IntervalListKt.binarySearch(this.intervals, i2);
        int startIndex = this.intervals.getContent()[iBinarySearch].getStartIndex();
        while (startIndex <= i3) {
            IntervalList.Interval<T> interval = this.intervals.getContent()[iBinarySearch];
            lVar.invoke(interval);
            startIndex += interval.getSize();
            iBinarySearch++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int index) {
        checkIndexBounds(index);
        return getIntervalForIndex(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
