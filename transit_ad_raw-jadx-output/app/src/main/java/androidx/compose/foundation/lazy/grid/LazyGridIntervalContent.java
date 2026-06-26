package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import kj.l;
import kj.p;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGridScopeImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u001d\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\t¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR,\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR.\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\t¢\u0006\u0002\b\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Lkotlin/Function1;", "", "", "key", "Lkj/l;", "getKey", "()Lkj/l;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "Lkj/p;", "getSpan", "()Lkj/p;", "type", "getType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "item", "Lkj/r;", "getItem", "()Lkj/r;", "<init>", "(Lkj/l;Lkj/p;Lkj/l;Lkj/r;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridIntervalContent implements LazyLayoutIntervalContent {
    private final r<LazyGridItemScope, Integer, Composer, Integer, j> item;
    private final l<Integer, Object> key;
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> span;
    private final l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridIntervalContent(l<? super Integer, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, j> rVar) {
        m.h(pVar, "span");
        m.h(lVar2, "type");
        m.h(rVar, "item");
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    public final r<LazyGridItemScope, Integer, Composer, Integer, j> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public l<Integer, Object> getKey() {
        return this.key;
    }

    public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public l<Integer, Object> getType() {
        return this.type;
    }
}
