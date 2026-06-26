package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ManageSearch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_manageSearch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageSearch", "Landroidx/compose/material/icons/Icons$Rounded;", "getManageSearch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ManageSearchKt {
    private static ImageVector _manageSearch;

    public static final ImageVector getManageSearch(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _manageSearch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ManageSearch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(6.0f, 9.0f, 3.0f);
        pathBuilderB.curveTo(2.45f, 9.0f, 2.0f, 8.55f, 2.0f, 8.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(3.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(7.0f, 8.55f, 6.55f, 9.0f, 6.0f, 9.0f);
        a.k(pathBuilderB, 6.0f, 12.0f, 3.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(3.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(7.0f, 12.45f, 6.55f, 12.0f, 6.0f, 12.0f);
        a.y(pathBuilderB, 19.88f, 18.29f, -3.12f, -3.12f);
        pathBuilderB.curveToRelative(-0.86f, 0.56f, -1.89f, 0.88f, -3.0f, 0.82f);
        pathBuilderB.curveToRelative(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f);
        pathBuilderB.curveTo(8.6f, 8.33f, 11.49f, 5.5f, 14.87f, 6.07f);
        pathBuilderB.curveToRelative(1.95f, 0.33f, 3.57f, 1.85f, 4.0f, 3.78f);
        pathBuilderB.curveToRelative(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f);
        pathBuilderB.lineToRelative(3.13f, 3.13f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveTo(20.91f, 18.68f, 20.27f, 18.68f, 19.88f, 18.29f);
        pathBuilderB.close();
        pathBuilderB.moveTo(17.0f, 11.0f);
        pathBuilderB.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilderB.reflectiveCurveTo(17.0f, 12.65f, 17.0f, 11.0f);
        androidx.compose.animation.a.j(pathBuilderB, 3.0f, 19.0f, 8.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(2.0f, 18.55f, 2.45f, 19.0f, 3.0f, 19.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageSearch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
