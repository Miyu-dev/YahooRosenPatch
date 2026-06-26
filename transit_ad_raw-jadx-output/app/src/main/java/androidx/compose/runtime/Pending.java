package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.f;
import kotlin.g;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'0&j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*RW\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050+j\b\u0012\u0004\u0012\u00020\u0005`,0&j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050+j\b\u0012\u0004\u0012\u00020\u0005`,`(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u0005028F¢\u0006\u0006\u001a\u0004\b3\u0010\u001c¨\u00067"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", "key", "dataKey", "Landroidx/compose/runtime/KeyInfo;", "getNext", "keyInfo", "", "recordUsed", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Lkotlin/j;", "registerMoveSlot", "count", "registerMoveNode", "insertIndex", "registerInsert", "group", "newCount", "updateNodeCount", "slotPositionOf", "nodePositionOf", "updatedNodeCountOf", "", "keyInfos", "Ljava/util/List;", "getKeyInfos", "()Ljava/util/List;", "startIndex", "I", "getStartIndex", "()I", "groupIndex", "getGroupIndex", "setGroupIndex", "(I)V", "usedKeys", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupInfo;", "Lkotlin/collections/HashMap;", "groupInfos", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "keyMap$delegate", "Lkotlin/f;", "getKeyMap", "()Ljava/util/HashMap;", "keyMap", "", "getUsed", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
final class Pending {
    private int groupIndex;
    private final HashMap<Integer, GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;

    /* JADX INFO: renamed from: keyMap$delegate, reason: from kotlin metadata */
    private final f keyMap;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> list, int i2) {
        m.h(list, "keyInfos");
        this.keyInfos = list;
        this.startIndex = i2;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.usedKeys = new ArrayList();
        HashMap<Integer, GroupInfo> map = new HashMap<>();
        int size = list.size();
        int nodes = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = this.keyInfos.get(i3);
            map.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i3, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = map;
        this.keyMap = g.a(new kj.a<HashMap<Object, LinkedHashSet<KeyInfo>>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            public final HashMap<Object, LinkedHashSet<KeyInfo>> invoke() {
                HashMap<Object, LinkedHashSet<KeyInfo>> mapMultiMap = ComposerKt.multiMap();
                Pending pending = this.this$0;
                int size2 = pending.getKeyInfos().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i4);
                    ComposerKt.put(mapMultiMap, ComposerKt.getJoinedKey(keyInfo2), keyInfo2);
                }
                return mapMultiMap;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap.getValue();
    }

    public final KeyInfo getNext(int key, Object dataKey) {
        return (KeyInfo) ComposerKt.pop(getKeyMap(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        m.h(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        m.h(keyInfo, "keyInfo");
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(KeyInfo keyInfo, int i2) {
        m.h(keyInfo, "keyInfo");
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, i2, 0));
    }

    public final void registerMoveNode(int i2, int i3, int i4) {
        if (i2 > i3) {
            Collection<GroupInfo> collectionValues = this.groupInfos.values();
            m.g(collectionValues, "groupInfos.values");
            for (GroupInfo groupInfo : collectionValues) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (i2 <= nodeIndex && nodeIndex < i2 + i4) {
                    groupInfo.setNodeIndex((nodeIndex - i2) + i3);
                } else if (i3 <= nodeIndex && nodeIndex < i2) {
                    groupInfo.setNodeIndex(nodeIndex + i4);
                }
            }
            return;
        }
        if (i3 > i2) {
            Collection<GroupInfo> collectionValues2 = this.groupInfos.values();
            m.g(collectionValues2, "groupInfos.values");
            for (GroupInfo groupInfo2 : collectionValues2) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (i2 <= nodeIndex2 && nodeIndex2 < i2 + i4) {
                    groupInfo2.setNodeIndex((nodeIndex2 - i2) + i3);
                } else if (i2 + 1 <= nodeIndex2 && nodeIndex2 < i3) {
                    groupInfo2.setNodeIndex(nodeIndex2 - i4);
                }
            }
        }
    }

    public final void registerMoveSlot(int i2, int i3) {
        if (i2 > i3) {
            Collection<GroupInfo> collectionValues = this.groupInfos.values();
            m.g(collectionValues, "groupInfos.values");
            for (GroupInfo groupInfo : collectionValues) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == i2) {
                    groupInfo.setSlotIndex(i3);
                } else if (i3 <= slotIndex && slotIndex < i2) {
                    groupInfo.setSlotIndex(slotIndex + 1);
                }
            }
            return;
        }
        if (i3 > i2) {
            Collection<GroupInfo> collectionValues2 = this.groupInfos.values();
            m.g(collectionValues2, "groupInfos.values");
            for (GroupInfo groupInfo2 : collectionValues2) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == i2) {
                    groupInfo2.setSlotIndex(i3);
                } else if (i2 + 1 <= slotIndex2 && slotIndex2 < i3) {
                    groupInfo2.setSlotIndex(slotIndex2 - 1);
                }
            }
        }
    }

    public final void setGroupIndex(int i2) {
        this.groupIndex = i2;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        m.h(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int group, int newCount) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(group));
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = newCount - groupInfo.getNodeCount();
        groupInfo.setNodeCount(newCount);
        if (nodeCount == 0) {
            return true;
        }
        Collection<GroupInfo> collectionValues = this.groupInfos.values();
        m.g(collectionValues, "groupInfos.values");
        for (GroupInfo groupInfo2 : collectionValues) {
            if (groupInfo2.getNodeIndex() >= nodeIndex2 && !m.c(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                groupInfo2.setNodeIndex(nodeIndex);
            }
        }
        return true;
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        m.h(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
