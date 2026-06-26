package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: AutoAwesome.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoAwesome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoAwesome", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoAwesome", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoAwesomeKt {
    private static ImageVector _autoAwesome;

    public static final ImageVector getAutoAwesome(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoAwesome", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.99f, 11.01f, -0.99f, -2.18f);
        pathBuilderA.lineToRelative(-0.99f, 2.18f);
        pathBuilderA.lineToRelative(-2.18f, 0.99f);
        pathBuilderA.lineToRelative(2.18f, 0.99f);
        pathBuilderA.lineToRelative(0.99f, 2.18f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 0.99f, -2.18f, 2.18f, -0.99f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(19.0f, 9.0f, 1.25f, -2.75f);
        pathBuilderA2.lineToRelative(2.75f, -1.25f);
        pathBuilderA2.lineToRelative(-2.75f, -1.25f);
        pathBuilderA2.lineToRelative(-1.25f, -2.75f);
        pathBuilderA2.lineToRelative(-1.25f, 2.75f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA2, -2.75f, 1.25f, 2.75f, 1.25f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = b.a(19.0f, 15.0f, -1.25f, 2.75f);
        pathBuilderA3.lineToRelative(-2.75f, 1.25f);
        pathBuilderA3.lineToRelative(2.75f, 1.25f);
        pathBuilderA3.lineToRelative(1.25f, 2.75f);
        pathBuilderA3.lineToRelative(1.25f, -2.75f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA3, 2.75f, -1.25f, -2.75f, -1.25f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA4 = a.b.a(11.5f, 9.5f, 9.0f, 4.0f);
        pathBuilderA4.lineTo(6.5f, 9.5f);
        pathBuilderA4.lineTo(1.0f, 12.0f);
        pathBuilderA4.lineToRelative(5.5f, 2.5f);
        pathBuilderA4.lineTo(9.0f, 20.0f);
        pathBuilderA4.lineToRelative(2.5f, -5.5f);
        android.support.v4.media.a.C(pathBuilderA4, 17.0f, 12.0f, 11.5f, 9.5f);
        pathBuilderA4.moveTo(9.99f, 12.99f);
        pathBuilderA4.lineTo(9.0f, 15.17f);
        pathBuilderA4.lineToRelative(-0.99f, -2.18f);
        pathBuilderA4.lineTo(5.83f, 12.0f);
        pathBuilderA4.lineToRelative(2.18f, -0.99f);
        pathBuilderA4.lineTo(9.0f, 8.83f);
        pathBuilderA4.lineToRelative(0.99f, 2.18f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA4, 12.17f, 12.0f, 9.99f, 12.99f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesome = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
