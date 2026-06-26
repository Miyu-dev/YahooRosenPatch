package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B*\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\tø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J$\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\tHÆ\u0003ø\u0001\u0000J.\u0010\u0010\u001a\u00020\u00002 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\tHÆ\u0001ø\u0001\u0000J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R2\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutModifierImpl;", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "component1", "measure", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lkj/q;", "getMeasure", "()Lkj/q;", "<init>", "(Lkj/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class LayoutModifierElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final q<MeasureScope, Measurable, Constraints, MeasureResult> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierElement(q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        kotlin.jvm.internal.m.h(qVar, "measure");
        this.measure = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutModifierElement copy$default(LayoutModifierElement layoutModifierElement, q qVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qVar = layoutModifierElement.measure;
        }
        return layoutModifierElement.copy(qVar);
    }

    public final q<MeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.measure;
    }

    public final LayoutModifierElement copy(q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        kotlin.jvm.internal.m.h(qVar, "measure");
        return new LayoutModifierElement(qVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutModifierElement) && kotlin.jvm.internal.m.c(this.measure, ((LayoutModifierElement) other).measure);
    }

    public final q<MeasureScope, Measurable, Constraints, MeasureResult> getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        a.b.d(inspectorInfo, "<this>", "layout").set("measure", this.measure);
    }

    public String toString() {
        return "LayoutModifierElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutModifierImpl update(LayoutModifierImpl node) {
        kotlin.jvm.internal.m.h(node, "node");
        node.setMeasureBlock(this.measure);
        return node;
    }
}
