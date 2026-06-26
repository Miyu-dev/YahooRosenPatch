package androidx.compose.material.icons.sharp;

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
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Rsvp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rsvp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rsvp", "Landroidx/compose/material/icons/Icons$Sharp;", "getRsvp", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RsvpKt {
    private static ImageVector _rsvp;

    public static final ImageVector getRsvp(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _rsvp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Rsvp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(16.0f, 9.0f, 1.5f, -1.75f, 6.0f);
        androidx.appcompat.app.m.D(pathBuilderA, -1.5f, 12.5f, 9.0f, 14.0f);
        s.r(pathBuilderA, 1.0f, 3.43f, 16.0f, 9.0f);
        pathBuilderA.moveTo(5.14f, 13.0f);
        pathBuilderA.lineTo(6.0f, 15.0f);
        s.C(pathBuilderA, 4.5f, -0.85f, -2.0f, 2.5f);
        j.f(pathBuilderA, 2.0f, 1.0f, 9.0f, 5.0f);
        h.q(pathBuilderA, 4.0f, 5.14f, 13.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 4.5f, 10.5f, -2.0f, 1.0f);
        b.m(pathBuilderA, 2.0f, 10.5f, 23.0f, 13.0f);
        a.z(pathBuilderA, -3.5f, 2.0f, 18.0f, 9.0f);
        b.m(pathBuilderA, 5.0f, 13.0f, 21.5f, 10.5f);
        androidx.compose.animation.a.B(pathBuilderA, -2.0f, 1.0f, 2.0f, 10.5f);
        b.y(pathBuilderA, 11.5f, 9.0f, 1.5f, -3.0f);
        s.m(pathBuilderA, 0.75f, 3.0f, 15.0f, 7.0f);
        c.a.j(pathBuilderA, -1.5f, 3.0f, -0.75f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderA, 9.0f, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rsvp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
