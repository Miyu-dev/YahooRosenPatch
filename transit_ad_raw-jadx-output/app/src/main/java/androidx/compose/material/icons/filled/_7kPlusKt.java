package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _7kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__7kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_7kPlus", "Landroidx/compose/material/icons/Icons$Filled;", "get_7kPlus", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _7kPlusKt {
    private static ImageVector __7kPlus;

    public static final ImageVector get_7kPlus(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = __7kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._7kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(21.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.t(pathBuilderA, 8.0f, 15.0f, 6.25f, 15.0f);
        pathBuilderA.lineToRelative(1.38f, -4.5f);
        pathBuilderA.lineTo(5.0f, 10.5f);
        pathBuilderA.lineTo(5.0f, 9.0f);
        pathBuilderA.horizontalLineToRelative(3.5f);
        pathBuilderA.curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 8.0f, 15.0f, 16.0f, 15.0f);
        pathBuilderA.horizontalLineToRelative(-1.75f);
        pathBuilderA.lineToRelative(-1.75f, -2.25f);
        pathBuilderA.lineTo(12.5f, 15.0f);
        pathBuilderA.lineTo(11.0f, 15.0f);
        a.o(pathBuilderA, 11.0f, 9.0f, 1.5f, 2.25f);
        pathBuilderA.lineTo(14.25f, 9.0f);
        pathBuilderA.lineTo(16.0f, 9.0f);
        s.r(pathBuilderA, -2.25f, 3.0f, 16.0f, 15.0f);
        pathBuilderA.moveTo(20.0f, 12.5f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -1.5f, 18.5f, 14.0f, -1.0f);
        v.y(pathBuilderA, -1.5f, 16.0f, 12.5f, -1.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, 1.5f, 17.5f, 10.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(1.5f);
        pathBuilderA.lineTo(20.0f, 11.5f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __7kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
