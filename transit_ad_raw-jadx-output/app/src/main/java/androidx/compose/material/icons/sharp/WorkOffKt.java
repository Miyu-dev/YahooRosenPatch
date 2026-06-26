package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: WorkOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_workOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WorkOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getWorkOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WorkOffKt {
    private static ImageVector _workOff;

    public static final ImageVector getWorkOff(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _workOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WorkOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(10.0f, 4.0f, 4.0f, 2.0f, -3.6f);
        androidx.appcompat.app.m.r(pathBuilderF, 22.0f, 17.6f, 6.0f, -6.0f);
        pathBuilderF.verticalLineTo(4.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderF.horizontalLineToRelative(-4.0f);
        pathBuilderF.curveToRelative(-0.98f, 0.0f, -1.79f, 0.71f, -1.96f, 1.64f);
        h.y(pathBuilderF, 10.0f, 5.6f, 4.0f);
        pathBuilderF.moveTo(3.4f, 1.84f);
        pathBuilderF.lineTo(1.99f, 3.25f);
        pathBuilderF.lineTo(4.74f, 6.0f);
        pathBuilderF.horizontalLineTo(2.01f);
        pathBuilderF.lineTo(2.0f, 21.0f);
        pathBuilderF.horizontalLineToRelative(17.74f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderF, 2.0f, 2.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
