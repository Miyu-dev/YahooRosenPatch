package androidx.compose.ui.graphics.colorspace;

import com.mapbox.common.EventsServiceError;
import com.mapbox.common.MmeTelemetryProperties;
import com.mapbox.common.TelemetryUtilsResponseCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class g implements DoubleFunction, TelemetryUtilsResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj.l f141a;

    public /* synthetic */ g(kj.l lVar) {
        this.f141a = lVar;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$5(this.f141a, d);
    }

    public final void run(EventsServiceError eventsServiceError) {
        MmeTelemetryProperties.Companion.a(this.f141a, eventsServiceError);
    }
}
