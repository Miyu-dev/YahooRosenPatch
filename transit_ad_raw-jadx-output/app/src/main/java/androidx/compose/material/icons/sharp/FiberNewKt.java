package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: FiberNew.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberNew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberNew", "Landroidx/compose/material/icons/Icons$Sharp;", "getFiberNew", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberNew", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(22.0f, 4.0f, 2.0f, 4.0f, 16.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 20.0f, 22.0f, 4.0f);
        pathBuilderB.moveTo(8.5f, 15.0f);
        pathBuilderB.lineTo(7.3f, 15.0f);
        pathBuilderB.lineToRelative(-2.55f, -3.5f);
        pathBuilderB.lineTo(4.75f, 15.0f);
        pathBuilderB.lineTo(3.5f, 15.0f);
        pathBuilderB.lineTo(3.5f, 9.0f);
        pathBuilderB.horizontalLineToRelative(1.25f);
        pathBuilderB.lineToRelative(2.5f, 3.5f);
        pathBuilderB.lineTo(7.25f, 9.0f);
        b.k(pathBuilderB, 8.5f, 9.0f, 6.0f);
        pathBuilderB.moveTo(13.5f, 10.26f);
        a.b.s(pathBuilderB, 11.0f, 10.26f, 1.12f, 2.5f);
        v.y(pathBuilderB, 1.26f, 11.0f, 12.64f, 1.11f);
        androidx.appcompat.view.menu.a.y(pathBuilderB, 2.5f, 13.5f, 15.0f, -4.0f);
        s.w(pathBuilderB, 9.5f, 9.0f, 4.0f, 1.26f);
        pathBuilderB.moveTo(20.5f, 15.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderB, -6.0f, 14.5f, 9.0f, 1.25f);
        androidx.browser.browseractions.a.x(pathBuilderB, 4.51f, 1.13f, 16.88f, 9.99f);
        android.support.v4.media.a.s(pathBuilderB, 1.25f, 3.51f, 1.12f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.k(pathBuilderB, 19.25f, 9.0f, 1.25f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
