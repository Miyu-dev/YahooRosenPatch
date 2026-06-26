package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AddReaction.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addReaction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddReaction", "Landroidx/compose/material/icons/Icons$Filled;", "getAddReaction", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddReactionKt {
    private static ImageVector _addReaction;

    public static final ImageVector getAddReaction(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddReaction", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(18.0f, 9.0f, 7.0f, -2.0f, 2.84f);
        pathBuilderB.curveTo(14.77f, 2.3f, 13.42f, 2.0f, 11.99f, 2.0f);
        pathBuilderB.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilderB.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -1.05f, -0.17f, -2.05f, -0.47f, -3.0f);
        androidx.compose.animation.b.w(pathBuilderB, 18.0f, 15.5f, 8.0f);
        pathBuilderB.curveTo(16.33f, 8.0f, 17.0f, 8.67f, 17.0f, 9.5f);
        pathBuilderB.reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f);
        pathBuilderB.reflectiveCurveTo(14.0f, 10.33f, 14.0f, 9.5f);
        pathBuilderB.reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(8.5f, 8.0f);
        pathBuilderB.curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f);
        pathBuilderB.reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f);
        pathBuilderB.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        pathBuilderB.reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 17.5f);
        pathBuilderB.curveToRelative(-2.33f, 0.0f, -4.31f, -1.46f, -5.11f, -3.5f);
        pathBuilderB.horizontalLineToRelative(10.22f);
        pathBuilderB.curveTo(16.31f, 16.04f, 14.33f, 17.5f, 12.0f, 17.5f);
        androidx.compose.animation.b.r(pathBuilderB, 22.0f, 3.0f, 2.0f, 2.0f);
        a.u(pathBuilderB, -2.0f, 2.0f, -2.0f, 5.0f);
        androidx.appcompat.view.menu.a.A(pathBuilderB, -2.0f, 3.0f, 2.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addReaction = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
