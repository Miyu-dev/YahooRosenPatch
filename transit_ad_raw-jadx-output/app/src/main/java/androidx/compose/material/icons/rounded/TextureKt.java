package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: Texture.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_texture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Texture", "Landroidx/compose/material/icons/Icons$Rounded;", "getTexture", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextureKt {
    private static ImageVector _texture;

    public static final ImageVector getTexture(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _texture;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Texture", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.58f, 3.08f, 3.15f, 19.51f);
        pathBuilderA.curveToRelative(0.09f, 0.34f, 0.27f, 0.65f, 0.51f, 0.9f);
        pathBuilderA.curveToRelative(0.25f, 0.24f, 0.56f, 0.42f, 0.9f, 0.51f);
        pathBuilderA.lineTo(21.0f, 4.49f);
        pathBuilderA.curveToRelative(-0.19f, -0.69f, -0.73f, -1.23f, -1.42f, -1.41f);
        a.y(pathBuilderA, 11.95f, 3.0f, -8.88f, 8.88f);
        pathBuilderA.verticalLineToRelative(2.83f);
        pathBuilderA.lineTo(14.78f, 3.0f);
        pathBuilderA.horizontalLineToRelative(-2.83f);
        pathBuilderA.close();
        pathBuilderA.moveTo(5.07f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(2.0f);
        pathBuilderA.lineToRelative(4.0f, -4.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.07f, 21.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.05f, -0.22f, 1.41f, -0.59f);
        pathBuilderA.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        pathBuilderA.verticalLineToRelative(-2.0f);
        pathBuilderA.lineToRelative(-4.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(9.36f, 21.0f);
        pathBuilderA.horizontalLineToRelative(2.83f);
        pathBuilderA.lineToRelative(8.88f, -8.88f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 21.07f, 9.29f, 9.36f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _texture = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
