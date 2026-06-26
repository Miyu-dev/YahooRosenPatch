package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedModifier;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J \u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0017J\f\u0010\u000e\u001a\u00020\u0004*\u00020\u0004H\u0017J\u001c\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class RowScopeInstance implements RowScope {
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier align(Modifier modifier, final Alignment.Vertical vertical) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(vertical, "alignment");
        return modifier.then(new VerticalAlignModifier(vertical, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("align");
                inspectorInfo.setValue(vertical);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, final HorizontalAlignmentLine horizontalAlignmentLine) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(horizontalAlignmentLine, "alignmentLine");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLine(horizontalAlignmentLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("alignBy");
                inspectorInfo.setValue(horizontalAlignmentLine);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        return alignBy(modifier, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, final float f, final boolean z) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        if (((double) f) > 0.0d) {
            return modifier.then(new LayoutWeightImpl(f, z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$weight$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return kotlin.j.a;
                }

                public final void invoke(InspectorInfo inspectorInfo) {
                    kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                    inspectorInfo.setName("weight");
                    inspectorInfo.setValue(Float.valueOf(f));
                    inspectorInfo.getProperties().set("weight", Float.valueOf(f));
                    inspectorInfo.getProperties().set("fill", Boolean.valueOf(z));
                }
            } : InspectableValueKt.getNoInspectorInfo()));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, final kj.l<? super Measured, Integer> lVar) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(lVar, "alignmentLineBlock");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLineBlock(lVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$alignBy$$inlined$debugInspectorInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("alignBy");
                inspectorInfo.setValue(lVar);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
