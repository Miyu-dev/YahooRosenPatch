package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: RoomPreferences.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_roomPreferences", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RoomPreferences", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRoomPreferences", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RoomPreferencesKt {
    private static ImageVector _roomPreferences;

    public static final ImageVector getRoomPreferences(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _roomPreferences;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RoomPreferences", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = v.c(13.0f, 12.11f, 5.0f, 7.0f, 14.0f);
        pathBuilderC.horizontalLineToRelative(4.29f);
        pathBuilderC.curveTo(11.1f, 18.37f, 11.0f, 17.7f, 11.0f, 17.0f);
        pathBuilderC.curveTo(11.0f, 15.09f, 11.76f, 13.37f, 13.0f, 12.11f);
        b.r(pathBuilderC, 10.0f, 11.0f, 2.0f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderC, -2.0f, 11.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.browser.browseractions.a.f(12.0f, 13.0f, -2.0f, -2.0f, 2.0f);
        c.b.g(pathBuilderF, 13.0f, 7.0f, 19.0f, 5.0f);
        pathBuilderF.horizontalLineToRelative(6.0f);
        pathBuilderF.verticalLineToRelative(7.11f);
        pathBuilderF.curveToRelative(0.57f, -0.59f, 1.25f, -1.07f, 2.0f, -1.42f);
        s.y(pathBuilderF, 6.0f, 2.0f, 4.0f, 1.0f);
        androidx.appcompat.view.menu.a.A(pathBuilderF, 1.0f, 4.0f, -4.0f, 3.0f);
        s.B(pathBuilderF, 5.0f, 16.0f, 3.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(9.26f);
        pathBuilderF.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        b.w(pathBuilderF, 7.0f, 21.69f, 17.63f);
        pathBuilderF.lineToRelative(1.14f, 1.0f);
        pathBuilderF.lineToRelative(-1.0f, 1.73f);
        pathBuilderF.lineToRelative(-1.45f, -0.49f);
        pathBuilderF.curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f);
        pathBuilderF.lineTo(19.0f, 22.0f);
        pathBuilderF.horizontalLineToRelative(-2.0f);
        pathBuilderF.lineToRelative(-0.3f, -1.49f);
        pathBuilderF.curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f);
        pathBuilderF.lineToRelative(-1.45f, 0.49f);
        pathBuilderF.lineToRelative(-1.0f, -1.73f);
        pathBuilderF.lineToRelative(1.14f, -1.0f);
        pathBuilderF.curveToRelative(-0.08f, -0.5f, -0.08f, -0.76f, 0.0f, -1.26f);
        pathBuilderF.lineToRelative(-1.14f, -1.0f);
        pathBuilderF.lineToRelative(1.0f, -1.73f);
        pathBuilderF.lineToRelative(1.45f, 0.49f);
        pathBuilderF.curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f);
        pathBuilderF.lineTo(17.0f, 12.0f);
        pathBuilderF.horizontalLineToRelative(2.0f);
        pathBuilderF.lineToRelative(0.3f, 1.49f);
        pathBuilderF.curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f);
        pathBuilderF.lineToRelative(1.45f, -0.49f);
        pathBuilderF.lineToRelative(1.0f, 1.73f);
        pathBuilderF.lineToRelative(-1.14f, 1.0f);
        pathBuilderF.curveTo(21.77f, 16.87f, 21.77f, 17.13f, 21.69f, 17.63f);
        pathBuilderF.close();
        pathBuilderF.moveTo(20.0f, 17.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderF.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderF.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderF, 20.0f, 18.1f, 20.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomPreferences = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
