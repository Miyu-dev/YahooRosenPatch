package androidx.compose.material.icons.outlined;

import a.b;
import android.support.v4.media.a;
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

/* JADX INFO: compiled from: RuleFolder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ruleFolder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RuleFolder", "Landroidx/compose/material/icons/Icons$Outlined;", "getRuleFolder", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RuleFolderKt {
    private static ImageVector _ruleFolder;

    public static final ImageVector getRuleFolder(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _ruleFolder;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RuleFolder", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.83f, 16.0f, 5.0f, 13.17f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(3.54f, -3.54f);
        s.r(pathBuilderA, 1.41f, 1.41f, 7.83f, 16.0f);
        pathBuilderA.moveTo(17.41f, 13.0f);
        pathBuilderA.lineTo(19.0f, 14.59f);
        pathBuilderA.lineTo(17.59f, 16.0f);
        pathBuilderA.lineTo(16.0f, 14.41f);
        pathBuilderA.lineTo(14.41f, 16.0f);
        pathBuilderA.lineTo(13.0f, 14.59f);
        pathBuilderA.lineTo(14.59f, 13.0f);
        pathBuilderA.lineTo(13.0f, 11.41f);
        pathBuilderA.lineTo(14.41f, 10.0f);
        pathBuilderA.lineTo(16.0f, 11.59f);
        pathBuilderA.lineTo(17.59f, 10.0f);
        a.C(pathBuilderA, 19.0f, 11.41f, 17.41f, 13.0f);
        pathBuilderA.moveTo(20.0f, 6.0f);
        androidx.compose.animation.a.C(pathBuilderA, -8.0f, -2.0f, -2.0f, 4.0f);
        pathBuilderA.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilderA.lineTo(2.0f, 18.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineTo(8.0f);
        pathBuilderA.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        androidx.compose.animation.a.t(pathBuilderA, 20.0f, 18.0f, 4.0f, 18.0f);
        androidx.appcompat.app.m.u(pathBuilderA, 6.0f, 5.17f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderA, 20.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ruleFolder = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
