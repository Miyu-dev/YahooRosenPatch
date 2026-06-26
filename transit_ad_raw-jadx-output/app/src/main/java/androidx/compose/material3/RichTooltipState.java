package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004R+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/RichTooltipState;", "Landroidx/compose/material3/TooltipState;", "Lkotlin/j;", "show", "(Ldj/c;)Ljava/lang/Object;", "dismiss", "", "<set-?>", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible$material3_release", "(Z)V", "isPersistent$delegate", "isPersistent$material3_release", "setPersistent$material3_release", "isPersistent", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class RichTooltipState implements TooltipState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: isPersistent$delegate, reason: from kotlin metadata */
    private final MutableState isPersistent;

    /* JADX INFO: renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final MutableState isVisible;

    public RichTooltipState() {
        Boolean bool = Boolean.FALSE;
        this.isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isPersistent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // androidx.compose.material3.TooltipState
    public Object dismiss(dj.c<? super j> cVar) {
        Object objDismissCurrentTooltip = TooltipSync.INSTANCE.dismissCurrentTooltip(this, cVar);
        return objDismissCurrentTooltip == CoroutineSingletons.COROUTINE_SUSPENDED ? objDismissCurrentTooltip : j.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPersistent$material3_release() {
        return ((Boolean) this.isPersistent.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void setPersistent$material3_release(boolean z) {
        this.isPersistent.setValue(Boolean.valueOf(z));
    }

    public void setVisible$material3_release(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.material3.TooltipState
    public Object show(dj.c<? super j> cVar) throws NoWhenBranchMatchedException {
        Object objShow = TooltipSync.INSTANCE.show(this, isPersistent$material3_release(), cVar);
        return objShow == CoroutineSingletons.COROUTINE_SUSPENDED ? objShow : j.a;
    }
}
