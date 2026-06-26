package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutIdModifier;", "", "component1", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "layoutId", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class LayoutIdModifierElement extends ModifierNodeElement<LayoutIdModifier> {
    private final Object layoutId;

    public LayoutIdModifierElement(Object obj) {
        kotlin.jvm.internal.m.h(obj, "layoutId");
        this.layoutId = obj;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Object getLayoutId() {
        return this.layoutId;
    }

    public static /* synthetic */ LayoutIdModifierElement copy$default(LayoutIdModifierElement layoutIdModifierElement, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = layoutIdModifierElement.layoutId;
        }
        return layoutIdModifierElement.copy(obj);
    }

    public final LayoutIdModifierElement copy(Object layoutId) {
        kotlin.jvm.internal.m.h(layoutId, "layoutId");
        return new LayoutIdModifierElement(layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutIdModifierElement) && kotlin.jvm.internal.m.c(this.layoutId, ((LayoutIdModifierElement) other).layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        kotlin.jvm.internal.m.h(inspectorInfo, "<this>");
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.layoutId);
    }

    public String toString() {
        return android.support.v4.media.a.h(new StringBuilder("LayoutIdModifierElement(layoutId="), this.layoutId, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutIdModifier update(LayoutIdModifier node) {
        kotlin.jvm.internal.m.h(node, "node");
        node.setLayoutId$ui_release(this.layoutId);
        return node;
    }
}
