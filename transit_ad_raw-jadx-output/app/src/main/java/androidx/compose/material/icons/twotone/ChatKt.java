package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Chat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_chat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chat", "Landroidx/compose/material/icons/Icons$TwoTone;", "getChat", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChatKt {
    private static ImageVector _chat;

    public static final ImageVector getChat(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _chat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Chat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(20.0f, 4.0f, 4.0f, 4.0f, 13.17f);
        pathBuilderB.lineTo(5.17f, 16.0f);
        android.support.v4.media.a.C(pathBuilderB, 20.0f, 16.0f, 20.0f, 4.0f);
        pathBuilderB.moveTo(14.0f, 14.0f);
        b.s(pathBuilderB, 6.0f, 14.0f, -2.0f, 8.0f);
        android.support.v4.media.a.v(pathBuilderB, 2.0f, 18.0f, 11.0f);
        pathBuilderB.lineTo(6.0f, 11.0f);
        s.w(pathBuilderB, 6.0f, 9.0f, 12.0f, 2.0f);
        pathBuilderB.moveTo(18.0f, 8.0f);
        pathBuilderB.lineTo(6.0f, 8.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderB, 6.0f, 6.0f, 12.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(20.0f, 18.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.lineTo(22.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.lineTo(4.0f, 2.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderD.lineTo(2.0f, 22.0f);
        v.x(pathBuilderD, 4.0f, -4.0f, 14.0f);
        pathBuilderD.moveTo(4.0f, 17.17f);
        androidx.compose.animation.a.o(pathBuilderD, 4.0f, 4.0f, 16.0f, 12.0f);
        android.support.v4.media.a.C(pathBuilderD, 5.17f, 16.0f, 4.0f, 17.17f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 6.0f, 12.0f, 8.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 6.0f, 14.0f, 6.0f, 9.0f);
        androidx.appcompat.app.m.C(pathBuilderD, 12.0f, 2.0f, 6.0f, 11.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 6.0f, 6.0f, 12.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderD, 6.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
