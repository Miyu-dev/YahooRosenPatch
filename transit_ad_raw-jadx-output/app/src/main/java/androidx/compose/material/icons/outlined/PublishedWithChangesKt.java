package androidx.compose.material.icons.outlined;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: PublishedWithChanges.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_publishedWithChanges", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PublishedWithChanges", "Landroidx/compose/material/icons/Icons$Outlined;", "getPublishedWithChanges", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PublishedWithChangesKt {
    private static ImageVector _publishedWithChanges;

    public static final ImageVector getPublishedWithChanges(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _publishedWithChanges;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PublishedWithChanges", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(18.6f, 19.5f, 21.0f, 2.0f, -6.0f);
        a.m(pathBuilderO, -6.0f, 2.0f, 2.73f);
        pathBuilderO.curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.23f);
        pathBuilderO.curveToRelative(0.0f, -4.07f, -3.06f, -7.44f, -7.0f, -7.93f);
        pathBuilderO.verticalLineTo(2.05f);
        pathBuilderO.curveToRelative(5.05f, 0.5f, 9.0f, 4.76f, 9.0f, 9.95f);
        pathBuilderO.curveTo(22.0f, 14.99f, 20.68f, 17.67f, 18.6f, 19.5f);
        pathBuilderO.close();
        pathBuilderO.moveTo(4.0f, 12.0f);
        pathBuilderO.curveToRelative(0.0f, -2.52f, 1.17f, -4.77f, 3.0f, -6.23f);
        v.C(pathBuilderO, 8.5f, 2.0f, -6.0f, 3.0f);
        pathBuilderO.verticalLineToRelative(2.0f);
        pathBuilderO.horizontalLineToRelative(2.4f);
        pathBuilderO.curveTo(3.32f, 6.33f, 2.0f, 9.01f, 2.0f, 12.0f);
        pathBuilderO.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilderO.verticalLineToRelative(-2.02f);
        pathBuilderO.curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f);
        androidx.browser.browseractions.a.y(pathBuilderO, 16.24f, 8.11f, -5.66f, 5.66f);
        pathBuilderO.lineToRelative(-2.83f, -2.83f);
        pathBuilderO.lineToRelative(-1.41f, 1.41f);
        pathBuilderO.lineToRelative(4.24f, 4.24f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderO, 7.07f, -7.07f, 16.24f, 8.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publishedWithChanges = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
