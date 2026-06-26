package androidx.compose.ui.unit;

import a.l;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\f\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a&\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\t\u001a&\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\t\u001a*\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\t\u001a\"\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\t\u001a-\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u0018\u001a%\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001a+\u0010\u0005\u001a\u00020%*\u00020%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010*\u001a-\u0010\"\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b+\u0010,\u001a%\u00101\u001a\u00020/2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u0010'\u001a+\u0010\u0005\u001a\u00020/*\u00020/2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020/0\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u0010*\u001a\"\u0010\n\u001a\u00020/*\u00020\r2\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105\u001a\"\u0010\n\u001a\u00020/*\u00020\u00062\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00106\u001a-\u0010\"\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b7\u0010,\"\"\u0010=\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:\"\"\u0010@\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010:\"\"\u0010E\u001a\u00020\u0000*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010B\"\"\u0010E\u001a\u00020\u0000*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bC\u0010G\u001a\u0004\bA\u0010F\"\"\u0010E\u001a\u00020\u0000*\u00020\u00068Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bC\u0010<\u001a\u0004\bA\u0010H\"\"\u0010K\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010:\"\"\u0010=\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M\"\"\u0010@\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bQ\u0010O\u001a\u0004\bP\u0010M\"\"\u0010=\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bS\u0010O\u001a\u0004\bR\u0010M\"\"\u0010@\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010M\"!\u0010Y\u001a\u00020%*\u00020/8FX\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bX\u0010O\u001a\u0004\bV\u0010W\"\"\u0010-\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010\\\"\"\u0010.\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b`\u0010^\u001a\u0004\b_\u0010\\\"\"\u00103\u001a\u00020/*\u00020Z8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bc\u0010^\u001a\u0004\ba\u0010b\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006d"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", "block", "takeOrElse-D5KLDUw", "(FLkj/a;)F", "takeOrElse", "", "other", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", "a", "b", "min-YgX7TsA", "min", "max-YgX7TsA", "max", "minimumValue", "maximumValue", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", "start", "stop", "fraction", "lerp-Md-fbLM", "lerp", "x", "y", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "takeOrElse-gVKV90s", "(JLkj/a;)J", "lerp-xhh869w", "(JJF)J", "width", "height", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "takeOrElse-itqla9I", "size", "times-6HolHcs", "(IJ)J", "(FJ)J", "lerp-IDex15A", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", "dp", "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "isUnspecified-jo-Fl9I", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc", "isSpecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "isUnspecified-EaSLcWc$annotations", "getCenter-EaSLcWc", "(J)J", "getCenter-EaSLcWc$annotations", "center", "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "getHeight$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "getSize$annotations", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
public final class DpKt {
    @Stable
    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m5288DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m5323constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m5289DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m5356constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m5290coerceAtLeastYgX7TsA(float f, float f2) {
        if (f < f2) {
            f = f2;
        }
        return Dp.m5267constructorimpl(f);
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m5291coerceAtMostYgX7TsA(float f, float f2) {
        if (f > f2) {
            f = f2;
        }
        return Dp.m5267constructorimpl(f);
    }

    @Stable
    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m5292coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m5267constructorimpl(l.h(f, f2, f3));
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m5293getCenterEaSLcWc(long j) {
        return m5288DpOffsetYgX7TsA(Dp.m5267constructorimpl(DpSize.m5365getWidthD9Ej5fM(j) / 2.0f), Dp.m5267constructorimpl(DpSize.m5363getHeightD9Ej5fM(j) / 2.0f));
    }

    public static final float getDp(int i2) {
        return Dp.m5267constructorimpl(i2);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static final float getHeight(DpRect dpRect) {
        m.h(dpRect, "<this>");
        return Dp.m5267constructorimpl(dpRect.m5349getBottomD9Ej5fM() - dpRect.m5352getTopD9Ej5fM());
    }

    public static final long getSize(DpRect dpRect) {
        m.h(dpRect, "<this>");
        return m5289DpSizeYgX7TsA(Dp.m5267constructorimpl(dpRect.m5351getRightD9Ej5fM() - dpRect.m5350getLeftD9Ej5fM()), Dp.m5267constructorimpl(dpRect.m5349getBottomD9Ej5fM() - dpRect.m5352getTopD9Ej5fM()));
    }

    public static final float getWidth(DpRect dpRect) {
        m.h(dpRect, "<this>");
        return Dp.m5267constructorimpl(dpRect.m5351getRightD9Ej5fM() - dpRect.m5350getLeftD9Ej5fM());
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m5295isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m5297isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5299isSpecifiedEaSLcWc(long j) {
        return j != DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ();
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5301isSpecifiedjoFl9I(long j) {
        return j != DpOffset.INSTANCE.m5337getUnspecifiedRKDOV3M();
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m5303isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5305isUnspecifiedEaSLcWc(long j) {
        return j == DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ();
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5307isUnspecifiedjoFl9I(long j) {
        return j == DpOffset.INSTANCE.m5337getUnspecifiedRKDOV3M();
    }

    @Stable
    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m5309lerpIDex15A(long j, long j2, float f) {
        return m5289DpSizeYgX7TsA(m5310lerpMdfbLM(DpSize.m5365getWidthD9Ej5fM(j), DpSize.m5365getWidthD9Ej5fM(j2), f), m5310lerpMdfbLM(DpSize.m5363getHeightD9Ej5fM(j), DpSize.m5363getHeightD9Ej5fM(j2), f));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m5310lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m5267constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m5311lerpxhh869w(long j, long j2, float f) {
        return m5288DpOffsetYgX7TsA(m5310lerpMdfbLM(DpOffset.m5328getXD9Ej5fM(j), DpOffset.m5328getXD9Ej5fM(j2), f), m5310lerpMdfbLM(DpOffset.m5330getYD9Ej5fM(j), DpOffset.m5330getYD9Ej5fM(j2), f));
    }

    @Stable
    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m5312maxYgX7TsA(float f, float f2) {
        return Dp.m5267constructorimpl(Math.max(f, f2));
    }

    @Stable
    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m5313minYgX7TsA(float f, float f2) {
        return Dp.m5267constructorimpl(Math.min(f, f2));
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m5314takeOrElseD5KLDUw(float f, kj.a<Dp> aVar) {
        m.h(aVar, "block");
        return Float.isNaN(f) ^ true ? f : ((Dp) aVar.invoke()).m5281unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m5315takeOrElsegVKV90s(long j, kj.a<DpOffset> aVar) {
        m.h(aVar, "block");
        return (j > DpOffset.INSTANCE.m5337getUnspecifiedRKDOV3M() ? 1 : (j == DpOffset.INSTANCE.m5337getUnspecifiedRKDOV3M() ? 0 : -1)) != 0 ? j : ((DpOffset) aVar.invoke()).getPackedValue();
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m5316takeOrElseitqla9I(long j, kj.a<DpSize> aVar) {
        m.h(aVar, "block");
        return (j > DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ() ? 1 : (j == DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? j : ((DpSize) aVar.invoke()).getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5318times3ABfNKs(float f, float f2) {
        return Dp.m5267constructorimpl(f * f2);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5321times6HolHcs(int i2, long j) {
        return DpSize.m5371timesGh9hcWk(j, i2);
    }

    public static final float getDp(double d) {
        return Dp.m5267constructorimpl((float) d);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5317times3ABfNKs(double d, float f) {
        return Dp.m5267constructorimpl(((float) d) * f);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5320times6HolHcs(float f, long j) {
        return DpSize.m5370timesGh9hcWk(j, f);
    }

    public static final float getDp(float f) {
        return Dp.m5267constructorimpl(f);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i2) {
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5319times3ABfNKs(int i2, float f) {
        return Dp.m5267constructorimpl(i2 * f);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5294getCenterEaSLcWc$annotations(long j) {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5296isFinite0680j_4$annotations(float f) {
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5298isSpecified0680j_4$annotations(float f) {
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5300isSpecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5302isSpecifiedjoFl9I$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5304isUnspecified0680j_4$annotations(float f) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5306isUnspecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5308isUnspecifiedjoFl9I$annotations(long j) {
    }
}
