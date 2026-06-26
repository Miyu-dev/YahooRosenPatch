package androidx.compose.foundation.layout;

import androidx.appcompat.widget.v;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aJ\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a<\u0010\u001c\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u001d\"\u001a\u0010\u001e\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!\"\u001a\u0010'\u001a\u0004\u0018\u00010$*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0018\u0010*\u001a\u00020\u0004*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkj/q;Landroidx/compose/runtime/Composer;II)V", "alignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "boxMeasurePolicy", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", "placeInBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/BoxChildData;", "getBoxChildData", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildData;", "boxChildData", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class BoxKt {
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            kotlin.jvm.internal.m.h(measureScope, "$this$MeasurePolicy");
            kotlin.jvm.internal.m.h(list, "<anonymous parameter 0>");
            return MeasureScope.CC.p(measureScope, Constraints.m5237getMinWidthimpl(j), Constraints.m5236getMinHeightimpl(j), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                    kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return kotlin.j.a;
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, list, i2);
        }
    };

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(Modifier modifier, Alignment alignment, boolean z, q<? super BoxScope, ? super Composer, ? super Integer, kotlin.j> qVar, Composer composer, int i2, int i3) {
        kotlin.jvm.internal.m.h(qVar, "content");
        composer.startReplaceableGroup(733328855);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = i2 >> 3;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = rememberBoxMeasurePolicy((i3 & 2) != 0 ? Alignment.INSTANCE.getTopStart() : alignment, (i3 & 4) != 0 ? false : z, composer, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14));
        int i5 = (i2 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Density density = (Density) v.d(composer, -1323940314);
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        kj.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j> qVarMaterializerOf = LayoutKt.materializerOf(modifier2);
        int i6 = ((i5 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer);
        androidx.appcompat.graphics.drawable.a.g((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer, composer), composer, 2058660585);
        qVar.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy boxMeasurePolicy(final Alignment alignment, final boolean z) {
        kotlin.jvm.internal.m.h(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, list, i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, list, i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo34measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                int iM5237getMinWidthimpl;
                final Placeable placeableMo4235measureBRTryo0;
                int iMax;
                kotlin.jvm.internal.m.h(measureScope, "$this$MeasurePolicy");
                kotlin.jvm.internal.m.h(list, "measurables");
                if (list.isEmpty()) {
                    return MeasureScope.CC.p(measureScope, Constraints.m5237getMinWidthimpl(j), Constraints.m5236getMinHeightimpl(j), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                            kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return kotlin.j.a;
                        }
                    }, 4, null);
                }
                long jM5226copyZbe2FdA$default = z ? j : Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                if (list.size() == 1) {
                    final Measurable measurable = list.get(0);
                    if (BoxKt.getMatchesParentSize(measurable)) {
                        iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(j);
                        int iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j);
                        placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(Constraints.INSTANCE.m5243fixedJhjzzOo(Constraints.m5237getMinWidthimpl(j), Constraints.m5236getMinHeightimpl(j)));
                        iMax = iM5236getMinHeightimpl;
                    } else {
                        Placeable placeableMo4235measureBRTryo02 = measurable.mo4235measureBRTryo0(jM5226copyZbe2FdA$default);
                        int iMax2 = Math.max(Constraints.m5237getMinWidthimpl(j), placeableMo4235measureBRTryo02.getWidth());
                        iMax = Math.max(Constraints.m5236getMinHeightimpl(j), placeableMo4235measureBRTryo02.getHeight());
                        placeableMo4235measureBRTryo0 = placeableMo4235measureBRTryo02;
                        iM5237getMinWidthimpl = iMax2;
                    }
                    final Alignment alignment2 = alignment;
                    final int i2 = iM5237getMinWidthimpl;
                    final int i3 = iMax;
                    return MeasureScope.CC.p(measureScope, iM5237getMinWidthimpl, iMax, null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return kotlin.j.a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                            BoxKt.placeInBox(placementScope, placeableMo4235measureBRTryo0, measurable, measureScope.getLayoutDirection(), i2, i3, alignment2);
                        }
                    }, 4, null);
                }
                final Placeable[] placeableArr = new Placeable[list.size()];
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Constraints.m5237getMinWidthimpl(j);
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = Constraints.m5236getMinHeightimpl(j);
                int size = list.size();
                boolean z2 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    Measurable measurable2 = list.get(i4);
                    if (BoxKt.getMatchesParentSize(measurable2)) {
                        z2 = true;
                    } else {
                        Placeable placeableMo4235measureBRTryo03 = measurable2.mo4235measureBRTryo0(jM5226copyZbe2FdA$default);
                        placeableArr[i4] = placeableMo4235measureBRTryo03;
                        intRef.element = Math.max(intRef.element, placeableMo4235measureBRTryo03.getWidth());
                        intRef2.element = Math.max(intRef2.element, placeableMo4235measureBRTryo03.getHeight());
                    }
                }
                if (z2) {
                    int i5 = intRef.element;
                    int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
                    int i7 = intRef2.element;
                    long jConstraints = ConstraintsKt.Constraints(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
                    int size2 = list.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Measurable measurable3 = list.get(i8);
                        if (BoxKt.getMatchesParentSize(measurable3)) {
                            placeableArr[i8] = measurable3.mo4235measureBRTryo0(jConstraints);
                        }
                    }
                }
                int i9 = intRef.element;
                int i10 = intRef2.element;
                final Alignment alignment3 = alignment;
                return MeasureScope.CC.p(measureScope, i9, i10, null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return kotlin.j.a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                        Placeable[] placeableArr2 = placeableArr;
                        List<Measurable> list2 = list;
                        MeasureScope measureScope2 = measureScope;
                        Ref.IntRef intRef3 = intRef;
                        Ref.IntRef intRef4 = intRef2;
                        Alignment alignment4 = alignment3;
                        int length = placeableArr2.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i12 < length) {
                            Placeable placeable = placeableArr2[i12];
                            kotlin.jvm.internal.m.f(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            BoxKt.placeInBox(placementScope, placeable, list2.get(i11), measureScope2.getLayoutDirection(), intRef3.element, intRef4.element, alignment4);
                            i12++;
                            i11++;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, list, i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, list, i2);
            }
        };
    }

    private static final BoxChildData getBoxChildData(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildData) {
            return (BoxChildData) parentData;
        }
        return null;
    }

    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return DefaultBoxMeasurePolicy;
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData != null) {
            return boxChildData.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i2, int i3, Alignment alignment) {
        Alignment alignment2;
        BoxChildData boxChildData = getBoxChildData(measurable);
        Placeable.PlacementScope.m4272place70tqf50$default(placementScope, placeable, ((boxChildData == null || (alignment2 = boxChildData.getAlignment()) == null) ? alignment : alignment2).mo2476alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i2, i3), layoutDirection), 0.0f, 2, null);
    }

    @Composable
    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean z, Composer composer, int i2) {
        MeasurePolicy measurePolicy;
        kotlin.jvm.internal.m.h(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i2, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)");
        }
        if (!kotlin.jvm.internal.m.c(alignment, Alignment.INSTANCE.getTopStart()) || z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(boolValueOf) | composer.changed(alignment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = boxMeasurePolicy(alignment, z);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) objRememberedValue;
        } else {
            measurePolicy = DefaultBoxMeasurePolicy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.m.h(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-211209833);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i3, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            int i4 = ((i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384;
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j> qVarMaterializerOf = LayoutKt.materializerOf(modifier);
            int i5 = ((i4 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            qVarMaterializerOf.invoke(androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxKt.Box.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return kotlin.j.a;
            }

            public final void invoke(Composer composer2, int i6) {
                BoxKt.Box(modifier, composer2, i2 | 1);
            }
        });
    }
}
