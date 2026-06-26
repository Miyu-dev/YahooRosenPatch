package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: RemoveModerator.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_removeModerator", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RemoveModerator", "Landroidx/compose/material/icons/Icons$Outlined;", "getRemoveModerator", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RemoveModerator", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = androidx.appcompat.app.m.o(12.0f, 4.14f, 6.0f, 2.25f, 4.7f);
        pathBuilderO.curveToRelative(0.0f, 1.19f, -0.23f, 2.36f, -0.64f, 3.44f);
        pathBuilderO.lineToRelative(1.51f, 1.51f);
        pathBuilderO.curveToRelative(0.72f, -1.53f, 1.13f, -3.22f, 1.13f, -4.95f);
        pathBuilderO.verticalLineTo(5.0f);
        pathBuilderO.lineToRelative(-8.0f, -3.0f);
        pathBuilderO.lineTo(6.78f, 3.96f);
        s.r(pathBuilderO, 1.55f, 1.55f, 12.0f, 4.14f);
        pathBuilderO.moveTo(2.81f, 2.81f);
        pathBuilderO.lineTo(1.39f, 4.22f);
        pathBuilderO.lineTo(4.0f, 6.83f);
        pathBuilderO.verticalLineToRelative(4.26f);
        pathBuilderO.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilderO.curveToRelative(1.72f, -0.43f, 3.28f, -1.36f, 4.55f, -2.62f);
        pathBuilderO.lineToRelative(3.23f, 3.23f);
        s.r(pathBuilderO, 1.41f, -1.41f, 2.81f, 2.81f);
        pathBuilderO.moveTo(12.0f, 19.92f);
        pathBuilderO.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        pathBuilderO.verticalLineTo(8.83f);
        pathBuilderO.lineToRelative(9.14f, 9.14f);
        pathBuilderO.curveTo(14.24f, 18.85f, 13.17f, 19.54f, 12.0f, 19.92f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
