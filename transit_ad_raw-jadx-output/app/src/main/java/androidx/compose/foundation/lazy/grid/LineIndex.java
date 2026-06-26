package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.appcompat.app.m;
import kotlin.Metadata;

/* JADX INFO: compiled from: ItemIndex.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0014\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/grid/LineIndex;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "compareTo", "other", "compareTo-bKFJvoY", "(II)I", "dec", "dec-hA7yfN8", "equals", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "inc", "inc-hA7yfN8", "minus", "i", "minus-fVkYB0M", "minus--_Ze7BM", "plus", "plus--_Ze7BM", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LineIndex {
    private final int value;

    private /* synthetic */ LineIndex(int i2) {
        this.value = i2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineIndex m656boximpl(int i2) {
        return new LineIndex(i2);
    }

    /* JADX INFO: renamed from: compareTo-bKFJvoY, reason: not valid java name */
    public static final int m657compareTobKFJvoY(int i2, int i3) {
        return i2 - i3;
    }

    /* JADX INFO: renamed from: dec-hA7yfN8, reason: not valid java name */
    public static final int m659dechA7yfN8(int i2) {
        return m658constructorimpl(i2 - 1);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m660equalsimpl(int i2, Object obj) {
        return (obj instanceof LineIndex) && i2 == ((LineIndex) obj).m668unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m661equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: inc-hA7yfN8, reason: not valid java name */
    public static final int m663inchA7yfN8(int i2) {
        return m658constructorimpl(i2 + 1);
    }

    /* JADX INFO: renamed from: minus--_Ze7BM, reason: not valid java name */
    public static final int m664minus_Ze7BM(int i2, int i3) {
        return m658constructorimpl(i2 - i3);
    }

    /* JADX INFO: renamed from: minus-fVkYB0M, reason: not valid java name */
    public static final int m665minusfVkYB0M(int i2, int i3) {
        return m658constructorimpl(i2 - i3);
    }

    /* JADX INFO: renamed from: plus--_Ze7BM, reason: not valid java name */
    public static final int m666plus_Ze7BM(int i2, int i3) {
        return m658constructorimpl(i2 + i3);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m667toStringimpl(int i2) {
        return m.h("LineIndex(value=", i2, ')');
    }

    public boolean equals(Object obj) {
        return m660equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m662hashCodeimpl(this.value);
    }

    public String toString() {
        return m667toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m668unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m658constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m662hashCodeimpl(int i2) {
        return i2;
    }
}
