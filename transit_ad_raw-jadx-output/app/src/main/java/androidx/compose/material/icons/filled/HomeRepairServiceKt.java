package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: HomeRepairService.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_homeRepairService", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HomeRepairService", "Landroidx/compose/material/icons/Icons$Filled;", "getHomeRepairService", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HomeRepairServiceKt {
    private static ImageVector _homeRepairService;

    public static final ImageVector getHomeRepairService(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _homeRepairService;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HomeRepairService", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.0f, 16.0f, -2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -1.0f);
        pathBuilderA.lineToRelative(-8.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 1.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -1.0f);
        pathBuilderA.lineToRelative(-4.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 5.0f);
        pathBuilderA.lineToRelative(20.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 0.0f, -5.0f, -4.0f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = a.b.t(20.0f, 8.0f, -3.0f, 6.0f);
        pathBuilderT.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderT.horizontalLineTo(9.0f);
        pathBuilderT.curveTo(7.9f, 4.0f, 7.0f, 4.9f, 7.0f, 6.0f);
        pathBuilderT.verticalLineToRelative(2.0f);
        pathBuilderT.horizontalLineTo(4.0f);
        pathBuilderT.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        androidx.browser.browseractions.a.l(pathBuilderT, 4.0f, 4.0f, -2.0f, 2.0f);
        androidx.browser.browseractions.a.l(pathBuilderT, 2.0f, 8.0f, -2.0f, 2.0f);
        android.support.v4.media.a.m(pathBuilderT, 2.0f, 4.0f, -4.0f);
        pathBuilderT.curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f);
        a.w(pathBuilderT, 15.0f, 8.0f, 9.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderT, 6.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeRepairService = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
