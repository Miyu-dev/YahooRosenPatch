package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\nR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/j;", "block", "Lkj/l;", "getBlock$ui_release", "()Lkj/l;", "setBlock$ui_release", "(Lkj/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DrawResult {
    public static final int $stable = 8;
    private l<? super ContentDrawScope, j> block;

    public DrawResult(l<? super ContentDrawScope, j> lVar) {
        m.h(lVar, "block");
        this.block = lVar;
    }

    public final l<ContentDrawScope, j> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(l<? super ContentDrawScope, j> lVar) {
        m.h(lVar, "<set-?>");
        this.block = lVar;
    }
}
