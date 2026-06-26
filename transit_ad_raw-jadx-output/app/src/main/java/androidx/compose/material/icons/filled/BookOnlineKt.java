package androidx.compose.material.icons.filled;

import a6.h;
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

/* JADX INFO: compiled from: BookOnline.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bookOnline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BookOnline", "Landroidx/compose/material/icons/Icons$Filled;", "getBookOnline", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BookOnlineKt {
    private static ImageVector _bookOnline;

    public static final ImageVector getBookOnline(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _bookOnline;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BookOnline", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(17.0f, 1.0f, 7.0f);
        pathBuilderB.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilderB.verticalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(10.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(3.0f);
        pathBuilderB.curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f);
        h.B(pathBuilderB, 7.0f, 18.0f, 6.0f, 10.0f);
        h.z(pathBuilderB, 12.0f, 7.0f, 16.0f, 11.0f);
        pathBuilderB.verticalLineTo(9.14f);
        pathBuilderB.curveTo(16.0f, 8.51f, 15.55f, 8.0f, 15.0f, 8.0f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.curveTo(8.45f, 8.0f, 8.0f, 8.51f, 8.0f, 9.14f);
        pathBuilderB.lineToRelative(0.0f, 1.96f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.lineToRelative(0.0f, 1.76f);
        pathBuilderB.curveTo(8.0f, 15.49f, 8.45f, 16.0f, 9.0f, 16.0f);
        pathBuilderB.horizontalLineToRelative(6.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.51f, 1.0f, -1.14f);
        pathBuilderB.verticalLineTo(13.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.curveTo(15.0f, 11.45f, 15.45f, 11.0f, 16.0f, 11.0f);
        b.r(pathBuilderB, 12.5f, 14.5f, -1.0f, -1.0f);
        a.b.m(pathBuilderB, 1.0f, 14.5f, 12.5f, 12.5f);
        a.B(pathBuilderB, -1.0f, -1.0f, 1.0f, 12.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 12.5f, 10.5f, -1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderB, 1.0f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookOnline = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
