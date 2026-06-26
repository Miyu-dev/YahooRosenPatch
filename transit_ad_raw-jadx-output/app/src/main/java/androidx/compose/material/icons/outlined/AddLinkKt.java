package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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
import c.c;
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AddLink.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addLink", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddLink", "Landroidx/compose/material/icons/Icons$Outlined;", "getAddLink", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddLinkKt {
    private static ImageVector _addLink;

    public static final ImageVector getAddLink(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _addLink;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddLink", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(8.0f, 11.0f, 8.0f, 2.0f, 8.0f);
        a.y(pathBuilderI, 11.0f, 20.1f, 12.0f, 22.0f);
        pathBuilderI.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        android.support.v4.media.a.s(pathBuilderI, -4.0f, 1.9f, 4.0f);
        pathBuilderI.curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12.0f);
        pathBuilderI.close();
        pathBuilderI.moveTo(3.9f, 12.0f);
        pathBuilderI.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        g.f(pathBuilderI, 4.0f, 7.0f, 7.0f);
        pathBuilderI.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderI.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        v.t(pathBuilderI, 4.0f, -1.9f, 7.0f);
        pathBuilderI.curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12.0f);
        b.r(pathBuilderI, 19.0f, 12.0f, -2.0f, 3.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderI, -3.0f, 2.0f, 3.0f, 3.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderI, 2.0f, -3.0f, 3.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderI, -3.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLink = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
