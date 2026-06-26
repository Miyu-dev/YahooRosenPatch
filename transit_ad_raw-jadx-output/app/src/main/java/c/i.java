package c;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class i {
    public static Visibility a(Locale locale, String str, String str2, Locale locale2, String str3, char c2, char c3) {
        m.g(locale, str);
        String upperCase = str2.toUpperCase(locale2);
        m.g(upperCase, str3);
        return Visibility.valueOf(kotlin.text.m.a1(upperCase, c2, c3));
    }

    public static void b(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void c(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
    }
}
