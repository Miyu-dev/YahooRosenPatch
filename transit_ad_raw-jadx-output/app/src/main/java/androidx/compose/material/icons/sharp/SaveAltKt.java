package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: SaveAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_saveAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SaveAlt", "Landroidx/compose/material/icons/Icons$Sharp;", "getSaveAlt", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SaveAltKt {
    private static ImageVector _saveAlt;

    public static final ImageVector getSaveAlt(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _saveAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SaveAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(19.0f, 12.0f, 7.0f, 5.0f, 19.0f);
        v.y(pathBuilderU, -7.0f, 3.0f, 12.0f, 9.0f);
        b.t(pathBuilderU, 18.0f, -9.0f, -2.0f);
        pathBuilderU.moveTo(13.0f, 12.67f);
        pathBuilderU.lineToRelative(2.59f, -2.58f);
        pathBuilderU.lineTo(17.0f, 11.5f);
        pathBuilderU.lineToRelative(-5.0f, 5.0f);
        pathBuilderU.lineToRelative(-5.0f, -5.0f);
        pathBuilderU.lineToRelative(1.41f, -1.41f);
        pathBuilderU.lineTo(11.0f, 12.67f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.k(pathBuilderU, 11.0f, 3.0f, 2.0f, 9.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _saveAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
