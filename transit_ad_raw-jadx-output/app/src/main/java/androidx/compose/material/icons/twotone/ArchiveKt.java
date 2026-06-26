package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Archive.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_archive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Archive", "Landroidx/compose/material/icons/Icons$TwoTone;", "getArchive", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ArchiveKt {
    private static ImageVector _archive;

    public static final ImageVector getArchive(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _archive;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Archive", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(5.0f, 19.0f, 14.0f, 19.0f, 8.0f);
        b.k(pathBuilderC, 5.0f, 8.0f, 11.0f);
        a.b.y(pathBuilderC, 10.55f, 13.0f, -3.0f, 2.91f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.lineTo(16.0f, 13.0f);
        pathBuilderC.lineToRelative(-4.0f, 4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.h(pathBuilderC, -4.0f, -4.0f, 2.55f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.browser.browseractions.a.f(16.0f, 13.0f, -2.55f, -3.0f, -2.9f);
        pathBuilderF.verticalLineToRelative(3.0f);
        a.A(pathBuilderF, 8.0f, 13.0f, 4.0f, 4.0f);
        pathBuilderF.moveTo(20.54f, 5.23f);
        pathBuilderF.lineToRelative(-1.39f, -1.68f);
        pathBuilderF.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        pathBuilderF.lineTo(6.0f, 3.0f);
        pathBuilderF.curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f);
        pathBuilderF.lineTo(3.46f, 5.23f);
        pathBuilderF.curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f);
        pathBuilderF.lineTo(3.0f, 19.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(14.0f);
        pathBuilderF.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderF.lineTo(21.0f, 6.5f);
        pathBuilderF.curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f);
        a.j(pathBuilderF, 6.24f, 5.0f, 11.52f);
        pathBuilderF.lineToRelative(0.81f, 0.97f);
        a.A(pathBuilderF, 5.44f, 5.97f, 0.8f, -0.97f);
        pathBuilderF.moveTo(19.0f, 19.0f);
        pathBuilderF.lineTo(5.0f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.k(pathBuilderF, 5.0f, 8.0f, 14.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _archive = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
