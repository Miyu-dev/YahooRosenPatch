package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: NoMeetingRoom.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noMeetingRoom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoMeetingRoom", "Landroidx/compose/material/icons/Icons$Filled;", "getNoMeetingRoom", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoMeetingRoomKt {
    private static ImageVector _noMeetingRoom;

    public static final ImageVector getNoMeetingRoom(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _noMeetingRoom;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoMeetingRoom", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(11.0f, 11.0f, -1.0f, 2.0f, 2.0f);
        pathBuilderF.verticalLineToRelative(-1.0f);
        pathBuilderF.lineToRelative(9.73f, 9.73f);
        pathBuilderF.lineTo(20.46f, 23.0f);
        pathBuilderF.lineTo(14.0f, 16.54f);
        pathBuilderF.lineTo(14.0f, 21.0f);
        b.s(pathBuilderF, 3.0f, 21.0f, -2.0f, 2.0f);
        pathBuilderF.lineTo(5.0f, 7.54f);
        pathBuilderF.lineToRelative(-4.0f, -4.0f);
        s.r(pathBuilderF, 1.27f, -1.27f, 11.0f, 11.0f);
        pathBuilderF.moveTo(14.0f, 11.49f);
        pathBuilderF.lineTo(5.51f, 3.0f);
        b.s(pathBuilderF, 14.0f, 3.0f, 1.0f, 5.0f);
        pathBuilderF.verticalLineToRelative(12.49f);
        pathBuilderF.lineToRelative(-2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderF, 17.0f, 6.0f, -3.0f, 5.49f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeetingRoom = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
