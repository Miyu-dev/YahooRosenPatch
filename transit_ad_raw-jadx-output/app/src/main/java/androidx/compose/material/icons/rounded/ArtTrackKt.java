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

/* JADX INFO: compiled from: ArtTrack.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_artTrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ArtTrack", "Landroidx/compose/material/icons/Icons$Rounded;", "getArtTrack", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ArtTrackKt {
    private static ImageVector _artTrack;

    public static final ImageVector getArtTrack(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _artTrack;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ArtTrack", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(21.0f, 13.0f, -6.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(6.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.j(pathBuilderB, 21.0f, 7.0f, -6.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(6.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        a.j(pathBuilderB, 15.0f, 17.0f, 6.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(-6.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.n(pathBuilderB, 12.0f, 9.0f, 6.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderB.lineTo(4.0f, 17.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.lineTo(2.0f, 9.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderB.horizontalLineToRelative(6.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        androidx.browser.browseractions.a.y(pathBuilderB, 9.9f, 14.2f, -1.26f, -1.68f);
        pathBuilderB.curveToRelative(-0.2f, -0.26f, -0.59f, -0.27f, -0.8f, -0.01f);
        pathBuilderB.lineTo(6.5f, 14.26f);
        pathBuilderB.lineToRelative(-0.85f, -1.03f);
        pathBuilderB.curveToRelative(-0.2f, -0.25f, -0.58f, -0.24f, -0.78f, 0.01f);
        pathBuilderB.lineToRelative(-0.74f, 0.95f);
        pathBuilderB.curveToRelative(-0.26f, 0.33f, -0.02f, 0.81f, 0.39f, 0.81f);
        pathBuilderB.lineTo(9.5f, 15.0f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.65f, -0.47f, 0.4f, -0.8f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _artTrack = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
