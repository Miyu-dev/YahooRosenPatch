package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: MailLock.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mailLock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MailLock", "Landroidx/compose/material/icons/Icons$Sharp;", "getMailLock", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MailLockKt {
    private static ImageVector _mailLock;

    public static final ImageVector getMailLock(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _mailLock;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MailLock", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 9.97f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(2.01f);
        a.o(pathBuilder, 2.0f, 20.0f, 14.0f, -5.03f);
        pathBuilder.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.w(pathBuilder, 22.0f, 20.0f, 8.0f);
        pathBuilder.lineToRelative(-8.0f, 5.0f);
        pathBuilder.lineTo(4.0f, 8.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.lineToRelative(8.0f, 5.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.l(pathBuilder, 8.0f, -5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(23.0f, 15.0f, -0.89f);
        pathBuilderE.curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f);
        pathBuilderE.curveTo(20.08f, 11.82f, 19.0f, 12.79f, 19.0f, 14.0f);
        androidx.browser.browseractions.a.l(pathBuilderE, 1.0f, -1.0f, 5.0f, 6.0f);
        h.z(pathBuilderE, -5.0f, 23.0f, 22.0f, 15.0f);
        pathBuilderE.horizontalLineToRelative(-2.0f);
        pathBuilderE.verticalLineToRelative(-1.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderE.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderE, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mailLock = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
