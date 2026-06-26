package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.gson.JsonObject;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class g {
    public static float a(Matcher matcher, int i2, String str) {
        String strGroup = matcher.group(i2);
        m.g(strGroup, str);
        return Float.parseFloat(strGroup);
    }

    public static PathBuilder b(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        return pathBuilder;
    }

    public static String c(FillLayer fillLayer, StringBuilder sb, String str, RuntimeException runtimeException, String str2) {
        sb.append(fillLayer.getLayerId());
        sb.append(str);
        sb.append((Object) runtimeException.getMessage());
        sb.append(str2);
        return fillLayer.getLayerId();
    }

    public static String d(String str, long j) {
        return str + j;
    }

    public static List e(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void f(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
    }

    public static void g(Double d, JsonObject jsonObject, String str) {
        jsonObject.addProperty(str, Double.valueOf(d.doubleValue()));
    }
}
