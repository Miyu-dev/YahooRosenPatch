package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: AddLink.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addLink", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddLink", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddLink", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddLinkKt {
    private static ImageVector _addLink;

    public static final ImageVector getAddLink(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _addLink;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddLink", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(9.0f, 11.0f, 6.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(8.0f, 11.45f, 8.45f, 11.0f, 9.0f, 11.0f);
        a.t(pathBuilderB, 20.93f, 12.0f, 20.93f, 12.0f);
        pathBuilderB.curveToRelative(0.62f, 0.0f, 1.07f, -0.59f, 0.93f, -1.19f);
        pathBuilderB.curveTo(21.32f, 8.62f, 19.35f, 7.0f, 17.0f, 7.0f);
        pathBuilderB.horizontalLineToRelative(-3.05f);
        pathBuilderB.curveTo(13.43f, 7.0f, 13.0f, 7.43f, 13.0f, 7.95f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.52f, 0.43f, 0.95f, 0.95f, 0.95f);
        pathBuilderB.horizontalLineTo(17.0f);
        pathBuilderB.curveToRelative(1.45f, 0.0f, 2.67f, 1.0f, 3.01f, 2.34f);
        pathBuilderB.curveTo(20.12f, 11.68f, 20.48f, 12.0f, 20.93f, 12.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(3.96f, 11.38f);
        pathBuilderB.curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f);
        pathBuilderB.lineToRelative(2.93f, 0.0f);
        pathBuilderB.curveTo(10.57f, 8.9f, 11.0f, 8.47f, 11.0f, 7.95f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(11.0f, 7.43f, 10.57f, 7.0f, 10.05f, 7.0f);
        pathBuilderB.lineTo(7.22f, 7.0f);
        pathBuilderB.curveToRelative(-2.61f, 0.0f, -4.94f, 1.91f, -5.19f, 4.51f);
        pathBuilderB.curveTo(1.74f, 14.49f, 4.08f, 17.0f, 7.0f, 17.0f);
        pathBuilderB.horizontalLineToRelative(3.05f);
        pathBuilderB.curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.52f, -0.43f, -0.95f, -0.95f, -0.95f);
        pathBuilderB.horizontalLineTo(7.0f);
        pathBuilderB.curveTo(5.09f, 15.1f, 3.58f, 13.36f, 3.96f, 11.38f);
        a.t(pathBuilderB, 18.0f, 12.0f, 18.0f, 12.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.horizontalLineToRelative(-2.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(-2.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(-2.0f);
        pathBuilderB.verticalLineToRelative(-2.0f);
        pathBuilderB.curveTo(19.0f, 12.45f, 18.55f, 12.0f, 18.0f, 12.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLink = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
