package androidx.compose.foundation.lazy;

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

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020\f¢\u0006\u0004\b<\u0010=J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0014\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J;\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\"\u001a\u00020\tR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00010/j\b\u0012\u0004\u0012\u00020\u0001`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u001b\u0010;\u001a\u00020\u0004*\u00020\u000e8BX\u0082\u0004ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/ItemInfo;", "createItemInfo", "itemInfo", "Lkotlin/j;", "startAnimationsIfNeeded", "mainAxisLayoutSize", "", "isWithinBounds", "Landroidx/compose/ui/unit/IntOffset;", "toOffset-Bjo55l4", "(I)J", "toOffset", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "onMeasured", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "getAnimatedOffset", "reset", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "Z", "", "keyToItemInfoMap", "Ljava/util/Map;", "", "keyToIndexMap", "firstVisibleIndex", "I", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "movingAwayToStartBound", "movingAwayToEndBound", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    private Map<Object, Integer> keyToIndexMap;
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    private final LinkedHashSet<Object> movingAwayKeys;
    private final List<LazyMeasuredItem> movingAwayToEndBound;
    private final List<LazyMeasuredItem> movingAwayToStartBound;
    private final List<LazyListPositionedItem> movingInFromEndBound;
    private final List<LazyListPositionedItem> movingInFromStartBound;
    private final CoroutineScope scope;

    public LazyListItemPlacementAnimator(CoroutineScope coroutineScope, boolean z) {
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

    private final ItemInfo createItemInfo(LazyListPositionedItem item, int mainAxisOffset) {
        ItemInfo itemInfo = new ItemInfo();
        long jM580getOffsetBjo55l4 = item.m580getOffsetBjo55l4(0);
        long jM5381copyiSbpLlY$default = this.isVertical ? IntOffset.m5381copyiSbpLlY$default(jM580getOffsetBjo55l4, 0, mainAxisOffset, 1, null) : IntOffset.m5381copyiSbpLlY$default(jM580getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            long jM580getOffsetBjo55l42 = item.m580getOffsetBjo55l4(i2);
            long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM580getOffsetBjo55l42) - IntOffset.m5385getXimpl(jM580getOffsetBjo55l4), IntOffset.m5386getYimpl(jM580getOffsetBjo55l42) - IntOffset.m5386getYimpl(jM580getOffsetBjo55l4));
            itemInfo.getPlaceables().add(new PlaceableInfo(androidx.browser.browseractions.a.c(jIntOffset, IntOffset.m5386getYimpl(jM5381copyiSbpLlY$default), IntOffset.m5385getXimpl(jIntOffset) + IntOffset.m5385getXimpl(jM5381copyiSbpLlY$default)), item.getMainAxisSize(i2), null));
        }
        return itemInfo;
    }

    public static /* synthetic */ ItemInfo createItemInfo$default(LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListPositionedItem lazyListPositionedItem, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = lazyListItemPlacementAnimator.m566getMainAxisgyyYBs(lazyListPositionedItem.m580getOffsetBjo55l4(0));
        }
        return lazyListItemPlacementAnimator.createItemInfo(lazyListPositionedItem, i2);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m566getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m5386getYimpl(j) : IntOffset.m5385getXimpl(j);
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i2) {
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i3 = 0; i3 < size; i3++) {
            PlaceableInfo placeableInfo = placeables.get(i3);
            long targetOffset = placeableInfo.getTargetOffset();
            long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
            long jC = androidx.browser.browseractions.a.c(notAnimatableDelta, IntOffset.m5386getYimpl(targetOffset), IntOffset.m5385getXimpl(notAnimatableDelta) + IntOffset.m5385getXimpl(targetOffset));
            if (m566getMainAxisgyyYBs(jC) + placeableInfo.getMainAxisSize() > 0 && m566getMainAxisgyyYBs(jC) < i2) {
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
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem r18, androidx.compose.foundation.lazy.ItemInfo r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem, androidx.compose.foundation.lazy.ItemInfo):void");
    }

    /* JADX INFO: renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m567toOffsetBjo55l4(int i2) {
        boolean z = this.isVertical;
        int i3 = z ? 0 : i2;
        if (!z) {
            i2 = 0;
        }
        return IntOffsetKt.IntOffset(i3, i2);
    }

    /* JADX INFO: renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m568getAnimatedOffsetYT5a7pE(Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        m.h(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = placeableInfo.getAnimatedOffset().getValue().getPackedValue();
        long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
        long jC = androidx.browser.browseractions.a.c(notAnimatableDelta, IntOffset.m5386getYimpl(packedValue), IntOffset.m5385getXimpl(notAnimatableDelta) + IntOffset.m5385getXimpl(packedValue));
        long targetOffset = placeableInfo.getTargetOffset();
        long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
        long jC2 = androidx.browser.browseractions.a.c(notAnimatableDelta2, IntOffset.m5386getYimpl(targetOffset), IntOffset.m5385getXimpl(notAnimatableDelta2) + IntOffset.m5385getXimpl(targetOffset));
        if (placeableInfo.getInProgress() && ((m566getMainAxisgyyYBs(jC2) <= minOffset && m566getMainAxisgyyYBs(jC) <= minOffset) || (m566getMainAxisgyyYBs(jC2) >= maxOffset && m566getMainAxisgyyYBs(jC) >= maxOffset))) {
            BuildersKt.launch$default(this.scope, (e) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, (Object) null);
        }
        return jC;
    }

    public final void onMeasured(int i2, int i3, int i4, List<LazyListPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        m.h(list, "positionedItems");
        m.h(lazyMeasuredItemProvider, "itemProvider");
        int size = list.size();
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
        LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) y.t1(list);
        this.firstVisibleIndex = lazyListPositionedItem != null ? lazyListPositionedItem.getIndex() : 0;
        final Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
        int i9 = this.isVertical ? i4 : i3;
        long jM567toOffsetBjo55l4 = m567toOffsetBjo55l4(i2);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = list.size();
        int i10 = 0;
        while (i10 < size2) {
            LazyListPositionedItem lazyListPositionedItem2 = list.get(i10);
            this.movingAwayKeys.remove(lazyListPositionedItem2.getKey());
            if (lazyListPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyListPositionedItem2.getKey());
                    if (num == null || lazyListPositionedItem2.getIndex() == num.intValue()) {
                        i5 = i8;
                        i6 = size2;
                        this.keyToItemInfoMap.put(lazyListPositionedItem2.getKey(), createItemInfo$default(this, lazyListPositionedItem2, 0, 2, null));
                    } else {
                        if (num.intValue() < i8) {
                            this.movingInFromStartBound.add(lazyListPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyListPositionedItem2);
                        }
                        i5 = i8;
                        i6 = size2;
                    }
                } else {
                    i5 = i8;
                    i6 = size2;
                    long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
                    itemInfo.m563setNotAnimatableDeltagyyYBs(androidx.browser.browseractions.a.c(jM567toOffsetBjo55l4, IntOffset.m5386getYimpl(notAnimatableDelta), IntOffset.m5385getXimpl(jM567toOffsetBjo55l4) + IntOffset.m5385getXimpl(notAnimatableDelta)));
                    startAnimationsIfNeeded(lazyListPositionedItem2, itemInfo);
                }
            } else {
                i5 = i8;
                i6 = size2;
                this.keyToItemInfoMap.remove(lazyListPositionedItem2.getKey());
            }
            i10++;
            size2 = i6;
            i8 = i5;
        }
        List<LazyListPositionedItem> list2 = this.movingInFromStartBound;
        if (list2.size() > 1) {
            t.V0(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) map.get(((LazyListPositionedItem) t2).getKey()), (Integer) map.get(((LazyListPositionedItem) t).getKey()));
                }
            });
        }
        List<LazyListPositionedItem> list3 = this.movingInFromStartBound;
        int size3 = list3.size();
        int size4 = 0;
        for (int i11 = 0; i11 < size3; i11++) {
            LazyListPositionedItem lazyListPositionedItem3 = list3.get(i11);
            int size5 = (0 - size4) - lazyListPositionedItem3.getSize();
            size4 += lazyListPositionedItem3.getSize();
            ItemInfo itemInfoCreateItemInfo = createItemInfo(lazyListPositionedItem3, size5);
            this.keyToItemInfoMap.put(lazyListPositionedItem3.getKey(), itemInfoCreateItemInfo);
            startAnimationsIfNeeded(lazyListPositionedItem3, itemInfoCreateItemInfo);
        }
        List<LazyListPositionedItem> list4 = this.movingInFromEndBound;
        if (list4.size() > 1) {
            t.V0(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) map.get(((LazyListPositionedItem) t).getKey()), (Integer) map.get(((LazyListPositionedItem) t2).getKey()));
                }
            });
        }
        List<LazyListPositionedItem> list5 = this.movingInFromEndBound;
        int size6 = list5.size();
        int size7 = 0;
        for (int i12 = 0; i12 < size6; i12++) {
            LazyListPositionedItem lazyListPositionedItem4 = list5.get(i12);
            int i13 = i9 + size7;
            size7 += lazyListPositionedItem4.getSize();
            ItemInfo itemInfoCreateItemInfo2 = createItemInfo(lazyListPositionedItem4, i13);
            this.keyToItemInfoMap.put(lazyListPositionedItem4.getKey(), itemInfoCreateItemInfo2);
            startAnimationsIfNeeded(lazyListPositionedItem4, itemInfoCreateItemInfo2);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) i0.L(obj, this.keyToItemInfoMap);
            Integer num2 = this.keyToIndexMap.get(obj);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size8 = placeables.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size8) {
                    z2 = false;
                    break;
                } else {
                    if (placeables.get(i14).getInProgress()) {
                        z2 = true;
                        break;
                    }
                    i14++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z2 && m.c(num2, map.get(obj))) || !(z2 || isWithinBounds(itemInfo2, i9)))) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyMeasuredItem lazyMeasuredItemM588getAndMeasureZjPyQlc = lazyMeasuredItemProvider.m588getAndMeasureZjPyQlc(DataIndex.m550constructorimpl(num2.intValue()));
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyMeasuredItemM588getAndMeasureZjPyQlc);
                } else {
                    this.movingAwayToEndBound.add(lazyMeasuredItemM588getAndMeasureZjPyQlc);
                }
            }
        }
        List<LazyMeasuredItem> list6 = this.movingAwayToStartBound;
        if (list6.size() > 1) {
            t.V0(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t2).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t).getKey()));
                }
            });
        }
        List<LazyMeasuredItem> list7 = this.movingAwayToStartBound;
        int size9 = list7.size();
        int size10 = 0;
        for (int i15 = 0; i15 < size9; i15++) {
            LazyMeasuredItem lazyMeasuredItem = list7.get(i15);
            int size11 = (0 - size10) - lazyMeasuredItem.getSize();
            size10 += lazyMeasuredItem.getSize();
            ItemInfo itemInfo3 = (ItemInfo) i0.L(lazyMeasuredItem.getKey(), this.keyToItemInfoMap);
            LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItem.position(size11, i3, i4);
            list.add(lazyListPositionedItemPosition);
            startAnimationsIfNeeded(lazyListPositionedItemPosition, itemInfo3);
        }
        List<LazyMeasuredItem> list8 = this.movingAwayToEndBound;
        if (list8.size() > 1) {
            t.V0(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f.d((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t2).getKey()));
                }
            });
        }
        List<LazyMeasuredItem> list9 = this.movingAwayToEndBound;
        int size12 = list9.size();
        int size13 = 0;
        for (int i16 = 0; i16 < size12; i16++) {
            LazyMeasuredItem lazyMeasuredItem2 = list9.get(i16);
            int i17 = i9 + size13;
            size13 += lazyMeasuredItem2.getSize();
            ItemInfo itemInfo4 = (ItemInfo) i0.L(lazyMeasuredItem2.getKey(), this.keyToItemInfoMap);
            LazyListPositionedItem lazyListPositionedItemPosition2 = lazyMeasuredItem2.position(i17, i3, i4);
            list.add(lazyListPositionedItemPosition2);
            startAnimationsIfNeeded(lazyListPositionedItemPosition2, itemInfo4);
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
