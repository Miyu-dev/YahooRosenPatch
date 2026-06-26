package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import kj.l;
import kj.r;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyListScopeImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BR\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR.\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Lkotlin/Function1;", "", "", "key", "Lkj/l;", "getKey", "()Lkj/l;", "type", "getType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "item", "Lkj/r;", "getItem", "()Lkj/r;", "<init>", "(Lkj/l;Lkj/l;Lkj/r;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListIntervalContent implements LazyLayoutIntervalContent {
    private final r<LazyItemScope, Integer, Composer, Integer, j> item;
    private final l<Integer, Object> key;
    private final l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListIntervalContent(l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, j> rVar) {
        m.h(lVar2, "type");
        m.h(rVar, "item");
        this.key = lVar;
        this.type = lVar2;
        this.item = rVar;
    }

    public final r<LazyItemScope, Integer, Composer, Integer, j> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public l<Integer, Object> getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public l<Integer, Object> getType() {
        return this.type;
    }
}
