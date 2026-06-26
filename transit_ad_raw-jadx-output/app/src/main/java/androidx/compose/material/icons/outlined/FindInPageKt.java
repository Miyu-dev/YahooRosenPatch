package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FindInPage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_findInPage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FindInPage", "Landroidx/compose/material/icons/Icons$Outlined;", "getFindInPage", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FindInPageKt {
    private static ImageVector _findInPage;

    public static final ImageVector getFindInPage(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _findInPage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FindInPage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.0f, 2.0f, 6.0f, 2.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.lineTo(4.0f, 20.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderA.lineTo(18.0f, 22.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.A(pathBuilderA, 20.0f, 8.0f, -6.0f, -6.0f);
        pathBuilderA.moveTo(6.0f, 4.0f);
        a.p(pathBuilderA, 7.0f, 5.0f, 5.0f, 8.58f);
        pathBuilderA.lineToRelative(-1.84f, -1.84f);
        pathBuilderA.curveToRelative(1.28f, -1.94f, 1.07f, -4.57f, -0.64f, -6.28f);
        pathBuilderA.curveTo(14.55f, 8.49f, 13.28f, 8.0f, 12.0f, 8.0f);
        pathBuilderA.curveToRelative(-1.28f, 0.0f, -2.55f, 0.49f, -3.53f, 1.46f);
        pathBuilderA.curveToRelative(-1.95f, 1.95f, -1.95f, 5.11f, 0.0f, 7.05f);
        pathBuilderA.curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f);
        pathBuilderA.curveToRelative(0.96f, 0.0f, 1.92f, -0.28f, 2.75f, -0.83f);
        pathBuilderA.lineTo(17.6f, 20.0f);
        android.support.v4.media.a.C(pathBuilderA, 6.0f, 20.0f, 6.0f, 4.0f);
        pathBuilderA.moveTo(14.11f, 15.1f);
        pathBuilderA.curveToRelative(-0.56f, 0.56f, -1.31f, 0.88f, -2.11f, 0.88f);
        pathBuilderA.reflectiveCurveToRelative(-1.55f, -0.31f, -2.11f, -0.88f);
        pathBuilderA.curveToRelative(-0.56f, -0.56f, -0.88f, -1.31f, -0.88f, -2.11f);
        pathBuilderA.reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.11f);
        pathBuilderA.curveToRelative(0.56f, -0.57f, 1.31f, -0.88f, 2.11f, -0.88f);
        pathBuilderA.reflectiveCurveToRelative(1.55f, 0.31f, 2.11f, 0.88f);
        pathBuilderA.curveToRelative(0.56f, 0.56f, 0.88f, 1.31f, 0.88f, 2.11f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderA, -0.31f, 1.55f, -0.88f, 2.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findInPage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
