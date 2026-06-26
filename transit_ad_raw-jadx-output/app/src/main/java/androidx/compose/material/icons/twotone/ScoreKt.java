package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Score.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_score", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Score", "Landroidx/compose/material/icons/Icons$TwoTone;", "getScore", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _score;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Score", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 16.5f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineToRelative(6.0f, -6.0f);
        pathBuilder.lineTo(19.0f, 5.0f);
        b.k(pathBuilder, 5.0f, 5.0f, 11.5f);
        a.x(pathBuilder, 12.0f, 6.0f, 1.5f, 3.0f);
        pathBuilder.lineToRelative(2.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineToRelative(-2.0f, 3.0f);
        pathBuilder.lineToRelative(2.0f, 3.0f);
        androidx.compose.animation.a.p(pathBuilder, -1.7f, -2.0f, -3.0f, 3.0f);
        android.support.v4.media.a.C(pathBuilder, 12.0f, 12.0f, 12.0f, 6.0f);
        pathBuilder.moveTo(7.0f, 8.25f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.lineTo(9.5f, 7.5f);
        pathBuilder.lineTo(7.0f, 7.5f);
        androidx.compose.animation.a.o(pathBuilder, 7.0f, 6.0f, 4.0f, 3.75f);
        pathBuilder.lineTo(8.5f, 9.75f);
        pathBuilder.verticalLineToRelative(0.75f);
        pathBuilder.lineTo(11.0f, 10.5f);
        pathBuilder.lineTo(11.0f, 12.0f);
        android.support.v4.media.a.C(pathBuilder, 7.0f, 12.0f, 7.0f, 8.25f);
        pathBuilder.moveTo(19.0f, 19.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.m(pathBuilder, -6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(21.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA, 19.0f, 19.0f, 5.0f, 19.0f);
        pathBuilderA.lineToRelative(4.0f, -4.0f);
        pathBuilderA.lineToRelative(4.0f, 4.0f);
        androidx.compose.animation.a.u(pathBuilderA, 6.0f, -6.0f, 6.0f);
        pathBuilderA.moveTo(19.0f, 10.5f);
        pathBuilderA.lineToRelative(-6.0f, 6.0f);
        pathBuilderA.lineToRelative(-4.0f, -4.0f);
        pathBuilderA.lineToRelative(-4.0f, 4.0f);
        s.w(pathBuilderA, 5.0f, 5.0f, 14.0f, 5.5f);
        pathBuilderA.moveTo(13.5f, 9.0f);
        pathBuilderA.lineTo(13.5f, 6.0f);
        c.a.k(pathBuilderA, 12.0f, 6.0f, 6.0f, 1.5f);
        pathBuilderA.moveTo(17.2f, 12.0f);
        pathBuilderA.lineToRelative(-2.0f, -3.0f);
        pathBuilderA.lineToRelative(2.0f, -3.0f);
        pathBuilderA.horizontalLineToRelative(-1.7f);
        android.support.v4.media.a.n(pathBuilderA, -2.0f, 3.0f, 2.0f, 3.0f);
        pathBuilderA.moveTo(11.0f, 10.5f);
        pathBuilderA.lineTo(8.5f, 10.5f);
        pathBuilderA.verticalLineToRelative(-0.75f);
        pathBuilderA.lineTo(11.0f, 9.75f);
        pathBuilderA.lineTo(11.0f, 6.0f);
        a.b.s(pathBuilderA, 7.0f, 6.0f, 1.5f, 2.5f);
        pathBuilderA.verticalLineToRelative(0.75f);
        pathBuilderA.lineTo(7.0f, 8.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderA, 7.0f, 12.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
