package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import dj.e;
import ej.c;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000ø\u0001\u0000\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", "animatedSelectionMagnifier", "targetCalculation", "Landroidx/compose/runtime/State;", "rememberAnimatedMagnifierPosition", "(Lkj/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/TwoWayConverter;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "OffsetDisplacementThreshold", "J", "Landroidx/compose/animation/core/SpringSpec;", "MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class SelectionMagnifierKt {
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new l<Offset, AnimationVector2D>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m936invokek4lQ0M(((Offset) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m936invokek4lQ0M(long j) {
            return OffsetKt.m2604isSpecifiedk4lQ0M(j) ? new AnimationVector2D(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j)) : SelectionMagnifierKt.UnspecifiedAnimationVector2D;
        }
    }, new l<AnimationVector2D, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m2574boximpl(m937invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m937invoketuRUvjQ(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @c(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
    public static final class C02721 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
        final /* synthetic */ State<Offset> $targetValue$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02721(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, dj.c<? super C02721> cVar) {
            super(2, cVar);
            this.$targetValue$delegate = state;
            this.$animatable = animatable;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C02721 c02721 = new C02721(this.$targetValue$delegate, this.$animatable, cVar);
            c02721.L$0 = obj;
            return c02721;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final State<Offset> state = this.$targetValue$delegate;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new kj.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m2574boximpl(m939invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m939invokeF1C5BW0() {
                        return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
                    }
                });
                final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
                FlowCollector<Offset> flowCollector = new FlowCollector<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.2
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, dj.c cVar) {
                        return m940emit3MmeM6k(((Offset) obj2).getPackedValue(), cVar);
                    }

                    /* JADX INFO: renamed from: emit-3MmeM6k, reason: not valid java name */
                    public final Object m940emit3MmeM6k(long j, dj.c<? super j> cVar) {
                        if (OffsetKt.m2604isSpecifiedk4lQ0M(animatable.getValue().getPackedValue()) && OffsetKt.m2604isSpecifiedk4lQ0M(j)) {
                            if (!(Offset.m2586getYimpl(animatable.getValue().getPackedValue()) == Offset.m2586getYimpl(j))) {
                                BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(animatable, j, null), 3, (Object) null);
                                return j.a;
                            }
                        }
                        Object objSnapTo = animatable.snapTo(Offset.m2574boximpl(j), cVar);
                        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : j.a;
                    }
                };
                this.label = 1;
                if (flowSnapshotFlow.collect(flowCollector, this) == coroutineSingletons) {
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

    static {
        long jOffset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = jOffset;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m2574boximpl(jOffset), 3, null);
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, kj.a<Offset> aVar, l<? super kj.a<Offset>, ? extends Modifier> lVar) {
        m.h(modifier, "<this>");
        m.h(aVar, "magnifierCenter");
        m.h(lVar, "platformMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(aVar, lVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Offset> rememberAnimatedMagnifierPosition(kj.a<Offset> aVar, Composer composer, int i2) {
        composer.startReplaceableGroup(-1589795249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i2, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(aVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Animatable(Offset.m2574boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m2574boximpl(OffsetDisplacementThreshold));
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue2;
        EffectsKt.LaunchedEffect(j.a, new C02721(state, animatable, null), composer, 70);
        State<Offset> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().getPackedValue();
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ kj.a<Offset> $magnifierCenter;
        final /* synthetic */ l<kj.a<Offset>, Modifier> $platformMagnifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kj.a<Offset> aVar, l<? super kj.a<Offset>, ? extends Modifier> lVar) {
            super(3);
            this.$magnifierCenter = aVar;
            this.$platformMagnifier = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$0(State<Offset> state) {
            return state.getValue().getPackedValue();
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            if (androidx.compose.animation.b.n(modifier, "$this$composed", composer, 759876635)) {
                ComposerKt.traceEventStart(759876635, i2, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:66)");
            }
            final State stateRememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
            l<kj.a<Offset>, Modifier> lVar = this.$platformMagnifier;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(stateRememberAnimatedMagnifierPosition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kj.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m2574boximpl(m938invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m938invokeF1C5BW0() {
                        return SelectionMagnifierKt.AnonymousClass1.invoke$lambda$0(stateRememberAnimatedMagnifierPosition);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier modifier2 = (Modifier) lVar.invoke(objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifier2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }
}
