package androidx.compose.ui.draw;

import androidx.appcompat.widget.v;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010(¨\u00069"}, d2 = {"Landroidx/compose/ui/draw/PainterModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/PainterModifierNode;", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "Landroidx/compose/ui/graphics/painter/Painter;", "component1", "", "component2", "Landroidx/compose/ui/Alignment;", "component3", "Landroidx/compose/ui/layout/ContentScale;", "component4", "", "component5", "Landroidx/compose/ui/graphics/ColorFilter;", "component6", "painter", "sizeToIntrinsics", "alignment", "contentScale", "alpha", "colorFilter", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "Z", "getSizeToIntrinsics", "()Z", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "F", "getAlpha", "()F", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getAutoInvalidate", "autoInvalidate", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class PainterModifierNodeElement extends ModifierNodeElement<PainterModifierNode> {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterModifierNodeElement(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        m.h(painter, "painter");
        m.h(alignment, "alignment");
        m.h(contentScale, "contentScale");
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    public static /* synthetic */ PainterModifierNodeElement copy$default(PainterModifierNodeElement painterModifierNodeElement, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            painter = painterModifierNodeElement.painter;
        }
        if ((i2 & 2) != 0) {
            z = painterModifierNodeElement.sizeToIntrinsics;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            alignment = painterModifierNodeElement.alignment;
        }
        Alignment alignment2 = alignment;
        if ((i2 & 8) != 0) {
            contentScale = painterModifierNodeElement.contentScale;
        }
        ContentScale contentScale2 = contentScale;
        if ((i2 & 16) != 0) {
            f = painterModifierNodeElement.alpha;
        }
        float f2 = f;
        if ((i2 & 32) != 0) {
            colorFilter = painterModifierNodeElement.colorFilter;
        }
        return painterModifierNodeElement.copy(painter, z2, alignment2, contentScale2, f2, colorFilter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Painter getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final PainterModifierNodeElement copy(Painter painter, boolean sizeToIntrinsics, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter) {
        m.h(painter, "painter");
        m.h(alignment, "alignment");
        m.h(contentScale, "contentScale");
        return new PainterModifierNodeElement(painter, sizeToIntrinsics, alignment, contentScale, alpha, colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterModifierNodeElement)) {
            return false;
        }
        PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) other;
        return m.c(this.painter, painterModifierNodeElement.painter) && this.sizeToIntrinsics == painterModifierNodeElement.sizeToIntrinsics && m.c(this.alignment, painterModifierNodeElement.alignment) && m.c(this.contentScale, painterModifierNodeElement.contentScale) && Float.compare(this.alpha, painterModifierNodeElement.alpha) == 0 && m.c(this.colorFilter, painterModifierNodeElement.colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean getAutoInvalidate() {
        return false;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.painter.hashCode() * 31;
        boolean z = this.sizeToIntrinsics;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iA = v.a(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + ((iHashCode + r1) * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.colorFilter;
        return iA + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        a.b.d(inspectorInfo, "<this>", "paint").set("painter", this.painter);
        androidx.compose.animation.b.c(this.sizeToIntrinsics, inspectorInfo.getProperties(), "sizeToIntrinsics", inspectorInfo).set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    public String toString() {
        return "PainterModifierNodeElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PainterModifierNode create() {
        return new PainterModifierNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PainterModifierNode update(PainterModifierNode node) {
        m.h(node, "node");
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z = this.sizeToIntrinsics;
        boolean z2 = sizeToIntrinsics != z || (z && !Size.m2650equalsimpl0(node.getPainter().mo3347getIntrinsicSizeNHjbRc(), this.painter.mo3347getIntrinsicSizeNHjbRc()));
        node.setPainter(this.painter);
        node.setSizeToIntrinsics(this.sizeToIntrinsics);
        node.setAlignment(this.alignment);
        node.setContentScale(this.contentScale);
        node.setAlpha(this.alpha);
        node.setColorFilter(this.colorFilter);
        if (z2) {
            LayoutModifierNodeKt.invalidateMeasurements(node);
        }
        DrawModifierNodeKt.invalidateDraw(node);
        return node;
    }
}
