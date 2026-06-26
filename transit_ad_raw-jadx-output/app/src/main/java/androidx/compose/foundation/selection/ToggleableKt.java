package androidx.compose.foundation.selection;

import androidx.compose.animation.b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kj.a;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a[\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aU\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Lkotlin/j;", "onValueChange", "toggleable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkj/l;)Landroidx/compose/ui/Modifier;", "toggleable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "toggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkj/l;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "triStateToggleable-XHw0xAI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;ZLandroidx/compose/ui/semantics/Role;Lkj/a;)Landroidx/compose/ui/Modifier;", "triStateToggleable", "triStateToggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkj/a;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ToggleableKt {
    /* JADX INFO: renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m755toggleableO2vRcR0(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final l<? super Boolean, j> lVar) {
        m.h(modifier, "$this$toggleable");
        m.h(mutableInteractionSource, "interactionSource");
        m.h(lVar, "onValueChange");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                b.c(z, a.b.d(inspectorInfo, "$this$null", "toggleable"), "value", inspectorInfo).set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                b.c(z2, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getProperties().set("onValueChange", lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), m759triStateToggleableO2vRcR0(Modifier.INSTANCE, ToggleableStateKt.ToggleableState(z), mutableInteractionSource, indication, z2, role, new a<j>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m763invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m763invoke() {
                lVar.invoke(Boolean.valueOf(!z));
            }
        }));
    }

    /* JADX INFO: renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m756toggleableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, l lVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m755toggleableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, lVar);
    }

    /* JADX INFO: renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m757toggleableXHw0xAI(Modifier modifier, final boolean z, final boolean z2, final Role role, final l<? super Boolean, j> lVar) {
        m.h(modifier, "$this$toggleable");
        m.h(lVar, "onValueChange");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                b.c(z2, b.c(z, a.b.d(inspectorInfo, "$this$null", "toggleable"), "value", inspectorInfo), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getProperties().set("onValueChange", lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, 290332169)) {
                    ComposerKt.traceEventStart(290332169, i2, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:65)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean z3 = z;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM755toggleableO2vRcR0 = ToggleableKt.m755toggleableO2vRcR0(companion, z3, (MutableInteractionSource) objRememberedValue, (Indication) composer.consume(IndicationKt.getLocalIndication()), z2, role, lVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM755toggleableO2vRcR0;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m758toggleableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m757toggleableXHw0xAI(modifier, z, z2, role, lVar);
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m759triStateToggleableO2vRcR0(Modifier modifier, final ToggleableState toggleableState, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final Role role, final a<j> aVar) {
        m.h(modifier, "$this$triStateToggleable");
        m.h(toggleableState, "state");
        m.h(mutableInteractionSource, "interactionSource");
        m.h(aVar, "onClick");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "triStateToggleable").set("state", toggleableState);
                b.c(z, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("onClick", aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), SemanticsModifierKt.semantics$default(ClickableKt.m204clickableO2vRcR0$default(Modifier.INSTANCE, mutableInteractionSource, indication, z, null, role, aVar, 8, null), false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$4$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, toggleableState);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m760triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Role role, a aVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m759triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z2, role, aVar);
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m761triStateToggleableXHw0xAI(Modifier modifier, final ToggleableState toggleableState, final boolean z, final Role role, final a<j> aVar) {
        m.h(modifier, "$this$triStateToggleable");
        m.h(toggleableState, "state");
        m.h(aVar, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "triStateToggleable").set("state", toggleableState);
                b.c(z, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, -1808118329)) {
                    ComposerKt.traceEventStart(-1808118329, i2, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:162)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                ToggleableState toggleableState2 = toggleableState;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM759triStateToggleableO2vRcR0 = ToggleableKt.m759triStateToggleableO2vRcR0(companion, toggleableState2, (MutableInteractionSource) objRememberedValue, (Indication) composer.consume(IndicationKt.getLocalIndication()), z, role, aVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM759triStateToggleableO2vRcR0;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m762triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m761triStateToggleableXHw0xAI(modifier, toggleableState, z, role, aVar);
    }
}
