package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: AssistantDirection.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_assistantDirection", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AssistantDirection", "Landroidx/compose/material/icons/Icons$Outlined;", "getAssistantDirection", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AssistantDirection", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 1.0f);
        pathBuilderD.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        pathBuilderD.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        pathBuilderD.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 21.0f);
        pathBuilderD.curveToRelative(-4.99f, 0.0f, -9.0f, -4.01f, -9.0f, -9.0f);
        pathBuilderD.reflectiveCurveToRelative(4.01f, -9.0f, 9.0f, -9.0f);
        pathBuilderD.reflectiveCurveToRelative(9.0f, 4.01f, 9.0f, 9.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 16.99f, 21.0f, 12.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.73f, 11.42f, 12.54f, 4.2f);
        pathBuilderA.curveToRelative(-0.36f, -0.27f, -0.8f, -0.27f, -1.15f, 0.0f);
        pathBuilderA.lineTo(4.2f, 11.42f);
        pathBuilderA.curveToRelative(-0.27f, 0.36f, -0.27f, 0.8f, 0.0f, 1.16f);
        pathBuilderA.lineToRelative(7.19f, 7.22f);
        pathBuilderA.curveToRelative(0.36f, 0.27f, 0.8f, 0.27f, 1.15f, 0.0f);
        pathBuilderA.lineToRelative(7.19f, -7.22f);
        pathBuilderA.curveTo(20.09f, 12.22f, 20.09f, 11.69f, 19.73f, 11.42f);
        a.y(pathBuilderA, 13.5f, 14.5f, -1.41f, -1.41f);
        h.n(pathBuilderA, 13.17f, 12.0f, 10.0f, 3.0f);
        pathBuilderA.horizontalLineTo(8.0f);
        pathBuilderA.verticalLineToRelative(-4.0f);
        pathBuilderA.curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(4.17f);
        pathBuilderA.lineToRelative(-1.09f, -1.09f);
        pathBuilderA.lineTo(13.5f, 7.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 17.0f, 11.0f, 13.5f, 14.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
