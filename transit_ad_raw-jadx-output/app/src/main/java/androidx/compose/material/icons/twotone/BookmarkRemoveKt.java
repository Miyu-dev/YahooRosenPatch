package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: BookmarkRemove.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bookmarkRemove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BookmarkRemove", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBookmarkRemove", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BookmarkRemoveKt {
    private static ImageVector _bookmarkRemove;

    public static final ImageVector getBookmarkRemove(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _bookmarkRemove;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BookmarkRemove", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.0f, 17.97f, 0.0f, -7.07f);
        pathBuilderA.curveToRelative(-2.28f, -0.46f, -4.0f, -2.48f, -4.0f, -4.9f);
        pathBuilderA.curveToRelative(0.0f, -0.34f, 0.03f, -0.68f, 0.1f, -1.0f);
        pathBuilderA.lineTo(7.0f, 5.0f);
        pathBuilderA.verticalLineToRelative(12.97f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 5.0f, -2.14f, 17.0f, 17.97f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(21.0f, 7.0f, -6.0f, 5.0f, 6.0f);
        a.y(pathBuilderV, 7.0f, 17.0f, 17.97f);
        pathBuilderV.lineToRelative(-5.0f, -2.14f);
        pathBuilderV.lineToRelative(-5.0f, 2.14f);
        pathBuilderV.verticalLineTo(5.0f);
        pathBuilderV.lineToRelative(6.1f, 0.0f);
        pathBuilderV.curveToRelative(0.15f, -0.74f, 0.46f, -1.42f, 0.9f, -2.0f);
        pathBuilderV.lineTo(7.0f, 3.0f);
        pathBuilderV.curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f);
        pathBuilderV.verticalLineToRelative(16.0f);
        pathBuilderV.lineToRelative(7.0f, -3.0f);
        pathBuilderV.lineToRelative(7.0f, 3.0f);
        pathBuilderV.lineToRelative(0.0f, -10.1f);
        pathBuilderV.curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f);
        pathBuilderV.curveToRelative(-0.34f, 0.0f, -0.68f, -0.03f, -1.0f, -0.1f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderV, 17.0f, 17.97f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkRemove = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
