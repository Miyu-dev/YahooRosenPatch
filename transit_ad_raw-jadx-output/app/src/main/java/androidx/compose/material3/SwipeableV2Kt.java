package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SwipeableV2State;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import dj.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u001aH\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001\u001a_\u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0001ø\u0001\u0000\u001aM\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010#\u001a\u00020\u0012H\u0001\u001a9\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120%2\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\u001a'\u0010*\u001a\u0004\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120%H\u0002¢\u0006\u0004\b*\u0010+\u001a'\u0010,\u001a\u0004\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120%H\u0002¢\u0006\u0004\b,\u0010+\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/SwipeableV2State;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "swipeableV2", "", "possibleValues", "Landroidx/compose/material3/AnchorChangeHandler;", "anchorChangeHandler", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "", "calculateAnchor", "swipeAnchors", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "confirmValueChange", "rememberSwipeableV2State", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeableV2State;", "Landroidx/compose/ui/unit/Dp;", "threshold", "Landroidx/compose/ui/unit/Density;", "fixedPositionalThreshold-0680j_4", "(F)Lkj/p;", "fixedPositionalThreshold", "fraction", "fractionalPositionalThreshold", "", TypedValues.CycleType.S_WAVE_OFFSET, "searchUpwards", "closestAnchor", "(Ljava/util/Map;FZ)Ljava/lang/Object;", "minOrNull", "(Ljava/util/Map;)Ljava/lang/Float;", "maxOrNull", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class SwipeableV2Kt {

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableV2Kt$swipeableV2$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "velocity", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SwipeableV2Kt$swipeableV2$1", f = "SwipeableV2.kt", l = {}, m = "invokeSuspend")
    public static final class C03891 extends SuspendLambda implements q<CoroutineScope, Float, dj.c<? super j>, Object> {
        final /* synthetic */ SwipeableV2State<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SwipeableV2Kt$swipeableV2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SwipeableV2.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.material3.SwipeableV2Kt$swipeableV2$1$1", f = "SwipeableV2.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
        public static final class C00931 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ SwipeableV2State<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00931(SwipeableV2State<T> swipeableV2State, float f, dj.c<? super C00931> cVar) {
                super(2, cVar);
                this.$state = swipeableV2State;
                this.$velocity = f;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new C00931(this.$state, this.$velocity, cVar);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    SwipeableV2State<T> swipeableV2State = this.$state;
                    float f = this.$velocity;
                    this.label = 1;
                    if (swipeableV2State.settle(f, this) == coroutineSingletons) {
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
        public C03891(SwipeableV2State<T> swipeableV2State, dj.c<? super C03891> cVar) {
            super(3, cVar);
            this.$state = swipeableV2State;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (dj.c<? super j>) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            BuildersKt.launch$default((CoroutineScope) this.L$0, (e) null, (CoroutineStart) null, new C00931(this.$state, this.F$0, null), 3, (Object) null);
            return j.a;
        }

        public final Object invoke(CoroutineScope coroutineScope, float f, dj.c<? super j> cVar) {
            C03891 c03891 = new C03891(this.$state, cVar);
            c03891.L$0 = coroutineScope;
            c03891.F$0 = f;
            return c03891.invokeSuspend(j.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T closestAnchor(Map<T, Float> map, float f, boolean z) {
        if (!(!map.isEmpty())) {
            throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
        }
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f2 = z ? fFloatValue - f : f - fFloatValue;
            if (f2 < 0.0f) {
                f2 = Float.POSITIVE_INFINITY;
            }
            do {
                T next2 = it.next();
                float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                if (f3 < 0.0f) {
                    f3 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f2, f3) > 0) {
                    next = next2;
                    f2 = f3;
                }
            } while (it.hasNext());
        }
        return (T) ((Map.Entry) next).getKey();
    }

    public static /* synthetic */ Object closestAnchor$default(Map map, float f, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return closestAnchor(map, f, z);
    }

    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: fixedPositionalThreshold-0680j_4, reason: not valid java name */
    public static final p<Density, Float, Float> m1614fixedPositionalThreshold0680j_4(final float f) {
        return new p<Density, Float, Float>() { // from class: androidx.compose.material3.SwipeableV2Kt$fixedPositionalThreshold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((Density) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(Density density, float f2) {
                m.h(density, "$this$null");
                return Float.valueOf(density.mo348toPx0680j_4(f));
            }
        };
    }

    @ExperimentalMaterial3Api
    public static final p<Density, Float, Float> fractionalPositionalThreshold(final float f) {
        return new p<Density, Float, Float>() { // from class: androidx.compose.material3.SwipeableV2Kt.fractionalPositionalThreshold.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final Float invoke(Density density, float f2) {
                m.h(density, "$this$null");
                return Float.valueOf(f2 * f);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((Density) obj, ((Number) obj2).floatValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float maxOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float minOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final <T> SwipeableV2State<T> rememberSwipeableV2State(final T t, final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> lVar, Composer composer, int i2, int i3) {
        m.h(t, "initialValue");
        composer.startReplaceableGroup(856267266);
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableV2Defaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            lVar = new l<T, Boolean>() { // from class: androidx.compose.material3.SwipeableV2Kt.rememberSwipeableV2State.1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m1615invoke(T t2) {
                    m.h(t2, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(856267266, i2, -1, "androidx.compose.material3.rememberSwipeableV2State (SwipeableV2.kt:517)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.INSTANCE;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m2460rememberSaveable(new Object[]{t, animationSpec, lVar}, (Saver) companion.m1620SavereqLRuRQ(animationSpec, lVar, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m1613getVelocityThresholdD9Ej5fM()), (String) null, (kj.a) new kj.a<SwipeableV2State<T>>() { // from class: androidx.compose.material3.SwipeableV2Kt.rememberSwipeableV2State.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SwipeableV2State<T> m1616invoke() {
                T t2 = t;
                AnimationSpec<Float> animationSpec2 = animationSpec;
                l<T, Boolean> lVar2 = lVar;
                SwipeableV2Defaults swipeableV2Defaults2 = SwipeableV2Defaults.INSTANCE;
                return new SwipeableV2State<>(t2, animationSpec2, lVar2, swipeableV2Defaults2.getPositionalThreshold(), swipeableV2Defaults2.m1613getVelocityThresholdD9Ej5fM(), null);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableV2State;
    }

    @ExperimentalMaterial3Api
    public static final <T> Modifier swipeAnchors(Modifier modifier, final SwipeableV2State<T> swipeableV2State, final Set<? extends T> set, final AnchorChangeHandler<T> anchorChangeHandler, final p<? super T, ? super IntSize, Float> pVar) {
        m.h(modifier, "<this>");
        m.h(swipeableV2State, "state");
        m.h(set, "possibleValues");
        m.h(pVar, "calculateAnchor");
        return modifier.then(new SwipeAnchorsModifier(new l<Density, j>() { // from class: androidx.compose.material3.SwipeableV2Kt.swipeAnchors.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Density) obj);
                return j.a;
            }

            public final void invoke(Density density) {
                m.h(density, "it");
                swipeableV2State.setDensity$material3_release(density);
            }
        }, new l<IntSize, j>() { // from class: androidx.compose.material3.SwipeableV2Kt.swipeAnchors.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m1617invokeozmzZPI(((IntSize) obj).getPackedValue());
                return j.a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m1617invokeozmzZPI(long j) {
                AnchorChangeHandler<T> anchorChangeHandler2;
                Map anchors$material3_release = swipeableV2State.getAnchors$material3_release();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<T> set2 = set;
                p<T, IntSize, Float> pVar2 = pVar;
                for (Object obj : set2) {
                    Float f = (Float) pVar2.invoke(obj, IntSize.m5419boximpl(j));
                    if (f != null) {
                        linkedHashMap.put(obj, f);
                    }
                }
                if (m.c(anchors$material3_release, linkedHashMap)) {
                    return;
                }
                Object targetValue = swipeableV2State.getTargetValue();
                if (!swipeableV2State.updateAnchors$material3_release(linkedHashMap) || (anchorChangeHandler2 = anchorChangeHandler) == 0) {
                    return;
                }
                anchorChangeHandler2.onAnchorsChanged((T) targetValue, (Map<T, Float>) anchors$material3_release, linkedHashMap);
            }
        }, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.material3.SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "swipeAnchors").set("state", swipeableV2State);
                inspectorInfo.getProperties().set("possibleValues", set);
                inspectorInfo.getProperties().set("anchorChangeHandler", anchorChangeHandler);
                inspectorInfo.getProperties().set("calculateAnchor", pVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier swipeAnchors$default(Modifier modifier, SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, p pVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            anchorChangeHandler = null;
        }
        return swipeAnchors(modifier, swipeableV2State, set, anchorChangeHandler, pVar);
    }

    @ExperimentalMaterial3Api
    public static final <T> Modifier swipeableV2(Modifier modifier, SwipeableV2State<T> swipeableV2State, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource) {
        m.h(modifier, "<this>");
        m.h(swipeableV2State, "state");
        m.h(orientation, "orientation");
        return DraggableKt.draggable(modifier, swipeableV2State.getSwipeDraggableState(), orientation, (32 & 4) != 0 ? true : z, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : swipeableV2State.isAnimationRunning(), (32 & 32) != 0 ? new DraggableKt.C01801(null) : null, (32 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : new C03891(swipeableV2State, null), (32 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? false : z2);
    }

    public static /* synthetic */ Modifier swipeableV2$default(Modifier modifier, SwipeableV2State swipeableV2State, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return swipeableV2(modifier, swipeableV2State, orientation, z3, z4, mutableInteractionSource);
    }
}
