package androidx.compose.ui.layout;

import androidx.appcompat.widget.s;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnPlacedModifierImpl;", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "component1", "onPlaced", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lkj/l;", "getOnPlaced", "()Lkj/l;", "<init>", "(Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class OnPlacedElement extends ModifierNodeElement<OnPlacedModifierImpl> {
    private final kj.l<LayoutCoordinates, kotlin.j> onPlaced;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(kj.l<? super LayoutCoordinates, kotlin.j> lVar) {
        kotlin.jvm.internal.m.h(lVar, "onPlaced");
        this.onPlaced = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnPlacedElement copy$default(OnPlacedElement onPlacedElement, kj.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = onPlacedElement.onPlaced;
        }
        return onPlacedElement.copy(lVar);
    }

    public final kj.l<LayoutCoordinates, kotlin.j> component1() {
        return this.onPlaced;
    }

    public final OnPlacedElement copy(kj.l<? super LayoutCoordinates, kotlin.j> lVar) {
        kotlin.jvm.internal.m.h(lVar, "onPlaced");
        return new OnPlacedElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnPlacedElement) && kotlin.jvm.internal.m.c(this.onPlaced, ((OnPlacedElement) other).onPlaced);
    }

    public final kj.l<LayoutCoordinates, kotlin.j> getOnPlaced() {
        return this.onPlaced;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        a.b.d(inspectorInfo, "<this>", "onPlaced").set("onPlaced", this.onPlaced);
    }

    public String toString() {
        return s.h(new StringBuilder("OnPlacedElement(onPlaced="), this.onPlaced, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnPlacedModifierImpl create() {
        return new OnPlacedModifierImpl(this.onPlaced);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnPlacedModifierImpl update(OnPlacedModifierImpl node) {
        kotlin.jvm.internal.m.h(node, "node");
        node.setCallback(this.onPlaced);
        return node;
    }
}
