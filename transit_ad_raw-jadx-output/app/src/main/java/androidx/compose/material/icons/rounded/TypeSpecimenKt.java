package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: TypeSpecimen.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_typeSpecimen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TypeSpecimen", "Landroidx/compose/material/icons/Icons$Rounded;", "getTypeSpecimen", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TypeSpecimenKt {
    private static ImageVector _typeSpecimen;

    public static final ImageVector getTypeSpecimen(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _typeSpecimen;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TypeSpecimen", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(3.0f, 6.0f, 3.0f, 6.0f);
        pathBuilderA.curveTo(2.45f, 6.0f, 2.0f, 6.45f, 2.0f, 7.0f);
        pathBuilderA.verticalLineToRelative(13.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(13.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.verticalLineTo(7.0f);
        pathBuilderA.curveTo(4.0f, 6.45f, 3.55f, 6.0f, 3.0f, 6.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 2.0f, 8.0f);
        pathBuilderB.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        pathBuilderB.verticalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.0f);
        pathBuilderB.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        a.y(pathBuilderB, 16.46f, 14.01f, -0.63f, -1.82f);
        pathBuilderB.horizontalLineToRelative(-3.63f);
        pathBuilderB.lineToRelative(-0.65f, 1.82f);
        pathBuilderB.curveToRelative(-0.1f, 0.29f, -0.38f, 0.48f, -0.68f, 0.48f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.51f, 0.0f, -0.86f, -0.51f, -0.68f, -0.98f);
        pathBuilderB.lineToRelative(2.73f, -7.27f);
        pathBuilderB.curveTo(13.08f, 5.8f, 13.52f, 5.5f, 14.0f, 5.5f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.48f, 0.0f, 0.92f, 0.3f, 1.09f, 0.75f);
        pathBuilderB.lineToRelative(2.73f, 7.27f);
        pathBuilderB.curveToRelative(0.18f, 0.47f, -0.17f, 0.98f, -0.68f, 0.98f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveTo(16.83f, 14.5f, 16.56f, 14.31f, 16.46f, 14.01f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(androidx.compose.animation.b.a(13.96f, 7.17f, -1.31f, 3.72f), 2.69f, 0.0f, -1.3f, -3.72f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _typeSpecimen = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
