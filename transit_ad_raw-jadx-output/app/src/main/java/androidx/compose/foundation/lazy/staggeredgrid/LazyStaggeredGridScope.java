package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kj.l;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.j;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@LazyStaggeredGridScopeMarker
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH'¢\u0006\u0004\b\u000b\u0010\fJ~\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\tH&¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkj/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILkj/l;Lkj/l;Lkj/l;Lkj/r;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0})
public interface LazyStaggeredGridScope {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            if ((i2 & 4) != 0) {
                staggeredGridItemSpan = null;
            }
            lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(LazyStaggeredGridScope lazyStaggeredGridScope, int i2, l lVar, l lVar2, l lVar3, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            l lVar4 = (i3 & 2) != 0 ? null : lVar;
            if ((i3 & 4) != 0) {
                lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
                    public final Void invoke(int i4) {
                        return null;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke(((Number) obj2).intValue());
                    }
                };
            }
            lazyStaggeredGridScope.items(i2, lVar4, lVar2, (i3 & 8) != 0 ? null : lVar3, rVar);
        }
    }

    @ExperimentalFoundationApi
    void item(Object key, Object contentType, StaggeredGridItemSpan span, q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, j> content);

    void items(int count, l<? super Integer, ? extends Object> key, l<? super Integer, ? extends Object> contentType, l<? super Integer, StaggeredGridItemSpan> span, r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, j> itemContent);
}
