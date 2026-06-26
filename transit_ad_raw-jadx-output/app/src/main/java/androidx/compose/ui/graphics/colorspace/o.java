package androidx.compose.ui.graphics.colorspace;

import android.database.Cursor;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import d1.o;
import h9.a;
import h9.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jp.co.yahoo.android.apps.transit.ui.activity.navi.RailmapActivity;
import jp.co.yahoo.android.apps.transit.ui.fragment.input.InputAddressFragment;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.TimeTableMemoAppealFromType;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.TimeTableMemoListFragment;
import jp.co.yahoo.android.maps.place.presentation.poiend.PoiEndFragment;
import jp.co.yahoo.yconnect.data.storage.FidoLogList;
import jp.co.yahoo.yconnect.sso.fido.FidoUtil;
import l7.q4;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class o implements DoubleFunction, Interpolator, ListenerSet.Event, BinarySearchSeeker.SeekTimestampConverter, o.a, w.c, a.a, SwipeRefreshLayout.OnRefreshListener, lb.a, oi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f149a;

    public /* synthetic */ o(Object obj) {
        this.f149a = obj;
    }

    public final void a() {
        FidoLogList.a aVar = (FidoLogList.a) this.f149a;
        FidoUtil fidoUtil = FidoUtil.a;
        kotlin.jvm.internal.m.h(aVar, "$updatedFidoLog");
        aVar.toString();
    }

    public final Object apply(Object obj) {
        Map map = (Map) this.f149a;
        Cursor cursor = (Cursor) obj;
        t0.b bVar = d1.o.f;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new o.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public final void d(HashMap map) {
        InputAddressFragment inputAddressFragment = (InputAddressFragment) this.f149a;
        int i2 = InputAddressFragment.h;
        kotlin.jvm.internal.m.h(inputAddressFragment, "this$0");
        inputAddressFragment.k(map);
    }

    public final void e(int i2) {
        ((RailmapActivity) this.f149a).x = i2;
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0((String) this.f149a, f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$9((TransferParameters) this.f149a, d);
    }

    public final void onRefresh() {
        TimeTableMemoListFragment timeTableMemoListFragment = (TimeTableMemoListFragment) this.f149a;
        int i2 = TimeTableMemoListFragment.x;
        kotlin.jvm.internal.m.h(timeTableMemoListFragment, "this$0");
        if (jp.co.yahoo.android.apps.transit.util.d.h()) {
            TimeTableMemoListFragment.a0(timeTableMemoListFragment, false, (TimeTableMemoAppealFromType) null, 7);
            timeTableMemoListFragment.V();
        } else {
            q4 q4Var = timeTableMemoListFragment.i;
            kotlin.jvm.internal.m.e(q4Var);
            q4Var.h.setRefreshing(false);
        }
    }

    public final void onResult(boolean z) {
        PoiEndFragment poiEndFragment = (PoiEndFragment) this.f149a;
        int i2 = PoiEndFragment.k;
        kotlin.jvm.internal.m.h(poiEndFragment, "this$0");
        LifecycleOwnerKt.getLifecycleScope(poiEndFragment).launchWhenStarted(new jp.co.yahoo.android.maps.place.presentation.poiend.h(z, poiEndFragment, (dj.c) null));
    }

    public final long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.f149a).getSampleNumber(j);
    }

    public final void invoke(Object obj) {
        DefaultAnalyticsCollector.f0((AnalyticsListener.EventTime) this.f149a, (AnalyticsListener) obj);
    }
}
