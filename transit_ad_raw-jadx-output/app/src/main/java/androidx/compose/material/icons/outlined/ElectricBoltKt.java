package androidx.compose.material.icons.outlined;

import a.b;
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

/* JADX INFO: compiled from: ElectricBolt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricBolt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricBolt", "Landroidx/compose/material/icons/Icons$Outlined;", "getElectricBolt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricBoltKt {
    private static ImageVector _electricBolt;

    public static final ImageVector getElectricBolt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _electricBolt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ElectricBolt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.69f, 2.21f, 4.33f, 11.49f);
        pathBuilderA.curveToRelative(-0.64f, 0.58f, -0.28f, 1.65f, 0.58f, 1.73f);
        pathBuilderA.lineTo(13.0f, 14.0f);
        pathBuilderA.lineToRelative(-4.85f, 6.76f);
        pathBuilderA.curveToRelative(-0.22f, 0.31f, -0.19f, 0.74f, 0.08f, 1.01f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.3f, 0.3f, 0.77f, 0.31f, 1.08f, 0.02f);
        pathBuilderA.lineToRelative(10.36f, -9.28f);
        pathBuilderA.curveToRelative(0.64f, -0.58f, 0.28f, -1.65f, -0.58f, -1.73f);
        pathBuilderA.lineTo(11.0f, 10.0f);
        pathBuilderA.lineToRelative(4.85f, -6.76f);
        pathBuilderA.curveToRelative(0.22f, -0.31f, 0.19f, -0.74f, -0.08f, -1.01f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(15.47f, 1.93f, 15.0f, 1.92f, 14.69f, 2.21f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricBolt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
