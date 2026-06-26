package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: GroupRemove.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_groupRemove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GroupRemove", "Landroidx/compose/material/icons/Icons$Outlined;", "getGroupRemove", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GroupRemoveKt {
    private static ImageVector _groupRemove;

    public static final ImageVector getGroupRemove(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _groupRemove;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GroupRemove", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(24.0f, 9.0f, 2.0f, -6.0f, 9.0f);
        b.w(pathBuilderV, 24.0f, 8.0f, 4.0f);
        pathBuilderV.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilderV.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderV.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderV.reflectiveCurveTo(10.21f, 4.0f, 8.0f, 4.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(8.0f, 10.0f);
        pathBuilderV.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderV.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderV.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderV.reflectiveCurveTo(9.1f, 10.0f, 8.0f, 10.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(8.0f, 13.0f);
        pathBuilderV.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        a.m(pathBuilderV, 3.0f, 16.0f, -3.0f);
        pathBuilderV.curveTo(16.0f, 14.34f, 10.67f, 13.0f, 8.0f, 13.0f);
        androidx.browser.browseractions.a.q(pathBuilderV, 14.0f, 18.0f, 2.0f, -0.99f);
        pathBuilderV.curveTo(2.2f, 16.29f, 5.3f, 15.0f, 8.0f, 15.0f);
        pathBuilderV.reflectiveCurveToRelative(5.8f, 1.29f, 6.0f, 2.0f);
        a.y(pathBuilderV, 18.0f, 12.51f, 4.05f);
        pathBuilderV.curveTo(13.43f, 5.11f, 14.0f, 6.49f, 14.0f, 8.0f);
        pathBuilderV.reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f);
        pathBuilderV.curveTo(14.47f, 11.7f, 16.0f, 10.04f, 16.0f, 8.0f);
        pathBuilderV.reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f);
        pathBuilderV.close();
        pathBuilderV.moveTo(16.53f, 13.83f);
        pathBuilderV.curveTo(17.42f, 14.66f, 18.0f, 15.7f, 18.0f, 17.0f);
        a.m(pathBuilderV, 3.0f, 2.0f, -3.0f);
        pathBuilderV.curveTo(20.0f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f);
        pathBuilderV.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderV.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupRemove = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
