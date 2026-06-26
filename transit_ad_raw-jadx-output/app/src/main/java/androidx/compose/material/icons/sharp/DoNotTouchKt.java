package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: DoNotTouch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$Sharp;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoNotTouch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(13.0f, 10.17f, -2.5f, -2.5f, 1.0f);
        b.B(pathBuilderW, 13.0f, 10.17f, 20.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderW, -2.5f, 7.0f, -1.0f, 2.0f);
        androidx.compose.animation.a.z(pathBuilderW, 14.0f, 9.17f, 6.0f, 6.0f);
        androidx.compose.animation.a.y(pathBuilderW, 4.0f, 9.5f, 3.0f, 7.01f);
        pathBuilderW.verticalLineToRelative(1.18f);
        pathBuilderW.lineTo(9.5f, 6.67f);
        pathBuilderW.verticalLineTo(3.0f);
        pathBuilderW.close();
        pathBuilderW.moveTo(21.19f, 21.19f);
        pathBuilderW.lineTo(2.81f, 2.81f);
        pathBuilderW.lineTo(1.39f, 4.22f);
        pathBuilderW.lineTo(7.0f, 9.83f);
        pathBuilderW.verticalLineToRelative(4.3f);
        pathBuilderW.lineToRelative(-3.32f, -1.9f);
        pathBuilderW.lineTo(2.0f, 13.88f);
        pathBuilderW.lineTo(9.68f, 22.0f);
        pathBuilderW.horizontalLineToRelative(9.54f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderW, 0.56f, 0.61f, 21.19f, 21.19f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
