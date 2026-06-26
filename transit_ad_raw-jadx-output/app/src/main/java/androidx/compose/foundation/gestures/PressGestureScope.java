package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/j;", "awaitRelease", "(Ldj/c;)Ljava/lang/Object;", "", "tryAwaitRelease", "foundation_release"}, k = 1, mv = {1, 8, 0})
public interface PressGestureScope extends Density {

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m329roundToPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.a.a(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m330roundToPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.a.b(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m331toDpGaN1DYA(PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.a.c(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m332toDpu2uoSUM(PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.a.d(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m334toDpSizekrfVVM(PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.a.f(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m335toPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.a.g(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m336toPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.a.h(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            m.h(dpRect, "$receiver");
            return androidx.compose.ui.unit.a.i(pressGestureScope, dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m337toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.a.j(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m338toSp0xMU5do(PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.a.k(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m339toSpkPz2Gy4(PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.a.l(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m333toDpu2uoSUM(PressGestureScope pressGestureScope, int i2) {
            return androidx.compose.ui.unit.a.e(pressGestureScope, i2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m340toSpkPz2Gy4(PressGestureScope pressGestureScope, int i2) {
            return androidx.compose.ui.unit.a.m(pressGestureScope, i2);
        }
    }

    Object awaitRelease(dj.c<? super j> cVar);

    Object tryAwaitRelease(dj.c<? super Boolean> cVar);
}
