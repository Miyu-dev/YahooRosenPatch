package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: RemoveDone.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_removeDone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RemoveDone", "Landroidx/compose/material/icons/Icons$Sharp;", "getRemoveDone", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RemoveDone", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.84f, 1.98f, 3.43f, 3.39f);
        pathBuilderA.lineToRelative(10.38f, 10.38f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineToRelative(-4.24f, -4.24f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineToRelative(5.66f, 5.66f);
        pathBuilderA.lineToRelative(2.83f, -2.83f);
        pathBuilderA.lineToRelative(6.6f, 6.6f);
        s.r(pathBuilderA, 1.41f, -1.41f, 4.84f, 1.98f);
        pathBuilderA.moveTo(18.05f, 12.36f);
        pathBuilderA.lineTo(23.0f, 7.4f);
        pathBuilderA.lineTo(21.57f, 6.0f);
        s.r(pathBuilderA, -4.94f, 4.94f, 18.05f, 12.36f);
        pathBuilderA.moveTo(17.34f, 7.4f);
        pathBuilderA.lineToRelative(-1.41f, -1.41f);
        pathBuilderA.lineToRelative(-2.12f, 2.12f);
        s.r(pathBuilderA, 1.41f, 1.41f, 17.34f, 7.4f);
        pathBuilderA.moveTo(1.08f, 12.35f);
        pathBuilderA.lineToRelative(5.66f, 5.66f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, -5.66f, -5.66f, 1.08f, 12.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
