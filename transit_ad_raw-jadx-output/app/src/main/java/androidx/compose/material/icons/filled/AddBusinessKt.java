package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: AddBusiness.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addBusiness", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddBusiness", "Landroidx/compose/material/icons/Icons$Filled;", "getAddBusiness", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddBusinessKt {
    private static ImageVector _addBusiness;

    public static final ImageVector getAddBusiness(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _addBusiness;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddBusiness", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(15.0f, 17.0f, 2.0f, -3.0f, 1.0f);
        pathBuilderF.verticalLineToRelative(-2.0f);
        pathBuilderF.lineToRelative(-1.0f, -5.0f);
        pathBuilderF.horizontalLineTo(2.0f);
        v.u(pathBuilderF, -1.0f, 5.0f, 2.0f, 1.0f);
        a.l(pathBuilderF, 6.0f, 9.0f, -6.0f, 4.0f);
        androidx.compose.animation.a.y(pathBuilderF, 17.0f, 9.0f, 18.0f, 4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderF, -4.0f, 5.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(2.0f, 4.0f, 15.0f, 2.0f, -15.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = androidx.compose.animation.b.a(20.0f, 18.0f, 0.0f, -3.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 3.0f);
        pathBuilderA.lineToRelative(-3.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 2.0f);
        pathBuilderA.lineToRelative(3.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 3.0f);
        pathBuilderA.lineToRelative(2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 3.0f, 0.0f, 0.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addBusiness = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
