package androidx.compose.material.icons.rounded;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: MedicalInformation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_medicalInformation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MedicalInformation", "Landroidx/compose/material/icons/Icons$Rounded;", "getMedicalInformation", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MedicalInformationKt {
    private static ImageVector _medicalInformation;

    public static final ImageVector getMedicalInformation(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _medicalInformation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MedicalInformation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(20.0f, 7.0f, -5.0f, 4.0f);
        pathBuilderT.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderT.horizontalLineToRelative(-2.0f);
        pathBuilderT.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        pathBuilderT.verticalLineToRelative(3.0f);
        pathBuilderT.horizontalLineTo(4.0f);
        pathBuilderT.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        pathBuilderT.verticalLineToRelative(11.0f);
        pathBuilderT.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderT.horizontalLineToRelative(16.0f);
        pathBuilderT.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderT.verticalLineTo(9.0f);
        pathBuilderT.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        androidx.compose.animation.b.r(pathBuilderT, 11.0f, 4.0f, 2.0f, 5.0f);
        b.m(pathBuilderT, -2.0f, 4.0f, 7.0f, 16.0f);
        pathBuilderT.horizontalLineTo(6.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.horizontalLineToRelative(1.0f);
        pathBuilderT.verticalLineToRelative(-1.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.verticalLineToRelative(1.0f);
        pathBuilderT.horizontalLineToRelative(1.0f);
        pathBuilderT.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderT.horizontalLineTo(9.0f);
        pathBuilderT.verticalLineToRelative(1.0f);
        pathBuilderT.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderT.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        a.y(pathBuilderT, 16.0f, 13.75f, 14.5f);
        pathBuilderT.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderT.reflectiveCurveTo(13.34f, 13.0f, 13.75f, 13.0f);
        pathBuilderT.horizontalLineToRelative(4.5f);
        pathBuilderT.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderT.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        androidx.compose.animation.b.w(pathBuilderT, 13.75f, 13.75f, 17.5f);
        pathBuilderT.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderT.reflectiveCurveTo(13.34f, 16.0f, 13.75f, 16.0f);
        pathBuilderT.horizontalLineToRelative(2.5f);
        pathBuilderT.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderT.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderT, 13.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _medicalInformation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
