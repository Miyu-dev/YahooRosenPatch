package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Attachment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_attachment", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Attachment", "Landroidx/compose/material/icons/Icons$Rounded;", "getAttachment", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AttachmentKt {
    private static ImageVector _attachment;

    public static final ImageVector getAttachment(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _attachment;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Attachment", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(17.75f, 16.0f, 7.17f);
        pathBuilderB.curveToRelative(-2.09f, 0.0f, -3.95f, -1.53f, -4.15f, -3.61f);
        pathBuilderB.curveTo(2.79f, 10.01f, 4.66f, 8.0f, 7.0f, 8.0f);
        pathBuilderB.horizontalLineToRelative(12.36f);
        pathBuilderB.curveToRelative(1.31f, 0.0f, 2.5f, 0.94f, 2.63f, 2.24f);
        pathBuilderB.curveToRelative(0.15f, 1.5f, -1.02f, 2.76f, -2.49f, 2.76f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(8.75f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderB.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderB.horizontalLineTo(9.14f);
        pathBuilderB.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        pathBuilderB.curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f);
        pathBuilderB.horizontalLineToRelative(10.33f);
        pathBuilderB.curveToRelative(2.09f, 0.0f, 3.95f, -1.53f, 4.15f, -3.61f);
        pathBuilderB.curveToRelative(0.23f, -2.39f, -1.64f, -4.39f, -3.98f, -4.39f);
        pathBuilderB.horizontalLineTo(7.23f);
        pathBuilderB.curveToRelative(-2.87f, 0.0f, -5.44f, 2.1f, -5.71f, 4.96f);
        pathBuilderB.curveToRelative(-0.3f, 3.29f, 2.26f, 6.04f, 5.48f, 6.04f);
        pathBuilderB.horizontalLineToRelative(10.75f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderB, -0.34f, -0.75f, -0.75f, -0.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachment = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
