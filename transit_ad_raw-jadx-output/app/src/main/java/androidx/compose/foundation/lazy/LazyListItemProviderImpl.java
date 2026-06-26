package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import java.util.Map;
import kj.l;
import kj.p;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "index", "Lkotlin/j;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "", "getContentType", "getKey", "", "headerIndexes", "Ljava/util/List;", "getHeaderIndexes", "()Ljava/util/List;", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "itemScope", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "getItemScope", "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "getItemCount", "()I", "itemCount", "", "getKeyToIndexMap", "()Ljava/util/Map;", "keyToIndexMap", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "intervals", "Lqj/f;", "nearestItemsRange", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Lqj/f;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyItemScopeImpl;Landroidx/compose/foundation/lazy/LazyListState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class LazyListItemProviderImpl implements LazyListItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    private final List<Integer> headerIndexes;
    private final LazyItemScopeImpl itemScope;

    public LazyListItemProviderImpl(IntervalList<LazyListIntervalContent> intervalList, f fVar, List<Integer> list, final LazyItemScopeImpl lazyItemScopeImpl, final LazyListState lazyListState) {
        m.h(intervalList, "intervals");
        m.h(fVar, "nearestItemsRange");
        m.h(list, "headerIndexes");
        m.h(lazyItemScopeImpl, "itemScope");
        m.h(lazyListState, "state");
        this.headerIndexes = list;
        this.itemScope = lazyItemScopeImpl;
        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(intervalList, fVar, ComposableLambdaKt.composableLambdaInstance(2070454083, true, new r<IntervalList.Interval<? extends LazyListIntervalContent>, Integer, Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((IntervalList.Interval<LazyListIntervalContent>) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return j.a;
            }

            @Composable
            public final void invoke(final IntervalList.Interval<LazyListIntervalContent> interval, int i2, Composer composer, int i3) {
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
                    ComposerKt.traceEventStart(2070454083, i4, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)");
                }
                final int startIndex = i2 - interval.getStartIndex();
                l<Integer, Object> key = interval.getValue().getKey();
                Object objInvoke = key != null ? key.invoke(Integer.valueOf(startIndex)) : null;
                LazyLayoutPinnedItemList pinnedItems = lazyListState.getPinnedItems();
                final LazyItemScopeImpl lazyItemScopeImpl2 = lazyItemScopeImpl;
                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(objInvoke, i2, pinnedItems, ComposableLambdaKt.composableLambda(composer, 1210565839, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.1.1
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
                            ComposerKt.traceEventStart(1210565839, i5, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyListItemProvider.kt:87)");
                        }
                        interval.getValue().getItem().invoke(lazyItemScopeImpl2, Integer.valueOf(startIndex), composer2, 0);
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
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i2, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1645068522);
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
                ComposerKt.traceEventStart(-1645068522, i4, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                LazyListItemProviderImpl.this.Item(i2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int index) {
        return this.$$delegate_0.getContentType(index);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public List<Integer> getHeaderIndexes() {
        return this.headerIndexes;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int index) {
        return this.$$delegate_0.getKey(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }
}
