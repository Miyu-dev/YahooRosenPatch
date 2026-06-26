package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.internal.m;
import qj.d;
import qj.e;
import qj.f;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\bH\u0082\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\f\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\f\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\f\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\f\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\f\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\f\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\f\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\f\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\f\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\f\"\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!\"\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!\"\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!\"\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010!\"\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010!\"\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010!\"\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010!\"\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010!¨\u0006*"}, d2 = {"", "", "args", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "toPathNodes", "", "numArgs", "Lkotlin/Function1;", "nodeFor", "pathNodesFromArgs", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "I", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i2, l<? super float[], ? extends PathNode> lVar) {
        d dVarY = a.l.y(new f(0, fArr.length - i2), i2);
        ArrayList arrayList = new ArrayList(jj.a.Q0(dVarY, 10));
        e eVarD = dVarY.d();
        while (eVarD.c) {
            int iNextInt = eVarD.nextInt();
            float[] fArrT0 = n.t0(fArr, iNextInt, iNextInt + i2);
            Object relativeLineTo = (PathNode) lVar.invoke(fArrT0);
            if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.LineTo(fArrT0[0], fArrT0[1]);
            } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.RelativeLineTo(fArrT0[0], fArrT0[1]);
            }
            arrayList.add(relativeLineTo);
        }
        return arrayList;
    }

    public static final List<PathNode> toPathNodes(char c2, float[] fArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        m.h(fArr, "args");
        if (c2 == 'z' || c2 == 'Z') {
            return a.f.U(PathNode.Close.INSTANCE);
        }
        if (c2 == 'm') {
            d dVarY = a.l.y(new f(0, fArr.length - 2), 2);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY, 10));
            e eVarD = dVarY.d();
            while (eVarD.c) {
                int iNextInt = eVarD.nextInt();
                float[] fArrT0 = n.t0(fArr, iNextInt, iNextInt + 2);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArrT0[0], fArrT0[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(fArrT0[0], fArrT0[1]);
                } else if (iNextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArrT0[0], fArrT0[1]);
                }
                arrayList2.add(relativeMoveTo);
            }
        } else if (c2 == 'M') {
            d dVarY2 = a.l.y(new f(0, fArr.length - 2), 2);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY2, 10));
            e eVarD2 = dVarY2.d();
            while (eVarD2.c) {
                int iNextInt2 = eVarD2.nextInt();
                float[] fArrT02 = n.t0(fArr, iNextInt2, iNextInt2 + 2);
                PathNode moveTo = new PathNode.MoveTo(fArrT02[0], fArrT02[1]);
                if (iNextInt2 > 0) {
                    moveTo = new PathNode.LineTo(fArrT02[0], fArrT02[1]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && iNextInt2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(fArrT02[0], fArrT02[1]);
                }
                arrayList2.add(moveTo);
            }
        } else if (c2 == 'l') {
            d dVarY3 = a.l.y(new f(0, fArr.length - 2), 2);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY3, 10));
            e eVarD3 = dVarY3.d();
            while (eVarD3.c) {
                int iNextInt3 = eVarD3.nextInt();
                float[] fArrT03 = n.t0(fArr, iNextInt3, iNextInt3 + 2);
                PathNode relativeLineTo = new PathNode.RelativeLineTo(fArrT03[0], fArrT03[1]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt3 > 0) {
                    relativeLineTo = new PathNode.LineTo(fArrT03[0], fArrT03[1]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt3 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(fArrT03[0], fArrT03[1]);
                }
                arrayList2.add(relativeLineTo);
            }
        } else if (c2 == 'L') {
            d dVarY4 = a.l.y(new f(0, fArr.length - 2), 2);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY4, 10));
            e eVarD4 = dVarY4.d();
            while (eVarD4.c) {
                int iNextInt4 = eVarD4.nextInt();
                float[] fArrT04 = n.t0(fArr, iNextInt4, iNextInt4 + 2);
                PathNode lineTo = new PathNode.LineTo(fArrT04[0], fArrT04[1]);
                if ((lineTo instanceof PathNode.MoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.LineTo(fArrT04[0], fArrT04[1]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.RelativeLineTo(fArrT04[0], fArrT04[1]);
                }
                arrayList2.add(lineTo);
            }
        } else if (c2 == 'h') {
            d dVarY5 = a.l.y(new f(0, fArr.length - 1), 1);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY5, 10));
            e eVarD5 = dVarY5.d();
            while (eVarD5.c) {
                int iNextInt5 = eVarD5.nextInt();
                float[] fArrT05 = n.t0(fArr, iNextInt5, iNextInt5 + 1);
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(fArrT05[0]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(fArrT05[0], fArrT05[1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(fArrT05[0], fArrT05[1]);
                }
                arrayList2.add(relativeHorizontalTo);
            }
        } else if (c2 == 'H') {
            d dVarY6 = a.l.y(new f(0, fArr.length - 1), 1);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY6, 10));
            e eVarD6 = dVarY6.d();
            while (eVarD6.c) {
                int iNextInt6 = eVarD6.nextInt();
                float[] fArrT06 = n.t0(fArr, iNextInt6, iNextInt6 + 1);
                PathNode horizontalTo = new PathNode.HorizontalTo(fArrT06[0]);
                if ((horizontalTo instanceof PathNode.MoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.LineTo(fArrT06[0], fArrT06[1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(fArrT06[0], fArrT06[1]);
                }
                arrayList2.add(horizontalTo);
            }
        } else if (c2 == 'v') {
            d dVarY7 = a.l.y(new f(0, fArr.length - 1), 1);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY7, 10));
            e eVarD7 = dVarY7.d();
            while (eVarD7.c) {
                int iNextInt7 = eVarD7.nextInt();
                float[] fArrT07 = n.t0(fArr, iNextInt7, iNextInt7 + 1);
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(fArrT07[0]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(fArrT07[0], fArrT07[1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(fArrT07[0], fArrT07[1]);
                }
                arrayList2.add(relativeVerticalTo);
            }
        } else {
            if (c2 != 'V') {
                char c3 = 5;
                if (c2 == 'c') {
                    d dVarY8 = a.l.y(new f(0, fArr.length - 6), 6);
                    arrayList3 = new ArrayList(jj.a.Q0(dVarY8, 10));
                    e eVarD8 = dVarY8.d();
                    while (eVarD8.c) {
                        int iNextInt8 = eVarD8.nextInt();
                        float[] fArrT08 = n.t0(fArr, iNextInt8, iNextInt8 + 6);
                        PathNode relativeCurveTo = new PathNode.RelativeCurveTo(fArrT08[0], fArrT08[1], fArrT08[2], fArrT08[3], fArrT08[4], fArrT08[c3]);
                        arrayList3.add((!(relativeCurveTo instanceof PathNode.MoveTo) || iNextInt8 <= 0) ? (!(relativeCurveTo instanceof PathNode.RelativeMoveTo) || iNextInt8 <= 0) ? relativeCurveTo : new PathNode.RelativeLineTo(fArrT08[0], fArrT08[1]) : new PathNode.LineTo(fArrT08[0], fArrT08[1]));
                        c3 = 5;
                    }
                } else if (c2 == 'C') {
                    d dVarY9 = a.l.y(new f(0, fArr.length - 6), 6);
                    arrayList3 = new ArrayList(jj.a.Q0(dVarY9, 10));
                    e eVarD9 = dVarY9.d();
                    while (eVarD9.c) {
                        int iNextInt9 = eVarD9.nextInt();
                        float[] fArrT09 = n.t0(fArr, iNextInt9, iNextInt9 + 6);
                        PathNode curveTo = new PathNode.CurveTo(fArrT09[0], fArrT09[1], fArrT09[2], fArrT09[3], fArrT09[4], fArrT09[5]);
                        if ((curveTo instanceof PathNode.MoveTo) && iNextInt9 > 0) {
                            curveTo = new PathNode.LineTo(fArrT09[0], fArrT09[1]);
                        } else if ((curveTo instanceof PathNode.RelativeMoveTo) && iNextInt9 > 0) {
                            curveTo = new PathNode.RelativeLineTo(fArrT09[0], fArrT09[1]);
                        }
                        arrayList3.add(curveTo);
                    }
                } else if (c2 == 's') {
                    d dVarY10 = a.l.y(new f(0, fArr.length - 4), 4);
                    arrayList3 = new ArrayList(jj.a.Q0(dVarY10, 10));
                    e eVarD10 = dVarY10.d();
                    while (eVarD10.c) {
                        int iNextInt10 = eVarD10.nextInt();
                        float[] fArrT010 = n.t0(fArr, iNextInt10, iNextInt10 + 4);
                        PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(fArrT010[0], fArrT010[1], fArrT010[2], fArrT010[3]);
                        if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt10 > 0) {
                            relativeReflectiveCurveTo = new PathNode.LineTo(fArrT010[0], fArrT010[1]);
                        } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt10 > 0) {
                            relativeReflectiveCurveTo = new PathNode.RelativeLineTo(fArrT010[0], fArrT010[1]);
                        }
                        arrayList3.add(relativeReflectiveCurveTo);
                    }
                } else if (c2 == 'S') {
                    d dVarY11 = a.l.y(new f(0, fArr.length - 4), 4);
                    arrayList3 = new ArrayList(jj.a.Q0(dVarY11, 10));
                    e eVarD11 = dVarY11.d();
                    while (eVarD11.c) {
                        int iNextInt11 = eVarD11.nextInt();
                        float[] fArrT011 = n.t0(fArr, iNextInt11, iNextInt11 + 4);
                        PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(fArrT011[0], fArrT011[1], fArrT011[2], fArrT011[3]);
                        if ((reflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt11 > 0) {
                            reflectiveCurveTo = new PathNode.LineTo(fArrT011[0], fArrT011[1]);
                        } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt11 > 0) {
                            reflectiveCurveTo = new PathNode.RelativeLineTo(fArrT011[0], fArrT011[1]);
                        }
                        arrayList3.add(reflectiveCurveTo);
                    }
                } else if (c2 == 'q') {
                    d dVarY12 = a.l.y(new f(0, fArr.length - 4), 4);
                    arrayList3 = new ArrayList(jj.a.Q0(dVarY12, 10));
                    e eVarD12 = dVarY12.d();
                    while (eVarD12.c) {
                        int iNextInt12 = eVarD12.nextInt();
                        float[] fArrT012 = n.t0(fArr, iNextInt12, iNextInt12 + 4);
                        PathNode relativeQuadTo = new PathNode.RelativeQuadTo(fArrT012[0], fArrT012[1], fArrT012[2], fArrT012[3]);
                        if ((relativeQuadTo instanceof PathNode.MoveTo) && iNextInt12 > 0) {
                            relativeQuadTo = new PathNode.LineTo(fArrT012[0], fArrT012[1]);
                        } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt12 > 0) {
                            relativeQuadTo = new PathNode.RelativeLineTo(fArrT012[0], fArrT012[1]);
                        }
                        arrayList3.add(relativeQuadTo);
                    }
                } else if (c2 == 'Q') {
                    d dVarY13 = a.l.y(new f(0, fArr.length - 4), 4);
                    arrayList3 = new ArrayList(jj.a.Q0(dVarY13, 10));
                    e eVarD13 = dVarY13.d();
                    while (eVarD13.c) {
                        int iNextInt13 = eVarD13.nextInt();
                        float[] fArrT013 = n.t0(fArr, iNextInt13, iNextInt13 + 4);
                        PathNode quadTo = new PathNode.QuadTo(fArrT013[0], fArrT013[1], fArrT013[2], fArrT013[3]);
                        if ((quadTo instanceof PathNode.MoveTo) && iNextInt13 > 0) {
                            quadTo = new PathNode.LineTo(fArrT013[0], fArrT013[1]);
                        } else if ((quadTo instanceof PathNode.RelativeMoveTo) && iNextInt13 > 0) {
                            quadTo = new PathNode.RelativeLineTo(fArrT013[0], fArrT013[1]);
                        }
                        arrayList3.add(quadTo);
                    }
                } else if (c2 == 't') {
                    d dVarY14 = a.l.y(new f(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(jj.a.Q0(dVarY14, 10));
                    e eVarD14 = dVarY14.d();
                    while (eVarD14.c) {
                        int iNextInt14 = eVarD14.nextInt();
                        float[] fArrT014 = n.t0(fArr, iNextInt14, iNextInt14 + 2);
                        PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(fArrT014[0], fArrT014[1]);
                        if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt14 > 0) {
                            relativeReflectiveQuadTo = new PathNode.LineTo(fArrT014[0], fArrT014[1]);
                        } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt14 > 0) {
                            relativeReflectiveQuadTo = new PathNode.RelativeLineTo(fArrT014[0], fArrT014[1]);
                        }
                        arrayList2.add(relativeReflectiveQuadTo);
                    }
                } else {
                    if (c2 != 'T') {
                        if (c2 == 'a') {
                            d dVarY15 = a.l.y(new f(0, fArr.length - 7), 7);
                            arrayList = new ArrayList(jj.a.Q0(dVarY15, 10));
                            e eVarD15 = dVarY15.d();
                            while (eVarD15.c) {
                                int iNextInt15 = eVarD15.nextInt();
                                float[] fArrT015 = n.t0(fArr, iNextInt15, iNextInt15 + 7);
                                PathNode relativeArcTo = new PathNode.RelativeArcTo(fArrT015[0], fArrT015[1], fArrT015[2], Float.compare(fArrT015[3], 0.0f) != 0, Float.compare(fArrT015[4], 0.0f) != 0, fArrT015[5], fArrT015[6]);
                                if ((relativeArcTo instanceof PathNode.MoveTo) && iNextInt15 > 0) {
                                    relativeArcTo = new PathNode.LineTo(fArrT015[0], fArrT015[1]);
                                } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && iNextInt15 > 0) {
                                    relativeArcTo = new PathNode.RelativeLineTo(fArrT015[0], fArrT015[1]);
                                }
                                arrayList.add(relativeArcTo);
                            }
                        } else {
                            if (c2 != 'A') {
                                throw new IllegalArgumentException("Unknown command for: " + c2);
                            }
                            d dVarY16 = a.l.y(new f(0, fArr.length - 7), 7);
                            arrayList = new ArrayList(jj.a.Q0(dVarY16, 10));
                            e eVarD16 = dVarY16.d();
                            while (eVarD16.c) {
                                int iNextInt16 = eVarD16.nextInt();
                                float[] fArrT016 = n.t0(fArr, iNextInt16, iNextInt16 + 7);
                                PathNode arcTo = new PathNode.ArcTo(fArrT016[0], fArrT016[1], fArrT016[2], Float.compare(fArrT016[3], 0.0f) != 0, Float.compare(fArrT016[4], 0.0f) != 0, fArrT016[5], fArrT016[6]);
                                if ((arcTo instanceof PathNode.MoveTo) && iNextInt16 > 0) {
                                    arcTo = new PathNode.LineTo(fArrT016[0], fArrT016[1]);
                                } else if ((arcTo instanceof PathNode.RelativeMoveTo) && iNextInt16 > 0) {
                                    arcTo = new PathNode.RelativeLineTo(fArrT016[0], fArrT016[1]);
                                }
                                arrayList.add(arcTo);
                            }
                        }
                        return arrayList;
                    }
                    d dVarY17 = a.l.y(new f(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(jj.a.Q0(dVarY17, 10));
                    e eVarD17 = dVarY17.d();
                    while (eVarD17.c) {
                        int iNextInt17 = eVarD17.nextInt();
                        float[] fArrT017 = n.t0(fArr, iNextInt17, iNextInt17 + 2);
                        PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(fArrT017[0], fArrT017[1]);
                        if ((reflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt17 > 0) {
                            reflectiveQuadTo = new PathNode.LineTo(fArrT017[0], fArrT017[1]);
                        } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt17 > 0) {
                            reflectiveQuadTo = new PathNode.RelativeLineTo(fArrT017[0], fArrT017[1]);
                        }
                        arrayList2.add(reflectiveQuadTo);
                    }
                }
                return arrayList3;
            }
            d dVarY18 = a.l.y(new f(0, fArr.length - 1), 1);
            arrayList2 = new ArrayList(jj.a.Q0(dVarY18, 10));
            e eVarD18 = dVarY18.d();
            while (eVarD18.c) {
                int iNextInt18 = eVarD18.nextInt();
                float[] fArrT018 = n.t0(fArr, iNextInt18, iNextInt18 + 1);
                PathNode verticalTo = new PathNode.VerticalTo(fArrT018[0]);
                if ((verticalTo instanceof PathNode.MoveTo) && iNextInt18 > 0) {
                    verticalTo = new PathNode.LineTo(fArrT018[0], fArrT018[1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && iNextInt18 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(fArrT018[0], fArrT018[1]);
                }
                arrayList2.add(verticalTo);
            }
        }
        return arrayList2;
    }
}
