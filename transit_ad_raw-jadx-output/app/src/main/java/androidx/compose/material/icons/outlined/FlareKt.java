package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Flare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flare", "Landroidx/compose/material/icons/Icons$Outlined;", "getFlare", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FlareKt {
    private static ImageVector _flare;

    public static final ImageVector getFlare(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _flare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Flare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(7.0f, 11.0f, 1.0f, 11.0f, 2.0f);
        a.z(pathBuilderB, 6.0f, -2.0f, 9.17f, 7.76f);
        pathBuilderB.lineTo(7.05f, 5.64f);
        pathBuilderB.lineTo(5.64f, 7.05f);
        android.support.v4.media.a.n(pathBuilderB, 2.12f, 2.12f, 1.41f, -1.41f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 13.0f, 1.0f, -2.0f, 6.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 2.0f, 13.0f, 1.0f);
        pathBuilderB.moveTo(18.36f, 7.05f);
        pathBuilderB.lineToRelative(-1.41f, -1.41f);
        pathBuilderB.lineToRelative(-2.12f, 2.12f);
        android.support.v4.media.a.n(pathBuilderB, 1.41f, 1.41f, 2.12f, -2.12f);
        b.y(pathBuilderB, 17.0f, 11.0f, 2.0f, 6.0f);
        androidx.appcompat.app.m.y(pathBuilderB, -2.0f, -6.0f, 12.0f, 9.0f);
        pathBuilderB.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        androidx.browser.browseractions.a.y(pathBuilderB, 14.83f, 16.24f, 2.12f, 2.12f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.n(pathBuilderB, -2.12f, -2.12f, -1.41f, 1.41f);
        pathBuilderB.moveTo(5.64f, 16.95f);
        pathBuilderB.lineToRelative(1.41f, 1.41f);
        pathBuilderB.lineToRelative(2.12f, -2.12f);
        android.support.v4.media.a.n(pathBuilderB, -1.41f, -1.41f, -2.12f, 2.12f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 11.0f, 23.0f, 2.0f, -6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderB, -2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
