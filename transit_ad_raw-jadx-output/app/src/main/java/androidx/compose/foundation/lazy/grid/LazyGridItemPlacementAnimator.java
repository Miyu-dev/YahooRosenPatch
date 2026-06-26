package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import bk.f;
import dj.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.collections.i0;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\f¢\u0006\u0004\bA\u0010BJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0014\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J;\u0010#\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000eø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"J\u0006\u0010$\u001a\u00020\tR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000101j\b\u0012\u0004\u0012\u00020\u0001`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u001b\u0010=\u001a\u00020\u0004*\u00020\u000e8BX\u0082\u0004ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010@\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "createItemInfo", "itemInfo", "Lkotlin/j;", "startAnimationsIfNeeded", "mainAxisLayoutSize", "", "isWithinBounds", "Landroidx/compose/ui/unit/IntOffset;", "toOffset-Bjo55l4", "(I)J", "toOffset", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "onMeasured", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "getAnimatedOffset", "reset", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "Z", "", "keyToItemInfoMap", "Ljava/util/Map;", "", "keyToIndexMap", "firstVisibleIndex", "I", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "movingAwayToStartBound", "movingAwayToEndBound", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "getLine", "(Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;)I", "line", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    private Map<Object, Integer> keyToIndexMap;
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    private final LinkedHashSet<Object> movingAwayKeys;
    private final List<LazyGridMeasuredItem> movingAwayToEndBound;
    private final List<LazyGridMeasuredItem> movingAwayToStartBound;
    private final List<LazyGridPositionedItem> movingInFromEndBound;
    private final List<LazyGridPositionedItem> movingInFromStartBound;
    private final CoroutineScope scope;

    public LazyGridItemPlacementAnimator(CoroutineScope coroutineScope, boolean z) {
        m.h(coroutineScope, "scope");
        this.scope = coroutineScope;
        this.isVertical = z;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = a0.a;
        this.movingAwayKeys = new LinkedHashSet<>();
        this.movingInFromStartBound = new ArrayList();
        this.movingInFromEndBound = new ArrayList();
        this.movingAwayToStartBound = new ArrayList();
        this.movingAwayToEndBound = new ArrayList();
    }

    private final ItemInfo createItemInfo(LazyGridPositionedItem item, int mainAxisOffset) {
        ItemInfo itemInfo = new ItemInfo(item.getCrossAxisSize(), item.getCrossAxisOffset());
        long jM5381copyiSbpLlY$default = this.isVertical ? IntOffset.m5381copyiSbpLlY$default(item.getOffset(), 0, mainAxisOffset, 1, null) : IntOffset.m5381copyiSbpLlY$default(item.getOffset(), mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            itemInfo.getPlaceables().add(new PlaceableInfo(jM5381copyiSbpLlY$default, item.getMainAxisSize(i2), null));
        }
        return itemInfo;
    }

    public static /* synthetic */ ItemInfo createItemInfo$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridPositionedItem lazyGridPositionedItem, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = lazyGridItemPlacementAnimator.m626getMainAxisgyyYBs(lazyGridPositionedItem.getOffset());
        }
        return lazyGridItemPlacementAnimator.createItemInfo(lazyGridPositionedItem, i2);
    }

    private final int getLine(LazyGridPositionedItem lazyGridPositionedItem) {
        return this.isVertical ? lazyGridPositionedItem.getRow() : lazyGridPositionedItem.getColumn();
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m626getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m5386getYimpl(j) : IntOffset.m5385getXimpl(j);
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i2) {
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i3 = 0; i3 < size; i3++) {
            PlaceableInfo placeableInfo = placeables.get(i3);
            long jM669getTargetOffsetnOccac = placeableInfo.getTargetOffset();
            long jM614getNotAnimatableDeltanOccac = itemInfo.getNotAnimatableDelta();
            long jC = androidx.browser.browseractions.a.c(jM614getNotAnimatableDeltanOccac, IntOffset.m5386getYimpl(jM669getTargetOffsetnOccac), IntOffset.m5385getXimpl(jM614getNotAnimatableDeltanOccac) + IntOffset.m5385getXimpl(jM669getTargetOffsetnOccac));
            if (m626getMainAxisgyyYBs(jC) + placeableInfo.getMainAxisSize() > 0 && m626getMainAxisgyyYBs(jC) < i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem r18, androidx.compose.foundation.lazy.grid.ItemInfo r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem, androidx.compose.foundation.lazy.grid.ItemInfo):void");
    }

    /* JADX INFO: renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m627toOffsetBjo55l4(int i2) {
        boolean z = this.isVertical;
        int i3 = z ? 0 : i2;
        if (!z) {
            i2 = 0;
        }
        return IntOffsetKt.IntOffset(i3, i2);
    }

    /* JADX INFO: renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m628getAnimatedOffsetYT5a7pE(Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        m.h(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = placeableInfo.getAnimatedOffset().getValue().getPackedValue();
        long jM614getNotAnimatableDeltanOccac = itemInfo.getNotAnimatableDelta();
        long jC = androidx.browser.browseractions.a.c(jM614getNotAnimatableDeltanOccac, IntOffset.m5386getYimpl(packedValue), IntOffset.m5385getXimpl(jM614getNotAnimatableDeltanOccac) + IntOffset.m5385getXimpl(packedValue));
        long jM669getTargetOffsetnOccac = placeableInfo.getTargetOffset();
        long jM614getNotAnimatableDeltanOccac2 = itemInfo.getNotAnimatableDelta();
        long jC2 = androidx.browser.browseractions.a.c(jM614getNotAnimatableDeltanOccac2, IntOffset.m5386getYimpl(jM669getTargetOffsetnOccac), IntOffset.m5385getXimpl(jM614getNotAnimatableDeltanOccac2) + IntOffset.m5385getXimpl(jM669getTargetOffsetnOccac));
        if (placeableInfo.getInProgress() && ((m626getMainAxisgyyYBs(jC2) <= minOffset && m626getMainAxisgyyYBs(jC) < minOffset) || (m626getMainAxisgyyYBs(jC2) >= maxOffset && m626getMainAxisgyyYBs(jC) > maxOffset))) {
            BuildersKt.launch$default(this.scope, (e) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, (Object) null);
        }
        return jC;
    }

    public final void onMeasured(int i2, int i3, int i4, List<LazyGridPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        boolean z;
        boolean z2;
        int i5;
        m.h(list, "positionedItems");
        m.h(lazyMeasuredItemProvider, "itemProvider");
        m.h(lazyGridSpanLayoutProvider, "spanLayoutProvider");
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z = false;
                break;
            } else {
                if (list.get(i7).getHasAnimations()) {
                    z = true;
                    break;
                }
                i7++;
            }
        }
        if (!z && this.keyToItemInfoMap.isEmpty()) {
            reset();
            return;
        }
        int i8 = this.firstVisibleIndex;
        LazyGridPositionedItem lazyGridPositionedItem = (LazyGridPositionedItem) y.t1(list);
        this.firstVisibleIndex = lazyGridPositionedItem != null ? lazyGridPositionedItem.getIndex() : 0;
        final Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
        int i9 = this.isVertical ? i4 : i3;
        long jM627toOffsetBjo55l4 = m627toOffsetBjo55l4(i2);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = list.size();
        int i10 = 0;
        while (i6 < size2) {
            LazyGridPositionedItem lazyGridPositionedItem2 = list.get(i6);
            this.movingAwayKeys.remove(lazyGridPositionedItem2.getKey());
            if (lazyGridPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyGridPositionedItem2.getKey());
                    if (num == null || lazyGridPositionedItem2.getIndex() == num.intValue()) {
                        i5 = i8;
                        this.keyToItemInfoMap.put(lazyGridPositionedItem2.getKey(), createItemInfo$default(this, lazyGridPositionedItem2, i10, 2, null));
                    } else {
                        if (num.intValue() < i8) {
                            this.movingInFromStartBound.add(lazyGridPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyGridPositionedItem2);
                        }
                        i5 = i8;
                    }
                } else {
                    i5 = i8;
                    long jM614getNotAnimatableDeltanOccac = itemInfo.getNotAnimatableDelta();
                    itemInfo.m615setNotAnimatableDeltagyyYBs(androidx.browser.browseractions.a.c(jM627toOffsetBjo55l4, IntOffset.m5386getYimpl(jM614getNotAnimatableDeltanOccac), IntOffset.m5385getXimpl(jM627toOffsetBjo55l4) + IntOffset.m5385getXimpl(jM614getNotAnimatableDeltanOccac)));
                    itemInfo.setCrossAxisSize(lazyGridPositionedItem2.getCrossAxisSize());
                    itemInfo.setCrossAxisOffset(lazyGridPositionedItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyGridPositionedItem2, itemInfo);
                }
            } else {
                i5 = i8;
                this.keyToItemInfoMap.remove(lazyGridPositionedItem2.getKey());
            }
            i6++;
            i10 = 0;
            i8 = i5;
        }
        List<LazyGridPositionedItem> list2 = this.movingInFromStartBound;
        if (list2.size() > 1) {
            t.V0(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) map.get(((LazyGridPositionedItem) t2).getKey()), (Integer) map.get(((LazyGridPositionedItem) t).getKey()));
                }
            });
        }
        List<LazyGridPositionedItem> list3 = this.movingInFromStartBound;
        int size3 = list3.size();
        int i11 = -1;
        int mainAxisSize = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i13 < size3) {
            LazyGridPositionedItem lazyGridPositionedItem3 = list3.get(i13);
            int line = getLine(lazyGridPositionedItem3);
            if (line == i11 || line != i14) {
                i12 += mainAxisSize;
                mainAxisSize = lazyGridPositionedItem3.getMainAxisSize();
                i14 = line;
            } else {
                mainAxisSize = Math.max(mainAxisSize, lazyGridPositionedItem3.getMainAxisSize());
            }
            ItemInfo itemInfoCreateItemInfo = createItemInfo(lazyGridPositionedItem3, (0 - i12) - lazyGridPositionedItem3.getMainAxisSize());
            this.keyToItemInfoMap.put(lazyGridPositionedItem3.getKey(), itemInfoCreateItemInfo);
            startAnimationsIfNeeded(lazyGridPositionedItem3, itemInfoCreateItemInfo);
            i13++;
            i11 = -1;
        }
        List<LazyGridPositionedItem> list4 = this.movingInFromEndBound;
        if (list4.size() > 1) {
            t.V0(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) map.get(((LazyGridPositionedItem) t).getKey()), (Integer) map.get(((LazyGridPositionedItem) t2).getKey()));
                }
            });
        }
        List<LazyGridPositionedItem> list5 = this.movingInFromEndBound;
        int size4 = list5.size();
        int i15 = -1;
        int i16 = 0;
        int mainAxisSize2 = 0;
        for (int i17 = 0; i17 < size4; i17++) {
            LazyGridPositionedItem lazyGridPositionedItem4 = list5.get(i17);
            int line2 = getLine(lazyGridPositionedItem4);
            if (line2 == -1 || line2 != i15) {
                i16 += mainAxisSize2;
                mainAxisSize2 = lazyGridPositionedItem4.getMainAxisSize();
                i15 = line2;
            } else {
                mainAxisSize2 = Math.max(mainAxisSize2, lazyGridPositionedItem4.getMainAxisSize());
            }
            ItemInfo itemInfoCreateItemInfo2 = createItemInfo(lazyGridPositionedItem4, i9 + i16);
            this.keyToItemInfoMap.put(lazyGridPositionedItem4.getKey(), itemInfoCreateItemInfo2);
            startAnimationsIfNeeded(lazyGridPositionedItem4, itemInfoCreateItemInfo2);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) i0.L(obj, this.keyToItemInfoMap);
            Integer num2 = this.keyToIndexMap.get(obj);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size5 = placeables.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size5) {
                    z2 = false;
                    break;
                } else {
                    if (placeables.get(i18).getInProgress()) {
                        z2 = true;
                        break;
                    }
                    i18++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z2 && m.c(num2, map.get(obj))) || !(z2 || isWithinBounds(itemInfo2, i9)))) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyGridMeasuredItem lazyGridMeasuredItemM651getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m651getAndMeasureednRnyU$default(lazyMeasuredItemProvider, ItemIndex.m603constructorimpl(num2.intValue()), 0, this.isVertical ? Constraints.INSTANCE.m5245fixedWidthOenEA2s(itemInfo2.getCrossAxisSize()) : Constraints.INSTANCE.m5244fixedHeightOenEA2s(itemInfo2.getCrossAxisSize()), 2, null);
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyGridMeasuredItemM651getAndMeasureednRnyU$default);
                } else {
                    this.movingAwayToEndBound.add(lazyGridMeasuredItemM651getAndMeasureednRnyU$default);
                }
            }
        }
        List<LazyGridMeasuredItem> list6 = this.movingAwayToStartBound;
        if (list6.size() > 1) {
            t.V0(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t2).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t).getKey()));
                }
            });
        }
        List<LazyGridMeasuredItem> list7 = this.movingAwayToStartBound;
        int size6 = list7.size();
        int i19 = 0;
        int mainAxisSize3 = 0;
        int i20 = -1;
        for (int i21 = 0; i21 < size6; i21++) {
            LazyGridMeasuredItem lazyGridMeasuredItem = list7.get(i21);
            int iM648getLineIndexOfItem_Ze7BM = lazyGridSpanLayoutProvider.m648getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem.getIndex());
            if (iM648getLineIndexOfItem_Ze7BM == -1 || iM648getLineIndexOfItem_Ze7BM != i20) {
                i19 += mainAxisSize3;
                mainAxisSize3 = lazyGridMeasuredItem.getMainAxisSize();
                i20 = iM648getLineIndexOfItem_Ze7BM;
            } else {
                mainAxisSize3 = Math.max(mainAxisSize3, lazyGridMeasuredItem.getMainAxisSize());
            }
            int mainAxisSize4 = (0 - i19) - lazyGridMeasuredItem.getMainAxisSize();
            ItemInfo itemInfo3 = (ItemInfo) i0.L(lazyGridMeasuredItem.getKey(), this.keyToItemInfoMap);
            LazyGridPositionedItem lazyGridPositionedItemPosition = lazyGridMeasuredItem.position(mainAxisSize4, itemInfo3.getCrossAxisOffset(), i3, i4, -1, -1);
            list.add(lazyGridPositionedItemPosition);
            startAnimationsIfNeeded(lazyGridPositionedItemPosition, itemInfo3);
        }
        List<LazyGridMeasuredItem> list8 = this.movingAwayToEndBound;
        if (list8.size() > 1) {
            t.V0(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t2).getKey()));
                }
            });
        }
        List<LazyGridMeasuredItem> list9 = this.movingAwayToEndBound;
        int size7 = list9.size();
        int i22 = -1;
        int i23 = 0;
        int mainAxisSize5 = 0;
        for (int i24 = 0; i24 < size7; i24++) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = list9.get(i24);
            int iM648getLineIndexOfItem_Ze7BM2 = lazyGridSpanLayoutProvider.m648getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem2.getIndex());
            if (iM648getLineIndexOfItem_Ze7BM2 == -1 || iM648getLineIndexOfItem_Ze7BM2 != i22) {
                i23 += mainAxisSize5;
                mainAxisSize5 = lazyGridMeasuredItem2.getMainAxisSize();
                i22 = iM648getLineIndexOfItem_Ze7BM2;
            } else {
                mainAxisSize5 = Math.max(mainAxisSize5, lazyGridMeasuredItem2.getMainAxisSize());
            }
            ItemInfo itemInfo4 = (ItemInfo) i0.L(lazyGridMeasuredItem2.getKey(), this.keyToItemInfoMap);
            LazyGridPositionedItem lazyGridPositionedItemPosition2 = lazyGridMeasuredItem2.position(i9 + i23, itemInfo4.getCrossAxisOffset(), i3, i4, -1, -1);
            list.add(lazyGridPositionedItemPosition2);
            startAnimationsIfNeeded(lazyGridPositionedItemPosition2, itemInfo4);
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = a0.a;
        this.firstVisibleIndex = -1;
    }
}
