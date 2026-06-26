package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: PowerOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_powerOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PowerOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPowerOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PowerOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.12f, 9.0f, 16.0f, 12.88f);
        a.z(pathBuilderA, 16.0f, 9.0f, 11.5f, 17.17f);
        androidx.compose.animation.a.o(pathBuilderA, 11.5f, 19.0f, 1.0f, -1.83f);
        pathBuilderA.lineToRelative(1.07f, -1.06f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.a.e(pathBuilderA, 8.0f, 10.54f, 3.11f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = androidx.appcompat.graphics.drawable.a.b(10.0f, 3.0f, 8.0f, 3.0f, 1.88f);
        android.support.v4.media.a.t(pathBuilderB, 2.0f, 2.0f, 16.0f, 9.0f);
        pathBuilderB.verticalLineToRelative(3.88f);
        pathBuilderB.lineToRelative(1.8f, 1.8f);
        pathBuilderB.lineToRelative(0.2f, -0.2f);
        pathBuilderB.lineTo(18.0f, 9.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.o(pathBuilderB, 16.0f, 3.0f, -2.0f, 4.0f);
        pathBuilderB.horizontalLineToRelative(-3.88f);
        s.r(pathBuilderB, 2.0f, 2.0f, 16.0f, 9.0f);
        pathBuilderB.moveTo(4.12f, 3.84f);
        pathBuilderB.lineTo(2.71f, 5.25f);
        pathBuilderB.lineTo(6.0f, 8.54f);
        v.y(pathBuilderB, 5.96f, 9.5f, 18.0f, 3.0f);
        s.s(pathBuilderB, 5.0f, -3.0f, 0.48f, -0.48f);
        pathBuilderB.lineToRelative(4.47f, 4.47f);
        s.r(pathBuilderB, 1.41f, -1.41f, 4.12f, 3.84f);
        pathBuilderB.moveTo(12.5f, 17.17f);
        androidx.compose.animation.a.o(pathBuilderB, 12.5f, 19.0f, -1.0f, -1.83f);
        pathBuilderB.lineTo(8.0f, 13.65f);
        pathBuilderB.verticalLineToRelative(-3.11f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderB, 5.57f, 5.57f, -1.07f, 1.06f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
