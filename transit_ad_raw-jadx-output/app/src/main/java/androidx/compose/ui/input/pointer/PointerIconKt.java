package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PointerIconKt {
    @Stable
    public static final Modifier pointerHoverIcon(Modifier modifier, final PointerIcon pointerIcon, final boolean z) {
        m.h(modifier, "<this>");
        m.h(pointerIcon, "icon");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "pointerHoverIcon").set("icon", pointerIcon);
                inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2

            /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: PointerIcon.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
                final /* synthetic */ PointerIcon $icon;
                final /* synthetic */ boolean $overrideDescendants;
                final /* synthetic */ PointerIconService $pointerIconService;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: PointerIcon.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
                public static final class C01071 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
                    final /* synthetic */ PointerIcon $icon;
                    final /* synthetic */ boolean $overrideDescendants;
                    final /* synthetic */ PointerIconService $pointerIconService;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01071(boolean z, PointerIconService pointerIconService, PointerIcon pointerIcon, dj.c<? super C01071> cVar) {
                        super(2, cVar);
                        this.$overrideDescendants = z;
                        this.$pointerIconService = pointerIconService;
                        this.$icon = pointerIcon;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        C01071 c01071 = new C01071(this.$overrideDescendants, this.$pointerIconService, this.$icon, cVar);
                        c01071.L$0 = obj;
                        return c01071;
                    }

                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                        return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:17:0x003e). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r12.label
                            r2 = 1
                            if (r1 == 0) goto L1c
                            if (r1 != r2) goto L14
                            java.lang.Object r1 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            li.c.O(r13)
                            r3 = r1
                            r1 = r0
                            r0 = r12
                            goto L3e
                        L14:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1c:
                            li.c.O(r13)
                            java.lang.Object r13 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                            r1 = r13
                            r13 = r12
                        L25:
                            boolean r3 = r13.$overrideDescendants
                            if (r3 == 0) goto L2c
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            goto L2e
                        L2c:
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        L2e:
                            r13.L$0 = r1
                            r13.label = r2
                            java.lang.Object r3 = r1.awaitPointerEvent(r3, r13)
                            if (r3 != r0) goto L39
                            return r0
                        L39:
                            r11 = r0
                            r0 = r13
                            r13 = r3
                            r3 = r1
                            r1 = r11
                        L3e:
                            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                            int r4 = r13.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                            int r6 = r5.m4089getRelease7fucELk()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r4, r6)
                            r6 = 0
                            if (r4 == 0) goto L6c
                            java.util.List r4 = r13.getChanges()
                            java.lang.Object r4 = r4.get(r6)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            long r7 = r3.mo4045getSizeYbymL2g()
                            androidx.compose.ui.geometry.Size$Companion r9 = androidx.compose.ui.geometry.Size.INSTANCE
                            long r9 = r9.m2663getZeroNHjbRc()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.m4077isOutOfBoundsjwHxaWs(r4, r7, r9)
                            if (r4 == 0) goto L6c
                            r6 = r2
                        L6c:
                            int r13 = r13.getType()
                            int r4 = r5.m4086getExit7fucELk()
                            boolean r13 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r13, r4)
                            if (r13 != 0) goto L83
                            if (r6 != 0) goto L83
                            androidx.compose.ui.input.pointer.PointerIconService r13 = r0.$pointerIconService
                            androidx.compose.ui.input.pointer.PointerIcon r4 = r0.$icon
                            r13.setCurrent(r4)
                        L83:
                            r13 = r0
                            r0 = r1
                            r1 = r3
                            goto L25
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt.AnonymousClass2.AnonymousClass1.C01071.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z, PointerIconService pointerIconService, PointerIcon pointerIcon, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$overrideDescendants = z;
                    this.$pointerIconService = pointerIconService;
                    this.$icon = pointerIcon;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideDescendants, this.$pointerIconService, this.$icon, cVar);
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
                        C01071 c01071 = new C01071(this.$overrideDescendants, this.$pointerIconService, this.$icon, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c01071, this) == coroutineSingletons) {
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
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 811087536)) {
                    ComposerKt.traceEventStart(811087536, i2, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
                }
                PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
                Modifier modifierPointerInput = pointerIconService == null ? Modifier.INSTANCE : SuspendingPointerInputFilterKt.pointerInput(modifier2, pointerIcon, Boolean.valueOf(z), new AnonymousClass1(z, pointerIconService, pointerIcon, null));
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

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z);
    }
}
