package androidx.compose.material.icons.outlined;

import a.b;
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

/* JADX INFO: compiled from: Signpost.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signpost", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Signpost", "Landroidx/compose/material/icons/Icons$Outlined;", "getSignpost", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignpostKt {
    private static ImageVector _signpost;

    public static final ImageVector getSignpost(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _signpost;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Signpost", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(13.0f, 10.0f, 5.0f, 3.0f, -3.0f);
        androidx.appcompat.view.menu.a.D(pathBuilderA, -3.0f, -3.0f, -5.0f, 2.0f);
        androidx.appcompat.app.m.x(pathBuilderA, -2.0f, 2.0f, 4.0f, 6.0f);
        v.t(pathBuilderA, 7.0f, 2.0f, 6.0f);
        pathBuilderA.lineToRelative(-3.0f, 3.0f);
        androidx.browser.browseractions.a.C(pathBuilderA, 3.0f, 3.0f, 5.0f, 4.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderA, 2.0f, -4.0f, 7.0f, -6.0f);
        b.m(pathBuilderA, -7.0f, 10.0f, 6.0f, 6.0f);
        pathBuilderA.horizontalLineToRelative(11.17f);
        pathBuilderA.lineToRelative(1.0f, 1.0f);
        pathBuilderA.lineToRelative(-1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.verticalLineTo(6.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.0f, 16.0f);
        pathBuilderA.horizontalLineTo(6.83f);
        pathBuilderA.lineToRelative(-1.0f, -1.0f);
        pathBuilderA.lineToRelative(1.0f, -1.0f);
        pathBuilderA.horizontalLineTo(18.0f);
        pathBuilderA.verticalLineTo(16.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signpost = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
