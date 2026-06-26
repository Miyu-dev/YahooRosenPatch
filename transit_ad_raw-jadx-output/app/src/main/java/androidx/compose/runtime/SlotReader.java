package androidx.compose.runtime;

import androidx.appcompat.widget.s;
import java.util.ArrayList;
import java.util.List;
import kj.p;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b*\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\ba\u0010bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\"\u001a\u00020\u0018J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#J3\u0010*\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00180&H\u0000¢\u0006\u0004\b(\u0010)J\b\u0010,\u001a\u00020+H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020-2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010.\u001a\u0004\u0018\u00010\u0001*\u00020-2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010/\u001a\u0004\u0018\u00010\u0001*\u00020-2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R$\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010B\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010DR$\u0010E\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bF\u0010DR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\bG\u0010DR\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00108R\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00108R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00108R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010DR\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010AR\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010DR\u0011\u0010P\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bP\u0010AR\u0011\u0010R\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bQ\u0010AR\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010DR\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bT\u0010DR\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0011\u0010W\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bZ\u0010YR\u0013\u0010\\\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0011\u0010^\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b]\u0010DR\u0011\u0010`\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b_\u0010D¨\u0006c"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "", "index", "parent", "", "isNode", "nodeCount", "node", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "next", "Lkotlin/j;", "beginEmpty", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "skipToGroupEnd", "reposition", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "Lkotlin/Function2;", "block", "forEachData$runtime_release", "(ILkj/p;)V", "forEachData", "", "toString", "", "aux", "objectKey", "Landroidx/compose/runtime/SlotTable;", "table", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "<set-?>", "closed", "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "()I", "currentEnd", "getCurrentEnd", "getParent", "emptyCount", "currentSlot", "currentSlotEnd", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getGroupObjectKey", "()Ljava/lang/Object;", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getGroupSlotCount", "groupSlotCount", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SlotReader {
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        m.h(slotTable, "table");
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotReader.currentGroup;
        }
        return slotReader.anchor(i2);
    }

    private final Object aux(int[] iArr, int i2) {
        return SlotTableKt.hasAux(iArr, i2) ? this.slots[SlotTableKt.auxIndex(iArr, i2)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i2) {
        if (SlotTableKt.hasObjectKey(iArr, i2)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i2)];
        }
        return null;
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, index, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            anchors$runtime_release.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(iSearch);
        m.g(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this);
    }

    public final boolean containsMark(int index) {
        return SlotTableKt.containsMark(this.groups, index);
    }

    public final void endEmpty() {
        int i2 = this.emptyCount;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i2 - 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void endGroup() throws KotlinNothingValueException {
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                throw s.k("endGroup() not called at the end of a group");
            }
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = iParentAnchor;
            this.currentEnd = iParentAnchor < 0 ? this.groupsSize : iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int iGroupSize = this.currentGroup;
        int i2 = 0;
        while (iGroupSize < this.currentEnd) {
            arrayList.add(new KeyInfo(SlotTableKt.key(this.groups, iGroupSize), objectKey(this.groups, iGroupSize), iGroupSize, SlotTableKt.isNode(this.groups, iGroupSize) ? 1 : SlotTableKt.nodeCount(this.groups, iGroupSize), i2));
            iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            i2++;
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int group, p<? super Integer, Object, j> block) {
        m.h(block, "block");
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i2 = group + 1;
        int iDataAnchor = i2 < this.table.getGroupsSize() ? SlotTableKt.dataAnchor(this.table.getGroups(), i2) : this.table.getSlotsSize();
        for (int i3 = iSlotAnchor; i3 < iDataAnchor; i3++) {
            block.invoke(Integer.valueOf(i3 - iSlotAnchor), this.slots[i3]);
        }
    }

    public final Object get(int index) {
        int i2 = this.currentSlot + index;
        return i2 < this.currentSlotEnd ? this.slots[i2] : Composer.INSTANCE.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return aux(this.groups, i2);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return SlotTableKt.key(this.groups, i2);
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return node(this.groups, i2);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return objectKey(this.groups, i2);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int i2 = this.currentGroup;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i3 = i2 + 1;
        return (i3 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i3) : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.currentGroup);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i2 = this.parent;
        if (i2 >= 0) {
            return SlotTableKt.nodeCount(this.groups, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final int groupEnd(int index) {
        return SlotTableKt.groupSize(this.groups, index) + index;
    }

    public final Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, index);
    }

    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, index);
    }

    public final boolean hasMark(int index) {
        return SlotTableKt.hasMark(this.groups, index);
    }

    public final boolean hasObjectKey(int index) {
        return SlotTableKt.hasObjectKey(this.groups, index);
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.currentGroup);
    }

    public final Object next() {
        int i2;
        if (this.emptyCount > 0 || (i2 = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.INSTANCE.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i2 + 1;
        return objArr[i2];
    }

    public final Object node(int index) {
        if (SlotTableKt.isNode(this.groups, index)) {
            return node(this.groups, index);
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, index);
    }

    public final int parent(int index) {
        return SlotTableKt.parentAnchor(this.groups, index);
    }

    public final int parentOf(int index) {
        if (index >= 0 && index < this.groupsSize) {
            return SlotTableKt.parentAnchor(this.groups, index);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.c("Invalid group index ", index).toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void reposition(int i2) throws KotlinNothingValueException {
        if (!(this.emptyCount == 0)) {
            throw s.k("Cannot reposition while in an empty region");
        }
        this.currentGroup = i2;
        int iParentAnchor = i2 < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, i2) : -1;
        this.parent = iParentAnchor;
        if (iParentAnchor < 0) {
            this.currentEnd = this.groupsSize;
        } else {
            this.currentEnd = SlotTableKt.groupSize(this.groups, iParentAnchor) + iParentAnchor;
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void restoreParent(int i2) throws KotlinNothingValueException {
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2) + i2;
        int i3 = this.currentGroup;
        if (i3 >= i2 && i3 <= iGroupSize) {
            this.parent = i2;
            this.currentEnd = iGroupSize;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + i2 + " is not a parent of " + i3).toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final int skipGroup() throws KotlinNothingValueException {
        if (!(this.emptyCount == 0)) {
            throw s.k("Cannot skip while in an empty region");
        }
        int iNodeCount = SlotTableKt.isNode(this.groups, this.currentGroup) ? 1 : SlotTableKt.nodeCount(this.groups, this.currentGroup);
        int i2 = this.currentGroup;
        this.currentGroup = SlotTableKt.groupSize(this.groups, i2) + i2;
        return iNodeCount;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void skipToGroupEnd() throws KotlinNothingValueException {
        if (!(this.emptyCount == 0)) {
            throw s.k("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
    }

    public final void startGroup() {
        if (this.emptyCount <= 0) {
            if (!(SlotTableKt.parentAnchor(this.groups, this.currentGroup) == this.parent)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i2 = this.currentGroup;
            this.parent = i2;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i2) + i2;
            int i3 = this.currentGroup;
            int i4 = i3 + 1;
            this.currentGroup = i4;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i3);
            this.currentSlotEnd = i3 >= this.groupsSize - 1 ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, i4);
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!SlotTableKt.isNode(this.groups, this.currentGroup)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(getGroupKey());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        return android.support.v4.media.a.f(sb, this.currentEnd, ')');
    }

    private final Object node(int[] iArr, int i2) {
        return SlotTableKt.isNode(iArr, i2) ? this.slots[SlotTableKt.nodeIndex(iArr, i2)] : Composer.INSTANCE.getEmpty();
    }

    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i2 = group + 1;
        int i3 = iSlotAnchor + index;
        return i3 < (i2 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i2) : this.slotsSize) ? this.slots[i3] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(Anchor anchor) {
        m.h(anchor, "anchor");
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, index);
    }
}
