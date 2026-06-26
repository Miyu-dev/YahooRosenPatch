package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\"#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\"#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f\"#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\"#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u000f\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000f\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0006*\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u0006*\u00020&8F¢\u0006\u0006\u001a\u0004\b#\u0010'\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u0006*\u00020(8F¢\u0006\u0006\u001a\u0004\b#\u0010)\"$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0006*\u00020*8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010+\"$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0006*\u00020,8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010-\"$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0006*\u00020.8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010/\"$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0006*\u0002008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u00101\"$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u0006*\u0002028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u00103\"$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u0006*\u0002048Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "", "start", "stop", "fraction", "lerp", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "", "IntToVector", "Landroidx/compose/ui/unit/Dp;", "DpToVector", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpOffsetToVector", "Landroidx/compose/ui/geometry/Size;", "SizeToVector", "Landroidx/compose/ui/geometry/Offset;", "OffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntSize;", "IntSizeToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "RectToVector", "Lkotlin/Float$Companion;", "getVectorConverter", "(Lkotlin/jvm/internal/i;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/l;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new l<Float, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f) {
            return new AnimationVector1D(f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }, new l<AnimationVector1D, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        public final Float invoke(AnimationVector1D animationVector1D) {
            m.h(animationVector1D, "it");
            return Float.valueOf(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new l<Integer, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i2) {
            return new AnimationVector1D(i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }, new l<AnimationVector1D, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        public final Integer invoke(AnimationVector1D animationVector1D) {
            m.h(animationVector1D, "it");
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new l<Dp, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m161invoke0680j_4(((Dp) obj).m5281unboximpl());
        }

        /* JADX INFO: renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m161invoke0680j_4(float f) {
            return new AnimationVector1D(f);
        }
    }, new l<AnimationVector1D, Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Dp.m5265boximpl(m162invokeu2uoSUM((AnimationVector1D) obj));
        }

        /* JADX INFO: renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m162invokeu2uoSUM(AnimationVector1D animationVector1D) {
            m.h(animationVector1D, "it");
            return Dp.m5267constructorimpl(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new l<DpOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m159invokejoFl9I(((DpOffset) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m159invokejoFl9I(long j) {
            return new AnimationVector2D(DpOffset.m5328getXD9Ej5fM(j), DpOffset.m5330getYD9Ej5fM(j));
        }
    }, new l<AnimationVector2D, DpOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return DpOffset.m5322boximpl(m160invokegVRvYmI((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m160invokegVRvYmI(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return DpKt.m5288DpOffsetYgX7TsA(Dp.m5267constructorimpl(animationVector2D.getV1()), Dp.m5267constructorimpl(animationVector2D.getV2()));
        }
    });
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new l<Size, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m169invokeuvyYCjk(((Size) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m169invokeuvyYCjk(long j) {
            return new AnimationVector2D(Size.m2654getWidthimpl(j), Size.m2651getHeightimpl(j));
        }
    }, new l<AnimationVector2D, Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Size.m2642boximpl(m170invoke7Ah8Wj8((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m170invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return SizeKt.Size(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new l<Offset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m167invokek4lQ0M(((Offset) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m167invokek4lQ0M(long j) {
            return new AnimationVector2D(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j));
        }
    }, new l<AnimationVector2D, Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m2574boximpl(m168invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m168invoketuRUvjQ(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new l<IntOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m163invokegyyYBs(((IntOffset) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m163invokegyyYBs(long j) {
            return new AnimationVector2D(IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(j));
        }
    }, new l<AnimationVector2D, IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntOffset.m5376boximpl(m164invokeBjo55l4((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m164invokeBjo55l4(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return IntOffsetKt.IntOffset(a.f.f0(animationVector2D.getV1()), a.f.f0(animationVector2D.getV2()));
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new l<IntSize, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m165invokeozmzZPI(((IntSize) obj).getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m165invokeozmzZPI(long j) {
            return new AnimationVector2D(IntSize.m5427getWidthimpl(j), IntSize.m5426getHeightimpl(j));
        }
    }, new l<AnimationVector2D, IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m5419boximpl(m166invokeYEO4UFw((AnimationVector2D) obj));
        }

        /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m166invokeYEO4UFw(AnimationVector2D animationVector2D) {
            m.h(animationVector2D, "it");
            return IntSizeKt.IntSize(a.f.f0(animationVector2D.getV1()), a.f.f0(animationVector2D.getV2()));
        }
    });
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new l<Rect, AnimationVector4D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        public final AnimationVector4D invoke(Rect rect) {
            m.h(rect, "it");
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new l<AnimationVector4D, Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        public final Rect invoke(AnimationVector4D animationVector4D) {
            m.h(animationVector4D, "it");
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(l<? super T, ? extends V> lVar, l<? super V, ? extends T> lVar2) {
        m.h(lVar, "convertToVector");
        m.h(lVar2, "convertFromVector");
        return new TwoWayConverterImpl(lVar, lVar2);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(i iVar) {
        m.h(iVar, "<this>");
        return FloatToVector;
    }

    public static final float lerp(float f, float f2, float f3) {
        return (f2 * f3) + ((1 - f3) * f);
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(kotlin.jvm.internal.l lVar) {
        m.h(lVar, "<this>");
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        m.h(companion, "<this>");
        return RectToVector;
    }

    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(Dp.Companion companion) {
        m.h(companion, "<this>");
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        m.h(companion, "<this>");
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        m.h(companion, "<this>");
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        m.h(companion, "<this>");
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        m.h(companion, "<this>");
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        m.h(companion, "<this>");
        return IntSizeToVector;
    }
}
