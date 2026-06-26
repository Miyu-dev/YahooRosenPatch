package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.core.widgets.Optimizer;
import dj.e;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001aR\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\u001aQ\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0017\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)\"\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "controller", "pointerScrollable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogicState", "Landroidx/compose/foundation/gestures/ScrollConfig;", "mouseWheelScrollConfig", "mouseWheelScroll", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitScrollEvent", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Ldj/c;)Ljava/lang/Object;", "scrollLogic", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollableNestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollScope;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalScrollableContainer", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "DefaultScrollMotionDurationScaleFactor", "F", "Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float pixels) {
            return pixels;
        }
    };
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(new kj.a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m353invoke() {
            return Boolean.FALSE;
        }
    });
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // androidx.compose.ui.MotionDurationScale
        public <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r, pVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public <E extends e.b> E get(e.c<E> cVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public final /* synthetic */ e.c getKey() {
            return androidx.compose.ui.c.a(this);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public dj.e minusKey(e.c<?> cVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public dj.e plus(dj.e eVar) {
            return MotionDurationScale.DefaultImpls.plus(this, eVar);
        }
    };

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {313}, m = "awaitScrollEvent")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollableKt.awaitScrollEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {291}, m = "invokeSuspend")
    public static final class C01871 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
        final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {293}, m = "invokeSuspend")
        public static final class C00281 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
            final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
            final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00281(ScrollConfig scrollConfig, State<ScrollingLogic> state, dj.c<? super C00281> cVar) {
                super(2, cVar);
                this.$mouseWheelScrollConfig = scrollConfig;
                this.$scrollingLogicState = state;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C00281 c00281 = new C00281(this.$mouseWheelScrollConfig, this.$scrollingLogicState, cVar);
                c00281.L$0 = obj;
                return c00281;
            }

            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:13:0x0035). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r10.label
                    r2 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r1 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    li.c.O(r11)
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L35
                L14:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1c:
                    li.c.O(r11)
                    java.lang.Object r11 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                    r1 = r11
                    r11 = r10
                L25:
                    r11.L$0 = r1
                    r11.label = r2
                    java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r11)
                    if (r3 != r0) goto L30
                    return r0
                L30:
                    r9 = r0
                    r0 = r11
                    r11 = r3
                    r3 = r1
                    r1 = r9
                L35:
                    androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                    java.util.List r4 = r11.getChanges()
                    int r5 = r4.size()
                    r6 = 0
                    r7 = r6
                L41:
                    if (r7 >= r5) goto L55
                    java.lang.Object r8 = r4.get(r7)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                    boolean r8 = r8.isConsumed()
                    r8 = r8 ^ r2
                    if (r8 != 0) goto L52
                    r4 = r6
                    goto L56
                L52:
                    int r7 = r7 + 1
                    goto L41
                L55:
                    r4 = r2
                L56:
                    if (r4 == 0) goto L9a
                    androidx.compose.foundation.gestures.ScrollConfig r4 = r0.$mouseWheelScrollConfig
                    androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r0.$scrollingLogicState
                    long r7 = r3.mo4045getSizeYbymL2g()
                    long r7 = r4.mo266calculateMouseWheelScroll8xgXZGE(r3, r11, r7)
                    java.lang.Object r4 = r5.getValue()
                    androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                    float r5 = r4.m368toFloatk4lQ0M(r7)
                    float r5 = r4.reverseIfNeeded(r5)
                    androidx.compose.foundation.gestures.ScrollableState r4 = r4.getScrollableState()
                    float r4 = r4.dispatchRawDelta(r5)
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 != 0) goto L81
                    r4 = r2
                    goto L82
                L81:
                    r4 = r6
                L82:
                    if (r4 != 0) goto L9a
                    java.util.List r11 = r11.getChanges()
                    int r4 = r11.size()
                L8c:
                    if (r6 >= r4) goto L9a
                    java.lang.Object r5 = r11.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                    r5.consume()
                    int r6 = r6 + 1
                    goto L8c
                L9a:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    goto L25
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.C01871.C00281.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01871(ScrollConfig scrollConfig, State<ScrollingLogic> state, dj.c<? super C01871> cVar) {
            super(2, cVar);
            this.$mouseWheelScrollConfig = scrollConfig;
            this.$scrollingLogicState = state;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01871 c01871 = new C01871(this.$mouseWheelScrollConfig, this.$scrollingLogicState, cVar);
            c01871.L$0 = obj;
            return c01871;
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
                C00281 c00281 = new C00281(this.$mouseWheelScrollConfig, this.$scrollingLogicState, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00281, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLdj/c;)Ljava/lang/Object;", "onPostFling", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class C01891 implements NestedScrollConnection {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ State<ScrollingLogic> $scrollLogic;

        public C01891(State<ScrollingLogic> state, boolean z) {
            this.$scrollLogic = state;
            this.$enabled = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo356onPostFlingRZ2iAVY(long r3, long r5, dj.c<? super androidx.compose.ui.unit.Velocity> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
                r3.<init>(r2, r7)
            L18:
                java.lang.Object r4 = r3.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L35
                if (r0 != r1) goto L2d
                long r5 = r3.J$0
                java.lang.Object r3 = r3.L$0
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt.C01891) r3
                li.c.O(r4)
                goto L52
            L2d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L35:
                li.c.O(r4)
                boolean r4 = r2.$enabled
                if (r4 == 0) goto L5d
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.$scrollLogic
                java.lang.Object r4 = r4.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                r3.L$0 = r2
                r3.J$0 = r5
                r3.label = r1
                java.lang.Object r4 = r4.m361doFlingAnimationQWom1Mo(r5, r3)
                if (r4 != r7) goto L51
                return r7
            L51:
                r3 = r2
            L52:
                androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
                long r0 = r4.getPackedValue()
                long r4 = androidx.compose.ui.unit.Velocity.m5495minusAH228Gc(r5, r0)
                goto L64
            L5d:
                androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r4 = r3.m5503getZero9UxMQ8M()
                r3 = r2
            L64:
                androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m5483boximpl(r4)
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r3 = r3.$scrollLogic
                r4.getPackedValue()
                java.lang.Object r3 = r3.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
                r5 = 0
                r3.registerNestedFling(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.C01891.mo356onPostFlingRZ2iAVY(long, long, dj.c):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public long mo357onPostScrollDzOQY0M(long consumed, long available, int source) {
            return this.$enabled ? this.$scrollLogic.getValue().m363performRawScrollMKHz9U(available) : Offset.INSTANCE.m2601getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public final /* synthetic */ Object mo358onPreFlingQWom1Mo(long j, dj.c cVar) {
            return androidx.compose.ui.input.nestedscroll.a.c(this, j, cVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public long mo359onPreScrollOzD1aCk(long available, int source) {
            if (NestedScrollSource.m4036equalsimpl0(source, NestedScrollSource.INSTANCE.m4042getFlingWNlRxjI())) {
                this.$scrollLogic.getValue().registerNestedFling(true);
            }
            return Offset.INSTANCE.m2601getZeroF1C5BW0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
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
    public static final java.lang.Object awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, dj.c<? super androidx.compose.ui.input.pointer.PointerEvent> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            li.c.O(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            li.c.O(r6)
        L36:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.a.t(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r2 = r6.getType()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
            int r4 = r4.m4090getScroll7fucELk()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r2, r4)
            if (r2 == 0) goto L36
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, dj.c):java.lang.Object");
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    private static final Modifier mouseWheelScroll(Modifier modifier, State<ScrollingLogic> state, ScrollConfig scrollConfig) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, state, scrollConfig, new C01871(scrollConfig, state, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final Modifier pointerScrollable(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z2, Composer composer, int i2) {
        composer.startReplaceableGroup(-2012025036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012025036, i2, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)");
        }
        composer.startReplaceableGroup(-1730186281);
        FlingBehavior flingBehavior2 = flingBehavior == null ? ScrollableDefaults.INSTANCE.flingBehavior(composer, 6) : flingBehavior;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z, mutableState, scrollableState, flingBehavior2, overscrollEffect), composer, 0);
        Object objValueOf = Boolean.valueOf(z2);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = scrollableNestedScrollConnection(stateRememberUpdatedState, z2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) objRememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ScrollDraggableState(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        ScrollDraggableState scrollDraggableState = (ScrollDraggableState) objRememberedValue3;
        ScrollConfig scrollConfigPlatformScrollConfig = AndroidScrollable_androidKt.platformScrollConfig(composer, 0);
        C01881 c01881 = new l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1
            public final Boolean invoke(PointerInputChange pointerInputChange) {
                m.h(pointerInputChange, "down");
                return Boolean.valueOf(!PointerType.m4187equalsimpl0(pointerInputChange.getType(), PointerType.INSTANCE.m4192getMouseT8wyACA()));
            }
        };
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(stateRememberUpdatedState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new kj.a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m354invoke() {
                    return Boolean.valueOf(stateRememberUpdatedState.getValue().shouldScrollImmediately());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        kj.a aVar = (kj.a) objRememberedValue4;
        composer.startReplaceableGroup(511388516);
        boolean zChanged3 = composer.changed(mutableState) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new ScrollableKt$pointerScrollable$3$1(mutableState, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier modifierNestedScroll = NestedScrollModifierKt.nestedScroll(mouseWheelScroll(DraggableKt.draggable(modifier, scrollDraggableState, c01881, orientation, (64 & 8) != 0 ? true : z2, (64 & 16) != 0 ? null : mutableInteractionSource, aVar, (64 & 64) != 0 ? new DraggableKt.AnonymousClass6(null) : null, (64 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? new DraggableKt.AnonymousClass7(null) : (q) objRememberedValue5, (64 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? false : false), stateRememberUpdatedState, scrollConfigPlatformScrollConfig), nestedScrollConnection, (NestedScrollDispatcher) mutableState.getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierNestedScroll;
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        m.h(modifier, "<this>");
        m.h(scrollableState, "state");
        m.h(orientation, "orientation");
        return scrollable(modifier, scrollableState, orientation, null, z, z2, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z3, z2, (i2 & 16) != 0 ? null : flingBehavior, (i2 & 32) != 0 ? null : mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z) {
        return new C01891(state, z);
    }

    @ExperimentalFoundationApi
    public static final Modifier scrollable(Modifier modifier, final ScrollableState scrollableState, final Orientation orientation, final OverscrollEffect overscrollEffect, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final MutableInteractionSource mutableInteractionSource) {
        m.h(modifier, "<this>");
        m.h(scrollableState, "state");
        m.h(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "scrollable").set("orientation", orientation);
                inspectorInfo.getProperties().set("state", scrollableState);
                inspectorInfo.getProperties().set("overscrollEffect", overscrollEffect);
                androidx.compose.animation.b.c(z2, androidx.compose.animation.b.c(z, inspectorInfo.getProperties(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.scrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -629830927)) {
                    ComposerKt.traceEventStart(-629830927, i2, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
                }
                Object objD = s.d(composer, 773894976, -492369756);
                if (objD == Composer.INSTANCE.getEmpty()) {
                    objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                composer.endReplaceableGroup();
                Object[] objArr = {coroutineScope, orientation, scrollableState, Boolean.valueOf(z2)};
                Orientation orientation2 = orientation;
                ScrollableState scrollableState2 = scrollableState;
                boolean z3 = z2;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i3 = 0; i3 < 4; i3++) {
                    zChanged |= composer.changed(objArr[i3]);
                }
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ContentInViewModifier(coroutineScope, orientation2, scrollableState2, z3);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifier3 = Modifier.INSTANCE;
                Modifier modifierPointerScrollable = ScrollableKt.pointerScrollable(FocusableKt.focusGroup(modifier3).then(((ContentInViewModifier) objRememberedValue).getModifier()), mutableInteractionSource, orientation, z2, scrollableState, flingBehavior, overscrollEffect, z, composer, 0);
                if (z) {
                    modifier3 = ModifierLocalScrollableContainerProvider.INSTANCE;
                }
                Modifier modifierThen = modifierPointerScrollable.then(modifier3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }
}
