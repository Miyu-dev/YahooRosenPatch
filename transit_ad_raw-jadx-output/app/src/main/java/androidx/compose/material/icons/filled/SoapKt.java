package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: Soap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_soap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Soap", "Landroidx/compose/material/icons/Icons$Filled;", "getSoap", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SoapKt {
    private static ImageVector _soap;

    public static final ImageVector getSoap(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Soap", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.12f, 5.0f, -7.18f, 6.79f);
        pathBuilderA.curveTo(1.34f, 12.35f, 1.0f, 13.14f, 1.0f, 13.97f);
        pathBuilderA.verticalLineTo(20.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.horizontalLineToRelative(6.25f);
        pathBuilderA.horizontalLineTo(12.0f);
        pathBuilderA.horizontalLineToRelative(5.75f);
        pathBuilderA.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        a.s(pathBuilderA, 12.0f, -1.0f, 7.75f);
        pathBuilderA.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        a.s(pathBuilderA, 12.0f, -1.0f, 8.75f);
        pathBuilderA.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        a.s(pathBuilderA, 12.0f, -1.0f, 6.75f);
        pathBuilderA.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveTo(19.44f, 10.0f, 18.75f, 10.0f);
        pathBuilderA.horizontalLineTo(8.86f);
        pathBuilderA.curveToRelative(0.64f, -1.11f, 1.48f, -2.58f, 1.49f, -2.61f);
        pathBuilderA.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        pathBuilderA.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilderA.curveTo(10.22f, 6.12f, 9.12f, 5.0f, 9.12f, 5.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 9.12f, 5.0f, 14.0f, 6.25f);
        pathBuilderA.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderA.reflectiveCurveTo(14.41f, 7.75f, 14.0f, 7.75f);
        pathBuilderA.reflectiveCurveTo(13.25f, 7.41f, 13.25f, 7.0f);
        pathBuilderA.reflectiveCurveTo(13.59f, 6.25f, 14.0f, 6.25f);
        pathBuilderA.moveTo(14.0f, 4.75f);
        pathBuilderA.curveToRelative(-1.24f, 0.0f, -2.25f, 1.01f, -2.25f, 2.25f);
        pathBuilderA.reflectiveCurveTo(12.76f, 9.25f, 14.0f, 9.25f);
        pathBuilderA.reflectiveCurveTo(16.25f, 8.24f, 16.25f, 7.0f);
        pathBuilderA.reflectiveCurveTo(15.24f, 4.75f, 14.0f, 4.75f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 14.0f, 4.75f, 19.75f, 5.5f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderA.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderA.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderA.reflectiveCurveTo(19.47f, 5.5f, 19.75f, 5.5f);
        pathBuilderA.moveTo(19.75f, 4.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveTo(20.85f, 4.0f, 19.75f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 19.75f, 4.0f, 16.5f, 1.0f);
        pathBuilderA.curveTo(15.67f, 1.0f, 15.0f, 1.67f, 15.0f, 2.5f);
        pathBuilderA.reflectiveCurveTo(15.67f, 4.0f, 16.5f, 4.0f);
        pathBuilderA.curveTo(17.33f, 4.0f, 18.0f, 3.33f, 18.0f, 2.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 17.33f, 1.0f, 16.5f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
