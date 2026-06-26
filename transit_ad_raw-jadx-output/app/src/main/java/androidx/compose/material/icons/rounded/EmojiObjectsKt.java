package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: EmojiObjects.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emojiObjects", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiObjects", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmojiObjects", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmojiObjectsKt {
    private static ImageVector _emojiObjects;

    public static final ImageVector getEmojiObjects(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _emojiObjects;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiObjects", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 3.0f);
        pathBuilderD.curveToRelative(-0.46f, 0.0f, -0.93f, 0.04f, -1.4f, 0.14f);
        pathBuilderD.curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f);
        pathBuilderD.curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f);
        pathBuilderD.curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f);
        pathBuilderD.verticalLineTo(19.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(0.28f);
        pathBuilderD.curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-2.31f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f);
        pathBuilderD.curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f);
        pathBuilderD.curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f);
        b.r(pathBuilderD, 12.5f, 14.0f, -1.0f, -2.59f);
        pathBuilderD.lineTo(9.67f, 9.59f);
        pathBuilderD.lineToRelative(0.71f, -0.71f);
        pathBuilderD.lineTo(12.0f, 10.5f);
        pathBuilderD.lineToRelative(1.62f, -1.62f);
        pathBuilderD.lineToRelative(0.71f, 0.71f);
        c.a.g(pathBuilderD, -1.83f, 1.83f, 14.0f);
        pathBuilderD.moveTo(13.5f, 19.0f);
        pathBuilderD.curveToRelative(-0.01f, 0.0f, -0.02f, -0.01f, -0.03f, -0.01f);
        v.r(pathBuilderD, 19.0f, -2.94f, -0.01f);
        pathBuilderD.curveToRelative(-0.01f, 0.0f, -0.02f, 0.01f, -0.03f, 0.01f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.curveToRelative(0.01f, 0.0f, 0.02f, 0.01f, 0.03f, 0.01f);
        v.r(pathBuilderD, 18.0f, 2.94f, 0.01f);
        pathBuilderD.curveToRelative(0.01f, 0.0f, 0.02f, -0.01f, 0.03f, -0.01f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderD.curveTo(14.0f, 18.78f, 13.78f, 19.0f, 13.5f, 19.0f);
        androidx.compose.animation.a.j(pathBuilderD, 13.5f, 17.0f, -3.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderD.curveTo(14.0f, 16.78f, 13.78f, 17.0f, 13.5f, 17.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiObjects = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
