package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: AutoFixHigh.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoFixHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixHigh", "Landroidx/compose/material/icons/Icons$Filled;", "getAutoFixHigh", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoFixHighKt {
    private static ImageVector _autoFixHigh;

    public static final ImageVector getAutoFixHigh(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _autoFixHigh;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AutoFixHigh", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.5f, 5.6f, 10.0f, 7.0f);
        pathBuilderA.lineTo(8.6f, 4.5f);
        pathBuilderA.lineTo(10.0f, 2.0f);
        pathBuilderA.lineTo(7.5f, 3.4f);
        pathBuilderA.lineTo(5.0f, 2.0f);
        s.r(pathBuilderA, 1.4f, 2.5f, 5.0f, 7.0f);
        pathBuilderA.moveTo(19.5f, 15.4f);
        pathBuilderA.lineTo(17.0f, 14.0f);
        pathBuilderA.lineToRelative(1.4f, 2.5f);
        pathBuilderA.lineTo(17.0f, 19.0f);
        pathBuilderA.lineToRelative(2.5f, -1.4f);
        pathBuilderA.lineTo(22.0f, 19.0f);
        s.r(pathBuilderA, -1.4f, -2.5f, 22.0f, 14.0f);
        pathBuilderA.moveTo(22.0f, 2.0f);
        pathBuilderA.lineToRelative(-2.5f, 1.4f);
        pathBuilderA.lineTo(17.0f, 2.0f);
        pathBuilderA.lineToRelative(1.4f, 2.5f);
        pathBuilderA.lineTo(17.0f, 7.0f);
        pathBuilderA.lineToRelative(2.5f, -1.4f);
        a.A(pathBuilderA, 22.0f, 7.0f, -1.4f, -2.5f);
        pathBuilderA.moveTo(14.37f, 7.29f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineTo(1.29f, 18.96f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineToRelative(2.34f, 2.34f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.lineTo(16.7f, 11.05f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        android.support.v4.media.a.t(pathBuilderA, -2.33f, -2.35f, 13.34f, 12.78f);
        pathBuilderA.lineToRelative(-2.12f, -2.12f);
        pathBuilderA.lineToRelative(2.44f, -2.44f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 2.12f, 2.12f, -2.44f, 2.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixHigh = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
