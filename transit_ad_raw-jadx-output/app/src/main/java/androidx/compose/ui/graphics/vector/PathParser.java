package androidx.compose.ui.graphics.vector;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002efB\u0007¢\u0006\u0004\bc\u0010dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0011\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0013\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0015\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0019\u001a\u00020\u0002*\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u001b\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u001d\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u001f\u001a\u00020\u0002*\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010!\u001a\u00020\u0002*\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010#\u001a\u00020\u0002*\u00020\"2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010'\u001a\u00020\u0002*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010)\u001a\u00020\u0002*\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010-\u001a\u00020\u0002*\u00020,2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u00100\u001a\u00020\u0002*\u00020.2\u0006\u0010/\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u00102\u001a\u00020\u0002*\u0002012\u0006\u0010/\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u00104\u001a\u00020\u0002*\u0002032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u00106\u001a\u00020\u0002*\u0002052\u0006\u0010\r\u001a\u00020\fH\u0002JX\u0010B\u001a\u00020\u00022\u0006\u00107\u001a\u00020\f2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u0002082\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u0002082\u0006\u0010>\u001a\u0002082\u0006\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%H\u0002JX\u0010I\u001a\u00020\u00022\u0006\u00107\u001a\u00020\f2\u0006\u0010C\u001a\u0002082\u0006\u0010D\u001a\u0002082\u0006\u0010=\u001a\u0002082\u0006\u0010>\u001a\u0002082\u0006\u0010E\u001a\u0002082\u0006\u0010F\u001a\u0002082\u0006\u0010?\u001a\u0002082\u0006\u0010G\u001a\u0002082\u0006\u0010H\u001a\u000208H\u0002J\u0018\u0010N\u001a\u00020\u00022\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0002J\u0018\u0010R\u001a\u00020P2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020PH\u0002J\u0010\u0010S\u001a\u00020L2\u0006\u0010O\u001a\u00020\u0004H\u0002J \u0010U\u001a\u00020L2\u0006\u0010T\u001a\u00020L2\u0006\u0010G\u001a\u00020P2\u0006\u0010Q\u001a\u00020PH\u0002J \u0010X\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00042\u0006\u0010G\u001a\u00020P2\u0006\u0010W\u001a\u00020VH\u0002J\f\u0010Z\u001a\u00020Y*\u00020YH\u0002J\f\u0010Z\u001a\u000208*\u000208H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010a\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0014\u0010b\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010_¨\u0006g"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "Lkotlin/j;", "clear", "", "pathData", "parsePathString", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "toNodes", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "toPath", "close", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "relativeMoveTo", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "moveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "relativeLineTo", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "lineTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "relativeHorizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "horizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "relativeVerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "verticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "relativeCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "curveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "prevIsCurve", "relativeReflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "reflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "relativeQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "quadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "prevIsQuad", "relativeReflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "reflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "relativeArcTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "arcTo", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "isMoreThanHalf", "isPositiveArc", "drawArc", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "", "cmd", "", "args", "addNode", "s", "", "end", "nextStart", "getFloats", "original", "copyOfRange", "Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "result", "extract", "", "toRadians", "", "Ljava/util/List;", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "currentPoint", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "ctrlPoint", "segmentPoint", "reflectiveCtrlPoint", "<init>", "()V", "ExtractFloatResult", "PathPoint", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class PathParser {
    private final PathPoint ctrlPoint;
    private final PathPoint currentPoint;
    private final List<PathNode> nodes = new ArrayList();
    private final PathPoint reflectiveCtrlPoint;
    private final PathPoint segmentPoint;

    /* JADX INFO: compiled from: PathParser.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "", "endPosition", "", "endWithNegativeOrDot", "", "(IZ)V", "getEndPosition", "()I", "setEndPosition", "(I)V", "getEndWithNegativeOrDot", "()Z", "setEndWithNegativeOrDot", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final /* data */ class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        /* JADX WARN: Multi-variable type inference failed */
        public ExtractFloatResult() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public static /* synthetic */ ExtractFloatResult copy$default(ExtractFloatResult extractFloatResult, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = extractFloatResult.endPosition;
            }
            if ((i3 & 2) != 0) {
                z = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.copy(i2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getEndPosition() {
            return this.endPosition;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        public final ExtractFloatResult copy(int endPosition, boolean endWithNegativeOrDot) {
            return new ExtractFloatResult(endPosition, endWithNegativeOrDot);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) other;
            return this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i2 = this.endPosition * 31;
            boolean z = this.endWithNegativeOrDot;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i2 + r1;
        }

        public final void setEndPosition(int i2) {
            this.endPosition = i2;
        }

        public final void setEndWithNegativeOrDot(boolean z) {
            this.endWithNegativeOrDot = z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ExtractFloatResult(endPosition=");
            sb.append(this.endPosition);
            sb.append(", endWithNegativeOrDot=");
            return androidx.compose.animation.a.d(sb, this.endWithNegativeOrDot, ')');
        }

        public ExtractFloatResult(int i2, boolean z) {
            this.endPosition = i2;
            this.endWithNegativeOrDot = z;
        }

        public /* synthetic */ ExtractFloatResult(int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: compiled from: PathParser.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "", "Lkotlin/j;", "reset", "", "component1", "component2", "x", "y", "copy", "", "toString", "", "hashCode", "other", "", "equals", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class PathPoint {
        private float x;
        private float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public PathPoint() {
            float f = 0.0f;
            this(f, f, 3, null);
        }

        public static /* synthetic */ PathPoint copy$default(PathPoint pathPoint, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = pathPoint.x;
            }
            if ((i2 & 2) != 0) {
                f2 = pathPoint.y;
            }
            return pathPoint.copy(f, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final PathPoint copy(float x, float y) {
            return new PathPoint(x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) other;
            return Float.compare(this.x, pathPoint.x) == 0 && Float.compare(this.y, pathPoint.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        public final void reset() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PathPoint(x=");
            sb.append(this.x);
            sb.append(", y=");
            return h.g(sb, this.y, ')');
        }

        public PathPoint(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public /* synthetic */ PathPoint(float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2);
        }
    }

    public PathParser() {
        float f = 0.0f;
        int i2 = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.currentPoint = new PathPoint(f, f, i2, defaultConstructorMarker);
        this.ctrlPoint = new PathPoint(f, f, i2, defaultConstructorMarker);
        this.segmentPoint = new PathPoint(f, f, i2, defaultConstructorMarker);
        this.reflectiveCtrlPoint = new PathPoint(f, f, i2, defaultConstructorMarker);
    }

    private final void addNode(char c2, float[] fArr) {
        this.nodes.addAll(PathNodeKt.toPathNodes(c2, fArr));
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * dCos;
        double d14 = d4 * dSin;
        double d15 = (d13 * dSin2) - (d14 * dCos2);
        double d16 = d12 * dSin;
        double d17 = d4 * dCos;
        double d18 = (dCos2 * d17) + (dSin2 * d16);
        double d19 = d9 / ((double) iCeil);
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i2 = 0;
        double d23 = d6;
        double d24 = d8;
        while (i2 < iCeil) {
            double d25 = d24 + d19;
            double dSin3 = Math.sin(d25);
            double dCos3 = Math.cos(d25);
            int i3 = iCeil;
            double d26 = (((d10 * dCos) * dCos3) + d) - (d14 * dSin3);
            double d27 = (d17 * dSin3) + (d10 * dSin * dCos3) + d2;
            double d28 = (d13 * dSin3) - (d14 * dCos3);
            double d29 = (dCos3 * d17) + (dSin3 * d16);
            double d30 = d25 - d24;
            double dTan = Math.tan(d30 / ((double) 2));
            double dSqrt = ((Math.sqrt(((3.0d * dTan) * dTan) + d11) - ((double) 1)) * Math.sin(d30)) / ((double) 3);
            path.cubicTo((float) ((d22 * dSqrt) + d20), (float) ((d21 * dSqrt) + d23), (float) (d26 - (dSqrt * d28)), (float) (d27 - (dSqrt * d29)), (float) d26, (float) d27);
            i2++;
            d19 = d19;
            dSin = dSin;
            d23 = d27;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            dCos = dCos;
            d10 = d3;
            iCeil = i3;
        }
    }

    private final void close(Path path) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        path.close();
        path.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int length = original.length;
        if (start < 0 || start > length) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = end - start;
        int iMin = Math.min(i2, length - start);
        float[] fArr = new float[i2];
        System.arraycopy(original, start, fArr, 0, (iMin + start) - start);
        return fArr;
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double radians = toRadians(d7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((d2 * dSin) + (d * dCos)) / d5;
        double d11 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d12 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d13 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        double d16 = 2;
        double d17 = (d10 + d12) / d16;
        double d18 = (d11 + d13) / d16;
        double d19 = (d15 * d15) + (d14 * d14);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d20);
        double d21 = d14 * dSqrt2;
        double d22 = dSqrt2 * d15;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d11 - d9, d10 - d8);
        double dAtan22 = Math.atan2(d13 - d9, d12 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        arcToBezier(path, (d23 * dCos) - (d24 * dSin), (d24 * dCos) + (d23 * dSin), d5, d6, d, d2, radians, dAtan2, dAtan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 BREAK  A[LOOP:0: B:3:0x0008->B:36:0x0051], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void extract(java.lang.String r9, int r10, androidx.compose.ui.graphics.vector.PathParser.ExtractFloatResult r11) {
        /*
            r8 = this;
            r0 = 0
            r11.setEndWithNegativeOrDot(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L54
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L19
        L17:
            r6 = r7
            goto L1f
        L19:
            r6 = 44
            if (r5 != r6) goto L1e
            goto L17
        L1e:
            r6 = r0
        L1f:
            if (r6 == 0) goto L24
        L21:
            r2 = r0
            r4 = r7
            goto L4e
        L24:
            r6 = 45
            if (r5 != r6) goto L30
            if (r1 == r10) goto L4d
            if (r2 != 0) goto L4d
            r11.setEndWithNegativeOrDot(r7)
            goto L21
        L30:
            r2 = 46
            if (r5 != r2) goto L3d
            if (r3 != 0) goto L39
            r2 = r0
            r3 = r7
            goto L4e
        L39:
            r11.setEndWithNegativeOrDot(r7)
            goto L21
        L3d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L49
        L43:
            r2 = 69
            if (r5 != r2) goto L48
            goto L41
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L4d
            r2 = r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r4 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L8
        L54:
            r11.setEndPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathParser.extract(java.lang.String, int, androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float[] getFloats(String s) {
        int i2 = 0;
        Object[] objArr = 0;
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[s.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(i2, objArr == true ? 1 : 0, 3, null);
        int length = s.length();
        int i3 = 1;
        int i4 = 0;
        while (i3 < length) {
            extract(s, i3, extractFloatResult);
            int endPosition = extractFloatResult.getEndPosition();
            if (i3 < endPosition) {
                String strSubstring = s.substring(i3, endPosition);
                m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i4] = Float.parseFloat(strSubstring);
                i4++;
            }
            i3 = extractFloatResult.getEndWithNegativeOrDot() ? endPosition : endPosition + 1;
        }
        return copyOfRange(fArr, 0, i4);
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int nextStart(java.lang.String r4, int r5) {
        /*
            r3 = this;
        L0:
            int r0 = r4.length()
            if (r5 >= r0) goto L24
            char r0 = r4.charAt(r5)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r2 = r2 * r1
            if (r2 <= 0) goto L18
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r2 = r2 * r1
            if (r2 > 0) goto L21
        L18:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L21
            r1 = 69
            if (r0 == r1) goto L21
            return r5
        L21:
            int r5 = r5 + 1
            goto L0
        L24:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathParser.nextStart(java.lang.String, int):int");
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(relativeCurveTo.getDx2() + this.currentPoint.getX());
        this.ctrlPoint.setY(relativeCurveTo.getDy2() + this.currentPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeCurveTo.getDx3() + pathPoint.getX());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(relativeCurveTo.getDy3() + pathPoint2.getY());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeHorizontalTo.getDx() + pathPoint.getX());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeLineTo.getDx() + pathPoint.getX());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(relativeLineTo.getDy() + pathPoint2.getY());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeMoveTo.getDx() + pathPoint.getX());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(relativeMoveTo.getDy() + pathPoint2.getY());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(relativeQuadTo.getDx1() + this.currentPoint.getX());
        this.ctrlPoint.setY(relativeQuadTo.getDy1() + this.currentPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeQuadTo.getDx2() + pathPoint.getX());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(relativeQuadTo.getDy2() + pathPoint2.getY());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(relativeReflectiveCurveTo.getDx1() + this.currentPoint.getX());
        this.ctrlPoint.setY(relativeReflectiveCurveTo.getDy1() + this.currentPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeReflectiveCurveTo.getDx2() + pathPoint.getX());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(relativeReflectiveCurveTo.getDy2() + pathPoint2.getY());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(relativeReflectiveQuadTo.getDx() + pathPoint.getX());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(relativeReflectiveQuadTo.getDy() + pathPoint2.getY());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(relativeVerticalTo.getDy() + pathPoint.getY());
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    private final double toRadians(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    public final PathParser addPathNodes(List<? extends PathNode> nodes) {
        m.h(nodes, "nodes");
        this.nodes.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    public final PathParser parsePathString(String pathData) {
        m.h(pathData, "pathData");
        this.nodes.clear();
        int i2 = 0;
        int i3 = 1;
        while (i3 < pathData.length()) {
            int iNextStart = nextStart(pathData, i3);
            String strSubstring = pathData.substring(i2, iNextStart);
            m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = m.j(strSubstring.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            String string = strSubstring.subSequence(i4, length + 1).toString();
            if (string.length() > 0) {
                addNode(string.charAt(0), getFloats(string));
            }
            i2 = iNextStart;
            i3 = iNextStart + 1;
        }
        if (i3 - i2 == 1 && i2 < pathData.length()) {
            addNode(pathData.charAt(i2), new float[0]);
        }
        return this;
    }

    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    public final Path toPath(Path target) {
        m.h(target, TypedValues.AttributesType.S_TARGET);
        target.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List<PathNode> list = this.nodes;
        int size = list.size();
        PathNode pathNode = null;
        int i2 = 0;
        while (i2 < size) {
            PathNode pathNode2 = list.get(i2);
            if (pathNode == null) {
                pathNode = pathNode2;
            }
            if (pathNode2 instanceof PathNode.Close) {
                close(target);
            } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.MoveTo) {
                moveTo((PathNode.MoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                relativeLineTo((PathNode.RelativeLineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.LineTo) {
                lineTo((PathNode.LineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                horizontalTo((PathNode.HorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.VerticalTo) {
                verticalTo((PathNode.VerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.CurveTo) {
                curveTo((PathNode.CurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                m.e(pathNode);
                relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                m.e(pathNode);
                reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.QuadTo) {
                quadTo((PathNode.QuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                m.e(pathNode);
                relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                m.e(pathNode);
                reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                relativeArcTo((PathNode.RelativeArcTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.ArcTo) {
                arcTo((PathNode.ArcTo) pathNode2, target);
            }
            i2++;
            pathNode = pathNode2;
        }
        return target;
    }

    private final float toRadians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }
}
