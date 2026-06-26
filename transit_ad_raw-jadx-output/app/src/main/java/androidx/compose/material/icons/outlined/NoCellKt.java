package androidx.compose.material.icons.outlined;

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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoCell.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noCell", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoCell", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoCell", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoCellKt {
    private static ImageVector _noCell;

    public static final ImageVector getNoCell(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noCell;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoCell", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(17.0f, 6.0f, 8.17f, 2.0f, 2.0f);
        pathBuilderB.verticalLineTo(3.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        pathBuilderB.lineTo(7.0f, 1.0f);
        pathBuilderB.curveTo(6.15f, 1.0f, 5.42f, 1.55f, 5.13f, 2.3f);
        i.b(pathBuilderB, 8.83f, 6.0f, 17.0f);
        a.x(pathBuilderB, 7.0f, 3.0f, 10.0f, 1.0f);
        a.b.B(pathBuilderB, 7.0f, 3.0f, 21.19f, 21.19f);
        pathBuilderB.lineTo(19.0f, 19.0f);
        pathBuilderB.lineToRelative(-2.0f, -2.0f);
        pathBuilderB.lineTo(7.0f, 7.0f);
        pathBuilderB.lineTo(5.0f, 5.0f);
        pathBuilderB.lineTo(2.81f, 2.81f);
        pathBuilderB.lineTo(1.39f, 4.22f);
        pathBuilderB.lineTo(5.0f, 7.83f);
        pathBuilderB.verticalLineTo(21.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(10.0f);
        pathBuilderB.curveToRelative(0.85f, 0.0f, 1.58f, -0.55f, 1.87f, -1.3f);
        s.r(pathBuilderB, 0.91f, 0.91f, 21.19f, 21.19f);
        a.b.z(pathBuilderB, 17.0f, 21.0f, 7.0f, -1.0f);
        a.b.m(pathBuilderB, 10.0f, 21.0f, 7.0f, 18.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.v(pathBuilderB, 9.83f, 15.17f, 18.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noCell = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
