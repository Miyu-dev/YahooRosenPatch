package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: RecordVoiceOver.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_recordVoiceOver", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RecordVoiceOver", "Landroidx/compose/material/icons/Icons$Rounded;", "getRecordVoiceOver", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RecordVoiceOverKt {
    private static ImageVector _recordVoiceOver;

    public static final ImageVector getRecordVoiceOver(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _recordVoiceOver;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RecordVoiceOver", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(9.0f, 9.0f, -4.0f, 0.0f);
        pathBuilderB.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilderB.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.0f, 15.0f);
        pathBuilderD.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-1.0f);
        pathBuilderD.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.47f, 7.77f);
        pathBuilderD.curveToRelative(0.32f, 0.79f, 0.32f, 1.67f, 0.0f, 2.46f);
        pathBuilderD.curveToRelative(-0.19f, 0.47f, -0.11f, 1.0f, 0.25f, 1.36f);
        pathBuilderD.lineToRelative(0.03f, 0.03f);
        pathBuilderD.curveToRelative(0.58f, 0.58f, 1.57f, 0.46f, 1.95f, -0.27f);
        pathBuilderD.curveToRelative(0.76f, -1.45f, 0.76f, -3.15f, -0.02f, -4.66f);
        pathBuilderD.curveToRelative(-0.38f, -0.74f, -1.38f, -0.88f, -1.97f, -0.29f);
        pathBuilderD.lineToRelative(-0.01f, 0.01f);
        pathBuilderD.curveToRelative(-0.34f, 0.35f, -0.42f, 0.89f, -0.23f, 1.36f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.18f, 2.89f);
        pathBuilderD.curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f);
        pathBuilderD.curveToRelative(1.97f, 2.74f, 1.96f, 6.41f, -0.03f, 9.25f);
        pathBuilderD.curveToRelative(-0.32f, 0.45f, -0.25f, 1.07f, 0.14f, 1.46f);
        pathBuilderD.lineToRelative(0.03f, 0.03f);
        pathBuilderD.curveToRelative(0.49f, 0.49f, 1.32f, 0.45f, 1.74f, -0.1f);
        pathBuilderD.curveToRelative(2.75f, -3.54f, 2.76f, -8.37f, 0.0f, -12.02f);
        pathBuilderD.curveToRelative(-0.42f, -0.55f, -1.26f, -0.59f, -1.75f, -0.1f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recordVoiceOver = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
