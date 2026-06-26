package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kj.l;
import kj.p;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J$\u0010\u000f\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030!8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "index", "Lkotlin/j;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "", "getContentType", "getKey", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "getSpan-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J", "getSpan", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans", "()Z", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getItemCount", "()I", "itemCount", "", "getKeyToIndexMap", "()Ljava/util/Map;", "keyToIndexMap", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lqj/f;", "nearestItemsRange", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;ZLandroidx/compose/foundation/lazy/grid/LazyGridState;Lqj/f;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class LazyGridItemProviderImpl implements LazyGridItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    private final boolean hasCustomSpans;
    private final IntervalList<LazyGridIntervalContent> intervals;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridItemProviderImpl(IntervalList<LazyGridIntervalContent> intervalList, boolean z, final LazyGridState lazyGridState, f fVar) {
        m.h(intervalList, "intervals");
        m.h(lazyGridState, "state");
        m.h(fVar, "nearestItemsRange");
        this.intervals = intervalList;
        this.hasCustomSpans = z;
        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(intervalList, fVar, ComposableLambdaKt.composableLambdaInstance(-1961468361, true, new r<IntervalList.Interval<? extends LazyGridIntervalContent>, Integer, Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.1
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((IntervalList.Interval<LazyGridIntervalContent>) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return j.a;
            }

            @Composable
            public final void invoke(final IntervalList.Interval<LazyGridIntervalContent> interval, int i2, Composer composer, int i3) {
                int i4;
                m.h(interval, "interval");
                if ((i3 & 14) == 0) {
                    i4 = (composer.changed(interval) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i4 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1961468361, i4, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous> (LazyGridItemProvider.kt:89)");
                }
                final int startIndex = i2 - interval.getStartIndex();
                l<Integer, Object> key = interval.getValue().getKey();
                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i2, lazyGridState.getPinnedItems(), ComposableLambdaKt.composableLambda(composer, -269692885, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return j.a;
                    }

                    @Composable
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-269692885, i5, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyGridItemProvider.kt:95)");
                        }
                        interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3592);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i2, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1355196996);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355196996, i4, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
            }
            this.$$delegate_0.Item(i2, composerStartRestartGroup, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                LazyGridItemProviderImpl.this.Item(i2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int index) {
        return this.$$delegate_0.getContentType(index);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int index) {
        return this.$$delegate_0.getKey(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    /* JADX INFO: renamed from: getSpan-_-orMbw */
    public long mo629getSpan_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        m.h(lazyGridItemSpanScope, "$this$getSpan");
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i2);
        return ((GridItemSpan) interval.getValue().getSpan().invoke(lazyGridItemSpanScope, Integer.valueOf(i2 - interval.getStartIndex()))).getPackedValue();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
