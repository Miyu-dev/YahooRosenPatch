package androidx.compose.ui.graphics.colorspace;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import androidx.arch.core.util.Function;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.media3.common.Bundleable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Timeline;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.ts.Ac4Extractor;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.compat.LocationEngineImpl;
import com.mapbox.maps.MapProvider;
import d1.o;
import h9.w;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import jp.co.yahoo.android.apps.transit.ui.activity.WalkRouteActivity;
import jp.co.yahoo.android.maps.place.domain.model.place.MediaViewerData;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b implements DoubleFunction, Interpolator, Bundleable.Creator, Consumer, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, ExtractorsFactory, o.a, Expected.Action, FlushOperationResultCallback, w.c, vk.b, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136a;

    public /* synthetic */ b(int i2) {
        this.f136a = i2;
    }

    public final void a(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            w.a = location;
        } else {
            Location location2 = w.a;
        }
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded();
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        MediaViewerData mediaViewerData = (MediaViewerData) obj;
        List list = mediaViewerData != null ? mediaViewerData.a : null;
        return list == null ? EmptyList.INSTANCE : list;
    }

    public final Extractor[] createExtractors() {
        return Ac4Extractor.a();
    }

    public final void e(int i2) {
        switch (this.f136a) {
            case 13:
                int i3 = WalkRouteActivity.k;
                break;
        }
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f136a) {
            case 2:
                return ColorInfo.a(bundle);
            case 3:
                return MediaItem.ClippingConfiguration.a(bundle);
            case 4:
                return MediaMetadata.a(bundle);
            case 5:
                return Timeline.Window.a(bundle);
            default:
                return Cue.a(bundle);
        }
    }

    public final Constructor getConstructor() {
        return DefaultExtractorsFactory.b();
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$4(f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return ColorSpaces.ExtendedSrgb$lambda$1(d);
    }

    public final void run(Expected expected) {
        MapProvider.a(expected);
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return androidx.media3.extractor.b.a(this, uri, map);
    }

    public final void run(Object obj) {
        LocationEngineImpl.d((LocationError) obj);
    }
}
