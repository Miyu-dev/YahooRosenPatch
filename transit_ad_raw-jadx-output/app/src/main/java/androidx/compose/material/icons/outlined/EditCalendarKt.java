package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: EditCalendar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editCalendar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditCalendar", "Landroidx/compose/material/icons/Icons$Outlined;", "getEditCalendar", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EditCalendarKt {
    private static ImageVector _editCalendar;

    public static final ImageVector getEditCalendar(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _editCalendar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditCalendar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(5.0f, 10.0f, 14.0f, 2.0f, 2.0f);
        pathBuilderF.verticalLineTo(6.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.appcompat.app.m.w(pathBuilderF, -1.0f, 2.0f, -2.0f, 2.0f);
        androidx.compose.animation.a.v(pathBuilderF, 8.0f, 2.0f, 6.0f, 2.0f);
        pathBuilderF.horizontalLineTo(5.0f);
        pathBuilderF.curveTo(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        pathBuilderF.lineTo(3.0f, 20.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        s.A(pathBuilderF, 7.0f, -2.0f, 5.0f, 10.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 5.0f, 6.0f, 14.0f, 2.0f);
        b.B(pathBuilderF, 5.0f, 6.0f, 22.84f, 16.28f);
        pathBuilderF.lineToRelative(-0.71f, 0.71f);
        pathBuilderF.lineToRelative(-2.12f, -2.12f);
        pathBuilderF.lineToRelative(0.71f, -0.71f);
        pathBuilderF.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderF.lineToRelative(0.71f, 0.71f);
        pathBuilderF.curveTo(23.23f, 15.26f, 23.23f, 15.89f, 22.84f, 16.28f);
        a.y(pathBuilderF, 19.3f, 15.58f, 2.12f, 2.12f);
        androidx.compose.animation.a.r(pathBuilderF, -5.3f, 5.3f, 14.0f, -2.12f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderF, 19.3f, 15.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editCalendar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
