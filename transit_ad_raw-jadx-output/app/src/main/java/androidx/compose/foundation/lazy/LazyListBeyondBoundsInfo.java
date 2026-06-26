package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyListBeyondBoundsInfo.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "", "", "start", "end", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "addInterval", "interval", "Lkotlin/j;", "removeInterval", "", "hasIntervals", "Landroidx/compose/runtime/collection/MutableVector;", "beyondBoundsItems", "Landroidx/compose/runtime/collection/MutableVector;", "getStart", "()I", "getEnd", "<init>", "()V", "Interval", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListBeyondBoundsInfo {
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    /* JADX INFO: compiled from: LazyListBeyondBoundsInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "", "start", "", "end", "(II)V", "getEnd", "()I", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final /* data */ class Interval {
        private final int end;
        private final int start;

        public Interval(int i2, int i3) {
            this.start = i2;
            this.end = i3;
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i3 >= i2)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = interval.start;
            }
            if ((i4 & 2) != 0) {
                i3 = interval.end;
            }
            return interval.copy(i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final Interval copy(int start, int end) {
            return new Interval(start, end);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.start);
            sb.append(", end=");
            return android.support.v4.media.a.f(sb, this.end, ')');
        }
    }

    public final Interval addInterval(int start, int end) {
        Interval interval = new Interval(start, end);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                Interval interval = content[i2];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i2++;
            } while (i2 < size);
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                Interval interval = content[i2];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i2++;
            } while (i2 < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.isNotEmpty();
    }

    public final void removeInterval(Interval interval) {
        m.h(interval, "interval");
        this.beyondBoundsItems.remove(interval);
    }
}
