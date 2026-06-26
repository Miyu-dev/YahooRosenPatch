package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SignLanguage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signLanguage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignLanguage", "Landroidx/compose/material/icons/Icons$Sharp;", "getSignLanguage", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignLanguageKt {
    private static ImageVector _signLanguage;

    public static final ImageVector getSignLanguage(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _signLanguage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SignLanguage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.49f, 13.0f, -1.39f, -2.7f);
        pathBuilderA.lineTo(12.49f, 9.0f);
        a.D(pathBuilderA, 19.0f, 15.2f, 24.0f, 4.5f);
        androidx.appcompat.app.m.z(pathBuilderA, -2.0f, 10.0f, -1.0f, 3.0f);
        c.a.j(pathBuilderA, -2.0f, 7.0f, -1.0f, 2.0f);
        c.a.j(pathBuilderA, -2.0f, 8.0f, -1.0f, 3.5f);
        h.z(pathBuilderA, -2.0f, 12.49f, 11.78f, 7.12f);
        pathBuilderA.curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f);
        pathBuilderA.lineTo(6.76f, 4.74f);
        s.r(pathBuilderA, 1.45f, -1.38f, 11.78f, 7.12f);
        pathBuilderA.moveTo(9.64f, 9.21f);
        pathBuilderA.curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11.0f);
        pathBuilderA.horizontalLineTo(8.58f);
        pathBuilderA.lineTo(5.62f, 7.89f);
        s.r(pathBuilderA, 1.45f, -1.38f, 9.64f, 9.21f);
        pathBuilderA.moveTo(21.98f, 12.34f);
        pathBuilderA.lineTo(22.0f, 3.35f);
        pathBuilderA.lineToRelative(-1.9f, -0.1f);
        pathBuilderA.lineToRelative(-1.0f, 2.86f);
        pathBuilderA.lineTo(13.3f, 0.0f);
        pathBuilderA.lineToRelative(-1.45f, 1.38f);
        pathBuilderA.lineToRelative(4.09f, 4.3f);
        pathBuilderA.lineToRelative(-0.73f, 0.69f);
        pathBuilderA.lineTo(9.74f, 0.64f);
        pathBuilderA.lineTo(8.3f, 2.0f);
        pathBuilderA.lineToRelative(3.36f, 3.53f);
        pathBuilderA.lineToRelative(1.06f, 1.11f);
        pathBuilderA.lineToRelative(2.65f, 2.33f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 5.08f, 4.83f, 21.98f, 12.34f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signLanguage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
