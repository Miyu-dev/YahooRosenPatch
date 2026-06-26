package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.NoSuchElementException;
import kj.q;
import kj.r;
import kj.s;
import kotlin.Metadata;
import kotlin.collections.y;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aP\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001d\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\u00020 2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u00103\u001a\u00020 2\u0006\u0010&\u001a\u00020%2*\u0010'\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2$\u00100\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0.2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001aN\u0010;\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001an\u0010<\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a>\u0010@\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001an\u0010@\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u0006\u0010?\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a,\u0010F\u001a\u00020E*\u00020/2\u0006\u0010B\u001a\u00020A2\u0006\u0010&\u001a\u00020%2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000\u001a\u001c\u0010H\u001a\u00020\u0006*\u00020G2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0006H\u0000\u001a\u001c\u0010I\u001a\u00020\u0006*\u00020G2\u0006\u0010&\u001a\u00020%2\u0006\u00108\u001a\u00020\u0006H\u0000\u001a\u0014\u00108\u001a\u00020\u0006*\u00020J2\u0006\u0010&\u001a\u00020%H\u0000\u001a\u0014\u0010+\u001a\u00020\u0006*\u00020J2\u0006\u0010&\u001a\u00020%H\u0000\u001a2\u0010L\u001a\u00020\u0006*\u00020G2\u0006\u0010D\u001a\u00020C2\u0006\u0010&\u001a\u00020%2\u0014\u0010K\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0004\u0012\u00020\n0\bH\u0002\"2\u0010M\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N\"2\u0010O\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006P"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "", "maxItemsInEachRow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkj/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/ColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkj/q;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "mainAxisRowArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkj/s;", "mainAxisColumnArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkj/s;", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "mainAxisArrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "crossAxisArrangement", "flowMeasurePolicy-942rkJo", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkj/s;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkj/r;I)Landroidx/compose/ui/layout/MeasurePolicy;", "flowMeasurePolicy", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "maxIntrinsicMainAxisSize", "minIntrinsicMainAxisSize", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "intrinsicCrossAxisSize", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "measureHelper", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems", "Landroidx/compose/ui/layout/Measurable;", "mainAxisMin", "crossAxisMin", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "measureAndCache", "crossAxisRowArrangement", "Lkj/r;", "crossAxisColumnArrangement", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class FlowLayoutKt {
    private static final r<Integer, int[], MeasureScope, int[], kotlin.j> crossAxisRowArrangement = new r<Integer, int[], MeasureScope, int[], kotlin.j>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$crossAxisRowArrangement$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Number) obj).intValue(), (int[]) obj2, (MeasureScope) obj3, (int[]) obj4);
            return kotlin.j.a;
        }

        public final void invoke(int i2, int[] iArr, MeasureScope measureScope, int[] iArr2) {
            kotlin.jvm.internal.m.h(iArr, "size");
            kotlin.jvm.internal.m.h(measureScope, "measureScope");
            kotlin.jvm.internal.m.h(iArr2, "outPosition");
            Arrangement.INSTANCE.getTop().arrange(measureScope, i2, iArr, iArr2);
        }
    };
    private static final r<Integer, int[], MeasureScope, int[], kotlin.j> crossAxisColumnArrangement = new r<Integer, int[], MeasureScope, int[], kotlin.j>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$crossAxisColumnArrangement$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Number) obj).intValue(), (int[]) obj2, (MeasureScope) obj3, (int[]) obj4);
            return kotlin.j.a;
        }

        public final void invoke(int i2, int[] iArr, MeasureScope measureScope, int[] iArr2) {
            kotlin.jvm.internal.m.h(iArr, "size");
            kotlin.jvm.internal.m.h(measureScope, "measureScope");
            kotlin.jvm.internal.m.h(iArr2, "outPosition");
            Arrangement.INSTANCE.getStart().arrange(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier r20, androidx.compose.foundation.layout.Arrangement.Vertical r21, androidx.compose.ui.Alignment.Horizontal r22, int r23, final kj.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.ui.Modifier r20, androidx.compose.foundation.layout.Arrangement.Horizontal r21, androidx.compose.ui.Alignment.Vertical r22, int r23, final kj.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.layout.FlowResult breakDownItems(androidx.compose.ui.layout.MeasureScope r22, androidx.compose.foundation.layout.RowColumnMeasurementHelper r23, androidx.compose.foundation.layout.LayoutOrientation r24, androidx.compose.foundation.layout.OrientationIndependentConstraints r25, int r26) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.breakDownItems(androidx.compose.ui.layout.MeasureScope, androidx.compose.foundation.layout.RowColumnMeasurementHelper, androidx.compose.foundation.layout.LayoutOrientation, androidx.compose.foundation.layout.OrientationIndependentConstraints, int):androidx.compose.foundation.layout.FlowResult");
    }

    @Composable
    private static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-2013098357);
        if ((i4 & 1) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i4 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getStart();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i3, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)");
        }
        s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> sVarMainAxisColumnArrangement = mainAxisColumnArrangement(vertical, composer, i3 & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontal);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CrossAxisAlignment crossAxisAlignment = (CrossAxisAlignment) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i2);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(horizontal) | composer.changed(vertical) | composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = m440flowMeasurePolicy942rkJo(LayoutOrientation.Vertical, sVarMainAxisColumnArrangement, vertical.getSpacing(), SizeMode.Wrap, crossAxisAlignment, crossAxisColumnArrangement, i2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final int crossAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i2) {
        kotlin.jvm.internal.m.h(measurable, "<this>");
        kotlin.jvm.internal.m.h(layoutOrientation, "orientation");
        return layoutOrientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicHeight(i2) : measurable.minIntrinsicWidth(i2);
    }

    public static final int crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        kotlin.jvm.internal.m.h(placeable, "<this>");
        kotlin.jvm.internal.m.h(layoutOrientation, "orientation");
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: flowMeasurePolicy-942rkJo, reason: not valid java name */
    private static final MeasurePolicy m440flowMeasurePolicy942rkJo(final LayoutOrientation layoutOrientation, final s<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], kotlin.j> sVar, final float f, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final r<? super Integer, ? super int[], ? super MeasureScope, ? super int[], kotlin.j> rVar, final int i2) {
        return new MeasurePolicy(sVar, f, sizeMode, crossAxisAlignment, i2, rVar) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1
            final /* synthetic */ float $arrangementSpacing;
            final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
            final /* synthetic */ r<Integer, int[], MeasureScope, int[], kotlin.j> $crossAxisArrangement;
            final /* synthetic */ SizeMode $crossAxisSize;
            final /* synthetic */ s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> $mainAxisArrangement;
            final /* synthetic */ int $maxItemsInMainAxis;
            private final q<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
            private final q<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
            private final q<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
            private final q<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$mainAxisArrangement = sVar;
                this.$arrangementSpacing = f;
                this.$crossAxisSize = sizeMode;
                this.$crossAxisAlignment = crossAxisAlignment;
                this.$maxItemsInMainAxis = i2;
                this.$crossAxisArrangement = rVar;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                this.maxMainAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                    }
                } : new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                    }
                };
                this.maxCrossAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i4));
                    }
                } : new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i4));
                    }
                };
                this.minCrossAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i4));
                    }
                } : new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i4));
                    }
                };
                this.minMainAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i4));
                    }
                } : new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3, int i4) {
                        kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i4));
                    }
                };
            }

            public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
                return this.maxCrossAxisIntrinsicItemSize;
            }

            public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
                return this.maxMainAxisIntrinsicItemSize;
            }

            public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
                return this.minCrossAxisIntrinsicItemSize;
            }

            public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
                return this.minMainAxisIntrinsicItemSize;
            }

            public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int arrangementSpacing) {
                kotlin.jvm.internal.m.h(measurables, "measurables");
                return FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) measurables, (q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? intrinsicCrossAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing)) : maxIntrinsicMainAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing));
            }

            public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
                kotlin.jvm.internal.m.h(measurables, "measurables");
                return FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? maxIntrinsicMainAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing)) : intrinsicCrossAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo34measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
                int crossAxisTotalSize;
                int mainAxisTotalSize;
                kotlin.jvm.internal.m.h(measureScope, "$this$measure");
                kotlin.jvm.internal.m.h(list, "measurables");
                final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$mainAxisArrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, list, new Placeable[list.size()], null);
                final FlowResult flowResultBreakDownItems = FlowLayoutKt.breakDownItems(measureScope, rowColumnMeasurementHelper, this.$orientation, new OrientationIndependentConstraints(j, this.$orientation, null), this.$maxItemsInMainAxis);
                int crossAxisTotalSize2 = flowResultBreakDownItems.getCrossAxisTotalSize();
                MutableVector<RowColumnMeasureHelperResult> items = flowResultBreakDownItems.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = items.getContent()[i3].getCrossAxisSize();
                }
                final int[] iArr2 = new int[size];
                this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize2), iArr, measureScope, iArr2);
                if (this.$orientation == LayoutOrientation.Horizontal) {
                    crossAxisTotalSize = flowResultBreakDownItems.getMainAxisTotalSize();
                    mainAxisTotalSize = flowResultBreakDownItems.getCrossAxisTotalSize();
                } else {
                    crossAxisTotalSize = flowResultBreakDownItems.getCrossAxisTotalSize();
                    mainAxisTotalSize = flowResultBreakDownItems.getMainAxisTotalSize();
                }
                return MeasureScope.CC.p(measureScope, ConstraintsKt.m5249constrainWidthK40F9xA(j, crossAxisTotalSize), ConstraintsKt.m5248constrainHeightK40F9xA(j, mainAxisTotalSize), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$measure$1
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
                        MutableVector<RowColumnMeasureHelperResult> items2 = flowResultBreakDownItems.getItems();
                        RowColumnMeasurementHelper rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
                        int[] iArr3 = iArr2;
                        MeasureScope measureScope2 = measureScope;
                        int size2 = items2.getSize();
                        if (size2 > 0) {
                            RowColumnMeasureHelperResult[] content = items2.getContent();
                            int i4 = 0;
                            do {
                                rowColumnMeasurementHelper2.placeHelper(placementScope, content[i4], iArr3[i4], measureScope2.getLayoutDirection());
                                i4++;
                            } while (i4 < size2);
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? intrinsicCrossAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing)) : minIntrinsicMainAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing));
            }

            public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int arrangementSpacing) {
                kotlin.jvm.internal.m.h(measurables, "measurables");
                return FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? minIntrinsicMainAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing)) : intrinsicCrossAxisSize(list, i3, intrinsicMeasureScope.mo342roundToPx0680j_4(this.$arrangementSpacing));
            }
        };
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i2, int i3, int i4) {
        return intrinsicCrossAxisSize(list, new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicCrossAxisSize");
                return Integer.valueOf(iArr[i5]);
            }
        }, new q<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                kotlin.jvm.internal.m.h(intrinsicMeasurable, "$this$intrinsicCrossAxisSize");
                return Integer.valueOf(iArr2[i5]);
            }
        }, i2, i3, i4);
    }

    @Composable
    private static final s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> mainAxisColumnArrangement(final Arrangement.Vertical vertical, Composer composer, int i2) {
        composer.startReplaceableGroup(-1642644113);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1642644113, i2, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new s<Integer, int[], LayoutDirection, Density, int[], kotlin.j>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$mainAxisColumnArrangement$1$1
                {
                    super(5);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
                    return kotlin.j.a;
                }

                public final void invoke(int i3, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                    kotlin.jvm.internal.m.h(iArr, "size");
                    kotlin.jvm.internal.m.h(layoutDirection, "<anonymous parameter 2>");
                    kotlin.jvm.internal.m.h(density, "density");
                    kotlin.jvm.internal.m.h(iArr2, "outPosition");
                    vertical.arrange(density, i3, iArr, iArr2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> sVar = (s) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sVar;
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i2) {
        kotlin.jvm.internal.m.h(measurable, "<this>");
        kotlin.jvm.internal.m.h(layoutOrientation, "orientation");
        return layoutOrientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicWidth(i2) : measurable.minIntrinsicHeight(i2);
    }

    @Composable
    private static final s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> mainAxisRowArrangement(final Arrangement.Horizontal horizontal, Composer composer, int i2) {
        composer.startReplaceableGroup(746410833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(746410833, i2, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new s<Integer, int[], LayoutDirection, Density, int[], kotlin.j>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$mainAxisRowArrangement$1$1
                {
                    super(5);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
                    return kotlin.j.a;
                }

                public final void invoke(int i3, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                    kotlin.jvm.internal.m.h(iArr, "size");
                    kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                    kotlin.jvm.internal.m.h(density, "density");
                    kotlin.jvm.internal.m.h(iArr2, "outPosition");
                    horizontal.arrange(density, i3, iArr, layoutDirection, iArr2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> sVar = (s) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sVar;
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        kotlin.jvm.internal.m.h(placeable, "<this>");
        kotlin.jvm.internal.m.h(layoutOrientation, "orientation");
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, int i2, int i3, int i4) {
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < size) {
            int iIntValue = ((Number) qVar.invoke(list.get(i5), Integer.valueOf(i5), Integer.valueOf(i2))).intValue() + i3;
            int i8 = i5 + 1;
            if (i8 - i6 == i4 || i8 == list.size()) {
                iMax = Math.max(iMax, i7 + iIntValue);
                i7 = 0;
                i6 = i5;
            } else {
                i7 += iIntValue;
            }
            i5 = i8;
        }
        return iMax;
    }

    private static final int measureAndCache(Measurable measurable, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation, kj.l<? super Placeable, kotlin.j> lVar) {
        if (!(RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f)) {
            return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
        }
        Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, 0, 0, 0, 14, null).m453toBoxConstraintsOenEA2s(layoutOrientation));
        lVar.invoke(placeableMo4235measureBRTryo0);
        return mainAxisSize(placeableMo4235measureBRTryo0, layoutOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar2, int i2, int i3, int i4) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i7);
            int iIntValue = ((Number) qVar.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(i2))).intValue();
            iArr[i7] = iIntValue;
            iArr2[i7] = ((Number) qVar2.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(iIntValue))).intValue();
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += iArr[i9];
        }
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iIntrinsicCrossAxisSize = iArr2[0];
        qj.e eVarD = new qj.f(1, size2 - 1).d();
        while (eVarD.c) {
            int i10 = iArr2[eVarD.nextInt()];
            if (iIntrinsicCrossAxisSize < i10) {
                iIntrinsicCrossAxisSize = i10;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        qj.e eVarD2 = new qj.f(1, size - 1).d();
        while (eVarD2.c) {
            int i12 = iArr[eVarD2.nextInt()];
            if (i11 < i12) {
                i11 = i12;
            }
        }
        int i13 = i8;
        int i14 = i11;
        while (i14 < i8) {
            if (iIntrinsicCrossAxisSize == i2) {
                return i13;
            }
            i13 = (i14 + i8) / 2;
            iIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list, iArr, iArr2, i13, i3, i4);
            if (iIntrinsicCrossAxisSize == i2) {
                return i13;
            }
            if (iIntrinsicCrossAxisSize > i2) {
                i14 = i13 + 1;
            } else {
                i8 = i13 - 1;
            }
        }
        return i13;
    }

    @Composable
    private static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i2, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1479255111);
        if ((i4 & 1) != 0) {
            horizontal = Arrangement.INSTANCE.getEnd();
        }
        if ((i4 & 2) != 0) {
            vertical = Alignment.INSTANCE.getTop();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i3, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)");
        }
        s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> sVarMainAxisRowArrangement = mainAxisRowArrangement(horizontal, composer, i3 & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CrossAxisAlignment crossAxisAlignment = (CrossAxisAlignment) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i2);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(vertical) | composer.changed(horizontal) | composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = m440flowMeasurePolicy942rkJo(LayoutOrientation.Horizontal, sVarMainAxisRowArrangement, horizontal.getSpacing(), SizeMode.Wrap, crossAxisAlignment, crossAxisRowArrangement, i2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar2, int i2, int i3, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        Object objU1 = y.u1(0, list);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) objU1;
        int iIntValue = intrinsicMeasurable != null ? ((Number) qVar2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i2))).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? ((Number) qVar.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue))).intValue() : 0;
        int size = list.size();
        int i5 = i2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < size) {
            list.get(i6);
            kotlin.jvm.internal.m.e(objU1);
            i5 -= iIntValue2;
            int iMax = Math.max(i8, iIntValue);
            i6++;
            Object objU12 = y.u1(i6, list);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) objU12;
            int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) qVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(i2))).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? ((Number) qVar.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(iIntValue3))).intValue() + i3 : 0;
            if (i5 >= 0 && i6 != list.size()) {
                if (i6 - i9 == i4 || i5 - iIntValue4 < 0) {
                }
                int i10 = iIntValue3;
                i8 = iMax;
                objU1 = objU12;
                iIntValue2 = iIntValue4;
                iIntValue = i10;
            }
            i7 += iMax;
            iIntValue4 -= i3;
            i5 = i2;
            iMax = 0;
            i9 = i6;
            int i102 = iIntValue3;
            i8 = iMax;
            objU1 = objU12;
            iIntValue2 = iIntValue4;
            iIntValue = i102;
        }
        return i7;
    }
}
