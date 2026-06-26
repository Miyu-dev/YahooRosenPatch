package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: BluetoothDrive.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bluetoothDrive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothDrive", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBluetoothDrive", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BluetoothDriveKt {
    private static ImageVector _bluetoothDrive;

    public static final ImageVector getBluetoothDrive(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _bluetoothDrive;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothDrive", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(4.0f, 17.0f, 14.0f, -5.0f, -1.0f);
        b.B(pathBuilderF, 4.0f, 17.0f, 15.5f, 13.0f);
        pathBuilderF.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderF.reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f);
        pathBuilderF.reflectiveCurveTo(14.0f, 15.33f, 14.0f, 14.5f);
        pathBuilderF.reflectiveCurveTo(14.67f, 13.0f, 15.5f, 13.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(6.5f, 13.0f);
        pathBuilderF.curveTo(7.33f, 13.0f, 8.0f, 13.67f, 8.0f, 14.5f);
        pathBuilderF.reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f);
        pathBuilderF.reflectiveCurveTo(5.0f, 15.33f, 5.0f, 14.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderF, 5.67f, 13.0f, 6.5f, 13.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(18.0f, 17.0f, 4.0f, -5.0f, 13.0f);
        pathBuilderO.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        s.C(pathBuilderO, 4.81f, 1.04f, -3.0f, 15.0f);
        pathBuilderO.verticalLineTo(5.0f);
        pathBuilderO.horizontalLineTo(5.5f);
        pathBuilderO.curveTo(4.84f, 5.0f, 4.29f, 5.42f, 4.08f, 6.01f);
        pathBuilderO.lineTo(2.0f, 12.0f);
        pathBuilderO.verticalLineToRelative(8.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(1.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderO, -1.0f, 12.0f, 1.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(1.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderO, -8.0f, -2.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(6.5f, 14.5f, -1.5f, 0.0f);
        pathBuilderB.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilderB.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(15.5f, 14.5f, -1.5f, 0.0f);
        pathBuilderB2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = androidx.appcompat.graphics.drawable.a.l(22.0f, 3.85f, 19.15f, 1.0f, -0.5f);
        pathBuilderL.verticalLineToRelative(3.79f);
        pathBuilderL.lineToRelative(-2.3f, -2.29f);
        pathBuilderL.lineToRelative(-0.7f, 0.7f);
        pathBuilderL.lineTo(18.44f, 6.0f);
        pathBuilderL.lineToRelative(-2.79f, 2.79f);
        pathBuilderL.lineToRelative(0.7f, 0.71f);
        s.D(pathBuilderL, 2.3f, -2.3f, 11.0f, 0.5f);
        pathBuilderL.lineTo(22.0f, 8.14f);
        android.support.v4.media.a.C(pathBuilderL, 19.85f, 6.0f, 22.0f, 3.85f);
        pathBuilderL.moveTo(19.65f, 2.91f);
        pathBuilderL.lineToRelative(0.94f, 0.94f);
        c.a.g(pathBuilderL, -0.94f, 0.94f, 2.91f);
        pathBuilderL.moveTo(20.59f, 8.14f);
        pathBuilderL.lineToRelative(-0.94f, 0.94f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.v(pathBuilderL, 7.2f, 20.59f, 8.14f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothDrive = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
