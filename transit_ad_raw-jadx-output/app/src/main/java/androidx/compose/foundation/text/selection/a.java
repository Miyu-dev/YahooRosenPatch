package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Pair;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ Pair a(Selectable selectable, long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i2, Object obj) {
        if (obj == null) {
            return selectable.mo919updateSelectionqCDeeow(j, j2, offset, (i2 & 8) != 0 ? true : z, layoutCoordinates, selectionAdjustment, (i2 & 64) != 0 ? null : selection);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }
}
