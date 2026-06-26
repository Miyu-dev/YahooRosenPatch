package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import bk.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kj.l;
import kj.p;
import kj.q;
import kj.s;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.collections.t;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\be\u0010fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J-\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J=\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\u00060-j\u0002`.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R0\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R?\u00109\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u0001088\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u00103\u001a\u0004\b@\u00105\"\u0004\bA\u00107RK\u0010C\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010B8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u00103\u001a\u0004\bQ\u00105\"\u0004\bR\u00107R0\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u00103\u001a\u0004\bT\u00105\"\u0004\bU\u00107RC\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020W0V2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020W0V8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006g"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "Lkotlin/j;", "unsubscribe", "", "nextSelectableId", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "notifySelectionUpdateStart-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "", "isStartHandle", "notifySelectionUpdate-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "", "_selectables", "Ljava/util/List;", "", "_selectableMap", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lkj/l;", "getOnPositionChangeCallback$foundation_release", "()Lkj/l;", "setOnPositionChangeCallback$foundation_release", "(Lkj/l;)V", "Lkotlin/Function3;", "onSelectionUpdateStartCallback", "Lkj/q;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkj/q;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkj/q;)V", "onSelectionUpdateSelectAll", "getOnSelectionUpdateSelectAll$foundation_release", "setOnSelectionUpdateSelectAll$foundation_release", "Lkotlin/Function5;", "onSelectionUpdateCallback", "Lkj/s;", "getOnSelectionUpdateCallback$foundation_release", "()Lkj/s;", "setOnSelectionUpdateCallback$foundation_release", "(Lkj/s;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lkj/a;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkj/a;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkj/a;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Ljava/util/Map;", "setSubselections", "(Ljava/util/Map;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private l<? super Long, j> afterSelectableUnsubscribe;
    private l<? super Long, j> onPositionChangeCallback;
    private l<? super Long, j> onSelectableChangeCallback;
    private s<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;
    private kj.a<j> onSelectionUpdateEndCallback;
    private l<? super Long, j> onSelectionUpdateSelectAll;
    private q<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, j> onSelectionUpdateStartCallback;
    private boolean sorted;
    private final List<Selectable> _selectables = new ArrayList();
    private final Map<Long, Selectable> _selectableMap = new LinkedHashMap();
    private AtomicLong incrementId = new AtomicLong(1);

    /* JADX INFO: renamed from: subselections$delegate, reason: from kotlin metadata */
    private final MutableState subselections = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a0.a, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(p pVar, Object obj, Object obj2) {
        m.h(pVar, "$tmp0");
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public final l<Long, j> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final l<Long, j> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final l<Long, j> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final s<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final kj.a<j> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final l<Long, j> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final q<LayoutCoordinates, Offset, SelectionAdjustment, j> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final Map<Long, Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    /* JADX INFO: renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Map<Long, Selection> getSubselections() {
        return (Map) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j) {
        this.sorted = false;
        l<? super Long, j> lVar = this.onPositionChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j) {
        l<? super Long, j> lVar = this.onSelectableChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdate-5iVPX68 */
    public boolean mo978notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        m.h(layoutCoordinates, "layoutCoordinates");
        m.h(adjustment, "adjustment");
        s<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar = this.onSelectionUpdateCallback;
        if (sVar != null) {
            return ((Boolean) sVar.invoke(layoutCoordinates, Offset.m2574boximpl(newPosition), Offset.m2574boximpl(previousPosition), Boolean.valueOf(isStartHandle), adjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        kj.a<j> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j) {
        l<? super Long, j> lVar = this.onSelectionUpdateSelectAll;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdateStart-d-4ec7I */
    public void mo979notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long startPosition, SelectionAdjustment adjustment) {
        m.h(layoutCoordinates, "layoutCoordinates");
        m.h(adjustment, "adjustment");
        q<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, j> qVar = this.onSelectionUpdateStartCallback;
        if (qVar != null) {
            qVar.invoke(layoutCoordinates, Offset.m2574boximpl(startPosition), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(l<? super Long, j> lVar) {
        this.afterSelectableUnsubscribe = lVar;
    }

    public final void setOnPositionChangeCallback$foundation_release(l<? super Long, j> lVar) {
        this.onPositionChangeCallback = lVar;
    }

    public final void setOnSelectableChangeCallback$foundation_release(l<? super Long, j> lVar) {
        this.onSelectableChangeCallback = lVar;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(s<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar) {
        this.onSelectionUpdateCallback = sVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(kj.a<j> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(l<? super Long, j> lVar) {
        this.onSelectionUpdateSelectAll = lVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(q<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, j> qVar) {
        this.onSelectionUpdateStartCallback = qVar;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.sorted = z;
    }

    public void setSubselections(Map<Long, Selection> map) {
        m.h(map, "<set-?>");
        this.subselections.setValue(map);
    }

    public final List<Selectable> sort(final LayoutCoordinates containerLayoutCoordinates) {
        m.h(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final p<Selectable, Selectable, Integer> pVar = new p<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                {
                    super(2);
                }

                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    m.h(selectable, "a");
                    m.h(selectable2, "b");
                    LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
                    long jMo4240localPositionOfR5De75A = layoutCoordinates != null ? containerLayoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m2601getZeroF1C5BW0()) : Offset.INSTANCE.m2601getZeroF1C5BW0();
                    long jMo4240localPositionOfR5De75A2 = layoutCoordinates2 != null ? containerLayoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m2601getZeroF1C5BW0()) : Offset.INSTANCE.m2601getZeroF1C5BW0();
                    return Integer.valueOf((Offset.m2586getYimpl(jMo4240localPositionOfR5De75A) > Offset.m2586getYimpl(jMo4240localPositionOfR5De75A2) ? 1 : (Offset.m2586getYimpl(jMo4240localPositionOfR5De75A) == Offset.m2586getYimpl(jMo4240localPositionOfR5De75A2) ? 0 : -1)) == 0 ? f.d(Float.valueOf(Offset.m2585getXimpl(jMo4240localPositionOfR5De75A)), Float.valueOf(Offset.m2585getXimpl(jMo4240localPositionOfR5De75A2))) : f.d(Float.valueOf(Offset.m2586getYimpl(jMo4240localPositionOfR5De75A)), Float.valueOf(Offset.m2586getYimpl(jMo4240localPositionOfR5De75A2))));
                }
            };
            t.V0(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.sort$lambda$2(pVar, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        m.h(selectable, "selectable");
        if (!(selectable.getSelectableId() != 0)) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
            this._selectables.add(selectable);
            this.sorted = false;
            return selectable;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        m.h(selectable, "selectable");
        if (this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
            l<? super Long, j> lVar = this.afterSelectableUnsubscribe;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }
}
