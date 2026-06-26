package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ConnectedTv.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_connectedTv", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectedTv", "Landroidx/compose/material/icons/Icons$Rounded;", "getConnectedTv", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ConnectedTvKt {
    private static ImageVector _connectedTv;

    public static final ImageVector getConnectedTv(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _connectedTv;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConnectedTv", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 3.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.verticalLineToRelative(1.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(6.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(-1.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilderB.lineTo(22.0f, 5.0f);
        pathBuilderB.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        a.w(pathBuilderB, 20.0f, 17.0f, 4.0f, 5.0f);
        b.m(pathBuilderB, 16.0f, 17.0f, 7.0f, 15.97f);
        pathBuilderB.curveTo(6.98f, 14.89f, 6.11f, 14.02f, 5.03f, 14.0f);
        v.B(pathBuilderB, 5.0f, 2.0f, 2.0f, 15.97f);
        pathBuilderB.moveTo(5.62f, 12.55f);
        pathBuilderB.curveToRelative(1.44f, 0.26f, 2.58f, 1.4f, 2.83f, 2.84f);
        pathBuilderB.curveTo(8.51f, 15.75f, 8.82f, 16.0f, 9.18f, 16.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.46f, 0.0f, 0.82f, -0.41f, 0.75f, -0.86f);
        pathBuilderB.curveToRelative(-0.36f, -2.07f, -1.99f, -3.7f, -4.06f, -4.06f);
        pathBuilderB.curveTo(5.41f, 11.0f, 5.0f, 11.36f, 5.0f, 11.82f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(5.0f, 12.19f, 5.26f, 12.49f, 5.62f, 12.55f);
        pathBuilderB.close();
        pathBuilderB.moveTo(5.64f, 9.53f);
        pathBuilderB.curveToRelative(3.07f, 0.3f, 5.52f, 2.75f, 5.83f, 5.82f);
        pathBuilderB.curveToRelative(0.04f, 0.37f, 0.37f, 0.65f, 0.74f, 0.65f);
        pathBuilderB.curveToRelative(0.45f, 0.0f, 0.79f, -0.4f, 0.75f, -0.85f);
        pathBuilderB.curveToRelative(-0.4f, -3.74f, -3.37f, -6.71f, -7.11f, -7.1f);
        pathBuilderB.curveTo(5.4f, 8.0f, 5.0f, 8.34f, 5.0f, 8.79f);
        pathBuilderB.curveTo(5.0f, 9.16f, 5.27f, 9.5f, 5.64f, 9.53f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectedTv = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
