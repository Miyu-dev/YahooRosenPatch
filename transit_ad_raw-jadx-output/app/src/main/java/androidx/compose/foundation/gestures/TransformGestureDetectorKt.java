package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kj.p;
import kj.r;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aJ\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\n\u001a\u0019\u0010\u000e\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\n\u001a\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0005*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a\u001e\u0010\u0014\u001a\u00020\u0004*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/j;", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkj/r;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "angle-k-4lQ0M", "(J)F", "angle", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TransformGestureDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal, R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ r<Offset, Offset, Float, Float, j> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, r<? super Offset, ? super Offset, ? super Float, ? super Float, j> rVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$panZoomLock = z;
            this.$onGesture = rVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00be A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009d -> B:18:0x00a0). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m376anglek4lQ0M(long j) {
        if (Offset.m2585getXimpl(j) == 0.0f) {
            if (Offset.m2586getYimpl(j) == 0.0f) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        m.h(pointerEvent, "<this>");
        long jM2601getZeroF1C5BW0 = Offset.INSTANCE.m2601getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM2601getZeroF1C5BW0 = Offset.m2590plusMKHz9U(jM2601getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i2++;
            }
        }
        return i2 == 0 ? Offset.INSTANCE.m2600getUnspecifiedF1C5BW0() : Offset.m2580divtuRUvjQ(jM2601getZeroF1C5BW0, i2);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        m.h(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, z);
        float fM2583getDistanceimpl = 0.0f;
        if (Offset.m2582equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m2600getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                i2++;
                fM2583getDistanceimpl = Offset.m2583getDistanceimpl(Offset.m2589minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid)) + fM2583getDistanceimpl;
            }
        }
        return fM2583getDistanceimpl / i2;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        m.h(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m2582equalsimpl0(jCalculateCentroid, companion.m2600getUnspecifiedF1C5BW0()) ? companion.m2601getZeroF1C5BW0() : Offset.m2589minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        m.h(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i2);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        float f = 0.0f;
        if (i3 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i5 = 0;
        while (i5 < size2) {
            PointerInputChange pointerInputChange2 = changes2.get(i5);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM2589minusMKHz9U = Offset.m2589minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM2589minusMKHz9U2 = Offset.m2589minusMKHz9U(position, jCalculateCentroid);
                float fM376anglek4lQ0M = m376anglek4lQ0M(jM2589minusMKHz9U2) - m376anglek4lQ0M(jM2589minusMKHz9U);
                float fM2583getDistanceimpl = Offset.m2583getDistanceimpl(Offset.m2590plusMKHz9U(jM2589minusMKHz9U2, jM2589minusMKHz9U)) / 2.0f;
                if (fM376anglek4lQ0M > 180.0f) {
                    fM376anglek4lQ0M -= 360.0f;
                } else if (fM376anglek4lQ0M < -180.0f) {
                    fM376anglek4lQ0M += 360.0f;
                }
                f3 += fM376anglek4lQ0M * fM2583getDistanceimpl;
                f2 += fM2583getDistanceimpl;
            }
            i5++;
            f = 0.0f;
        }
        return (f2 > f ? 1 : (f2 == f ? 0 : -1)) == 0 ? f : f3 / f2;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        m.h(pointerEvent, "<this>");
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f) {
            return 1.0f;
        }
        if (fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z, r<? super Offset, ? super Offset, ? super Float, ? super Float, j> rVar, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(z, rVar, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, r rVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, rVar, cVar);
    }
}
