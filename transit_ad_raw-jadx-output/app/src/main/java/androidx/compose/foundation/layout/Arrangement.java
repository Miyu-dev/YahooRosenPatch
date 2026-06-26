package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Immutable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005KLMNOB\t\b\u0002¢\u0006\u0004\bJ\u00100J/\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\bJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0007J/\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010\u001eJ/\u0010&\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010\u001eJ/\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b'\u0010\u001eJ/\u0010*\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010\u001eR \u0010+\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u00101\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010.R \u00104\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R \u00109\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00105\u0012\u0004\b;\u00100\u001a\u0004\b:\u00107R \u0010<\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R \u0010A\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010=\u0012\u0004\bC\u00100\u001a\u0004\bB\u0010?R \u0010D\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010=\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010?R \u0010G\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010=\u0012\u0004\bI\u00100\u001a\u0004\bH\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006P"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "", "", "reversed", "Lkotlin/Function2;", "", "Lkotlin/j;", "action", "forEachIndexed", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "totalSize", "size", "outPosition", "reverseInput", "placeRightOrBottom$foundation_layout_release", "(I[I[IZ)V", "placeRightOrBottom", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeLeftOrTop", "placeCenter$foundation_layout_release", "placeCenter", "placeSpaceEvenly$foundation_layout_release", "placeSpaceEvenly", "placeSpaceBetween$foundation_layout_release", "placeSpaceBetween", "placeSpaceAround$foundation_layout_release", "placeSpaceAround", "Start", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "()V", "End", "getEnd", "getEnd$annotations", "Top", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Bottom", "getBottom", "getBottom$annotations", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "SpaceEvenly", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceBetween", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceAround", "getSpaceAround", "getSpaceAround$annotations", "<init>", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class Arrangement {
    public static final int $stable = 0;
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return a.a(this);
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return a.a(this);
        }

        public String toString() {
            return "Arrangement#End";
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return c.a(this);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return c.a(this);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m5267constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m5267constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m5267constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m5267constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, false);
        }
    };

    /* JADX INFO: compiled from: Arrangement.kt */
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001d\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J%\u0010\u001a\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010$R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "()V", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Left", "getLeft$annotations", "getLeft", "Right", "getRight$annotations", "getRight", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "spacedBy", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Absolute {
        public static final int $stable = 0;
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                kotlin.jvm.internal.m.h(density, "<this>");
                kotlin.jvm.internal.m.h(iArr, "sizes");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(iArr2, "outPositions");
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                kotlin.jvm.internal.m.h(density, "<this>");
                kotlin.jvm.internal.m.h(iArr, "sizes");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(iArr2, "outPositions");
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public final /* synthetic */ float getSpacing() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                kotlin.jvm.internal.m.h(density, "<this>");
                kotlin.jvm.internal.m.h(iArr, "sizes");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(iArr2, "outPositions");
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                kotlin.jvm.internal.m.h(density, "<this>");
                kotlin.jvm.internal.m.h(iArr, "sizes");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(iArr2, "outPositions");
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                kotlin.jvm.internal.m.h(density, "<this>");
                kotlin.jvm.internal.m.h(iArr, "sizes");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(iArr2, "outPositions");
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                kotlin.jvm.internal.m.h(density, "<this>");
                kotlin.jvm.internal.m.h(iArr, "sizes");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(iArr2, "outPositions");
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return a.a(this);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        @Stable
        public final Horizontal aligned(final Alignment.Horizontal alignment) {
            kotlin.jvm.internal.m.h(alignment, "alignment");
            return new SpacedAligned(Dp.m5267constructorimpl(0), false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
                }

                public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                    kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                    return Integer.valueOf(alignment.align(0, i2, layoutDirection));
                }
            }, null);
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        @Stable
        /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m411spacedBy0680j_4(float space) {
            p pVar = null;
            return new SpacedAligned(space, false, pVar, pVar);
        }

        @Stable
        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m412spacedByD5KLDUw(float space, final Alignment.Horizontal alignment) {
            kotlin.jvm.internal.m.h(alignment, "alignment");
            return new SpacedAligned(space, false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
                }

                public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                    kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                    return Integer.valueOf(alignment.align(0, i2, layoutDirection));
                }
            }, null);
        }

        @Stable
        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m413spacedByD5KLDUw(float space, final Alignment.Vertical alignment) {
            kotlin.jvm.internal.m.h(alignment, "alignment");
            return new SpacedAligned(space, false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                    kotlin.jvm.internal.m.h(layoutDirection, "<anonymous parameter 1>");
                    return Integer.valueOf(alignment.align(0, i2));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
                }
            }, null);
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&R\u001d\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/j;", "arrange", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Stable
    public interface Horizontal {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m415getSpacingD9Ej5fM(Horizontal horizontal) {
                return a.a(horizontal);
            }
        }

        void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        float getSpacing();
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001d\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @Stable
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m416getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return b.a(horizontalOrVertical);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        float getSpacing();
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Immutable
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014ø\u0001\u0002¢\u0006\u0004\b*\u0010+J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0019\u0010\u0011\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R \u0010\u0016\u001a\u00020\u000e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R+\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R#\u0010(\u001a\u00020\u000e8\u0016X\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/j;", "arrange", "", "toString", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "", "component2", "Lkotlin/Function2;", "component3", "space", "rtlMirror", "alignment", "copy-8Feqmps", "(FZLkj/p;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", "hashCode", "", "other", "equals", "F", "getSpace-D9Ej5fM", "Z", "getRtlMirror", "()Z", "Lkj/p;", "getAlignment", "()Lkj/p;", "spacing", "getSpacing-D9Ej5fM", "<init>", "(FZLkj/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {
        private final p<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f, boolean z, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m417copy8Feqmps$default(SpacedAligned spacedAligned, float f, boolean z, p pVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = spacedAligned.space;
            }
            if ((i2 & 2) != 0) {
                z = spacedAligned.rtlMirror;
            }
            if ((i2 & 4) != 0) {
                pVar = spacedAligned.alignment;
            }
            return spacedAligned.m419copy8Feqmps(f, z, pVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i3;
            int iMin;
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            if (iArr.length == 0) {
                return;
            }
            int iMo342roundToPx0680j_4 = density.mo342roundToPx0680j_4(this.space);
            boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (z) {
                i3 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i4 = iArr[length];
                    int iMin2 = Math.min(i3, i2 - i4);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iMo342roundToPx0680j_4, (i2 - iMin2) - i4);
                    i3 = iArr2[length] + i4 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i5 = 0;
                i3 = 0;
                iMin = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr[i5];
                    int iMin3 = Math.min(i3, i2 - i7);
                    iArr2[i6] = iMin3;
                    int iMin4 = Math.min(iMo342roundToPx0680j_4, (i2 - iMin3) - i7);
                    int i8 = iArr2[i6] + i7 + iMin4;
                    i5++;
                    i6++;
                    iMin = iMin4;
                    i3 = i8;
                }
            }
            int i9 = i3 - iMin;
            p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            if (pVar == null || i9 >= i2) {
                return;
            }
            int iIntValue = ((Number) pVar.invoke(Integer.valueOf(i2 - i9), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i10 = 0; i10 < length3; i10++) {
                iArr2[i10] = iArr2[i10] + iIntValue;
            }
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpace() {
            return this.space;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public final p<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m419copy8Feqmps(float space, boolean rtlMirror, p<? super Integer, ? super LayoutDirection, Integer> alignment) {
            return new SpacedAligned(space, rtlMirror, alignment, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) other;
            return Dp.m5272equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && kotlin.jvm.internal.m.c(this.alignment, spacedAligned.alignment);
        }

        public final p<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* JADX INFO: renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m420getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iM5273hashCodeimpl = Dp.m5273hashCodeimpl(this.space) * 31;
            boolean z = this.rtlMirror;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i2 = (iM5273hashCodeimpl + r1) * 31;
            p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            return i2 + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.m5278toStringimpl(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f, boolean z, p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.space = f;
            this.rtlMirror = z;
            this.alignment = pVar;
            this.spacing = f;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            kotlin.jvm.internal.m.h(density, "<this>");
            kotlin.jvm.internal.m.h(iArr, "sizes");
            kotlin.jvm.internal.m.h(iArr2, "outPositions");
            arrange(density, i2, iArr, LayoutDirection.Ltr, iArr2);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001d\u0010\r\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "outPositions", "Lkotlin/j;", "arrange", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Stable
    public interface Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m421getSpacingD9Ej5fM(Vertical vertical) {
                return c.a(vertical);
            }
        }

        void arrange(Density density, int i2, int[] iArr, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        float getSpacing();
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z, p<? super Integer, ? super Integer, kotlin.j> pVar) {
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                pVar.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @Stable
    public final Horizontal aligned(final Alignment.Horizontal alignment) {
        kotlin.jvm.internal.m.h(alignment, "alignment");
        return new SpacedAligned(Dp.m5267constructorimpl(0), true, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.1
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                return Integer.valueOf(alignment.align(0, i2, layoutDirection));
            }
        }, null);
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.m.h(size, "size");
        kotlin.jvm.internal.m.h(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f = (totalSize - i3) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                outPosition[i5] = a.f.f0(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = size[length2];
            outPosition[length2] = a.f.f0(f);
            f += i7;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] size, int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.m.h(size, "size");
        kotlin.jvm.internal.m.h(outPosition, "outPosition");
        int i2 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = size[i2];
                outPosition[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = size[length2];
            outPosition[length2] = i2;
            i2 += i6;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.m.h(size, "size");
        kotlin.jvm.internal.m.h(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int i5 = totalSize - i3;
        if (!reverseInput) {
            int length = size.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                outPosition[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = size[length2];
            outPosition[length2] = i5;
            i5 += i8;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.m.h(size, "size");
        kotlin.jvm.internal.m.h(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (size.length == 0) ^ true ? (totalSize - i3) / size.length : 0.0f;
        float f = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = a.f.f0(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = a.f.f0(f);
            f += i7 + length;
            i2++;
            i6++;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.m.h(size, "size");
        kotlin.jvm.internal.m.h(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f = 0.0f;
        float length = size.length > 1 ? (totalSize - i3) / (size.length - 1) : 0.0f;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = a.f.f0(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = a.f.f0(f);
            f += i7 + length;
            i2++;
            i6++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.m.h(size, "size");
        kotlin.jvm.internal.m.h(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (totalSize - i3) / (size.length + 1);
        if (reverseInput) {
            float f = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = a.f.f0(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = a.f.f0(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    @Stable
    /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m408spacedBy0680j_4(float space) {
        return new SpacedAligned(space, true, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                return Integer.valueOf(Alignment.INSTANCE.getStart().align(0, i2, layoutDirection));
            }
        }, null);
    }

    @Stable
    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m409spacedByD5KLDUw(float space, final Alignment.Horizontal alignment) {
        kotlin.jvm.internal.m.h(alignment, "alignment");
        return new SpacedAligned(space, true, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                return Integer.valueOf(alignment.align(0, i2, layoutDirection));
            }
        }, null);
    }

    @Stable
    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m410spacedByD5KLDUw(float space, final Alignment.Vertical alignment) {
        kotlin.jvm.internal.m.h(alignment, "alignment");
        return new SpacedAligned(space, false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(alignment.align(0, i2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }

    @Stable
    public final Vertical aligned(final Alignment.Vertical alignment) {
        kotlin.jvm.internal.m.h(alignment, "alignment");
        return new SpacedAligned(Dp.m5267constructorimpl(0), false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.2
            {
                super(2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(alignment.align(0, i2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }
}
