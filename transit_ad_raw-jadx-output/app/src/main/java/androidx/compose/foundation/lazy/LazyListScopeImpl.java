package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyListScopeImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$Jb\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u0010\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScopeImpl;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "count", "Lkotlin/Function1;", "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "itemContent", "items", "(ILkj/l;Lkj/l;Lkj/r;)V", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lkj/q;)V", "stickyHeader", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "_intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "_headerIndexes", "Ljava/util/List;", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListScopeImpl implements LazyListScope {
    private List<Integer> _headerIndexes;
    private final MutableIntervalList<LazyListIntervalContent> _intervals;
    private final IntervalList<LazyListIntervalContent> intervals;

    public LazyListScopeImpl() {
        MutableIntervalList<LazyListIntervalContent> mutableIntervalList = new MutableIntervalList<>();
        this._intervals = mutableIntervalList;
        this.intervals = mutableIntervalList;
    }

    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        return list == null ? EmptyList.INSTANCE : list;
    }

    public final IntervalList<LazyListIntervalContent> getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final /* synthetic */ void item(Object obj, q qVar) {
        LazyListScope.CC.b(this, obj, qVar);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final /* synthetic */ void items(int i2, l lVar, r rVar) {
        LazyListScope.CC.d(this, i2, lVar, rVar);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(Object key, Object contentType, q<? super LazyItemScope, ? super Composer, ? super Integer, j> content) {
        m.h(content, "content");
        List arrayList = this._headerIndexes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(this._intervals.getSize()));
        item(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(final Object key, final Object contentType, final q<? super LazyItemScope, ? super Composer, ? super Integer, j> content) {
        m.h(content, "content");
        this._intervals.addInterval(1, new LazyListIntervalContent(key != null ? new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i2) {
                return key;
            }
        } : null, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.2
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
        }, ComposableLambdaKt.composableLambdaInstance(-735119482, true, new r<LazyItemScope, Integer, Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return j.a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                m.h(lazyItemScope, "$this$$receiver");
                if ((i3 & 14) == 0) {
                    i3 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if ((i3 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-735119482, i3, -1, "androidx.compose.foundation.lazy.LazyListScopeImpl.item.<anonymous> (LazyListScopeImpl.kt:55)");
                }
                content.invoke(lazyItemScope, composer, Integer.valueOf(i3 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, l<? super Integer, ? extends Object> key, l<? super Integer, ? extends Object> contentType, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, j> itemContent) {
        m.h(contentType, "contentType");
        m.h(itemContent, "itemContent");
        this._intervals.addInterval(count, new LazyListIntervalContent(key, contentType, itemContent));
    }
}
