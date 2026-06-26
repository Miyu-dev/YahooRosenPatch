package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Score.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_score", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Score", "Landroidx/compose/material/icons/Icons$Filled;", "getScore", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _score;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Score", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(21.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.b.r(pathBuilderA, 12.0f, 5.0f, 1.5f, 3.0f);
        pathBuilderA.lineToRelative(2.0f, -3.0f);
        pathBuilderA.horizontalLineToRelative(1.7f);
        pathBuilderA.lineToRelative(-2.0f, 3.0f);
        pathBuilderA.lineToRelative(2.0f, 3.0f);
        a.p(pathBuilderA, -1.7f, -2.0f, -3.0f, 3.0f);
        android.support.v4.media.a.C(pathBuilderA, 12.0f, 11.0f, 12.0f, 5.0f);
        pathBuilderA.moveTo(7.0f, 7.25f);
        pathBuilderA.horizontalLineToRelative(2.5f);
        pathBuilderA.lineTo(9.5f, 6.5f);
        pathBuilderA.lineTo(7.0f, 6.5f);
        a.o(pathBuilderA, 7.0f, 5.0f, 4.0f, 3.75f);
        pathBuilderA.lineTo(8.5f, 8.75f);
        pathBuilderA.verticalLineToRelative(0.75f);
        pathBuilderA.lineTo(11.0f, 9.5f);
        pathBuilderA.lineTo(11.0f, 11.0f);
        android.support.v4.media.a.C(pathBuilderA, 7.0f, 11.0f, 7.0f, 7.25f);
        pathBuilderA.moveTo(19.0f, 13.0f);
        pathBuilderA.lineToRelative(-6.0f, 6.0f);
        pathBuilderA.lineToRelative(-4.0f, -4.0f);
        pathBuilderA.lineToRelative(-4.0f, 4.0f);
        pathBuilderA.verticalLineToRelative(-2.5f);
        pathBuilderA.lineToRelative(4.0f, -4.0f);
        pathBuilderA.lineToRelative(4.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 6.0f, -6.0f, 19.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
