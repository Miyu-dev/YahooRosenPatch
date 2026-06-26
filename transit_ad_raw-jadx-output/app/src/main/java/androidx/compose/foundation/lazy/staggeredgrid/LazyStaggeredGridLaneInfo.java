package androidx.compose.foundation.lazy.staggeredgrid;

import a.b;
import a.f;
import androidx.appcompat.R;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.collections.n;
import kotlin.collections.y;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "", "capacity", "newOffset", "Lkotlin/j;", "ensureCapacity", "itemIndex", "lane", "setLane", "getLane", "targetLane", "", "assignedToLane", "upperBound", "lowerBound", "reset", "findPreviousItemIndex", "findNextItemIndex", "requestedIndex", "ensureValidIndex", "", "gaps", "setGaps", "getGaps", "anchor", "I", "lanes", "[I", "Lkotlin/collections/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "spannedItems", "Lkotlin/collections/k;", "<init>", "()V", "Companion", "SpannedItem", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes = new int[16];
    private final k<SpannedItem> spannedItems = new k<>();

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "index", "", "gaps", "", "(I[I)V", "getGaps", "()[I", "setGaps", "([I)V", "getIndex", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i2, int[] iArr) {
            m.h(iArr, "gaps");
            this.index = i2;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            m.h(iArr, "<set-?>");
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i2, int i3) {
        if (!(i2 <= MaxCapacity)) {
            throw new IllegalArgumentException(b.e("Requested item capacity ", i2, " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.lanes;
        if (iArr.length < i2) {
            int length = iArr.length;
            while (length < i2) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            n.q0(this.lanes, iArr2, i3, 0, 12);
            this.lanes = iArr2;
        }
    }

    public static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i2, i3);
    }

    public final boolean assignedToLane(int itemIndex, int targetLane) {
        int lane = getLane(itemIndex);
        return lane == targetLane || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i2) {
        int i3 = this.anchor;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < MaxCapacity) {
            ensureCapacity$default(this, i4 + 1, 0, 2, null);
        } else {
            int iMax = Math.max(i2 - (this.lanes.length / 2), 0);
            this.anchor = iMax;
            int i5 = iMax - i3;
            if (i5 >= 0) {
                int[] iArr = this.lanes;
                if (i5 < iArr.length) {
                    n.l0(0, i5, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.lanes;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i5), this.lanes.length, 0);
            } else {
                int i6 = -i5;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i6 < MaxCapacity) {
                    ensureCapacity(iArr3.length + i6 + 1, i6);
                } else {
                    if (i6 < iArr3.length) {
                        n.l0(i6, 0, iArr3.length - i6, iArr3, iArr3);
                    }
                    int[] iArr4 = this.lanes;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i6), 0);
                }
            }
        }
        while (!this.spannedItems.isEmpty()) {
            k<SpannedItem> kVar = this.spannedItems;
            if (!kVar.isEmpty()) {
                if (((SpannedItem) kVar.b[kVar.a]).getIndex() >= getAnchor()) {
                    break;
                } else {
                    this.spannedItems.removeFirst();
                }
            } else {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
        }
        while (!this.spannedItems.isEmpty()) {
            k<SpannedItem> kVar2 = this.spannedItems;
            if (kVar2.isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            if (((SpannedItem) kVar2.b[kVar2.f(f.I(kVar2) + kVar2.a)]).getIndex() <= upperBound()) {
                return;
            } else {
                this.spannedItems.removeLast();
            }
        }
    }

    public final int findNextItemIndex(int itemIndex, int targetLane) {
        int iUpperBound = upperBound();
        for (int i2 = itemIndex + 1; i2 < iUpperBound; i2++) {
            if (assignedToLane(i2, targetLane)) {
                return i2;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int itemIndex, int targetLane) {
        do {
            itemIndex--;
            if (-1 >= itemIndex) {
                return -1;
            }
        } while (!assignedToLane(itemIndex, targetLane));
        return itemIndex;
    }

    public final int[] getGaps(int itemIndex) {
        k<SpannedItem> kVar = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(itemIndex);
        SpannedItem spannedItem = (SpannedItem) y.u1(f.n(kVar, 0, kVar.size(), new l<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem2) {
                return Integer.valueOf(bk.f.d(Integer.valueOf(spannedItem2.getIndex()), numValueOf));
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Object m702invoke(Object obj) {
                return invoke((LazyStaggeredGridLaneInfo.SpannedItem) obj);
            }
        }), this.spannedItems);
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int itemIndex) {
        if (itemIndex < getAnchor() || itemIndex >= upperBound()) {
            return -1;
        }
        return this.lanes[itemIndex - this.anchor] - 1;
    }

    /* JADX INFO: renamed from: lowerBound, reason: from getter */
    public final int getAnchor() {
        return this.anchor;
    }

    public final void reset() {
        n.w0(this.lanes, 0, 0, 6);
        this.spannedItems.clear();
    }

    public final void setGaps(int i2, int[] iArr) {
        k<SpannedItem> kVar = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(i2);
        int iN = f.n(kVar, 0, kVar.size(), new l<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
                return Integer.valueOf(bk.f.d(Integer.valueOf(spannedItem.getIndex()), numValueOf));
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Object m703invoke(Object obj) {
                return invoke((LazyStaggeredGridLaneInfo.SpannedItem) obj);
            }
        });
        if (iN < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(iN + 1), new SpannedItem(i2, iArr));
            return;
        }
        if (iArr == null) {
            this.spannedItems.remove(iN);
        } else {
            ((SpannedItem) this.spannedItems.get(iN)).setGaps(iArr);
        }
    }

    public final void setLane(int i2, int i3) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Negative lanes are not supported".toString());
        }
        ensureValidIndex(i2);
        this.lanes[i2 - this.anchor] = i3 + 1;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }
}
