package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: FolderDelete.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_folderDelete", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FolderDelete", "Landroidx/compose/material/icons/Icons$Outlined;", "getFolderDelete", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FolderDeleteKt {
    private static ImageVector _folderDelete;

    public static final ImageVector getFolderDelete(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _folderDelete;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FolderDelete", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(16.5f, 10.0f, 9.0f, -2.0f, 1.0f);
        a.B(pathBuilderC, 12.0f, 1.5f, 1.0f, 4.0f);
        pathBuilderC.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        androidx.appcompat.graphics.drawable.a.q(pathBuilderC, -4.0f, 1.0f, 10.0f, 16.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 16.5f, 15.5f, -2.0f, -4.0f);
        b.m(pathBuilderC, 2.0f, 15.5f, 20.0f, 6.0f);
        androidx.compose.animation.a.C(pathBuilderC, -8.0f, -2.0f, -2.0f, 4.0f);
        pathBuilderC.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        pathBuilderC.lineTo(2.0f, 18.0f);
        pathBuilderC.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(16.0f);
        pathBuilderC.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderC.verticalLineTo(8.0f);
        pathBuilderC.curveTo(22.0f, 6.89f, 21.11f, 6.0f, 20.0f, 6.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderC, 20.0f, 18.0f, 4.0f, 6.0f);
        androidx.compose.animation.a.C(pathBuilderC, 5.17f, 2.0f, 2.0f, 20.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderC, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderDelete = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
