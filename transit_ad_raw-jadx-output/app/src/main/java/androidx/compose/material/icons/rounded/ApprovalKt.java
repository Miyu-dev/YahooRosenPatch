package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Approval.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_approval", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Approval", "Landroidx/compose/material/icons/Icons$Rounded;", "getApproval", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ApprovalKt {
    private static ImageVector _approval;

    public static final ImageVector getApproval(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _approval;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Approval", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(4.0f, 16.0f, 4.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(12.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.verticalLineToRelative(-4.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE.horizontalLineTo(6.0f);
        pathBuilderE.curveTo(4.9f, 14.0f, 4.0f, 14.9f, 4.0f, 16.0f);
        a.k(pathBuilderE, 17.0f, 18.0f, 7.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderE.verticalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderE.horizontalLineToRelative(10.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(0.0f);
        pathBuilderE.curveTo(18.0f, 17.55f, 17.55f, 18.0f, 17.0f, 18.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(12.0f, 2.0f);
        pathBuilderE.curveTo(9.54f, 2.0f, 7.48f, 3.79f, 7.07f, 6.13f);
        pathBuilderE.curveTo(6.99f, 6.65f, 7.13f, 7.18f, 7.43f, 7.6f);
        pathBuilderE.lineToRelative(3.76f, 5.26f);
        pathBuilderE.curveToRelative(0.4f, 0.56f, 1.23f, 0.56f, 1.63f, 0.0f);
        pathBuilderE.lineToRelative(3.76f, -5.26f);
        pathBuilderE.curveToRelative(0.3f, -0.42f, 0.44f, -0.95f, 0.35f, -1.47f);
        pathBuilderE.curveTo(16.52f, 3.79f, 14.46f, 2.0f, 12.0f, 2.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _approval = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
