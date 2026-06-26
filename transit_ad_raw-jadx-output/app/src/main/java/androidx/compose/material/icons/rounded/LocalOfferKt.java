package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LocalOffer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localOffer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalOffer", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalOffer", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalOfferKt {
    private static ImageVector _localOffer;

    public static final ImageVector getLocalOffer(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _localOffer;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalOffer", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.41f, 11.58f, -9.0f, -9.0f);
        pathBuilderA.curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(7.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        pathBuilderA.lineToRelative(9.0f, 9.0f);
        pathBuilderA.curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        pathBuilderA.reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f);
        pathBuilderA.lineToRelative(7.0f, -7.0f);
        pathBuilderA.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        pathBuilderA.reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f);
        pathBuilderA.close();
        pathBuilderA.moveTo(5.5f, 7.0f);
        pathBuilderA.curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        pathBuilderA.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        pathBuilderA.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 6.33f, 7.0f, 5.5f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localOffer = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
