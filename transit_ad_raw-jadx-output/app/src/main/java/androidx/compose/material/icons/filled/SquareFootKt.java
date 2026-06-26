package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: SquareFoot.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_squareFoot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SquareFoot", "Landroidx/compose/material/icons/Icons$Filled;", "getSquareFoot", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SquareFootKt {
    private static ImageVector _squareFoot;

    public static final ImageVector getSquareFoot(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _squareFoot;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SquareFoot", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.66f, 17.66f, -1.06f, 1.06f);
        pathBuilderA.lineToRelative(-0.71f, -0.71f);
        pathBuilderA.lineToRelative(1.06f, -1.06f);
        pathBuilderA.lineToRelative(-1.94f, -1.94f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(-0.71f, -0.71f);
        pathBuilderA.lineToRelative(1.06f, -1.06f);
        pathBuilderA.lineToRelative(-1.94f, -1.94f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(-0.71f, -0.71f);
        pathBuilderA.lineToRelative(1.06f, -1.06f);
        pathBuilderA.lineTo(9.7f, 9.7f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(-0.71f, -0.71f);
        pathBuilderA.lineToRelative(1.06f, -1.06f);
        pathBuilderA.lineTo(7.05f, 7.05f);
        pathBuilderA.lineTo(5.99f, 8.11f);
        pathBuilderA.lineTo(5.28f, 7.4f);
        pathBuilderA.lineToRelative(1.06f, -1.06f);
        pathBuilderA.lineTo(4.0f, 4.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.s(pathBuilderA, 14.0f, 17.66f, 17.66f);
        pathBuilderA.moveTo(7.0f, 17.0f);
        pathBuilderA.verticalLineToRelative(-5.76f);
        pathBuilderA.lineTo(12.76f, 17.0f);
        pathBuilderA.horizontalLineTo(7.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _squareFoot = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
