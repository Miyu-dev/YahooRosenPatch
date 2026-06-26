package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c {
    public static void a(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static int b(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(layoutModifierNode, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public static int c(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(layoutModifierNode, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public static int d(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(layoutModifierNode, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public static int e(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(layoutModifierNode, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }
}
