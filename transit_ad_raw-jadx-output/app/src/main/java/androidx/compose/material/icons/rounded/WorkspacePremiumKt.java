package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import android.support.v4.media.a;
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

/* JADX INFO: compiled from: WorkspacePremium.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_workspacePremium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WorkspacePremium", "Landroidx/compose/material/icons/Icons$Rounded;", "getWorkspacePremium", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WorkspacePremium", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.92f, 12.75f, 12.0f, 11.93f);
        pathBuilderA.lineToRelative(1.07f, 0.81f);
        pathBuilderA.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        pathBuilderA.lineToRelative(-0.42f, -1.36f);
        pathBuilderA.lineToRelative(1.2f, -0.95f);
        pathBuilderA.curveTo(15.0f, 9.6f, 14.79f, 9.0f, 14.31f, 9.0f);
        pathBuilderA.horizontalLineToRelative(-1.4f);
        pathBuilderA.lineToRelative(-0.43f, -1.34f);
        pathBuilderA.curveToRelative(-0.15f, -0.46f, -0.8f, -0.46f, -0.95f, 0.0f);
        pathBuilderA.lineTo(11.09f, 9.0f);
        pathBuilderA.horizontalLineTo(9.68f);
        pathBuilderA.curveTo(9.21f, 9.0f, 9.0f, 9.6f, 9.37f, 9.89f);
        pathBuilderA.lineToRelative(1.19f, 0.95f);
        pathBuilderA.lineToRelative(-0.42f, 1.36f);
        pathBuilderA.curveTo(10.0f, 12.67f, 10.53f, 13.04f, 10.92f, 12.75f);
        pathBuilderA.close();
        pathBuilderA.moveTo(6.0f, 21.61f);
        pathBuilderA.curveToRelative(0.0f, 0.68f, 0.67f, 1.16f, 1.32f, 0.95f);
        pathBuilderA.lineTo(12.0f, 21.0f);
        pathBuilderA.lineToRelative(4.68f, 1.56f);
        pathBuilderA.curveTo(17.33f, 22.78f, 18.0f, 22.3f, 18.0f, 21.61f);
        pathBuilderA.verticalLineToRelative(-6.33f);
        pathBuilderA.curveToRelative(1.24f, -1.41f, 2.0f, -3.25f, 2.0f, -5.28f);
        pathBuilderA.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilderA.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderA.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        a.y(pathBuilderA, 21.61f, 12.0f, 4.0f);
        pathBuilderA.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 8.69f, 4.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspacePremium = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
