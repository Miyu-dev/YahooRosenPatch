package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: EditOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getEditOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EditOffKt {
    private static ImageVector _editOff;

    public static final ImageVector getEditOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _editOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.06f, 9.02f, 0.92f, 0.92f);
        pathBuilderA.lineToRelative(-1.11f, 1.11f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(2.52f, -2.52f);
        pathBuilderA.lineToRelative(-3.75f, -3.75f);
        pathBuilderA.lineToRelative(-2.52f, 2.52f);
        s.r(pathBuilderA, 1.41f, 1.41f, 14.06f, 9.02f);
        pathBuilderA.moveTo(20.71f, 7.04f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.lineToRelative(-2.34f, -2.34f);
        pathBuilderA.curveTo(18.17f, 3.09f, 17.92f, 3.0f, 17.66f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilderA.lineToRelative(-1.83f, 1.83f);
        s.r(pathBuilderA, 3.75f, 3.75f, 20.71f, 7.04f);
        pathBuilderA.moveTo(2.81f, 2.81f);
        pathBuilderA.lineTo(1.39f, 4.22f);
        pathBuilderA.lineToRelative(7.32f, 7.32f);
        androidx.appcompat.app.m.r(pathBuilderA, 3.0f, 17.25f, 21.0f, 3.75f);
        pathBuilderA.lineToRelative(5.71f, -5.71f);
        pathBuilderA.lineToRelative(7.32f, 7.32f);
        s.r(pathBuilderA, 1.41f, -1.41f, 2.81f, 2.81f);
        a.b.z(pathBuilderA, 5.92f, 19.0f, 5.0f, -0.92f);
        pathBuilderA.lineToRelative(5.13f, -5.13f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 0.92f, 0.92f, 5.92f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
