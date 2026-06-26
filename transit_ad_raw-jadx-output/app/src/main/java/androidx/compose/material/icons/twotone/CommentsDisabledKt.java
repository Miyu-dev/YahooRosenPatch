package androidx.compose.material.icons.twotone;

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
import c.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CommentsDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_commentsDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CommentsDisabled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCommentsDisabled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CommentsDisabledKt {
    private static ImageVector _commentsDisabled;

    public static final ImageVector getCommentsDisabled(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _commentsDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CommentsDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(6.83f, 4.0f, 20.0f, 12.0f, -1.17f);
        a.r(pathBuilderO, -2.0f, -2.0f, 18.0f, -2.0f);
        a.C(pathBuilderO, -3.17f, -1.0f, -1.0f, 18.0f);
        androidx.appcompat.app.m.u(pathBuilderO, 9.0f, -6.17f, -1.0f, -1.0f);
        b.B(pathBuilderO, 18.0f, 6.0f, 8.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderO, 6.83f, 4.0f, 13.17f, 16.0f);
        a.r(pathBuilderO, -2.0f, -2.0f, 6.0f, -2.0f);
        a.C(pathBuilderO, 3.17f, -1.0f, -1.0f, 6.0f);
        pathBuilderO.verticalLineTo(9.0f);
        pathBuilderO.horizontalLineToRelative(0.17f);
        pathBuilderO.lineTo(4.0f, 6.83f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderO, 16.0f, 13.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = k.b(18.83f, 16.0f, 20.0f, 4.0f, 6.83f);
        pathBuilderB.lineToRelative(-2.0f, -2.0f);
        pathBuilderB.horizontalLineTo(20.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        s.r(pathBuilderB, 0.0f, 15.17f, 18.83f, 16.0f);
        pathBuilderB.moveTo(18.0f, 6.0f);
        s.C(pathBuilderB, 8.83f, 2.0f, 2.0f, 18.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderB, 6.0f, 18.0f, 9.0f, -6.17f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        pathBuilderB.horizontalLineTo(18.0f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.close();
        a.b.y(pathBuilderB, 18.0f, 14.0f, -2.0f, -3.17f);
        a.b.l(pathBuilderB, 2.0f, 2.0f, 18.0f);
        pathBuilderB.moveTo(21.9f, 21.9f);
        pathBuilderB.lineToRelative(-1.41f, 1.41f);
        pathBuilderB.lineTo(15.17f, 18.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.83f);
        pathBuilderB.lineTo(0.69f, 3.51f);
        android.support.v4.media.a.C(pathBuilderB, 2.1f, 2.1f, 21.9f, 21.9f);
        pathBuilderB.moveTo(13.17f, 16.0f);
        a.r(pathBuilderB, -2.0f, -2.0f, 6.0f, -2.0f);
        a.C(pathBuilderB, 3.17f, -1.0f, -1.0f, 6.0f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.horizontalLineToRelative(0.17f);
        pathBuilderB.lineTo(4.0f, 6.83f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderB, 16.0f, 13.17f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commentsDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
