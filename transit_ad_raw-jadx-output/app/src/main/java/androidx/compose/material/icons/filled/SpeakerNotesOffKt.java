package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: SpeakerNotesOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_speakerNotesOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpeakerNotesOff", "Landroidx/compose/material/icons/Icons$Filled;", "getSpeakerNotesOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpeakerNotesOffKt {
    private static ImageVector _speakerNotesOff;

    public static final ImageVector getSpeakerNotesOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _speakerNotesOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SpeakerNotesOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.54f, 11.0f, -0.54f, -0.54f);
        pathBuilderA.lineTo(7.54f, 8.0f);
        pathBuilderA.lineTo(6.0f, 6.46f);
        pathBuilderA.lineTo(2.38f, 2.84f);
        pathBuilderA.lineTo(1.27f, 1.73f);
        pathBuilderA.lineTo(0.0f, 3.0f);
        pathBuilderA.lineToRelative(2.01f, 2.01f);
        pathBuilderA.lineTo(2.0f, 22.0f);
        pathBuilderA.lineToRelative(4.0f, -4.0f);
        pathBuilderA.horizontalLineToRelative(9.0f);
        pathBuilderA.lineToRelative(5.73f, 5.73f);
        pathBuilderA.lineTo(22.0f, 22.46f);
        a.A(pathBuilderA, 17.54f, 18.0f, -7.0f, -7.0f);
        pathBuilderA.moveTo(8.0f, 14.0f);
        a.b.s(pathBuilderA, 6.0f, 14.0f, -2.0f, 2.0f);
        android.support.v4.media.a.v(pathBuilderA, 2.0f, 6.0f, 11.0f);
        pathBuilderA.lineTo(6.0f, 9.0f);
        s.r(pathBuilderA, 2.0f, 2.0f, 6.0f, 11.0f);
        pathBuilderA.moveTo(20.0f, 2.0f);
        pathBuilderA.lineTo(4.08f, 2.0f);
        pathBuilderA.lineTo(10.0f, 7.92f);
        a.o(pathBuilderA, 10.0f, 6.0f, 8.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(-7.92f);
        pathBuilderA.lineToRelative(1.0f, 1.0f);
        a.b.s(pathBuilderA, 18.0f, 9.0f, 2.0f, -4.92f);
        pathBuilderA.lineToRelative(6.99f, 6.99f);
        pathBuilderA.curveTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f);
        pathBuilderA.lineTo(22.0f, 4.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerNotesOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
