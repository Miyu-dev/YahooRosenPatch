package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u001aC\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u0015\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/j;", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "rememberSheetState", "(ZLkj/l;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "Landroidx/compose/ui/unit/Dp;", "DragHandleVerticalPadding", "F", "BottomSheetMaxWidth", "getBottomSheetMaxWidth", "()F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = Dp.m5267constructorimpl(22);
    private static final float BottomSheetMaxWidth = Dp.m5267constructorimpl(640);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final l<? super Float, j> lVar) {
        m.h(sheetState, "sheetState");
        m.h(orientation, "orientation");
        m.h(lVar, "onFling");
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            private final float offsetToFloat(long j) {
                return orientation == Orientation.Horizontal ? Offset.m2585getXimpl(j) : Offset.m2586getYimpl(j);
            }

            private final long toOffset(float f) {
                Orientation orientation2 = orientation;
                float f2 = orientation2 == Orientation.Horizontal ? f : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f = 0.0f;
                }
                return OffsetKt.Offset(f2, f);
            }

            private final float velocityToFloat(long j) {
                return orientation == Orientation.Horizontal ? Velocity.m5492getXimpl(j) : Velocity.m5493getYimpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
            public Object mo356onPostFlingRZ2iAVY(long j, long j2, dj.c<? super Velocity> cVar) {
                lVar.invoke(new Float(velocityToFloat(j2)));
                return Velocity.m5483boximpl(j2);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
            public long mo357onPostScrollDzOQY0M(long consumed, long available, int source) {
                return NestedScrollSource.m4036equalsimpl0(source, NestedScrollSource.INSTANCE.m4041getDragWNlRxjI()) ? toOffset(sheetState.getSwipeableState$material3_release().dispatchRawDelta(offsetToFloat(available))) : Offset.INSTANCE.m2601getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreFling-QWom1Mo */
            public Object mo358onPreFlingQWom1Mo(long j, dj.c<? super Velocity> cVar) {
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = sheetState.requireOffset();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= sheetState.getSwipeableState$material3_release().getMinOffset()) {
                    j = Velocity.INSTANCE.m5503getZero9UxMQ8M();
                } else {
                    lVar.invoke(new Float(fVelocityToFloat));
                }
                return Velocity.m5483boximpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
            public long mo359onPreScrollOzD1aCk(long available, int source) {
                float fOffsetToFloat = offsetToFloat(available);
                return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m4036equalsimpl0(source, NestedScrollSource.INSTANCE.m4041getDragWNlRxjI())) ? Offset.INSTANCE.m2601getZeroF1C5BW0() : toOffset(sheetState.getSwipeableState$material3_release().dispatchRawDelta(fOffsetToFloat));
            }
        };
    }

    public static final float getBottomSheetMaxWidth() {
        return BottomSheetMaxWidth;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberSheetState(boolean z, l<? super SheetValue, Boolean> lVar, SheetValue sheetValue, boolean z2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1032784200);
        final boolean z3 = (i3 & 1) != 0 ? false : z;
        final l<? super SheetValue, Boolean> lVar2 = (i3 & 2) != 0 ? new l<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetDefaultsKt.rememberSheetState.1
            public final Boolean invoke(SheetValue sheetValue2) {
                m.h(sheetValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar;
        final SheetValue sheetValue2 = (i3 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z4 = (i3 & 8) != 0 ? false : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i2, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:391)");
        }
        Object[] objArr = {Boolean.valueOf(z3), lVar2};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(z3, lVar2);
        Object[] objArr2 = {Boolean.valueOf(z3), sheetValue2, lVar2, Boolean.valueOf(z4)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i4 = 0; i4 < 4; i4++) {
            zChanged |= composer.changed(objArr2[i4]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new kj.a<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SheetState m1491invoke() {
                    return new SheetState(z3, sheetValue2, lVar2, z4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SheetState sheetState = (SheetState) RememberSaveableKt.m2460rememberSaveable(objArr, (Saver) Saver, (String) null, (kj.a) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetState;
    }
}
