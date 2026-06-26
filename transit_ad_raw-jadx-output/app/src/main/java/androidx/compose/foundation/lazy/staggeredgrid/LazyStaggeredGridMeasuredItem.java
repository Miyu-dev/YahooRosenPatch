package androidx.compose.foundation.lazy.staggeredgrid;

import a.f;
import androidx.appcompat.R;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ&\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "index", "", "key", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", "span", "(ILjava/lang/Object;Ljava/util/List;ZIII)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "isVisible", "setVisible", "(Z)V", "getKey", "()Ljava/lang/Object;", "getLane", "mainAxisSize", "getMainAxisSize", "getPlaceables", "()Ljava/util/List;", "sizeWithSpacings", "getSizeWithSpacings", "getSpacing", "getSpan", "position", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "mainAxis", "crossAxis", "mainAxisLayoutSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
final class LazyStaggeredGridMeasuredItem {
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private final int mainAxisSize;
    private final List<Placeable> placeables;
    private final int sizeWithSpacings;
    private final int spacing;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i2, Object obj, List<? extends Placeable> list, boolean z, int i3, int i4, int i5) {
        Integer num;
        m.h(obj, "key");
        m.h(list, "placeables");
        this.index = i2;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.spacing = i3;
        this.lane = i4;
        this.span = i5;
        int i6 = 1;
        this.isVisible = true;
        Integer numValueOf = 0;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            numValueOf = Integer.valueOf(numValueOf.intValue() + (this.isVertical ? placeable.getHeight() : placeable.getWidth()));
        }
        int iIntValue = numValueOf.intValue();
        this.mainAxisSize = iIntValue;
        int i8 = iIntValue + this.spacing;
        this.sizeWithSpacings = i8 < 0 ? 0 : i8;
        List<Placeable> list2 = this.placeables;
        if (list2.isEmpty()) {
            num = null;
        } else {
            Placeable placeable2 = list2.get(0);
            Integer numValueOf2 = Integer.valueOf(this.isVertical ? placeable2.getWidth() : placeable2.getHeight());
            int I = f.I(list2);
            if (1 <= I) {
                while (true) {
                    Placeable placeable3 = list2.get(i6);
                    Integer numValueOf3 = Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
                    numValueOf2 = numValueOf3.compareTo(numValueOf2) > 0 ? numValueOf3 : numValueOf2;
                    if (i6 == I) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            num = numValueOf2;
        }
        Integer num2 = num;
        this.crossAxisSize = num2 != null ? num2.intValue() : 0;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final LazyStaggeredGridPositionedItem position(int lane, int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        return new LazyStaggeredGridPositionedItem(this.isVertical ? IntOffsetKt.IntOffset(crossAxis, mainAxis) : IntOffsetKt.IntOffset(mainAxis, crossAxis), this.index, lane, this.key, this.isVertical ? IntSizeKt.IntSize(this.crossAxisSize, this.sizeWithSpacings) : IntSizeKt.IntSize(this.sizeWithSpacings, this.crossAxisSize), this.placeables, this.isVertical, mainAxisLayoutSize, null);
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }
}
