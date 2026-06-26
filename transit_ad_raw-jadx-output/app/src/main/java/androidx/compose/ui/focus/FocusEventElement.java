package androidx.compose.ui.focus;

import androidx.appcompat.widget.s;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusEventElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusEventModifierNodeImpl;", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "component1", "onFocusEvent", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lkj/l;", "getOnFocusEvent", "()Lkj/l;", "<init>", "(Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class FocusEventElement extends ModifierNodeElement<FocusEventModifierNodeImpl> {
    private final l<FocusState, j> onFocusEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventElement(l<? super FocusState, j> lVar) {
        m.h(lVar, "onFocusEvent");
        this.onFocusEvent = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FocusEventElement copy$default(FocusEventElement focusEventElement, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = focusEventElement.onFocusEvent;
        }
        return focusEventElement.copy(lVar);
    }

    public final l<FocusState, j> component1() {
        return this.onFocusEvent;
    }

    public final FocusEventElement copy(l<? super FocusState, j> lVar) {
        m.h(lVar, "onFocusEvent");
        return new FocusEventElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusEventElement) && m.c(this.onFocusEvent, ((FocusEventElement) other).onFocusEvent);
    }

    public final l<FocusState, j> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        a.b.d(inspectorInfo, "<this>", "onFocusEvent").set("onFocusEvent", this.onFocusEvent);
    }

    public String toString() {
        return s.h(new StringBuilder("FocusEventElement(onFocusEvent="), this.onFocusEvent, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusEventModifierNodeImpl create() {
        return new FocusEventModifierNodeImpl(this.onFocusEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusEventModifierNodeImpl update(FocusEventModifierNodeImpl node) {
        m.h(node, "node");
        node.setOnFocusEvent(this.onFocusEvent);
        return node;
    }
}
