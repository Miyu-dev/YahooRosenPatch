package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyboardAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getKeyboardAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyboardAltKt {
    private static ImageVector _keyboardAlt;

    public static final ImageVector getKeyboardAlt(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _keyboardAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 4.0f, 3.0f);
        pathBuilderB.curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
        pathBuilderB.verticalLineToRelative(13.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveTo(23.0f, 4.9f, 22.1f, 4.0f, 21.0f, 4.0f);
        a.x(pathBuilderB, 7.0f, 12.0f, 2.0f, 5.0f);
        h.z(pathBuilderB, -2.0f, 7.0f, 5.0f, 10.0f);
        c.j(pathBuilderB, 8.0f, 2.0f, 2.0f, 5.0f);
        android.support.v4.media.a.D(pathBuilderB, 11.0f, 12.0f, 2.0f, 9.0f);
        h.z(pathBuilderB, -2.0f, 11.0f, 9.0f, 10.0f);
        c.j(pathBuilderB, 8.0f, 2.0f, 2.0f, 9.0f);
        pathBuilderB.moveTo(16.0f, 16.5f);
        pathBuilderB.lineTo(16.0f, 16.5f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderB.horizontalLineToRelative(-7.0f);
        pathBuilderB.curveTo(8.22f, 17.0f, 8.0f, 16.78f, 8.0f, 16.5f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveTo(8.0f, 16.22f, 8.22f, 16.0f, 8.5f, 16.0f);
        pathBuilderB.horizontalLineToRelative(7.0f);
        pathBuilderB.curveTo(15.78f, 16.0f, 16.0f, 16.22f, 16.0f, 16.5f);
        androidx.appcompat.app.m.n(pathBuilderB, 15.0f, 12.0f, 2.0f, -2.0f);
        h.z(pathBuilderB, -2.0f, 15.0f, 13.0f, 10.0f);
        c.j(pathBuilderB, 8.0f, 2.0f, 2.0f, 13.0f);
        b.y(pathBuilderB, 17.0f, 14.0f, -2.0f, 2.0f);
        h.z(pathBuilderB, 2.0f, 17.0f, 19.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.y(pathBuilderB, -2.0f, 8.0f, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
