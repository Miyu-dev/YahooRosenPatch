package android.view.compose;

import android.view.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kj.a;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0002J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "Lkotlin/j;", "", "predicate", "observeReporter", "invoke", "removeReporter", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "Landroidx/activity/FullyDrawnReporter;", "Lkj/a;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Lkotlin/Function1;", "checkReporter", "Lkj/l;", "<init>", "(Landroidx/activity/FullyDrawnReporter;Lkj/a;)V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
final class ReportDrawnComposition implements a<j> {
    private final l<a<Boolean>, j> checkReporter;
    private final FullyDrawnReporter fullyDrawnReporter;
    private final a<Boolean> predicate;
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, a<Boolean> aVar) {
        m.h(fullyDrawnReporter, "fullyDrawnReporter");
        m.h(aVar, "predicate");
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<a<? extends j>, j>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            public final void invoke(a<j> aVar2) {
                m.h(aVar2, "command");
                aVar2.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((a<j>) obj);
                return j.a;
            }
        });
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final a<Boolean> aVar) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.snapshotStateObserver.observeReads(aVar, this.checkReporter, new a<j>() { // from class: androidx.activity.compose.ReportDrawnComposition.observeReporter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m15invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m15invoke() {
                booleanRef.element = ((Boolean) aVar.invoke()).booleanValue();
            }
        });
        if (booleanRef.element) {
            removeReporter();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m14invoke();
        return j.a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        m14invoke();
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m14invoke() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
