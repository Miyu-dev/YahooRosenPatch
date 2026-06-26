package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a0;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/j;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: MeasureScope.kt */
    public final /* synthetic */ class CC {
        public static MeasureResult a(MeasureScope measureScope, int i2, int i3, Map map, kj.l lVar) {
            kotlin.jvm.internal.m.h(map, "alignmentLines");
            kotlin.jvm.internal.m.h(lVar, "placementBlock");
            return new MeasureResult(i2, i3, map, measureScope, lVar) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
                final /* synthetic */ kj.l<Placeable.PlacementScope, kotlin.j> $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i2;
                    this.this$0 = measureScope;
                    this.$placementBlock = lVar;
                    this.width = i2;
                    this.height = i3;
                    this.alignmentLines = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                    int i4 = this.$width;
                    LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                    MeasureScope measureScope2 = this.this$0;
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = measureScope2 instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope2 : null;
                    kj.l<Placeable.PlacementScope, kotlin.j> lVar2 = this.$placementBlock;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
                    Placeable.PlacementScope.parentWidth = i4;
                    Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                    boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(lookaheadCapablePlaceable);
                    lVar2.invoke(companion);
                    if (lookaheadCapablePlaceable != null) {
                        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                    }
                    Placeable.PlacementScope.parentWidth = parentWidth;
                    Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                    Placeable.PlacementScope._coordinates = layoutCoordinates;
                    Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult p(MeasureScope measureScope, int i2, int i3, Map map, kj.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i4 & 4) != 0) {
                map = a0.a;
            }
            return measureScope.layout(i2, i3, map, lVar);
        }
    }

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i2, int i3, Map<AlignmentLine, Integer> map, kj.l<? super Placeable.PlacementScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(map, "alignmentLines");
            kotlin.jvm.internal.m.h(lVar, "placementBlock");
            return CC.a(measureScope, i2, i3, map, lVar);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4250roundToPxR2X_6o(MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.a.a(measureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4251roundToPx0680j_4(MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.a.b(measureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4252toDpGaN1DYA(MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.a.c(measureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4253toDpu2uoSUM(MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.a.d(measureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4255toDpSizekrfVVM(MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.a.f(measureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4256toPxR2X_6o(MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.a.g(measureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4257toPx0680j_4(MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.a.h(measureScope, f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            kotlin.jvm.internal.m.h(dpRect, "$receiver");
            return androidx.compose.ui.unit.a.i(measureScope, dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4258toSizeXkaWNTQ(MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.a.j(measureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4259toSp0xMU5do(MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.a.k(measureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4260toSpkPz2Gy4(MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.a.l(measureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4254toDpu2uoSUM(MeasureScope measureScope, int i2) {
            return androidx.compose.ui.unit.a.e(measureScope, i2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4261toSpkPz2Gy4(MeasureScope measureScope, int i2) {
            return androidx.compose.ui.unit.a.m(measureScope, i2);
        }
    }

    MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, kj.l<? super Placeable.PlacementScope, kotlin.j> lVar);
}
