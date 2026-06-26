package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_artTrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ArtTrack", "Landroidx/compose/material/icons/Icons$TwoTone;", "getArtTrack", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ArtTrackKt {
    private static ImageVector _artTrack;

    public static final ImageVector getArtTrack(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _artTrack;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ArtTrack", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = a.v(14.0f, 7.0f, 8.0f, 2.0f, -8.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 14.0f, 11.0f, 8.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderV, -8.0f, 14.0f, 15.0f, 8.0f);
        androidx.appcompat.app.m.y(pathBuilderV, 2.0f, -8.0f, 4.0f, 17.0f);
        pathBuilderV.horizontalLineToRelative(6.0f);
        pathBuilderV.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.lineTo(12.0f, 9.0f);
        pathBuilderV.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderV.lineTo(4.0f, 7.0f);
        pathBuilderV.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderV.verticalLineToRelative(6.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.browser.browseractions.a.y(pathBuilderV, 5.25f, 12.75f, 1.25f, 1.51f);
        pathBuilderV.lineTo(8.25f, 12.0f);
        pathBuilderV.lineToRelative(2.25f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.q(pathBuilderV, -7.0f, 1.75f, -2.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _artTrack = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
