package androidx.compose.ui.graphics.colorspace;

import android.net.Uri;
import android.os.Bundle;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.media3.common.Bundleable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.location.BaseLiveTrackingClient;
import com.mapbox.common.location.LocationClientStartStopCallback;
import com.mapbox.common.location.LocationError;
import com.mapbox.maps.MapProvider;
import h9.w;
import java.lang.reflect.Constructor;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a implements DoubleFunction, Interpolator, Bundleable.Creator, ListenerSet.Event, Consumer, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, Id3Decoder.FramePredicate, ExtractorsFactory, t0.g, LocationClientStartStopCallback, FlushOperationResultCallback, w.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135a;

    public /* synthetic */ a(int i2) {
        this.f135a = i2;
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
    }

    public final Extractor[] createExtractors() {
        switch (this.f135a) {
            case 11:
                return Mp4Extractor.a();
            default:
                return Ac3Extractor.a();
        }
    }

    public final boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
        return Id3Decoder.a(i2, i3, i4, i5, i6);
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f135a) {
            case 2:
                return MediaItem.AdsConfiguration.a(bundle);
            case 3:
                return MediaItem.SubtitleConfiguration.a(bundle);
            case 4:
                return Rating.a(bundle);
            case 5:
                return Timeline.Period.a(bundle);
            default:
                return VideoSize.a(bundle);
        }
    }

    public final Constructor getConstructor() {
        return DefaultExtractorsFactory.a();
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$3(f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return ColorSpaces.ExtendedSrgb$lambda$0(d);
    }

    public final void run(Expected expected) {
        MapProvider.c(expected);
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.f135a) {
        }
        return androidx.media3.extractor.b.a(this, uri, map);
    }

    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }

    public final void run(LocationError locationError) {
        BaseLiveTrackingClient.c(locationError);
    }

    public final void a(Exception exc) {
    }

    public final void e(int i2) {
    }
}
