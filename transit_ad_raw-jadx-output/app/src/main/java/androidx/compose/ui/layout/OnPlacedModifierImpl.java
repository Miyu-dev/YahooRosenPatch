package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedModifierImpl;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lkotlin/j;", "onPlaced", "Lkotlin/Function1;", "callback", "Lkj/l;", "getCallback", "()Lkj/l;", "setCallback", "(Lkj/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
final class OnPlacedModifierImpl extends Modifier.Node implements LayoutAwareModifierNode {
    private kj.l<? super LayoutCoordinates, kotlin.j> callback;

    public OnPlacedModifierImpl(kj.l<? super LayoutCoordinates, kotlin.j> lVar) {
        kotlin.jvm.internal.m.h(lVar, "callback");
        this.callback = lVar;
    }

    public final kj.l<LayoutCoordinates, kotlin.j> getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final /* synthetic */ void onLookaheadPlaced(LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        androidx.compose.ui.node.b.a(this, lookaheadLayoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.m.h(layoutCoordinates, "coordinates");
        this.callback.invoke(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public final /* synthetic */ void mo4263onRemeasuredozmzZPI(long j) {
        androidx.compose.ui.node.b.c(this, j);
    }

    public final void setCallback(kj.l<? super LayoutCoordinates, kotlin.j> lVar) {
        kotlin.jvm.internal.m.h(lVar, "<set-?>");
        this.callback = lVar;
    }
}
