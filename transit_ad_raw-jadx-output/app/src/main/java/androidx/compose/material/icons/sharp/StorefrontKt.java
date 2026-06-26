package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Storefront.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_storefront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Storefront", "Landroidx/compose/material/icons/Icons$Sharp;", "getStorefront", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StorefrontKt {
    private static ImageVector _storefront;

    public static final ImageVector getStorefront(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _storefront;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Storefront", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(21.9f, 8.89f, 20.49f, 3.0f, -3.75f);
        pathBuilderL.horizontalLineToRelative(-2.01f);
        pathBuilderL.horizontalLineTo(13.0f);
        pathBuilderL.horizontalLineToRelative(-2.0f);
        pathBuilderL.horizontalLineTo(9.28f);
        pathBuilderL.horizontalLineTo(7.26f);
        pathBuilderL.horizontalLineTo(3.51f);
        pathBuilderL.lineTo(2.1f, 8.89f);
        pathBuilderL.curveToRelative(-0.24f, 1.02f, -0.02f, 2.06f, 0.62f, 2.88f);
        pathBuilderL.curveTo(2.8f, 11.88f, 2.91f, 11.96f, 3.0f, 12.06f);
        v.r(pathBuilderL, 21.0f, 18.0f, -8.94f);
        pathBuilderL.curveToRelative(0.09f, -0.09f, 0.2f, -0.18f, 0.28f, -0.28f);
        pathBuilderL.curveTo(21.92f, 10.96f, 22.15f, 9.91f, 21.9f, 8.89f);
        androidx.compose.animation.a.t(pathBuilderL, 7.02f, 5.0f, 6.44f, 9.86f);
        pathBuilderL.curveTo(6.36f, 10.51f, 5.84f, 11.0f, 5.23f, 11.0f);
        pathBuilderL.curveToRelative(-0.49f, 0.0f, -0.8f, -0.29f, -0.93f, -0.47f);
        pathBuilderL.curveToRelative(-0.26f, -0.33f, -0.35f, -0.76f, -0.25f, -1.17f);
        i.b(pathBuilderL, 5.09f, 5.0f, 7.02f);
        pathBuilderL.moveTo(18.91f, 5.0f);
        pathBuilderL.lineToRelative(1.05f, 4.36f);
        pathBuilderL.curveToRelative(0.1f, 0.42f, 0.01f, 0.84f, -0.25f, 1.17f);
        pathBuilderL.curveTo(19.57f, 10.71f, 19.27f, 11.0f, 18.77f, 11.0f);
        pathBuilderL.curveToRelative(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f);
        i.b(pathBuilderL, 16.98f, 5.0f, 18.91f);
        pathBuilderL.moveTo(15.51f, 9.52f);
        pathBuilderL.curveToRelative(0.05f, 0.39f, -0.07f, 0.78f, -0.33f, 1.07f);
        pathBuilderL.curveTo(14.95f, 10.85f, 14.63f, 11.0f, 14.22f, 11.0f);
        pathBuilderL.curveTo(13.55f, 11.0f, 13.0f, 10.41f, 13.0f, 9.69f);
        pathBuilderL.verticalLineTo(5.0f);
        pathBuilderL.horizontalLineToRelative(1.96f);
        pathBuilderL.lineTo(15.51f, 9.52f);
        pathBuilderL.close();
        pathBuilderL.moveTo(11.0f, 9.69f);
        pathBuilderL.curveTo(11.0f, 10.41f, 10.45f, 11.0f, 9.71f, 11.0f);
        pathBuilderL.curveToRelative(-0.34f, 0.0f, -0.65f, -0.15f, -0.89f, -0.41f);
        pathBuilderL.curveTo(8.57f, 10.3f, 8.45f, 9.91f, 8.49f, 9.52f);
        pathBuilderL.lineTo(9.04f, 5.0f);
        pathBuilderL.horizontalLineTo(11.0f);
        pathBuilderL.verticalLineTo(9.69f);
        pathBuilderL.close();
        pathBuilderL.moveTo(5.0f, 19.0f);
        pathBuilderL.verticalLineToRelative(-6.03f);
        pathBuilderL.curveTo(5.08f, 12.98f, 5.15f, 13.0f, 5.23f, 13.0f);
        pathBuilderL.curveToRelative(0.87f, 0.0f, 1.66f, -0.36f, 2.24f, -0.95f);
        pathBuilderL.curveToRelative(0.6f, 0.6f, 1.4f, 0.95f, 2.31f, 0.95f);
        pathBuilderL.curveToRelative(0.87f, 0.0f, 1.65f, -0.36f, 2.23f, -0.93f);
        pathBuilderL.curveToRelative(0.59f, 0.57f, 1.39f, 0.93f, 2.29f, 0.93f);
        pathBuilderL.curveToRelative(0.84f, 0.0f, 1.64f, -0.35f, 2.24f, -0.95f);
        pathBuilderL.curveToRelative(0.58f, 0.59f, 1.37f, 0.95f, 2.24f, 0.95f);
        pathBuilderL.curveToRelative(0.08f, 0.0f, 0.15f, -0.02f, 0.23f, -0.03f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderL, 19.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _storefront = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
