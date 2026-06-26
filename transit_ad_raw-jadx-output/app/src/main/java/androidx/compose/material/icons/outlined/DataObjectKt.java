package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.d;
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DataObject.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dataObject", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DataObject", "Landroidx/compose/material/icons/Icons$Outlined;", "getDataObject", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DataObjectKt {
    private static ImageVector _dataObject;

    public static final ImageVector getDataObject(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _dataObject;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DataObject", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(4.0f, 7.0f, 2.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.s(pathBuilderE, 2.0f, 4.0f, 1.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(2.0f);
        pathBuilderE.curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f);
        v.t(pathBuilderE, 3.0f, -2.0f, 7.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderE.verticalLineToRelative(-2.0f);
        pathBuilderE.curveToRelative(0.0f, -1.3f, -0.84f, -2.42f, -2.0f, -2.83f);
        pathBuilderE.verticalLineToRelative(-0.34f);
        pathBuilderE.curveTo(5.16f, 11.42f, 6.0f, 10.3f, 6.0f, 9.0f);
        pathBuilderE.verticalLineTo(7.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        g.f(pathBuilderE, 3.0f, 4.0f, 7.0f);
        pathBuilderE.curveTo(5.35f, 4.0f, 4.0f, 5.35f, 4.0f, 7.0f);
        pathBuilderE.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(21.0f, 10.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineTo(7.0f);
        pathBuilderD.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        android.support.v4.media.a.s(pathBuilderD, -3.0f, 2.0f, 3.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 0.84f, 2.42f, 2.0f, 2.83f);
        pathBuilderD.verticalLineToRelative(0.34f);
        pathBuilderD.curveToRelative(-1.16f, 0.41f, -2.0f, 1.52f, -2.0f, 2.83f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        android.support.v4.media.a.s(pathBuilderD, -3.0f, 2.0f, 3.0f);
        pathBuilderD.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, d.c(pathBuilderD, 1.0f, -4.0f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataObject = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
