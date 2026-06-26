package androidx.compose.ui.draw;

import androidx.appcompat.widget.s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/draw/DrawContentCacheModifier;", "Landroidx/compose/ui/draw/DrawCacheModifier;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "params", "Lkotlin/j;", "onBuildCache", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/draw/CacheDrawScope;", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/DrawResult;", "component2", "cacheDrawScope", "onBuildDrawCache", "copy", "", "toString", "Landroidx/compose/ui/draw/CacheDrawScope;", "getCacheDrawScope", "()Landroidx/compose/ui/draw/CacheDrawScope;", "Lkj/l;", "getOnBuildDrawCache", "()Lkj/l;", "<init>", "(Landroidx/compose/ui/draw/CacheDrawScope;Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class DrawContentCacheModifier implements DrawCacheModifier {
    private final CacheDrawScope cacheDrawScope;
    private final l<CacheDrawScope, DrawResult> onBuildDrawCache;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawContentCacheModifier(CacheDrawScope cacheDrawScope, l<? super CacheDrawScope, DrawResult> lVar) {
        m.h(cacheDrawScope, "cacheDrawScope");
        m.h(lVar, "onBuildDrawCache");
        this.cacheDrawScope = cacheDrawScope;
        this.onBuildDrawCache = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawContentCacheModifier copy$default(DrawContentCacheModifier drawContentCacheModifier, CacheDrawScope cacheDrawScope, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cacheDrawScope = drawContentCacheModifier.cacheDrawScope;
        }
        if ((i2 & 2) != 0) {
            lVar = drawContentCacheModifier.onBuildDrawCache;
        }
        return drawContentCacheModifier.copy(cacheDrawScope, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    public final l<CacheDrawScope, DrawResult> component2() {
        return this.onBuildDrawCache;
    }

    public final DrawContentCacheModifier copy(CacheDrawScope cacheDrawScope, l<? super CacheDrawScope, DrawResult> lVar) {
        m.h(cacheDrawScope, "cacheDrawScope");
        m.h(lVar, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope, lVar);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        m.h(contentDrawScope, "<this>");
        DrawResult drawResult = this.cacheDrawScope.getDrawResult();
        m.e(drawResult);
        drawResult.getBlock$ui_release().invoke(contentDrawScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawContentCacheModifier)) {
            return false;
        }
        DrawContentCacheModifier drawContentCacheModifier = (DrawContentCacheModifier) other;
        return m.c(this.cacheDrawScope, drawContentCacheModifier.cacheDrawScope) && m.c(this.onBuildDrawCache, drawContentCacheModifier.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    public final l<CacheDrawScope, DrawResult> getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    public int hashCode() {
        return this.onBuildDrawCache.hashCode() + (this.cacheDrawScope.hashCode() * 31);
    }

    @Override // androidx.compose.ui.draw.DrawCacheModifier
    public void onBuildCache(BuildDrawCacheParams buildDrawCacheParams) {
        m.h(buildDrawCacheParams, "params");
        CacheDrawScope cacheDrawScope = this.cacheDrawScope;
        cacheDrawScope.setCacheParams$ui_release(buildDrawCacheParams);
        cacheDrawScope.setDrawResult$ui_release(null);
        this.onBuildDrawCache.invoke(cacheDrawScope);
        if (cacheDrawScope.getDrawResult() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrawContentCacheModifier(cacheDrawScope=");
        sb.append(this.cacheDrawScope);
        sb.append(", onBuildDrawCache=");
        return s.h(sb, this.onBuildDrawCache, ')');
    }
}
