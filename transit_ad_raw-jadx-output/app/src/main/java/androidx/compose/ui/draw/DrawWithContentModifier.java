package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\r\u0010\fJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/j;", "draw", "Lkotlin/Function1;", "onDraw", "Lkj/l;", "getOnDraw", "()Lkj/l;", "setOnDraw", "(Lkj/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    private l<? super ContentDrawScope, j> onDraw;

    public DrawWithContentModifier(l<? super ContentDrawScope, j> lVar) {
        m.h(lVar, "onDraw");
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        m.h(contentDrawScope, "<this>");
        this.onDraw.invoke(contentDrawScope);
    }

    public final l<ContentDrawScope, j> getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.a.a(this);
    }

    public final void setOnDraw(l<? super ContentDrawScope, j> lVar) {
        m.h(lVar, "<set-?>");
        this.onDraw = lVar;
    }
}
