package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Map.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_map", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Map", "Landroidx/compose/material/icons/Icons$Outlined;", "getMap", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _map;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Map", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.5f, 3.0f, -0.16f, 0.03f);
        pathBuilderA.lineTo(15.0f, 5.1f);
        pathBuilderA.lineTo(9.0f, 3.0f);
        pathBuilderA.lineTo(3.36f, 4.9f);
        pathBuilderA.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        pathBuilderA.lineTo(3.0f, 20.5f);
        pathBuilderA.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderA.lineToRelative(0.16f, -0.03f);
        pathBuilderA.lineTo(9.0f, 18.9f);
        pathBuilderA.lineToRelative(6.0f, 2.1f);
        pathBuilderA.lineToRelative(5.64f, -1.9f);
        pathBuilderA.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        pathBuilderA.lineTo(21.0f, 3.5f);
        pathBuilderA.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.y(pathBuilderA, 10.0f, 5.47f, 4.0f, 1.4f);
        pathBuilderA.verticalLineToRelative(11.66f);
        s.r(pathBuilderA, -4.0f, -1.4f, 10.0f, 5.47f);
        pathBuilderA.moveTo(5.0f, 6.46f);
        pathBuilderA.lineToRelative(3.0f, -1.01f);
        pathBuilderA.verticalLineToRelative(11.7f);
        s.r(pathBuilderA, -3.0f, 1.16f, 5.0f, 6.46f);
        pathBuilderA.moveTo(19.0f, 17.54f);
        pathBuilderA.lineToRelative(-3.0f, 1.01f);
        pathBuilderA.lineTo(16.0f, 6.86f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.r(pathBuilderA, 3.0f, -1.16f, 11.84f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
