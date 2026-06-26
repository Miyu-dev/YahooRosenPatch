package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.unit.Velocity;
import dj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J-\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/unit/Velocity;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "consumeOnOrientation-QWom1Mo", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "consumeOnOrientation", "Landroidx/compose/ui/geometry/Offset;", "consumeOnOrientation-8S9VItk", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPostFling-RZ2iAVY", "(JJLdj/c;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ConsumeAllFlingOnDirection implements NestedScrollConnection {
    private final Orientation orientation;

    public ConsumeAllFlingOnDirection(Orientation orientation) {
        m.h(orientation, "orientation");
        this.orientation = orientation;
    }

    /* JADX INFO: renamed from: consumeOnOrientation-8S9VItk, reason: not valid java name */
    public final long m731consumeOnOrientation8S9VItk(long j, Orientation orientation) {
        m.h(orientation, "orientation");
        return orientation == Orientation.Vertical ? Offset.m2579copydBAh8RU$default(j, 0.0f, 0.0f, 2, null) : Offset.m2579copydBAh8RU$default(j, 0.0f, 0.0f, 1, null);
    }

    /* JADX INFO: renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m732consumeOnOrientationQWom1Mo(long j, Orientation orientation) {
        m.h(orientation, "orientation");
        return orientation == Orientation.Vertical ? Velocity.m5488copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null) : Velocity.m5488copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo356onPostFlingRZ2iAVY(long j, long j2, c<? super Velocity> cVar) {
        return Velocity.m5483boximpl(m732consumeOnOrientationQWom1Mo(j2, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo357onPostScrollDzOQY0M(long consumed, long available, int source) {
        return NestedScrollSource.m4036equalsimpl0(source, NestedScrollSource.INSTANCE.m4042getFlingWNlRxjI()) ? m731consumeOnOrientation8S9VItk(available, this.orientation) : Offset.INSTANCE.m2601getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo358onPreFlingQWom1Mo(long j, c cVar) {
        return a.c(this, j, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final /* synthetic */ long mo359onPreScrollOzD1aCk(long j, int i2) {
        return a.d(this, j, i2);
    }
}
