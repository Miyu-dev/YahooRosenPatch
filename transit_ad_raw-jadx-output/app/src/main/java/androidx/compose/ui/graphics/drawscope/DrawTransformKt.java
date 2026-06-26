package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a,\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "Lkotlin/j;", "inset", "radians", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "rotateRad", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f, float f2) {
        m.h(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        m.h(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m3337rotateRad0AR0LA0(DrawTransform drawTransform, float f, long j) {
        m.h(drawTransform, "$this$rotateRad");
        drawTransform.mo3266rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m3338rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = drawTransform.mo3264getCenterF1C5BW0();
        }
        m.h(drawTransform, "$this$rotateRad");
        drawTransform.mo3266rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m3339scale0AR0LA0(DrawTransform drawTransform, float f, long j) {
        m.h(drawTransform, "$this$scale");
        drawTransform.mo3267scale0AR0LA0(f, f, j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m3340scale0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = drawTransform.mo3264getCenterF1C5BW0();
        }
        m.h(drawTransform, "$this$scale");
        drawTransform.mo3267scale0AR0LA0(f, f, j);
    }

    public static final void inset(DrawTransform drawTransform, float f) {
        m.h(drawTransform, "<this>");
        drawTransform.inset(f, f, f, f);
    }
}
