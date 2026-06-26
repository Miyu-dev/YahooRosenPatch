package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ListAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_listAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ListAlt", "Landroidx/compose/material/icons/Icons$Filled;", "getListAlt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ListAltKt {
    private static ImageVector _listAlt;

    public static final ImageVector getListAlt(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _listAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ListAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(19.0f, 5.0f, 14.0f, 5.0f, 19.0f);
        pathBuilderU.lineTo(5.0f, 5.0f);
        pathBuilderU.horizontalLineToRelative(14.0f);
        pathBuilderU.moveToRelative(1.1f, -2.0f);
        pathBuilderU.lineTo(3.9f, 3.0f);
        pathBuilderU.curveToRelative(-0.5f, 0.0f, -0.9f, 0.4f, -0.9f, 0.9f);
        pathBuilderU.verticalLineToRelative(16.2f);
        pathBuilderU.curveToRelative(0.0f, 0.4f, 0.4f, 0.9f, 0.9f, 0.9f);
        pathBuilderU.horizontalLineToRelative(16.2f);
        pathBuilderU.curveToRelative(0.4f, 0.0f, 0.9f, -0.5f, 0.9f, -0.9f);
        pathBuilderU.lineTo(21.0f, 3.9f);
        pathBuilderU.curveToRelative(0.0f, -0.5f, -0.5f, -0.9f, -0.9f, -0.9f);
        b.r(pathBuilderU, 11.0f, 7.0f, 6.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderU, -6.0f, 11.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 11.0f, 11.0f, 6.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderU, -6.0f, -2.0f, 11.0f, 15.0f);
        b.t(pathBuilderU, 6.0f, 2.0f, -6.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 7.0f, 7.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderU, 7.0f, 9.0f, 7.0f, 11.0f);
        androidx.appcompat.app.m.C(pathBuilderU, 2.0f, 2.0f, 7.0f, 13.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 7.0f, 15.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderU, 7.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _listAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
