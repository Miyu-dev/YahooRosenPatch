package androidx.constraintlayout.core.state;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Bundleable;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.ts.PsExtractor;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.mapbox.common.EventsServiceError;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.location.GoogleLiveTrackingClient;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import d1.o;
import g4.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w0.d;
import w0.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c implements Interpolator, Bundleable.Creator, ExtractorsFactory, o.a, LibraryVersionComponent.VersionExtractor, t0.d, g4.c, GoogleLiveTrackingClient.Companion.ResolveSkipInvalidVersion, EventsServiceResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165a;

    public /* synthetic */ c(int i2) {
        this.f165a = i2;
    }

    public final Object apply(Object obj) {
        switch (this.f165a) {
            case 9:
                t0.b bVar = o.f;
                return (List) o.q(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new c(10));
            case 10:
                Cursor cursor = (Cursor) obj;
                t0.b bVar2 = o.f;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    d.a aVarA = m.a();
                    aVarA.b(cursor.getString(1));
                    aVarA.c(g1.a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    aVarA.b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(aVarA.a());
                }
                return arrayList;
            case 11:
                Cursor cursor2 = (Cursor) obj;
                t0.b bVar3 = o.f;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor2.moveToNext()) {
                    byte[] blob = cursor2.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i2);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
            default:
                return DataTransportCrashlyticsReportSender.a((CrashlyticsReport) obj);
        }
    }

    public final Extractor[] createExtractors() {
        switch (this.f165a) {
            case 6:
                return AmrExtractor.a();
            case 7:
                return Mp3Extractor.a();
            default:
                return PsExtractor.a();
        }
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.c((Context) obj);
    }

    public final Bundleable fromBundle(Bundle bundle) {
        switch (this.f165a) {
            case 1:
                return AdPlaybackState.a(bundle);
            case 2:
                return DeviceInfo.a(bundle);
            case 3:
                return MediaItem.LiveConfiguration.a(bundle);
            case 4:
                return new PlaybackException(bundle);
            default:
                return TrackSelectionOverride.a(bundle);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$6(f);
    }

    public final boolean invoke() {
        return GoogleLiveTrackingClient.f();
    }

    public final void run(EventsServiceError eventsServiceError) {
        MapTelemetryImpl.a(eventsServiceError);
    }

    public final Object then(i iVar) {
        return FcmBroadcastProcessor.b(iVar);
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.f165a) {
        }
        return androidx.media3.extractor.b.a(this, uri, map);
    }
}
