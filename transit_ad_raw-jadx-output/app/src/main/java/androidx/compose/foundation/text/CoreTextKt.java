package androidx.compose.foundation.text;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kj.a;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\t\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ay\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00030\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ae\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001aa\u0010'\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001b0\u0003j\u0002`&0\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"H\u0000\"Q\u0010(\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001b0\u0003j\u0002`&0\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)*:\b\u0002\u0010*\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u00032\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003*\u0018\b\u0002\u0010+\"\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Lkotlin/Function1;", "", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextDelegate;", "current", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "minLines", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "updateTextDelegate", "updateTextDelegate-x_uQXYA", "(Landroidx/compose/foundation/text/TextDelegate;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIII)Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/PlaceholderRange;", "resolveInlineContent", "EmptyInlineContent", "Lkotlin/Pair;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class CoreTextKt {
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, j>>>> EmptyInlineContent;

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptyInlineContent = new Pair<>(emptyList, emptyList);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(final AnnotatedString annotatedString, final List<AnnotatedString.Range<q<String, Composer, Integer, j>>> list, Composer composer, final int i2) {
        m.h(annotatedString, "text");
        m.h(list, "inlineContents");
        Composer composerStartRestartGroup = composer.startRestartGroup(-110905764);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-110905764, i2, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            AnnotatedString.Range<q<String, Composer, Integer, j>> range = list.get(i3);
            q<String, Composer, Integer, j> qVarComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i4) {
                    return e.a(this, intrinsicMeasureScope, list2, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i4) {
                    return e.b(this, intrinsicMeasureScope, list2, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list2, long j) {
                    m.h(measureScope, "$this$Layout");
                    m.h(list2, "children");
                    final ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.add(list2.get(i4).mo4235measureBRTryo0(j));
                    }
                    return MeasureScope.CC.p(measureScope, Constraints.m5235getMaxWidthimpl(j), Constraints.m5234getMaxHeightimpl(j), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return j.a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            m.h(placementScope, "$this$layout");
                            List<Placeable> list3 = arrayList;
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i5), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i4) {
                    return e.c(this, intrinsicMeasureScope, list2, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i4) {
                    return e.d(this, intrinsicMeasureScope, list2, i4);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion);
            int i4 = size;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            Updater.m2444setimpl(composerM2437constructorimpl, coreTextKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
            Updater.m2444setimpl(composerM2437constructorimpl, density, companion2.getSetDensity());
            Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            qVarComponent1.invoke(annotatedString.subSequence(start, end).getText(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            i3++;
            size = i4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.text.CoreTextKt.InlineChildren.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                CoreTextKt.InlineChildren(annotatedString, list, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, j>>>> resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        m.h(annotatedString, "text");
        m.h(map, "inlineContent");
        if (map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i2);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m813updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list) {
        m.h(textDelegate, "current");
        m.h(annotatedString, "text");
        m.h(textStyle, "style");
        m.h(density, "density");
        m.h(resolver, "fontFamilyResolver");
        m.h(list, "placeholders");
        if (m.c(textDelegate.getText(), annotatedString) && m.c(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z) {
                if (TextOverflow.m5212equalsimpl0(textDelegate.getOverflow(), i2)) {
                    if (textDelegate.getMaxLines() == i3) {
                        if (textDelegate.getMinLines() == i4 && m.c(textDelegate.getDensity(), density) && m.c(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) {
                            return textDelegate;
                        }
                    }
                    return new TextDelegate(annotatedString, textStyle, i3, i4, z, i2, density, resolver, list, null);
                }
                return new TextDelegate(annotatedString, textStyle, i3, i4, z, i2, density, resolver, list, null);
            }
            return new TextDelegate(annotatedString, textStyle, i3, i4, z, i2, density, resolver, list, null);
        }
        return new TextDelegate(annotatedString, textStyle, i3, i4, z, i2, density, resolver, list, null);
    }

    /* JADX INFO: renamed from: updateTextDelegate-x_uQXYA, reason: not valid java name */
    public static final TextDelegate m815updateTextDelegatex_uQXYA(TextDelegate textDelegate, String str, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i2, int i3, int i4) {
        m.h(textDelegate, "current");
        m.h(str, "text");
        m.h(textStyle, "style");
        m.h(density, "density");
        m.h(resolver, "fontFamilyResolver");
        if (m.c(textDelegate.getText().getText(), str) && m.c(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z) {
                if (TextOverflow.m5212equalsimpl0(textDelegate.getOverflow(), i2)) {
                    if (textDelegate.getMaxLines() == i3) {
                        if (textDelegate.getMinLines() == i4 && m.c(textDelegate.getDensity(), density) && textDelegate.getFontFamilyResolver() == resolver) {
                            return textDelegate;
                        }
                    }
                    return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i3, i4, z, i2, density, resolver, null, Optimizer.OPTIMIZATION_CACHE_MEASURES, null);
                }
                return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i3, i4, z, i2, density, resolver, null, Optimizer.OPTIMIZATION_CACHE_MEASURES, null);
            }
            return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i3, i4, z, i2, density, resolver, null, Optimizer.OPTIMIZATION_CACHE_MEASURES, null);
        }
        return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i3, i4, z, i2, density, resolver, null, Optimizer.OPTIMIZATION_CACHE_MEASURES, null);
    }
}
