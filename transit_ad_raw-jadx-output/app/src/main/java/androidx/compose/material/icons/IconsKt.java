package androidx.compose.material.icons;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Icons.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u001aO\u0010\u0011\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0012\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "block", "Landroidx/compose/ui/graphics/vector/ImageVector;", "materialIcon", "", "fillAlpha", "strokeAlpha", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Lkotlin/j;", "pathBuilder", "materialPath-YwgOQQI", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;FFILkj/l;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "materialPath", "MaterialIconDimension", "F", "getMaterialIconDimension$annotations", "()V", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static final ImageVector materialIcon(String str, l<? super ImageVector.Builder, ImageVector.Builder> lVar) {
        m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        m.h(lVar, "block");
        return ((ImageVector.Builder) lVar.invoke(new ImageVector.Builder(str, Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null))).build();
    }

    /* JADX INFO: renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1003materialPathYwgOQQI(ImageVector.Builder builder, float f, float f2, int i2, l<? super PathBuilder, j> lVar) {
        m.h(builder, "$this$materialPath");
        m.h(lVar, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilder.getNodes(), i2, "", solidColor, f, null, f2, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1004materialPathYwgOQQI$default(ImageVector.Builder builder, float f, float f2, int i2, l lVar, int i3, Object obj) {
        float f3 = (i3 & 1) != 0 ? 1.0f : f;
        float f4 = (i3 & 2) != 0 ? 1.0f : f2;
        int defaultFillType = (i3 & 4) != 0 ? VectorKt.getDefaultFillType() : i2;
        m.h(builder, "$this$materialPath");
        m.h(lVar, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f3, null, f4, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }
}
