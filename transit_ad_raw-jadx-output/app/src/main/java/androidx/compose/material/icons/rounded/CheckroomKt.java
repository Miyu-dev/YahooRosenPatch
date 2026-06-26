package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Checkroom.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_checkroom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Checkroom", "Landroidx/compose/material/icons/Icons$Rounded;", "getCheckroom", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CheckroomKt {
    private static ImageVector _checkroom;

    public static final ImageVector getCheckroom(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _checkroom;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Checkroom", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(21.6f, 18.2f, 13.0f, 11.75f, -0.91f);
        pathBuilderB.curveToRelative(1.65f, -0.49f, 2.8f, -2.17f, 2.43f, -4.05f);
        pathBuilderB.curveToRelative(-0.26f, -1.31f, -1.3f, -2.4f, -2.61f, -2.7f);
        pathBuilderB.curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f);
        pathBuilderB.curveTo(8.5f, 6.74f, 8.98f, 7.5f, 9.71f, 7.5f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.39f, 0.0f, 0.75f, -0.22f, 0.9f, -0.57f);
        pathBuilderB.curveTo(10.84f, 6.38f, 11.37f, 6.0f, 12.0f, 6.0f);
        pathBuilderB.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderB.curveToRelative(0.0f, 0.84f, -0.69f, 1.52f, -1.53f, 1.5f);
        pathBuilderB.curveTo(11.43f, 8.99f, 11.0f, 9.45f, 11.0f, 9.99f);
        pathBuilderB.lineToRelative(0.0f, 1.76f);
        pathBuilderB.lineTo(2.4f, 18.2f);
        pathBuilderB.curveTo(1.63f, 18.78f, 2.04f, 20.0f, 3.0f, 20.0f);
        pathBuilderB.horizontalLineToRelative(9.0f);
        pathBuilderB.horizontalLineToRelative(9.0f);
        pathBuilderB.curveTo(21.96f, 20.0f, 22.37f, 18.78f, 21.6f, 18.2f);
        androidx.browser.browseractions.a.y(pathBuilderB, 6.0f, 18.0f, 6.0f, -4.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.k(pathBuilderB, 6.0f, 4.5f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _checkroom = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
