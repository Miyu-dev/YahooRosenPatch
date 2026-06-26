package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ContactPhone.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_contactPhone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactPhone", "Landroidx/compose/material/icons/Icons$Rounded;", "getContactPhone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ContactPhoneKt {
    private static ImageVector _contactPhone;

    public static final ImageVector getContactPhone(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _contactPhone;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContactPhone", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.0f, 3.0f, 2.0f, 3.0f);
        pathBuilderA.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(20.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilderA.lineTo(24.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(8.0f, 6.0f);
        pathBuilderA.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderA.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        a.t(pathBuilderA, 14.0f, 18.0f, 2.0f, 18.0f);
        pathBuilderA.verticalLineToRelative(-1.0f);
        pathBuilderA.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        pathBuilderA.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderA, 1.0f, 17.85f, 14.0f, 1.39f);
        pathBuilderA.curveToRelative(0.16f, 0.0f, 0.3f, 0.07f, 0.4f, 0.2f);
        pathBuilderA.lineToRelative(1.1f, 1.45f);
        pathBuilderA.curveToRelative(0.15f, 0.2f, 0.13f, 0.48f, -0.05f, 0.65f);
        pathBuilderA.lineToRelative(-1.36f, 1.36f);
        pathBuilderA.curveToRelative(-0.18f, 0.18f, -0.48f, 0.2f, -0.67f, 0.04f);
        pathBuilderA.curveToRelative(-1.13f, -0.96f, -1.97f, -2.25f, -2.38f, -3.71f);
        pathBuilderA.curveToRelative(-0.18f, -0.63f, -0.28f, -1.3f, -0.28f, -1.99f);
        pathBuilderA.reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f);
        pathBuilderA.curveToRelative(0.41f, -1.47f, 1.25f, -2.75f, 2.38f, -3.71f);
        pathBuilderA.curveToRelative(0.2f, -0.17f, 0.49f, -0.14f, 0.67f, 0.04f);
        pathBuilderA.lineToRelative(1.36f, 1.36f);
        pathBuilderA.curveToRelative(0.18f, 0.18f, 0.2f, 0.46f, 0.05f, 0.65f);
        pathBuilderA.lineToRelative(-1.1f, 1.45f);
        pathBuilderA.curveToRelative(-0.09f, 0.13f, -0.24f, 0.2f, -0.4f, 0.2f);
        pathBuilderA.horizontalLineToRelative(-1.39f);
        pathBuilderA.curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderA, 0.13f, 1.38f, 0.35f, 2.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactPhone = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
