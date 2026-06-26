package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BlurKt {
    @Stable
    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m2478blur1fqSgw(Modifier modifier, final float f, final float f2, final Shape shape) {
        final boolean z;
        final int iM3162getDecal3opZhB0;
        m.h(modifier, "$this$blur");
        if (shape != null) {
            iM3162getDecal3opZhB0 = TileMode.INSTANCE.m3161getClamp3opZhB0();
            z = true;
        } else {
            z = false;
            iM3162getDecal3opZhB0 = TileMode.INSTANCE.m3162getDecal3opZhB0();
        }
        float f3 = 0;
        return ((Dp.m5266compareTo0680j_4(f, Dp.m5267constructorimpl(f3)) <= 0 || Dp.m5266compareTo0680j_4(f2, Dp.m5267constructorimpl(f3)) <= 0) && !z) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new l<GraphicsLayerScope, j>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
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
                float fMo348toPx0680j_4 = graphicsLayerScope.mo348toPx0680j_4(f);
                float fMo348toPx0680j_42 = graphicsLayerScope.mo348toPx0680j_4(f2);
                graphicsLayerScope.setRenderEffect((fMo348toPx0680j_4 <= 0.0f || fMo348toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m3096BlurEffect3YTHUZs(fMo348toPx0680j_4, fMo348toPx0680j_42, iM3162getDecal3opZhB0));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z);
            }
        });
    }

    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2479blur1fqSgw$default(Modifier modifier, float f, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2482boximpl(BlurredEdgeTreatment.INSTANCE.m2489getRectangleGoahg());
        }
        return m2478blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m2488unboximpl());
    }

    @Stable
    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m2480blurF8QBwvs(Modifier modifier, float f, Shape shape) {
        m.h(modifier, "$this$blur");
        return m2478blur1fqSgw(modifier, f, f, shape);
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2481blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2482boximpl(BlurredEdgeTreatment.INSTANCE.m2489getRectangleGoahg());
        }
        return m2480blurF8QBwvs(modifier, f, blurredEdgeTreatment.m2488unboximpl());
    }
}
