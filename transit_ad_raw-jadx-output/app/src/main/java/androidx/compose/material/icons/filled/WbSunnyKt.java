package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: WbSunny.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbSunny", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbSunny", "Landroidx/compose/material/icons/Icons$Filled;", "getWbSunny", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbSunnyKt {
    private static ImageVector _wbSunny;

    public static final ImageVector getWbSunny(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _wbSunny;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WbSunny", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(6.76f, 4.84f, -1.8f, -1.79f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        a.n(pathBuilderA, 1.79f, 1.79f, 1.42f, -1.41f);
        pathBuilderA.moveTo(4.0f, 10.5f);
        a.b.s(pathBuilderA, 1.0f, 10.5f, 2.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderA, -2.0f, 13.0f, 0.55f, -2.0f);
        pathBuilderA.lineTo(11.0f, 3.5f);
        androidx.appcompat.view.menu.a.s(pathBuilderA, 2.0f, 13.0f, 0.55f);
        pathBuilderA.moveTo(20.45f, 4.46f);
        pathBuilderA.lineToRelative(-1.41f, -1.41f);
        pathBuilderA.lineToRelative(-1.79f, 1.79f);
        a.n(pathBuilderA, 1.41f, 1.41f, 1.79f, -1.79f);
        pathBuilderA.moveTo(17.24f, 18.16f);
        pathBuilderA.lineToRelative(1.79f, 1.8f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        a.n(pathBuilderA, -1.8f, -1.79f, -1.4f, 1.4f);
        a.b.y(pathBuilderA, 20.0f, 10.5f, 2.0f, 3.0f);
        androidx.appcompat.app.m.y(pathBuilderA, -2.0f, -3.0f, 12.0f, 5.5f);
        pathBuilderA.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        androidx.compose.animation.a.j(pathBuilderA, 11.0f, 22.45f, 2.0f);
        s.w(pathBuilderA, 13.0f, 19.5f, -2.0f, 2.95f);
        pathBuilderA.moveTo(3.55f, 18.54f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(1.79f, -1.8f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, -1.41f, -1.41f, -1.79f, 1.8f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbSunny = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
