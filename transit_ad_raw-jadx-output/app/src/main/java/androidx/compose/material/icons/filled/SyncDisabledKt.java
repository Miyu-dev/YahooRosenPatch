package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: SyncDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_syncDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SyncDisabled", "Landroidx/compose/material/icons/Icons$Filled;", "getSyncDisabled", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SyncDisabledKt {
    private static ImageVector _syncDisabled;

    public static final ImageVector getSyncDisabled(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _syncDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SyncDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.0f, 6.35f, 10.0f, 4.26f);
        pathBuilderA.curveToRelative(-0.8f, 0.21f, -1.55f, 0.54f, -2.23f, 0.96f);
        pathBuilderA.lineToRelative(1.46f, 1.46f);
        pathBuilderA.curveToRelative(0.25f, -0.12f, 0.5f, -0.24f, 0.77f, -0.33f);
        a.y(pathBuilderA, 2.86f, 5.41f, 2.36f, 2.36f);
        pathBuilderA.curveTo(4.45f, 8.99f, 4.0f, 10.44f, 4.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        androidx.compose.animation.a.o(pathBuilderA, 4.0f, 20.0f, 6.0f, -6.0f);
        pathBuilderA.lineToRelative(-2.24f, 2.24f);
        pathBuilderA.curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -1.0f, 0.25f, -1.94f, 0.68f, -2.77f);
        pathBuilderA.lineToRelative(8.08f, 8.08f);
        pathBuilderA.curveToRelative(-0.25f, 0.13f, -0.5f, 0.25f, -0.77f, 0.34f);
        pathBuilderA.verticalLineToRelative(2.09f);
        pathBuilderA.curveToRelative(0.8f, -0.21f, 1.55f, -0.54f, 2.23f, -0.96f);
        pathBuilderA.lineToRelative(2.36f, 2.36f);
        pathBuilderA.lineToRelative(1.27f, -1.27f);
        android.support.v4.media.a.C(pathBuilderA, 4.14f, 4.14f, 2.86f, 5.41f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 20.0f, 4.0f, -6.0f, 6.0f);
        pathBuilderA.lineToRelative(2.24f, -2.24f);
        pathBuilderA.curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 1.0f, -0.25f, 1.94f, -0.68f, 2.77f);
        pathBuilderA.lineToRelative(1.46f, 1.46f);
        pathBuilderA.curveTo(19.55f, 15.01f, 20.0f, 13.56f, 20.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderA, 20.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
