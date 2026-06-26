package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Webhook.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_webhook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Webhook", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWebhook", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WebhookKt {
    private static ImageVector _webhook;

    public static final ImageVector getWebhook(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _webhook;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Webhook", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.0f, 15.0f, 5.88f, 0.0f);
        pathBuilderA.curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderA.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderA.curveToRelative(-0.44f, 0.0f, -0.84f, -0.19f, -1.12f, -0.5f);
        pathBuilderA.lineToRelative(-3.98f, 0.0f);
        pathBuilderA.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        pathBuilderA.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilderA.curveToRelative(0.0f, -2.42f, 1.72f, -4.44f, 4.0f, -4.9f);
        pathBuilderA.lineToRelative(0.0f, 2.07f);
        pathBuilderA.curveTo(4.84f, 13.58f, 4.0f, 14.7f, 4.0f, 16.0f);
        pathBuilderA.curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        a.y(pathBuilderA, 15.0f, 12.5f, 4.0f);
        pathBuilderA.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f);
        pathBuilderA.lineToRelative(-2.35f, 3.9f);
        pathBuilderA.curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16.0f);
        pathBuilderA.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderA.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderA.curveToRelative(0.0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f);
        pathBuilderA.lineToRelative(3.38f, -5.63f);
        pathBuilderA.curveTo(10.49f, 9.61f, 9.5f, 8.42f, 9.5f, 7.0f);
        pathBuilderA.curveTo(9.5f, 5.35f, 10.85f, 4.0f, 12.5f, 4.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.0f, 13.0f);
        pathBuilderA.curveToRelative(-0.64f, 0.0f, -1.23f, 0.2f, -1.72f, 0.54f);
        pathBuilderA.lineToRelative(-3.05f, -5.07f);
        pathBuilderA.curveTo(11.53f, 8.35f, 11.0f, 7.74f, 11.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderA.reflectiveCurveTo(14.0f, 6.17f, 14.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f);
        pathBuilderA.lineToRelative(2.19f, 3.65f);
        pathBuilderA.curveTo(16.41f, 11.03f, 16.7f, 11.0f, 17.0f, 11.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilderA.curveToRelative(-1.85f, 0.0f, -3.47f, -1.01f, -4.33f, -2.5f);
        pathBuilderA.lineToRelative(2.67f, 0.0f);
        pathBuilderA.curveTo(15.82f, 18.82f, 16.39f, 19.0f, 17.0f, 19.0f);
        pathBuilderA.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 18.65f, 13.0f, 17.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _webhook = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
