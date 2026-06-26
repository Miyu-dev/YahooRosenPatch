package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SpeakerNotes.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_speakerNotes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpeakerNotes", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSpeakerNotes", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpeakerNotesKt {
    private static ImageVector _speakerNotes;

    public static final ImageVector getSpeakerNotes(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _speakerNotes;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SpeakerNotes", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.0f, 17.17f, 0.59f, -0.59f);
        pathBuilderA.lineToRelative(0.58f, -0.58f);
        pathBuilderA.lineTo(20.0f, 16.0f);
        pathBuilderA.lineTo(20.0f, 4.0f);
        b.k(pathBuilderA, 4.0f, 4.0f, 13.17f);
        a.x(pathBuilderA, 10.0f, 6.0f, 8.0f, 2.0f);
        a.s(pathBuilderA, -8.0f, 10.0f, 6.0f);
        a.x(pathBuilderA, 10.0f, 9.0f, 8.0f, 2.0f);
        a.s(pathBuilderA, -8.0f, 10.0f, 9.0f);
        a.x(pathBuilderA, 10.0f, 12.0f, 5.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderA, -5.0f, -2.0f, 6.0f, 6.0f);
        android.support.v4.media.a.w(pathBuilderA, 2.0f, 2.0f, 6.0f, 8.0f);
        a.z(pathBuilderA, 6.0f, 6.0f, 6.0f, 9.0f);
        android.support.v4.media.a.w(pathBuilderA, 2.0f, 2.0f, 6.0f, 11.0f);
        a.z(pathBuilderA, 6.0f, 9.0f, 6.0f, 12.0f);
        android.support.v4.media.a.w(pathBuilderA, 2.0f, 2.0f, 6.0f, 14.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.h(pathBuilderA, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(20.0f, 2.0f, 4.0f, 2.0f);
        pathBuilderA2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA2.lineTo(2.0f, 22.0f);
        pathBuilderA2.lineToRelative(4.0f, -4.0f);
        pathBuilderA2.horizontalLineToRelative(14.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.lineTo(22.0f, 4.0f);
        pathBuilderA2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA2, 20.0f, 16.0f, 5.17f, 16.0f);
        pathBuilderA2.lineToRelative(-0.59f, 0.59f);
        pathBuilderA2.lineToRelative(-0.58f, 0.58f);
        s.w(pathBuilderA2, 4.0f, 4.0f, 16.0f, 12.0f);
        a.x(pathBuilderA2, 6.0f, 12.0f, 2.0f, 2.0f);
        a.z(pathBuilderA2, 6.0f, 14.0f, 6.0f, 9.0f);
        androidx.appcompat.app.m.C(pathBuilderA2, 2.0f, 2.0f, 6.0f, 11.0f);
        a.x(pathBuilderA2, 6.0f, 6.0f, 2.0f, 2.0f);
        a.z(pathBuilderA2, 6.0f, 8.0f, 10.0f, 12.0f);
        b.t(pathBuilderA2, 5.0f, 2.0f, -5.0f);
        a.x(pathBuilderA2, 10.0f, 9.0f, 8.0f, 2.0f);
        a.w(pathBuilderA2, -8.0f, 10.0f, 6.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderA2, 2.0f, -8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerNotes = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
