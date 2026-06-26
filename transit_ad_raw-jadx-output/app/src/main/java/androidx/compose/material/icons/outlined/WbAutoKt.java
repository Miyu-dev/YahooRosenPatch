package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: WbAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbAuto", "Landroidx/compose/material/icons/Icons$Outlined;", "getWbAuto", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbAutoKt {
    private static ImageVector _wbAuto;

    public static final ImageVector getWbAuto(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wbAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = b.p(7.0f, 7.0f, -3.2f, 9.0f, 1.9f);
        pathBuilderP.lineToRelative(0.7f, -2.0f);
        a.B(pathBuilderP, 3.2f, 0.7f, 2.0f, 1.9f);
        android.support.v4.media.a.C(pathBuilderP, 9.0f, 7.0f, 7.0f, 7.0f);
        pathBuilderP.moveTo(6.85f, 12.65f);
        pathBuilderP.lineTo(8.0f, 9.0f);
        v.x(pathBuilderP, 1.15f, 3.65f, -2.3f);
        pathBuilderP.moveTo(22.0f, 7.0f);
        pathBuilderP.lineToRelative(-1.2f, 6.29f);
        pathBuilderP.lineTo(19.3f, 7.0f);
        pathBuilderP.horizontalLineToRelative(-1.6f);
        pathBuilderP.lineToRelative(-1.49f, 6.29f);
        pathBuilderP.lineTo(15.0f, 7.0f);
        pathBuilderP.horizontalLineToRelative(-0.76f);
        pathBuilderP.lineToRelative(-0.01f, 0.01f);
        pathBuilderP.curveTo(12.76f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f);
        pathBuilderP.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderP.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilderP.curveToRelative(2.96f, 0.0f, 5.55f, -1.61f, 6.93f, -4.0f);
        pathBuilderP.curveToRelative(0.03f, -0.06f, 0.05f, -0.12f, 0.08f, -0.18f);
        pathBuilderP.curveToRelative(0.05f, -0.08f, 0.09f, -0.17f, 0.14f, -0.25f);
        pathBuilderP.lineToRelative(0.1f, 0.43f);
        pathBuilderP.lineTo(17.0f, 16.0f);
        pathBuilderP.lineToRelative(1.5f, -6.1f);
        pathBuilderP.lineTo(20.0f, 16.0f);
        pathBuilderP.horizontalLineToRelative(1.75f);
        s.r(pathBuilderP, 2.05f, -9.0f, 22.0f, 7.0f);
        pathBuilderP.moveTo(13.37f, 14.67f);
        pathBuilderP.curveTo(12.38f, 16.64f, 10.35f, 18.0f, 8.0f, 18.0f);
        pathBuilderP.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderP.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderP.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilderP.curveToRelative(0.0f, 0.96f, -0.23f, 1.86f, -0.63f, 2.67f);
        pathBuilderP.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderP.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
