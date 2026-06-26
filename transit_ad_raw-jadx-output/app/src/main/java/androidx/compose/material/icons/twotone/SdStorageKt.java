package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SdStorage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sdStorage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SdStorage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSdStorage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SdStorageKt {
    private static ImageVector _sdStorage;

    public static final ImageVector getSdStorage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _sdStorage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SdStorage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(6.0f, 8.83f, 6.0f, 20.0f, 12.0f);
        pathBuilderL.lineTo(18.0f, 4.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderL, -7.17f, 6.0f, 8.83f);
        androidx.appcompat.view.menu.a.x(pathBuilderL, 15.0f, 7.0f, 2.0f, 4.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderL, -2.0f, 15.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderL, 12.0f, 7.0f, 2.0f, 4.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderL, -2.0f, 12.0f, 7.0f);
        pathBuilderL.moveTo(11.0f, 11.0f);
        pathBuilderL.lineTo(9.0f, 11.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderL, 9.0f, 7.0f, 2.0f, 4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(18.0f, 2.0f, -8.0f, 4.0f, 8.0f);
        pathBuilderC.verticalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.lineTo(20.0f, 4.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderC, 18.0f, 20.0f, 6.0f, 20.0f);
        pathBuilderC.lineTo(6.0f, 8.83f);
        pathBuilderC.lineTo(10.83f, 4.0f);
        androidx.compose.animation.b.k(pathBuilderC, 18.0f, 4.0f, 16.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 9.0f, 7.0f, 2.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderC, 9.0f, 11.0f, 12.0f, 7.0f);
        androidx.compose.animation.b.t(pathBuilderC, 2.0f, 4.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 15.0f, 7.0f, 2.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.c(pathBuilderC, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sdStorage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
