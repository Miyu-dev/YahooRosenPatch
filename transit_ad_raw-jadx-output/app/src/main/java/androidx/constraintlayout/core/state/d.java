package androidx.constraintlayout.core.state;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.arch.core.util.Function;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Bundleable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.StarRating;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.j;
import androidx.media3.exoplayer.source.MediaParserExtractorAdapter;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServiceError;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.location.GoogleLiveTrackingClient;
import com.mapbox.common.location.LocationError;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import java.util.List;
import java.util.Map;
import jp.co.yahoo.android.haas.debug.domain.DebugAppUseCaseResult;
import jp.co.yahoo.android.haas.debug.viewmodel.ConfirmAreaLogViewModel;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class d implements Interpolator, Bundleable.Creator, CacheKeyFactory, DrmSessionManager.DrmSessionReference, ProgressiveMediaExtractor.Factory, ChunkExtractor.Factory, Id3Decoder.FramePredicate, ExtractorsFactory, LibraryVersionComponent.VersionExtractor, Expected.Transformer, EventsServiceResponseCallback, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166a;

    public /* synthetic */ d(int i2) {
        this.f166a = i2;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return ConfirmAreaLogViewModel.b((DebugAppUseCaseResult) obj);
    }

    public final String buildCacheKey(DataSpec dataSpec) {
        return androidx.media3.datasource.cache.a.a(dataSpec);
    }

    public final Extractor[] createExtractors() {
        return TsExtractor.a();
    }

    public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId);
    }

    public final boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
        return Mp3Extractor.b(i2, i3, i4, i5, i6);
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.d((Context) obj);
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f166a) {
            case 1:
                return AdPlaybackState.AdGroup.a(bundle);
            case 2:
                return Format.a(bundle);
            case 3:
                return MediaItem.LocalConfiguration.a(bundle);
            case 4:
                return PlaybackParameters.a(bundle);
            case 5:
                return StarRating.b(bundle);
            case 6:
                return TrackSelectionParameters.fromBundle(bundle);
            default:
                return TrackGroupArray.a(bundle);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$7(f);
    }

    public final Object invoke(Object obj) {
        return GoogleLiveTrackingClient.h((LocationError) obj);
    }

    public final void release() {
        j.a();
    }

    public final void run(EventsServiceError eventsServiceError) {
        MapTelemetryImpl.b(eventsServiceError);
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return androidx.media3.extractor.b.a(this, uri, map);
    }

    public final ChunkExtractor createProgressiveMediaExtractor(int i2, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        switch (this.f166a) {
            case 11:
                return BundledChunkExtractor.a(i2, format, z, list, trackOutput, playerId);
            default:
                return MediaParserChunkExtractor.a(i2, format, z, list, trackOutput, playerId);
        }
    }
}
