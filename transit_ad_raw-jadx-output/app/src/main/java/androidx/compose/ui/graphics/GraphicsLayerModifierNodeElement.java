package androidx.compose.ui.graphics;

import androidx.appcompat.widget.v;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b \b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0094\u0001\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010(\u001a\u00020\t\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010.\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\t\u0012\u0006\u00100\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\u0014\u0012\u0006\u00102\u001a\u00020\u0018\u0012\u0006\u00103\u001a\u00020\u001a\u0012\b\u00104\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u00105\u001a\u00020\u001e\u0012\u0006\u00106\u001a\u00020\u001e\u0012\u0006\u00107\u001a\u00020#ø\u0001\u0002¢\u0006\u0004\b]\u0010^J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\u0019\u0010\u0017\u001a\u00020\u0014HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0019\u0010 \u001a\u00020\u001eHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0019\u0010\"\u001a\u00020\u001eHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u0016J\u0019\u0010&\u001a\u00020#HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%JÂ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020\u00182\b\b\u0002\u00103\u001a\u00020\u001a2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00105\u001a\u00020\u001e2\b\b\u0002\u00106\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020#HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b8\u00109J\t\u0010<\u001a\u00020;HÖ\u0001J\t\u0010>\u001a\u00020=HÖ\u0001J\u0013\u0010A\u001a\u00020\u001a2\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003R\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010B\u001a\u0004\bE\u0010DR\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bF\u0010DR\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bG\u0010DR\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010B\u001a\u0004\bH\u0010DR\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\bI\u0010DR\u0017\u0010-\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010B\u001a\u0004\bJ\u0010DR\u0017\u0010.\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010B\u001a\u0004\bK\u0010DR\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\bL\u0010DR\u0017\u00100\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010B\u001a\u0004\bM\u0010DR \u00101\u001a\u00020\u00148\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bO\u0010\u0016R\u0017\u00102\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b2\u0010P\u001a\u0004\bQ\u0010RR\u0017\u00103\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u0019\u00104\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b4\u0010V\u001a\u0004\bW\u0010XR \u00105\u001a\u00020\u001e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\bY\u0010\u0016R \u00106\u001a\u00020\u001e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\bZ\u0010\u0016R \u00107\u001a\u00020#8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b7\u0010[\u001a\u0004\b\\\u0010%\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "create", "node", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectableProperties", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "Landroidx/compose/ui/graphics/TransformOrigin;", "component11-SzJe1aQ", "()J", "component11", "Landroidx/compose/ui/graphics/Shape;", "component12", "", "component13", "Landroidx/compose/ui/graphics/RenderEffect;", "component14", "Landroidx/compose/ui/graphics/Color;", "component15-0d7_KjU", "component15", "component16-0d7_KjU", "component16", "Landroidx/compose/ui/graphics/CompositingStrategy;", "component17--NrFUSI", "()I", "component17", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "shape", "clip", "renderEffect", "ambientShadowColor", "spotShadowColor", "compositingStrategy", "copy-JVvOYNQ", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "copy", "", "toString", "", "hashCode", "", "other", "equals", "F", "getScaleX", "()F", "getScaleY", "getAlpha", "getTranslationX", "getTranslationY", "getShadowElevation", "getRotationX", "getRotationY", "getRotationZ", "getCameraDistance", "J", "getTransformOrigin-SzJe1aQ", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Z", "getClip", "()Z", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "getAmbientShadowColor-0d7_KjU", "getSpotShadowColor-0d7_KjU", "I", "getCompositingStrategy--NrFUSI", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class GraphicsLayerModifierNodeElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component11-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component17--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerModifierNodeElement m2974copyJVvOYNQ(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy) {
        m.h(shape, "shape");
        return new GraphicsLayerModifierNodeElement(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerModifierNodeElement)) {
            return false;
        }
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) other;
        return Float.compare(this.scaleX, graphicsLayerModifierNodeElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerModifierNodeElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerModifierNodeElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerModifierNodeElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerModifierNodeElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerModifierNodeElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerModifierNodeElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerModifierNodeElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerModifierNodeElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerModifierNodeElement.cameraDistance) == 0 && TransformOrigin.m3173equalsimpl0(this.transformOrigin, graphicsLayerModifierNodeElement.transformOrigin) && m.c(this.shape, graphicsLayerModifierNodeElement.shape) && this.clip == graphicsLayerModifierNodeElement.clip && m.c(this.renderEffect, graphicsLayerModifierNodeElement.renderEffect) && Color.m2819equalsimpl0(this.ambientShadowColor, graphicsLayerModifierNodeElement.ambientShadowColor) && Color.m2819equalsimpl0(this.spotShadowColor, graphicsLayerModifierNodeElement.spotShadowColor) && CompositingStrategy.m2898equalsimpl0(this.compositingStrategy, graphicsLayerModifierNodeElement.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m2975getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m2976getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m2977getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m2978getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (this.shape.hashCode() + ((TransformOrigin.m3176hashCodeimpl(this.transformOrigin) + v.a(this.cameraDistance, v.a(this.rotationZ, v.a(this.rotationY, v.a(this.rotationX, v.a(this.shadowElevation, v.a(this.translationY, v.a(this.translationX, v.a(this.alpha, v.a(this.scaleY, Float.floatToIntBits(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31;
        boolean z = this.clip;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return CompositingStrategy.m2899hashCodeimpl(this.compositingStrategy) + androidx.browser.browseractions.a.b(this.spotShadowColor, androidx.browser.browseractions.a.b(this.ambientShadowColor, (i2 + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31, 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        a.b.d(inspectorInfo, "<this>", "graphicsLayer").set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m3166boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        androidx.compose.animation.b.c(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m2808boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m2808boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m2895boximpl(this.compositingStrategy));
    }

    public String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m3177toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m2826toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m2826toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m2900toStringimpl(this.compositingStrategy)) + ')';
    }

    private GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i2) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier update(SimpleGraphicsLayerModifier node) {
        m.h(node, "node");
        node.setScaleX(this.scaleX);
        node.setScaleY(this.scaleY);
        node.setAlpha(this.alpha);
        node.setTranslationX(this.translationX);
        node.setTranslationY(this.translationY);
        node.setShadowElevation(this.shadowElevation);
        node.setRotationX(this.rotationX);
        node.setRotationY(this.rotationY);
        node.setRotationZ(this.rotationZ);
        node.setCameraDistance(this.cameraDistance);
        node.m3122setTransformOrigin__ExYCQ(this.transformOrigin);
        node.setShape(this.shape);
        node.setClip(this.clip);
        node.setRenderEffect(this.renderEffect);
        node.m3119setAmbientShadowColor8_81llA(this.ambientShadowColor);
        node.m3121setSpotShadowColor8_81llA(this.spotShadowColor);
        node.m3120setCompositingStrategyaDBOjCE(this.compositingStrategy);
        node.invalidateLayerBlock();
        return node;
    }
}
