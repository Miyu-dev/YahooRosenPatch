package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Games.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_games", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Games", "Landroidx/compose/material/icons/Icons$Outlined;", "getGames", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GamesKt {
    private static ImageVector _games;

    public static final ImageVector getGames(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _games;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Games", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(13.0f, 4.0f, 2.67f, -1.0f, 1.0f);
        pathBuilderB.lineToRelative(-1.0f, -1.0f);
        pathBuilderB.lineTo(11.0f, 4.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.moveToRelative(7.0f, 7.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.horizontalLineToRelative(-2.67f);
        pathBuilderB.lineToRelative(-1.0f, -1.0f);
        pathBuilderB.lineToRelative(1.0f, -1.0f);
        pathBuilderB.lineTo(20.0f, 11.0f);
        pathBuilderB.moveTo(6.67f, 11.0f);
        pathBuilderB.lineToRelative(1.0f, 1.0f);
        pathBuilderB.lineToRelative(-1.0f, 1.0f);
        a.b.s(pathBuilderB, 4.0f, 13.0f, -2.0f, 2.67f);
        pathBuilderB.moveTo(12.0f, 16.33f);
        pathBuilderB.lineToRelative(1.0f, 1.0f);
        a.o(pathBuilderB, 13.0f, 20.0f, -2.0f, -2.67f);
        pathBuilderB.lineToRelative(1.0f, -1.0f);
        pathBuilderB.moveTo(15.0f, 2.0f);
        pathBuilderB.lineTo(9.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(5.5f);
        pathBuilderB.lineToRelative(3.0f, 3.0f);
        s.r(pathBuilderB, 3.0f, -3.0f, 15.0f, 2.0f);
        pathBuilderB.moveTo(22.0f, 9.0f);
        pathBuilderB.horizontalLineToRelative(-5.5f);
        pathBuilderB.lineToRelative(-3.0f, 3.0f);
        pathBuilderB.lineToRelative(3.0f, 3.0f);
        android.support.v4.media.a.C(pathBuilderB, 22.0f, 15.0f, 22.0f, 9.0f);
        pathBuilderB.moveTo(7.5f, 9.0f);
        a.b.s(pathBuilderB, 2.0f, 9.0f, 6.0f, 5.5f);
        android.support.v4.media.a.n(pathBuilderB, 3.0f, -3.0f, -3.0f, -3.0f);
        pathBuilderB.moveTo(12.0f, 13.5f);
        pathBuilderB.lineToRelative(-3.0f, 3.0f);
        a.o(pathBuilderB, 9.0f, 22.0f, 6.0f, -5.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderB, -3.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _games = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
