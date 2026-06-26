package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a+\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000f\u001a\"\u0010\u0014\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000f\u001a-\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\"\u0010 \u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\"\u0010#\u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "roundToTenths", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLkj/a;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m4285constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m4299divUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m2654getWidthimpl(j) / ScaleFactor.m4291getScaleXimpl(j2), Size.m2651getHeightimpl(j) / ScaleFactor.m4292getScaleYimpl(j2));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m4300isSpecifiedFK8aYYs(long j) {
        return j != ScaleFactor.Companion.m4298getUnspecified_hLwfpc();
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m4302isUnspecifiedFK8aYYs(long j) {
        return j == ScaleFactor.Companion.m4298getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m4304lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m4291getScaleXimpl(j), ScaleFactor.m4291getScaleXimpl(j2), f), MathHelpersKt.lerp(ScaleFactor.m4292getScaleYimpl(j), ScaleFactor.m4292getScaleYimpl(j2), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        return i2 / f2;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m4305takeOrElseoyDd2qo(long j, kj.a<ScaleFactor> aVar) {
        kotlin.jvm.internal.m.h(aVar, "block");
        return (j > ScaleFactor.Companion.m4298getUnspecified_hLwfpc() ? 1 : (j == ScaleFactor.Companion.m4298getUnspecified_hLwfpc() ? 0 : -1)) != 0 ? j : ((ScaleFactor) aVar.invoke()).m4296unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m4306timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(ScaleFactor.m4291getScaleXimpl(j2) * Size.m2654getWidthimpl(j), ScaleFactor.m4292getScaleYimpl(j2) * Size.m2651getHeightimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m4307timesmw2e94(long j, long j2) {
        return m4306timesUQTWf7w(j2, j);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m4301isSpecifiedFK8aYYs$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m4303isUnspecifiedFK8aYYs$annotations(long j) {
    }
}
