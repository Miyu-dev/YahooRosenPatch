package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: Map.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_map", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Map", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMap", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _map;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Map", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(5.0f, 18.31f, 3.0f, -1.16f);
        a.C(pathBuilderA, 8.0f, 5.45f, 5.0f, 6.46f);
        pathBuilderA.moveTo(16.0f, 18.55f);
        pathBuilderA.lineToRelative(3.0f, -1.01f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderA, 19.0f, 5.69f, -3.0f, 1.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(20.5f, 3.0f, -0.16f, 0.03f);
        pathBuilderA2.lineTo(15.0f, 5.1f);
        pathBuilderA2.lineTo(9.0f, 3.0f);
        pathBuilderA2.lineTo(3.36f, 4.9f);
        pathBuilderA2.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        pathBuilderA2.lineTo(3.0f, 20.5f);
        pathBuilderA2.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderA2.lineToRelative(0.16f, -0.03f);
        pathBuilderA2.lineTo(9.0f, 18.9f);
        pathBuilderA2.lineToRelative(6.0f, 2.1f);
        pathBuilderA2.lineToRelative(5.64f, -1.9f);
        pathBuilderA2.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        pathBuilderA2.lineTo(21.0f, 3.5f);
        pathBuilderA2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        androidx.browser.browseractions.a.y(pathBuilderA2, 8.0f, 17.15f, -3.0f, 1.16f);
        pathBuilderA2.lineTo(5.0f, 6.46f);
        androidx.compose.animation.a.u(pathBuilderA2, 3.0f, -1.01f, 11.7f);
        pathBuilderA2.moveTo(14.0f, 18.53f);
        pathBuilderA2.lineToRelative(-4.0f, -1.4f);
        pathBuilderA2.lineTo(10.0f, 5.47f);
        androidx.compose.animation.a.u(pathBuilderA2, 4.0f, 1.4f, 11.66f);
        pathBuilderA2.moveTo(19.0f, 17.54f);
        pathBuilderA2.lineToRelative(-3.0f, 1.01f);
        pathBuilderA2.lineTo(16.0f, 6.86f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.r(pathBuilderA2, 3.0f, -1.16f, 11.84f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
