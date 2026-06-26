package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import jp.co.yahoo.android.customlog.h;
import jp.co.yahoo.android.haas.storevisit.common.data.sensor.ActRecognitionModelImpl;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class k implements g4.g {
    public static final String a(int i2) {
        int[] iArr = h.a.b;
        if (i2 == 0) {
            throw null;
        }
        int i3 = iArr[i2 - 1];
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "" : "[パラメータフォーマット]" : "[必須パラメータ]" : "[メソッド実行順序]" : "[初期設定]";
    }

    public static PathBuilder b(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static StringBuilder c(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(simpleTypeMarker);
        sb.append(str2);
        return sb;
    }

    public static void d(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void e(Expression expression, String str, String str2, Expression expression2, SymbolLayer symbolLayer) {
        m.h(expression, str);
        symbolLayer.setProperty$extension_style_publicRelease(new PropertyValue(str2, expression2));
    }

    public static /* synthetic */ String f(int i2) {
        return i2 == 1 ? "CONFIG" : i2 == 2 ? "ORDER" : i2 == 3 ? "MSTPARAM" : i2 == 4 ? "PRMCONTEXT" : "null";
    }

    public void onSuccess(Object obj) {
        ActRecognitionModelImpl.b((Void) obj);
    }
}
