package androidx.compose.ui.graphics;

import a.l;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bv\u0010qJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020'*\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J-\u00100\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J0\u00101\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u00104\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00105\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010:\u001a\u00020\u00022\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109JH\u0010?\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010@\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010F\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJE\u0010O\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ3\u0010V\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020+0R2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\b\u0010W\u001a\u00020\u0002H\u0016J\b\u0010X\u001a\u00020\u0002H\u0016J-\u0010\\\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020Y2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J-\u0010c\u001a\u00020\u00022\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ!\u0010V\u001a\u00020\u00022\f\u0010S\u001a\b\u0012\u0004\u0012\u00020+0R2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0001J)\u0010f\u001a\u00020\u00022\f\u0010S\u001a\b\u0012\u0004\u0012\u00020+0R2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010e\u001a\u00020dH\u0002ø\u0001\u0001J \u0010\\\u001a\u00020\u00022\u0006\u0010S\u001a\u00020Y2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010e\u001a\u00020dH\u0002J \u0010g\u001a\u00020\u00022\u0006\u0010S\u001a\u00020Y2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010e\u001a\u00020dH\u0002R,\u0010j\u001a\u00060hj\u0002`i8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010k\u0012\u0004\bp\u0010q\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/j;", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", TypedValues.PositionType.S_DRAWPATH, "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "", "stepBy", "drawLines", "drawRawLines", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidCanvas implements Canvas {
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private final Rect srcRect = new Rect();
    private final Rect dstRect = new Rect();

    private final void drawLines(List<Offset> list, Paint paint, int i2) {
        if (list.size() < 2) {
            return;
        }
        qj.d dVarY = l.y(l.C(0, list.size() - 1), i2);
        int i3 = dVarY.a;
        int i4 = dVarY.b;
        int i5 = dVarY.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            long packedValue = list.get(i3).getPackedValue();
            long packedValue2 = list.get(i3 + 1).getPackedValue();
            this.internalCanvas.drawLine(Offset.m2585getXimpl(packedValue), Offset.m2586getYimpl(packedValue), Offset.m2585getXimpl(packedValue2), Offset.m2586getYimpl(packedValue2), paint.getInternalPaint());
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long packedValue = list.get(i2).getPackedValue();
            this.internalCanvas.drawPoint(Offset.m2585getXimpl(packedValue), Offset.m2586getYimpl(packedValue), paint.getInternalPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i2) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        qj.d dVarY = l.y(l.C(0, fArr.length - 3), i2 * 2);
        int i3 = dVarY.a;
        int i4 = dVarY.b;
        int i5 = dVarY.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawLine(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], paint.getInternalPaint());
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i2) {
        if (fArr.length % 2 != 0) {
            return;
        }
        qj.d dVarY = l.y(l.C(0, fArr.length - 1), i2);
        int i3 = dVarY.a;
        int i4 = dVarY.b;
        int i5 = dVarY.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawPoint(fArr[i3], fArr[i3 + 1], paint.getInternalPaint());
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo2679clipPathmtrdDE(Path path, int clipOp) {
        m.h(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m2690toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo2680clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m2690toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public final /* synthetic */ void mo2681clipRectmtrdDE(androidx.compose.ui.geometry.Rect rect, int i2) {
        c.a(this, rect, i2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo2682concat58bKbWc(float[] matrix) {
        m.h(matrix, "matrix");
        if (MatrixKt.m3047isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m2697setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawArc(androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, Paint paint) {
        c.b(this, rect, f, f2, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawArcRad(androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, Paint paint) {
        c.c(this, rect, f, f2, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo2683drawCircle9KIMszo(long center, float radius, Paint paint) {
        m.h(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m2585getXimpl(center), Offset.m2586getYimpl(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo2684drawImaged4ec7I(ImageBitmap image, long topLeftOffset, Paint paint) {
        m.h(image, "image");
        m.h(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m2585getXimpl(topLeftOffset), Offset.m2586getYimpl(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo2685drawImageRectHPBpro0(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint) {
        m.h(image, "image");
        m.h(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.srcRect;
        rect.left = IntOffset.m5385getXimpl(srcOffset);
        rect.top = IntOffset.m5386getYimpl(srcOffset);
        rect.right = IntSize.m5427getWidthimpl(srcSize) + IntOffset.m5385getXimpl(srcOffset);
        rect.bottom = IntSize.m5426getHeightimpl(srcSize) + IntOffset.m5386getYimpl(srcOffset);
        j jVar = j.a;
        Rect rect2 = this.dstRect;
        rect2.left = IntOffset.m5385getXimpl(dstOffset);
        rect2.top = IntOffset.m5386getYimpl(dstOffset);
        rect2.right = IntSize.m5427getWidthimpl(dstSize) + IntOffset.m5385getXimpl(dstOffset);
        rect2.bottom = IntSize.m5426getHeightimpl(dstSize) + IntOffset.m5386getYimpl(dstOffset);
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo2686drawLineWko1d7g(long p1, long p2, Paint paint) {
        m.h(paint, "paint");
        this.internalCanvas.drawLine(Offset.m2585getXimpl(p1), Offset.m2586getYimpl(p1), Offset.m2585getXimpl(p2), Offset.m2586getYimpl(p2), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawOval(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        c.d(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        m.h(path, "path");
        m.h(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo2687drawPointsO7TthRY(int pointMode, List<Offset> points, Paint paint) {
        m.h(points, "points");
        m.h(paint, "paint");
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m3089equalsimpl0(pointMode, companion.m3093getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m3089equalsimpl0(pointMode, companion.m3095getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m3089equalsimpl0(pointMode, companion.m3094getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo2688drawRawPointsO7TthRY(int pointMode, float[] points, Paint paint) {
        m.h(points, "points");
        m.h(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m3089equalsimpl0(pointMode, companion.m3093getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m3089equalsimpl0(pointMode, companion.m3095getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m3089equalsimpl0(pointMode, companion.m3094getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawRect(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        c.e(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        m.h(paint, "paint");
        this.internalCanvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo2689drawVerticesTPEHhCM(Vertices vertices, int blendMode, Paint paint) {
        m.h(vertices, "vertices");
        m.h(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m2732toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        m.h(rect, "bounds");
        m.h(paint, "paint");
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f2) {
        this.internalCanvas.scale(f, f2);
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        m.h(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f, float f2) {
        this.internalCanvas.skew(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void skewRad(float f, float f2) {
        c.f(this, f, f2);
    }

    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m2690toRegionOp7u2Bmg(int i2) {
        return ClipOp.m2802equalsimpl0(i2, ClipOp.INSTANCE.m2806getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f2) {
        this.internalCanvas.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        m.h(paint, "paint");
        this.internalCanvas.drawArc(f, f2, f3, f4, f5, f6, z, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        m.h(paint, "paint");
        this.internalCanvas.drawOval(f, f2, f3, f4, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        m.h(paint, "paint");
        this.internalCanvas.drawRect(f, f2, f3, f4, paint.getInternalPaint());
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
