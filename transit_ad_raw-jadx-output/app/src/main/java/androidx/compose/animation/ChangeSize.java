package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003ø\u0001\u0000J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003ø\u0001\u0000J\t\u0010\n\u001a\u00020\tHÆ\u0003JF\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001ø\u0001\u0000J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "component2", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component3", "", "component4", "alignment", "size", "animationSpec", "clip", "copy", "", "toString", "", "hashCode", "other", "equals", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Lkj/l;", "getSize", "()Lkj/l;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "Z", "getClip", "()Z", "<init>", "(Landroidx/compose/ui/Alignment;Lkj/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "animation_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ChangeSize {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final l<IntSize, IntSize> size;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(Alignment alignment, l<? super IntSize, IntSize> lVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        m.h(alignment, "alignment");
        m.h(lVar, "size");
        m.h(finiteAnimationSpec, "animationSpec");
        this.alignment = alignment;
        this.size = lVar;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i2 & 2) != 0) {
            lVar = changeSize.size;
        }
        if ((i2 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i2 & 8) != 0) {
            z = changeSize.clip;
        }
        return changeSize.copy(alignment, lVar, finiteAnimationSpec, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final l<IntSize, IntSize> component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment, l<? super IntSize, IntSize> lVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        m.h(alignment, "alignment");
        m.h(lVar, "size");
        m.h(finiteAnimationSpec, "animationSpec");
        return new ChangeSize(alignment, lVar, finiteAnimationSpec, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return m.c(this.alignment, changeSize.alignment) && m.c(this.size, changeSize.size) && m.c(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final l<IntSize, IntSize> getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = (this.animationSpec.hashCode() + ((this.size.hashCode() + (this.alignment.hashCode() * 31)) * 31)) * 31;
        boolean z = this.clip;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.alignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", clip=");
        return a.d(sb, this.clip, ')');
    }

    public /* synthetic */ ChangeSize(Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, (i2 & 2) != 0 ? new l<IntSize, IntSize>() { // from class: androidx.compose.animation.ChangeSize.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m5419boximpl(m63invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m63invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(0, 0);
            }
        } : lVar, finiteAnimationSpec, (i2 & 8) != 0 ? true : z);
    }
}
