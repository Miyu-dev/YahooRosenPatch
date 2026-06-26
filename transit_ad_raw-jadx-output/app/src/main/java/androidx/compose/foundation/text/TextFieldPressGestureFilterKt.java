package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
import androidx.compose.animation.b;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import dj.e;
import ej.c;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/j;", "onTap", "tapPressTextFieldModifier", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, boolean z, final l<? super Offset, j> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "onTap");
        return z ? ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @c(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ State<l<Offset, j>> $onTapState;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @c(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
                public static final class C00531 extends SuspendLambda implements q<PressGestureScope, Offset, dj.c<? super j>, Object> {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                    final /* synthetic */ CoroutineScope $scope;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    @c(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {R.styleable.AppCompatTheme_dialogCornerRadius, R.styleable.AppCompatTheme_dividerVertical}, m = "invokeSuspend")
                    public static final class C00541 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ long $it;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00541(MutableState<PressInteraction.Press> mutableState, long j, MutableInteractionSource mutableInteractionSource, dj.c<? super C00541> cVar) {
                            super(2, cVar);
                            this.$pressedInteraction = mutableState;
                            this.$it = j;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new C00541(this.$pressedInteraction, this.$it, this.$interactionSource, cVar);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                            /*
                                r7 = this;
                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r1 = r7.label
                                r2 = 0
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L25
                                if (r1 == r4) goto L1d
                                if (r1 != r3) goto L15
                                java.lang.Object r0 = r7.L$0
                                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                li.c.O(r8)
                                goto L64
                            L15:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L1d:
                                java.lang.Object r1 = r7.L$0
                                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                li.c.O(r8)
                                goto L49
                            L25:
                                li.c.O(r8)
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                java.lang.Object r8 = r8.getValue()
                                androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                                if (r8 == 0) goto L4d
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                                androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                                r6.<init>(r8)
                                if (r1 == 0) goto L4a
                                r7.L$0 = r5
                                r7.label = r4
                                java.lang.Object r8 = r1.emit(r6, r7)
                                if (r8 != r0) goto L48
                                return r0
                            L48:
                                r1 = r5
                            L49:
                                r5 = r1
                            L4a:
                                r5.setValue(r2)
                            L4d:
                                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                long r4 = r7.$it
                                r8.<init>(r4, r2)
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                if (r1 == 0) goto L65
                                r7.L$0 = r8
                                r7.label = r3
                                java.lang.Object r1 = r1.emit(r8, r7)
                                if (r1 != r0) goto L63
                                return r0
                            L63:
                                r0 = r8
                            L64:
                                r8 = r0
                            L65:
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                                r0.setValue(r8)
                                kotlin.j r8 = kotlin.j.a
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.AnonymousClass1.AnonymousClass2.C00531.C00541.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                            return create(coroutineScope, cVar).invokeSuspend(j.a);
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    @c(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
                    public static final class C00552 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        final /* synthetic */ boolean $success;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00552(MutableState<PressInteraction.Press> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, dj.c<? super C00552> cVar) {
                            super(2, cVar);
                            this.$pressedInteraction = mutableState;
                            this.$success = z;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new C00552(this.$pressedInteraction, this.$success, this.$interactionSource, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            MutableState<PressInteraction.Press> mutableState;
                            MutableState<PressInteraction.Press> mutableState2;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                li.c.O(obj);
                                PressInteraction.Press value = this.$pressedInteraction.getValue();
                                if (value != null) {
                                    boolean z = this.$success;
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$pressedInteraction;
                                    Interaction release = z ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(release, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                return j.a;
                            }
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableState2 = (MutableState) this.L$0;
                            li.c.O(obj);
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            return j.a;
                        }

                        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                            return create(coroutineScope, cVar).invokeSuspend(j.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00531(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, dj.c<? super C00531> cVar) {
                        super(3, cVar);
                        this.$scope = coroutineScope;
                        this.$pressedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m885invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
                    }

                    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m885invoked4ec7I(PressGestureScope pressGestureScope, long j, dj.c<? super j> cVar) {
                        C00531 c00531 = new C00531(this.$scope, this.$pressedInteraction, this.$interactionSource, cVar);
                        c00531.L$0 = pressGestureScope;
                        c00531.J$0 = j;
                        return c00531.invokeSuspend(j.a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                            BuildersKt.launch$default(this.$scope, (e) null, (CoroutineStart) null, new C00541(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, (Object) null);
                            this.label = 1;
                            obj = pressGestureScope.tryAwaitRelease(this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            li.c.O(obj);
                        }
                        BuildersKt.launch$default(this.$scope, (e) null, (CoroutineStart) null, new C00552(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, (Object) null);
                        return j.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends l<? super Offset, j>> state, dj.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.$scope = coroutineScope;
                    this.$pressedInteraction = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                    this.$onTapState = state;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, cVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
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
                        C00531 c00531 = new C00531(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                        final State<l<Offset, j>> state = this.$onTapState;
                        l<Offset, j> lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m886invokek4lQ0M(((Offset) obj2).getPackedValue());
                                return j.a;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m886invokek4lQ0M(long j) {
                                state.getValue().invoke(Offset.m2574boximpl(j));
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, c00531, lVar, this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, -102778667)) {
                    ComposerKt.traceEventStart(-102778667, i2, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objD = s.d(composer, 773894976, -492369756);
                Composer.Companion companion = Composer.INSTANCE;
                if (objD == companion.getEmpty()) {
                    objD = a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, 0);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            m.h(disposableEffectScope, "$this$DisposableEffect");
                            final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(cancel);
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass2(coroutineScope, mutableState, mutableInteractionSource3, stateRememberUpdatedState, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }, 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z, lVar);
    }
}
