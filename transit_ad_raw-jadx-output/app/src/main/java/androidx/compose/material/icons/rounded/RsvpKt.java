package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Rsvp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rsvp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rsvp", "Landroidx/compose/material/icons/Icons$Rounded;", "getRsvp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RsvpKt {
    private static ImageVector _rsvp;

    public static final ImageVector getRsvp(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rsvp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rsvp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.54f, 9.0f, 16.54f, 9.0f);
        pathBuilderA.curveToRelative(0.48f, 0.0f, 0.83f, 0.46f, 0.69f, 0.92f);
        pathBuilderA.lineToRelative(-1.27f, 4.36f);
        pathBuilderA.curveTo(15.84f, 14.71f, 15.44f, 15.0f, 15.0f, 15.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.44f, 0.0f, -0.84f, -0.29f, -0.96f, -0.72f);
        pathBuilderA.lineToRelative(-1.27f, -4.36f);
        pathBuilderA.curveTo(12.63f, 9.46f, 12.98f, 9.0f, 13.46f, 9.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.32f, 0.0f, 0.6f, 0.21f, 0.69f, 0.52f);
        pathBuilderA.lineTo(15.0f, 12.43f);
        pathBuilderA.lineToRelative(0.85f, -2.91f);
        pathBuilderA.curveTo(15.94f, 9.21f, 16.22f, 9.0f, 16.54f, 9.0f);
        a.y(pathBuilderA, 5.1f, 12.9f, 0.49f, 1.14f);
        pathBuilderA.curveTo(5.78f, 14.49f, 5.45f, 15.0f, 4.96f, 15.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.28f, 0.0f, -0.53f, -0.17f, -0.63f, -0.42f);
        h.n(pathBuilderA, 3.65f, 13.0f, 2.5f, 1.31f);
        pathBuilderA.curveTo(2.5f, 14.69f, 2.19f, 15.0f, 1.81f, 15.0f);
        pathBuilderA.horizontalLineTo(1.69f);
        pathBuilderA.curveTo(1.31f, 15.0f, 1.0f, 14.69f, 1.0f, 14.31f);
        pathBuilderA.verticalLineTo(10.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(2.5f);
        pathBuilderA.curveTo(5.33f, 9.0f, 6.0f, 9.67f, 6.0f, 10.5f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.curveTo(6.0f, 12.1f, 5.6f, 12.65f, 5.1f, 12.9f);
        androidx.compose.animation.b.r(pathBuilderA, 4.5f, 10.5f, -2.0f, 1.0f);
        b.m(pathBuilderA, 2.0f, 10.5f, 21.5f, 13.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.verticalLineToRelative(1.25f);
        pathBuilderA.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(18.34f, 15.0f, 18.0f, 14.66f, 18.0f, 14.25f);
        pathBuilderA.verticalLineTo(10.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(2.5f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.curveTo(23.0f, 12.33f, 22.33f, 13.0f, 21.5f, 13.0f);
        androidx.compose.animation.b.r(pathBuilderA, 21.5f, 10.5f, -2.0f, 1.0f);
        b.m(pathBuilderA, 2.0f, 10.5f, 11.5f, 9.75f);
        pathBuilderA.lineTo(11.5f, 9.75f);
        pathBuilderA.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        androidx.compose.animation.a.s(pathBuilderA, 8.5f, 0.75f, 2.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.verticalLineTo(14.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(7.75f);
        pathBuilderA.curveTo(7.34f, 15.0f, 7.0f, 14.66f, 7.0f, 14.25f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        b.r(pathBuilderA, 10.0f, -0.75f, 7.75f);
        pathBuilderA.curveTo(7.34f, 12.75f, 7.0f, 12.41f, 7.0f, 12.0f);
        pathBuilderA.verticalLineToRelative(-2.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(2.75f);
        pathBuilderA.curveTo(11.16f, 9.0f, 11.5f, 9.34f, 11.5f, 9.75f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rsvp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
