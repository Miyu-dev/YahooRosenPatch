package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Keyboard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Keyboard", "Landroidx/compose/material/icons/Icons$TwoTone;", "getKeyboard", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyboardKt {
    private static ImageVector _keyboard;

    public static final ImageVector getKeyboard(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _keyboard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Keyboard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(4.0f, 17.0f, 16.0f, 20.0f, 7.0f);
        b.k(pathBuilderC, 4.0f, 7.0f, 10.0f);
        a.x(pathBuilderC, 17.0f, 8.0f, 2.0f, 2.0f);
        a.s(pathBuilderC, -2.0f, 17.0f, 8.0f);
        a.x(pathBuilderC, 17.0f, 11.0f, 2.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderC, -2.0f, -2.0f, 14.0f, 8.0f);
        android.support.v4.media.a.s(pathBuilderC, 2.0f, 2.0f, -2.0f);
        a.z(pathBuilderC, 14.0f, 8.0f, 14.0f, 11.0f);
        a.b.A(pathBuilderC, 2.0f, 2.0f, -2.0f, -2.0f);
        a.x(pathBuilderC, 11.0f, 8.0f, 2.0f, 2.0f);
        a.s(pathBuilderC, -2.0f, 11.0f, 8.0f);
        a.x(pathBuilderC, 11.0f, 11.0f, 2.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderC, -2.0f, -2.0f, 8.0f, 8.0f);
        android.support.v4.media.a.w(pathBuilderC, 2.0f, 2.0f, 8.0f, 10.0f);
        a.z(pathBuilderC, 8.0f, 8.0f, 8.0f, 11.0f);
        android.support.v4.media.a.w(pathBuilderC, 2.0f, 2.0f, 8.0f, 13.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderC, -2.0f, 8.0f, 14.0f, 8.0f);
        androidx.browser.browseractions.a.v(pathBuilderC, 2.0f, 8.0f, 16.0f, -2.0f);
        a.x(pathBuilderC, 5.0f, 8.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderC, 5.0f, 10.0f, 5.0f, 8.0f);
        a.x(pathBuilderC, 5.0f, 11.0f, 2.0f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.a.e(pathBuilderC, 5.0f, 13.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(20.0f, 5.0f, 4.0f, 5.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.lineTo(2.0f, 17.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(22.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA, 20.0f, 17.0f, 4.0f, 17.0f);
        s.w(pathBuilderA, 4.0f, 7.0f, 16.0f, 10.0f);
        a.x(pathBuilderA, 11.0f, 8.0f, 2.0f, 2.0f);
        a.w(pathBuilderA, -2.0f, 11.0f, 11.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderA, 2.0f, -2.0f, 8.0f, 8.0f);
        androidx.appcompat.app.m.C(pathBuilderA, 2.0f, 2.0f, 8.0f, 10.0f);
        a.x(pathBuilderA, 8.0f, 11.0f, 2.0f, 2.0f);
        a.z(pathBuilderA, 8.0f, 13.0f, 5.0f, 11.0f);
        androidx.appcompat.app.m.C(pathBuilderA, 2.0f, 2.0f, 5.0f, 13.0f);
        a.x(pathBuilderA, 5.0f, 8.0f, 2.0f, 2.0f);
        a.z(pathBuilderA, 5.0f, 10.0f, 8.0f, 14.0f);
        androidx.appcompat.app.m.C(pathBuilderA, 8.0f, 2.0f, 8.0f, 16.0f);
        a.x(pathBuilderA, 14.0f, 11.0f, 2.0f, 2.0f);
        a.w(pathBuilderA, -2.0f, 14.0f, 8.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderA, 2.0f, -2.0f, 17.0f, 11.0f);
        b.t(pathBuilderA, 2.0f, 2.0f, -2.0f);
        a.x(pathBuilderA, 17.0f, 8.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.c(pathBuilderA, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
