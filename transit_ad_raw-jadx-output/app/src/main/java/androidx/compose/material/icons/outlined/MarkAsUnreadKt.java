package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: MarkAsUnread.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_markAsUnread", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MarkAsUnread", "Landroidx/compose/material/icons/Icons$Outlined;", "getMarkAsUnread", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MarkAsUnreadKt {
    private static ImageVector _markAsUnread;

    public static final ImageVector getMarkAsUnread(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _markAsUnread;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MarkAsUnread", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(16.23f, 7.0f, 2.6f);
        pathBuilderB.curveToRelative(-0.06f, -0.47f, -0.36f, -0.94f, -0.79f, -1.17f);
        pathBuilderB.lineTo(10.5f, 2.0f);
        pathBuilderB.lineTo(2.8f, 5.83f);
        pathBuilderB.curveTo(2.32f, 6.09f, 2.0f, 6.64f, 2.0f, 7.17f);
        pathBuilderB.verticalLineTo(15.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.verticalLineTo(7.4f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB, 10.5f, 4.0f, 16.23f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = s.b(20.0f, 8.0f, 7.0f);
        pathBuilderB2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB2.verticalLineToRelative(9.0f);
        pathBuilderB2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB2.horizontalLineToRelative(13.0f);
        pathBuilderB2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB2.verticalLineToRelative(-9.0f);
        pathBuilderB2.curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f);
        a.q(pathBuilderB2, 20.0f, 19.0f, 7.0f, -7.0f);
        pathBuilderB2.lineToRelative(6.5f, 3.33f);
        h.y(pathBuilderB2, 20.0f, 12.0f, 19.0f);
        pathBuilderB2.moveTo(13.5f, 13.33f);
        pathBuilderB2.lineTo(7.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.r(pathBuilderB2, 13.0f, 13.5f, 13.33f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markAsUnread = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
