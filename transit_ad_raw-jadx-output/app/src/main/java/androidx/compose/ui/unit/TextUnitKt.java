package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a#\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0006\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0011\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0013\u001a\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a-\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\"\"\u00103\u001a\u00020/*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b2\u0010\u001c\u001a\u0004\b0\u00101\"!\u00106\u001a\u00020/*\u00020\u00048FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b5\u0010\u001c\u001a\u0004\b4\u00101\"!\u0010;\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"!\u0010>\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108\"!\u0010;\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b9\u0010@\u001a\u0004\b7\u0010?\"!\u0010>\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b=\u0010@\u001a\u0004\b<\u0010?\"!\u0010;\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b9\u0010B\u001a\u0004\b7\u0010A\"!\u0010>\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b=\u0010B\u001a\u0004\b<\u0010A\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLkj/a;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", "v", "pack", "(JF)J", "a", "Lkotlin/j;", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "UNIT_MASK", "J", "UNIT_TYPE_UNSPECIFIED", "UNIT_TYPE_SP", "UNIT_TYPE_EM", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m5460TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m5461checkArithmeticR2X_6o(long j) {
        if (!(!m5466isUnspecifiedR2X_6o(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m5462checkArithmeticNB67dxo(long j, long j2) {
        if (!((m5466isUnspecifiedR2X_6o(j) || m5466isUnspecifiedR2X_6o(j2)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(j), TextUnit.m5447getTypeUIouoOA(j2))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m5478toStringimpl(TextUnit.m5447getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m5478toStringimpl(TextUnit.m5447getTypeUIouoOA(j2)))).toString());
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m5463checkArithmeticvU0ePk(long j, long j2, long j3) {
        if (!((m5466isUnspecifiedR2X_6o(j) || m5466isUnspecifiedR2X_6o(j2) || m5466isUnspecifiedR2X_6o(j3)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(j), TextUnit.m5447getTypeUIouoOA(j2)) && TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(j2), TextUnit.m5447getTypeUIouoOA(j3))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m5478toStringimpl(TextUnit.m5447getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m5478toStringimpl(TextUnit.m5447getTypeUIouoOA(j2)))).toString());
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m5464isSpecifiedR2X_6o(long j) {
        return !m5466isUnspecifiedR2X_6o(j);
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m5466isUnspecifiedR2X_6o(long j) {
        return TextUnit.m5446getRawTypeimpl(j) == 0;
    }

    @Stable
    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m5468lerpC3pnCVY(long j, long j2, float f) {
        m5462checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m5446getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m5448getValueimpl(j), TextUnit.m5448getValueimpl(j2), f));
    }

    public static final long pack(long j, float f) {
        return TextUnit.m5440constructorimpl(j | (((long) Float.floatToIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m5469takeOrElseeAf_CNQ(long j, kj.a<TextUnit> aVar) {
        m.h(aVar, "block");
        return m5466isUnspecifiedR2X_6o(j) ^ true ? j : ((TextUnit) aVar.invoke()).getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5471timesmpE4wyQ(float f, long j) {
        m5461checkArithmeticR2X_6o(j);
        return pack(TextUnit.m5446getRawTypeimpl(j), TextUnit.m5448getValueimpl(j) * f);
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static final long getEm(int i2) {
        return pack(UNIT_TYPE_EM, i2);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i2) {
    }

    public static final long getSp(int i2) {
        return pack(UNIT_TYPE_SP, i2);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i2) {
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5470timesmpE4wyQ(double d, long j) {
        m5461checkArithmeticR2X_6o(j);
        return pack(TextUnit.m5446getRawTypeimpl(j), TextUnit.m5448getValueimpl(j) * ((float) d));
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5472timesmpE4wyQ(int i2, long j) {
        m5461checkArithmeticR2X_6o(j);
        return pack(TextUnit.m5446getRawTypeimpl(j), TextUnit.m5448getValueimpl(j) * i2);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m5465isSpecifiedR2X_6o$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m5467isUnspecifiedR2X_6o$annotations(long j) {
    }
}
