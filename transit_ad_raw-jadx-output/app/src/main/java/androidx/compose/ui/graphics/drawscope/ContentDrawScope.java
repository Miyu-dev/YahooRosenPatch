package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ContentDrawScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/j;", "drawContent", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public interface ContentDrawScope extends DrawScope {

    /* JADX INFO: compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m3269drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
            m.h(imageBitmap, "image");
            m.h(drawStyle, "style");
            b.a(contentDrawScope, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i2, i3);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3270getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return b.b(contentDrawScope);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3271getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return b.c(contentDrawScope);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3272roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.a.a(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3273roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.a.b(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3274toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.a.c(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3275toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.a.d(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3277toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.a.f(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3278toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.a.g(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3279toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.a.h(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            m.h(dpRect, "$receiver");
            return androidx.compose.ui.unit.a.i(contentDrawScope, dpRect);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3280toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.a.j(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3281toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.a.k(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3282toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.a.l(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3276toDpu2uoSUM(ContentDrawScope contentDrawScope, int i2) {
            return androidx.compose.ui.unit.a.e(contentDrawScope, i2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3283toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i2) {
            return androidx.compose.ui.unit.a.m(contentDrawScope, i2);
        }
    }

    void drawContent();
}
