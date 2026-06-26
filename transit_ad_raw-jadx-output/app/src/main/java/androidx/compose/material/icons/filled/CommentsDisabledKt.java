package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CommentsDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_commentsDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CommentsDisabled", "Landroidx/compose/material/icons/Icons$Filled;", "getCommentsDisabled", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CommentsDisabledKt {
    private static ImageVector _commentsDisabled;

    public static final ImageVector getCommentsDisabled(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _commentsDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CommentsDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(16.83f, 14.0f, 18.0f, -2.0f, -3.17f);
        b.f(pathBuilderO, -1.0f, -1.0f, 18.0f, 9.0f);
        a.C(pathBuilderO, -6.17f, -1.0f, -1.0f, 18.0f);
        pathBuilderO.verticalLineTo(6.0f);
        pathBuilderO.horizontalLineTo(8.83f);
        pathBuilderO.lineToRelative(-4.0f, -4.0f);
        pathBuilderO.horizontalLineTo(20.0f);
        pathBuilderO.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        h.q(pathBuilderO, 15.17f, 16.83f, 14.0f);
        pathBuilderO.moveTo(2.1f, 2.1f);
        pathBuilderO.lineTo(0.69f, 3.51f);
        pathBuilderO.lineTo(2.0f, 4.83f);
        pathBuilderO.verticalLineTo(16.0f);
        pathBuilderO.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderO.horizontalLineToRelative(11.17f);
        pathBuilderO.lineToRelative(5.31f, 5.31f);
        s.r(pathBuilderO, 1.41f, -1.41f, 2.1f, 2.1f);
        pathBuilderO.moveTo(6.0f, 9.0f);
        a.C(pathBuilderO, 0.17f, 2.0f, 2.0f, 6.0f);
        androidx.compose.animation.b.l(pathBuilderO, 9.0f, 6.0f, 14.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.p(pathBuilderO, 3.17f, 2.0f, 2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commentsDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
