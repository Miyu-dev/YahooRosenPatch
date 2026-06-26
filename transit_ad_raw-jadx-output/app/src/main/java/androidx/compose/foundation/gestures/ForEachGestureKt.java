package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a;\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a\u0017\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\r\u001a;\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function2;", "Ldj/c;", "Lkotlin/j;", "", "block", "forEachGesture", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkj/p;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "allPointersUp", "awaitAllPointersUp", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Ldj/c;)Ljava/lang/Object;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Ldj/c;)Ljava/lang/Object;", "awaitEachGesture", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ForEachGestureKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2, reason: invalid class name */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope, (dj.c<? super j>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3, reason: invalid class name */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(dj.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) null, (dj.c<? super j>) this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "invokeSuspend")
    public static final class C01812 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ p<AwaitPointerEventScope, dj.c<? super j>, Object> $block;
        final /* synthetic */ dj.e $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01812(dj.e eVar, p<? super AwaitPointerEventScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super C01812> cVar) {
            super(2, cVar);
            this.$currentContext = eVar;
            this.$block = pVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01812 c01812 = new C01812(this.$currentContext, this.$block, cVar);
            c01812.L$0 = obj;
            return c01812;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0060 -> B:20:0x003d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0081 -> B:20:0x003d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L35
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r9)
                goto L26
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r9)     // Catch: java.util.concurrent.CancellationException -> L31
            L26:
                r9 = r1
                goto L3c
            L28:
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r9)     // Catch: java.util.concurrent.CancellationException -> L31
                r9 = r8
                goto L55
            L31:
                r9 = move-exception
                r5 = r1
                r1 = r8
                goto L6e
            L35:
                li.c.O(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            L3c:
                r1 = r8
            L3d:
                dj.e r5 = r1.$currentContext
                boolean r5 = kotlinx.coroutines.JobKt.isActive(r5)
                if (r5 == 0) goto L84
                kj.p<androidx.compose.ui.input.pointer.AwaitPointerEventScope, dj.c<? super kotlin.j>, java.lang.Object> r5 = r1.$block     // Catch: java.util.concurrent.CancellationException -> L6a
                r1.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L6a
                r1.label = r4     // Catch: java.util.concurrent.CancellationException -> L6a
                java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6a
                if (r5 != r0) goto L52
                return r0
            L52:
                r7 = r1
                r1 = r9
                r9 = r7
            L55:
                r9.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L64
                r9.label = r3     // Catch: java.util.concurrent.CancellationException -> L64
                java.lang.Object r5 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L64
                if (r5 != r0) goto L60
                return r0
            L60:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L3d
            L64:
                r5 = move-exception
                r7 = r1
                r1 = r9
                r9 = r5
                r5 = r7
                goto L6e
            L6a:
                r5 = move-exception
                r7 = r5
                r5 = r9
                r9 = r7
            L6e:
                dj.e r6 = r1.$currentContext
                boolean r6 = kotlinx.coroutines.JobKt.isActive(r6)
                if (r6 == 0) goto L83
                r1.L$0 = r5
                r1.label = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r5, r1)
                if (r9 != r0) goto L81
                return r0
            L81:
                r9 = r5
                goto L3d
            L83:
                throw r9
            L84:
                kotlin.j r9 = kotlin.j.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.C01812.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1, reason: invalid class name */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {R.styleable.AppCompatTheme_checkboxStyle, R.styleable.AppCompatTheme_colorBackgroundFloating, R.styleable.AppCompatTheme_colorError}, m = "forEachGesture")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        m.h(awaitPointerEventScope, "<this>");
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (changes.get(i2).getPressed()) {
                z = true;
                break;
            }
            i2++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r0.L$0 = r7;
        r0.label = 1;
        r8 = r7.awaitPointerEvent(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r4 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return kotlin.j.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:19:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, dj.c<? super kotlin.j> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            li.c.O(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            li.c.O(r8)
            boolean r8 = allPointersUp(r7)
            if (r8 != 0) goto L6a
        L3c:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r8 = r8.getChanges()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L65
            r4 = r3
            goto L68
        L65:
            int r5 = r5 + 1
            goto L55
        L68:
            if (r4 != 0) goto L3c
        L6a:
            kotlin.j r7 = kotlin.j.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, dj.c):java.lang.Object");
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, p<? super AwaitPointerEventScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C01812(cVar.getContext(), pVar, null), cVar);
        return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : j.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008f -> B:18:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a9 -> B:18:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope r8, kj.p<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super dj.c<? super kotlin.j>, ? extends java.lang.Object> r9, dj.c<? super kotlin.j> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L65
            if (r2 == r5) goto L53
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.L$2
            dj.e r8 = (dj.e) r8
            java.lang.Object r9 = r0.L$1
            kj.p r9 = (kj.p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            li.c.O(r10)
            goto L50
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.L$2
            dj.e r8 = (dj.e) r8
            java.lang.Object r9 = r0.L$1
            kj.p r9 = (kj.p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            li.c.O(r10)     // Catch: java.util.concurrent.CancellationException -> L63
        L50:
            r10 = r8
            r8 = r2
            goto L6c
        L53:
            java.lang.Object r8 = r0.L$2
            dj.e r8 = (dj.e) r8
            java.lang.Object r9 = r0.L$1
            kj.p r9 = (kj.p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            li.c.O(r10)     // Catch: java.util.concurrent.CancellationException -> L63
            goto L83
        L63:
            r10 = move-exception
            goto L97
        L65:
            li.c.O(r10)
            dj.e r10 = r0.getContext()
        L6c:
            boolean r2 = kotlinx.coroutines.JobKt.isActive(r10)
            if (r2 == 0) goto Lad
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L92
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L92
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L92
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L92
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L92
            if (r2 != r1) goto L81
            return r1
        L81:
            r2 = r8
            r8 = r10
        L83:
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L63
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L63
            r0.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L63
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L63
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L63
            if (r10 != r1) goto L50
            return r1
        L92:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L97:
            boolean r6 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r6 == 0) goto Lac
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L50
            return r1
        Lac:
            throw r10
        Lad:
            kotlin.j r8 = kotlin.j.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, kj.p, dj.c):java.lang.Object");
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass2(null), cVar);
        return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : j.a;
    }
}
