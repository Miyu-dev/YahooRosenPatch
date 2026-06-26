package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import ej.c;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldGestureModifiers.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a:\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextDragObserver;", "observer", "", "enabled", "longPressDragGestureFilter", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/j;", "onFocusChanged", "textFieldFocusModifier", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseDragGestureDetector", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldGestureModifiersKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldGestureModifiers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextDragObserver textDragObserver, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$observer = textDragObserver;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                if (LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver(pointerInputScope, textDragObserver, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldGestureModifiers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
    public static final class C02701 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ MouseSelectionObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02701(MouseSelectionObserver mouseSelectionObserver, dj.c<? super C02701> cVar) {
            super(2, cVar);
            this.$observer = mouseSelectionObserver;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C02701 c02701 = new C02701(this.$observer, cVar);
            c02701.L$0 = obj;
            return c02701;
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
                MouseSelectionObserver mouseSelectionObserver = this.$observer;
                this.label = 1;
                if (TextSelectionMouseDetectorKt.mouseSelectionDetector(pointerInputScope, mouseSelectionObserver, this) == coroutineSingletons) {
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

    public static final Modifier longPressDragGestureFilter(Modifier modifier, TextDragObserver textDragObserver, boolean z) {
        m.h(modifier, "<this>");
        m.h(textDragObserver, "observer");
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, textDragObserver, new AnonymousClass1(textDragObserver, null)) : modifier;
    }

    public static final Modifier mouseDragGestureDetector(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, boolean z) {
        m.h(modifier, "<this>");
        m.h(mouseSelectionObserver, "observer");
        return z ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, mouseSelectionObserver, new C02701(mouseSelectionObserver, null)) : modifier;
    }

    public static final Modifier textFieldFocusModifier(Modifier modifier, boolean z, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, l<? super FocusState, j> lVar) {
        m.h(modifier, "<this>");
        m.h(focusRequester, "focusRequester");
        m.h(lVar, "onFocusChanged");
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), lVar), z, mutableInteractionSource);
    }
}
