package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: EditAttributes.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editAttributes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditAttributes", "Landroidx/compose/material/icons/Icons$Outlined;", "getEditAttributes", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditAttributes", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.63f, 7.0f, 6.37f, 7.0f);
        pathBuilderA.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        pathBuilderA.horizontalLineToRelative(11.26f);
        pathBuilderA.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        a.t(pathBuilderA, 17.63f, 15.0f, 6.37f, 15.0f);
        pathBuilderA.curveTo(5.09f, 15.0f, 4.0f, 13.63f, 4.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(1.09f, -3.0f, 2.37f, -3.0f);
        pathBuilderA.horizontalLineToRelative(11.26f);
        pathBuilderA.curveTo(18.91f, 9.0f, 20.0f, 10.37f, 20.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.09f, 3.0f, -2.37f, 3.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 7.24f, 13.06f, -1.87f, -1.87f);
        pathBuilderA.lineToRelative(-0.7f, 0.7f);
        pathBuilderA.lineToRelative(2.57f, 2.57f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 4.22f, -4.22f, -0.7f, -0.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
