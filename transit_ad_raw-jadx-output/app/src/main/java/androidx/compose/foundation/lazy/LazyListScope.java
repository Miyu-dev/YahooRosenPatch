package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kj.l;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J@\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ4\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\t\u0010\u000bJf\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JN\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0012J@\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H'¢\u0006\u0004\b\u0013\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lkj/q;)V", "(Ljava/lang/Object;Lkj/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILkj/l;Lkj/l;Lkj/r;)V", "(ILkj/l;Lkj/r;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 8, 0})
public interface LazyListScope {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    public final /* synthetic */ class CC {
        public static void a(LazyListScope lazyListScope, Object obj, Object obj2, q qVar) {
            m.h(qVar, "content");
            throw new IllegalStateException("The method is not implemented".toString());
        }

        public static /* synthetic */ void b(LazyListScope lazyListScope, Object obj, q qVar) {
            m.h(qVar, "content");
            lazyListScope.item(obj, null, qVar);
        }

        public static void c(LazyListScope lazyListScope, int i2, l lVar, l lVar2, r rVar) {
            m.h(lVar2, "contentType");
            m.h(rVar, "itemContent");
            throw new IllegalStateException("The method is not implemented".toString());
        }

        public static /* synthetic */ void d(LazyListScope lazyListScope, int i2, l lVar, r rVar) {
            m.h(rVar, "itemContent");
            lazyListScope.items(i2, lVar, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
                public final Object invoke(int i3) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, rVar);
        }

        public static /* synthetic */ void i(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.item(obj, obj2, qVar);
        }

        public static /* synthetic */ void j(LazyListScope lazyListScope, Object obj, q qVar, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            lazyListScope.item(obj, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void k(LazyListScope lazyListScope, int i2, l lVar, l lVar2, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            if ((i3 & 4) != 0) {
                lVar2 = new l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                    public final Void invoke(int i4) {
                        return null;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke(((Number) obj2).intValue());
                    }
                };
            }
            lazyListScope.items(i2, lVar, lVar2, rVar);
        }

        public static /* synthetic */ void l(LazyListScope lazyListScope, int i2, l lVar, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            lazyListScope.items(i2, lVar, rVar);
        }

        public static /* synthetic */ void m(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.stickyHeader(obj, obj2, qVar);
        }
    }

    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, q<? super LazyItemScope, ? super Composer, ? super Integer, j> qVar) {
            m.h(qVar, "content");
            CC.a(lazyListScope, obj, obj2, qVar);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i2, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, j> rVar) {
            m.h(lVar2, "contentType");
            m.h(rVar, "itemContent");
            CC.c(lazyListScope, i2, lVar, lVar2, rVar);
        }

        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, q qVar) {
            m.h(qVar, "content");
            CC.b(lazyListScope, obj, qVar);
        }

        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i2, l lVar, r rVar) {
            m.h(rVar, "itemContent");
            CC.d(lazyListScope, i2, lVar, rVar);
        }
    }

    void item(Object key, Object contentType, q<? super LazyItemScope, ? super Composer, ? super Integer, j> content);

    /* synthetic */ void item(Object key, q content);

    void items(int count, l<? super Integer, ? extends Object> key, l<? super Integer, ? extends Object> contentType, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, j> itemContent);

    /* synthetic */ void items(int count, l key, r itemContent);

    @ExperimentalFoundationApi
    void stickyHeader(Object key, Object contentType, q<? super LazyItemScope, ? super Composer, ? super Integer, j> content);
}
