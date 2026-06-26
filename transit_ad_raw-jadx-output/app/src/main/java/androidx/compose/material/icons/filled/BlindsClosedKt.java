package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: BlindsClosed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_blindsClosed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BlindsClosed", "Landroidx/compose/material/icons/Icons$Filled;", "getBlindsClosed", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BlindsClosedKt {
    private static ImageVector _blindsClosed;

    public static final ImageVector getBlindsClosed(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _blindsClosed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BlindsClosed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = v.c(20.0f, 19.0f, 3.0f, 4.0f, 16.0f);
        a.s(pathBuilderC, 2.0f, 2.0f, 11.25f);
        pathBuilderC.curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f);
        pathBuilderC.reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f);
        a.w(pathBuilderC, 22.0f, -2.0f, 20.0f);
        androidx.browser.browseractions.a.A(pathBuilderC, 18.0f, 11.0f, -2.0f, 9.0f);
        b.m(pathBuilderC, 2.0f, 11.0f, 14.0f, 11.0f);
        h.x(pathBuilderC, 6.0f, 9.0f, 8.0f, 11.0f);
        android.support.v4.media.a.D(pathBuilderC, 14.0f, 13.0f, 2.0f, 6.0f);
        h.z(pathBuilderC, -2.0f, 14.0f, 16.0f, 13.0f);
        a.B(pathBuilderC, 2.0f, 2.0f, -2.0f, 13.0f);
        androidx.browser.browseractions.a.A(pathBuilderC, 18.0f, 7.0f, -2.0f, 5.0f);
        b.m(pathBuilderC, 2.0f, 7.0f, 14.0f, 5.0f);
        pathBuilderC.verticalLineToRelative(2.0f);
        pathBuilderC.horizontalLineTo(6.0f);
        pathBuilderC.verticalLineTo(5.0f);
        pathBuilderC.horizontalLineTo(14.0f);
        pathBuilderC.close();
        b.y(pathBuilderC, 6.0f, 19.0f, -2.0f, 8.0f);
        h.z(pathBuilderC, 2.0f, 6.0f, 16.0f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.m(pathBuilderC, -2.0f, 2.0f, 2.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blindsClosed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
