package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b-\u0010.J/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\nJC\u0010\u0017\u001a\u00020\u0007\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010!\u001a\u00020\u0007H\u0000¢\u0006\u0004\b \u0010\u0019R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010&¨\u0006/"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "Lkotlin/j;", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;ZLkj/a;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "Landroidx/compose/ui/node/OwnerScope;", "T", TypedValues.AttributesType.S_TARGET, "Lkotlin/Function1;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkj/l;Lkj/a;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", "clear", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingLookaheadMeasure", "Lkj/l;", "onCommitAffectingMeasure", "onCommitAffectingLayout", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "onCommitAffectingLookaheadLayout", "onChangedExecutor", "<init>", "(Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class OwnerSnapshotObserver {
    private final SnapshotStateObserver observer;
    private final l<LayoutNode, j> onCommitAffectingLayout;
    private final l<LayoutNode, j> onCommitAffectingLayoutModifier;
    private final l<LayoutNode, j> onCommitAffectingLayoutModifierInLookahead;
    private final l<LayoutNode, j> onCommitAffectingLookaheadLayout;
    private final l<LayoutNode, j> onCommitAffectingLookaheadMeasure;
    private final l<LayoutNode, j> onCommitAffectingMeasure;

    public OwnerSnapshotObserver(l<? super kj.a<j>, j> lVar) {
        m.h(lVar, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(lVar);
        this.onCommitAffectingLookaheadMeasure = new l<LayoutNode, j>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return j.a;
            }

            public final void invoke(LayoutNode layoutNode) {
                m.h(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingMeasure = new l<LayoutNode, j>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return j.a;
            }

            public final void invoke(LayoutNode layoutNode) {
                m.h(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayout = new l<LayoutNode, j>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return j.a;
            }

            public final void invoke(LayoutNode layoutNode) {
                m.h(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayoutModifier = new l<LayoutNode, j>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return j.a;
            }

            public final void invoke(LayoutNode layoutNode) {
                m.h(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayoutModifierInLookahead = new l<LayoutNode, j>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return j.a;
            }

            public final void invoke(LayoutNode layoutNode) {
                m.h(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLookaheadLayout = new l<LayoutNode, j>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return j.a;
            }

            public final void invoke(LayoutNode layoutNode) {
                m.h(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, kj.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z, aVar);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, kj.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z, aVar);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, kj.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z, aVar);
    }

    public final void clear$ui_release(Object target) {
        m.h(target, TypedValues.AttributesType.S_TARGET);
        this.observer.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new l<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m4498invoke(Object obj) {
                m.h(obj, "it");
                return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
            }
        });
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode node, boolean affectsLookahead, kj.a<j> block) {
        m.h(node, "node");
        m.h(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode node, boolean affectsLookahead, kj.a<j> block) {
        m.h(node, "node");
        m.h(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            observeReads$ui_release(node, this.onCommitAffectingLayout, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLookaheadLayout, block);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode node, boolean affectsLookahead, kj.a<j> block) {
        m.h(node, "node");
        m.h(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            observeReads$ui_release(node, this.onCommitAffectingMeasure, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T target, l<? super T, j> onChanged, kj.a<j> block) {
        m.h(target, TypedValues.AttributesType.S_TARGET);
        m.h(onChanged, "onChanged");
        m.h(block, "block");
        this.observer.observeReads(target, onChanged, block);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
