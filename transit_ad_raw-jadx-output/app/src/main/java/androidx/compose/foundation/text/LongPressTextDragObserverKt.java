package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import dj.e;
import ej.c;
import kj.a;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/TextDragObserver;", "observer", "Lkotlin/j;", "detectDragGesturesAfterLongPressWithObserver", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Ldj/c;)Ljava/lang/Object;", "detectDownAndDragGesturesWithObserver", "detectPreDragGesturesWithObserver", "detectDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LongPressTextDragObserverKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super Job>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectPreDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutineSingletons) {
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

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend")
        public static final class C00492 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00492(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, dj.c<? super C00492> cVar) {
                super(2, cVar);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new C00492(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutineSingletons) {
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

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new C00492(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 3, (Object) null);
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super Job> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "invokeSuspend")
    public static final class C02672 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02672(TextDragObserver textDragObserver, dj.c<? super C02672> cVar) {
            super(2, cVar);
            this.$observer = textDragObserver;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C02672 c02672 = new C02672(this.$observer, cVar);
            c02672.L$0 = obj;
            return c02672;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[EDGE_INSN: B:31:0x0097->B:28:0x0097 BREAK  A[LOOP:0: B:18:0x0071->B:27:0x0094], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0062 -> B:17:0x0065). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r0 = r6.label
                r8 = 2
                r9 = 1
                if (r0 == 0) goto L30
                if (r0 == r9) goto L25
                if (r0 != r8) goto L1d
                java.lang.Object r0 = r6.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                java.lang.Object r1 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r17)
                r3 = r17
                r2 = r6
                goto L65
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                li.c.O(r17)
                r10 = r0
                r0 = r17
                goto L4a
            L30:
                li.c.O(r17)
                java.lang.Object r0 = r6.L$0
                r10 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r6.L$0 = r10
                r6.label = r9
                r0 = r10
                r3 = r16
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L4a
                return r7
            L4a:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                androidx.compose.foundation.text.TextDragObserver r1 = r6.$observer
                long r2 = r0.getPosition()
                r1.mo863onDownk4lQ0M(r2)
                r2 = r6
                r1 = r10
            L57:
                r2.L$0 = r1
                r2.L$1 = r0
                r2.label = r8
                r3 = 0
                java.lang.Object r3 = androidx.compose.ui.input.pointer.a.t(r1, r3, r2, r9, r3)
                if (r3 != r7) goto L65
                return r7
            L65:
                androidx.compose.ui.input.pointer.PointerEvent r3 = (androidx.compose.ui.input.pointer.PointerEvent) r3
                java.util.List r3 = r3.getChanges()
                int r4 = r3.size()
                r5 = 0
                r10 = r5
            L71:
                if (r10 >= r4) goto L97
                java.lang.Object r11 = r3.get(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                long r12 = r11.getId()
                long r14 = r0.getId()
                boolean r12 = androidx.compose.ui.input.pointer.PointerId.m4114equalsimpl0(r12, r14)
                if (r12 == 0) goto L8f
                boolean r11 = r11.getPressed()
                if (r11 == 0) goto L8f
                r11 = r9
                goto L90
            L8f:
                r11 = r5
            L90:
                if (r11 == 0) goto L94
                r5 = r9
                goto L97
            L94:
                int r10 = r10 + 1
                goto L71
            L97:
                if (r5 != 0) goto L57
                androidx.compose.foundation.text.TextDragObserver r0 = r2.$observer
                r0.onUp()
                kotlin.j r0 = kotlin.j.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt.C02672.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(pointerInputScope, textDragObserver, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, dj.c<? super j> cVar) {
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new l<Offset, j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m827invokek4lQ0M(((Offset) obj).getPackedValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m827invokek4lQ0M(long j) {
                textDragObserver.mo865onStartk4lQ0M(j);
            }
        }, new a<j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.3
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m828invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m828invoke() {
                textDragObserver.onStop();
            }
        }, new a<j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.4
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m829invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m829invoke() {
                textDragObserver.onCancel();
            }
        }, new p<PointerInputChange, Offset, j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.5
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m830invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).getPackedValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m830invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                m.h(pointerInputChange, "<anonymous parameter 0>");
                textDragObserver.mo864onDragk4lQ0M(j);
            }
        }, cVar);
        return objDetectDragGesturesAfterLongPress == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectDragGesturesAfterLongPress : j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, dj.c<? super j> cVar) {
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new l<Offset, j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m831invokek4lQ0M(((Offset) obj).getPackedValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m831invokek4lQ0M(long j) {
                textDragObserver.mo865onStartk4lQ0M(j);
            }
        }, new a<j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.3
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m832invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m832invoke() {
                textDragObserver.onStop();
            }
        }, new a<j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.4
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m833invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m833invoke() {
                textDragObserver.onCancel();
            }
        }, new p<PointerInputChange, Offset, j>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.5
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m834invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).getPackedValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m834invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                m.h(pointerInputChange, "<anonymous parameter 0>");
                textDragObserver.mo864onDragk4lQ0M(j);
            }
        }, cVar);
        return objDetectDragGestures == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectDragGestures : j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C02672(textDragObserver, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }
}
