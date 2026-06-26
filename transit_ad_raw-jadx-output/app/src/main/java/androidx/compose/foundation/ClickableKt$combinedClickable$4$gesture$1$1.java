package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1", f = "Clickable.kt", l = {343}, m = "invokeSuspend")
public final class ClickableKt$combinedClickable$4$gesture$1$1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
    final /* synthetic */ MutableState<Offset> $centreOffset;
    final /* synthetic */ State<kj.a<Boolean>> $delayPressInteraction;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $hasDoubleClick;
    final /* synthetic */ boolean $hasLongClick;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<kj.a<j>> $onClickState;
    final /* synthetic */ State<kj.a<j>> $onDoubleClickState;
    final /* synthetic */ State<kj.a<j>> $onLongClickState;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1$3", f = "Clickable.kt", l = {356}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements q<PressGestureScope, Offset, dj.c<? super j>, Object> {
        final /* synthetic */ State<kj.a<Boolean>> $delayPressInteraction;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends kj.a<Boolean>> state, dj.c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.$enabled = z;
            this.$interactionSource = mutableInteractionSource;
            this.$pressedInteraction = mutableState;
            this.$delayPressInteraction = state;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m220invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m220invoked4ec7I(PressGestureScope pressGestureScope, long j, dj.c<? super j> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, cVar);
            anonymousClass3.L$0 = pressGestureScope;
            anonymousClass3.J$0 = j;
            return anonymousClass3.invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                if (this.$enabled) {
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    MutableState<PressInteraction.Press> mutableState = this.$pressedInteraction;
                    State<kj.a<Boolean>> state = this.$delayPressInteraction;
                    this.label = 1;
                    if (ClickableKt.m213handlePressInteractionEPk0efs(pressGestureScope, j, mutableInteractionSource, mutableState, state, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickable$4$gesture$1$1(MutableState<Offset> mutableState, boolean z, boolean z2, boolean z3, State<? extends kj.a<j>> state, State<? extends kj.a<j>> state2, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState2, State<? extends kj.a<Boolean>> state3, State<? extends kj.a<j>> state4, dj.c<? super ClickableKt$combinedClickable$4$gesture$1$1> cVar) {
        super(2, cVar);
        this.$centreOffset = mutableState;
        this.$hasDoubleClick = z;
        this.$enabled = z2;
        this.$hasLongClick = z3;
        this.$onDoubleClickState = state;
        this.$onLongClickState = state2;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState2;
        this.$delayPressInteraction = state3;
        this.$onClickState = state4;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        ClickableKt$combinedClickable$4$gesture$1$1 clickableKt$combinedClickable$4$gesture$1$1 = new ClickableKt$combinedClickable$4$gesture$1$1(this.$centreOffset, this.$hasDoubleClick, this.$enabled, this.$hasLongClick, this.$onDoubleClickState, this.$onLongClickState, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, cVar);
        clickableKt$combinedClickable$4$gesture$1$1.L$0 = obj;
        return clickableKt$combinedClickable$4$gesture$1$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
        return create(pointerInputScope, cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        l<Offset, j> lVar;
        l<Offset, j> lVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            MutableState<Offset> mutableState = this.$centreOffset;
            long jM5433getCenterozmzZPI = IntSizeKt.m5433getCenterozmzZPI(pointerInputScope.m4152getSizeYbymL2g());
            mutableState.setValue(Offset.m2574boximpl(OffsetKt.Offset(IntOffset.m5385getXimpl(jM5433getCenterozmzZPI), IntOffset.m5386getYimpl(jM5433getCenterozmzZPI))));
            if (this.$hasDoubleClick && this.$enabled) {
                final State<kj.a<j>> state = this.$onDoubleClickState;
                lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m218invokek4lQ0M(((Offset) obj2).getPackedValue());
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m218invokek4lQ0M(long j) {
                        kj.a<j> value = state.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }
                };
            } else {
                lVar = null;
            }
            if (this.$hasLongClick && this.$enabled) {
                final State<kj.a<j>> state2 = this.$onLongClickState;
                lVar2 = new l<Offset, j>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m219invokek4lQ0M(((Offset) obj2).getPackedValue());
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m219invokek4lQ0M(long j) {
                        kj.a<j> value = state2.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }
                };
            } else {
                lVar2 = null;
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, null);
            final boolean z = this.$enabled;
            final State<kj.a<j>> state3 = this.$onClickState;
            l<Offset, j> lVar3 = new l<Offset, j>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m221invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m221invokek4lQ0M(long j) {
                    if (z) {
                        state3.getValue().invoke();
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures(pointerInputScope, lVar, lVar2, anonymousClass3, lVar3, this) == coroutineSingletons) {
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
