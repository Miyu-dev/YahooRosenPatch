package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LeakAdd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_leakAdd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeakAdd", "Landroidx/compose/material/icons/Icons$Rounded;", "getLeakAdd", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LeakAddKt {
    private static ImageVector _leakAdd;

    public static final ImageVector getLeakAdd(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _leakAdd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeakAdd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.05f, 21.0f);
        pathBuilderD.curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f);
        pathBuilderD.curveToRelative(0.41f, -4.27f, 3.81f, -7.67f, 8.08f, -8.08f);
        pathBuilderD.curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f);
        pathBuilderD.curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f);
        pathBuilderD.curveToRelative(-5.19f, 0.52f, -9.32f, 4.65f, -9.84f, 9.83f);
        pathBuilderD.curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 0.99f, 1.11f);
        b.r(pathBuilderD, 18.0f, 21.0f, 3.0f, -3.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.09f, 21.0f);
        pathBuilderD.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilderD.curveToRelative(0.36f, -2.08f, 2.0f, -3.72f, 4.08f, -4.08f);
        pathBuilderD.curveToRelative(0.49f, -0.08f, 0.85f, -0.49f, 0.85f, -0.98f);
        pathBuilderD.curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f);
        pathBuilderD.curveToRelative(-2.96f, 0.48f, -5.29f, 2.81f, -5.77f, 5.77f);
        pathBuilderD.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.97f, 3.02f);
        pathBuilderD.curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f);
        pathBuilderD.curveToRelative(-0.41f, 4.27f, -3.81f, 7.67f, -8.08f, 8.08f);
        pathBuilderD.curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f);
        pathBuilderD.curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f);
        pathBuilderD.curveToRelative(5.19f, -0.52f, 9.32f, -4.65f, 9.84f, -9.83f);
        pathBuilderD.curveToRelative(0.07f, -0.58f, -0.39f, -1.11f, -0.99f, -1.11f);
        b.r(pathBuilderD, 6.03f, 3.02f, -3.0f, 3.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.94f, 3.02f);
        pathBuilderD.curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        pathBuilderD.curveToRelative(-0.36f, 2.08f, -2.0f, 3.72f, -4.08f, 4.08f);
        pathBuilderD.curveToRelative(-0.49f, 0.09f, -0.85f, 0.49f, -0.85f, 0.99f);
        pathBuilderD.curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f);
        pathBuilderD.curveToRelative(2.96f, -0.48f, 5.29f, -2.81f, 5.77f, -5.77f);
        pathBuilderD.curveToRelative(0.09f, -0.61f, -0.4f, -1.15f, -1.0f, -1.15f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakAdd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
