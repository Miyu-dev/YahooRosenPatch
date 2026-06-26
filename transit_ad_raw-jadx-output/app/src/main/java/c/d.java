package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayer;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class d implements FirebaseInstanceIdInternal.NewTokenListener {
    public static PathBuilder a(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static String b(LocationIndicatorLayer locationIndicatorLayer, StringBuilder sb, String str, RuntimeException runtimeException, String str2) {
        sb.append(locationIndicatorLayer.getLayerId());
        sb.append(str);
        sb.append((Object) runtimeException.getMessage());
        sb.append(str2);
        return locationIndicatorLayer.getLayerId();
    }

    public static List c(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static FqName d(String str, FqName fqName, String str2) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        m.g(fqNameChild, str2);
        return fqNameChild;
    }

    public static void e(long j, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(Long.valueOf(j)));
        sb.append(str);
    }

    public static void f(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void g(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static void h(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }
}
