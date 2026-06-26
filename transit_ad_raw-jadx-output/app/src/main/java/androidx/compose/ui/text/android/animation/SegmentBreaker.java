package androidx.compose.ui.text.android.animation;

import a.f;
import android.text.Layout;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SegmentBreaker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SegmentBreaker {
    public static final int $stable = 0;
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* JADX INFO: compiled from: SegmentBreaker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        CharSequence text = layoutHelper.getLayout().getText();
        m.g(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        m.g(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i2).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i3 = 0; i3 < paragraphCount; i3++) {
            Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i3);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i3);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i4 = 0; i4 < runCount; i4++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i4) + paragraphStart));
                }
            }
        }
        return y.X1(treeSet);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithChar(androidx.compose.ui.text.android.LayoutHelper r21, boolean r22) throws kotlin.NoWhenBranchMatchedException {
        /*
            r20 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.compose.ui.text.android.animation.SegmentType r2 = androidx.compose.ui.text.android.animation.SegmentType.Character
            r3 = r20
            java.util.List r2 = r3.breakOffsets(r0, r2)
            int r4 = r2.size()
            if (r4 == 0) goto Lba
            int r4 = r2.size()
            r5 = 1
            if (r4 != r5) goto L1e
            goto Lba
        L1e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
            java.lang.Object r7 = r2.get(r6)
            int r8 = a.f.I(r2)
            r9 = r6
        L2d:
            if (r9 >= r8) goto Lbc
            int r9 = r9 + 1
            java.lang.Object r10 = r2.get(r9)
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r14 = r11.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r13 = r7.intValue()
            android.text.Layout r7 = r21.getLayout()
            if (r22 == 0) goto L5d
            int r11 = r13 + 1
            if (r14 != r11) goto L5d
            java.lang.CharSequence r11 = r7.getText()
            char r11 = r11.charAt(r13)
            boolean r11 = r0.isLineEndSpace(r11)
            if (r11 == 0) goto L5d
            r19 = r8
            goto Lae
        L5d:
            int r11 = androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(r7, r13, r6)
            int r12 = r7.getParagraphDirection(r11)
            r15 = -1
            if (r12 != r15) goto L6a
            r12 = r5
            goto L6b
        L6a:
            r12 = r6
        L6b:
            boolean r15 = r7.isRtlCharAt(r13)
            if (r15 != r12) goto L72
            goto L73
        L72:
            r5 = r6
        L73:
            float r5 = r0.getHorizontalPosition(r13, r5, r6)
            r16 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.ceil(r6)
            float r5 = (float) r5
            int r5 = (int) r5
            if (r15 != r12) goto L84
            r6 = 1
            goto L85
        L84:
            r6 = 0
        L85:
            r7 = 1
            float r6 = r0.getHorizontalPosition(r14, r6, r7)
            r19 = r8
            double r7 = (double) r6
            double r6 = java.lang.Math.ceil(r7)
            float r6 = (float) r6
            int r6 = (int) r6
            androidx.compose.ui.text.android.animation.Segment r7 = new androidx.compose.ui.text.android.animation.Segment
            int r15 = java.lang.Math.min(r5, r6)
            r8 = r16
            int r16 = r8.getLineTop(r11)
            int r17 = java.lang.Math.max(r5, r6)
            int r18 = r8.getLineBottom(r11)
            r12 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.add(r7)
        Lae:
            kotlin.j r5 = kotlin.j.a
            r4.add(r5)
            r7 = r10
            r8 = r19
            r5 = 1
            r6 = 0
            goto L2d
        Lba:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.animation.SegmentBreaker.breakSegmentWithChar(androidx.compose.ui.text.android.LayoutHelper, boolean):java.util.List");
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return f.U(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            arrayList.add(new Segment(layout.getLineStart(i2), layout.getLineEnd(i2), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i2)) : 0, layout.getLineTop(i2), dropSpaces ? (int) Math.ceil(layout.getLineRight(i2)) : layout.getWidth(), layout.getLineBottom(i2)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            int paragraphStart = layoutHelper.getParagraphStart(i2);
            int paragraphEnd = layoutHelper.getParagraphEnd(i2);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean dropSpaces) throws NoWhenBranchMatchedException {
        int i2;
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                Integer num = listBreakOffsets.get(0);
                int I = f.I(listBreakOffsets);
                int i3 = 0;
                while (i3 < I) {
                    i3++;
                    Integer num2 = listBreakOffsets.get(i3);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z2);
                    boolean z3 = layout.getParagraphDirection(lineForOffset) == -1 ? z : z2;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z3) {
                        z = z2;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z, z2));
                    boolean z4 = zIsRtlCharAt == z3;
                    int i4 = I;
                    int iCeil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, z4, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (dropSpaces && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i2 = lineForOffset;
                        if (layout.getLineEnd(i2) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i2 = lineForOffset;
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(i2), iMax, layout.getLineBottom(i2)));
                    num = num2;
                    I = i4;
                    z = true;
                    z2 = false;
                }
                return arrayList;
            }
        }
        return EmptyList.INSTANCE;
    }

    private final List<Integer> breakWithBreakIterator(CharSequence text, BreakIterator breaker) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(text, 0, text.length());
        ArrayList arrayListX = f.X(0);
        breaker.setText(charSequenceCharacterIterator);
        while (breaker.next() != -1) {
            arrayListX.add(Integer.valueOf(breaker.current()));
        }
        return arrayListX;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<Integer> breakOffsets(LayoutHelper layoutHelper, SegmentType segmentType) throws NoWhenBranchMatchedException {
        m.h(layoutHelper, "layoutHelper");
        m.h(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            return f.V(0, Integer.valueOf(text.length()));
        }
        if (i2 == 2) {
            ArrayList arrayListX = f.X(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i3 < paragraphCount) {
                arrayListX.add(Integer.valueOf(layoutHelper.getParagraphEnd(i3)));
                i3++;
            }
            return arrayListX;
        }
        if (i2 == 3) {
            ArrayList arrayListX2 = f.X(0);
            int lineCount = layout.getLineCount();
            while (i3 < lineCount) {
                arrayListX2.add(Integer.valueOf(layout.getLineEnd(i3)));
                i3++;
            }
            return arrayListX2;
        }
        if (i2 == 4) {
            return breakInWords(layoutHelper);
        }
        if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        m.g(text, "text");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        m.g(characterInstance, "getCharacterInstance(Locale.getDefault())");
        return breakWithBreakIterator(text, characterInstance);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<Segment> breakSegments(LayoutHelper layoutHelper, SegmentType segmentType, boolean dropSpaces) throws NoWhenBranchMatchedException {
        m.h(layoutHelper, "layoutHelper");
        m.h(segmentType, "segmentType");
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i2 == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i2 == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i2 == 3) {
            return breakSegmentWithLine(layoutHelper, dropSpaces);
        }
        if (i2 == 4) {
            return breakSegmentWithWord(layoutHelper, dropSpaces);
        }
        if (i2 == 5) {
            return breakSegmentWithChar(layoutHelper, dropSpaces);
        }
        throw new NoWhenBranchMatchedException();
    }
}
