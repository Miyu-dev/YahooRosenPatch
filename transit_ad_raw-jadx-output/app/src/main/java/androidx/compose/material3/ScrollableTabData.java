package androidx.compose.material3;

import a.l;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import dj.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/ScrollableTabData;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/unit/Density;", "density", "", "edgeOffset", "", "tabPositions", "calculateTabOffset", "selectedTab", "Lkotlin/j;", "onLaidOut", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/lang/Integer;", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
final class ScrollableTabData {
    private final CoroutineScope coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        m.h(scrollState, "scrollState");
        m.h(coroutineScope, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i2, List<TabPosition> list) {
        int iMo342roundToPx0680j_4 = density.mo342roundToPx0680j_4(((TabPosition) y.z1(list)).m1638getRightD9Ej5fM()) + i2;
        int maxValue = iMo342roundToPx0680j_4 - this.scrollState.getMaxValue();
        int iMo342roundToPx0680j_42 = density.mo342roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (density.mo342roundToPx0680j_4(tabPosition.getWidth()) / 2));
        int i3 = iMo342roundToPx0680j_4 - maxValue;
        if (i3 < 0) {
            i3 = 0;
        }
        return l.i(iMo342roundToPx0680j_42, 0, i3);
    }

    public final void onLaidOut(Density density, int i2, List<TabPosition> list, int i3) {
        int iCalculateTabOffset;
        m.h(density, "density");
        m.h(list, "tabPositions");
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i3) {
            return;
        }
        this.selectedTab = Integer.valueOf(i3);
        TabPosition tabPosition = (TabPosition) y.u1(i3, list);
        if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, density, i2, list))) {
            return;
        }
        BuildersKt.launch$default(this.coroutineScope, (e) null, (CoroutineStart) null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3, (Object) null);
    }
}
