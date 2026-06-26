package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ContactSupport.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_contactSupport", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactSupport", "Landroidx/compose/material/icons/Icons$Outlined;", "getContactSupport", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ContactSupportKt {
    private static ImageVector _contactSupport;

    public static final ImageVector getContactSupport(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _contactSupport;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ContactSupport", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(11.0f, 23.59f, -3.6f);
        pathBuilderE.curveToRelative(-5.01f, -0.26f, -9.0f, -4.42f, -9.0f, -9.49f);
        pathBuilderE.curveTo(2.0f, 5.26f, 6.26f, 1.0f, 11.5f, 1.0f);
        pathBuilderE.reflectiveCurveTo(21.0f, 5.26f, 21.0f, 10.5f);
        pathBuilderE.curveToRelative(0.0f, 4.95f, -3.44f, 9.93f, -8.57f, 12.4f);
        a.t(pathBuilderE, -1.43f, 0.69f, 11.5f, 3.0f);
        pathBuilderE.curveTo(7.36f, 3.0f, 4.0f, 6.36f, 4.0f, 10.5f);
        pathBuilderE.reflectiveCurveTo(7.36f, 18.0f, 11.5f, 18.0f);
        pathBuilderE.lineTo(13.0f, 18.0f);
        pathBuilderE.verticalLineToRelative(2.3f);
        pathBuilderE.curveToRelative(3.64f, -2.3f, 6.0f, -6.08f, 6.0f, -9.8f);
        pathBuilderE.curveTo(19.0f, 6.36f, 15.64f, 3.0f, 11.5f, 3.0f);
        b.r(pathBuilderE, 10.5f, 14.5f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderE, -2.0f, 12.5f, 13.0f, -2.0f);
        pathBuilderE.curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(-2.0f);
        pathBuilderE.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderE.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilderE.curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactSupport = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
