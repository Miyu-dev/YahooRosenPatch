package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scoreboard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_scoreboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Scoreboard", "Landroidx/compose/material/icons/Icons$Sharp;", "getScoreboard", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScoreboardKt {
    private static ImageVector _scoreboard;

    public static final ImageVector getScoreboard(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _scoreboard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Scoreboard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(17.5f, 13.5f, 16.0f, -3.0f, 1.5f);
        a.B(pathBuilderO, 13.5f, 22.0f, 4.0f, -5.0f);
        v.C(pathBuilderO, 2.0f, -2.0f, 2.0f, 9.0f);
        pathBuilderO.verticalLineTo(2.0f);
        pathBuilderO.horizontalLineTo(7.0f);
        pathBuilderO.verticalLineToRelative(2.0f);
        pathBuilderO.horizontalLineTo(2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderO, 16.0f, 20.0f, 4.0f);
        a.x(pathBuilderO, 9.5f, 12.5f, -3.0f, 1.0f);
        b.C(pathBuilderO, 3.0f, 15.0f, 5.0f, -3.5f);
        android.support.v4.media.a.z(pathBuilderO, 3.0f, -1.0f, 5.0f, 9.0f);
        b.m(pathBuilderO, 4.5f, 12.5f, 12.75f, 18.0f);
        androidx.compose.animation.a.B(pathBuilderO, -1.5f, -1.5f, 1.5f, 18.0f);
        androidx.browser.browseractions.a.A(pathBuilderO, 12.75f, 14.5f, -1.5f, 13.0f);
        b.m(pathBuilderO, 1.5f, 14.5f, 12.75f, 11.0f);
        v.w(pathBuilderO, -1.5f, 9.5f, 1.5f, 11.0f);
        androidx.browser.browseractions.a.A(pathBuilderO, 12.75f, 7.5f, -1.5f, 6.0f);
        b.m(pathBuilderO, 1.5f, 7.5f, 19.0f, 9.0f);
        pathBuilderO.verticalLineToRelative(6.0f);
        pathBuilderO.horizontalLineToRelative(-4.5f);
        pathBuilderO.verticalLineTo(9.0f);
        pathBuilderO.horizontalLineTo(19.0f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scoreboard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
