package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kj.p;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR5\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR5\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR5\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR5\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR5\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR5\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "HorizontalMinWidth", "Lkj/q;", "getHorizontalMinWidth", "()Lkj/q;", "VerticalMinWidth", "getVerticalMinWidth", "HorizontalMinHeight", "getHorizontalMinHeight", "VerticalMinHeight", "getVerticalMinHeight", "HorizontalMaxWidth", "getHorizontalMaxWidth", "VerticalMaxWidth", "getVerticalMaxWidth", "HorizontalMaxHeight", "getHorizontalMaxHeight", "VerticalMaxHeight", "getVerticalMaxHeight", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class IntrinsicMeasureBlocks {
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            AnonymousClass1 anonymousClass1 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i4));
                }
            };
            AnonymousClass2 anonymousClass2 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i4));
                }
            }, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                }
            }, i2, i3, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i4));
                }
            }, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                }
            }, i2, i3, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            AnonymousClass1 anonymousClass1 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i4));
                }
            };
            AnonymousClass2 anonymousClass2 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            AnonymousClass1 anonymousClass1 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                }
            };
            AnonymousClass2 anonymousClass2 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                }
            }, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                }
            }, i2, i3, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                }
            }, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                }
            }, i2, i3, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
            kotlin.jvm.internal.m.h(list, "measurables");
            AnonymousClass1 anonymousClass1 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                }
            };
            AnonymousClass2 anonymousClass2 = new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4) {
                    kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation));
        }
    };

    private IntrinsicMeasureBlocks() {
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxHeight() {
        return HorizontalMaxHeight;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxWidth() {
        return HorizontalMaxWidth;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinHeight() {
        return HorizontalMinHeight;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinWidth() {
        return HorizontalMinWidth;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxHeight() {
        return VerticalMaxHeight;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxWidth() {
        return VerticalMaxWidth;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinHeight() {
        return VerticalMinHeight;
    }

    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinWidth() {
        return VerticalMinWidth;
    }
}
