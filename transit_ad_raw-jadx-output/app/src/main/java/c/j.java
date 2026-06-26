package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.mapbox.maps.extension.style.layers.generated.RasterLayer;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class j {
    public static /* synthetic */ int a(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i2) {
        if (i2 == 1) {
            return 96;
        }
        if (i2 == 2) {
            return 384;
        }
        if (i2 == 3) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i2) {
        if (i2 == 1) {
            return 96;
        }
        if (i2 == 2) {
            return Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING;
        }
        if (i2 == 3) {
            return -1;
        }
        throw null;
    }

    public static String d(RasterLayer rasterLayer, StringBuilder sb, String str, RuntimeException runtimeException, String str2) {
        sb.append(rasterLayer.getLayerId());
        sb.append(str);
        sb.append((Object) runtimeException.getMessage());
        sb.append(str2);
        return rasterLayer.getLayerId();
    }

    public static HashMap e(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }

    public static void f(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static boolean g(Flags.BooleanFlagField booleanFlagField, int i2, String str) {
        Boolean bool = booleanFlagField.get(i2);
        m.g(bool, str);
        return bool.booleanValue();
    }

    public static void h(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }
}
