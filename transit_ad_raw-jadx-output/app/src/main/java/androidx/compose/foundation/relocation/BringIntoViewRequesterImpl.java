package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import ej.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/j;", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterModifier;", "modifiers", "Landroidx/compose/runtime/collection/MutableVector;", "getModifiers", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequesterModifier> modifiers = new MutableVector<>(new BringIntoViewRequesterModifier[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1, reason: invalid class name */
    /* JADX INFO: compiled from: BringIntoViewRequester.kt */
    @c(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {126}, m = "bringIntoView")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BringIntoViewRequesterImpl.this.bringIntoView(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bringIntoView(androidx.compose.ui.geometry.Rect r8, dj.c<? super kotlin.j> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.geometry.Rect r5 = (androidx.compose.ui.geometry.Rect) r5
            li.c.O(r9)
            r9 = r5
            goto L65
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            li.c.O(r9)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterModifier> r9 = r7.modifiers
            int r2 = r9.getSize()
            if (r2 <= 0) goto L68
            java.lang.Object[] r9 = r9.getContent()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L50:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.BringIntoViewRequesterModifier r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterModifier) r5
            r0.L$0 = r9
            r0.L$1 = r4
            r0.I$0 = r2
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r5 = r5.bringIntoView(r9, r0)
            if (r5 != r1) goto L65
            return r1
        L65:
            int r8 = r8 + r3
            if (r8 < r2) goto L50
        L68:
            kotlin.j r8 = kotlin.j.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, dj.c):java.lang.Object");
    }

    public final MutableVector<BringIntoViewRequesterModifier> getModifiers() {
        return this.modifiers;
    }
}
