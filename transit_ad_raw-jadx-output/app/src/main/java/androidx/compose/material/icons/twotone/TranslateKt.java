package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Translate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_translate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Translate", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTranslate", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Translate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.87f, 15.07f, -2.54f, -2.51f);
        pathBuilderA.lineToRelative(0.03f, -0.03f);
        pathBuilderA.curveToRelative(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        pathBuilderA.lineTo(17.0f, 6.0f);
        pathBuilderA.lineTo(17.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(-7.0f);
        pathBuilderA.lineTo(10.0f, 2.0f);
        pathBuilderA.lineTo(8.0f, 2.0f);
        v.y(pathBuilderA, 2.0f, 1.0f, 4.0f, 1.99f);
        pathBuilderA.horizontalLineToRelative(11.17f);
        pathBuilderA.curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        pathBuilderA.curveTo(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.curveToRelative(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
        pathBuilderA.lineToRelative(-5.09f, 5.02f);
        pathBuilderA.lineTo(4.0f, 19.0f);
        pathBuilderA.lineToRelative(5.0f, -5.0f);
        a.n(pathBuilderA, 3.11f, 3.11f, 0.76f, -2.04f);
        pathBuilderA.moveTo(18.5f, 10.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -2.0f, 12.0f, 22.0f, 2.0f);
        pathBuilderA.lineToRelative(1.12f, -3.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, 4.75f, 21.0f, 22.0f, 2.0f);
        a.t(pathBuilderA, -4.5f, -12.0f, 15.88f, 17.0f);
        pathBuilderA.lineToRelative(1.62f, -4.33f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderA, 19.12f, 17.0f, -3.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _translate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
