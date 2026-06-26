package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.appcompat.R;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010D\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070C\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\bE\u0010FJ\\\u0010\f\u001a\u00020\u0007\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0002*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0083\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0002J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u001d\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020'H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020(H\u0016J\n\u0010*\u001a\u0004\u0018\u00010)H\u0016R(\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00107\u001a\u0002068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00102\u001a\u0004\b9\u0010:R\"\u0010=\u001a\u00020<8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "Lkotlin/j;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkj/l;Lkj/l;)V", "traverseAncestors", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "lastLocalKeyInputNode", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "wrapAroundFocus-3ESFkO8", "(I)Z", "wrapAroundFocus", "takeFocus", "releaseFocus", "force", "clearFocus", "refreshFocusEvents", "moveFocus-3ESFkO8", "moveFocus", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "node", "scheduleInvalidation", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/geometry/Rect;", "getFocusRect", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "getRootFocusNode$ui_release$annotations", "()V", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "getModifier$annotations", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Lkotlin/Function0;", "onRequestApplyChangesListener", "<init>", "(Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusOwnerImpl implements FocusOwner {
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;
    private final Modifier modifier;
    private FocusTargetModifierNode rootFocusNode;

    /* JADX INFO: compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(l<? super kj.a<j>, j> lVar) {
        m.h(lVar, "onRequestApplyChangesListener");
        this.rootFocusNode = new FocusTargetModifierNode();
        this.focusInvalidationManager = new FocusInvalidationManager(lVar);
        this.modifier = new ModifierNodeElement<FocusTargetModifierNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object other) {
                return other == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.getRootFocusNode().hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "<this>");
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public FocusTargetModifierNode update(FocusTargetModifierNode node) {
                m.h(node, "node");
                return node;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public FocusTargetModifierNode create() {
                return this.this$0.getRootFocusNode();
            }
        };
    }

    private final KeyInputModifierNode lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING) | NodeKind.m4446constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        Object obj = null;
        if ((node.getAggregateChildKindSet() & iM4446constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM4446constructorimpl) != 0) {
                    if ((NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING) & child.getKindSet()) != 0) {
                        return (KeyInputModifierNode) obj;
                    }
                    if (!(child instanceof KeyInputModifierNode)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    obj = child;
                }
            }
        }
        return (KeyInputModifierNode) obj;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m2527traverseAncestorsYYKmho(T t, int i2, l<? super T, j> lVar, l<? super T, j> lVar2) {
        int size;
        List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(t, i2);
        if (!(listAncestors instanceof List)) {
            listAncestors = null;
        }
        if (listAncestors != null && listAncestors.size() - 1 >= 0) {
            while (true) {
                int i3 = size - 1;
                lVar.invoke(listAncestors.get(size));
                if (i3 < 0) {
                    break;
                } else {
                    size = i3;
                }
            }
        }
        lVar.invoke(t);
        lVar2.invoke(t);
        if (listAncestors != null) {
            int size2 = listAncestors.size();
            for (int i4 = 0; i4 < size2; i4++) {
                lVar2.invoke(listAncestors.get(i4));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m2528wrapAroundFocus3ESFkO8(int focusDirection) throws NoWhenBranchMatchedException {
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.m2506equalsimpl0(focusDirection, companion.m2519getNextdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(focusDirection, companion.m2521getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.rootFocusNode.getFocusState().isFocused()) {
                    return mo2525moveFocus3ESFkO8(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) throws NoWhenBranchMatchedException {
        clearFocus(z, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo2526dispatchKeyEventZmokQxo(KeyEvent keyEvent) throws NoWhenBranchMatchedException {
        int size;
        m.h(keyEvent, "keyEvent");
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        KeyInputModifierNode keyInputModifierNodeLastLocalKeyInputNode = lastLocalKeyInputNode(focusTargetModifierNodeFindActiveFocusNode);
        if (keyInputModifierNodeLastLocalKeyInputNode == null) {
            Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNodeFindActiveFocusNode, NodeKind.m4446constructorimpl(8192));
            if (!(nodeNearestAncestor instanceof KeyInputModifierNode)) {
                nodeNearestAncestor = null;
            }
            keyInputModifierNodeLastLocalKeyInputNode = (KeyInputModifierNode) nodeNearestAncestor;
        }
        if (keyInputModifierNodeLastLocalKeyInputNode != null) {
            List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(keyInputModifierNodeLastLocalKeyInputNode, NodeKind.m4446constructorimpl(8192));
            List<Modifier.Node> list = listAncestors instanceof List ? listAncestors : null;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = size - 1;
                    if (((KeyInputModifierNode) list.get(size)).mo4020onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            if (keyInputModifierNodeLastLocalKeyInputNode.mo4020onPreKeyEventZmokQxo(keyEvent) || keyInputModifierNodeLastLocalKeyInputNode.mo4019onKeyEventZmokQxo(keyEvent)) {
                return true;
            }
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (((KeyInputModifierNode) list.get(i3)).mo4019onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event) throws NoWhenBranchMatchedException {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        m.h(event, "event");
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            Object objNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNodeFindActiveFocusNode, NodeKind.m4446constructorimpl(16384));
            if (!(objNearestAncestor instanceof RotaryInputModifierNode)) {
                objNearestAncestor = null;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) objNearestAncestor;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(rotaryInputModifierNode, NodeKind.m4446constructorimpl(16384));
            List<Modifier.Node> list = listAncestors instanceof List ? listAncestors : null;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = size - 1;
                    if (((RotaryInputModifierNode) list.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            if (rotaryInputModifierNode.onPreRotaryScrollEvent(event) || rotaryInputModifierNode.onRotaryScrollEvent(event)) {
                return true;
            }
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (((RotaryInputModifierNode) list.get(i3)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() throws NoWhenBranchMatchedException {
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetModifierNodeFindActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        m.o("layoutDirection");
        throw null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetModifierNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo2525moveFocus3ESFkO8(int focusDirection) throws NoWhenBranchMatchedException {
        final FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM2537customFocusSearchOMvw8 = FocusTraversalKt.m2537customFocusSearchOMvw8(focusTargetModifierNodeFindActiveFocusNode, focusDirection, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (m.c(focusRequesterM2537customFocusSearchOMvw8, companion.getCancel())) {
            return false;
        }
        return m.c(focusRequesterM2537customFocusSearchOMvw8, companion.getDefault()) ? FocusTraversalKt.m2538focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new l<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1
            {
                super(1);
            }

            public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
                m.h(focusTargetModifierNode, "destination");
                if (m.c(focusTargetModifierNode, focusTargetModifierNodeFindActiveFocusNode)) {
                    return Boolean.FALSE;
                }
                Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING));
                if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
                    nodeNearestAncestor = null;
                }
                if (((FocusTargetModifierNode) nodeNearestAncestor) != null) {
                    return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode));
                }
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
        }) || m2528wrapAroundFocus3ESFkO8(focusDirection) : focusRequesterM2537customFocusSearchOMvw8.findFocusTarget$ui_release(new l<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$1
            public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
                m.h(focusTargetModifierNode, "it");
                return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode));
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() throws NoWhenBranchMatchedException {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetModifierNode focusTargetModifierNode) {
        m.h(focusTargetModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusTargetModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        m.h(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(FocusTargetModifierNode focusTargetModifierNode) {
        m.h(focusTargetModifierNode, "<set-?>");
        this.rootFocusNode = focusTargetModifierNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusStateImpl() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean z, boolean z2) throws NoWhenBranchMatchedException {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl2 = this.rootFocusNode.getFocusStateImpl();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, z, z2)) {
            FocusTargetModifierNode focusTargetModifierNode = this.rootFocusNode;
            int i2 = WhenMappings.$EnumSwitchMapping$0[focusStateImpl2.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(focusStateImpl);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        m.h(focusEventModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        m.h(focusPropertiesModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }

    public static /* synthetic */ void getModifier$annotations() {
    }

    public static /* synthetic */ void getRootFocusNode$ui_release$annotations() {
    }
}
