package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a,\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a8\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a8\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001aC\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0011\u001aK\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aC\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0011\u001ac\u0010 \u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aC\u0010%\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u001a$\u0010'\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a8\u0010+\u001a\u00020\u0007*\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "left", "top", "right", "bottom", "Lkotlin/Function1;", "Lkotlin/j;", "block", "inset", "horizontal", "vertical", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkj/l;)V", "rotate", "radians", "rotateRad-Rg1IO4c", "rotateRad", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkj/l;)V", "scale", "scale-Rg1IO4c", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkj/l;)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkj/l;)V", "clipPath", "Landroidx/compose/ui/graphics/Canvas;", "drawIntoCanvas", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transformBlock", "drawBlock", "withTransform", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class DrawScopeKt {
    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m3320clipPathKD09W0M(DrawScope drawScope, Path path, int i2, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "$this$clipPath");
        m.h(path, "path");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3262clipPathmtrdDE(path, i2);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m3321clipPathKD09W0M$default(DrawScope drawScope, Path path, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        m.h(drawScope, "$this$clipPath");
        m.h(path, "path");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3262clipPathmtrdDE(path, i2);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m3322clipRectrOu3jXo(DrawScope drawScope, float f, float f2, float f3, float f4, int i2, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "$this$clipRect");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3263clipRectN_I0leg(f, f2, f3, f4, i2);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m3323clipRectrOu3jXo$default(DrawScope drawScope, float f, float f2, float f3, float f4, int i2, l lVar, int i3, Object obj) {
        float f5 = (i3 & 1) != 0 ? 0.0f : f;
        float f6 = (i3 & 2) != 0 ? 0.0f : f2;
        if ((i3 & 4) != 0) {
            f3 = Size.m2654getWidthimpl(drawScope.mo3254getSizeNHjbRc());
        }
        float f7 = f3;
        if ((i3 & 8) != 0) {
            f4 = Size.m2651getHeightimpl(drawScope.mo3254getSizeNHjbRc());
        }
        float f8 = f4;
        if ((i3 & 16) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        m.h(drawScope, "$this$clipRect");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3263clipRectN_I0leg(f5, f6, f7, f8, i2);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(DrawScope drawScope, l<? super Canvas, j> lVar) {
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        lVar.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f, float f2, float f3, float f4, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f, float f2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        lVar.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m3324rotateRg1IO4c(DrawScope drawScope, float f, long j, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "$this$rotate");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3266rotateUv8p0NA(f, j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3325rotateRg1IO4c$default(DrawScope drawScope, float f, long j, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = drawScope.mo3253getCenterF1C5BW0();
        }
        m.h(drawScope, "$this$rotate");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3266rotateUv8p0NA(f, j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m3326rotateRadRg1IO4c(DrawScope drawScope, float f, long j, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "$this$rotateRad");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3266rotateUv8p0NA(DegreesKt.degrees(f), j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3327rotateRadRg1IO4c$default(DrawScope drawScope, float f, long j, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = drawScope.mo3253getCenterF1C5BW0();
        }
        m.h(drawScope, "$this$rotateRad");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3266rotateUv8p0NA(DegreesKt.degrees(f), j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m3328scaleFgt4K4Q(DrawScope drawScope, float f, float f2, long j, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "$this$scale");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3267scale0AR0LA0(f, f2, j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m3329scaleFgt4K4Q$default(DrawScope drawScope, float f, float f2, long j, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = drawScope.mo3253getCenterF1C5BW0();
        }
        m.h(drawScope, "$this$scale");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3267scale0AR0LA0(f, f2, j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m3330scaleRg1IO4c(DrawScope drawScope, float f, long j, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "$this$scale");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3267scale0AR0LA0(f, f, j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3331scaleRg1IO4c$default(DrawScope drawScope, float f, long j, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = drawScope.mo3253getCenterF1C5BW0();
        }
        m.h(drawScope, "$this$scale");
        m.h(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3267scale0AR0LA0(f, f, j);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    public static final void translate(DrawScope drawScope, float f, float f2, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        drawScope.getDrawContext().getTransform().translate(f, f2);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f, float f2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        drawScope.getDrawContext().getTransform().translate(f, f2);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    public static final void withTransform(DrawScope drawScope, l<? super DrawTransform, j> lVar, l<? super DrawScope, j> lVar2) {
        m.h(drawScope, "<this>");
        m.h(lVar, "transformBlock");
        m.h(lVar2, "drawBlock");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        lVar.invoke(drawContext.getTransform());
        lVar2.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    public static final void inset(DrawScope drawScope, float f, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        lVar.invoke(drawScope);
        float f2 = -f;
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
    }

    public static final void inset(DrawScope drawScope, float f, float f2, l<? super DrawScope, j> lVar) {
        m.h(drawScope, "<this>");
        m.h(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        lVar.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }
}
