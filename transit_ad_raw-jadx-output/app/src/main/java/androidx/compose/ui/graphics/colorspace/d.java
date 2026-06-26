package androidx.compose.ui.graphics.colorspace;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.arch.core.util.Function;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Bundleable;
import androidx.media3.common.FlagSet;
import androidx.media3.common.HeartRating;
import androidx.media3.common.Player;
import androidx.media3.common.StreamKey;
import androidx.media3.common.ThumbRating;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.work.impl.model.WorkSpec;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.mapbox.common.EventsServiceError;
import com.mapbox.common.TelemetryUtilsResponseCallback;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import d1.o;
import java.util.List;
import java.util.Map;
import jp.co.yahoo.android.haas.debug.domain.DebugAppUseCaseResult;
import jp.co.yahoo.android.haas.debug.viewmodel.ConfirmAreaLogViewModel;
import o.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class d implements DoubleFunction, Interpolator, Bundleable.Creator, ListenerSet.IterationFinishedEvent, ExtractorsFactory, Function, b.b, o.a, LibraryVersionComponent.VersionExtractor, t0.d, TelemetryUtilsResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138a;

    public /* synthetic */ d(int i2) {
        this.f138a = i2;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f138a) {
            case 12:
                return WorkSpec.a((List) obj);
            case 16:
                return ((MessagingClientEventExtension) obj).toByteArray();
            default:
                return ConfirmAreaLogViewModel.a((DebugAppUseCaseResult) obj);
        }
    }

    public final Extractor[] createExtractors() {
        switch (this.f138a) {
            case 9:
                return FlacExtractor.a();
            case 10:
                return FragmentedMp4Extractor.a();
            default:
                return WavExtractor.a();
        }
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.a((Context) obj);
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f138a) {
            case 2:
                return AudioAttributes.a(bundle);
            case 3:
                return HeartRating.b(bundle);
            case 4:
                return StreamKey.fromBundle(bundle);
            case 5:
                return Player.Commands.a(bundle);
            case 6:
                return ThumbRating.b(bundle);
            default:
                return Tracks.a(bundle);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$1(f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.DoubleIdentity$lambda$12(d);
    }

    public final void run(EventsServiceError eventsServiceError) {
        MapTelemetryImpl.c(eventsServiceError);
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.f138a) {
        }
        return androidx.media3.extractor.b.a(this, uri, map);
    }

    public final void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.n0((AnalyticsListener) obj, flagSet);
    }
}
