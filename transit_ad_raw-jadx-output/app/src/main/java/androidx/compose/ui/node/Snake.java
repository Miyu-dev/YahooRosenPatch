package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0018\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010!\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0011\u0010$\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0014\u0010(\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#\u0088\u0001\u0016\u0092\u0001\u00020\u0015ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/node/Snake;", "", "Landroidx/compose/ui/node/IntStack;", "diagonals", "Lkotlin/j;", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "addDiagonalToStack", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "", "hashCode-impl", "([I)I", "hashCode", "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "", "data", "[I", "getData", "()[I", "getStartX-impl", "startX", "getStartY-impl", "startY", "getEndX-impl", "endX", "getEndY-impl", "endY", "getReverse-impl", "([I)Z", "reverse", "getDiagonalSize-impl", "diagonalSize", "getHasAdditionOrRemoval-impl", "hasAdditionOrRemoval", "isAddition-impl", "isAddition", "constructor-impl", "([I)[I", "ui_release"}, k = 1, mv = {1, 8, 0})
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* JADX INFO: renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m4500addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        m.h(intStack, "diagonals");
        if (!m4508getHasAdditionOrRemovalimpl(iArr)) {
            intStack.pushDiagonal(m4510getStartXimpl(iArr), m4511getStartYimpl(iArr), m4506getEndXimpl(iArr) - m4510getStartXimpl(iArr));
            return;
        }
        if (m4509getReverseimpl(iArr)) {
            intStack.pushDiagonal(m4510getStartXimpl(iArr), m4511getStartYimpl(iArr), m4505getDiagonalSizeimpl(iArr));
        } else if (m4513isAdditionimpl(iArr)) {
            intStack.pushDiagonal(m4510getStartXimpl(iArr), m4511getStartYimpl(iArr) + 1, m4505getDiagonalSizeimpl(iArr));
        } else {
            intStack.pushDiagonal(m4510getStartXimpl(iArr) + 1, m4511getStartYimpl(iArr), m4505getDiagonalSizeimpl(iArr));
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m4501boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4502constructorimpl(int[] iArr) {
        m.h(iArr, "data");
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4503equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && m.c(iArr, ((Snake) obj).m4515unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4504equalsimpl0(int[] iArr, int[] iArr2) {
        return m.c(iArr, iArr2);
    }

    /* JADX INFO: renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m4505getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m4506getEndXimpl(iArr) - m4510getStartXimpl(iArr), m4507getEndYimpl(iArr) - m4511getStartYimpl(iArr));
    }

    /* JADX INFO: renamed from: getEndX-impl, reason: not valid java name */
    public static final int m4506getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* JADX INFO: renamed from: getEndY-impl, reason: not valid java name */
    public static final int m4507getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* JADX INFO: renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m4508getHasAdditionOrRemovalimpl(int[] iArr) {
        return m4507getEndYimpl(iArr) - m4511getStartYimpl(iArr) != m4506getEndXimpl(iArr) - m4510getStartXimpl(iArr);
    }

    /* JADX INFO: renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m4509getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* JADX INFO: renamed from: getStartX-impl, reason: not valid java name */
    public static final int m4510getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* JADX INFO: renamed from: getStartY-impl, reason: not valid java name */
    public static final int m4511getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4512hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m4513isAdditionimpl(int[] iArr) {
        return m4507getEndYimpl(iArr) - m4511getStartYimpl(iArr) > m4506getEndXimpl(iArr) - m4510getStartXimpl(iArr);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4514toStringimpl(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(m4510getStartXimpl(iArr));
        sb.append(',');
        sb.append(m4511getStartYimpl(iArr));
        sb.append(',');
        sb.append(m4506getEndXimpl(iArr));
        sb.append(',');
        sb.append(m4507getEndYimpl(iArr));
        sb.append(',');
        return androidx.compose.animation.a.d(sb, m4509getReverseimpl(iArr), ')');
    }

    public boolean equals(Object obj) {
        return m4503equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m4512hashCodeimpl(this.data);
    }

    public String toString() {
        return m4514toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4515unboximpl() {
        return this.data;
    }
}
