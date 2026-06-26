package androidx.constraintlayout.core.state;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.Bundleable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.k;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.flv.FlvExtractor;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AndroidLiveTrackingClient;
import com.mapbox.common.location.LocationError;
import d1.o;
import java.util.Map;
import mf.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a implements Interpolator, Bundleable.Creator, Consumer, TrackSelector.InvalidationListener, ExtractorsFactory, o.a, Expected.Transformer, m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;

    public /* synthetic */ a(int i2) {
        this.f163a = i2;
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
    }

    public final Object apply(Object obj) {
        switch (this.f163a) {
            case 9:
                Cursor cursor = (Cursor) obj;
                t0.b bVar = o.f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 10:
                t0.b bVar2 = o.f;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            default:
                Cursor cursor2 = (Cursor) obj;
                t0.b bVar3 = o.f;
                if (cursor2.moveToNext()) {
                    return Long.valueOf(cursor2.getLong(0));
                }
                return null;
        }
    }

    public final void b() {
        a aVar = m.c;
    }

    public final Extractor[] createExtractors() {
        return FlvExtractor.a();
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f163a) {
            case 1:
                return MediaItem.a(bundle);
            case 2:
                return MediaItem.RequestMetadata.a(bundle);
            case 3:
                return Player.PositionInfo.a(bundle);
            case 4:
                return Timeline.a(bundle);
            default:
                return Tracks.Group.a(bundle);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$2(f);
    }

    public final Object invoke(Object obj) {
        return AndroidLiveTrackingClient.d((LocationError) obj);
    }

    public final /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
        k.a(this, renderer);
    }

    public final void onTrackSelectionsInvalidated() {
        DownloadHelper.b();
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return androidx.media3.extractor.b.a(this, uri, map);
    }
}
