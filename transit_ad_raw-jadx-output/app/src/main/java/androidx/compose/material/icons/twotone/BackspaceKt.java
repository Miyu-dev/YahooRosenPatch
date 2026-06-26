package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: Backspace.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_backspace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Backspace", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBackspace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BackspaceKt {
    private static ImageVector _backspace;

    public static final ImageVector getBackspace(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _backspace;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Backspace", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.06f, 5.0f, 2.4f, 12.0f);
        c.b.f(pathBuilderA, 4.67f, 7.0f, 22.0f, 5.0f);
        pathBuilderA.horizontalLineTo(7.06f);
        pathBuilderA.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f);
        a.t(pathBuilderA, 9.0f, 8.41f, 10.41f, 7.0f);
        pathBuilderA.lineTo(14.0f, 10.59f);
        pathBuilderA.lineTo(17.59f, 7.0f);
        pathBuilderA.lineTo(19.0f, 8.41f);
        pathBuilderA.lineTo(15.41f, 12.0f);
        pathBuilderA.lineTo(19.0f, 15.59f);
        pathBuilderA.lineTo(17.59f, 17.0f);
        pathBuilderA.lineTo(14.0f, 13.41f);
        pathBuilderA.lineTo(10.41f, 17.0f);
        pathBuilderA.lineTo(9.0f, 15.59f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 12.59f, 12.0f, 9.0f, 8.41f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(22.0f, 3.0f, 7.0f, 3.0f);
        pathBuilderA2.curveToRelative(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        pathBuilderA2.lineTo(0.0f, 12.0f);
        pathBuilderA2.lineToRelative(5.41f, 8.11f);
        pathBuilderA2.curveToRelative(0.36f, 0.53f, 0.9f, 0.89f, 1.59f, 0.89f);
        pathBuilderA2.horizontalLineToRelative(15.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.lineTo(24.0f, 5.0f);
        pathBuilderA2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.t(pathBuilderA2, 22.0f, 19.0f, 7.07f, 19.0f);
        pathBuilderA2.lineTo(2.4f, 12.0f);
        pathBuilderA2.lineToRelative(4.66f, -7.0f);
        androidx.compose.animation.b.k(pathBuilderA2, 22.0f, 5.0f, 14.0f);
        pathBuilderA2.moveTo(10.41f, 17.0f);
        pathBuilderA2.lineTo(14.0f, 13.41f);
        pathBuilderA2.lineTo(17.59f, 17.0f);
        pathBuilderA2.lineTo(19.0f, 15.59f);
        pathBuilderA2.lineTo(15.41f, 12.0f);
        pathBuilderA2.lineTo(19.0f, 8.41f);
        pathBuilderA2.lineTo(17.59f, 7.0f);
        pathBuilderA2.lineTo(14.0f, 10.59f);
        pathBuilderA2.lineTo(10.41f, 7.0f);
        pathBuilderA2.lineTo(9.0f, 8.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA2, 12.59f, 12.0f, 9.0f, 15.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backspace = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
