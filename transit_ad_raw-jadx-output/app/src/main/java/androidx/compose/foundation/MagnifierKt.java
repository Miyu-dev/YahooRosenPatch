package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0001H\u0007ø\u0001\u0000\u001ae\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0000\u001a\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001\")\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00148\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroidx/compose/ui/unit/DpSize;", "Lkotlin/j;", "onSizeChanged", "magnifier", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "", "sdkVersion", "", "isPlatformMagnifierSupported", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class MagnifierKt {
    private static final SemanticsPropertyKey<kj.a<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final SemanticsPropertyKey<kj.a<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = androidx.appcompat.R.styleable.AppCompatTheme_actionModeSplitBackground)
    public static final boolean isPlatformMagnifierSupported(int i2) {
        return i2 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i2);
    }

    @RequiresApi(androidx.appcompat.R.styleable.AppCompatTheme_actionModeSplitBackground)
    @SuppressLint({"ModifierInspectorInfo"})
    public static final Modifier magnifier(Modifier modifier, l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, float f, MagnifierStyle magnifierStyle, l<? super DpSize, j> lVar3, PlatformMagnifierFactory platformMagnifierFactory) {
        m.h(modifier, "<this>");
        m.h(lVar, "sourceCenter");
        m.h(lVar2, "magnifierCenter");
        m.h(magnifierStyle, "style");
        m.h(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass4(lVar, lVar2, f, lVar3, platformMagnifierFactory, magnifierStyle), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, l lVar, l lVar2, float f, MagnifierStyle magnifierStyle, l lVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar2 = new l<Density, Offset>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return Offset.m2574boximpl(m234invoketuRUvjQ((Density) obj2));
                }

                /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m234invoketuRUvjQ(Density density) {
                    m.h(density, "$this$null");
                    return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
                }
            };
        }
        l lVar4 = lVar2;
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            magnifierStyle = MagnifierStyle.INSTANCE.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i2 & 16) != 0) {
            lVar3 = null;
        }
        return magnifier(modifier, lVar, lVar4, f2, magnifierStyle2, lVar3);
    }

    @ExperimentalFoundationApi
    public static final Modifier magnifier(Modifier modifier, final l<? super Density, Offset> lVar, final l<? super Density, Offset> lVar2, final float f, final MagnifierStyle magnifierStyle, l<? super DpSize, j> lVar3) {
        m.h(modifier, "<this>");
        m.h(lVar, "sourceCenter");
        m.h(lVar2, "magnifierCenter");
        m.h(magnifierStyle, "style");
        l<InspectorInfo, j> noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", lVar);
                inspectorInfo.getProperties().set("magnifierCenter", lVar2);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f));
                inspectorInfo.getProperties().set("style", magnifierStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier modifierMagnifier = Modifier.INSTANCE;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifierMagnifier = magnifier(modifierMagnifier, lVar, lVar2, f, magnifierStyle, lVar3, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, modifierMagnifier);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4, reason: invalid class name */
    /* JADX INFO: compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass4 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ l<Density, Offset> $magnifierCenter;
        final /* synthetic */ l<DpSize, j> $onSizeChanged;
        final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        final /* synthetic */ l<Density, Offset> $sourceCenter;
        final /* synthetic */ MagnifierStyle $style;
        final /* synthetic */ float $zoom;

        /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: Magnifier.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            final /* synthetic */ Density $density;
            final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
            final /* synthetic */ MutableSharedFlow<j> $onNeedsUpdate;
            final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
            final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
            final /* synthetic */ MagnifierStyle $style;
            final /* synthetic */ State<l<Density, Offset>> $updatedMagnifierCenter$delegate;
            final /* synthetic */ State<l<DpSize, j>> $updatedOnSizeChanged$delegate;
            final /* synthetic */ State<Float> $updatedZoom$delegate;
            final /* synthetic */ View $view;
            final /* synthetic */ float $zoom;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Magnifier.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
            public static final class C00211 extends SuspendLambda implements p<j, dj.c<? super j>, Object> {
                final /* synthetic */ PlatformMagnifier $magnifier;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00211(PlatformMagnifier platformMagnifier, dj.c<? super C00211> cVar) {
                    super(2, cVar);
                    this.$magnifier = platformMagnifier;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new C00211(this.$magnifier, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$magnifier.updateContent();
                    return j.a;
                }

                public final Object invoke(j jVar, dj.c<? super j> cVar) {
                    return create(jVar, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f, MutableSharedFlow<j> mutableSharedFlow, State<? extends l<? super DpSize, j>> state, State<Boolean> state2, State<Offset> state3, State<? extends l<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$platformMagnifierFactory = platformMagnifierFactory;
                this.$style = magnifierStyle;
                this.$view = view;
                this.$density = density;
                this.$zoom = f;
                this.$onNeedsUpdate = mutableSharedFlow;
                this.$updatedOnSizeChanged$delegate = state;
                this.$isMagnifierShown$delegate = state2;
                this.$sourceCenterInRoot$delegate = state3;
                this.$updatedMagnifierCenter$delegate = state4;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedZoom$delegate = state5;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                PlatformMagnifier platformMagnifier;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    platformMagnifier = (PlatformMagnifier) this.L$0;
                    try {
                        li.c.O(obj);
                        platformMagnifier.dismiss();
                        return j.a;
                    } catch (Throwable th) {
                        th = th;
                        platformMagnifier.dismiss();
                        throw th;
                    }
                }
                li.c.O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final PlatformMagnifier platformMagnifierCreate = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                final Ref.LongRef longRef = new Ref.LongRef();
                long jMo259getSizeYbymL2g = platformMagnifierCreate.mo259getSizeYbymL2g();
                Density density = this.$density;
                l lVarInvoke$lambda$6 = AnonymousClass4.invoke$lambda$6(this.$updatedOnSizeChanged$delegate);
                if (lVarInvoke$lambda$6 != null) {
                    lVarInvoke$lambda$6.invoke(DpSize.m5353boximpl(density.mo346toDpSizekrfVVM(IntSizeKt.m5437toSizeozmzZPI(jMo259getSizeYbymL2g))));
                }
                longRef.element = jMo259getSizeYbymL2g;
                FlowKt.launchIn(FlowKt.onEach(this.$onNeedsUpdate, new C00211(platformMagnifierCreate, null)), coroutineScope);
                try {
                    final Density density2 = this.$density;
                    final State<Boolean> state = this.$isMagnifierShown$delegate;
                    final State<Offset> state2 = this.$sourceCenterInRoot$delegate;
                    final State<l<Density, Offset>> state3 = this.$updatedMagnifierCenter$delegate;
                    final MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    final State<Float> state4 = this.$updatedZoom$delegate;
                    final State<l<DpSize, j>> state5 = this.$updatedOnSizeChanged$delegate;
                    Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new kj.a<j>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m235invoke();
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m235invoke() {
                            if (!AnonymousClass4.invoke$lambda$10(state)) {
                                platformMagnifierCreate.dismiss();
                                return;
                            }
                            PlatformMagnifier platformMagnifier2 = platformMagnifierCreate;
                            long jInvoke$lambda$8 = AnonymousClass4.invoke$lambda$8(state2);
                            Object objInvoke = AnonymousClass4.invoke$lambda$4(state3).invoke(density2);
                            MutableState<Offset> mutableState2 = mutableState;
                            long packedValue = ((Offset) objInvoke).getPackedValue();
                            platformMagnifier2.mo260updateWko1d7g(jInvoke$lambda$8, OffsetKt.m2604isSpecifiedk4lQ0M(packedValue) ? Offset.m2590plusMKHz9U(AnonymousClass4.invoke$lambda$1(mutableState2), packedValue) : Offset.INSTANCE.m2600getUnspecifiedF1C5BW0(), AnonymousClass4.invoke$lambda$5(state4));
                            long jMo259getSizeYbymL2g2 = platformMagnifierCreate.mo259getSizeYbymL2g();
                            Ref.LongRef longRef2 = longRef;
                            Density density3 = density2;
                            State<l<DpSize, j>> state6 = state5;
                            if (IntSize.m5425equalsimpl0(jMo259getSizeYbymL2g2, longRef2.element)) {
                                return;
                            }
                            longRef2.element = jMo259getSizeYbymL2g2;
                            l lVarInvoke$lambda$62 = AnonymousClass4.invoke$lambda$6(state6);
                            if (lVarInvoke$lambda$62 != null) {
                                lVarInvoke$lambda$62.invoke(DpSize.m5353boximpl(density3.mo346toDpSizekrfVVM(IntSizeKt.m5437toSizeozmzZPI(jMo259getSizeYbymL2g2))));
                            }
                        }
                    });
                    this.L$0 = platformMagnifierCreate;
                    this.label = 1;
                    if (FlowKt.collect(flowSnapshotFlow, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    return j.a;
                } catch (Throwable th2) {
                    th = th2;
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, float f, l<? super DpSize, j> lVar3, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
            super(3);
            this.$sourceCenter = lVar;
            this.$magnifierCenter = lVar2;
            this.$zoom = f;
            this.$onSizeChanged = lVar3;
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<Offset> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$10(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<Offset> mutableState, long j) {
            mutableState.setValue(Offset.m2574boximpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final l<Density, Offset> invoke$lambda$3(State<? extends l<? super Density, Offset>> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final l<Density, Offset> invoke$lambda$4(State<? extends l<? super Density, Offset>> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$5(State<Float> state) {
            return state.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final l<DpSize, j> invoke$lambda$6(State<? extends l<? super DpSize, j>> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$8(State<Offset> state) {
            return state.getValue().getPackedValue();
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            if (androidx.compose.animation.b.n(modifier, "$this$composed", composer, -454877003)) {
                ComposerKt.traceEventStart(-454877003, i2, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2574boximpl(Offset.INSTANCE.m2600getUnspecifiedF1C5BW0()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new kj.a<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m2574boximpl(m238invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m238invokeF1C5BW0() {
                        long packedValue = ((Offset) MagnifierKt.AnonymousClass4.invoke$lambda$3(stateRememberUpdatedState).invoke(density)).getPackedValue();
                        return (OffsetKt.m2604isSpecifiedk4lQ0M(MagnifierKt.AnonymousClass4.invoke$lambda$1(mutableState)) && OffsetKt.m2604isSpecifiedk4lQ0M(packedValue)) ? Offset.m2590plusMKHz9U(MagnifierKt.AnonymousClass4.invoke$lambda$1(mutableState), packedValue) : Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final State state = (State) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new kj.a<Boolean>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$isMagnifierShown$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m237invoke() {
                        return Boolean.valueOf(OffsetKt.m2604isSpecifiedk4lQ0M(MagnifierKt.AnonymousClass4.invoke$lambda$8(state)));
                    }
                });
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            State state2 = (State) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) objRememberedValue4;
            float f = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
            MagnifierStyle magnifierStyle = this.$style;
            EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f), magnifierStyle, Boolean.valueOf(m.c(magnifierStyle, MagnifierStyle.INSTANCE.getTextDefault()))}, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, mutableSharedFlow, stateRememberUpdatedState4, state2, state, stateRememberUpdatedState2, mutableState, stateRememberUpdatedState3, null), composer, 72);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(mutableState);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new l<LayoutCoordinates, j>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return j.a;
                    }

                    public final void invoke(LayoutCoordinates layoutCoordinates) {
                        m.h(layoutCoordinates, "it");
                        MagnifierKt.AnonymousClass4.invoke$lambda$2(mutableState, LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (l) objRememberedValue5), new l<DrawScope, j>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return j.a;
                }

                public final void invoke(DrawScope drawScope) {
                    m.h(drawScope, "$this$drawBehind");
                    mutableSharedFlow.tryEmit(j.a);
                }
            });
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(state);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return j.a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        m.h(semanticsPropertyReceiver, "$this$semantics");
                        SemanticsPropertyKey<kj.a<Offset>> magnifierPositionInRoot = MagnifierKt.getMagnifierPositionInRoot();
                        final State<Offset> state3 = state;
                        semanticsPropertyReceiver.set(magnifierPositionInRoot, new kj.a<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            public /* bridge */ /* synthetic */ Object invoke() {
                                return Offset.m2574boximpl(m236invokeF1C5BW0());
                            }

                            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                            public final long m236invokeF1C5BW0() {
                                return MagnifierKt.AnonymousClass4.invoke$lambda$8(state3);
                            }
                        });
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierDrawBehind, false, (l) objRememberedValue6, 1, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierSemantics$default;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }
}
