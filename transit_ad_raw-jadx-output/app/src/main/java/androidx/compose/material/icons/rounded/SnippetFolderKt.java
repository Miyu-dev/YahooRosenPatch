package androidx.compose.material.icons.rounded;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SnippetFolder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_snippetFolder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SnippetFolder", "Landroidx/compose/material/icons/Icons$Rounded;", "getSnippetFolder", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SnippetFolderKt {
    private static ImageVector _snippetFolder;

    public static final ImageVector getSnippetFolder(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _snippetFolder;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SnippetFolder", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = androidx.appcompat.app.m.o(15.88f, 10.5f, 1.62f, 1.62f, 3.38f);
        pathBuilderO.lineToRelative(-3.0f, 0.0f);
        pathBuilderO.verticalLineToRelative(-5.0f);
        pathBuilderO.horizontalLineTo(15.88f);
        pathBuilderO.close();
        pathBuilderO.moveTo(22.0f, 8.0f);
        pathBuilderO.verticalLineToRelative(10.0f);
        pathBuilderO.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderO.horizontalLineTo(4.0f);
        pathBuilderO.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderO.lineTo(2.01f, 6.0f);
        pathBuilderO.curveTo(2.01f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f);
        pathBuilderO.horizontalLineToRelative(5.17f);
        pathBuilderO.curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f);
        pathBuilderO.lineTo(12.0f, 6.0f);
        pathBuilderO.horizontalLineToRelative(8.0f);
        pathBuilderO.curveTo(21.1f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(19.0f, 11.91f);
        pathBuilderO.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilderO.lineToRelative(-1.91f, -1.91f);
        pathBuilderO.curveTo(16.61f, 9.11f, 16.35f, 9.0f, 16.09f, 9.0f);
        pathBuilderO.horizontalLineTo(14.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderO.verticalLineToRelative(6.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.lineToRelative(4.0f, 0.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderO, 11.91f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snippetFolder = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
