package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.e;
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ViewList.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_viewList", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewList", "Landroidx/compose/material/icons/Icons$TwoTone;", "getViewList", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ViewListKt {
    private static ImageVector _viewList;

    public static final ImageVector getViewList(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _viewList;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ViewList", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(7.0f, 7.0f, 2.0f, 5.0f, 7.0f);
        androidx.browser.browseractions.a.r(pathBuilderU, 7.0f, 5.0f, 13.0f, -2.0f);
        s.q(pathBuilderU, 2.0f, 2.0f, 5.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 5.0f, 15.0f, 2.0f, 2.0f);
        b.B(pathBuilderU, 5.0f, 15.0f, 19.0f, 17.0f);
        v.B(pathBuilderU, 9.0f, -2.0f, 10.0f, 17.0f);
        b.z(pathBuilderU, 19.0f, 13.0f, 9.0f, -2.0f);
        b.m(pathBuilderU, 10.0f, 13.0f, 19.0f, 9.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, g.e(pathBuilderU, 9.0f, 7.0f, 10.0f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(3.0f, 5.0f, 14.0f, 18.0f, 5.0f);
        androidx.browser.browseractions.a.r(pathBuilderV, 3.0f, 7.0f, 7.0f, 2.0f);
        e.e(pathBuilderV, 5.0f, 7.0f, 7.0f);
        b.y(pathBuilderV, 5.0f, 13.0f, -2.0f, 2.0f);
        h.z(pathBuilderV, 2.0f, 5.0f, 5.0f, 15.0f);
        s.A(pathBuilderV, 2.0f, 2.0f, 5.0f, 15.0f);
        b.z(pathBuilderV, 19.0f, 17.0f, 9.0f, -2.0f);
        b.m(pathBuilderV, 10.0f, 17.0f, 19.0f, 13.0f);
        v.B(pathBuilderV, 9.0f, -2.0f, 10.0f, 13.0f);
        a.B(pathBuilderV, 19.0f, 9.0f, 9.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderV, 10.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewList = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
