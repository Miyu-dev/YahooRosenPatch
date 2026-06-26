package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kj.a;
import kj.l;
import kj.p;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/j;", "content", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "rememberStaggeredGridItemProvider", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkj/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyStaggeredGridItemProviderKt {
    @Composable
    @ExperimentalFoundationApi
    public static final LazyStaggeredGridItemProvider rememberStaggeredGridItemProvider(final LazyStaggeredGridState lazyStaggeredGridState, l<? super LazyStaggeredGridScope, j> lVar, Composer composer, int i2) {
        m.h(lazyStaggeredGridState, "state");
        m.h(lVar, "content");
        composer.startReplaceableGroup(2039920307);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2039920307, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:35)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i2 >> 3) & 14);
        final State<f> stateRememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState(new a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m698invoke() {
                return Integer.valueOf(lazyStaggeredGridState.getFirstVisibleItemIndex());
            }
        }, new a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$2
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m699invoke() {
                return 90;
            }
        }, new a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$3
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m700invoke() {
                return Integer.valueOf(ComposerKt.invocationKey);
            }
        }, composer, 432);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(lazyStaggeredGridState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1(SnapshotStateKt.derivedStateOf(new a<LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1.AnonymousClass1>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                public static final class AnonymousClass1 implements LazyLayoutItemProvider, LazyStaggeredGridItemProvider {
                    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
                    private final LazyStaggeredGridSpanProvider spanProvider;

                    public AnonymousClass1(LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl, State<f> state, final LazyStaggeredGridState lazyStaggeredGridState) {
                        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(lazyStaggeredGridScopeImpl.getIntervals(), state.getValue(), ComposableLambdaKt.composableLambdaInstance(-364721306, true, new r<IntervalList.Interval<? extends LazyStaggeredGridIntervalContent>, Integer, Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1.1
                            {
                                super(4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((IntervalList.Interval<LazyStaggeredGridIntervalContent>) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                return j.a;
                            }

                            @Composable
                            public final void invoke(final IntervalList.Interval<LazyStaggeredGridIntervalContent> interval, int i2, Composer composer, int i3) {
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
                                    ComposerKt.traceEventStart(-364721306, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous> (LazyStaggeredGridItemProvider.kt:51)");
                                }
                                final int startIndex = i2 - interval.getStartIndex();
                                l<Integer, Object> key = interval.getValue().getKey();
                                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i2, lazyStaggeredGridState.getPinnedItems(), ComposableLambdaKt.composableLambda(composer, 1181040114, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1.1.1
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
                                            ComposerKt.traceEventStart(1181040114, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous>.<anonymous> (LazyStaggeredGridItemProvider.kt:57)");
                                        }
                                        interval.getValue().getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer2, 6);
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
                        this.spanProvider = new LazyStaggeredGridSpanProvider(lazyStaggeredGridScopeImpl.getIntervals());
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @Composable
                    public void Item(int i2, Composer composer, int i3) {
                        composer.startReplaceableGroup(1163616889);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1163616889, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                        }
                        this.$$delegate_0.Item(i2, composer, i3 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public Object getContentType(int i2) {
                        return this.$$delegate_0.getContentType(i2);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public int getItemCount() {
                        return this.$$delegate_0.getItemCount();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public Object getKey(int i2) {
                        return this.$$delegate_0.getKey(i2);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public Map<Object, Integer> getKeyToIndexMap() {
                        return this.$$delegate_0.getKeyToIndexMap();
                    }

                    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
                    public LazyStaggeredGridSpanProvider getSpanProvider() {
                        return this.spanProvider;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AnonymousClass1 m697invoke() {
                    LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl = new LazyStaggeredGridScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(lazyStaggeredGridScopeImpl);
                    return new AnonymousClass1(lazyStaggeredGridScopeImpl, stateRememberLazyNearestItemsRangeState, lazyStaggeredGridState);
                }
            }));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1 lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1 = (LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1;
    }
}
