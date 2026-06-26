package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Dp;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b\u001a'\u0010\t\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0017\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "Lkotlin/j;", "debugLog", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", "index", "scrollOffset", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;IILdj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "MinimumDistance", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m5267constructorimpl(2500);
    private static final float BoundDistance = Dp.m5267constructorimpl(1500);
    private static final float MinimumDistance = Dp.m5267constructorimpl(50);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyAnimateScroll.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {137, 233}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2, LazyAnimateScrollScope lazyAnimateScrollScope, int i3, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$index = i2;
            this.$this_animateScrollToItem = lazyAnimateScrollScope;
            this.$scrollOffset = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z, LazyAnimateScrollScope lazyAnimateScrollScope, int i2, int i3) {
            if (z) {
                if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i2 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i2 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i3)) {
                    return false;
                }
            } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i2 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i2 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i3)) {
                return false;
            }
            return true;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(ScrollScope scrollScope, dj.c<? super j> cVar) {
            return create(scrollScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[Catch: ItemFoundInScroll -> 0x01c2, TryCatch #4 {ItemFoundInScroll -> 0x01c2, blocks: (B:28:0x00ca, B:30:0x00ce, B:32:0x00d6, B:43:0x00fb, B:50:0x0141, B:54:0x014e), top: B:94:0x00ca }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[Catch: ItemFoundInScroll -> 0x01ba, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ItemFoundInScroll -> 0x01ba, blocks: (B:61:0x01af, B:35:0x00e8), top: B:90:0x01af }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x022d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01a5 -> B:12:0x0040). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 589
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object animateScrollToItem(LazyAnimateScrollScope lazyAnimateScrollScope, int i2, int i3, dj.c<? super j> cVar) {
        Object objScroll = lazyAnimateScrollScope.scroll(new AnonymousClass2(i2, lazyAnimateScrollScope, i3, null), cVar);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : j.a;
    }

    private static final void debugLog(kj.a<String> aVar) {
    }
}
