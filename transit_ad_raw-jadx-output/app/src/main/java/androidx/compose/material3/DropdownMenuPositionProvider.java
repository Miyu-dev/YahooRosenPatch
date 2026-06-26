package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import uj.h;
import uj.l;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013ø\u0001\u0001¢\u0006\u0004\b,\u0010-J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\rHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R \u0010\u0016\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/unit/DpOffset;", "component1-RKDOV3M", "()J", "component1", "Landroidx/compose/ui/unit/Density;", "component2", "Lkotlin/Function2;", "Lkotlin/j;", "component3", "contentOffset", "density", "onPositionCalculated", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkj/p;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "getContentOffset-RKDOV3M", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Lkj/p;", "getOnPositionCalculated", "()Lkj/p;", "<init>", "(JLandroidx/compose/ui/unit/Density;Lkj/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    private final Density density;
    private final p<IntRect, IntRect, j> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1270copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i2 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1272copyrOJDEFc(j, density, pVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo916calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        h hVarS;
        Object obj;
        Object next;
        m.h(anchorBounds, "anchorBounds");
        m.h(layoutDirection, "layoutDirection");
        int iMo342roundToPx0680j_4 = this.density.mo342roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int iMo342roundToPx0680j_42 = this.density.mo342roundToPx0680j_4(DpOffset.m5328getXD9Ej5fM(this.contentOffset));
        int iMo342roundToPx0680j_43 = this.density.mo342roundToPx0680j_4(DpOffset.m5330getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + iMo342roundToPx0680j_42;
        int right = (anchorBounds.getRight() - iMo342roundToPx0680j_42) - IntSize.m5427getWidthimpl(popupContentSize);
        int iM5427getWidthimpl = IntSize.m5427getWidthimpl(windowSize) - IntSize.m5427getWidthimpl(popupContentSize);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(left);
            numArr[1] = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                iM5427getWidthimpl = 0;
            }
            numArr[2] = Integer.valueOf(iM5427getWidthimpl);
            hVarS = l.s(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(right);
            numArr2[1] = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m5427getWidthimpl(windowSize)) {
                iM5427getWidthimpl = 0;
            }
            numArr2[2] = Integer.valueOf(iM5427getWidthimpl);
            hVarS = l.s(numArr2);
        }
        Iterator it = hVarS.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && IntSize.m5427getWidthimpl(popupContentSize) + iIntValue <= IntSize.m5427getWidthimpl(windowSize)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(anchorBounds.getBottom() + iMo342roundToPx0680j_43, iMo342roundToPx0680j_4);
        int top = (anchorBounds.getTop() - iMo342roundToPx0680j_43) - IntSize.m5426getHeightimpl(popupContentSize);
        Iterator it2 = l.s(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m5426getHeightimpl(popupContentSize) / 2)), Integer.valueOf((IntSize.m5426getHeightimpl(windowSize) - IntSize.m5426getHeightimpl(popupContentSize)) - iMo342roundToPx0680j_4)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue2 = ((Number) next2).intValue();
            if (iIntValue2 >= iMo342roundToPx0680j_4 && IntSize.m5426getHeightimpl(popupContentSize) + iIntValue2 <= IntSize.m5426getHeightimpl(windowSize) - iMo342roundToPx0680j_4) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, top, IntSize.m5427getWidthimpl(popupContentSize) + right, IntSize.m5426getHeightimpl(popupContentSize) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final p<IntRect, IntRect, j> component3() {
        return this.onPositionCalculated;
    }

    /* JADX INFO: renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1272copyrOJDEFc(long contentOffset, Density density, p<? super IntRect, ? super IntRect, j> onPositionCalculated) {
        m.h(density, "density");
        m.h(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(contentOffset, density, onPositionCalculated, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m5327equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && m.c(this.density, dropdownMenuPositionProvider.density) && m.c(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1273getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final p<IntRect, IntRect, j> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + ((this.density.hashCode() + (DpOffset.m5332hashCodeimpl(this.contentOffset) * 31)) * 31);
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m5335toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, Density density, p<? super IntRect, ? super IntRect, j> pVar) {
        m.h(density, "density");
        m.h(pVar, "onPositionCalculated");
        this.contentOffset = j;
        this.density = density;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, p pVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i2 & 4) != 0 ? new p<IntRect, IntRect, j>() { // from class: androidx.compose.material3.DropdownMenuPositionProvider.1
            public final void invoke(IntRect intRect, IntRect intRect2) {
                m.h(intRect, "<anonymous parameter 0>");
                m.h(intRect2, "<anonymous parameter 1>");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return j.a;
            }
        } : pVar, null);
    }
}
