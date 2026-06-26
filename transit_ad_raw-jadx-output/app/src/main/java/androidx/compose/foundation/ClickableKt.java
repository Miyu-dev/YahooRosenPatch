package androidx.compose.foundation;

import androidx.appcompat.widget.s;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001ay\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a>\u0010!\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0\u001eH\u0001ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001aQ\u0010*\u001a\u00020\b*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070&H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a«\u0001\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020,2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020$0&2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Lkotlin/j;", "onClick", "clickable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkj/a;)Landroidx/compose/ui/Modifier;", "clickable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "clickable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkj/a;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-cJG_KMw", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkj/a;Lkj/a;Lkj/a;)Landroidx/compose/ui/Modifier;", "combinedClickable", "combinedClickable-XVZzFYc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkj/a;Lkj/a;Lkj/a;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressedInteraction", "", "Landroidx/compose/ui/input/key/Key;", "currentKeyPressInteractions", "PressedInteractionSourceDisposableEffect", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pressPoint", "Landroidx/compose/runtime/State;", "delayPressInteraction", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Ldj/c;)Ljava/lang/Object;", "handlePressInteraction", "gestureModifiers", "Lkotlinx/coroutines/CoroutineScope;", "indicationScope", "keyClickOffset", "genericClickableWithoutGesture-bdNGguI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Lkotlinx/coroutines/CoroutineScope;Ljava/util/Map;Landroidx/compose/runtime/State;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkj/a;Lkj/a;)Landroidx/compose/ui/Modifier;", "genericClickableWithoutGesture", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ClickableKt {
    @Composable
    public static final void PressedInteractionSourceDisposableEffect(final MutableInteractionSource mutableInteractionSource, final MutableState<PressInteraction.Press> mutableState, final Map<Key, PressInteraction.Press> map, Composer composer, final int i2) {
        m.h(mutableInteractionSource, "interactionSource");
        m.h(mutableState, "pressedInteraction");
        m.h(map, "currentKeyPressInteractions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297229208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297229208, i2, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.DisposableEffect(mutableInteractionSource, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                m.h(disposableEffectScope, "$this$DisposableEffect");
                final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                final Map<Key, PressInteraction.Press> map2 = map;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                        if (press != null) {
                            mutableInteractionSource2.tryEmit(new PressInteraction.Cancel(press));
                            mutableState2.setValue(null);
                        }
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            mutableInteractionSource2.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
                        }
                        map2.clear();
                    }
                };
            }
        }, composerStartRestartGroup, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i3) {
                ClickableKt.PressedInteractionSourceDisposableEffect(mutableInteractionSource, mutableState, map, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m203clickableO2vRcR0(Modifier modifier, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final kj.a<j> aVar) {
        m.h(modifier, "$this$clickable");
        m.h(mutableInteractionSource, "interactionSource");
        m.h(aVar, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "clickable"), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 92076020)) {
                    ComposerKt.traceEventStart(92076020, i2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Map map = (Map) objRememberedValue2;
                composer.startReplaceableGroup(1841981561);
                if (z) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(mutableInteractionSource, mutableState, map, composer, 560);
                }
                composer.endReplaceableGroup();
                final kj.a<Boolean> aVarIsComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue3;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState2) | composer.changed(aVarIsComposeRootInScrollableContainer);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new kj.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Boolean m214invoke() {
                            return Boolean.valueOf(mutableState2.getValue().booleanValue() || ((Boolean) aVarIsComposeRootInScrollableContainer.invoke()).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue4, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2574boximpl(Offset.INSTANCE.m2601getZeroF1C5BW0()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                MutableState mutableState3 = (MutableState) objRememberedValue5;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Boolean boolValueOf = Boolean.valueOf(z);
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Object[] objArr = {mutableState3, Boolean.valueOf(z), mutableInteractionSource3, mutableState, stateRememberUpdatedState2, stateRememberUpdatedState};
                boolean z2 = z;
                composer.startReplaceableGroup(-568225417);
                int i3 = 0;
                boolean zChanged2 = false;
                for (int i4 = 6; i3 < i4; i4 = 6) {
                    zChanged2 |= composer.changed(objArr[i3]);
                    i3++;
                }
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(mutableState3, z2, mutableInteractionSource3, mutableState, stateRememberUpdatedState2, stateRememberUpdatedState, null);
                    composer.updateRememberedValue(clickableKt$clickable$4$gesture$1$1);
                    objRememberedValue6 = clickableKt$clickable$4$gesture$1$1;
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource2, boolValueOf, (p) objRememberedValue6);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue7 = composer.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue7 == companion4.getEmpty()) {
                    objRememberedValue7 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$1$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ boolean all(l lVar) {
                            return androidx.compose.ui.b.a(this, lVar);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ boolean any(l lVar) {
                            return androidx.compose.ui.b.b(this, lVar);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ Object foldIn(Object obj, p pVar) {
                            return androidx.compose.ui.b.c(this, obj, pVar);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ Object foldOut(Object obj, p pVar) {
                            return androidx.compose.ui.b.d(this, obj, pVar);
                        }

                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
                            m.h(modifierLocalReadScope, "scope");
                            mutableState2.setValue((Boolean) modifierLocalReadScope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.ui.Modifier
                        public final /* synthetic */ Modifier then(Modifier modifier3) {
                            return androidx.compose.ui.a.a(this, modifier3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = companion3.then((Modifier) objRememberedValue7);
                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Indication indication2 = indication;
                Object objD = s.d(composer, 773894976, -492369756);
                if (objD == companion4.getEmpty()) {
                    objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier modifierM211genericClickableWithoutGesturebdNGguI = ClickableKt.m211genericClickableWithoutGesturebdNGguI(modifierThen, modifierPointerInput, mutableInteractionSource4, indication2, coroutineScope, map, mutableState3, z, str, role, null, null, aVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM211genericClickableWithoutGesturebdNGguI;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m204clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, kj.a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return m203clickableO2vRcR0(modifier, mutableInteractionSource, indication, z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : role, aVar);
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m205clickableXHw0xAI(Modifier modifier, final boolean z, final String str, final Role role, final kj.a<j> aVar) {
        m.h(modifier, "$this$clickable");
        m.h(aVar, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "clickable"), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -756081143)) {
                    ComposerKt.traceEventStart(-756081143, i2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:92)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM203clickableO2vRcR0 = ClickableKt.m203clickableO2vRcR0(companion, (MutableInteractionSource) objRememberedValue, indication, z, str, role, aVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM203clickableO2vRcR0;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m206clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, kj.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m205clickableXHw0xAI(modifier, z, str, role, aVar);
    }

    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final Modifier m207combinedClickableXVZzFYc(Modifier modifier, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final String str2, final kj.a<j> aVar, final kj.a<j> aVar2, final kj.a<j> aVar3) {
        m.h(modifier, "$this$combinedClickable");
        m.h(mutableInteractionSource, "interactionSource");
        m.h(aVar3, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "combinedClickable"), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar3);
                inspectorInfo.getProperties().set("onDoubleClick", aVar2);
                inspectorInfo.getProperties().set("onLongClick", aVar);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                Object[] objArr;
                final MutableState mutableState;
                Map map;
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 1841718000)) {
                    ComposerKt.traceEventStart(1841718000, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar3, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(aVar, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(aVar2, composer, 0);
                boolean z2 = aVar != null;
                boolean z3 = aVar2 != null;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Map map2 = (Map) objRememberedValue2;
                composer.startReplaceableGroup(1321107720);
                if (z) {
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    composer.startReplaceableGroup(511388516);
                    boolean zChanged = composer.changed(mutableState2) | composer.changed(mutableInteractionSource2);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                m.h(disposableEffectScope, "$this$DisposableEffect");
                                final MutableState<PressInteraction.Press> mutableState3 = mutableState2;
                                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PressInteraction.Press press = (PressInteraction.Press) mutableState3.getValue();
                                        if (press != null) {
                                            mutableInteractionSource3.tryEmit(new PressInteraction.Cancel(press));
                                            mutableState3.setValue(null);
                                        }
                                    }
                                };
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    EffectsKt.DisposableEffect(boolValueOf, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
                    ClickableKt.PressedInteractionSourceDisposableEffect(mutableInteractionSource, mutableState2, map2, composer, 560);
                }
                composer.endReplaceableGroup();
                final kj.a<Boolean> aVarIsComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState3 = (MutableState) objRememberedValue4;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(mutableState3) | composer.changed(aVarIsComposeRootInScrollableContainer);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new kj.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Boolean m217invoke() {
                            return Boolean.valueOf(mutableState3.getValue().booleanValue() || ((Boolean) aVarIsComposeRootInScrollableContainer.invoke()).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(objRememberedValue5, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2574boximpl(Offset.INSTANCE.m2601getZeroF1C5BW0()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceableGroup();
                MutableState mutableState4 = (MutableState) objRememberedValue6;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Object[] objArr2 = {mutableInteractionSource, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z)};
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Object[] objArr3 = {mutableState4, Boolean.valueOf(z3), Boolean.valueOf(z), stateRememberUpdatedState3, Boolean.valueOf(z2), stateRememberUpdatedState2, mutableInteractionSource3, mutableState2, stateRememberUpdatedState4, stateRememberUpdatedState};
                boolean z4 = z;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged3 = false;
                int i3 = 0;
                for (int i4 = 10; i3 < i4; i4 = 10) {
                    zChanged3 |= composer.changed(objArr3[i3]);
                    i3++;
                }
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objArr = objArr2;
                    mutableState = mutableState3;
                    map = map2;
                    objRememberedValue7 = new ClickableKt$combinedClickable$4$gesture$1$1(mutableState4, z3, z4, z2, stateRememberUpdatedState3, stateRememberUpdatedState2, mutableInteractionSource3, mutableState2, stateRememberUpdatedState4, stateRememberUpdatedState, null);
                    composer.updateRememberedValue(objRememberedValue7);
                } else {
                    mutableState = mutableState3;
                    map = map2;
                    objArr = objArr2;
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, objArr, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue7);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue8 = composer.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue8 == companion4.getEmpty()) {
                    objRememberedValue8 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ boolean all(l lVar) {
                            return androidx.compose.ui.b.a(this, lVar);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ boolean any(l lVar) {
                            return androidx.compose.ui.b.b(this, lVar);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ Object foldIn(Object obj, p pVar) {
                            return androidx.compose.ui.b.c(this, obj, pVar);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public final /* synthetic */ Object foldOut(Object obj, p pVar) {
                            return androidx.compose.ui.b.d(this, obj, pVar);
                        }

                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
                            m.h(modifierLocalReadScope, "scope");
                            mutableState.setValue((Boolean) modifierLocalReadScope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.ui.Modifier
                        public final /* synthetic */ Modifier then(Modifier modifier3) {
                            return androidx.compose.ui.a.a(this, modifier3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = companion3.then((Modifier) objRememberedValue8);
                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Indication indication2 = indication;
                Object objD = s.d(composer, 773894976, -492369756);
                if (objD == companion4.getEmpty()) {
                    objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier modifierM211genericClickableWithoutGesturebdNGguI = ClickableKt.m211genericClickableWithoutGesturebdNGguI(modifierThen, modifierPointerInput, mutableInteractionSource4, indication2, coroutineScope, map, mutableState4, z, str, role, str2, aVar, aVar3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM211genericClickableWithoutGesturebdNGguI;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final Modifier m209combinedClickablecJG_KMw(Modifier modifier, final boolean z, final String str, final Role role, final String str2, final kj.a<j> aVar, final kj.a<j> aVar2, final kj.a<j> aVar3) {
        m.h(modifier, "$this$combinedClickable");
        m.h(aVar3, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "combinedClickable"), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar3);
                inspectorInfo.getProperties().set("onDoubleClick", aVar2);
                inspectorInfo.getProperties().set("onLongClick", aVar);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 1969174843)) {
                    ComposerKt.traceEventStart(1969174843, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM207combinedClickableXVZzFYc = ClickableKt.m207combinedClickableXVZzFYc(companion, (MutableInteractionSource) objRememberedValue, indication, z, str, role, str2, aVar, aVar2, aVar3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM207combinedClickableXVZzFYc;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: genericClickableWithoutGesture-bdNGguI, reason: not valid java name */
    public static final Modifier m211genericClickableWithoutGesturebdNGguI(Modifier modifier, Modifier modifier2, MutableInteractionSource mutableInteractionSource, Indication indication, CoroutineScope coroutineScope, Map<Key, PressInteraction.Press> map, State<Offset> state, boolean z, String str, Role role, String str2, kj.a<j> aVar, kj.a<j> aVar2) {
        m.h(modifier, "$this$genericClickableWithoutGesture");
        m.h(modifier2, "gestureModifiers");
        m.h(mutableInteractionSource, "interactionSource");
        m.h(coroutineScope, "indicationScope");
        m.h(map, "currentKeyPressInteractions");
        m.h(state, "keyClickOffset");
        m.h(aVar2, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_bdNGguI$detectPressAndClickFromKey(genericClickableWithoutGesture_bdNGguI$clickSemantics(modifier, role, str, aVar, str2, z, aVar2), z, map, state, coroutineScope, aVar2, mutableInteractionSource), mutableInteractionSource, indication), mutableInteractionSource, z), z, mutableInteractionSource).then(modifier2);
    }

    private static final Modifier genericClickableWithoutGesture_bdNGguI$clickSemantics(Modifier modifier, final Role role, final String str, final kj.a<j> aVar, final String str2, final boolean z, final kj.a<j> aVar2) {
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1
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
                Role role2 = role;
                if (role2 != null) {
                    SemanticsPropertiesKt.m4654setRolekuIjeqM(semanticsPropertyReceiver, role2.getValue());
                }
                String str3 = str;
                final kj.a<j> aVar3 = aVar2;
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, str3, new kj.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m222invoke() {
                        aVar3.invoke();
                        return Boolean.TRUE;
                    }
                });
                final kj.a<j> aVar4 = aVar;
                if (aVar4 != null) {
                    SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new kj.a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Boolean m223invoke() {
                            aVar4.invoke();
                            return Boolean.TRUE;
                        }
                    });
                }
                if (z) {
                    return;
                }
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
        });
    }

    private static final Modifier genericClickableWithoutGesture_bdNGguI$detectPressAndClickFromKey(Modifier modifier, final boolean z, final Map<Key, PressInteraction.Press> map, final State<Offset> state, final CoroutineScope coroutineScope, final kj.a<j> aVar, final MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1

            /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Clickable.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", l = {540}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ PressInteraction.Press $press;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$interactionSource = mutableInteractionSource;
                    this.$press = press;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass1(this.$interactionSource, this.$press, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        PressInteraction.Press press = this.$press;
                        this.label = 1;
                        if (mutableInteractionSource.emit(press, this) == coroutineSingletons) {
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
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m224invokeZmokQxo(((KeyEvent) obj).m4001unboximpl());
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean m224invokeZmokQxo(android.view.KeyEvent r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "keyEvent"
                    kotlin.jvm.internal.m.h(r11, r0)
                    boolean r0 = r1
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    if (r0 == 0) goto L52
                    boolean r0 = androidx.compose.foundation.Clickable_androidKt.m227isPressZmokQxo(r11)
                    if (r0 == 0) goto L52
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r2
                    long r4 = androidx.compose.ui.input.key.KeyEvent_androidKt.m4012getKeyZmokQxo(r11)
                    androidx.compose.ui.input.key.Key r4 = androidx.compose.ui.input.key.Key.m3414boximpl(r4)
                    boolean r0 = r0.containsKey(r4)
                    if (r0 != 0) goto L84
                    androidx.compose.foundation.interaction.PressInteraction$Press r0 = new androidx.compose.foundation.interaction.PressInteraction$Press
                    androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> r2 = r3
                    java.lang.Object r2 = r2.getValue()
                    androidx.compose.ui.geometry.Offset r2 = (androidx.compose.ui.geometry.Offset) r2
                    long r4 = r2.getPackedValue()
                    r0.<init>(r4, r3)
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r2
                    long r4 = androidx.compose.ui.input.key.KeyEvent_androidKt.m4012getKeyZmokQxo(r11)
                    androidx.compose.ui.input.key.Key r11 = androidx.compose.ui.input.key.Key.m3414boximpl(r4)
                    r2.put(r11, r0)
                    kotlinx.coroutines.CoroutineScope r4 = r4
                    r5 = 0
                    r6 = 0
                    androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1 r7 = new androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1
                    androidx.compose.foundation.interaction.MutableInteractionSource r11 = r6
                    r7.<init>(r11, r0, r3)
                    r8 = 3
                    r9 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                    goto L85
                L52:
                    boolean r0 = r1
                    if (r0 == 0) goto L84
                    boolean r0 = androidx.compose.foundation.Clickable_androidKt.m225isClickZmokQxo(r11)
                    if (r0 == 0) goto L84
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r2
                    long r4 = androidx.compose.ui.input.key.KeyEvent_androidKt.m4012getKeyZmokQxo(r11)
                    androidx.compose.ui.input.key.Key r11 = androidx.compose.ui.input.key.Key.m3414boximpl(r4)
                    java.lang.Object r11 = r0.remove(r11)
                    androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
                    if (r11 == 0) goto L7e
                    kotlinx.coroutines.CoroutineScope r4 = r4
                    androidx.compose.foundation.interaction.MutableInteractionSource r0 = r6
                    r5 = 0
                    r6 = 0
                    androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 r7 = new androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1
                    r7.<init>(r0, r11, r3)
                    r8 = 3
                    r9 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                L7e:
                    kj.a<kotlin.j> r11 = r5
                    r11.invoke()
                    goto L85
                L84:
                    r1 = r2
                L85:
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1.m224invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
            }
        });
    }

    /* JADX INFO: renamed from: handlePressInteraction-EPk0efs, reason: not valid java name */
    public static final Object m213handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends kj.a<Boolean>> state, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ClickableKt$handlePressInteraction$2(pressGestureScope, j, mutableInteractionSource, mutableState, state, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }
}
