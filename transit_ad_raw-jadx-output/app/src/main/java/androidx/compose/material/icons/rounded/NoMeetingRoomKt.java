package androidx.compose.material.icons.rounded;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: NoMeetingRoom.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noMeetingRoom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoMeetingRoom", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoMeetingRoom", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoMeetingRoomKt {
    private static ImageVector _noMeetingRoom;

    public static final ImageVector getNoMeetingRoom(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _noMeetingRoom;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoMeetingRoom", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(14.0f, 6.0f, 3.0f, 7.88f);
        pathBuilderO.lineToRelative(2.0f, 2.0f);
        pathBuilderO.lineTo(19.0f, 5.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderO.horizontalLineToRelative(-4.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderO.lineTo(6.12f, 3.0f);
        a.C(pathBuilderO, 14.0f, 10.88f, 14.0f, 6.0f);
        pathBuilderO.moveTo(21.17f, 20.88f);
        pathBuilderO.lineTo(12.0f, 11.71f);
        androidx.compose.animation.a.o(pathBuilderO, 12.0f, 13.0f, -2.0f, -2.0f);
        pathBuilderO.horizontalLineToRelative(1.29f);
        pathBuilderO.lineTo(3.12f, 2.83f);
        pathBuilderO.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderO.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderO.lineTo(5.0f, 7.54f);
        pathBuilderO.lineTo(5.0f, 19.0f);
        pathBuilderO.lineTo(4.0f, 19.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderO.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(9.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderO.verticalLineToRelative(-3.46f);
        pathBuilderO.lineToRelative(5.75f, 5.75f);
        pathBuilderO.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderO.curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeetingRoom = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
