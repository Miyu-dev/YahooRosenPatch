package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: ScreenRotationAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenRotationAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenRotationAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getScreenRotationAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenRotationAltKt {
    private static ImageVector _screenRotationAlt;

    public static final ImageVector getScreenRotationAlt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _screenRotationAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ScreenRotationAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.0f, 7.59f, 5.0f, -5.0f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderA.lineTo(20.24f, 11.0f);
        pathBuilderA.horizontalLineToRelative(-2.83f);
        pathBuilderA.lineTo(10.4f, 4.0f);
        h.n(pathBuilderA, 5.41f, 9.0f, 8.0f, 2.0f);
        h.x(pathBuilderA, 2.0f, 5.0f, 2.0f, 7.59f);
        a.x(pathBuilderA, 20.0f, 19.0f, 2.0f, -6.0f);
        android.support.v4.media.a.s(pathBuilderA, -6.0f, 2.0f, 2.59f);
        pathBuilderA.lineToRelative(-4.99f, 5.0f);
        pathBuilderA.lineToRelative(-7.01f, -7.0f);
        pathBuilderA.horizontalLineTo(3.76f);
        pathBuilderA.lineToRelative(8.41f, 8.41f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.l(pathBuilderA, 5.0f, -5.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotationAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
