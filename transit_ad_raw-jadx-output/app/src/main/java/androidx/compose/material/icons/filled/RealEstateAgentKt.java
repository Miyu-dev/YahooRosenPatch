package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: RealEstateAgent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_realEstateAgent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RealEstateAgent", "Landroidx/compose/material/icons/Icons$Filled;", "getRealEstateAgent", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RealEstateAgent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(1.0f, 22.0f, 4.0f, 11.0f, 1.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderQ, 22.0f, 20.0f, 17.0f, -7.0f);
        pathBuilderQ.lineToRelative(-2.09f, -0.73f);
        pathBuilderQ.lineToRelative(0.33f, -0.94f);
        pathBuilderQ.lineTo(13.0f, 16.0f);
        pathBuilderQ.horizontalLineToRelative(2.82f);
        pathBuilderQ.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        pathBuilderQ.lineToRelative(0.0f, 0.0f);
        pathBuilderQ.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        h.n(pathBuilderQ, 8.97f, 11.0f, 7.0f, 9.02f);
        pathBuilderQ.lineTo(14.0f, 22.0f);
        pathBuilderQ.lineToRelative(8.0f, -3.0f);
        pathBuilderQ.lineToRelative(0.0f, 0.0f);
        pathBuilderQ.curveTo(21.99f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f);
        androidx.browser.browseractions.a.y(pathBuilderQ, 14.0f, 1.5f, -7.0f, 5.0f);
        androidx.appcompat.app.m.u(pathBuilderQ, 9.0f, 2.0f, 8.14f, 3.26f);
        pathBuilderQ.curveTo(18.26f, 12.71f, 19.0f, 13.79f, 19.0f, 15.0f);
        androidx.browser.browseractions.a.s(pathBuilderQ, 2.0f, 6.5f, 14.0f, 1.5f);
        androidx.browser.browseractions.a.A(pathBuilderQ, 13.5f, 10.0f, -1.0f, 9.0f);
        b.m(pathBuilderQ, 1.0f, 10.0f, 13.5f, 8.0f);
        v.w(pathBuilderQ, -1.0f, 7.0f, 1.0f, 8.0f);
        androidx.browser.browseractions.a.A(pathBuilderQ, 15.5f, 10.0f, -1.0f, 9.0f);
        b.m(pathBuilderQ, 1.0f, 10.0f, 15.5f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.y(pathBuilderQ, -1.0f, 7.0f, 1.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
