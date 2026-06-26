package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aT\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0007\u001a\u001e\u0010\u0015\u001a\u00020\b*\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Lqj/f;", "nearestItemsRange", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "itemContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "LazyLayoutItemProvider", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Lqj/f;Lkj/r;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Landroidx/compose/runtime/State;", "delegate", "DelegatingLazyLayoutItemProvider", "", "key", "lastKnownIndex", "findIndexByKey", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    public static final LazyLayoutItemProvider DelegatingLazyLayoutItemProvider(State<? extends LazyLayoutItemProvider> state) {
        m.h(state, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(state);
    }

    @ExperimentalFoundationApi
    public static final <T extends LazyLayoutIntervalContent> LazyLayoutItemProvider LazyLayoutItemProvider(IntervalList<? extends T> intervalList, f fVar, r<? super IntervalList.Interval<? extends T>, ? super Integer, ? super Composer, ? super Integer, j> rVar) {
        m.h(intervalList, "intervals");
        m.h(fVar, "nearestItemsRange");
        m.h(rVar, "itemContent");
        return new DefaultLazyLayoutItemsProvider(rVar, intervalList, fVar);
    }

    @ExperimentalFoundationApi
    public static final int findIndexByKey(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2) {
        Integer num;
        m.h(lazyLayoutItemProvider, "<this>");
        return obj == null ? i2 : ((i2 >= lazyLayoutItemProvider.getItemCount() || !m.c(obj, lazyLayoutItemProvider.getKey(i2))) && (num = lazyLayoutItemProvider.getKeyToIndexMap().get(obj)) != null) ? num.intValue() : i2;
    }
}
