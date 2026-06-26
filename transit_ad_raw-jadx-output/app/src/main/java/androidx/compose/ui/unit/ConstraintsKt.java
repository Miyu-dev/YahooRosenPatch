package androidx.compose.ui.unit;

import a.l;
import androidx.appcompat.widget.v;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i2, int i3, int i4, int i5) {
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')').toString());
        }
        if (i5 >= i4) {
            if (i2 >= 0 && i4 >= 0) {
                return Constraints.INSTANCE.m5242createConstraintsZbe2FdA$ui_unit_release(i2, i3, i4, i5);
            }
            throw new IllegalArgumentException(v.f("minWidth(", i2, ") and minHeight(", i4, ") must be >= 0").toString());
        }
        throw new IllegalArgumentException(("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i2, i3, i4, i5);
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 + i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m5246constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(l.i(IntSize.m5427getWidthimpl(j2), Constraints.m5237getMinWidthimpl(j), Constraints.m5235getMaxWidthimpl(j)), l.i(IntSize.m5426getHeightimpl(j2), Constraints.m5236getMinHeightimpl(j), Constraints.m5234getMaxHeightimpl(j)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m5247constrainN9IONVI(long j, long j2) {
        return Constraints(l.i(Constraints.m5237getMinWidthimpl(j2), Constraints.m5237getMinWidthimpl(j), Constraints.m5235getMaxWidthimpl(j)), l.i(Constraints.m5235getMaxWidthimpl(j2), Constraints.m5237getMinWidthimpl(j), Constraints.m5235getMaxWidthimpl(j)), l.i(Constraints.m5236getMinHeightimpl(j2), Constraints.m5236getMinHeightimpl(j), Constraints.m5234getMaxHeightimpl(j)), l.i(Constraints.m5234getMaxHeightimpl(j2), Constraints.m5236getMinHeightimpl(j), Constraints.m5234getMaxHeightimpl(j)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m5248constrainHeightK40F9xA(long j, int i2) {
        return l.i(i2, Constraints.m5236getMinHeightimpl(j), Constraints.m5234getMaxHeightimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m5249constrainWidthK40F9xA(long j, int i2) {
        return l.i(i2, Constraints.m5237getMinWidthimpl(j), Constraints.m5235getMaxWidthimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m5250isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(j);
        int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
        int iM5427getWidthimpl = IntSize.m5427getWidthimpl(j2);
        if (iM5237getMinWidthimpl <= iM5427getWidthimpl && iM5427getWidthimpl <= iM5235getMaxWidthimpl) {
            int iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j);
            int iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
            int iM5426getHeightimpl = IntSize.m5426getHeightimpl(j2);
            if (iM5236getMinHeightimpl <= iM5426getHeightimpl && iM5426getHeightimpl <= iM5234getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m5251offsetNN6EwU(long j, int i2, int i3) {
        int iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(j) + i2;
        if (iM5237getMinWidthimpl < 0) {
            iM5237getMinWidthimpl = 0;
        }
        int iAddMaxWithMinimum = addMaxWithMinimum(Constraints.m5235getMaxWidthimpl(j), i2);
        int iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j) + i3;
        return Constraints(iM5237getMinWidthimpl, iAddMaxWithMinimum, iM5236getMinHeightimpl >= 0 ? iM5236getMinHeightimpl : 0, addMaxWithMinimum(Constraints.m5234getMaxHeightimpl(j), i3));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m5252offsetNN6EwU$default(long j, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return m5251offsetNN6EwU(j, i2, i3);
    }
}
