package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ViewModule.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_viewModule", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewModule", "Landroidx/compose/material/icons/Icons$TwoTone;", "getViewModule", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ViewModuleKt {
    private static ImageVector _viewModule;

    public static final ImageVector getViewModule(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _viewModule;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ViewModule", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(19.0f, 11.0f, -3.33f, 7.0f, 19.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderQ, 11.0f, 13.67f, 11.0f, -3.33f);
        androidx.appcompat.view.menu.a.v(pathBuilderQ, 7.0f, 3.33f, 11.0f);
        a.D(pathBuilderQ, 8.33f, 7.0f, 4.0f, 5.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderQ, 7.0f, 8.33f, 5.0f, 17.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderQ, -4.0f, 3.33f, 4.0f, 5.0f);
        b.y(pathBuilderQ, 10.33f, 17.0f, -4.0f, 3.33f);
        h.z(pathBuilderQ, 4.0f, 10.33f, 15.67f, 17.0f);
        pathBuilderQ.verticalLineToRelative(-4.0f);
        pathBuilderQ.horizontalLineTo(19.0f);
        pathBuilderQ.verticalLineToRelative(4.0f);
        pathBuilderQ.horizontalLineTo(15.67f);
        pathBuilderQ.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderQ.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(3.0f, 5.0f, 14.0f, 18.0f, 5.0f);
        h.v(pathBuilderV, 3.0f, 19.0f, 11.0f, -3.33f);
        androidx.compose.animation.b.z(pathBuilderV, 7.0f, 19.0f, 11.0f);
        androidx.browser.browseractions.a.A(pathBuilderV, 13.67f, 11.0f, -3.33f, 7.0f);
        b.m(pathBuilderV, 3.33f, 11.0f, 8.33f, 7.0f);
        pathBuilderV.verticalLineToRelative(4.0f);
        pathBuilderV.horizontalLineTo(5.0f);
        pathBuilderV.verticalLineTo(7.0f);
        pathBuilderV.horizontalLineTo(8.33f);
        pathBuilderV.close();
        b.y(pathBuilderV, 5.0f, 17.0f, -4.0f, 3.33f);
        h.z(pathBuilderV, 4.0f, 5.0f, 10.33f, 17.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderV, -4.0f, 3.33f, 4.0f, 10.33f);
        a.D(pathBuilderV, 15.67f, 17.0f, -4.0f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.m(pathBuilderV, 4.0f, 15.67f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewModule = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
