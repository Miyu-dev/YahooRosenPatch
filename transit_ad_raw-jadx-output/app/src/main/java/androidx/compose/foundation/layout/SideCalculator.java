package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(30)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\bc\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0003H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "adjustInsets", "Landroid/graphics/Insets;", "oldInsets", "newValue", "", "consumedOffsets", "Landroidx/compose/ui/geometry/Offset;", "available", "consumedOffsets-MK-Hz9U", "(J)J", "consumedVelocity", "Landroidx/compose/ui/unit/Velocity;", "remaining", "", "consumedVelocity-QWom1Mo", "(JF)J", "hideMotion", "x", "y", "motionOf", "showMotion", "valueOf", "insets", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
interface SideCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0004\u0004\u0007\n\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "()V", "BottomSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "LeftSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "RightSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "TopSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "chooseCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "side", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int newValue) {
                kotlin.jvm.internal.m.h(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(newValue, oldInsets.top, oldInsets.right, oldInsets.bottom);
                kotlin.jvm.internal.m.g(insetsOf, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo485consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m2585getXimpl(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo486consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(Velocity.m5492getXimpl(available) - remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float hideMotion(float f, float f2) {
                return f.a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float showMotion(float f, float f2) {
                return f.b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                kotlin.jvm.internal.m.h(insets, "insets");
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return x;
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int newValue) {
                kotlin.jvm.internal.m.h(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, newValue, oldInsets.right, oldInsets.bottom);
                kotlin.jvm.internal.m.g(insetsOf, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo485consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m2586getYimpl(available));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo486consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(0.0f, Velocity.m5493getYimpl(available) - remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float hideMotion(float f, float f2) {
                return f.a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float showMotion(float f, float f2) {
                return f.b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                kotlin.jvm.internal.m.h(insets, "insets");
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return y;
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int newValue) {
                kotlin.jvm.internal.m.h(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, oldInsets.top, newValue, oldInsets.bottom);
                kotlin.jvm.internal.m.g(insetsOf, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo485consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m2585getXimpl(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo486consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(Velocity.m5492getXimpl(available) + remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float hideMotion(float f, float f2) {
                return f.a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return -x;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float showMotion(float f, float f2) {
                return f.b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                kotlin.jvm.internal.m.h(insets, "insets");
                return insets.right;
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int newValue) {
                kotlin.jvm.internal.m.h(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, oldInsets.top, oldInsets.right, newValue);
                kotlin.jvm.internal.m.g(insetsOf, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo485consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m2586getYimpl(available));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo486consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(0.0f, Velocity.m5493getYimpl(available) + remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float hideMotion(float f, float f2) {
                return f.a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return -y;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final /* synthetic */ float showMotion(float f, float f2) {
                return f.b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                kotlin.jvm.internal.m.h(insets, "insets");
                return insets.bottom;
            }
        };

        private Companion() {
        }

        /* JADX INFO: renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m487chooseCalculatorni1skBw(int side, LayoutDirection layoutDirection) {
            kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
            WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
            if (WindowInsetsSides.m529equalsimpl0(side, companion.m543getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m529equalsimpl0(side, companion.m546getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m529equalsimpl0(side, companion.m544getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m529equalsimpl0(side, companion.m540getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m529equalsimpl0(side, companion.m545getStartJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.m529equalsimpl0(side, companion.m541getEndJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
        }
    }

    Insets adjustInsets(Insets oldInsets, int newValue);

    /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo485consumedOffsetsMKHz9U(long available);

    /* JADX INFO: renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo486consumedVelocityQWom1Mo(long available, float remaining);

    float hideMotion(float x, float y);

    float motionOf(float x, float y);

    float showMotion(float x, float y);

    int valueOf(Insets insets);
}
