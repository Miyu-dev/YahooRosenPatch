package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: AssignmentInd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_assignmentInd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AssignmentInd", "Landroidx/compose/material/icons/Icons$Outlined;", "getAssignmentInd", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AssignmentIndKt {
    private static ImageVector _assignmentInd;

    public static final ImageVector getAssignmentInd(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _assignmentInd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AssignmentInd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(19.0f, 3.0f, -4.18f);
        pathBuilderB.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-2.4f, 0.84f, -2.82f, 2.0f);
        pathBuilderB.lineTo(5.0f, 3.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.lineTo(21.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 2.75f);
        pathBuilderB.curveToRelative(0.22f, 0.0f, 0.41f, 0.1f, 0.55f, 0.25f);
        pathBuilderB.curveToRelative(0.12f, 0.13f, 0.2f, 0.31f, 0.2f, 0.5f);
        pathBuilderB.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderB.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderB.curveToRelative(0.0f, -0.19f, 0.08f, -0.37f, 0.2f, -0.5f);
        pathBuilderB.curveToRelative(0.14f, -0.15f, 0.33f, -0.25f, 0.55f, -0.25f);
        a.t(pathBuilderB, 19.0f, 19.0f, 5.0f, 19.0f);
        s.w(pathBuilderB, 5.0f, 5.0f, 14.0f, 14.0f);
        pathBuilderB.moveTo(12.0f, 6.0f);
        pathBuilderB.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 10.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.t(pathBuilderB, 6.0f, 16.47f, 6.0f, 18.0f);
        pathBuilderB.horizontalLineToRelative(12.0f);
        pathBuilderB.verticalLineToRelative(-1.53f);
        pathBuilderB.curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f);
        pathBuilderB.reflectiveCurveToRelative(-6.0f, 1.07f, -6.0f, 3.58f);
        pathBuilderB.close();
        pathBuilderB.moveTo(8.31f, 16.0f);
        pathBuilderB.curveToRelative(0.69f, -0.56f, 2.38f, -1.12f, 3.69f, -1.12f);
        pathBuilderB.reflectiveCurveToRelative(3.01f, 0.56f, 3.69f, 1.12f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 8.31f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assignmentInd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
