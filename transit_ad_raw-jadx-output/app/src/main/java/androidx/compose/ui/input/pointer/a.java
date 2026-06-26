package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Size;
import kj.p;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    public static long a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.INSTANCE.m2663getZeroNHjbRc();
    }

    public static Object b(AwaitPointerEventScope awaitPointerEventScope, long j, p pVar, dj.c cVar) {
        return u(awaitPointerEventScope, j, pVar, cVar);
    }

    public static Object c(AwaitPointerEventScope awaitPointerEventScope, long j, p pVar, dj.c cVar) {
        return v(awaitPointerEventScope, j, pVar, cVar);
    }

    public static /* synthetic */ Object t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, dj.c cVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
    }

    public static /* synthetic */ <T> Object u(AwaitPointerEventScope awaitPointerEventScope, long j, p<? super AwaitPointerEventScope, ? super dj.c<? super T>, ? extends Object> pVar, dj.c<? super T> cVar) {
        return pVar.invoke(awaitPointerEventScope, cVar);
    }

    public static /* synthetic */ <T> Object v(AwaitPointerEventScope awaitPointerEventScope, long j, p<? super AwaitPointerEventScope, ? super dj.c<? super T>, ? extends Object> pVar, dj.c<? super T> cVar) {
        return pVar.invoke(awaitPointerEventScope, cVar);
    }
}
