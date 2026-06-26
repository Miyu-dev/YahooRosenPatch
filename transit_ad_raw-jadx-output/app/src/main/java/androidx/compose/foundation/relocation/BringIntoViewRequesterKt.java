package androidx.compose.foundation.relocation;

import a.b;
import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"BringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BringIntoViewRequesterKt {
    @ExperimentalFoundationApi
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequesterImpl();
    }

    @ExperimentalFoundationApi
    public static final Modifier bringIntoViewRequester(Modifier modifier, final BringIntoViewRequester bringIntoViewRequester) {
        m.h(modifier, "<this>");
        m.h(bringIntoViewRequester, "bringIntoViewRequester");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                b.d(inspectorInfo, "$this$null", "bringIntoViewRequester").set("bringIntoViewRequester", bringIntoViewRequester);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester.2
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -992853993)) {
                    ComposerKt.traceEventStart(-992853993, i2, -1, "androidx.compose.foundation.relocation.bringIntoViewRequester.<anonymous> (BringIntoViewRequester.kt:105)");
                }
                BringIntoViewParent bringIntoViewParentRememberDefaultBringIntoViewParent = BringIntoViewResponder_androidKt.rememberDefaultBringIntoViewParent(composer, 0);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(bringIntoViewParentRememberDefaultBringIntoViewParent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new BringIntoViewRequesterModifier(bringIntoViewParentRememberDefaultBringIntoViewParent);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final BringIntoViewRequesterModifier bringIntoViewRequesterModifier = (BringIntoViewRequesterModifier) objRememberedValue;
                final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                if (bringIntoViewRequester2 instanceof BringIntoViewRequesterImpl) {
                    EffectsKt.DisposableEffect(bringIntoViewRequester2, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            m.h(disposableEffectScope, "$this$DisposableEffect");
                            ((BringIntoViewRequesterImpl) bringIntoViewRequester2).getModifiers().add(bringIntoViewRequesterModifier);
                            final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester2;
                            final BringIntoViewRequesterModifier bringIntoViewRequesterModifier2 = bringIntoViewRequesterModifier;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    ((BringIntoViewRequesterImpl) bringIntoViewRequester3).getModifiers().remove(bringIntoViewRequesterModifier2);
                                }
                            };
                        }
                    }, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return bringIntoViewRequesterModifier;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }
}
