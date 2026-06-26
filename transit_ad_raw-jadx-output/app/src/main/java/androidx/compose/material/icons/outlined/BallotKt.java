package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Ballot.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ballot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Ballot", "Landroidx/compose/material/icons/Icons$Outlined;", "getBallot", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BallotKt {
    private static ImageVector _ballot;

    public static final ImageVector getBallot(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _ballot;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Ballot", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = a.v(13.0f, 7.5f, 5.0f, 2.0f, -5.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 13.0f, 14.5f, 5.0f, 2.0f);
        b.q(pathBuilderV, -5.0f, 19.0f, 3.0f);
        pathBuilderV.lineTo(5.0f, 3.0f);
        pathBuilderV.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderV.verticalLineToRelative(14.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderV.horizontalLineToRelative(14.0f);
        pathBuilderV.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.lineTo(21.0f, 5.0f);
        pathBuilderV.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderV, 19.0f, 19.0f, 5.0f, 19.0f);
        s.w(pathBuilderV, 5.0f, 5.0f, 14.0f, 14.0f);
        pathBuilderV.moveTo(11.0f, 6.0f);
        a.b.s(pathBuilderV, 6.0f, 6.0f, 5.0f, 5.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderV, 11.0f, 6.0f, 10.0f, 10.0f);
        pathBuilderV.lineTo(7.0f, 10.0f);
        s.w(pathBuilderV, 7.0f, 7.0f, 3.0f, 3.0f);
        pathBuilderV.moveTo(11.0f, 13.0f);
        a.b.s(pathBuilderV, 6.0f, 13.0f, 5.0f, 5.0f);
        android.support.v4.media.a.v(pathBuilderV, -5.0f, 10.0f, 17.0f);
        a.b.s(pathBuilderV, 7.0f, 17.0f, -3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderV, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ballot = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
