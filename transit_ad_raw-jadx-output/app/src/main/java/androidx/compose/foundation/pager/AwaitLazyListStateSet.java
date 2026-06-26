package androidx.compose.foundation.pager;

import androidx.appcompat.R;
import dj.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0002R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "", "Lkotlin/j;", "waitFinalLazyListSetting", "(Ldj/c;)Ljava/lang/Object;", "onStateLoaded", "Ldj/c;", "continuation", "Ldj/c;", "", "stateWasLoaded", "Z", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class AwaitLazyListStateSet {
    private c<? super j> continuation;
    private boolean stateWasLoaded;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @ej.c(c = "androidx.compose.foundation.pager.AwaitLazyListStateSet", f = "PagerState.kt", l = {418}, m = "waitFinalLazyListSetting")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitLazyListStateSet.this.waitFinalLazyListSetting(this);
        }
    }

    public final void onStateLoaded() {
        if (this.stateWasLoaded) {
            return;
        }
        this.stateWasLoaded = true;
        c<? super j> cVar = this.continuation;
        if (cVar != null) {
            cVar.resumeWith(Result.constructor-impl(j.a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitFinalLazyListSetting(dj.c<? super kotlin.j> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.pager.AwaitLazyListStateSet.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = new androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            dj.c r1 = (dj.c) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.AwaitLazyListStateSet r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet) r0
            li.c.O(r5)
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            li.c.O(r5)
            boolean r5 = r4.stateWasLoaded
            if (r5 != 0) goto L64
            dj.c<? super kotlin.j> r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            dj.f r2 = new dj.f
            dj.c r0 = li.c.D(r0)
            r2.<init>(r0)
            r4.continuation = r2
            java.lang.Object r0 = r2.a()
            if (r0 != r1) goto L58
            return r1
        L58:
            r1 = r5
        L59:
            if (r1 == 0) goto L64
            kotlin.j r5 = kotlin.j.a
            java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
            r1.resumeWith(r5)
        L64:
            kotlin.j r5 = kotlin.j.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting(dj.c):java.lang.Object");
    }
}
