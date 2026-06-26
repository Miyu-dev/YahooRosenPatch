package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a3\u0010\u000e\u001a\u00020\r*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "panZoomLock", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "channel", "Lkotlin/j;", "detectZoom", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Ldj/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TransformableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {134, 136}, m = "detectZoom")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
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
            return TransformableKt.detectZoom(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:65:0x018d, B:58:0x0174], limit reached: 93 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d6 -> B:24:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r27, androidx.compose.runtime.State<java.lang.Boolean> r28, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r29, dj.c<? super kotlin.j> r30) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, kotlinx.coroutines.channels.Channel, dj.c):java.lang.Object");
    }

    public static final Modifier transformable(Modifier modifier, final TransformableState transformableState, final boolean z, final boolean z2) {
        m.h(modifier, "<this>");
        m.h(transformableState, "state");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "transformable").set("state", transformableState);
                androidx.compose.animation.b.c(z2, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("lockRotationOnZoomPan", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.2

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: Transformable.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1", f = "Transformable.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle, 75}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ Channel<TransformEvent> $channel;
                final /* synthetic */ TransformableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Transformable.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1", f = "Transformable.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
                public static final class C00351 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
                    final /* synthetic */ Channel<TransformEvent> $channel;
                    final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00351(Ref.ObjectRef<TransformEvent> objectRef, Channel<TransformEvent> channel, dj.c<? super C00351> cVar) {
                        super(2, cVar);
                        this.$event = objectRef;
                        this.$channel = channel;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        C00351 c00351 = new C00351(this.$event, this.$channel, cVar);
                        c00351.L$0 = obj;
                        return c00351;
                    }

                    public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
                        return create(transformScope, cVar).invokeSuspend(j.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x0062). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r8.label
                            r2 = 1
                            if (r1 == 0) goto L21
                            if (r1 != r2) goto L19
                            java.lang.Object r1 = r8.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                            java.lang.Object r3 = r8.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            li.c.O(r9)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r8
                            goto L62
                        L19:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L21:
                            li.c.O(r9)
                            java.lang.Object r9 = r8.L$0
                            androidx.compose.foundation.gestures.TransformScope r9 = (androidx.compose.foundation.gestures.TransformScope) r9
                            r3 = r9
                            r9 = r8
                        L2a:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r9.$event
                            java.lang.Object r1 = r1.element
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                            if (r4 != 0) goto L68
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                            if (r4 == 0) goto L39
                            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r1 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r1
                            goto L3a
                        L39:
                            r1 = 0
                        L3a:
                            if (r1 == 0) goto L4b
                            float r4 = r1.getZoomChange()
                            long r5 = r1.getPanChange()
                            float r1 = r1.getRotationChange()
                            r3.mo275transformByd4ec7I(r4, r5, r1)
                        L4b:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r9.$event
                            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r4 = r9.$channel
                            r9.L$0 = r3
                            r9.L$1 = r1
                            r9.label = r2
                            java.lang.Object r4 = r4.receive(r9)
                            if (r4 != r0) goto L5c
                            return r0
                        L5c:
                            r7 = r0
                            r0 = r9
                            r9 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r7
                        L62:
                            r3.element = r9
                            r9 = r0
                            r0 = r1
                            r3 = r4
                            goto L2a
                        L68:
                            kotlin.j r9 = kotlin.j.a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.AnonymousClass2.AnonymousClass1.C00351.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Channel<TransformEvent> channel, TransformableState transformableState, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$channel = channel;
                    this.$state = transformableState;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$channel, this.$state, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:14:0x0037). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r11.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r1 = r11.L$0
                        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                        li.c.O(r12)     // Catch: java.util.concurrent.CancellationException -> L13
                    L13:
                        r12 = r1
                        goto L36
                    L15:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L1d:
                        java.lang.Object r1 = r11.L$2
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r4 = r11.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                        java.lang.Object r5 = r11.L$0
                        kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                        li.c.O(r12)
                        r6 = r4
                        r4 = r11
                        goto L59
                    L2f:
                        li.c.O(r12)
                        java.lang.Object r12 = r11.L$0
                        kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                    L36:
                        r1 = r11
                    L37:
                        boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r12)
                        if (r4 == 0) goto L7f
                        kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                        r4.<init>()
                        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r5 = r1.$channel
                        r1.L$0 = r12
                        r1.L$1 = r4
                        r1.L$2 = r4
                        r1.label = r3
                        java.lang.Object r5 = r5.receive(r1)
                        if (r5 != r0) goto L53
                        return r0
                    L53:
                        r6 = r4
                        r4 = r1
                        r1 = r6
                        r10 = r5
                        r5 = r12
                        r12 = r10
                    L59:
                        r1.element = r12
                        java.lang.Object r12 = r6.element
                        boolean r12 = r12 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                        if (r12 == 0) goto L7c
                        androidx.compose.foundation.gestures.TransformableState r12 = r4.$state     // Catch: java.util.concurrent.CancellationException -> L7c
                        androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L7c
                        androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1 r7 = new androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1     // Catch: java.util.concurrent.CancellationException -> L7c
                        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r8 = r4.$channel     // Catch: java.util.concurrent.CancellationException -> L7c
                        r9 = 0
                        r7.<init>(r6, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L7c
                        r4.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L7c
                        r4.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L7c
                        r4.L$2 = r9     // Catch: java.util.concurrent.CancellationException -> L7c
                        r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L7c
                        java.lang.Object r12 = r12.transform(r1, r7, r4)     // Catch: java.util.concurrent.CancellationException -> L7c
                        if (r12 != r0) goto L7c
                        return r0
                    L7c:
                        r1 = r4
                        r12 = r5
                        goto L37
                    L7f:
                        kotlin.j r12 = kotlin.j.a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 1509335853)) {
                    ComposerKt.traceEventStart(1509335853, i2, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = ChannelKt.Channel$default(Integer.MAX_VALUE, (BufferOverflow) null, (l) null, 6, (Object) null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) objRememberedValue;
                composer.startReplaceableGroup(-2015617726);
                if (z2) {
                    TransformableState transformableState2 = transformableState;
                    EffectsKt.LaunchedEffect(transformableState2, new AnonymousClass1(channel, transformableState2, null), composer, 64);
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new TransformableKt$transformable$2$block$1$1(stateRememberUpdatedState, channel, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = z2 ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, j.a, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue2) : Modifier.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }
}
