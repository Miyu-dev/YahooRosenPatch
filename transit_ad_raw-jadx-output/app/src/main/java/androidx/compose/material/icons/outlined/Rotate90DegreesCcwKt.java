package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Rotate90DegreesCcw.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotate90DegreesCcw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rotate90DegreesCcw", "Landroidx/compose/material/icons/Icons$Outlined;", "getRotate90DegreesCcw", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Rotate90DegreesCcwKt {
    private static ImageVector _rotate90DegreesCcw;

    public static final ImageVector getRotate90DegreesCcw(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _rotate90DegreesCcw;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rotate90DegreesCcw", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.34f, 6.41f, 0.86f, 12.9f);
        pathBuilderA.lineToRelative(6.49f, 6.48f);
        a.n(pathBuilderA, 6.49f, -6.48f, -6.5f, -6.49f);
        pathBuilderA.moveTo(3.69f, 12.9f);
        pathBuilderA.lineToRelative(3.66f, -3.66f);
        pathBuilderA.lineTo(11.0f, 12.9f);
        a.n(pathBuilderA, -3.66f, 3.66f, -3.65f, -3.66f);
        pathBuilderA.moveTo(19.36f, 6.64f);
        pathBuilderA.curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f);
        pathBuilderA.lineTo(13.0f, 0.76f);
        pathBuilderA.lineTo(8.76f, 5.0f);
        pathBuilderA.lineTo(13.0f, 9.24f);
        pathBuilderA.lineTo(13.0f, 6.0f);
        pathBuilderA.curveToRelative(1.79f, 0.0f, 3.58f, 0.68f, 4.95f, 2.05f);
        pathBuilderA.curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0.0f, 9.9f);
        pathBuilderA.curveTo(16.58f, 19.32f, 14.79f, 20.0f, 13.0f, 20.0f);
        pathBuilderA.curveToRelative(-0.97f, 0.0f, -1.94f, -0.21f, -2.84f, -0.61f);
        pathBuilderA.lineToRelative(-1.49f, 1.49f);
        pathBuilderA.curveTo(10.02f, 21.62f, 11.51f, 22.0f, 13.0f, 22.0f);
        pathBuilderA.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilderA.curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCcw = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
