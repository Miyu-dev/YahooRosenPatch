package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: PlaylistAddCheckCircle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playlistAddCheckCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlaylistAddCheckCircle", "Landroidx/compose/material/icons/Icons$Outlined;", "getPlaylistAddCheckCircle", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PlaylistAddCheckCircleKt {
    private static ImageVector _playlistAddCheckCircle;

    public static final ImageVector getPlaylistAddCheckCircle(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _playlistAddCheckCircle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PlaylistAddCheckCircle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 4.0f);
        pathBuilderD.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        a.q(pathBuilderD, 14.0f, 10.0f, 7.0f, 2.0f);
        b.m(pathBuilderD, 7.0f, 10.0f, 14.0f, 7.0f);
        v.B(pathBuilderD, 7.0f, 2.0f, 7.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 7.0f, 15.0f, 3.0f, -2.0f);
        b.B(pathBuilderD, 7.0f, 15.0f, 19.0f, 13.41f);
        pathBuilderD.lineTo(17.59f, 12.0f);
        pathBuilderD.lineToRelative(-3.54f, 3.54f);
        pathBuilderD.lineToRelative(-1.41f, -1.41f);
        pathBuilderD.lineToRelative(-1.41f, 1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 2.83f, 2.83f, 19.0f, 13.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playlistAddCheckCircle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
