package androidx.compose.runtime;

import a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0010\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010 \u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!H\u0002\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010%\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0001H\u0002\u001a\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001aD\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0002\u001a;\u00104\u001a\u00020.*\u0012\u0012\u0004\u0012\u00020.0-j\b\u0012\u0004\u0012\u00020.`/2\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00020.02H\u0082\b\u001a,\u00106\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020.0-j\b\u0012\u0004\u0012\u00020.`/2\u0006\u00105\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0002\u001a,\u00107\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020.0-j\b\u0012\u0004\u0012\u00020.`/2\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0002\"\u0014\u00108\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00109\"\u0014\u0010;\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00109\"\u0014\u0010<\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00109\"\u0014\u0010=\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00109\"\u0014\u0010>\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00109\"\u0014\u0010?\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00109\"\u0014\u0010@\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00109\"\u0014\u0010A\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00109\"\u0014\u0010B\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00109\"\u0014\u0010C\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00109\"\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00109\"\u0014\u0010E\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00109\"\u0014\u0010F\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u00109\"\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00109\"\u0014\u0010H\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u00109\"\u0014\u0010I\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u00109\"\u0014\u0010J\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u00109¨\u0006K"}, d2 = {"", "", "address", "groupInfo", "", "isNode", "nodeIndex", "hasObjectKey", "objectKeyIndex", "hasAux", "Lkotlin/j;", "addAux", "hasMark", "value", "updateMark", "containsMark", "updateContainsMark", "containsAnyMark", "auxIndex", "slotAnchor", "countOneBits", "key", "len", "", "keys", "nodeCount", "updateNodeCount", "nodeCounts", "parentAnchor", "updateParentAnchor", "parentAnchors", "groupSize", "updateGroupSize", "", "indices", "slice", "groupSizes", "dataAnchor", "anchor", "updateDataAnchor", "dataAnchors", "hasDataKey", "hasData", "initGroup", "updateGroupKey", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "Lkotlin/Function0;", "block", "getOrAdd", "location", "search", "locationOf", "parentAnchorPivot", "I", "Key_Offset", "GroupInfo_Offset", "ParentAnchor_Offset", "Size_Offset", "DataAnchor_Offset", "Group_Fields_Size", "NodeBit_Mask", "ObjectKey_Mask", "ObjectKey_Shift", "Aux_Mask", "Aux_Shift", "Mark_Mask", "ContainsMark_Mask", "Slots_Shift", "NodeCount_Mask", "MinGroupGrowthSize", "MinSlotsGrowthSize", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = iArr[i3] | Aux_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsAnyMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & ContainsMark_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countOneBits(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dataAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i2) {
        return slice(iArr, l.y(l.C(4, i2), 5));
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return dataAnchors(iArr, i2);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i2, int i3, kj.a<Anchor> aVar) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch < 0) {
            Anchor anchor = (Anchor) aVar.invoke();
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(iSearch);
        m.g(anchor2, "get(location)");
        return anchor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupInfo(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i2) {
        return slice(iArr, l.y(l.C(3, i2), 5));
    }

    public static /* synthetic */ List groupSizes$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return groupSizes(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasAux(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & Aux_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & Mark_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasObjectKey(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & ObjectKey_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5) {
        int i6 = z ? 1073741824 : 0;
        int i7 = z2 ? ObjectKey_Mask : 0;
        int i8 = z3 ? Aux_Mask : 0;
        int i9 = i2 * 5;
        iArr[i9 + 0] = i3;
        iArr[i9 + 1] = i6 | i7 | i8;
        iArr[i9 + 2] = i4;
        iArr[i9 + 3] = 0;
        iArr[i9 + 4] = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNode(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int key(int[] iArr, int i2) {
        return iArr[i2 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i2) {
        return slice(iArr, l.y(l.C(0, i2), 5));
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return keys(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeCount(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & NodeCount_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i2) {
        List<Integer> listSlice = slice(iArr, l.y(l.C(1, i2), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Integer.valueOf(listSlice.get(i3).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    public static /* synthetic */ List nodeCounts$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return nodeCounts(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeIndex(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int parentAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i2) {
        return slice(iArr, l.y(l.C(2, i2), 5));
    }

    public static /* synthetic */ List parentAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return parentAnchors(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int location$runtime_release = arrayList.get(i5).getLocation();
            if (location$runtime_release < 0) {
                location$runtime_release += i3;
            }
            int iJ = m.j(location$runtime_release, i2);
            if (iJ < 0) {
                i4 = i5 + 1;
            } else {
                if (iJ <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i2, boolean z) {
        int i3 = (i2 * 5) + 1;
        if (z) {
            iArr[i3] = iArr[i3] | ContainsMark_Mask;
        } else {
            iArr[i3] = iArr[i3] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDataAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = i3;
    }

    private static final void updateGroupKey(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 0] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i2, int i3) {
        ComposerKt.runtimeCheck(i3 >= 0);
        iArr[(i2 * 5) + 3] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i2, boolean z) {
        int i3 = (i2 * 5) + 1;
        if (z) {
            iArr[i3] = iArr[i3] | Mark_Mask;
        } else {
            iArr[i3] = iArr[i3] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i2, int i3) {
        ComposerKt.runtimeCheck(i3 >= 0 && i3 < NodeCount_Mask);
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateParentAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 2] = i3;
    }
}
