package androidx.compose.material.icons.twotone;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CancelPresentation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cancelPresentation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CancelPresentation", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCancelPresentation", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CancelPresentationKt {
    private static ImageVector _cancelPresentation;

    public static final ImageVector getCancelPresentation(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _cancelPresentation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CancelPresentation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(3.0f, 19.1f, 18.0f, 21.0f, 4.95f);
        a.C(pathBuilderC, 3.0f, 4.95f, 3.0f, 19.1f);
        pathBuilderC.moveTo(8.0f, 9.36f);
        pathBuilderC.lineToRelative(1.41f, -1.41f);
        pathBuilderC.lineTo(12.0f, 10.54f);
        pathBuilderC.lineToRelative(2.59f, -2.59f);
        pathBuilderC.lineTo(16.0f, 9.36f);
        pathBuilderC.lineToRelative(-2.59f, 2.59f);
        pathBuilderC.lineTo(16.0f, 14.54f);
        pathBuilderC.lineToRelative(-1.41f, 1.41f);
        pathBuilderC.lineTo(12.0f, 13.36f);
        pathBuilderC.lineToRelative(-2.59f, 2.59f);
        pathBuilderC.lineTo(8.0f, 14.54f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderC, 2.59f, -2.59f, 8.0f, 9.36f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.0f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(18.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(23.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA, 21.0f, 19.0f, 3.0f, 19.0f);
        s.w(pathBuilderA, 3.0f, 5.0f, 18.0f, 14.0f);
        pathBuilderA.moveTo(9.41f, 15.95f);
        pathBuilderA.lineTo(12.0f, 13.36f);
        pathBuilderA.lineToRelative(2.59f, 2.59f);
        pathBuilderA.lineTo(16.0f, 14.54f);
        pathBuilderA.lineToRelative(-2.59f, -2.59f);
        pathBuilderA.lineTo(16.0f, 9.36f);
        pathBuilderA.lineToRelative(-1.41f, -1.41f);
        pathBuilderA.lineTo(12.0f, 10.54f);
        pathBuilderA.lineTo(9.41f, 7.95f);
        pathBuilderA.lineTo(8.0f, 9.36f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 2.59f, 2.59f, 8.0f, 14.54f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cancelPresentation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
