package androidx.compose.material.icons.rounded;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Schema.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_schema", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Schema", "Landroidx/compose/material/icons/Icons$Rounded;", "getSchema", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SchemaKt {
    private static ImageVector _schema;

    public static final ImageVector getSchema(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _schema;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Schema", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(14.0f, 10.5f, 11.0f, -3.0f, -0.5f);
        pathBuilderC.curveTo(11.0f, 9.67f, 10.33f, 9.0f, 9.5f, 9.0f);
        v.m(pathBuilderC, -1.0f, 7.0f, 1.0f);
        pathBuilderC.curveTo(10.33f, 7.0f, 11.0f, 6.33f, 11.0f, 5.5f);
        pathBuilderC.verticalLineToRelative(-3.0f);
        pathBuilderC.curveTo(11.0f, 1.67f, 10.33f, 1.0f, 9.5f, 1.0f);
        pathBuilderC.horizontalLineToRelative(-4.0f);
        pathBuilderC.curveTo(4.67f, 1.0f, 4.0f, 1.67f, 4.0f, 2.5f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.curveTo(4.0f, 6.33f, 4.67f, 7.0f, 5.5f, 7.0f);
        a.s(pathBuilderC, 1.0f, 2.0f, -1.0f);
        pathBuilderC.curveTo(4.67f, 9.0f, 4.0f, 9.67f, 4.0f, 10.5f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.curveTo(4.0f, 14.33f, 4.67f, 15.0f, 5.5f, 15.0f);
        a.s(pathBuilderC, 1.0f, 2.0f, -1.0f);
        pathBuilderC.curveTo(4.67f, 17.0f, 4.0f, 17.67f, 4.0f, 18.5f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.curveTo(4.0f, 22.33f, 4.67f, 23.0f, 5.5f, 23.0f);
        pathBuilderC.horizontalLineToRelative(4.0f);
        pathBuilderC.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderC.verticalLineToRelative(-3.0f);
        pathBuilderC.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        a.s(pathBuilderC, -1.0f, -2.0f, 1.0f);
        pathBuilderC.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        v.r(pathBuilderC, 13.0f, 3.0f, 0.5f);
        pathBuilderC.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderC.horizontalLineToRelative(4.0f);
        pathBuilderC.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderC.verticalLineToRelative(-3.0f);
        pathBuilderC.curveTo(21.0f, 9.67f, 20.33f, 9.0f, 19.5f, 9.0f);
        pathBuilderC.horizontalLineToRelative(-4.0f);
        pathBuilderC.curveTo(14.67f, 9.0f, 14.0f, 9.67f, 14.0f, 10.5f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _schema = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
