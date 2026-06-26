package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RoomPreferences.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_roomPreferences", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RoomPreferences", "Landroidx/compose/material/icons/Icons$Outlined;", "getRoomPreferences", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RoomPreferencesKt {
    private static ImageVector _roomPreferences;

    public static final ImageVector getRoomPreferences(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _roomPreferences;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RoomPreferences", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.69f, 16.37f, 1.14f, -1.0f);
        pathBuilderA.lineToRelative(-1.0f, -1.73f);
        pathBuilderA.lineToRelative(-1.45f, 0.49f);
        pathBuilderA.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilderA.lineTo(19.0f, 12.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.lineToRelative(-0.3f, 1.49f);
        pathBuilderA.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilderA.lineToRelative(-1.45f, -0.49f);
        pathBuilderA.lineToRelative(-1.0f, 1.73f);
        pathBuilderA.lineToRelative(1.14f, 1.0f);
        pathBuilderA.curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f);
        pathBuilderA.lineToRelative(-1.14f, 1.0f);
        pathBuilderA.lineToRelative(1.0f, 1.73f);
        pathBuilderA.lineToRelative(1.45f, -0.49f);
        pathBuilderA.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilderA.lineTo(17.0f, 22.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.lineToRelative(0.3f, -1.49f);
        pathBuilderA.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilderA.lineToRelative(1.45f, 0.49f);
        pathBuilderA.lineToRelative(1.0f, -1.73f);
        pathBuilderA.lineToRelative(-1.14f, -1.0f);
        pathBuilderA.curveTo(21.77f, 17.13f, 21.77f, 16.87f, 21.69f, 16.37f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.0f, 19.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderA.reflectiveCurveTo(19.1f, 19.0f, 18.0f, 19.0f);
        androidx.appcompat.app.m.n(pathBuilderA, 19.0f, 4.0f, 6.0f, -2.0f);
        s.y(pathBuilderA, 6.0f, -2.0f, 6.0f, -2.0f);
        b.x(pathBuilderA, 5.0f, 7.0f, 14.0f, 5.0f);
        a.b.x(pathBuilderA, 2.0f, 3.0f, -2.0f, 2.0f);
        c.j(pathBuilderA, 3.0f, 10.0f, 1.0f, 19.0f);
        a.x(pathBuilderA, 12.0f, 13.0f, -2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderA, 2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomPreferences = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
