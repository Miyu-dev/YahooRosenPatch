package androidx.compose.material.icons.sharp;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: DataThresholding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dataThresholding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DataThresholding", "Landroidx/compose/material/icons/Icons$Sharp;", "getDataThresholding", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DataThresholding", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        a.y(pathBuilderO, 3.0f, 10.67f, 8.17f);
        pathBuilderO.lineToRelative(2.0f, 2.0f);
        pathBuilderO.lineToRelative(3.67f, -3.67f);
        pathBuilderO.lineToRelative(1.41f, 1.41f);
        pathBuilderO.lineTo(12.67f, 13.0f);
        pathBuilderO.lineToRelative(-2.0f, -2.0f);
        pathBuilderO.lineToRelative(-3.0f, 3.0f);
        s.r(pathBuilderO, -1.41f, -1.41f, 10.67f, 8.17f);
        pathBuilderO.moveTo(5.0f, 16.0f);
        pathBuilderO.horizontalLineToRelative(1.72f);
        pathBuilderO.lineTo(5.0f, 17.72f);
        pathBuilderO.verticalLineTo(16.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(5.84f, 19.0f);
        pathBuilderO.lineToRelative(3.0f, -3.0f);
        b.A(pathBuilderO, 1.83f, -3.0f, 3.0f, 5.84f);
        pathBuilderO.moveTo(9.8f, 19.0f);
        pathBuilderO.lineToRelative(3.0f, -3.0f);
        b.A(pathBuilderO, 1.62f, -3.0f, 3.0f, 9.8f);
        pathBuilderO.moveTo(13.53f, 19.0f);
        pathBuilderO.lineToRelative(3.0f, -3.0f);
        b.A(pathBuilderO, 1.62f, -3.0f, 3.0f, 13.53f);
        pathBuilderO.moveTo(19.0f, 19.0f);
        pathBuilderO.horizontalLineToRelative(-1.73f);
        pathBuilderO.lineTo(19.0f, 17.27f);
        pathBuilderO.verticalLineTo(19.0f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataThresholding = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
