package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: RealEstateAgent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_realEstateAgent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RealEstateAgent", "Landroidx/compose/material/icons/Icons$Outlined;", "getRealEstateAgent", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RealEstateAgent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(21.0f, 6.5f, 14.0f, -2.0f, 7.5f);
        pathBuilderB.lineTo(14.0f, 4.0f);
        a.D(pathBuilderB, 9.0f, 7.5f, 9.0f, 7.0f);
        pathBuilderB.verticalLineTo(6.5f);
        s.r(pathBuilderB, 7.0f, -5.0f, 21.0f, 6.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 15.5f, 7.0f, -1.0f, 1.0f);
        b.m(pathBuilderB, 1.0f, 7.0f, 13.5f, 7.0f);
        androidx.compose.animation.a.B(pathBuilderB, -1.0f, 1.0f, 1.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 15.5f, 9.0f, -1.0f, 1.0f);
        b.m(pathBuilderB, 1.0f, 9.0f, 13.5f, 9.0f);
        androidx.compose.animation.a.B(pathBuilderB, -1.0f, 1.0f, 1.0f, 9.0f);
        pathBuilderB.moveTo(19.0f, 16.0f);
        pathBuilderB.horizontalLineToRelative(-2.0f);
        pathBuilderB.curveToRelative(0.0f, -1.2f, -0.75f, -2.28f, -1.87f, -2.7f);
        h.n(pathBuilderB, 8.97f, 11.0f, 1.0f, 11.0f);
        s.s(pathBuilderB, 6.0f, -1.44f, 7.0f, 1.94f);
        pathBuilderB.lineToRelative(8.0f, -2.5f);
        pathBuilderB.verticalLineToRelative(-1.0f);
        pathBuilderB.curveTo(22.0f, 17.34f, 20.66f, 16.0f, 19.0f, 16.0f);
        androidx.appcompat.app.m.n(pathBuilderB, 3.0f, 20.0f, -7.0f, 2.0f);
        h.z(pathBuilderB, 7.0f, 3.0f, 13.97f, 20.41f);
        androidx.appcompat.app.m.r(pathBuilderB, 7.0f, 18.48f, 13.0f, 1.61f);
        pathBuilderB.lineToRelative(5.82f, 2.17f);
        pathBuilderB.curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f);
        pathBuilderB.curveToRelative(0.0f, 0.0f, -1.99f, -0.05f, -2.3f, -0.15f);
        pathBuilderB.lineToRelative(-2.38f, -0.79f);
        pathBuilderB.lineToRelative(-0.63f, 1.9f);
        pathBuilderB.lineToRelative(2.38f, 0.79f);
        pathBuilderB.curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f);
        pathBuilderB.horizontalLineTo(19.0f);
        pathBuilderB.curveToRelative(0.39f, 0.0f, 0.74f, 0.23f, 0.9f, 0.56f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderB, 13.97f, 20.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
