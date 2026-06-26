package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kj.l;
import kj.p;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGridScopeImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JU\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0081\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u001d\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R)\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lkj/l;Ljava/lang/Object;Lkj/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILkj/l;Lkj/p;Lkj/l;Lkj/r;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals$foundation_release", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "DefaultSpan", "Lkj/p;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridScopeImpl implements LazyGridScope {
    private boolean hasCustomSpans;
    private final MutableIntervalList<LazyGridIntervalContent> intervals = new MutableIntervalList<>();
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new p<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$DefaultSpan$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m593boximpl(m642invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m642invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            m.h(lazyGridItemSpanScope, "$this$null");
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };

    /* JADX INFO: renamed from: getHasCustomSpans$foundation_release, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final MutableIntervalList<LazyGridIntervalContent> getIntervals$foundation_release() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(final Object key, final l<? super LazyGridItemSpanScope, GridItemSpan> span, final Object contentType, final q<? super LazyGridItemScope, ? super Composer, ? super Integer, j> content) {
        m.h(content, "content");
        this.intervals.addInterval(1, new LazyGridIntervalContent(key != null ? new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$1$1
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
        } : null, span != null ? new p<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return GridItemSpan.m593boximpl(m643invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
            }

            /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m643invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
                m.h(lazyGridItemSpanScope, "$this$null");
                return ((GridItemSpan) span.invoke(lazyGridItemSpanScope)).getPackedValue();
            }
        } : this.DefaultSpan, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.3
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
        }, ComposableLambdaKt.composableLambdaInstance(-1504808184, true, new r<LazyGridItemScope, Integer, Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return j.a;
            }

            @Composable
            public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
                m.h(lazyGridItemScope, "$this$$receiver");
                if ((i3 & 14) == 0) {
                    i3 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if ((i3 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1504808184, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
                }
                content.invoke(lazyGridItemScope, composer, Integer.valueOf(i3 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int count, l<? super Integer, ? extends Object> key, p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, l<? super Integer, ? extends Object> contentType, r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, j> itemContent) {
        m.h(contentType, "contentType");
        m.h(itemContent, "itemContent");
        this.intervals.addInterval(count, new LazyGridIntervalContent(key, span == null ? this.DefaultSpan : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z) {
        this.hasCustomSpans = z;
    }
}
