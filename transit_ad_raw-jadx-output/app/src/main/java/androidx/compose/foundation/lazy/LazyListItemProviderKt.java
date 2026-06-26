package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/j;", "content", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "rememberLazyListItemProvider", "(Landroidx/compose/foundation/lazy/LazyListState;Lkj/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/LazyListItemProvider;", "", "NearestItemsSlidingWindowSize", "I", "NearestItemsExtraItemCount", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyListItemProviderKt {
    private static final int NearestItemsExtraItemCount = 100;
    private static final int NearestItemsSlidingWindowSize = 30;

    @Composable
    @ExperimentalFoundationApi
    public static final LazyListItemProvider rememberLazyListItemProvider(final LazyListState lazyListState, l<? super LazyListScope, j> lVar, Composer composer, int i2) {
        m.h(lazyListState, "state");
        m.h(lVar, "content");
        composer.startReplaceableGroup(1939491467);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1939491467, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider (LazyListItemProvider.kt:39)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i2 >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(lazyListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new kj.a<Integer>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Integer m570invoke() {
                    return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final State<f> stateRememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState((kj.a) objRememberedValue, new kj.a<Integer>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$2
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m571invoke() {
                return 30;
            }
        }, new kj.a<Integer>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$3
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m572invoke() {
                return 100;
            }
        }, composer, 432);
        composer.startReplaceableGroup(511388516);
        boolean zChanged2 = composer.changed(stateRememberLazyNearestItemsRangeState) | composer.changed(lazyListState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            final LazyItemScopeImpl lazyItemScopeImpl = new LazyItemScopeImpl();
            objRememberedValue2 = new LazyListItemProviderKt$rememberLazyListItemProvider$1$1(SnapshotStateKt.derivedStateOf(new kj.a<LazyListItemProviderImpl>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final LazyListItemProviderImpl m569invoke() {
                    LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(lazyListScopeImpl);
                    return new LazyListItemProviderImpl(lazyListScopeImpl.getIntervals(), stateRememberLazyNearestItemsRangeState.getValue(), lazyListScopeImpl.getHeaderIndexes(), lazyItemScopeImpl, lazyListState);
                }
            }));
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        LazyListItemProviderKt$rememberLazyListItemProvider$1$1 lazyListItemProviderKt$rememberLazyListItemProvider$1$1 = (LazyListItemProviderKt$rememberLazyListItemProvider$1$1) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListItemProviderKt$rememberLazyListItemProvider$1$1;
    }
}
