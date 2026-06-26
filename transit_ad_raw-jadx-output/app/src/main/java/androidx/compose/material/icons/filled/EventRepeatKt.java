package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: EventRepeat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_eventRepeat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EventRepeat", "Landroidx/compose/material/icons/Icons$Filled;", "getEventRepeat", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EventRepeatKt {
    private static ImageVector _eventRepeat;

    public static final ImageVector getEventRepeat(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _eventRepeat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EventRepeat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(21.0f, 12.0f, 6.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.appcompat.app.m.w(pathBuilderN, -1.0f, 2.0f, -2.0f, 2.0f);
        a.v(pathBuilderN, 8.0f, 2.0f, 6.0f, 2.0f);
        pathBuilderN.horizontalLineTo(5.0f);
        pathBuilderN.curveTo(3.9f, 4.0f, 3.0f, 4.9f, 3.0f, 6.0f);
        pathBuilderN.verticalLineToRelative(14.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        android.support.v4.media.a.z(pathBuilderN, 7.0f, -2.0f, 5.0f, 10.0f);
        s.q(pathBuilderN, 14.0f, 2.0f, 21.0f);
        pathBuilderN.moveTo(15.64f, 20.0f);
        pathBuilderN.curveToRelative(0.43f, 1.45f, 1.77f, 2.5f, 3.36f, 2.5f);
        pathBuilderN.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderN.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        pathBuilderN.curveToRelative(-0.95f, 0.0f, -1.82f, 0.38f, -2.45f, 1.0f);
        s.D(pathBuilderN, 1.45f, 0.0f, 18.0f, -4.0f);
        androidx.browser.browseractions.a.t(pathBuilderN, -4.0f, 1.5f, 0.0f, 1.43f);
        pathBuilderN.curveTo(16.4f, 14.55f, 17.64f, 14.0f, 19.0f, 14.0f);
        pathBuilderN.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilderN.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilderN.curveToRelative(-2.42f, 0.0f, -4.44f, -1.72f, -4.9f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderN, 15.64f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventRepeat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
