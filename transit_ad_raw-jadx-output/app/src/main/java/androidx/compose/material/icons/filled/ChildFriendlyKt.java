package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: ChildFriendly.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_childFriendly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChildFriendly", "Landroidx/compose/material/icons/Icons$Filled;", "getChildFriendly", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChildFriendlyKt {
    private static ImageVector _childFriendly;

    public static final ImageVector getChildFriendly(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _childFriendly;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ChildFriendly", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(13.0f, 2.0f, 8.0f, 8.0f);
        pathBuilderE.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(19.32f, 15.89f);
        pathBuilderE.curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f);
        pathBuilderE.lineTo(6.44f, 11.0f);
        pathBuilderE.lineToRelative(-0.95f, -2.0f);
        b.s(pathBuilderE, 2.0f, 9.0f, 2.0f, 2.22f);
        pathBuilderE.reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f);
        pathBuilderE.curveToRelative(-1.1f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f);
        pathBuilderE.curveTo(4.5f, 20.43f, 6.07f, 22.0f, 8.0f, 22.0f);
        pathBuilderE.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilderE.horizontalLineToRelative(2.08f);
        pathBuilderE.curveToRelative(0.24f, 1.7f, 1.7f, 3.0f, 3.46f, 3.0f);
        pathBuilderE.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderE.curveToRelative(0.0f, -1.04f, -0.46f, -1.97f, -1.18f, -2.61f);
        pathBuilderE.close();
        pathBuilderE.moveTo(8.0f, 20.0f);
        pathBuilderE.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f);
        pathBuilderE.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderE.reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(17.0f, 20.0f);
        pathBuilderE.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f);
        pathBuilderE.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderE, 17.83f, 20.0f, 17.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _childFriendly = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
