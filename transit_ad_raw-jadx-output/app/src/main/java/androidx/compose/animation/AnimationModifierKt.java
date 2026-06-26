package androidx.compose.animation;

import androidx.appcompat.widget.s;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/j;", "finishedListener", "animateContentSize", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class AnimationModifierKt {
    public static final Modifier animateContentSize(Modifier modifier, final FiniteAnimationSpec<IntSize> finiteAnimationSpec, final p<? super IntSize, ? super IntSize, j> pVar) {
        m.h(modifier, "<this>");
        m.h(finiteAnimationSpec, "animationSpec");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "animateContentSize").set("animationSpec", finiteAnimationSpec);
                inspectorInfo.getProperties().set("finishedListener", pVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.AnimationModifierKt.animateContentSize.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, -843180607)) {
                    ComposerKt.traceEventStart(-843180607, i2, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
                }
                Object objD = s.d(composer, 773894976, -492369756);
                Composer.Companion companion = Composer.INSTANCE;
                if (objD == companion.getEmpty()) {
                    objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                composer.endReplaceableGroup();
                FiniteAnimationSpec<IntSize> finiteAnimationSpec2 = finiteAnimationSpec;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(coroutineScope);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new SizeAnimationModifier(finiteAnimationSpec2, coroutineScope);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) objRememberedValue;
                sizeAnimationModifier.setListener(pVar);
                Modifier modifierThen = ClipKt.clipToBounds(modifier2).then(sizeAnimationModifier);
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

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, pVar);
    }
}
