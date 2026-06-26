package androidx.compose.material.icons.rounded;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: EmojiTransportation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emojiTransportation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiTransportation", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmojiTransportation", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmojiTransportationKt {
    private static ImageVector _emojiTransportation;

    public static final ImageVector getEmojiTransportation(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _emojiTransportation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiTransportation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.99f, 14.77f, -1.43f, -4.11f);
        pathBuilderA.curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.97f, -0.66f);
        pathBuilderA.horizontalLineTo(12.4f);
        pathBuilderA.curveToRelative(-0.46f, 0.0f, -0.83f, 0.26f, -0.98f, 0.66f);
        pathBuilderA.lineTo(10.0f, 14.77f);
        pathBuilderA.verticalLineToRelative(5.24f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.m(pathBuilderA, -1.0f, 8.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.99f, -0.44f, 1.0f, -0.99f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 21.99f, 14.77f, 11.61f, 13.34f);
        pathBuilderA.lineToRelative(0.69f, -2.0f);
        pathBuilderA.curveToRelative(0.05f, -0.2f, 0.24f, -0.34f, 0.46f, -0.34f);
        pathBuilderA.horizontalLineToRelative(6.48f);
        pathBuilderA.curveToRelative(0.21f, 0.0f, 0.4f, 0.14f, 0.47f, 0.34f);
        pathBuilderA.lineToRelative(0.69f, 2.0f);
        pathBuilderA.curveToRelative(0.11f, 0.32f, -0.13f, 0.66f, -0.47f, 0.66f);
        pathBuilderA.horizontalLineToRelative(-7.85f);
        pathBuilderA.curveTo(11.74f, 14.0f, 11.5f, 13.66f, 11.61f, 13.34f);
        pathBuilderA.close();
        pathBuilderA.moveTo(11.99f, 17.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveTo(12.54f, 17.0f, 11.99f, 17.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.99f, 17.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 20.54f, 17.0f, 19.99f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b.b(14.0f, 4.5f, 9.0f, 1.0f, 4.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderB.horizontalLineTo(8.0f);
        pathBuilderB.curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.curveTo(2.45f, 8.0f, 2.0f, 8.45f, 2.0f, 9.0f);
        s.l(pathBuilderB, 12.0f, 1.0f, 9.5f);
        pathBuilderB.curveTo(3.0f, 9.22f, 3.22f, 9.0f, 3.5f, 9.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.curveTo(7.78f, 9.0f, 8.0f, 8.78f, 8.0f, 8.5f);
        pathBuilderB.verticalLineToRelative(-4.0f);
        pathBuilderB.curveTo(8.0f, 4.22f, 8.22f, 4.0f, 8.5f, 4.0f);
        pathBuilderB.horizontalLineToRelative(5.0f);
        pathBuilderB.curveTo(13.78f, 4.0f, 14.0f, 4.22f, 14.0f, 4.5f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(5.0f, 11.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(10.0f, 5.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(5.0f, 15.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(5.0f, 19.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiTransportation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
