package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0099\u0001\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0084\u0001\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011H\u0086\bø\u0001\u0000\u001a1\u0010)\u001a\u00020(\"\u0004\b\u0000\u0010$*\u0012\u0012\u0004\u0012\u00028\u00000%j\b\u0012\u0004\u0012\u00028\u0000`&2\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*\u001a)\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010$*\u0012\u0012\u0004\u0012\u00028\u00000%j\b\u0012\u0004\u0012\u00028\u0000`&H\u0002¢\u0006\u0004\b+\u0010,\u001a)\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010$*\u0012\u0012\u0004\u0012\u00028\u00000%j\b\u0012\u0004\u0012\u00028\u0000`&H\u0002¢\u0006\u0004\b-\u0010,\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Lkotlin/j;", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkj/l;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "path", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "", "push", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "pop", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "peek", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ImageVectorKt {
    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, l<? super ImageVector.Builder, j> lVar) {
        m.h(builder, "<this>");
        m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        m.h(list, "clipPathData");
        m.h(lVar, "block");
        builder.addGroup(str, f, f2, f3, f4, f5, f6, f7, list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, l lVar, int i2, Object obj) {
        String str2 = (i2 & 1) != 0 ? "" : str;
        float f8 = (i2 & 2) != 0 ? 0.0f : f;
        float f9 = (i2 & 4) != 0 ? 0.0f : f2;
        float f10 = (i2 & 8) != 0 ? 0.0f : f3;
        float f11 = (i2 & 16) != 0 ? 1.0f : f4;
        float f12 = (i2 & 32) == 0 ? f5 : 1.0f;
        float f13 = (i2 & 64) != 0 ? 0.0f : f6;
        float f14 = (i2 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? 0.0f : f7;
        List emptyPath = (i2 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? VectorKt.getEmptyPath() : list;
        m.h(builder, "<this>");
        m.h(str2, HintConstants.AUTOFILL_HINT_NAME);
        m.h(emptyPath, "clipPathData");
        m.h(lVar, "block");
        builder.addGroup(str2, f8, f9, f10, f11, f12, f13, f14, emptyPath);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m3361pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, int i4, l<? super PathBuilder, j> lVar) {
        m.h(builder, "$this$path");
        m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        m.h(lVar, "pathBuilder");
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilder.getNodes(), i4, str, brush, f, brush2, f2, f3, i2, i3, f4, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m3362pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, int i4, l lVar, int i5, Object obj) {
        String str2 = (i5 & 1) != 0 ? "" : str;
        Brush brush3 = (i5 & 2) != 0 ? null : brush;
        float f5 = (i5 & 4) != 0 ? 1.0f : f;
        Brush brush4 = (i5 & 8) != 0 ? null : brush2;
        float f6 = (i5 & 16) != 0 ? 1.0f : f2;
        float f7 = (i5 & 32) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i5 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i5 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f8 = (i5 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? 4.0f : f4;
        int defaultFillType = (i5 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? VectorKt.getDefaultFillType() : i4;
        m.h(builder, "$this$path");
        m.h(str2, HintConstants.AUTOFILL_HINT_NAME);
        m.h(lVar, "pathBuilder");
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush3, f5, brush4, f6, f7, defaultStrokeLineCap, defaultStrokeLineJoin, f8, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
