package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadLayout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/LookaheadOnPlacedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "coordinates", "Lkotlin/j;", "onPlaced", "Lkotlin/Function2;", "callback", "Lkj/p;", "getCallback", "()Lkj/p;", "Lkotlin/Function0;", "rootCoordinates", "Lkj/a;", "getRootCoordinates", "()Lkj/a;", "<init>", "(Lkj/p;Lkj/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LookaheadOnPlacedModifier implements Modifier.Element {
    private final p<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, kotlin.j> callback;
    private final kj.a<LookaheadLayoutCoordinates> rootCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadOnPlacedModifier(p<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, kotlin.j> pVar, kj.a<? extends LookaheadLayoutCoordinates> aVar) {
        kotlin.jvm.internal.m.h(pVar, "callback");
        kotlin.jvm.internal.m.h(aVar, "rootCoordinates");
        this.callback = pVar;
        this.rootCoordinates = aVar;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(kj.l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(kj.l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final p<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, kotlin.j> getCallback() {
        return this.callback;
    }

    public final kj.a<LookaheadLayoutCoordinates> getRootCoordinates() {
        return this.rootCoordinates;
    }

    public final void onPlaced(LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        kotlin.jvm.internal.m.h(lookaheadLayoutCoordinates, "coordinates");
        this.callback.invoke(this.rootCoordinates.invoke(), lookaheadLayoutCoordinates);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
