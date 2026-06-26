package androidx.compose.material.icons.sharp;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DeleteForever.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_deleteForever", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DeleteForever", "Landroidx/compose/material/icons/Icons$Sharp;", "getDeleteForever", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeleteForeverKt {
    private static ImageVector _deleteForever;

    public static final ImageVector getDeleteForever(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _deleteForever;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DeleteForever", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(6.0f, 21.0f, 12.0f, 18.0f, 7.0f);
        b.k(pathBuilderC, 6.0f, 7.0f, 14.0f);
        pathBuilderC.moveTo(8.46f, 11.88f);
        pathBuilderC.lineToRelative(1.41f, -1.41f);
        pathBuilderC.lineTo(12.0f, 12.59f);
        pathBuilderC.lineToRelative(2.12f, -2.12f);
        pathBuilderC.lineToRelative(1.41f, 1.41f);
        pathBuilderC.lineTo(13.41f, 14.0f);
        pathBuilderC.lineToRelative(2.12f, 2.12f);
        pathBuilderC.lineToRelative(-1.41f, 1.41f);
        pathBuilderC.lineTo(12.0f, 15.41f);
        pathBuilderC.lineToRelative(-2.12f, 2.12f);
        pathBuilderC.lineToRelative(-1.41f, -1.41f);
        a.A(pathBuilderC, 10.59f, 14.0f, -2.13f, -2.12f);
        pathBuilderC.moveTo(15.5f, 4.0f);
        pathBuilderC.lineToRelative(-1.0f, -1.0f);
        pathBuilderC.horizontalLineToRelative(-5.0f);
        pathBuilderC.lineToRelative(-1.0f, 1.0f);
        a.b.s(pathBuilderC, 5.0f, 4.0f, 2.0f, 14.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderC, 19.0f, 4.0f, -3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deleteForever = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
