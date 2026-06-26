package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a(\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001aU\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u0011\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a]\u0010\u0012\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a8\u0010#\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0000\u001a\u001c\u0010&\u001a\u00020\t*\u00020\u00132\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "cb", "Landroidx/compose/ui/node/IntStack;", "calculateDiff", "diagonals", "callback", "Lkotlin/j;", "applyDiff", "executeDiff", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/CenteredArray;", "forward", "backward", "", "snake", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "midPoint", "d", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "backward-4l5_RBY", "startX", "startY", "endX", "endY", "reverse", "data", "fillSnake", "i", "j", "swap", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class MyersDiffKt {
    private static final void applyDiff(int i2, int i3, IntStack intStack, DiffCallback diffCallback) {
        while (intStack.isNotEmpty()) {
            int iPop = intStack.pop();
            int iPop2 = intStack.pop();
            int iPop3 = intStack.pop();
            while (i2 > iPop3) {
                i2--;
                diffCallback.remove(i2);
            }
            while (i3 > iPop2) {
                i3--;
                diffCallback.insert(i2, i3);
            }
            while (true) {
                int i4 = iPop - 1;
                if (iPop > 0) {
                    i2--;
                    i3--;
                    diffCallback.same(i2, i3);
                    iPop = i4;
                }
            }
        }
        while (i2 > 0) {
            i2--;
            diffCallback.remove(i2);
        }
        while (i3 > 0) {
            i3--;
            diffCallback.insert(i2, i3);
        }
    }

    /* JADX INFO: renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m4399backward4l5_RBY(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM4322getimpl;
        int i7;
        int i8;
        int i9 = (i3 - i2) - (i5 - i4);
        boolean z = i9 % 2 == 0;
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && CenteredArray.m4322getimpl(iArr2, i11 + 1) < CenteredArray.m4322getimpl(iArr2, i11 - 1))) {
                iM4322getimpl = CenteredArray.m4322getimpl(iArr2, i11 + 1);
                i7 = iM4322getimpl;
            } else {
                iM4322getimpl = CenteredArray.m4322getimpl(iArr2, i11 - 1);
                i7 = iM4322getimpl - 1;
            }
            int i12 = i5 - ((i3 - i7) - i11);
            int i13 = (i6 == 0 || i7 != iM4322getimpl) ? i12 : i12 + 1;
            while (i7 > i2 && i12 > i4) {
                if (!diffCallback.areItemsTheSame(i7 - 1, i12 - 1)) {
                    break;
                }
                i7--;
                i12--;
            }
            CenteredArray.m4325setimpl(iArr2, i11, i7);
            if (z && (i8 = i9 - i11) >= i10 && i8 <= i6) {
                if (CenteredArray.m4322getimpl(iArr, i8) >= i7) {
                    fillSnake(i7, i12, iM4322getimpl, i13, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i2, int i3, DiffCallback diffCallback) {
        int i4 = ((i2 + i3) + 1) / 2;
        IntStack intStack = new IntStack(i4 * 3);
        IntStack intStack2 = new IntStack(i4 * 4);
        intStack2.pushRange(0, i2, 0, i3);
        int i5 = (i4 * 2) + 1;
        int[] iArrM4319constructorimpl = CenteredArray.m4319constructorimpl(new int[i5]);
        int[] iArrM4319constructorimpl2 = CenteredArray.m4319constructorimpl(new int[i5]);
        int[] iArrM4502constructorimpl = Snake.m4502constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM4319constructorimpl;
            int[] iArr2 = iArrM4319constructorimpl2;
            if (m4401midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM4319constructorimpl, iArrM4319constructorimpl2, iArrM4502constructorimpl)) {
                if (Snake.m4505getDiagonalSizeimpl(iArrM4502constructorimpl) > 0) {
                    Snake.m4500addDiagonalToStackimpl(iArrM4502constructorimpl, intStack);
                }
                intStack2.pushRange(iPop4, Snake.m4510getStartXimpl(iArrM4502constructorimpl), iPop2, Snake.m4511getStartYimpl(iArrM4502constructorimpl));
                intStack2.pushRange(Snake.m4506getEndXimpl(iArrM4502constructorimpl), iPop3, Snake.m4507getEndYimpl(iArrM4502constructorimpl), iPop);
            }
            iArrM4319constructorimpl = iArr;
            iArrM4319constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i2, i3, 0);
        return intStack;
    }

    public static final void executeDiff(int i2, int i3, DiffCallback diffCallback) {
        m.h(diffCallback, "callback");
        applyDiff(i2, i3, calculateDiff(i2, i3, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
        m.h(iArr, "data");
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m4400forward4l5_RBY(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM4322getimpl;
        int i7;
        int i8;
        int i9 = (i3 - i2) - (i5 - i4);
        boolean z = Math.abs(i9) % 2 == 1;
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && CenteredArray.m4322getimpl(iArr, i11 + 1) > CenteredArray.m4322getimpl(iArr, i11 - 1))) {
                iM4322getimpl = CenteredArray.m4322getimpl(iArr, i11 + 1);
                i7 = iM4322getimpl;
            } else {
                iM4322getimpl = CenteredArray.m4322getimpl(iArr, i11 - 1);
                i7 = iM4322getimpl + 1;
            }
            int i12 = ((i7 - i2) + i4) - i11;
            int i13 = (i6 == 0 || i7 != iM4322getimpl) ? i12 : i12 - 1;
            while (i7 < i3 && i12 < i5) {
                if (!diffCallback.areItemsTheSame(i7, i12)) {
                    break;
                }
                i7++;
                i12++;
            }
            CenteredArray.m4325setimpl(iArr, i11, i7);
            if (z && (i8 = i9 - i11) >= i10 + 1 && i8 <= i6 - 1) {
                if (CenteredArray.m4322getimpl(iArr2, i8) <= i7) {
                    fillSnake(iM4322getimpl, i13, i7, i12, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m4401midPointq5eDKzI(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i6 = i3 - i2;
        int i7 = i5 - i4;
        if (i6 >= 1 && i7 >= 1) {
            int i8 = ((i6 + i7) + 1) / 2;
            CenteredArray.m4325setimpl(iArr, 1, i2);
            CenteredArray.m4325setimpl(iArr2, 1, i3);
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9;
                if (m4400forward4l5_RBY(i2, i3, i4, i5, diffCallback, iArr, iArr2, i9, iArr3) || m4399backward4l5_RBY(i2, i3, i4, i5, diffCallback, iArr, iArr2, i10, iArr3)) {
                    return true;
                }
                i9 = i10 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
    }
}
