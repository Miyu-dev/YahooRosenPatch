package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_handshake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Handshake", "Landroidx/compose/material/icons/Icons$Sharp;", "getHandshake", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Handshake", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.59f, 5.95f, -7.05f, 7.04f);
        pathBuilderA.lineTo(0.7f, 10.3f);
        pathBuilderA.lineToRelative(8.55f, -8.55f);
        pathBuilderA.lineToRelative(7.95f, 7.95f);
        s.r(pathBuilderA, -1.42f, 1.42f, 10.59f, 5.95f);
        pathBuilderA.moveTo(23.24f, 10.24f);
        pathBuilderA.lineToRelative(-8.49f, -8.49f);
        pathBuilderA.lineToRelative(-2.06f, 2.06f);
        pathBuilderA.lineToRelative(5.9f, 5.88f);
        pathBuilderA.lineToRelative(-2.83f, 2.83f);
        pathBuilderA.lineToRelative(-5.17f, -5.17f);
        pathBuilderA.lineToRelative(-6.27f, 6.27f);
        pathBuilderA.lineToRelative(1.42f, 1.41f);
        pathBuilderA.lineToRelative(5.32f, -5.32f);
        pathBuilderA.lineToRelative(0.71f, 0.71f);
        pathBuilderA.lineToRelative(-5.32f, 5.32f);
        pathBuilderA.lineToRelative(1.42f, 1.41f);
        pathBuilderA.lineToRelative(5.32f, -5.32f);
        pathBuilderA.lineToRelative(0.71f, 0.71f);
        pathBuilderA.lineToRelative(-5.32f, 5.32f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(5.32f, -5.32f);
        pathBuilderA.lineToRelative(0.71f, 0.71f);
        pathBuilderA.lineTo(10.68f, 20.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.41f, 1.41f, 23.24f, 10.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
