package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import dj.e;
import ej.c;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: ClickableText.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@c(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", f = "ClickableText.kt", l = {174}, m = "invokeSuspend")
public final class ClickableTextKt$ClickableText$pointerInputModifier$1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ l<Integer, j> $onClick;
    final /* synthetic */ l<Integer, j> $onHover;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @c(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", l = {165}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ l<Integer, j> $onHover;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PointerInputScope pointerInputScope, l<? super Integer, j> lVar, MutableState<TextLayoutResult> mutableState, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$onHover = lVar;
            this.$layoutResult = mutableState;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$onHover, this.$layoutResult, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                PointerEventPass pointerEventPass = PointerEventPass.Main;
                final l<Integer, j> lVar = this.$onHover;
                final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
                l<Offset, j> lVar2 = new l<Offset, j>() { // from class: androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m795invokek4lQ0M(((Offset) obj2).getPackedValue());
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m795invokek4lQ0M(long j) {
                        Integer numClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(mutableState, j);
                        if (m.c(objectRef.element, numClickableText_03UYbkw$getOffset)) {
                            return;
                        }
                        objectRef.element = numClickableText_03UYbkw$getOffset;
                        lVar.invoke(numClickableText_03UYbkw$getOffset);
                    }
                };
                this.label = 1;
                if (PointerMoveDetectorKt.detectMoves(pointerInputScope, pointerEventPass, lVar2, this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableTextKt$ClickableText$pointerInputModifier$1(CoroutineScope coroutineScope, l<? super Integer, j> lVar, MutableState<TextLayoutResult> mutableState, l<? super Integer, j> lVar2, dj.c<? super ClickableTextKt$ClickableText$pointerInputModifier$1> cVar) {
        super(2, cVar);
        this.$coroutineScope = coroutineScope;
        this.$onHover = lVar;
        this.$layoutResult = mutableState;
        this.$onClick = lVar2;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        ClickableTextKt$ClickableText$pointerInputModifier$1 clickableTextKt$ClickableText$pointerInputModifier$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1(this.$coroutineScope, this.$onHover, this.$layoutResult, this.$onClick, cVar);
        clickableTextKt$ClickableText$pointerInputModifier$1.L$0 = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
        return create(pointerInputScope, cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            BuildersKt.launch$default(this.$coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(pointerInputScope, this.$onHover, this.$layoutResult, null), 3, (Object) null);
            final l<Integer, j> lVar = this.$onClick;
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            l<Offset, j> lVar2 = new l<Offset, j>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m796invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m796invokek4lQ0M(long j) {
                    Integer numClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(mutableState, j);
                    if (numClickableText_03UYbkw$getOffset != null) {
                        lVar.invoke(numClickableText_03UYbkw$getOffset);
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, lVar2, this, 7, null) == coroutineSingletons) {
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
