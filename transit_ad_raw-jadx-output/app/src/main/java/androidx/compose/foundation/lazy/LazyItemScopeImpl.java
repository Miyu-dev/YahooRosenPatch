package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017ø\u0001\u0000R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "width", "height", "Lkotlin/j;", "setMaxSize", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "animateItemPlacement", "Landroidx/compose/runtime/MutableState;", "maxWidthState", "Landroidx/compose/runtime/MutableState;", "maxHeightState", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyItemScopeImpl implements LazyItemScope {
    private MutableState<Integer> maxWidthState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.MAX_VALUE, null, 2, null);
    private MutableState<Integer> maxHeightState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.MAX_VALUE, null, 2, null);

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(Modifier modifier, final FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        m.h(modifier, "<this>");
        m.h(finiteAnimationSpec, "animationSpec");
        return modifier.then(new AnimateItemPlacementModifier(finiteAnimationSpec, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$animateItemPlacement$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("animateItemPlacement");
                inspectorInfo.setValue(finiteAnimationSpec);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxHeight(Modifier modifier, final float f) {
        m.h(modifier, "<this>");
        return modifier.then(new ParentSizeModifier(f, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$fillParentMaxHeight$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("fillParentMaxHeight");
                inspectorInfo.setValue(Float.valueOf(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null, this.maxHeightState, 4, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxSize(Modifier modifier, final float f) {
        m.h(modifier, "<this>");
        return modifier.then(new ParentSizeModifier(f, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$fillParentMaxSize$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("fillParentMaxSize");
                inspectorInfo.setValue(Float.valueOf(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), this.maxWidthState, this.maxHeightState));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxWidth(Modifier modifier, final float f) {
        m.h(modifier, "<this>");
        return modifier.then(new ParentSizeModifier(f, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$fillParentMaxWidth$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("fillParentMaxWidth");
                inspectorInfo.setValue(Float.valueOf(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), this.maxWidthState, null, 8, null));
    }

    public final void setMaxSize(int i2, int i3) {
        this.maxWidthState.setValue(Integer.valueOf(i2));
        this.maxHeightState.setValue(Integer.valueOf(i3));
    }
}
