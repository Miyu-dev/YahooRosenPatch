package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Key.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_key", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Key", "Landroidx/compose/material/icons/Icons$Rounded;", "getKey", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyKt {
    private static ImageVector _key;

    public static final ImageVector getKey(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _key;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Key", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(20.59f, 10.0f, -7.94f);
        pathBuilderB.curveTo(11.7f, 7.31f, 8.89f, 5.5f, 5.77f, 6.12f);
        pathBuilderB.curveToRelative(-2.29f, 0.46f, -4.15f, 2.3f, -4.63f, 4.58f);
        pathBuilderB.curveTo(0.32f, 14.58f, 3.26f, 18.0f, 7.0f, 18.0f);
        pathBuilderB.curveToRelative(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
        pathBuilderB.horizontalLineTo(13.0f);
        pathBuilderB.lineToRelative(1.29f, 1.29f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderB.lineTo(17.0f, 14.0f);
        pathBuilderB.lineToRelative(1.29f, 1.29f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilderB.lineToRelative(2.59f, -2.61f);
        pathBuilderB.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f);
        pathBuilderB.lineToRelative(-0.99f, -0.97f);
        pathBuilderB.curveTo(21.1f, 10.1f, 20.85f, 10.0f, 20.59f, 10.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(7.0f, 15.0f);
        pathBuilderB.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilderB.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilderB.curveTo(10.0f, 13.65f, 8.65f, 15.0f, 7.0f, 15.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _key = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
