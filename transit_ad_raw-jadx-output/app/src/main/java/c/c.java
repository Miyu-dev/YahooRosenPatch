package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c {
    public static int a(String str, int i2) {
        return String.valueOf(str).length() + i2;
    }

    public static int b(Date date, int i2, int i3) {
        return (date.hashCode() + i2) * i3;
    }

    public static PathBuilder c(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static String d(LineLayer lineLayer, StringBuilder sb, String str, RuntimeException runtimeException, String str2) {
        sb.append(lineLayer.getLayerId());
        sb.append(str);
        sb.append((Object) runtimeException.getMessage());
        sb.append(str2);
        return lineLayer.getLayerId();
    }

    public static List e(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void f(double d, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(Double.valueOf(d)));
        sb.append(str);
    }

    public static void g(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void h(String str, StringBuilder sb, String str2) {
        sb.append(RecordUtils.fieldToString(str));
        sb.append(str2);
    }

    public static PathBuilder i(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static void j(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }
}
