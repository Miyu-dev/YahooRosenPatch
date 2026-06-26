package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Contacts.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_contacts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Contacts", "Landroidx/compose/material/icons/Icons$TwoTone;", "getContacts", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ContactsKt {
    private static ImageVector _contacts;

    public static final ImageVector getContacts(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _contacts;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Contacts", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(20.0f, 6.0f, 4.0f, 6.0f, 12.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 16.0f, 20.0f, 6.0f);
        pathBuilderB.moveTo(12.0f, 7.0f);
        pathBuilderB.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderB.reflectiveCurveTo(13.38f, 12.0f, 12.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderB.reflectiveCurveTo(10.62f, 7.0f, 12.0f, 7.0f);
        androidx.compose.animation.a.t(pathBuilderB, 17.0f, 17.0f, 7.0f, 17.0f);
        pathBuilderB.verticalLineToRelative(-1.01f);
        pathBuilderB.curveTo(7.0f, 13.9f, 10.31f, 13.0f, 12.0f, 13.0f);
        pathBuilderB.reflectiveCurveToRelative(5.0f, 0.9f, 5.0f, 2.99f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 17.0f, 17.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = h.b(4.0f, 20.0f, 16.0f);
        pathBuilderB2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB2.lineTo(22.0f, 6.0f);
        pathBuilderB2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB2.lineTo(4.0f, 4.0f);
        pathBuilderB2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB2.verticalLineToRelative(12.0f);
        pathBuilderB2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.r(pathBuilderB2, 4.0f, 6.0f, 16.0f, 12.0f);
        android.support.v4.media.a.C(pathBuilderB2, 4.0f, 18.0f, 4.0f, 6.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB2, 4.0f, 0.0f, 16.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderB2, 4.0f, 2.0f, 4.0f, 22.0f);
        androidx.appcompat.app.m.C(pathBuilderB2, 16.0f, 2.0f, 4.0f, 24.0f);
        pathBuilderB2.moveTo(12.0f, 12.0f);
        pathBuilderB2.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderB2.reflectiveCurveTo(13.38f, 7.0f, 12.0f, 7.0f);
        pathBuilderB2.reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f);
        pathBuilderB2.reflectiveCurveTo(10.62f, 12.0f, 12.0f, 12.0f);
        pathBuilderB2.close();
        pathBuilderB2.moveTo(12.0f, 8.5f);
        pathBuilderB2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB2.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB2.close();
        pathBuilderB2.moveTo(12.0f, 13.0f);
        pathBuilderB2.curveToRelative(-1.69f, 0.0f, -5.0f, 0.9f, -5.0f, 2.99f);
        androidx.compose.animation.a.o(pathBuilderB2, 7.0f, 17.0f, 10.0f, -1.01f);
        pathBuilderB2.curveTo(17.0f, 13.9f, 13.69f, 13.0f, 12.0f, 13.0f);
        pathBuilderB2.close();
        pathBuilderB2.moveTo(8.81f, 15.5f);
        pathBuilderB2.curveToRelative(0.61f, -0.52f, 2.03f, -1.0f, 3.19f, -1.0f);
        pathBuilderB2.curveToRelative(1.17f, 0.0f, 2.59f, 0.48f, 3.2f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB2, 8.81f, 15.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contacts = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
