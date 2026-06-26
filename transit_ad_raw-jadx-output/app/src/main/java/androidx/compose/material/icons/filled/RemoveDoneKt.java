package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RemoveDone.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_removeDone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RemoveDone", "Landroidx/compose/material/icons/Icons$Filled;", "getRemoveDone", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveDone", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(1.79f, 12.0f, 5.58f, 5.59f);
        pathBuilderA.lineTo(5.96f, 19.0f);
        a.C(pathBuilderA, 0.37f, 13.41f, 1.79f, 12.0f);
        pathBuilderA.moveTo(2.24f, 4.22f);
        pathBuilderA.lineTo(12.9f, 14.89f);
        pathBuilderA.lineToRelative(-1.28f, 1.28f);
        pathBuilderA.lineTo(7.44f, 12.0f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineTo(11.62f, 19.0f);
        pathBuilderA.lineToRelative(2.69f, -2.69f);
        pathBuilderA.lineToRelative(4.89f, 4.89f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        a.C(pathBuilderA, 3.65f, 2.81f, 2.24f, 4.22f);
        pathBuilderA.moveTo(17.14f, 13.49f);
        pathBuilderA.lineTo(23.62f, 7.0f);
        pathBuilderA.lineTo(22.2f, 5.59f);
        a.n(pathBuilderA, -6.48f, 6.48f, 1.42f, 1.42f);
        pathBuilderA.moveTo(17.96f, 7.0f);
        pathBuilderA.lineToRelative(-1.41f, -1.41f);
        pathBuilderA.lineToRelative(-3.65f, 3.66f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.41f, 1.41f, 17.96f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
