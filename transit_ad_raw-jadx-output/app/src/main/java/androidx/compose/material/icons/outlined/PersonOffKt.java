package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: PersonOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getPersonOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PersonOffKt {
    private static ImageVector _personOff;

    public static final ImageVector getPersonOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _personOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 17.17f, -3.37f, -3.38f);
        pathBuilderA.curveToRelative(0.64f, 0.22f, 1.23f, 0.48f, 1.77f, 0.76f);
        pathBuilderA.curveTo(19.37f, 15.06f, 19.98f, 16.07f, 20.0f, 17.17f);
        a.y(pathBuilderA, 21.19f, 21.19f, -1.41f, 1.41f);
        h.n(pathBuilderA, 17.17f, 20.0f, 4.0f, -2.78f);
        pathBuilderA.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilderA.curveToRelative(1.29f, -0.66f, 2.87f, -1.22f, 4.67f, -1.45f);
        pathBuilderA.lineTo(1.39f, 4.22f);
        s.r(pathBuilderA, 1.41f, -1.41f, 21.19f, 21.19f);
        pathBuilderA.moveTo(15.17f, 18.0f);
        pathBuilderA.lineToRelative(-3.0f, -3.0f);
        pathBuilderA.curveToRelative(-0.06f, 0.0f, -0.11f, 0.0f, -0.17f, 0.0f);
        pathBuilderA.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilderA.curveTo(6.2f, 16.5f, 6.0f, 16.84f, 6.0f, 17.22f);
        androidx.appcompat.view.menu.a.o(pathBuilderA, 18.0f, 15.17f, 12.0f, 6.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderA.curveToRelative(0.0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f);
        pathBuilderA.lineToRelative(1.48f, 1.48f);
        pathBuilderA.curveTo(15.28f, 10.64f, 16.0f, 9.4f, 16.0f, 8.0f);
        pathBuilderA.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderA.curveToRelative(-1.4f, 0.0f, -2.64f, 0.72f, -3.35f, 1.82f);
        pathBuilderA.lineToRelative(1.48f, 1.48f);
        pathBuilderA.curveTo(10.41f, 6.54f, 11.14f, 6.0f, 12.0f, 6.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
