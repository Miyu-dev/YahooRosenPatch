package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002J\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0013\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011J\u0006\u0010\u0014\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\rH\u0016R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "", "gapLength", "requestSize", "Lkotlin/j;", "makeSureAvailableSpace", "start", "end", "delete", "index", "", "get", "", "text", "replace", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "append", "length", "toString", "capacity", "I", "", "buffer", "[C", "gapStart", "gapEnd", "initBuffer", "initGapStart", "initGapEnd", "<init>", "([CII)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i2, int i3) {
        m.h(cArr, "initBuffer");
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i2;
        this.gapEnd = i3;
    }

    private final void delete(int i2, int i3) {
        int i4 = this.gapStart;
        if (i2 < i4 && i3 <= i4) {
            int i5 = i4 - i3;
            char[] cArr = this.buffer;
            n.n0(cArr, cArr, this.gapEnd - i5, i3, i4);
            this.gapStart = i2;
            this.gapEnd -= i5;
            return;
        }
        if (i2 < i4 && i3 >= i4) {
            this.gapEnd = i3 + gapLength();
            this.gapStart = i2;
            return;
        }
        int iGapLength = i2 + gapLength();
        int iGapLength2 = i3 + gapLength();
        int i6 = this.gapEnd;
        char[] cArr2 = this.buffer;
        n.n0(cArr2, cArr2, this.gapStart, i6, iGapLength);
        this.gapStart += iGapLength - i6;
        this.gapEnd = iGapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i2) {
        if (i2 <= gapLength()) {
            return;
        }
        int iGapLength = i2 - gapLength();
        int i3 = this.capacity;
        do {
            i3 *= 2;
        } while (i3 - this.capacity < iGapLength);
        char[] cArr = new char[i3];
        n.n0(this.buffer, cArr, 0, 0, this.gapStart);
        int i4 = this.capacity;
        int i5 = this.gapEnd;
        int i6 = i4 - i5;
        int i7 = i3 - i6;
        n.n0(this.buffer, cArr, i7, i5, i6 + i5);
        this.buffer = cArr;
        this.capacity = i3;
        this.gapEnd = i7;
    }

    public final void append(StringBuilder sb) {
        m.h(sb, "builder");
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i2 = this.gapEnd;
        sb.append(cArr, i2, this.capacity - i2);
    }

    public final char get(int index) {
        int i2 = this.gapStart;
        return index < i2 ? this.buffer[index] : this.buffer[(index - i2) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i2, int i3, String str) {
        m.h(str, "text");
        makeSureAvailableSpace(str.length() - (i3 - i2));
        delete(i2, i3);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart = str.length() + this.gapStart;
    }

    public String toString() {
        return "";
    }
}
