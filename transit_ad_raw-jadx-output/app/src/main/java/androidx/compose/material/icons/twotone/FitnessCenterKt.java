package androidx.compose.material.icons.twotone;

import a.b;
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

/* JADX INFO: compiled from: FitnessCenter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fitnessCenter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FitnessCenter", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFitnessCenter", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FitnessCenterKt {
    private static ImageVector _fitnessCenter;

    public static final ImageVector getFitnessCenter(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _fitnessCenter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FitnessCenter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.57f, 14.86f, 22.0f, 13.43f);
        pathBuilderA.lineTo(20.57f, 12.0f);
        pathBuilderA.lineTo(17.0f, 15.57f);
        pathBuilderA.lineTo(8.43f, 7.0f);
        pathBuilderA.lineTo(12.0f, 3.43f);
        pathBuilderA.lineTo(10.57f, 2.0f);
        pathBuilderA.lineTo(9.14f, 3.43f);
        pathBuilderA.lineTo(7.71f, 2.0f);
        pathBuilderA.lineTo(5.57f, 4.14f);
        pathBuilderA.lineTo(4.14f, 2.71f);
        pathBuilderA.lineTo(2.71f, 4.14f);
        pathBuilderA.lineToRelative(1.43f, 1.43f);
        pathBuilderA.lineTo(2.0f, 7.71f);
        pathBuilderA.lineToRelative(1.43f, 1.43f);
        pathBuilderA.lineTo(2.0f, 10.57f);
        pathBuilderA.lineTo(3.43f, 12.0f);
        pathBuilderA.lineTo(7.0f, 8.43f);
        pathBuilderA.lineTo(15.57f, 17.0f);
        pathBuilderA.lineTo(12.0f, 20.57f);
        pathBuilderA.lineTo(13.43f, 22.0f);
        pathBuilderA.lineToRelative(1.43f, -1.43f);
        pathBuilderA.lineTo(16.29f, 22.0f);
        pathBuilderA.lineToRelative(2.14f, -2.14f);
        pathBuilderA.lineToRelative(1.43f, 1.43f);
        pathBuilderA.lineToRelative(1.43f, -1.43f);
        pathBuilderA.lineToRelative(-1.43f, -1.43f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.s(pathBuilderA, 22.0f, 16.29f, -1.43f, -1.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitnessCenter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
