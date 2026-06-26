package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: NightShelter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nightShelter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NightShelter", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNightShelter", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NightShelterKt {
    private static ImageVector _nightShelter;

    public static final ImageVector getNightShelter(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _nightShelter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NightShelter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = androidx.appcompat.app.m.o(12.0f, 5.5f, 6.0f, 4.5f, 9.0f);
        pathBuilderO.horizontalLineTo(6.0f);
        pathBuilderO.verticalLineToRelative(-9.0f);
        pathBuilderO.lineTo(12.0f, 5.5f);
        a.x(pathBuilderO, 15.0f, 12.0f, -3.5f, 3.5f);
        androidx.compose.animation.a.v(pathBuilderO, 8.0f, 11.0f, 7.0f, 7.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderO, 1.0f, -1.5f, 8.0f, 18.0f);
        pathBuilderO.horizontalLineToRelative(1.0f);
        pathBuilderO.verticalLineToRelative(-4.0f);
        pathBuilderO.curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(9.75f, 12.5f);
        pathBuilderO.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilderO.curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f);
        pathBuilderO.reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f);
        pathBuilderO.curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f);
        pathBuilderO.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO2 = androidx.appcompat.app.m.o(12.0f, 5.5f, 6.0f, 4.5f, 9.0f);
        pathBuilderO2.horizontalLineTo(6.0f);
        pathBuilderO2.verticalLineToRelative(-9.0f);
        pathBuilderO2.lineTo(12.0f, 5.5f);
        pathBuilderO2.moveTo(12.0f, 3.0f);
        b.s(pathBuilderO2, 4.0f, 9.0f, 12.0f, 16.0f);
        pathBuilderO2.verticalLineTo(9.0f);
        android.support.v4.media.a.C(pathBuilderO2, 12.0f, 3.0f, 12.0f, 3.0f);
        a.x(pathBuilderO2, 15.0f, 12.0f, -3.5f, 3.5f);
        androidx.compose.animation.a.v(pathBuilderO2, 8.0f, 11.0f, 7.0f, 7.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderO2, 1.0f, -1.5f, 8.0f, 18.0f);
        pathBuilderO2.horizontalLineToRelative(1.0f);
        pathBuilderO2.verticalLineToRelative(-4.0f);
        pathBuilderO2.curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f);
        pathBuilderO2.close();
        pathBuilderO2.moveTo(9.75f, 12.5f);
        pathBuilderO2.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilderO2.curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f);
        pathBuilderO2.reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f);
        pathBuilderO2.curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f);
        pathBuilderO2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightShelter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
