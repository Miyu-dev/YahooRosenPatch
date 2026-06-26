package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: Sync.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sync", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sync", "Landroidx/compose/material/icons/Icons$Rounded;", "getSync", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SyncKt {
    private static ImageVector _sync;

    public static final ImageVector getSync(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sync;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sync", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 4.0f, 12.0f, 2.21f);
        pathBuilderA.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderA.lineToRelative(-2.8f, 2.79f);
        pathBuilderA.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderA.lineToRelative(2.79f, 2.79f);
        pathBuilderA.curveToRelative(0.32f, 0.31f, 0.86f, 0.09f, 0.86f, -0.36f);
        pathBuilderA.lineTo(12.0f, 6.0f);
        pathBuilderA.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilderA.curveToRelative(0.0f, 0.79f, -0.15f, 1.56f, -0.44f, 2.25f);
        pathBuilderA.curveToRelative(-0.15f, 0.36f, -0.04f, 0.77f, 0.23f, 1.04f);
        pathBuilderA.curveToRelative(0.51f, 0.51f, 1.37f, 0.33f, 1.64f, -0.34f);
        pathBuilderA.curveToRelative(0.37f, -0.91f, 0.57f, -1.91f, 0.57f, -2.95f);
        pathBuilderA.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 18.0f);
        pathBuilderA.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderA.curveToRelative(0.0f, -0.79f, 0.15f, -1.56f, 0.44f, -2.25f);
        pathBuilderA.curveToRelative(0.15f, -0.36f, 0.04f, -0.77f, -0.23f, -1.04f);
        pathBuilderA.curveToRelative(-0.51f, -0.51f, -1.37f, -0.33f, -1.64f, 0.34f);
        pathBuilderA.curveTo(4.2f, 9.96f, 4.0f, 10.96f, 4.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilderA.verticalLineToRelative(1.79f);
        pathBuilderA.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderA.lineToRelative(2.79f, -2.79f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilderA.lineToRelative(-2.79f, -2.79f);
        pathBuilderA.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderA, 12.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sync = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
