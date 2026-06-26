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

/* JADX INFO: compiled from: Backup.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_backup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Backup", "Landroidx/compose/material/icons/Icons$Rounded;", "getBackup", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BackupKt {
    private static ImageVector _backup;

    public static final ImageVector getBackup(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _backup;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Backup", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.0f, 11.0f);
        pathBuilderD.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilderD.curveTo(8.78f, 4.0f, 6.07f, 6.18f, 5.26f, 9.15f);
        pathBuilderD.curveTo(2.82f, 9.71f, 1.0f, 11.89f, 1.0f, 14.5f);
        pathBuilderD.curveTo(1.0f, 17.54f, 3.46f, 20.0f, 6.5f, 20.0f);
        pathBuilderD.curveToRelative(1.76f, 0.0f, 10.25f, 0.0f, 12.0f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(2.49f, -0.01f, 4.5f, -2.03f, 4.5f, -4.52f);
        pathBuilderD.curveTo(23.0f, 13.15f, 21.25f, 11.26f, 19.0f, 11.0f);
        androidx.compose.animation.a.n(pathBuilderD, 13.0f, 13.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.horizontalLineTo(9.21f);
        pathBuilderD.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
        pathBuilderD.lineToRelative(2.79f, -2.79f);
        pathBuilderD.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderD.lineToRelative(2.79f, 2.79f);
        pathBuilderD.curveToRelative(0.31f, 0.31f, 0.09f, 0.85f, -0.35f, 0.85f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderD, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backup = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
