package androidx.compose.foundation;

import androidx.appcompat.widget.s;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H\u0007\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class FocusableKt {
    private static final InspectableModifier focusGroupInspectorInfo;

    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
    }

    @ExperimentalFoundationApi
    public static final Modifier focusGroup(Modifier modifier) {
        m.h(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), new l<FocusProperties, j>() { // from class: androidx.compose.foundation.FocusableKt.focusGroup.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return j.a;
            }

            public final void invoke(FocusProperties focusProperties) {
                m.h(focusProperties, "$this$focusProperties");
                focusProperties.setCanFocus(false);
            }
        }));
    }

    public static final Modifier focusable(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource) {
        m.h(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "focusable"), "enabled", inspectorInfo).set("interactionSource", mutableInteractionSource);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(mutableInteractionSource, z));
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource) {
        m.h(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "focusableInNonTouchMode"), "enabled", inspectorInfo).set("interactionSource", mutableInteractionSource);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -618949501)) {
                    ComposerKt.traceEventStart(-618949501, i2, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)");
                }
                final InputModeManager inputModeManager = (InputModeManager) composer.consume(CompositionLocalsKt.getLocalInputModeManager());
                Modifier modifierFocusable = FocusableKt.focusable(FocusPropertiesKt.focusProperties(Modifier.INSTANCE, new l<FocusProperties, j>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FocusProperties) obj);
                        return j.a;
                    }

                    public final void invoke(FocusProperties focusProperties) {
                        m.h(focusProperties, "$this$focusProperties");
                        focusProperties.setCanFocus(!InputMode.m3405equalsimpl0(inputModeManager.mo3411getInputModeaOaMEAU(), InputMode.INSTANCE.m3410getTouchaOaMEAU()));
                    }
                }), z, mutableInteractionSource);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierFocusable;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2, reason: invalid class name */
    /* JADX INFO: compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass2 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableInteractionSource mutableInteractionSource, boolean z) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$10(MutableState<PinnableContainer.PinnedHandle> mutableState, PinnableContainer.PinnedHandle pinnedHandle) {
            mutableState.setValue(pinnedHandle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$2(MutableState<Boolean> mutableState) {
            return mutableState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(MutableState<Boolean> mutableState, boolean z) {
            mutableState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PinnableContainer.PinnedHandle invoke$lambda$9(MutableState<PinnableContainer.PinnedHandle> mutableState) {
            return mutableState.getValue();
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            Modifier modifierFocusTarget;
            Modifier modifier2;
            if (androidx.compose.animation.b.n(modifier, "$this$composed", composer, 1871352361)) {
                ComposerKt.traceEventStart(1871352361, i2, -1, "androidx.compose.foundation.focusable.<anonymous> (Focusable.kt:67)");
            }
            Object objD = s.d(composer, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objD == companion.getEmpty()) {
                objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FocusRequester();
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = BringIntoViewRequesterKt.BringIntoViewRequester();
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue4;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        m.h(disposableEffectScope, "$this$DisposableEffect");
                        final MutableState<FocusInteraction.Focus> mutableState3 = mutableState;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                FocusInteraction.Focus focus = (FocusInteraction.Focus) mutableState3.getValue();
                                if (focus != null) {
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                    if (mutableInteractionSource3 != null) {
                                        mutableInteractionSource3.tryEmit(unfocus);
                                    }
                                    mutableState3.setValue(null);
                                }
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(this.$enabled);
            final boolean z = this.$enabled;
            final MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            EffectsKt.DisposableEffect(boolValueOf, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.2

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, dj.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                            if (value != null) {
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                if (mutableInteractionSource != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource.emit(unfocus, this) == coroutineSingletons) {
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
                {
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    m.h(disposableEffectScope, "$this$DisposableEffect");
                    if (!z) {
                        BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(mutableState, mutableInteractionSource2, null), 3, (Object) null);
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, composer, 0);
            if (this.$enabled) {
                composer.startReplaceableGroup(1407540673);
                if (invoke$lambda$2(mutableState2)) {
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new FocusedBoundsModifier();
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    composer.endReplaceableGroup();
                    modifier2 = (Modifier) objRememberedValue6;
                } else {
                    modifier2 = Modifier.INSTANCE;
                }
                composer.endReplaceableGroup();
                final PinnableContainer pinnableContainer = (PinnableContainer) composer.consume(PinnableContainerKt.getLocalPinnableContainer());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState3 = (MutableState) objRememberedValue7;
                composer.startReplaceableGroup(1618982084);
                boolean zChanged2 = composer.changed(mutableState2) | composer.changed(mutableState3) | composer.changed(pinnableContainer);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            m.h(disposableEffectScope, "$this$DisposableEffect");
                            if (FocusableKt.AnonymousClass2.invoke$lambda$2(mutableState2)) {
                                MutableState<PinnableContainer.PinnedHandle> mutableState4 = mutableState3;
                                PinnableContainer pinnableContainer2 = pinnableContainer;
                                FocusableKt.AnonymousClass2.invoke$lambda$10(mutableState4, pinnableContainer2 != null ? pinnableContainer2.pin() : null);
                            }
                            final MutableState<PinnableContainer.PinnedHandle> mutableState5 = mutableState3;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$3$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PinnableContainer.PinnedHandle pinnedHandleInvoke$lambda$9 = FocusableKt.AnonymousClass2.invoke$lambda$9(mutableState5);
                                    if (pinnedHandleInvoke$lambda$9 != null) {
                                        pinnedHandleInvoke$lambda$9.release();
                                    }
                                    FocusableKt.AnonymousClass2.invoke$lambda$10(mutableState5, null);
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(pinnableContainer, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceableGroup(511388516);
                boolean zChanged3 = composer.changed(mutableState2) | composer.changed(focusRequester);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1
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
                            SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, FocusableKt.AnonymousClass2.invoke$lambda$2(mutableState2));
                            final FocusRequester focusRequester2 = focusRequester;
                            final MutableState<Boolean> mutableState4 = mutableState2;
                            SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new kj.a<Boolean>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                public final Boolean m230invoke() {
                                    focusRequester2.requestFocus();
                                    return Boolean.valueOf(FocusableKt.AnonymousClass2.invoke$lambda$2(mutableState4));
                                }
                            }, 1, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue9);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(SemanticsModifierKt.semantics$default(companion2, false, (l) objRememberedValue9, 1, null), bringIntoViewRequester), focusRequester).then(modifier2);
                final MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                modifierFocusTarget = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(modifierThen, new l<FocusState, j>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.5

                    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Focusable.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = {147, 151, 154}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
                        final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, BringIntoViewRequester bringIntoViewRequester, dj.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                            this.$bringIntoViewRequester = bringIntoViewRequester;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, this.$bringIntoViewRequester, cVar);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[RETURN] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                            /*
                                r8 = this;
                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r1 = r8.label
                                r2 = 3
                                r3 = 2
                                r4 = 1
                                r5 = 0
                                if (r1 == 0) goto L2c
                                if (r1 == r4) goto L24
                                if (r1 == r3) goto L1c
                                if (r1 != r2) goto L14
                                li.c.O(r9)
                                goto L7a
                            L14:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r0)
                                throw r9
                            L1c:
                                java.lang.Object r1 = r8.L$0
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r1 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r1
                                li.c.O(r9)
                                goto L68
                            L24:
                                java.lang.Object r1 = r8.L$0
                                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                li.c.O(r9)
                                goto L50
                            L2c:
                                li.c.O(r9)
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r9 = r8.$focusedInteraction
                                java.lang.Object r9 = r9.getValue()
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r9 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r9
                                if (r9 == 0) goto L54
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r8.$interactionSource
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r6 = r8.$focusedInteraction
                                androidx.compose.foundation.interaction.FocusInteraction$Unfocus r7 = new androidx.compose.foundation.interaction.FocusInteraction$Unfocus
                                r7.<init>(r9)
                                if (r1 == 0) goto L51
                                r8.L$0 = r6
                                r8.label = r4
                                java.lang.Object r9 = r1.emit(r7, r8)
                                if (r9 != r0) goto L4f
                                return r0
                            L4f:
                                r1 = r6
                            L50:
                                r6 = r1
                            L51:
                                r6.setValue(r5)
                            L54:
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r1 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
                                r1.<init>()
                                androidx.compose.foundation.interaction.MutableInteractionSource r9 = r8.$interactionSource
                                if (r9 == 0) goto L68
                                r8.L$0 = r1
                                r8.label = r3
                                java.lang.Object r9 = r9.emit(r1, r8)
                                if (r9 != r0) goto L68
                                return r0
                            L68:
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r9 = r8.$focusedInteraction
                                r9.setValue(r1)
                                androidx.compose.foundation.relocation.BringIntoViewRequester r9 = r8.$bringIntoViewRequester
                                r8.L$0 = r5
                                r8.label = r2
                                java.lang.Object r9 = androidx.compose.foundation.relocation.a.a(r9, r5, r8, r4, r5)
                                if (r9 != r0) goto L7a
                                return r0
                            L7a:
                                kotlin.j r9 = kotlin.j.a
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.FocusableKt.AnonymousClass2.AnonymousClass5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                            return create(coroutineScope, cVar).invokeSuspend(j.a);
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: Focusable.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = {162}, m = "invokeSuspend")
                    public static final class C00182 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00182(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, dj.c<? super C00182> cVar) {
                            super(2, cVar);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new C00182(this.$focusedInteraction, this.$interactionSource, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            MutableState<FocusInteraction.Focus> mutableState;
                            MutableState<FocusInteraction.Focus> mutableState2;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                li.c.O(obj);
                                FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                if (value != null) {
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$focusedInteraction;
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(unfocus, this) == coroutineSingletons) {
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
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FocusState) obj);
                        return j.a;
                    }

                    public final void invoke(FocusState focusState) {
                        m.h(focusState, "it");
                        AnonymousClass2.invoke$lambda$3(mutableState2, focusState.isFocused());
                        if (AnonymousClass2.invoke$lambda$2(mutableState2)) {
                            MutableState<PinnableContainer.PinnedHandle> mutableState4 = mutableState3;
                            PinnableContainer pinnableContainer2 = pinnableContainer;
                            AnonymousClass2.invoke$lambda$10(mutableState4, pinnableContainer2 != null ? pinnableContainer2.pin() : null);
                            BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(mutableState, mutableInteractionSource3, bringIntoViewRequester, null), 3, (Object) null);
                            return;
                        }
                        PinnableContainer.PinnedHandle pinnedHandleInvoke$lambda$9 = AnonymousClass2.invoke$lambda$9(mutableState3);
                        if (pinnedHandleInvoke$lambda$9 != null) {
                            pinnedHandleInvoke$lambda$9.release();
                        }
                        AnonymousClass2.invoke$lambda$10(mutableState3, null);
                        BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new C00182(mutableState, mutableInteractionSource3, null), 3, (Object) null);
                    }
                }));
            } else {
                modifierFocusTarget = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierFocusTarget;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }
}
