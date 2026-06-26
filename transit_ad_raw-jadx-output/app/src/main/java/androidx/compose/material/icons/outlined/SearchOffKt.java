package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SearchOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_searchOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SearchOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getSearchOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SearchOffKt {
    private static ImageVector _searchOff;

    public static final ImageVector getSearchOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _searchOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SearchOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(15.5f, 14.0f, -0.79f, -0.28f, -0.27f);
        pathBuilderA.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        pathBuilderA.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        pathBuilderA.curveTo(6.08f, 3.0f, 3.28f, 5.64f, 3.03f, 9.0f);
        pathBuilderA.horizontalLineToRelative(2.02f);
        pathBuilderA.curveTo(5.3f, 6.75f, 7.18f, 5.0f, 9.5f, 5.0f);
        pathBuilderA.curveTo(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f);
        pathBuilderA.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        pathBuilderA.curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
        pathBuilderA.verticalLineToRelative(2.02f);
        pathBuilderA.curveTo(9.17f, 15.99f, 9.33f, 16.0f, 9.5f, 16.0f);
        pathBuilderA.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        pathBuilderA.lineTo(14.0f, 14.71f);
        pathBuilderA.verticalLineToRelative(0.79f);
        pathBuilderA.lineToRelative(5.0f, 4.99f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 20.49f, 19.0f, 15.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(6.47f, 10.82f, -2.47f, 2.47f);
        pathBuilderA2.lineToRelative(-2.47f, -2.47f);
        pathBuilderA2.lineToRelative(-0.71f, 0.71f);
        pathBuilderA2.lineToRelative(2.47f, 2.47f);
        pathBuilderA2.lineToRelative(-2.47f, 2.47f);
        pathBuilderA2.lineToRelative(0.71f, 0.71f);
        pathBuilderA2.lineToRelative(2.47f, -2.47f);
        pathBuilderA2.lineToRelative(2.47f, 2.47f);
        pathBuilderA2.lineToRelative(0.71f, -0.71f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, -2.47f, -2.47f, 2.47f, -2.47f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _searchOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
