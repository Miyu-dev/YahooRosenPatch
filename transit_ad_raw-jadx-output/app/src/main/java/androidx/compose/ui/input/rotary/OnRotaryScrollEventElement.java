package androidx.compose.ui.input.rotary;

import a.b;
import androidx.appcompat.widget.s;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RotaryInputModifierNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/rotary/OnRotaryScrollEventElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNodeImpl;", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "component1", "onRotaryScrollEvent", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lkj/l;", "getOnRotaryScrollEvent", "()Lkj/l;", "<init>", "(Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OnRotaryScrollEventElement extends ModifierNodeElement<RotaryInputModifierNodeImpl> {
    private final l<RotaryScrollEvent, Boolean> onRotaryScrollEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public OnRotaryScrollEventElement(l<? super RotaryScrollEvent, Boolean> lVar) {
        m.h(lVar, "onRotaryScrollEvent");
        this.onRotaryScrollEvent = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnRotaryScrollEventElement copy$default(OnRotaryScrollEventElement onRotaryScrollEventElement, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = onRotaryScrollEventElement.onRotaryScrollEvent;
        }
        return onRotaryScrollEventElement.copy(lVar);
    }

    public final l<RotaryScrollEvent, Boolean> component1() {
        return this.onRotaryScrollEvent;
    }

    public final OnRotaryScrollEventElement copy(l<? super RotaryScrollEvent, Boolean> lVar) {
        m.h(lVar, "onRotaryScrollEvent");
        return new OnRotaryScrollEventElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnRotaryScrollEventElement) && m.c(this.onRotaryScrollEvent, ((OnRotaryScrollEventElement) other).onRotaryScrollEvent);
    }

    public final l<RotaryScrollEvent, Boolean> getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onRotaryScrollEvent.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        b.d(inspectorInfo, "<this>", "onRotaryScrollEvent").set("onRotaryScrollEvent", this.onRotaryScrollEvent);
    }

    public String toString() {
        return s.h(new StringBuilder("OnRotaryScrollEventElement(onRotaryScrollEvent="), this.onRotaryScrollEvent, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputModifierNodeImpl create() {
        return new RotaryInputModifierNodeImpl(this.onRotaryScrollEvent, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputModifierNodeImpl update(RotaryInputModifierNodeImpl node) {
        m.h(node, "node");
        node.setOnEvent(this.onRotaryScrollEvent);
        node.setOnPreEvent(null);
        return node;
    }
}
