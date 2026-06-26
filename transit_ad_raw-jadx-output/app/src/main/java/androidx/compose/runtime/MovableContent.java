package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "Lkj/q;", "getContent", "()Lkj/q;", "<init>", "(Lkj/q;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final q<P, Composer, Integer, j> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(q<? super P, ? super Composer, ? super Integer, j> qVar) {
        m.h(qVar, "content");
        this.content = qVar;
    }

    public final q<P, Composer, Integer, j> getContent() {
        return this.content;
    }
}
