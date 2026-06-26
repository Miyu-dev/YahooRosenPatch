package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: RestorePage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_restorePage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RestorePage", "Landroidx/compose/material/icons/Icons$Sharp;", "getRestorePage", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RestorePageKt {
    private static ImageVector _restorePage;

    public static final ImageVector getRestorePage(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _restorePage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RestorePage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(14.0f, 2.0f, 4.0f, 2.0f, 20.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        androidx.compose.animation.a.A(pathBuilderB, 20.0f, 8.0f, -6.0f, -6.0f);
        pathBuilderB.moveTo(12.0f, 18.0f);
        pathBuilderB.curveToRelative(-2.05f, 0.0f, -3.81f, -1.24f, -4.58f, -3.0f);
        pathBuilderB.horizontalLineToRelative(1.71f);
        pathBuilderB.curveToRelative(0.63f, 0.9f, 1.68f, 1.5f, 2.87f, 1.5f);
        pathBuilderB.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderB.reflectiveCurveTo(13.93f, 9.5f, 12.0f, 9.5f);
        pathBuilderB.curveToRelative(-1.35f, 0.0f, -2.52f, 0.78f, -3.1f, 1.9f);
        pathBuilderB.lineToRelative(1.6f, 1.6f);
        pathBuilderB.horizontalLineToRelative(-4.0f);
        pathBuilderB.lineTo(6.5f, 9.0f);
        pathBuilderB.lineToRelative(1.3f, 1.3f);
        pathBuilderB.curveTo(8.69f, 8.92f, 10.23f, 8.0f, 12.0f, 8.0f);
        pathBuilderB.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderB, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restorePage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
