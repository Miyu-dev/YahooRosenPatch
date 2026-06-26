package androidx.compose.ui.node;

import androidx.appcompat.R;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ObserverNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ModifierNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "observerNode", "Landroidx/compose/ui/node/ObserverNode;", "(Landroidx/compose/ui/node/ObserverNode;)V", "isValidOwnerScope", "", "()Z", "getObserverNode$ui_release", "()Landroidx/compose/ui/node/ObserverNode;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ModifierNodeOwnerScope implements OwnerScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<ModifierNodeOwnerScope, j> OnObserveReadsChanged = new l<ModifierNodeOwnerScope, j>() { // from class: androidx.compose.ui.node.ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ModifierNodeOwnerScope) obj);
            return j.a;
        }

        public final void invoke(ModifierNodeOwnerScope modifierNodeOwnerScope) {
            m.h(modifierNodeOwnerScope, "it");
            if (modifierNodeOwnerScope.isValidOwnerScope()) {
                modifierNodeOwnerScope.getObserverNode().onObservedReadsChanged();
            }
        }
    };
    private final ObserverNode observerNode;

    /* JADX INFO: compiled from: ObserverNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ModifierNodeOwnerScope$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ModifierNodeOwnerScope;", "Lkotlin/j;", "OnObserveReadsChanged", "Lkj/l;", "getOnObserveReadsChanged$ui_release", "()Lkj/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l<ModifierNodeOwnerScope, j> getOnObserveReadsChanged$ui_release() {
            return ModifierNodeOwnerScope.OnObserveReadsChanged;
        }

        private Companion() {
        }
    }

    public ModifierNodeOwnerScope(ObserverNode observerNode) {
        m.h(observerNode, "observerNode");
        this.observerNode = observerNode;
    }

    /* JADX INFO: renamed from: getObserverNode$ui_release, reason: from getter */
    public final ObserverNode getObserverNode() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().getIsAttached();
    }
}
