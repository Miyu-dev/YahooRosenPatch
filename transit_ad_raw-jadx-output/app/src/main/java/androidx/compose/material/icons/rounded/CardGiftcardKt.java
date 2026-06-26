package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: CardGiftcard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cardGiftcard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CardGiftcard", "Landroidx/compose/material/icons/Icons$Rounded;", "getCardGiftcard", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CardGiftcardKt {
    private static ImageVector _cardGiftcard;

    public static final ImageVector getCardGiftcard(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _cardGiftcard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CardGiftcard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(20.0f, 6.0f, -2.18f);
        pathBuilderB.curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f);
        pathBuilderB.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderB.curveToRelative(-1.05f, 0.0f, -1.96f, 0.54f, -2.5f, 1.35f);
        pathBuilderB.lineToRelative(-0.5f, 0.67f);
        pathBuilderB.lineToRelative(-0.5f, -0.68f);
        pathBuilderB.curveTo(10.96f, 2.54f, 10.05f, 2.0f, 9.0f, 2.0f);
        pathBuilderB.curveTo(7.34f, 2.0f, 6.0f, 3.34f, 6.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f);
        pathBuilderB.lineTo(4.0f, 6.0f);
        pathBuilderB.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilderB.lineTo(2.0f, 19.0f);
        pathBuilderB.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderB.lineTo(22.0f, 8.0f);
        pathBuilderB.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(15.0f, 4.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(9.0f, 4.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.t(pathBuilderB, 20.0f, 19.0f, 4.0f, 19.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderB, -2.0f, 16.0f, 2.0f);
        pathBuilderB.moveTo(20.0f, 14.0f);
        pathBuilderB.lineTo(4.0f, 14.0f);
        pathBuilderB.lineTo(4.0f, 9.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(4.08f);
        pathBuilderB.lineTo(7.6f, 10.02f);
        pathBuilderB.curveToRelative(-0.33f, 0.45f, -0.23f, 1.08f, 0.22f, 1.4f);
        pathBuilderB.curveToRelative(0.44f, 0.32f, 1.07f, 0.22f, 1.39f, -0.22f);
        pathBuilderB.lineTo(12.0f, 7.4f);
        pathBuilderB.lineToRelative(2.79f, 3.8f);
        pathBuilderB.curveToRelative(0.32f, 0.44f, 0.95f, 0.54f, 1.39f, 0.22f);
        pathBuilderB.curveToRelative(0.45f, -0.32f, 0.55f, -0.95f, 0.22f, -1.4f);
        pathBuilderB.lineTo(14.92f, 8.0f);
        pathBuilderB.lineTo(19.0f, 8.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderB, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cardGiftcard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
