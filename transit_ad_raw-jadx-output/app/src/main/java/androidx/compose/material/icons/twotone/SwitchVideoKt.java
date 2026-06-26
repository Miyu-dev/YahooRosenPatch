package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SwitchVideo.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_switchVideo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwitchVideo", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSwitchVideo", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwitchVideoKt {
    private static ImageVector _switchVideo;

    public static final ImageVector getSwitchVideo(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _switchVideo;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwitchVideo", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(4.0f, 17.0f, 12.0f, 16.0f, 7.0f);
        b.k(pathBuilderC, 4.0f, 7.0f, 10.0f);
        a.b.y(pathBuilderC, 8.0f, 9.0f, 2.0f, 4.0f);
        pathBuilderC.lineTo(12.0f, 9.0f);
        pathBuilderC.lineToRelative(3.0f, 3.0f);
        pathBuilderC.lineToRelative(-3.0f, 3.0f);
        v.y(pathBuilderC, -2.0f, 8.0f, 13.0f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderC, -3.0f, -3.0f, 3.0f, -3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = a.b.o(8.0f, 13.0f, 4.0f, 2.0f);
        pathBuilderO.lineToRelative(3.0f, -3.0f);
        pathBuilderO.lineToRelative(-3.0f, -3.0f);
        pathBuilderO.verticalLineToRelative(2.0f);
        pathBuilderO.lineTo(8.0f, 11.0f);
        pathBuilderO.lineTo(8.0f, 9.0f);
        android.support.v4.media.a.n(pathBuilderO, -3.0f, 3.0f, 3.0f, 3.0f);
        pathBuilderO.moveTo(18.0f, 9.5f);
        pathBuilderO.lineTo(18.0f, 6.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderO.lineTo(3.0f, 5.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderO.verticalLineToRelative(12.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(14.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        androidx.compose.animation.a.q(pathBuilderO, -3.5f, 4.0f, 4.0f, -13.0f);
        android.support.v4.media.a.t(pathBuilderO, -4.0f, 4.0f, 16.0f, 17.0f);
        pathBuilderO.lineTo(4.0f, 17.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.k(pathBuilderO, 4.0f, 7.0f, 12.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchVideo = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
