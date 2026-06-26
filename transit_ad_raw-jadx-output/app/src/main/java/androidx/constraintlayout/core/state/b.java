package androidx.constraintlayout.core.state;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceView;
import androidx.arch.core.util.Function;
import androidx.media3.common.Bundleable;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PercentageRating;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationServiceImpl;
import d1.o;
import h9.w;
import java.util.List;
import java.util.Map;
import jp.co.yahoo.android.maps.place.domain.model.place.MediaViewerData;
import kf.o;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b implements Interpolator, DebugViewProvider, Bundleable.Creator, ListenerSet.Event, ExtractorsFactory, o.a, LibraryVersionComponent.VersionExtractor, ComponentRegistrarProcessor, Expected.Transformer, w.c, Function, o.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164a;

    public /* synthetic */ b(int i2) {
        this.f164a = i2;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f164a) {
            case 12:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                MediaViewerData mediaViewerData = (MediaViewerData) obj;
                return Integer.valueOf(mediaViewerData != null ? mediaViewerData.b : 0);
        }
    }

    public final Extractor[] createExtractors() {
        switch (this.f164a) {
            case 7:
                return androidx.media3.extractor.b.b();
            case 8:
                return MatroskaExtractor.a();
            case 9:
                return OggExtractor.a();
            default:
                return AdtsExtractor.a();
        }
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.b((Context) obj);
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f164a) {
            case 2:
                return MediaItem.DrmConfiguration.a(bundle);
            case 3:
                return PercentageRating.b(bundle);
            case 4:
            default:
                return CueGroup.a(bundle);
            case 5:
                return TrackGroup.a(bundle);
        }
    }

    public final SurfaceView getDebugPreviewSurfaceView(int i2, int i3) {
        return androidx.media3.common.b.a(i2, i3);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$5(f);
    }

    public final Object invoke(Object obj) {
        return LocationServiceImpl.b((LocationError) obj);
    }

    public final List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.f164a) {
        }
        return androidx.media3.extractor.b.a(this, uri, map);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m5527invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }

    public final void a() {
    }

    public final void e(int i2) {
    }
}
