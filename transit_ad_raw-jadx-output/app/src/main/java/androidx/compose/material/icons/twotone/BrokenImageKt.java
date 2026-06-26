package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BrokenImage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brokenImage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrokenImage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBrokenImage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrokenImageKt {
    private static ImageVector _brokenImage;

    public static final ImageVector getBrokenImage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _brokenImage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BrokenImage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.99f, 15.41f, -4.0f, -4.0f);
        pathBuilderA.lineToRelative(-4.0f, 4.0f);
        s.D(pathBuilderA, -0.99f, -0.99f, 19.0f, 14.0f);
        v.v(pathBuilderA, -6.57f, -1.01f, -1.01f);
        pathBuilderA.moveTo(5.0f, 11.59f);
        pathBuilderA.lineToRelative(0.99f, 1.0f);
        pathBuilderA.lineToRelative(4.0f, -4.0f);
        pathBuilderA.lineToRelative(4.0f, 4.0f);
        pathBuilderA.lineToRelative(4.0f, -4.01f);
        pathBuilderA.lineTo(19.0f, 9.59f);
        pathBuilderA.verticalLineTo(5.0f);
        pathBuilderA.horizontalLineTo(5.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderA2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA2.verticalLineToRelative(14.0f);
        pathBuilderA2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA2.horizontalLineToRelative(14.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.lineTo(21.0f, 5.0f);
        pathBuilderA2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.t(pathBuilderA2, 19.0f, 19.0f, 5.0f, 19.0f);
        pathBuilderA2.verticalLineToRelative(-4.58f);
        pathBuilderA2.lineToRelative(0.99f, 0.99f);
        pathBuilderA2.lineToRelative(4.0f, -4.0f);
        pathBuilderA2.lineToRelative(4.0f, 4.0f);
        pathBuilderA2.lineToRelative(4.0f, -3.99f);
        android.support.v4.media.a.C(pathBuilderA2, 19.0f, 12.43f, 19.0f, 19.0f);
        pathBuilderA2.moveTo(19.0f, 9.59f);
        pathBuilderA2.lineToRelative(-1.01f, -1.01f);
        pathBuilderA2.lineToRelative(-4.0f, 4.01f);
        pathBuilderA2.lineToRelative(-4.0f, -4.0f);
        pathBuilderA2.lineToRelative(-4.0f, 4.0f);
        pathBuilderA2.lineToRelative(-0.99f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.k(pathBuilderA2, 5.0f, 5.0f, 14.0f, 4.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brokenImage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
