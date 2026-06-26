package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: HistoryToggleOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_historyToggleOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HistoryToggleOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHistoryToggleOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HistoryToggleOffKt {
    private static ImageVector _historyToggleOff;

    public static final ImageVector getHistoryToggleOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _historyToggleOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HistoryToggleOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.1f, 19.37f, 1.0f, 1.74f);
        pathBuilderA.curveToRelative(-0.96f, 0.44f, -2.01f, 0.73f, -3.1f, 0.84f);
        pathBuilderA.verticalLineToRelative(-2.02f);
        pathBuilderA.curveTo(13.74f, 19.84f, 14.44f, 19.65f, 15.1f, 19.37f);
        a.k(pathBuilderA, 4.07f, 13.0f, 2.05f);
        pathBuilderA.curveToRelative(0.11f, 1.1f, 0.4f, 2.14f, 0.84f, 3.1f);
        pathBuilderA.lineToRelative(1.74f, -1.0f);
        pathBuilderA.curveTo(4.35f, 14.44f, 4.16f, 13.74f, 4.07f, 13.0f);
        a.y(pathBuilderA, 15.1f, 4.63f, 1.0f, -1.74f);
        pathBuilderA.curveTo(15.14f, 2.45f, 14.1f, 2.16f, 13.0f, 2.05f);
        pathBuilderA.verticalLineToRelative(2.02f);
        pathBuilderA.curveTo(13.74f, 4.16f, 14.44f, 4.35f, 15.1f, 4.63f);
        androidx.compose.animation.a.j(pathBuilderA, 19.93f, 11.0f, 2.02f);
        pathBuilderA.curveToRelative(-0.11f, -1.1f, -0.4f, -2.14f, -0.84f, -3.1f);
        pathBuilderA.lineToRelative(-1.74f, 1.0f);
        pathBuilderA.curveTo(19.65f, 9.56f, 19.84f, 10.26f, 19.93f, 11.0f);
        a.y(pathBuilderA, 8.9f, 19.37f, -1.0f, 1.74f);
        pathBuilderA.curveToRelative(0.96f, 0.44f, 2.01f, 0.73f, 3.1f, 0.84f);
        pathBuilderA.verticalLineToRelative(-2.02f);
        pathBuilderA.curveTo(10.26f, 19.84f, 9.56f, 19.65f, 8.9f, 19.37f);
        h.A(pathBuilderA, 11.0f, 4.07f, 2.05f);
        pathBuilderA.curveToRelative(-1.1f, 0.11f, -2.14f, 0.4f, -3.1f, 0.84f);
        pathBuilderA.lineToRelative(1.0f, 1.74f);
        pathBuilderA.curveTo(9.56f, 4.35f, 10.26f, 4.16f, 11.0f, 4.07f);
        a.y(pathBuilderA, 18.36f, 7.17f, 1.74f, -1.01f);
        pathBuilderA.curveToRelative(-0.63f, -0.87f, -1.4f, -1.64f, -2.27f, -2.27f);
        pathBuilderA.lineToRelative(-1.01f, 1.74f);
        pathBuilderA.curveTo(17.41f, 6.08f, 17.92f, 6.59f, 18.36f, 7.17f);
        a.y(pathBuilderA, 4.63f, 8.9f, -1.74f, -1.0f);
        pathBuilderA.curveTo(2.45f, 8.86f, 2.16f, 9.9f, 2.05f, 11.0f);
        pathBuilderA.horizontalLineToRelative(2.02f);
        pathBuilderA.curveTo(4.16f, 10.26f, 4.35f, 9.56f, 4.63f, 8.9f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.93f, 13.0f);
        pathBuilderA.curveToRelative(-0.09f, 0.74f, -0.28f, 1.44f, -0.56f, 2.1f);
        pathBuilderA.lineToRelative(1.74f, 1.0f);
        pathBuilderA.curveToRelative(0.44f, -0.96f, 0.73f, -2.01f, 0.84f, -3.1f);
        b.w(pathBuilderA, 19.93f, 16.83f, 18.36f);
        pathBuilderA.lineToRelative(1.01f, 1.74f);
        pathBuilderA.curveToRelative(0.87f, -0.63f, 1.64f, -1.4f, 2.27f, -2.27f);
        pathBuilderA.lineToRelative(-1.74f, -1.01f);
        pathBuilderA.curveTo(17.92f, 17.41f, 17.41f, 17.92f, 16.83f, 18.36f);
        androidx.compose.animation.a.t(pathBuilderA, 7.17f, 5.64f, 6.17f, 3.89f);
        pathBuilderA.curveTo(5.29f, 4.53f, 4.53f, 5.29f, 3.9f, 6.17f);
        pathBuilderA.lineToRelative(1.74f, 1.01f);
        pathBuilderA.curveTo(6.08f, 6.59f, 6.59f, 6.08f, 7.17f, 5.64f);
        androidx.compose.animation.a.t(pathBuilderA, 5.64f, 16.83f, 3.9f, 17.83f);
        pathBuilderA.curveToRelative(0.63f, 0.87f, 1.4f, 1.64f, 2.27f, 2.27f);
        pathBuilderA.lineToRelative(1.01f, -1.74f);
        pathBuilderA.curveTo(6.59f, 17.92f, 6.08f, 17.41f, 5.64f, 16.83f);
        b.r(pathBuilderA, 13.0f, 7.0f, -2.0f, 5.41f);
        pathBuilderA.lineToRelative(4.29f, 4.29f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.i(pathBuilderA, 13.0f, 11.59f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _historyToggleOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
