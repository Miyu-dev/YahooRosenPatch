package androidx.compose.material.icons.twotone;

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
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_factory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Factory", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFactory", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Factory", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 12.0f, 0.0f, -2.05f);
        pathBuilderA.lineToRelative(-5.0f, 2.0f);
        pathBuilderA.verticalLineTo(10.0f);
        pathBuilderA.lineToRelative(-3.0f, 1.32f);
        pathBuilderA.verticalLineTo(20.0f);
        s.q(pathBuilderA, 16.0f, -8.0f, 12.0f);
        a.b.z(pathBuilderA, 9.0f, 18.0f, 7.0f, -4.0f);
        a.b.m(pathBuilderA, 2.0f, 18.0f, 13.0f, 18.0f);
        a.B(pathBuilderA, -2.0f, -4.0f, 2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 17.0f, 18.0f, -2.0f, -4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderA, 2.0f, 18.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = g.b(22.0f, 22.0f, 2.0f, 10.0f);
        pathBuilderB.lineToRelative(7.0f, -3.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.lineToRelative(5.0f, -2.0f);
        pathBuilderB.lineToRelative(0.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderB, 3.0f, 1.0f, -8.0f, 3.0f);
        c.a.g(pathBuilderB, 1.0f, 8.0f, 22.0f);
        pathBuilderB.moveTo(12.0f, 9.95f);
        pathBuilderB.lineToRelative(-5.0f, 2.0f);
        pathBuilderB.verticalLineTo(10.0f);
        pathBuilderB.lineToRelative(-3.0f, 1.32f);
        pathBuilderB.verticalLineTo(20.0f);
        android.support.v4.media.a.s(pathBuilderB, 16.0f, -8.0f, -8.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderB, 12.0f, 9.95f, 11.0f, 18.0f);
        a.B(pathBuilderB, 2.0f, -4.0f, -2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 7.0f, 18.0f, 2.0f, -4.0f);
        a.b.B(pathBuilderB, 7.0f, 18.0f, 17.0f, 14.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderB, -2.0f, 4.0f, 2.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factory = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
