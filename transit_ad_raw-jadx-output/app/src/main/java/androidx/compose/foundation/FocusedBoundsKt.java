package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\"6\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00068\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/j;", "onPositioned", "onFocusedBoundsChanged", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalFocusedBoundsObserver", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusedBoundsObserver", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusedBoundsObserver$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class FocusedBoundsKt {
    private static final ProvidableModifierLocal<l<LayoutCoordinates, j>> ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(new kj.a<l<? super LayoutCoordinates, ? extends j>>() { // from class: androidx.compose.foundation.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1
        public final l<LayoutCoordinates, j> invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<l<LayoutCoordinates, j>> getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }

    @ExperimentalFoundationApi
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, final l<? super LayoutCoordinates, j> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "onPositioned");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "onFocusedBoundsChanged").set("onPositioned", lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusedBoundsKt.onFocusedBoundsChanged.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 1176407768)) {
                    ComposerKt.traceEventStart(1176407768, i2, -1, "androidx.compose.foundation.onFocusedBoundsChanged.<anonymous> (FocusedBounds.kt:53)");
                }
                l<LayoutCoordinates, j> lVar2 = lVar;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(lVar2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FocusedBoundsObserverModifier(lVar2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                FocusedBoundsObserverModifier focusedBoundsObserverModifier = (FocusedBoundsObserverModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return focusedBoundsObserverModifier;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ void getModifierLocalFocusedBoundsObserver$annotations() {
    }
}
