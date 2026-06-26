package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kj.l;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0016¢\u0006\u0004\b\f\u0010\rJx\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkj/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILkj/l;Lkj/l;Lkj/l;Lkj/r;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridScopeImpl implements LazyStaggeredGridScope {
    private final MutableIntervalList<LazyStaggeredGridIntervalContent> intervals = new MutableIntervalList<>();

    public final MutableIntervalList<LazyStaggeredGridIntervalContent> getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(final Object key, final Object contentType, final StaggeredGridItemSpan span, final q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, j> content) {
        m.h(content, "content");
        items(1, key != null ? new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i2) {
                return key;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        } : null, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i2) {
                return contentType;
            }
        }, span != null ? new l<Integer, StaggeredGridItemSpan>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl$item$3$1
            {
                super(1);
            }

            public final StaggeredGridItemSpan invoke(int i2) {
                return span;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        } : null, ComposableLambdaKt.composableLambdaInstance(1700162468, true, new r<LazyStaggeredGridItemScope, Integer, Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return j.a;
            }

            @Composable
            public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
                m.h(lazyStaggeredGridItemScope, "$this$items");
                if ((i3 & 14) == 0) {
                    i3 |= composer.changed(lazyStaggeredGridItemScope) ? 4 : 2;
                }
                if ((i3 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1700162468, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.<anonymous> (LazyStaggeredGridScope.kt:38)");
                }
                content.invoke(lazyStaggeredGridItemScope, composer, Integer.valueOf(i3 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int count, l<? super Integer, ? extends Object> key, l<? super Integer, ? extends Object> contentType, l<? super Integer, StaggeredGridItemSpan> span, r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, j> itemContent) {
        m.h(contentType, "contentType");
        m.h(itemContent, "itemContent");
        this.intervals.addInterval(count, new LazyStaggeredGridIntervalContent(key, contentType, span, itemContent));
    }
}
