package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: RepeatOne.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_repeatOne", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RepeatOne", "Landroidx/compose/material/icons/Icons$Rounded;", "getRepeatOne", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RepeatOneKt {
    private static ImageVector _repeatOne;

    public static final ImageVector getRepeatOne(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _repeatOne;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RepeatOne", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(7.0f, 7.0f, 10.0f, 1.79f);
        pathBuilderO.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderO.lineToRelative(2.79f, -2.79f);
        pathBuilderO.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilderO.lineToRelative(-2.79f, -2.79f);
        pathBuilderO.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        pathBuilderO.lineTo(17.0f, 5.0f);
        pathBuilderO.lineTo(6.0f, 5.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderO.verticalLineToRelative(4.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.z(pathBuilderO, 7.0f, 7.0f, 17.0f, 17.0f);
        pathBuilderO.lineTo(7.0f, 17.0f);
        pathBuilderO.verticalLineToRelative(-1.79f);
        pathBuilderO.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderO.lineToRelative(-2.79f, 2.79f);
        pathBuilderO.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderO.lineToRelative(2.79f, 2.79f);
        pathBuilderO.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        pathBuilderO.lineTo(7.0f, 19.0f);
        pathBuilderO.horizontalLineToRelative(11.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderO.verticalLineToRelative(-4.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderO.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        android.support.v4.media.a.v(pathBuilderO, 3.0f, 13.0f, 14.25f);
        pathBuilderO.lineTo(13.0f, 9.81f);
        pathBuilderO.curveToRelative(0.0f, -0.45f, -0.36f, -0.81f, -0.81f, -0.81f);
        pathBuilderO.curveToRelative(-0.13f, 0.0f, -0.25f, 0.03f, -0.36f, 0.09f);
        pathBuilderO.lineToRelative(-1.49f, 0.74f);
        pathBuilderO.curveToRelative(-0.21f, 0.1f, -0.34f, 0.32f, -0.34f, 0.55f);
        pathBuilderO.curveToRelative(0.0f, 0.34f, 0.28f, 0.62f, 0.62f, 0.62f);
        pathBuilderO.horizontalLineToRelative(0.88f);
        pathBuilderO.verticalLineToRelative(3.25f);
        pathBuilderO.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderO, 0.75f, -0.34f, 0.75f, -0.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repeatOne = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
