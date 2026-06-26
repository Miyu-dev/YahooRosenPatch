package c;

import android.content.Context;
import androidx.compose.ui.graphics.vector.PathBuilder;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import jp.co.yahoo.android.customlog.h;
import jp.co.yahoo.android.haas.storevisit.common.data.sensor.ActRecognitionModelImpl;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class h implements g4.f {
    public static final String a(int i2) {
        int[] iArr = h.a.a;
        if (i2 != 0) {
            return iArr[i2 + (-1)] != 1 ? "" : "[SDK利用方法エラー]";
        }
        throw null;
    }

    public static String b(SymbolLayer symbolLayer, StringBuilder sb, String str, RuntimeException runtimeException, String str2) {
        sb.append(symbolLayer.getLayerId());
        sb.append(str);
        sb.append((Object) runtimeException.getMessage());
        sb.append(str2);
        return symbolLayer.getLayerId();
    }

    public static void c(Context context, int i2, StringBuilder sb, String str) {
        sb.append(context.getString(i2));
        sb.append(str);
    }

    public static void d(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void e(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void f(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static /* synthetic */ String g(int i2) {
        return i2 == 1 ? "USAGE" : "null";
    }

    public void onFailure(Exception exc) {
        ActRecognitionModelImpl.d(exc);
    }
}
