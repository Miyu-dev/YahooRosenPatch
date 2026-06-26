package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kj.p;
import kj.q;
import kj.r;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadLayout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J5\u0010\u000e\u001a\u00020\u0002*\u00020\u00022$\u0010\r\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016ø\u0001\u0000R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutScopeImpl;", "Landroidx/compose/ui/layout/LookaheadLayoutScope;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Lkotlin/j;", "onPlaced", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "intermediateLayout", "Landroidx/compose/ui/node/NodeCoordinator;", "root", "Landroidx/compose/ui/node/NodeCoordinator;", "getRoot", "()Landroidx/compose/ui/node/NodeCoordinator;", "setRoot", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class LookaheadLayoutScopeImpl implements LookaheadLayoutScope {
    private NodeCoordinator root;

    public final NodeCoordinator getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.layout.LookaheadLayoutScope
    public Modifier intermediateLayout(Modifier modifier, final r<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> rVar) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(rVar, "measure");
        return modifier.then(new LookaheadIntermediateLayoutModifierImpl(rVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$intermediateLayout$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "intermediateLayout").set("measure", rVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.ui.layout.LookaheadLayoutScope
    public Modifier onPlaced(Modifier modifier, final p<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, kotlin.j> pVar) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(pVar, "onPlaced");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "onPlaced").set("onPlaced", pVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -814093691)) {
                    ComposerKt.traceEventStart(-814093691, i2, -1, "androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.<anonymous> (LookaheadLayout.kt:176)");
                }
                p<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, kotlin.j> pVar2 = pVar;
                final LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = this;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LookaheadOnPlacedModifier(pVar2, new kj.a<LookaheadLayoutCoordinates>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2$1$1
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final LookaheadLayoutCoordinates m4249invoke() {
                            NodeCoordinator root = lookaheadLayoutScopeImpl.getRoot();
                            if (root != null) {
                                LookaheadDelegate lookaheadDelegate = root.getLookaheadDelegate();
                                kotlin.jvm.internal.m.e(lookaheadDelegate);
                                LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates();
                                if (lookaheadLayoutCoordinates != null) {
                                    return lookaheadLayoutCoordinates;
                                }
                            }
                            throw new IllegalStateException("Lookahead root has not been set up yet".toString());
                        }
                    });
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = modifier2.then((Modifier) objRememberedValue);
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

    public final void setRoot(NodeCoordinator nodeCoordinator) {
        this.root = nodeCoordinator;
    }
}
