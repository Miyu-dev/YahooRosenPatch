package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_connectedTv", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectedTv", "Landroidx/compose/material/icons/Icons$Outlined;", "getConnectedTv", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ConnectedTvKt {
    private static ImageVector _connectedTv;

    public static final ImageVector getConnectedTv(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _connectedTv;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ConnectedTv", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 3.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.t(pathBuilderB, 4.0f, 2.0f, 8.0f, -2.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilderB.lineTo(22.0f, 5.0f);
        pathBuilderB.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderB, 20.0f, 17.0f, 4.0f, 5.0f);
        b.m(pathBuilderB, 16.0f, 17.0f, 5.0f, 14.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveTo(7.0f, 14.89f, 6.11f, 14.0f, 5.0f, 14.0f);
        androidx.compose.animation.a.n(pathBuilderB, 5.0f, 11.0f, 1.43f);
        pathBuilderB.curveToRelative(1.97f, 0.0f, 3.57f, 1.6f, 3.57f, 3.57f);
        pathBuilderB.horizontalLineTo(10.0f);
        pathBuilderB.curveTo(10.0f, 13.24f, 7.76f, 11.0f, 5.0f, 11.0f);
        androidx.compose.animation.a.n(pathBuilderB, 5.0f, 8.0f, 1.45f);
        pathBuilderB.curveToRelative(3.61f, 0.0f, 6.55f, 2.93f, 6.55f, 6.55f);
        pathBuilderB.horizontalLineTo(13.0f);
        pathBuilderB.curveTo(13.0f, 11.58f, 9.41f, 8.0f, 5.0f, 8.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectedTv = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
