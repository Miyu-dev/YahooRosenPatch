package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: InsertChartOutlined.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_insertChartOutlined", "Landroidx/compose/ui/graphics/vector/ImageVector;", "InsertChartOutlined", "Landroidx/compose/material/icons/Icons$Sharp;", "getInsertChartOutlined", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class InsertChartOutlinedKt {
    private static ImageVector _insertChartOutlined;

    public static final ImageVector getInsertChartOutlined(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _insertChartOutlined;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.InsertChartOutlined", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(9.0f, 17.0f, 7.0f, 17.0f, -7.0f);
        a.z(pathBuilderB, 2.0f, 7.0f, 13.0f, 17.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderB, -2.0f, 11.0f, 7.0f, 2.0f);
        a.A(pathBuilderB, 10.0f, 17.0f, 17.0f, -2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderB, -4.0f, 2.0f, 4.0f);
        pathBuilderB.moveTo(19.0f, 19.0f);
        pathBuilderB.lineTo(5.0f, 19.0f);
        s.w(pathBuilderB, 5.0f, 5.0f, 14.0f, 14.0f);
        pathBuilderB.moveTo(21.0f, 3.0f);
        b.s(pathBuilderB, 3.0f, 3.0f, 18.0f, 18.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderB, 21.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertChartOutlined = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
