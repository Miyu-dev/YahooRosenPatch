package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: DeleteForever.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_deleteForever", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DeleteForever", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDeleteForever", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeleteForeverKt {
    private static ImageVector _deleteForever;

    public static final ImageVector getDeleteForever(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _deleteForever;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DeleteForever", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(16.0f, 9.0f, 8.0f, 9.0f, 10.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 8.0f, 16.0f, 9.0f);
        pathBuilderB.moveTo(15.53f, 16.12f);
        pathBuilderB.lineToRelative(-1.41f, 1.41f);
        pathBuilderB.lineTo(12.0f, 15.41f);
        pathBuilderB.lineToRelative(-2.12f, 2.12f);
        pathBuilderB.lineToRelative(-1.41f, -1.41f);
        pathBuilderB.lineTo(10.59f, 14.0f);
        pathBuilderB.lineToRelative(-2.13f, -2.12f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.lineTo(12.0f, 12.59f);
        pathBuilderB.lineToRelative(2.12f, -2.12f);
        pathBuilderB.lineToRelative(1.41f, 1.41f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderB, 13.41f, 14.0f, 2.12f, 2.12f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(14.12f, 10.47f, 12.0f, 12.59f);
        pathBuilderA.lineToRelative(-2.13f, -2.12f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineTo(10.59f, 14.0f);
        pathBuilderA.lineToRelative(-2.12f, 2.12f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineTo(12.0f, 15.41f);
        pathBuilderA.lineToRelative(2.12f, 2.12f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        androidx.compose.animation.a.A(pathBuilderA, 13.41f, 14.0f, 2.12f, -2.12f);
        pathBuilderA.moveTo(15.5f, 4.0f);
        pathBuilderA.lineToRelative(-1.0f, -1.0f);
        androidx.compose.animation.a.C(pathBuilderA, -5.0f, -1.0f, 1.0f, 5.0f);
        a.h(pathBuilderA, 2.0f, 14.0f, 4.0f);
        pathBuilderA.moveTo(6.0f, 19.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineTo(7.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.verticalLineToRelative(12.0f);
        pathBuilderA.close();
        androidx.appcompat.view.menu.a.x(pathBuilderA, 8.0f, 9.0f, 8.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderA, 8.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deleteForever = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
