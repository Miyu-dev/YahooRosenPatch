package androidx.compose.material.icons.filled;

import a6.h;
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

/* JADX INFO: compiled from: ScheduleSend.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_scheduleSend", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScheduleSend", "Landroidx/compose/material/icons/Icons$Filled;", "getScheduleSend", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScheduleSendKt {
    private static ImageVector _scheduleSend;

    public static final ImageVector getScheduleSend(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _scheduleSend;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScheduleSend", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(16.5f, 12.5f, 15.0f, 12.5f, 4.0f);
        pathBuilderB.lineToRelative(3.0f, 2.0f);
        pathBuilderB.lineToRelative(0.75f, -1.23f);
        s.r(pathBuilderB, -2.25f, -1.52f, 16.5f, 12.5f);
        pathBuilderB.moveTo(16.0f, 9.0f);
        pathBuilderB.lineTo(2.0f, 3.0f);
        pathBuilderB.verticalLineToRelative(7.0f);
        pathBuilderB.lineToRelative(9.0f, 2.0f);
        pathBuilderB.lineToRelative(-9.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(7.0f);
        pathBuilderB.lineToRelative(7.27f, -3.11f);
        pathBuilderB.curveTo(10.09f, 20.83f, 12.79f, 23.0f, 16.0f, 23.0f);
        pathBuilderB.curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f);
        pathBuilderB.reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(16.0f, 21.0f);
        pathBuilderB.curveToRelative(-2.75f, 0.0f, -4.98f, -2.22f, -5.0f, -4.97f);
        pathBuilderB.verticalLineToRelative(-0.07f);
        pathBuilderB.curveToRelative(0.02f, -2.74f, 2.25f, -4.97f, 5.0f, -4.97f);
        pathBuilderB.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderB, 18.76f, 21.0f, 16.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scheduleSend = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
