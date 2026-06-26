package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001:\u0002opB\u000f\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bm\u0010nJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0010\u001a\u00020\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u000eJE\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0016\u0018\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0019H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010!\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0016\u0018\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010 J'\u0010!\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010&JC\u0010*\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0016\u0018\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010 J/\u0010*\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b+\u0010 J'\u0010*\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b+\u0010&J.\u0010.\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0016\u0018\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010-J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0016\u0018\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b/\u0010-J!\u00103\u001a\u00020\u001a2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b4\u00102J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u00020\u0004H\u0002J\b\u00108\u001a\u00020\u0004H\u0002J\b\u00109\u001a\u00020\u0004H\u0002J0\u0010?\u001a\u00060>R\u00020\u00002\u0006\u0010.\u001a\u00020$2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002J<\u0010B\u001a\u00020\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010@\u001a\u00020\"2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010A\u001a\u00020\"2\u0006\u0010.\u001a\u00020$H\u0002J\u0018\u0010E\u001a\u00020$2\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020$H\u0002J\u0010\u0010G\u001a\u00020$2\u0006\u0010F\u001a\u00020$H\u0002J\u0010\u0010H\u001a\u00020$2\u0006\u0010F\u001a\u00020$H\u0002J\u0018\u0010K\u001a\u00020$2\u0006\u0010I\u001a\u00020;2\u0006\u0010J\u001a\u00020$H\u0002J\u0018\u0010L\u001a\u00020$2\u0006\u0010F\u001a\u00020$2\u0006\u0010J\u001a\u00020$H\u0002J \u0010M\u001a\u00020$2\u0006\u0010C\u001a\u00020;2\u0006\u0010D\u001a\u00020;2\u0006\u0010F\u001a\u00020$H\u0002R\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR$\u0010Z\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010.\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010^\u001a\u0004\b_\u0010`R$\u00100\u001a\u00020$2\u0006\u0010Y\u001a\u00020$8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b0\u0010^\u001a\u0004\ba\u0010`R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u001c\u0010e\u001a\b\u0018\u00010>R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010h\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006q"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "Lkotlin/j;", "useLogger$ui_release", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "useLogger", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "()V", "resetState", "attach", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "detach$ui_release", "detach", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "", "block", "firstFromHead-aLcG6gQ$ui_release", "(ILkj/l;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui_release", "(ILkj/l;)V", "headToTail", "", "mask", "Landroidx/compose/ui/Modifier$Node;", "headToTail$ui_release", "(Lkj/l;)V", "headToTailExclusive$ui_release", "headToTailExclusive", "tailToHead-aLcG6gQ$ui_release", "tailToHead", "tailToHead$ui_release", "tail-H91voCI$ui_release", "(I)Ljava/lang/Object;", "tail", "head-H91voCI$ui_release", "head", "has-H91voCI$ui_release", "(I)Z", "has", "has$ui_release", "", "toString", "padChain", "trimChain", "syncCoordinators", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "Landroidx/compose/ui/node/NodeChain$Differ;", "getDiffer", "beforeSize", "afterSize", "structuralUpdate", "prev", "next", "replaceNode", "node", "detachAndRemoveNode", "removeNode", "element", "child", "createAndInsertNodeAsParent", "insertParent", "updateNodeAndReplaceIfNeeded", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "getHead$ui_release", "current", "Landroidx/compose/runtime/collection/MutableVector;", "buffer", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/NodeChain$Logger;", "isUpdating", "()Z", "getAggregateChildKindSet", "()I", "aggregateChildKindSet", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NodeChain {
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "", "oldIndex", "newIndex", "", "areItemsTheSame", "atIndex", "Lkotlin/j;", "insert", "remove", "same", "Landroidx/compose/ui/Modifier$Node;", "node", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "aggregateChildKindSet", "I", "getAggregateChildKindSet", "()I", "setAggregateChildKindSet", "(I)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "Landroidx/compose/runtime/collection/MutableVector;", "getBefore", "()Landroidx/compose/runtime/collection/MutableVector;", "setBefore", "(Landroidx/compose/runtime/collection/MutableVector;)V", "after", "getAfter", "setAfter", "<init>", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private int aggregateChildKindSet;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        final /* synthetic */ NodeChain this$0;

        public Differ(NodeChain nodeChain, Modifier.Node node, int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2) {
            m.h(node, "node");
            m.h(mutableVector, "before");
            m.h(mutableVector2, "after");
            this.this$0 = nodeChain;
            this.node = node;
            this.aggregateChildKindSet = i2;
            this.before = mutableVector;
            this.after = mutableVector2;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            return NodeChainKt.actionForModifiers(this.before.getContent()[oldIndex], this.after.getContent()[newIndex]) != 0;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i2, int i3) {
            Modifier.Node node = this.node;
            this.node = this.this$0.createAndInsertNodeAsParent(this.after.getContent()[i3], node);
            if (!(!r0.getIsAttached())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            Logger logger = this.this$0.logger;
            if (logger != null) {
                logger.nodeInserted(i2, i3, this.after.getContent()[i3], node, this.node);
            }
            int kindSet$ui_release = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet$ui_release;
            this.node.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i2) {
            Modifier.Node parent$ui_release = this.node.getParent();
            m.e(parent$ui_release);
            this.node = parent$ui_release;
            Logger logger = this.this$0.logger;
            if (logger != null) {
                logger.nodeRemoved(i2, this.before.getContent()[i2], this.node);
            }
            this.node = this.this$0.detachAndRemoveNode(this.node);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i2, int i3) {
            Modifier.Node parent$ui_release = this.node.getParent();
            m.e(parent$ui_release);
            this.node = parent$ui_release;
            Modifier.Element element = this.before.getContent()[i2];
            Modifier.Element element2 = this.after.getContent()[i3];
            if (m.c(element, element2)) {
                Logger logger = this.this$0.logger;
                if (logger != null) {
                    logger.nodeReused(i2, i3, element, element2, this.node);
                }
            } else {
                Modifier.Node node = this.node;
                this.node = this.this$0.updateNodeAndReplaceIfNeeded(element, element2, node);
                Logger logger2 = this.this$0.logger;
                if (logger2 != null) {
                    logger2.nodeUpdated(i2, i3, element, element2, node, this.node);
                }
            }
            int kindSet$ui_release = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet$ui_release;
            this.node.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            m.h(mutableVector, "<set-?>");
            this.after = mutableVector;
        }

        public final void setAggregateChildKindSet(int i2) {
            this.aggregateChildKindSet = i2;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            m.h(mutableVector, "<set-?>");
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node) {
            m.h(node, "<set-?>");
            this.node = node;
        }
    }

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J8\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H&J0\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "", "index", "Landroidx/compose/ui/Modifier$Element;", "prev", "next", "Landroidx/compose/ui/Modifier$Node;", "node", "Lkotlin/j;", "linearDiffAborted", "oldIndex", "newIndex", "before", "after", "nodeUpdated", "nodeReused", "atIndex", "element", "child", "inserted", "nodeInserted", "nodeRemoved", "ui_release"}, k = 1, mv = {1, 8, 0})
    public interface Logger {
        void linearDiffAborted(int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i2, int i3, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i2, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node, Modifier.Node node2);
    }

    public NodeChain(LayoutNode layoutNode) {
        m.h(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        Modifier.Node tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node child) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!(!backwardsCompatNode.getIsAttached())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertParent(backwardsCompatNode, child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet();
    }

    private final Differ getDiffer(Modifier.Node tail, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(this, tail, tail.getAggregateChildKindSet(), before, after);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(tail);
        differ.setAggregateChildKindSet(tail.getAggregateChildKindSet());
        differ.setBefore(before);
        differ.setAfter(after);
        return differ;
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node child) {
        Modifier.Node parent$ui_release = child.getParent();
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(node);
            node.setParent$ui_release(parent$ui_release);
        }
        child.setParent$ui_release(node);
        node.setChild$ui_release(child);
        return node;
    }

    private final boolean isUpdating() {
        return this.head == NodeChainKt.SentinelHead;
    }

    private final void padChain() {
        if (!(this.head != NodeChainKt.SentinelHead)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.SentinelHead);
        NodeChainKt.SentinelHead.setChild$ui_release(node);
        this.head = NodeChainKt.SentinelHead;
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild();
        Modifier.Node parent$ui_release = node.getParent();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        m.e(child$ui_release);
        return child$ui_release;
    }

    private final Modifier.Node replaceNode(Modifier.Node prev, Modifier.Node next) {
        Modifier.Node parent$ui_release = prev.getParent();
        if (parent$ui_release != null) {
            next.setParent$ui_release(parent$ui_release);
            parent$ui_release.setChild$ui_release(next);
            prev.setParent$ui_release(null);
        }
        Modifier.Node child$ui_release = prev.getChild();
        if (child$ui_release != null) {
            next.setChild$ui_release(child$ui_release);
            child$ui_release.setParent$ui_release(next);
            prev.setChild$ui_release(null);
        }
        next.updateCoordinator$ui_release(prev.getCoordinator());
        return next;
    }

    private final void structuralUpdate(MutableVector<Modifier.Element> mutableVector, int i2, MutableVector<Modifier.Element> mutableVector2, int i3, Modifier.Node node) {
        MyersDiffKt.executeDiff(i2, i3, getDiffer(node, mutableVector, mutableVector2));
    }

    private final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
            if (((NodeKind.m4446constructorimpl(2) & parent$ui_release.getKindSet()) != 0) && (parent$ui_release instanceof LayoutModifierNode)) {
                if (parent$ui_release.getCoordinator() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator();
                    m.f(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release((LayoutModifierNode) parent$ui_release);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, (LayoutModifierNode) parent$ui_release);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    private final void trimChain() {
        if (!(this.head == NodeChainKt.SentinelHead)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node child$ui_release = NodeChainKt.SentinelHead.getChild();
        if (child$ui_release == null) {
            child$ui_release = this.tail;
        }
        this.head = child$ui_release;
        child$ui_release.setParent$ui_release(null);
        NodeChainKt.SentinelHead.setChild$ui_release(null);
        if (!(this.head != NodeChainKt.SentinelHead)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node updateNodeAndReplaceIfNeeded(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if (!(prev instanceof ModifierNodeElement) || !(next instanceof ModifierNodeElement)) {
            if (!(node instanceof BackwardsCompatNode)) {
                throw new IllegalStateException("Unknown Modifier.Node type".toString());
            }
            ((BackwardsCompatNode) node).setElement(next);
            if (node.getIsAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
            return node;
        }
        ModifierNodeElement modifierNodeElement = (ModifierNodeElement) next;
        Modifier.Node nodeUpdateUnsafe = NodeChainKt.updateUnsafe(modifierNodeElement, node);
        if (nodeUpdateUnsafe == node) {
            if (modifierNodeElement.getAutoInvalidate()) {
                if (nodeUpdateUnsafe.getIsAttached()) {
                    NodeKindKt.autoInvalidateUpdatedNode(nodeUpdateUnsafe);
                } else {
                    nodeUpdateUnsafe.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                }
            }
            return nodeUpdateUnsafe;
        }
        if (!(!nodeUpdateUnsafe.getIsAttached())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        nodeUpdateUnsafe.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return replaceNode(node, nodeUpdateUnsafe);
    }

    public final void attach() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if (!head.getIsAttached()) {
                head.attach$ui_release();
                if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                    NodeKindKt.autoInvalidateInsertedNode(head);
                }
                if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                    NodeKindKt.autoInvalidateUpdatedNode(head);
                }
                head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
                head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
            }
        }
    }

    public final void detach$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.detach$ui_release();
            }
        }
    }

    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final <T> T m4402firstFromHeadaLcG6gQ$ui_release(int type, l<? super T, Boolean> block) {
        m.h(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    m.n();
                    throw null;
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: getHead$ui_release, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    /* JADX INFO: renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return EmptyList.INSTANCE;
        }
        int i2 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator$ui_release = head.getCoordinator();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i2], coordinator$ui_release, coordinator$ui_release.getLayer()));
            head = head.getChild();
            i2++;
        }
        return mutableVector2.asMutableList();
    }

    /* JADX INFO: renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* JADX INFO: renamed from: getTail$ui_release, reason: from getter */
    public final Modifier.Node getTail() {
        return this.tail;
    }

    public final boolean has$ui_release(int mask) {
        return (mask & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m4403hasH91voCI$ui_release(int type) {
        return (type & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final <T> T m4404headH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    m.n();
                    throw null;
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int mask, l<? super Modifier.Node, j> block) {
        m.h(block, "block");
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & mask) != 0) {
                block.invoke(head);
            }
            if ((head.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final <T> void m4405headToTailaLcG6gQ$ui_release(int type, l<? super T, j> block) {
        m.h(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    m.n();
                    throw null;
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(l<? super Modifier.Node, j> block) {
        m.h(block, "block");
        for (Modifier.Node head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void resetState$ui_release() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return;
        }
        int size = mutableVector.getSize();
        Modifier.Node parent$ui_release = this.tail.getParent();
        for (int i2 = size - 1; parent$ui_release != null && i2 >= 0; i2--) {
            if (parent$ui_release.getIsAttached()) {
                parent$ui_release.reset$ui_release();
                parent$ui_release.detach$ui_release();
            }
            parent$ui_release = parent$ui_release.getParent();
        }
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final <T> T m4406tailH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    m.n();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int mask, l<? super Modifier.Node, j> block) {
        m.h(block, "block");
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if ((tail.getKindSet() & mask) != 0) {
                block.invoke(tail);
            }
        }
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final <T> void m4407tailToHeadaLcG6gQ$ui_release(int type, l<? super T, j> block) {
        m.h(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    m.n();
                    throw null;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head = head.getChild();
            }
        }
        String string = sb.toString();
        m.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void updateFrom$ui_release(Modifier m) {
        Logger logger;
        m.h(m, "m");
        padChain();
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            mutableVector = new MutableVector<>(new Modifier.Element[0], 0);
        }
        MutableVector<Modifier.Element> mutableVector2 = mutableVector;
        MutableVector<Modifier.Element> mutableVector3 = this.buffer;
        if (mutableVector3 == null) {
            mutableVector3 = new MutableVector<>(new Modifier.Element[16], 0);
        }
        MutableVector<Modifier.Element> mutableVectorFillVector = NodeChainKt.fillVector(m, mutableVector3);
        boolean z = true;
        if (mutableVectorFillVector.getSize() == mutableVector2.getSize()) {
            int size = mutableVector2.getSize();
            Modifier.Node parent$ui_release = this.tail.getParent();
            int i2 = size - 1;
            int kindSet$ui_release = 0;
            boolean z2 = false;
            while (true) {
                if (parent$ui_release == null || i2 < 0) {
                    break;
                }
                Modifier.Element element = mutableVector2.getContent()[i2];
                Modifier.Element element2 = mutableVectorFillVector.getContent()[i2];
                int iActionForModifiers = NodeChainKt.actionForModifiers(element, element2);
                if (iActionForModifiers != 0) {
                    if (iActionForModifiers == 1) {
                        Modifier.Node nodeUpdateNodeAndReplaceIfNeeded = updateNodeAndReplaceIfNeeded(element, element2, parent$ui_release);
                        Logger logger2 = this.logger;
                        if (logger2 != null) {
                            logger2.nodeUpdated(i2, i2, element, element2, parent$ui_release, nodeUpdateNodeAndReplaceIfNeeded);
                        }
                        parent$ui_release = nodeUpdateNodeAndReplaceIfNeeded;
                    } else if (iActionForModifiers == 2 && (logger = this.logger) != null) {
                        logger.nodeReused(i2, i2, element, element2, parent$ui_release);
                    }
                    if (!parent$ui_release.getIsAttached()) {
                        z2 = true;
                    }
                    kindSet$ui_release |= parent$ui_release.getKindSet();
                    parent$ui_release.setAggregateChildKindSet$ui_release(kindSet$ui_release);
                    parent$ui_release = parent$ui_release.getParent();
                    i2--;
                } else {
                    Logger logger3 = this.logger;
                    if (logger3 != null) {
                        logger3.linearDiffAborted(i2, element, element2, parent$ui_release);
                    }
                    i2++;
                    parent$ui_release = parent$ui_release.getChild();
                }
            }
            int i3 = i2;
            Modifier.Node node = parent$ui_release;
            if (i3 > 0) {
                if ((node != null ? 1 : 0) == 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                structuralUpdate(mutableVector2, i3, mutableVectorFillVector, i3, node);
                kindSet$ui_release = 1;
            } else {
                z = z2;
            }
        } else {
            if (mutableVector2.getSize() == 0) {
                int size2 = mutableVectorFillVector.getSize() - 1;
                Modifier.Node nodeCreateAndInsertNodeAsParent = this.tail;
                while (true) {
                    Modifier.Node node2 = nodeCreateAndInsertNodeAsParent;
                    if (size2 < 0) {
                        break;
                    }
                    Modifier.Element element3 = mutableVectorFillVector.getContent()[size2];
                    nodeCreateAndInsertNodeAsParent = createAndInsertNodeAsParent(element3, node2);
                    Logger logger4 = this.logger;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, size2, element3, node2, nodeCreateAndInsertNodeAsParent);
                    }
                    kindSet$ui_release |= nodeCreateAndInsertNodeAsParent.getKindSet();
                    nodeCreateAndInsertNodeAsParent.setAggregateChildKindSet$ui_release(kindSet$ui_release);
                    size2--;
                }
            } else if (mutableVectorFillVector.getSize() == 0) {
                int size3 = mutableVector2.getSize() - 1;
                Modifier.Node parent$ui_release2 = this.tail.getParent();
                while (parent$ui_release2 != null && size3 >= 0) {
                    Logger logger5 = this.logger;
                    if (logger5 != null) {
                        logger5.nodeRemoved(size3, mutableVector2.getContent()[size3], parent$ui_release2);
                    }
                    Modifier.Node parent$ui_release3 = parent$ui_release2.getParent();
                    detachAndRemoveNode(parent$ui_release2);
                    size3--;
                    parent$ui_release2 = parent$ui_release3;
                }
                z = false;
                kindSet$ui_release = 1;
            } else {
                structuralUpdate(mutableVector2, mutableVector2.getSize(), mutableVectorFillVector, mutableVectorFillVector.getSize(), this.tail);
            }
            kindSet$ui_release = 1;
        }
        this.current = mutableVectorFillVector;
        mutableVector2.clear();
        this.buffer = mutableVector2;
        trimChain();
        if (kindSet$ui_release != 0) {
            syncCoordinators();
        }
        if (z && this.layoutNode.isAttached()) {
            attach();
        }
    }

    public final void useLogger$ui_release(Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(l<? super Modifier.Node, j> block) {
        m.h(block, "block");
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    public final void headToTail$ui_release(l<? super Modifier.Node, j> block) {
        m.h(block, "block");
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }
}
