package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_android", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Android", "Landroidx/compose/material/icons/Icons$Filled;", "getAndroid", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AndroidKt {
    private static ImageVector _android;

    public static final ImageVector getAndroid(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _android;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Android", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.6f, 9.48f, 1.84f, -3.18f);
        pathBuilderA.curveToRelative(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f);
        pathBuilderA.curveToRelative(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f);
        pathBuilderA.lineToRelative(-1.88f, 3.24f);
        pathBuilderA.curveToRelative(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, 0.0f);
        pathBuilderA.lineTo(5.65f, 5.67f);
        pathBuilderA.curveToRelative(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f);
        pathBuilderA.curveTo(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f);
        pathBuilderA.lineTo(6.4f, 9.48f);
        pathBuilderA.curveTo(3.3f, 11.25f, 1.28f, 14.44f, 1.0f, 18.0f);
        pathBuilderA.horizontalLineToRelative(22.0f);
        pathBuilderA.curveTo(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.0f, 15.25f);
        pathBuilderA.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilderA.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveTo(8.25f, 13.31f, 8.25f, 14.0f);
        pathBuilderA.curveTo(8.25f, 14.69f, 7.69f, 15.25f, 7.0f, 15.25f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.0f, 15.25f);
        pathBuilderA.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilderA.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilderA.curveTo(18.25f, 14.69f, 17.69f, 15.25f, 17.0f, 15.25f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _android = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
