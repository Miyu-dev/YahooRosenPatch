package androidx.compose.runtime;

import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bc\u0010dJ-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJW\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010#\u001a\u00020\u000e2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00100$j\b\u0012\u0004\u0012\u00020\u0010`%H\u0000¢\u0006\u0004\b\u0019\u0010'JO\u0010*\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010#\u001a\u00020\u000e2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00100$j\b\u0012\u0004\u0012\u00020\u0010`%H\u0000¢\u0006\u0004\b(\u0010)J\u001f\u00100\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010+\u001a\u00020\u000eH\u0000¢\u0006\u0004\b.\u0010/J\u0006\u00101\u001a\u00020\u0013J\u0006\u00102\u001a\u00020\u0018J\u0006\u00104\u001a\u000203J\u001f\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0,2\u0006\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u0010/J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000308H\u0096\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00032\u0006\u0010:\u001a\u00020!H\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010-2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0010\u0010=\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000eH\u0002J \u0010A\u001a\u00020\u000e*\u00060>j\u0002`?2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000eH\u0002J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0002J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0002J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0002J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0002J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0002R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010H\u001a\u0004\bI\u0010JR$\u0010\u001f\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\bL\u0010MR4\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010N\u001a\u0004\bO\u0010PR$\u0010#\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010K\u001a\u0004\bQ\u0010MR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010KR$\u0010\u001c\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001c\u0010S\u001a\u0004\bT\u0010UR\"\u0010V\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010K\u001a\u0004\bW\u0010M\"\u0004\bX\u0010YR2\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00100$j\b\u0012\u0004\u0012\u00020\u0010`%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010UR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006e"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "block", "read", "(Lkj/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "write", "openReader", "openWriter", "", "index", "Landroidx/compose/runtime/Anchor;", "anchor", "anchorIndex", "", "ownsAnchor", "groupIndex", "groupContainsAnchor", "reader", "Lkotlin/j;", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "close", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo", TypedValues.AttributesType.S_TARGET, "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "verifyWellFormed", "", "asString", "group", "slotsOf$runtime_release", "slotsOf", "", "iterator", "identityToFind", "find", "findEffectiveRecomposeScope", "invalidateGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "emitGroup", "keys", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "<set-?>", "[I", "getGroups", "()[I", "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "Z", "getWriter$runtime_release", "()Z", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, lj.a {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i2, int i3) {
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i2);
        sb.append(") key=");
        sb.append(SlotTableKt.key(this.groups, i2));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2);
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, i2));
        sb.append(", size=");
        sb.append(iGroupSize);
        if (SlotTableKt.hasMark(this.groups, i2)) {
            sb.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i2)) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i2);
        int iEmitGroup = i2 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex >= 0 && iEmitGroup$dataIndex <= iEmitGroup$dataIndex2) {
            z = true;
        }
        if (!z || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if (SlotTableKt.hasObjectKey(this.groups, i2)) {
                sb.append(" objectKey=" + this.slots[SlotTableKt.objectKeyIndex(this.groups, i2)]);
            }
            if (SlotTableKt.isNode(this.groups, i2)) {
                sb.append(" node=" + this.slots[SlotTableKt.nodeIndex(this.groups, i2)]);
            }
            if (SlotTableKt.hasAux(this.groups, i2)) {
                sb.append(" aux=" + this.slots[SlotTableKt.auxIndex(this.groups, i2)]);
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i5 = iSlotAnchor; i5 < iEmitGroup$dataIndex2; i5++) {
                    if (i5 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.slots[i5]));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i6 = i2 + iGroupSize;
        while (iEmitGroup < i6) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i3 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i2) {
        return i2 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i2);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        while (group > 0) {
            for (Object obj : new DataIterator(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) obj;
                }
            }
            group = SlotTableKt.parentAnchor(this.groups, group);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private final boolean invalidateGroup(int group) {
        while (group >= 0) {
            for (Object obj : new DataIterator(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    recomposeScopeImpl.setRequiresRecompose(true);
                    return recomposeScopeImpl.invalidateForResult(null) != InvalidationResult.IGNORED;
                }
            }
            group = SlotTableKt.parentAnchor(this.groups, group);
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final void invalidateGroupsWithKey$lambda$14$scanGroup(SlotReader slotReader, int i2, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) throws KotlinNothingValueException {
        if (slotReader.getGroupKey() != i2) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$14$scanGroup(slotReader, i2, list, booleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        if (booleanRef.element) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (recomposeScopeImplFindEffectiveRecomposeScope != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
            } else {
                booleanRef.element = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i2, int i3) {
        int i4 = intRef.element;
        int i5 = i4 + 1;
        intRef.element = i5;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i4);
        if ((iParentAnchor == i2) != true) {
            StringBuilder sbF = androidx.compose.animation.a.f("Invalid parent index detected at ", i4, ", expected parent index to be ", i2, " found ");
            sbF.append(iParentAnchor);
            throw new IllegalStateException(sbF.toString().toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i4) + i4;
        if ((iGroupSize <= slotTable.groupsSize) != true) {
            throw new IllegalStateException(android.support.v4.media.a.c("A group extends past the end of the table at ", i4).toString());
        }
        if ((iGroupSize <= i3) != true) {
            throw new IllegalStateException(android.support.v4.media.a.c("A group extends past its parent group at ", i4).toString());
        }
        int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i4);
        int iDataAnchor2 = i4 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i5);
        if ((iDataAnchor2 <= slotTable.slots.length) != true) {
            throw new IllegalStateException(a.b.e("Slots for ", i4, " extend past the end of the slot table").toString());
        }
        if ((iDataAnchor <= iDataAnchor2) != true) {
            throw new IllegalStateException(android.support.v4.media.a.c("Invalid data anchor at ", i4).toString());
        }
        if ((SlotTableKt.slotAnchor(slotTable.groups, i4) <= iDataAnchor2) != true) {
            throw new IllegalStateException(android.support.v4.media.a.c("Slots start out of range at ", i4).toString());
        }
        if ((iDataAnchor2 - iDataAnchor >= (SlotTableKt.hasAux(slotTable.groups, i4) ? 1 : 0) + ((SlotTableKt.hasObjectKey(slotTable.groups, i4) ? 1 : 0) + (SlotTableKt.isNode(slotTable.groups, i4) ? 1 : 0))) != true) {
            throw new IllegalStateException(android.support.v4.media.a.c("Not enough slots added for group ", i4).toString());
        }
        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i4);
        if (((zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i4)] == null) ? false : true) != true) {
            throw new IllegalStateException(android.support.v4.media.a.c("No node recorded for a node group at ", i4).toString());
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (intRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i4, iGroupSize);
        }
        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i4);
        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i4);
        if ((iNodeCount == iVerifyWellFormed$validateGroup) != true) {
            StringBuilder sbF2 = androidx.compose.animation.a.f("Incorrect node count detected at ", i4, ", expected ", iNodeCount, ", received ");
            sbF2.append(iVerifyWellFormed$validateGroup);
            throw new IllegalStateException(sbF2.toString().toString());
        }
        int i6 = intRef.element - i4;
        if ((iGroupSize2 == i6) != true) {
            StringBuilder sbF3 = androidx.compose.animation.a.f("Incorrect slot count detected at ", i4, ", expected ", iGroupSize2, ", received ");
            sbF3.append(i6);
            throw new IllegalStateException(sbF3.toString().toString());
        }
        if (SlotTableKt.containsAnyMark(slotTable.groups, i4)) {
            if (!(i4 <= 0 || SlotTableKt.containsMark(slotTable.groups, i2))) {
                throw new IllegalStateException(v.f("Expected group ", i2, " to record it contains a mark because ", i4, " does").toString());
            }
        }
        if (zIsNode) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Anchor anchor(int index) throws KotlinNothingValueException {
        if (!(!this.writer)) {
            throw s.k("use active SlotWriter to create an anchor location instead ");
        }
        boolean z = false;
        if (index >= 0 && index < this.groupsSize) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(iSearch);
        m.g(anchor2, "get(location)");
        return anchor2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final int anchorIndex(Anchor anchor) throws KotlinNothingValueException {
        m.h(anchor, "anchor");
        if (!(!this.writer)) {
            throw s.k("Use active SlotWriter to determine anchor location instead");
        }
        if (anchor.getValid()) {
            return anchor.getLocation();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final String asString() {
        if (this.writer) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        int i2 = this.groupsSize;
        if (i2 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i2) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        m.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void close$runtime_release(SlotReader reader) throws KotlinNothingValueException {
        m.h(reader, "reader");
        if (!(reader.getTable() == this && this.readers > 0)) {
            throw s.k("Unexpected reader close()");
        }
        this.readers--;
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.containsMark(this.groups, 0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        m.h(identityToFind, "identityToFind");
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean groupContainsAnchor(int groupIndex, Anchor anchor) throws KotlinNothingValueException {
        m.h(anchor, "anchor");
        if (!(!this.writer)) {
            throw s.k("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            throw s.k("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndex) + groupIndex;
            int location = anchor.getLocation();
            if (groupIndex <= location && location < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) throws KotlinNothingValueException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$14$scanGroup(slotReaderOpenReader, target, arrayList, booleanRef, this, arrayList2);
            j jVar = j.a;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Anchor anchor = (Anchor) arrayList.get(i2);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashGroup$runtime_release();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close();
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            throw s.k("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            throw s.k("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(Anchor anchor) {
        m.h(anchor, "anchor");
        if (!anchor.getValid()) {
            return false;
        }
        int iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize);
        return iSearch >= 0 && m.c(this.anchors.get(iSearch), anchor);
    }

    public final <T> T read(l<? super SlotReader, ? extends T> block) {
        m.h(block, "block");
        SlotReader slotReaderOpenReader = openReader();
        try {
            return (T) block.invoke(slotReaderOpenReader);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        m.h(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors) {
        m.h(groups, "groups");
        m.h(slots, "slots");
        m.h(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
    }

    public final void setVersion$runtime_release(int i2) {
        this.version = i2;
    }

    public final List<Object> slotsOf$runtime_release(int group) {
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, group);
        int i2 = group + 1;
        return p.T0(this.slots).subList(iDataAnchor, i2 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i2) : this.slots.length);
    }

    public final void verifyWellFormed() {
        int i2;
        int i3;
        Ref.IntRef intRef = new Ref.IntRef();
        int i4 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i2 = intRef.element;
                i3 = this.groupsSize;
                if (i2 >= i3) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(intRef, this, -1, SlotTableKt.groupSize(this.groups, i2) + i2);
                }
            }
            if (!(i2 == i3)) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int indexFor = arrayList.get(i5).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
            if (!(i4 < indexFor)) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            i5++;
            i4 = indexFor;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final <T> T write(l<? super SlotWriter, ? extends T> block) throws KotlinNothingValueException {
        m.h(block, "block");
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            return (T) block.invoke(slotWriterOpenWriter);
        } finally {
            slotWriterOpenWriter.close();
        }
    }

    public final void close$runtime_release(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors) {
        m.h(writer, "writer");
        m.h(groups, "groups");
        m.h(slots, "slots");
        m.h(anchors, "anchors");
        if (writer.getTable() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
