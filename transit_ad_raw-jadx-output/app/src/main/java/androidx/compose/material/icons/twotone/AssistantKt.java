package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
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
import c.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Assistant.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_assistant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Assistant", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAssistant", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AssistantKt {
    private static ImageVector _assistant;

    public static final ImageVector getAssistant(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _assistant;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Assistant", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.83f, 18.0f, 0.59f, 0.59f);
        pathBuilderA.lineTo(12.0f, 20.17f);
        pathBuilderA.lineToRelative(1.59f, -1.59f);
        pathBuilderA.lineToRelative(0.58f, -0.58f);
        pathBuilderA.lineTo(19.0f, 18.0f);
        pathBuilderA.lineTo(19.0f, 4.0f);
        a.k(pathBuilderA, 5.0f, 4.0f, 14.0f, 4.83f);
        pathBuilderA.moveTo(10.12f, 9.12f);
        pathBuilderA.lineTo(12.0f, 5.0f);
        pathBuilderA.lineToRelative(1.88f, 4.12f);
        pathBuilderA.lineTo(18.0f, 11.0f);
        pathBuilderA.lineToRelative(-4.12f, 1.88f);
        pathBuilderA.lineTo(12.0f, 17.0f);
        pathBuilderA.lineToRelative(-1.88f, -4.12f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderA, 6.0f, 11.0f, 4.12f, -1.88f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = android.support.v4.media.a.a(5.0f, 20.0f, 4.0f, 3.0f, 3.0f);
        pathBuilderA2.lineToRelative(3.0f, -3.0f);
        pathBuilderA2.horizontalLineToRelative(4.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.lineTo(21.0f, 4.0f);
        pathBuilderA2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA2.lineTo(5.0f, 2.0f);
        pathBuilderA2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA2.verticalLineToRelative(14.0f);
        pathBuilderA2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.r(pathBuilderA2, 5.0f, 4.0f, 14.0f, 14.0f);
        pathBuilderA2.horizontalLineToRelative(-4.83f);
        pathBuilderA2.lineToRelative(-0.59f, 0.59f);
        pathBuilderA2.lineTo(12.0f, 20.17f);
        pathBuilderA2.lineToRelative(-1.59f, -1.59f);
        pathBuilderA2.lineToRelative(-0.58f, -0.58f);
        android.support.v4.media.a.C(pathBuilderA2, 5.0f, 18.0f, 5.0f, 4.0f);
        pathBuilderA2.moveTo(12.0f, 17.0f);
        pathBuilderA2.lineToRelative(1.88f, -4.12f);
        pathBuilderA2.lineTo(18.0f, 11.0f);
        pathBuilderA2.lineToRelative(-4.12f, -1.88f);
        pathBuilderA2.lineTo(12.0f, 5.0f);
        pathBuilderA2.lineToRelative(-1.88f, 4.12f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderA2, 6.0f, 11.0f, 4.12f, 1.88f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistant = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
