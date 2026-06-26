package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: ImportContacts.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_importContacts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ImportContacts", "Landroidx/compose/material/icons/Icons$Filled;", "getImportContacts", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ImportContactsKt {
    private static ImageVector _importContacts;

    public static final ImageVector getImportContacts(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _importContacts;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ImportContacts", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.5f, 4.5f);
        pathBuilderD.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilderD.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        pathBuilderD.verticalLineToRelative(14.65f);
        pathBuilderD.curveToRelative(0.0f, 0.65f, 0.73f, 0.45f, 0.75f, 0.45f);
        pathBuilderD.curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        pathBuilderD.curveToRelative(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
        pathBuilderD.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilderD.curveToRelative(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
        pathBuilderD.curveTo(22.66f, 21.26f, 23.0f, 20.86f, 23.0f, 20.6f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveTo(21.51f, 4.88f, 19.37f, 4.5f, 17.5f, 4.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(21.0f, 18.5f);
        pathBuilderD.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        pathBuilderD.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilderD.curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importContacts = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
