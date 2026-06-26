package androidx.compose.foundation.lazy.layout;

import a.l;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import qj.f;

/* JADX INFO: compiled from: LazyNearestItemsRange.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"Lkotlin/Function0;", "", "firstVisibleItemIndex", "slidingWindowSize", "extraItemCount", "Landroidx/compose/runtime/State;", "Lqj/f;", "rememberLazyNearestItemsRangeState", "(Lkj/a;Lkj/a;Lkj/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "firstVisibleItem", "calculateNearestItemsRange", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyNearestItemsRangeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final f calculateNearestItemsRange(int i2, int i3, int i4) {
        int i5 = (i2 / i3) * i3;
        return l.C(Math.max(i5 - i4, 0), i5 + i3 + i4);
    }

    @Composable
    @ExperimentalFoundationApi
    public static final State<f> rememberLazyNearestItemsRangeState(kj.a<Integer> aVar, kj.a<Integer> aVar2, kj.a<Integer> aVar3, Composer composer, int i2) {
        m.h(aVar, "firstVisibleItemIndex");
        m.h(aVar2, "slidingWindowSize");
        m.h(aVar3, "extraItemCount");
        composer.startReplaceableGroup(429733345);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(429733345, i2, -1, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(aVar) | composer.changed(aVar2) | composer.changed(aVar3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calculateNearestItemsRange(((Number) aVar.invoke()).intValue(), ((Number) aVar2.invoke()).intValue(), ((Number) aVar3.invoke()).intValue()), null, 2, null);
                    snapshotCreateNonObservableSnapshot.dispose();
                    composer.updateRememberedValue(objMutableStateOf$default);
                    objRememberedValue = objMutableStateOf$default;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } catch (Throwable th) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th;
            }
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Object[] objArr = {aVar, aVar2, aVar3, mutableState};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged2 = false;
        for (int i3 = 0; i3 < 4; i3++) {
            zChanged2 |= composer.changed(objArr[i3]);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(aVar, aVar2, aVar3, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(mutableState, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue2, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
