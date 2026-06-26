package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: AccountTree.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountTree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountTree", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAccountTree", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AccountTreeKt {
    private static ImageVector _accountTree;

    public static final ImageVector getAccountTree(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _accountTree;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccountTree", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(22.0f, 11.0f, 3.0f, -7.0f, 3.0f);
        a.v(pathBuilderC, 9.0f, 3.0f, 2.0f, 8.0f);
        androidx.appcompat.app.m.w(pathBuilderC, 7.0f, 8.0f, 2.0f, 10.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderC, 4.0f, 3.0f, 7.0f, -8.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderC, -7.0f, 3.0f, -2.0f, 8.0f);
        s.q(pathBuilderC, 2.0f, 3.0f, 22.0f);
        android.support.v4.media.a.B(pathBuilderC, 7.0f, 9.0f, 4.0f, 5.0f);
        b.m(pathBuilderC, 3.0f, 9.0f, 17.0f, 15.0f);
        a.B(pathBuilderC, 3.0f, 4.0f, -3.0f, 15.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 17.0f, 5.0f, 3.0f, 4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderC, -3.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = androidx.compose.animation.b.a(7.0f, 5.0f, 0.0f, 4.0f);
        pathBuilderA.lineToRelative(-3.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -4.0f);
        pathBuilderA.lineToRelative(3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = androidx.compose.animation.b.a(20.0f, 5.0f, 0.0f, 4.0f);
        pathBuilderA2.lineToRelative(-3.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, -4.0f);
        pathBuilderA2.lineToRelative(3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = androidx.compose.animation.b.a(20.0f, 15.0f, 0.0f, 4.0f);
        pathBuilderA3.lineToRelative(-3.0f, 0.0f);
        pathBuilderA3.lineToRelative(0.0f, -4.0f);
        pathBuilderA3.lineToRelative(3.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountTree = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
