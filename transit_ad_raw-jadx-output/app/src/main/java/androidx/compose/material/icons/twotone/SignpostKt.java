package androidx.compose.material.icons.twotone;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Signpost.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signpost", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Signpost", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSignpost", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignpostKt {
    private static ImageVector _signpost;

    public static final ImageVector getSignpost(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _signpost;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Signpost", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(6.0f, 6.0f, 11.17f, 1.0f, 1.0f);
        pathBuilderA.lineToRelative(-1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.verticalLineTo(6.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.0f, 16.0f);
        pathBuilderA.horizontalLineTo(6.83f);
        pathBuilderA.lineToRelative(-1.0f, -1.0f);
        pathBuilderA.lineToRelative(1.0f, -1.0f);
        pathBuilderA.horizontalLineTo(18.0f);
        pathBuilderA.verticalLineTo(16.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.a(13.0f, 10.0f, 5.0f, 3.0f, -3.0f);
        androidx.appcompat.view.menu.a.D(pathBuilderA2, -3.0f, -3.0f, -5.0f, 2.0f);
        androidx.appcompat.app.m.x(pathBuilderA2, -2.0f, 2.0f, 4.0f, 6.0f);
        v.t(pathBuilderA2, 7.0f, 2.0f, 6.0f);
        pathBuilderA2.lineToRelative(-3.0f, 3.0f);
        androidx.browser.browseractions.a.C(pathBuilderA2, 3.0f, 3.0f, 5.0f, 4.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderA2, 2.0f, -4.0f, 7.0f, -6.0f);
        b.m(pathBuilderA2, -7.0f, 10.0f, 6.0f, 6.0f);
        pathBuilderA2.horizontalLineToRelative(11.17f);
        pathBuilderA2.lineToRelative(1.0f, 1.0f);
        pathBuilderA2.lineToRelative(-1.0f, 1.0f);
        pathBuilderA2.horizontalLineTo(6.0f);
        pathBuilderA2.verticalLineTo(6.0f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(18.0f, 16.0f);
        pathBuilderA2.horizontalLineTo(6.83f);
        pathBuilderA2.lineToRelative(-1.0f, -1.0f);
        pathBuilderA2.lineToRelative(1.0f, -1.0f);
        pathBuilderA2.horizontalLineTo(18.0f);
        pathBuilderA2.verticalLineTo(16.0f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signpost = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
