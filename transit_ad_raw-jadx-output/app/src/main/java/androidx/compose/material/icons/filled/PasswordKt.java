package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Password.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_password", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Password", "Landroidx/compose/material/icons/Icons$Filled;", "getPassword", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PasswordKt {
    private static ImageVector _password;

    public static final ImageVector getPassword(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _password;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Password", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(2.0f, 17.0f, 20.0f, 2.0f, 2.0f);
        a.y(pathBuilderI, 17.0f, 3.15f, 12.95f);
        pathBuilderI.lineTo(4.0f, 11.47f);
        pathBuilderI.lineToRelative(0.85f, 1.48f);
        pathBuilderI.lineToRelative(1.3f, -0.75f);
        h.n(pathBuilderI, 5.3f, 10.72f, 7.0f, -1.5f);
        pathBuilderI.horizontalLineTo(5.3f);
        pathBuilderI.lineToRelative(0.85f, -1.47f);
        pathBuilderI.lineTo(4.85f, 7.0f);
        pathBuilderI.lineTo(4.0f, 8.47f);
        pathBuilderI.lineTo(3.15f, 7.0f);
        pathBuilderI.lineToRelative(-1.3f, 0.75f);
        h.n(pathBuilderI, 2.7f, 9.22f, 1.0f, 1.5f);
        pathBuilderI.horizontalLineToRelative(1.7f);
        a.C(pathBuilderI, 1.85f, 12.2f, 3.15f, 12.95f);
        pathBuilderI.moveTo(9.85f, 12.2f);
        pathBuilderI.lineToRelative(1.3f, 0.75f);
        pathBuilderI.lineTo(12.0f, 11.47f);
        pathBuilderI.lineToRelative(0.85f, 1.48f);
        pathBuilderI.lineToRelative(1.3f, -0.75f);
        androidx.compose.animation.a.r(pathBuilderI, -0.85f, -1.48f, 15.0f, -1.5f);
        pathBuilderI.horizontalLineToRelative(-1.7f);
        pathBuilderI.lineToRelative(0.85f, -1.47f);
        pathBuilderI.lineTo(12.85f, 7.0f);
        pathBuilderI.lineTo(12.0f, 8.47f);
        pathBuilderI.lineTo(11.15f, 7.0f);
        pathBuilderI.lineToRelative(-1.3f, 0.75f);
        androidx.compose.animation.a.r(pathBuilderI, 0.85f, 1.47f, 9.0f, 1.5f);
        androidx.appcompat.view.menu.a.s(pathBuilderI, 1.7f, 9.85f, 12.2f);
        pathBuilderI.moveTo(23.0f, 9.22f);
        pathBuilderI.horizontalLineToRelative(-1.7f);
        pathBuilderI.lineToRelative(0.85f, -1.47f);
        pathBuilderI.lineTo(20.85f, 7.0f);
        pathBuilderI.lineTo(20.0f, 8.47f);
        pathBuilderI.lineTo(19.15f, 7.0f);
        pathBuilderI.lineToRelative(-1.3f, 0.75f);
        androidx.compose.animation.a.r(pathBuilderI, 0.85f, 1.47f, 17.0f, 1.5f);
        pathBuilderI.horizontalLineToRelative(1.7f);
        pathBuilderI.lineToRelative(-0.85f, 1.48f);
        pathBuilderI.lineToRelative(1.3f, 0.75f);
        pathBuilderI.lineTo(20.0f, 11.47f);
        pathBuilderI.lineToRelative(0.85f, 1.48f);
        pathBuilderI.lineToRelative(1.3f, -0.75f);
        pathBuilderI.lineToRelative(-0.85f, -1.48f);
        pathBuilderI.horizontalLineTo(23.0f);
        pathBuilderI.verticalLineTo(9.22f);
        pathBuilderI.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderI.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _password = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
