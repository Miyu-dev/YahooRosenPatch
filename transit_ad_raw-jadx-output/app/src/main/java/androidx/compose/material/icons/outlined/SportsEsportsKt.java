package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SportsEsports.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsEsports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsEsports", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsEsports", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsEsportsKt {
    private static ImageVector _sportsEsports;

    public static final ImageVector getSportsEsports(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sportsEsports;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsEsports", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.58f, 16.09f, -1.09f, -7.66f);
        pathBuilderA.curveTo(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        pathBuilderA.horizontalLineTo(7.47f);
        pathBuilderA.curveTo(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        pathBuilderA.lineToRelative(-1.09f, 7.66f);
        pathBuilderA.curveTo(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.68f, 0.0f, 1.32f, -0.27f, 1.8f, -0.75f);
        pathBuilderA.lineTo(9.0f, 16.0f);
        pathBuilderA.horizontalLineToRelative(6.0f);
        pathBuilderA.lineToRelative(2.25f, 2.25f);
        pathBuilderA.curveToRelative(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveTo(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.48f, 16.81f);
        pathBuilderA.curveTo(19.4f, 16.9f, 19.27f, 17.0f, 19.06f, 17.0f);
        pathBuilderA.curveToRelative(-0.15f, 0.0f, -0.29f, -0.06f, -0.39f, -0.16f);
        pathBuilderA.lineTo(15.83f, 14.0f);
        pathBuilderA.horizontalLineTo(8.17f);
        pathBuilderA.lineToRelative(-2.84f, 2.84f);
        pathBuilderA.curveTo(5.23f, 16.94f, 5.09f, 17.0f, 4.94f, 17.0f);
        pathBuilderA.curveToRelative(-0.21f, 0.0f, -0.34f, -0.1f, -0.42f, -0.19f);
        pathBuilderA.curveToRelative(-0.08f, -0.09f, -0.16f, -0.23f, -0.13f, -0.44f);
        pathBuilderA.lineToRelative(1.09f, -7.66f);
        pathBuilderA.curveTo(5.63f, 7.74f, 6.48f, 7.0f, 7.47f, 7.0f);
        pathBuilderA.horizontalLineToRelative(9.06f);
        pathBuilderA.curveToRelative(0.99f, 0.0f, 1.84f, 0.74f, 1.98f, 1.72f);
        pathBuilderA.lineToRelative(1.09f, 7.66f);
        pathBuilderA.curveTo(19.63f, 16.58f, 19.55f, 16.72f, 19.48f, 16.81f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(9.0f, 8.0f, -1.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 2.0f);
        pathBuilderA2.lineToRelative(-2.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 1.0f);
        pathBuilderA2.lineToRelative(2.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 2.0f);
        pathBuilderA2.lineToRelative(1.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, -2.0f);
        pathBuilderA2.lineToRelative(2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA2, 0.0f, -1.0f, -2.0f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(17.0f, 12.0f, -1.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(15.0f, 9.0f, -1.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsEsports = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
