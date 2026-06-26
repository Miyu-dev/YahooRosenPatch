package c;

import android.util.Log;
import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.gson.JsonElement;
import com.mapbox.maps.StyleManagerInterface;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class f {
    public static Double a(JsonElement jsonElement, String str) {
        String asString = jsonElement.getAsString();
        m.g(asString, str);
        return Double.valueOf(Double.parseDouble(asString));
    }

    public static String b(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        String string = sb.toString();
        m.g(string, str2);
        return string;
    }

    public static String c(FillExtrusionLayer fillExtrusionLayer, StringBuilder sb, String str, RuntimeException runtimeException, String str2) {
        sb.append(fillExtrusionLayer.getLayerId());
        sb.append(str);
        sb.append((Object) runtimeException.getMessage());
        sb.append(str2);
        return fillExtrusionLayer.getLayerId();
    }

    public static void d(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void e(StyleManagerInterface styleManagerInterface, String str, String str2, StringBuilder sb, String str3) {
        sb.append(styleManagerInterface.getStyleLayerProperty(str, str2));
        Log.e(str3, sb.toString());
    }

    public static void f(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void g(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }
}
