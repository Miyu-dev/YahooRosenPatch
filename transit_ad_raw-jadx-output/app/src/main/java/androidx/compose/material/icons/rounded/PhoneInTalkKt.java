package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: PhoneInTalk.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneInTalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneInTalk", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhoneInTalk", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhoneInTalkKt {
    private static ImageVector _phoneInTalk;

    public static final ImageVector getPhoneInTalk(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _phoneInTalk;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneInTalk", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.88f, 5.05f);
        pathBuilderD.curveToRelative(3.18f, 0.4f, 5.67f, 2.89f, 6.07f, 6.07f);
        pathBuilderD.curveToRelative(0.06f, 0.51f, 0.49f, 0.88f, 0.99f, 0.88f);
        pathBuilderD.curveToRelative(0.04f, 0.0f, 0.08f, 0.0f, 0.12f, -0.01f);
        pathBuilderD.curveToRelative(0.55f, -0.07f, 0.94f, -0.57f, 0.87f, -1.12f);
        pathBuilderD.curveToRelative(-0.51f, -4.09f, -3.72f, -7.3f, -7.81f, -7.81f);
        pathBuilderD.curveToRelative(-0.55f, -0.06f, -1.05f, 0.33f, -1.11f, 0.88f);
        pathBuilderD.curveToRelative(-0.07f, 0.55f, 0.32f, 1.05f, 0.87f, 1.11f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.26f, 7.16f);
        pathBuilderD.curveToRelative(-0.53f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f);
        pathBuilderD.reflectiveCurveToRelative(0.18f, 1.08f, 0.72f, 1.22f);
        pathBuilderD.curveToRelative(1.05f, 0.27f, 1.87f, 1.09f, 2.15f, 2.15f);
        pathBuilderD.curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f);
        pathBuilderD.curveToRelative(0.08f, 0.0f, 0.17f, -0.01f, 0.25f, -0.03f);
        pathBuilderD.curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.72f, -1.22f);
        pathBuilderD.curveToRelative(-0.47f, -1.77f, -1.84f, -3.14f, -3.59f, -3.59f);
        a.y(pathBuilderD, 19.23f, 15.26f, -2.54f, -0.29f);
        pathBuilderD.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilderD.lineToRelative(-1.84f, 1.84f);
        pathBuilderD.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilderD.lineToRelative(1.85f, -1.85f);
        pathBuilderD.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        pathBuilderD.lineToRelative(-0.29f, -2.52f);
        pathBuilderD.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        pathBuilderD.lineTo(5.03f, 3.01f);
        pathBuilderD.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilderD.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilderD.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilderD.verticalLineToRelative(-1.73f);
        pathBuilderD.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneInTalk = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
