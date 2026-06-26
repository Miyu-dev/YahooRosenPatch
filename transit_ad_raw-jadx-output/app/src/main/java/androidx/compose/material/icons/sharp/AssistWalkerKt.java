package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AssistWalker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_assistWalker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AssistWalker", "Landroidx/compose/material/icons/Icons$Sharp;", "getAssistWalker", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AssistWalkerKt {
    private static ImageVector _assistWalker;

    public static final ImageVector getAssistWalker(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _assistWalker;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AssistWalker", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.5f, 4.5f, -2.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(19.77f, 17.72f, 19.0f, 10.0f, -3.0f);
        pathBuilderL.curveToRelative(-1.5f, -0.02f, -2.86f, -0.54f, -3.76f, -1.44f);
        pathBuilderL.lineToRelative(-2.0f, -1.98f);
        pathBuilderL.curveTo(10.08f, 6.42f, 9.62f, 6.0f, 8.83f, 6.0f);
        pathBuilderL.curveTo(8.32f, 6.0f, 7.81f, 6.2f, 7.42f, 6.59f);
        pathBuilderL.lineToRelative(-4.2f, 4.17f);
        pathBuilderL.lineToRelative(2.08f, 4.07f);
        pathBuilderL.lineToRelative(-3.15f, 4.05f);
        pathBuilderL.lineToRelative(1.57f, 1.24f);
        pathBuilderL.lineToRelative(3.68f, -4.73f);
        pathBuilderL.lineToRelative(-0.17f, -1.36f);
        androidx.appcompat.app.m.r(pathBuilderL, 8.0f, 14.75f, 20.0f, 2.0f);
        pathBuilderL.verticalLineToRelative(-6.12f);
        pathBuilderL.lineToRelative(-2.12f, -2.12f);
        pathBuilderL.lineToRelative(2.36f, -2.36f);
        pathBuilderL.curveToRelative(0.94f, 0.94f, 1.72f, 1.82f, 3.59f, 2.32f);
        pathBuilderL.lineTo(13.0f, 20.0f);
        a.B(pathBuilderL, 1.5f, 0.41f, -3.5f, 3.18f);
        pathBuilderL.lineToRelative(0.14f, 1.22f);
        pathBuilderL.curveToRelative(-0.44f, 0.26f, -0.73f, 0.74f, -0.73f, 1.28f);
        pathBuilderL.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderL.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderL.curveTo(20.5f, 18.46f, 20.21f, 17.98f, 19.77f, 17.72f);
        androidx.browser.browseractions.a.y(pathBuilderL, 15.09f, 15.0f, 0.41f, -3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.p(pathBuilderL, 2.0f, 0.41f, 3.5f, 15.09f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistWalker = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
