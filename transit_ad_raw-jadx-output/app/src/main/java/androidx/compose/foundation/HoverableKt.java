package androidx.compose.foundation;

import androidx.appcompat.widget.s;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class HoverableKt {
    public static final Modifier hoverable(Modifier modifier, final MutableInteractionSource mutableInteractionSource, final boolean z) {
        m.h(modifier, "<this>");
        m.h(mutableInteractionSource, "interactionSource");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "hoverable").set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(mutableInteractionSource, z));
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return hoverable(modifier, mutableInteractionSource, z);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2, reason: invalid class name */
    /* JADX INFO: compiled from: Hoverable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass2 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: Hoverable.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
            final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ CoroutineScope $scope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
            /* JADX INFO: compiled from: Hoverable.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
                final /* synthetic */ dj.e $currentContext;
                final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Hoverable.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, m = "invokeSuspend")
                public static final class C00191 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00191(MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, dj.c<? super C00191> cVar) {
                        super(2, cVar);
                        this.$interactionSource = mutableInteractionSource;
                        this.$hoverInteraction$delegate = mutableState;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new C00191(this.$interactionSource, this.$hoverInteraction$delegate, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            this.label = 1;
                            if (AnonymousClass2.invoke$emitEnter(mutableInteractionSource, mutableState, this) == coroutineSingletons) {
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

                /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Hoverable.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle}, m = "invokeSuspend")
                public static final class C00202 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00202(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, dj.c<? super C00202> cVar) {
                        super(2, cVar);
                        this.$hoverInteraction$delegate = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new C00202(this.$hoverInteraction$delegate, this.$interactionSource, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            this.label = 1;
                            if (AnonymousClass2.invoke$emitExit(mutableState, mutableInteractionSource, this) == coroutineSingletons) {
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
                public AnonymousClass1(dj.e eVar, CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$currentContext = eVar;
                    this.$scope = coroutineScope;
                    this.$interactionSource = mutableInteractionSource;
                    this.$hoverInteraction$delegate = mutableState;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                    return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0039 -> B:15:0x003e). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        r14 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r14.label
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r1 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        li.c.O(r15)
                        r4 = r1
                        r1 = r0
                        r0 = r14
                        goto L3e
                    L15:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L1d:
                        li.c.O(r15)
                        java.lang.Object r15 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
                        r1 = r15
                        r15 = r14
                    L26:
                        dj.e r4 = r15.$currentContext
                        boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                        if (r4 == 0) goto L83
                        r15.L$0 = r1
                        r15.label = r2
                        java.lang.Object r4 = androidx.compose.ui.input.pointer.a.t(r1, r3, r15, r2, r3)
                        if (r4 != r0) goto L39
                        return r0
                    L39:
                        r13 = r0
                        r0 = r15
                        r15 = r4
                        r4 = r1
                        r1 = r13
                    L3e:
                        androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                        int r15 = r15.getType()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                        int r6 = r5.m4085getEnter7fucELk()
                        boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r15, r6)
                        if (r6 == 0) goto L63
                        kotlinx.coroutines.CoroutineScope r7 = r0.$scope
                        r8 = 0
                        r9 = 0
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r10 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                        androidx.compose.foundation.interaction.MutableInteractionSource r15 = r0.$interactionSource
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r5 = r0.$hoverInteraction$delegate
                        r10.<init>(r15, r5, r3)
                        r11 = 3
                        r12 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                        goto L7f
                    L63:
                        int r5 = r5.m4086getExit7fucELk()
                        boolean r15 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r15, r5)
                        if (r15 == 0) goto L7f
                        kotlinx.coroutines.CoroutineScope r5 = r0.$scope
                        r6 = 0
                        r7 = 0
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r8 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r15 = r0.$hoverInteraction$delegate
                        androidx.compose.foundation.interaction.MutableInteractionSource r9 = r0.$interactionSource
                        r8.<init>(r15, r9, r3)
                        r9 = 3
                        r10 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                    L7f:
                        r15 = r0
                        r0 = r1
                        r1 = r4
                        goto L26
                    L83:
                        kotlin.j r15 = kotlin.j.a
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, dj.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$scope = coroutineScope;
                this.$interactionSource = mutableInteractionSource;
                this.$hoverInteraction$delegate = mutableState;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
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
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutineSingletons) {
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
        public AnonymousClass2(MutableInteractionSource mutableInteractionSource, boolean z) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r5, dj.c<? super kotlin.j> r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r4 = r0.L$1
                androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r4
                java.lang.Object r5 = r0.L$0
                androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
                li.c.O(r6)
                goto L53
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                li.c.O(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r5)
                if (r6 != 0) goto L56
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
                r6.<init>()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r4 = r4.emit(r6, r0)
                if (r4 != r1) goto L52
                return r1
            L52:
                r4 = r6
            L53:
                invoke$lambda$2(r5, r4)
            L56:
                kotlin.j r4 = kotlin.j.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, dj.c):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object invoke$emitExit(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r4, androidx.compose.foundation.interaction.MutableInteractionSource r5, dj.c<? super kotlin.j> r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r4 = r0.L$0
                androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
                li.c.O(r6)
                goto L4c
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L33:
                li.c.O(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r4)
                if (r6 == 0) goto L50
                androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
                r2.<init>(r6)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L4c
                return r1
            L4c:
                r5 = 0
                invoke$lambda$2(r4, r5)
            L50:
                kotlin.j r4 = kotlin.j.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.invoke$emitExit(androidx.compose.runtime.MutableState, androidx.compose.foundation.interaction.MutableInteractionSource, dj.c):java.lang.Object");
        }

        private static final HoverInteraction.Enter invoke$lambda$1(MutableState<HoverInteraction.Enter> mutableState) {
            return mutableState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$tryEmitExit(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource) {
            HoverInteraction.Enter enterInvoke$lambda$1 = invoke$lambda$1(mutableState);
            if (enterInvoke$lambda$1 != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enterInvoke$lambda$1));
                mutableState.setValue(null);
            }
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            Modifier modifierPointerInput;
            if (androidx.compose.animation.b.n(modifier, "$this$composed", composer, 1294013553)) {
                ComposerKt.traceEventStart(1294013553, i2, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
            }
            Object objD = s.d(composer, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objD == companion.getEmpty()) {
                objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
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
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        m.h(disposableEffectScope, "$this$DisposableEffect");
                        final MutableState<HoverInteraction.Enter> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                HoverableKt.AnonymousClass2.invoke$tryEmitExit(mutableState2, mutableInteractionSource2);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(this.$enabled);
            Object objValueOf = Boolean.valueOf(this.$enabled);
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            boolean z = this.$enabled;
            composer.startReplaceableGroup(1618982084);
            boolean zChanged2 = composer.changed(objValueOf) | composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new HoverableKt$hoverable$2$2$1(z, mutableState, mutableInteractionSource2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue3, composer, 64);
            if (this.$enabled) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass3(coroutineScope, mutableInteractionSource3, mutableState, null));
            } else {
                modifierPointerInput = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }
}
