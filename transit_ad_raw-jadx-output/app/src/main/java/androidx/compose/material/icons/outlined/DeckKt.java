package androidx.compose.material.icons.outlined;

import a.b;
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

/* JADX INFO: compiled from: Deck.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_deck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Deck", "Landroidx/compose/material/icons/Icons$Outlined;", "getDeck", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeckKt {
    private static ImageVector _deck;

    public static final ImageVector getDeck(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _deck;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Deck", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.0f, 9.0f, 12.0f, 2.0f);
        a.o(pathBuilderA, 2.0f, 9.0f, 9.0f, 13.0f);
        b.w(pathBuilderA, 2.0f, 9.0f, 22.0f);
        pathBuilderA.moveTo(12.0f, 4.44f);
        pathBuilderA.lineTo(15.66f, 7.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.k(pathBuilderA, 8.34f, 12.0f, 4.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = androidx.compose.animation.b.a(4.14f, 12.0f, -1.96f, 0.37f);
        pathBuilderA2.lineToRelative(0.82f, 4.37f);
        pathBuilderA2.lineToRelative(0.0f, 5.26f);
        pathBuilderA2.lineToRelative(2.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.02f, -4.0f);
        pathBuilderA2.lineToRelative(1.98f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 4.0f);
        pathBuilderA2.lineToRelative(2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, 0.0f, -6.0f, -4.1f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = androidx.compose.animation.b.a(19.1f, 16.0f, -4.1f, 0.0f);
        pathBuilderA3.lineToRelative(0.0f, 6.0f);
        pathBuilderA3.lineToRelative(2.0f, 0.0f);
        pathBuilderA3.lineToRelative(0.0f, -4.0f);
        pathBuilderA3.lineToRelative(1.98f, 0.0f);
        pathBuilderA3.lineToRelative(0.02f, 4.0f);
        pathBuilderA3.lineToRelative(2.0f, 0.0f);
        pathBuilderA3.lineToRelative(0.0f, -5.26f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA3, 0.82f, -4.37f, -1.96f, -0.37f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deck = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
