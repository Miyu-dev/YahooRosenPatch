package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.android.gms.internal.measurement.zzbl;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.ArrayList;
import jp.co.yahoo.android.customlog.j;
import jp.co.yahoo.android.haas.storevisit.common.data.sensor.ActRecognitionModelImpl;
import kj.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class e implements g4.g {
    public static final String a(int i2) {
        int[] iArr = j.a.a;
        if (i2 == 0) {
            throw null;
        }
        int i3 = iArr[i2 - 1];
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "" : "dummy" : "lv" : "cl" : "ev";
    }

    public static PathBuilder b(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static Expression c(l lVar, String str, String str2) {
        m.h(lVar, str);
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder(str2);
        lVar.invoke(expressionBuilder);
        return expressionBuilder.build();
    }

    public static Object d(zzbl zzblVar, int i2, ArrayList arrayList, int i3) {
        li.c.f0(i2, zzblVar.name(), arrayList);
        return arrayList.get(i3);
    }

    public static void e(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void f(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void g(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void h(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public void onSuccess(Object obj) {
        ActRecognitionModelImpl.a((Void) obj);
    }
}
