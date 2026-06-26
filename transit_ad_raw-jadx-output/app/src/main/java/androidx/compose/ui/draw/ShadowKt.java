package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShadowKt {
    @Stable
    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m2498shadows4CzXII(Modifier modifier, final float f, final Shape shape, final boolean z, final long j, final long j2) {
        m.h(modifier, "$this$shadow");
        m.h(shape, "shape");
        if (Dp.m5266compareTo0680j_4(f, Dp.m5267constructorimpl(0)) > 0 || z) {
            return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(InspectorInfo inspectorInfo) {
                    androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "shadow"), "elevation", inspectorInfo).set("shape", shape);
                    androidx.compose.animation.b.c(z, inspectorInfo.getProperties(), "clip", inspectorInfo).set("ambientColor", Color.m2808boximpl(j));
                    inspectorInfo.getProperties().set("spotColor", Color.m2808boximpl(j2));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return j.a;
                }
            } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new l<GraphicsLayerScope, j>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GraphicsLayerScope) obj);
                    return j.a;
                }

                public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                    m.h(graphicsLayerScope, "$this$graphicsLayer");
                    graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo348toPx0680j_4(f));
                    graphicsLayerScope.setShape(shape);
                    graphicsLayerScope.setClip(z);
                    graphicsLayerScope.mo2984setAmbientShadowColor8_81llA(j);
                    graphicsLayerScope.mo2986setSpotShadowColor8_81llA(j2);
                }
            }));
        }
        return modifier;
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2499shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z, long j, long j2, int i2, Object obj) {
        boolean z2;
        Shape rectangleShape = (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i2 & 4) != 0) {
            z2 = false;
            if (Dp.m5266compareTo0680j_4(f, Dp.m5267constructorimpl(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return m2498shadows4CzXII(modifier, f, rectangleShape, z2, (i2 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j, (i2 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2);
    }

    @Stable
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m2500shadowziNgDLE(Modifier modifier, float f, Shape shape, boolean z) {
        m.h(modifier, "$this$shadow");
        m.h(shape, "shape");
        return m2498shadows4CzXII(modifier, f, shape, z, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2501shadowziNgDLE$default(Modifier modifier, float f, Shape shape, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            z = false;
            if (Dp.m5266compareTo0680j_4(f, Dp.m5267constructorimpl(0)) > 0) {
                z = true;
            }
        }
        return m2500shadowziNgDLE(modifier, f, shape, z);
    }
}
