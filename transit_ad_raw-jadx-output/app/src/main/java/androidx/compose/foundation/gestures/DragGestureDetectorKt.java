package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aj\u0010\u0019\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aj\u0010\u001b\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001a\u001aA\u0010\u001e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\t\u001aI\u0010#\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a9\u0010%\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b$\u0010\u000f\u001a'\u0010'\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0012\u001aj\u0010)\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001a\u001aA\u0010+\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b*\u0010\t\u001aI\u0010.\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b-\u0010\"\u001a9\u00100\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b/\u0010\u000f\u001a'\u00102\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0012\u001aj\u00104\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b4\u0010\u001a\u001ac\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u000b2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000bH\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a;\u0010;\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000bH\u0082Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b:\u0010\u000f\u001a]\u0010A\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\r2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001a\f\u0010C\u001a\u00020<*\u00020BH\u0000\u001a'\u0010E\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\bD\u0010\u0012\u001a!\u0010I\u001a\u00020\r*\u00020F2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010H\u001a!\u0010M\u001a\u00020\u001c*\u00020J2\u0006\u0010 \u001a\u00020\u001fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010L\"\u001a\u0010N\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u001a\u0010R\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\bS\u0010Q\"\u0017\u0010U\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bU\u0010V\"\u0017\u0010W\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bW\u0010V\"\u0014\u0010X\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/j;", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkj/p;Ldj/c;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkj/l;Ldj/c;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLdj/c;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkj/l;Lkj/a;Lkj/a;Lkj/p;Ldj/c;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkj/p;Ldj/c;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "motionFromChange", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkj/l;Lkj/l;Lkj/l;Ldj/c;)Ljava/lang/Object;", "hasDragged", "awaitDragOrUp-jO51t88", "awaitDragOrUp", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "triggerOnMainAxisSlop", "awaitPointerSlopOrCancellation-wtdNQyU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;ZLkj/p;Ldj/c;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/foundation/gestures/Orientation;", "toPointerDirectionConfig", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "HorizontalPointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getHorizontalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "VerticalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class DragGestureDetectorKt {
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: crossAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo300crossAxisDeltak4lQ0M(long offset) {
            return Offset.m2586getYimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: mainAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo301mainAxisDeltak4lQ0M(long offset) {
            return Offset.m2585getXimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: offsetFromChanges-dBAh8RU, reason: not valid java name */
        public long mo302offsetFromChangesdBAh8RU(float mainChange, float crossChange) {
            return OffsetKt.Offset(mainChange, crossChange);
        }
    };
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: crossAxisDelta-k-4lQ0M */
        public float mo300crossAxisDeltak4lQ0M(long offset) {
            return Offset.m2585getXimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: mainAxisDelta-k-4lQ0M */
        public float mo301mainAxisDeltak4lQ0M(long offset) {
            return Offset.m2586getYimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: offsetFromChanges-dBAh8RU */
        public long mo302offsetFromChangesdBAh8RU(float mainChange, float crossChange) {
            return OffsetKt.Offset(crossChange, mainChange);
        }
    };
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5, reason: invalid class name */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {176, 890, 940, 193}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ p<PointerInputChange, Offset, j> $onDrag;
        final /* synthetic */ kj.a<j> $onDragCancel;
        final /* synthetic */ kj.a<j> $onDragEnd;
        final /* synthetic */ l<Offset, j> $onDragStart;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(l<? super Offset, j> lVar, p<? super PointerInputChange, ? super Offset, j> pVar, kj.a<j> aVar, kj.a<j> aVar2, dj.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
            this.$onDragStart = lVar;
            this.$onDrag = pVar;
            this.$onDragCancel = aVar;
            this.$onDragEnd = aVar2;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, cVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0148 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00da -> B:74:0x0242). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0154 -> B:65:0x0200). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01f1 -> B:62:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x023d -> B:74:0x0242). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 687
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {235, 236, 241}, m = "invokeSuspend")
    public static final class C01695 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ p<PointerInputChange, Offset, j> $onDrag;
        final /* synthetic */ kj.a<j> $onDragCancel;
        final /* synthetic */ kj.a<j> $onDragEnd;
        final /* synthetic */ l<Offset, j> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01695(l<? super Offset, j> lVar, kj.a<j> aVar, kj.a<j> aVar2, p<? super PointerInputChange, ? super Offset, j> pVar, dj.c<? super C01695> cVar) {
            super(2, cVar);
            this.$onDragStart = lVar;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
            this.$onDrag = pVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01695 c01695 = new C01695(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, cVar);
            c01695.L$0 = obj;
            return c01695;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0013, B:33:0x0084, B:35:0x008c, B:37:0x009b, B:39:0x00a7, B:40:0x00aa, B:41:0x00ad, B:42:0x00b3, B:13:0x0023, B:27:0x005c, B:29:0x0060, B:16:0x002b, B:24:0x004b, B:21:0x003e), top: B:47:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0013, B:33:0x0084, B:35:0x008c, B:37:0x009b, B:39:0x00a7, B:40:0x00aa, B:41:0x00ad, B:42:0x00b3, B:13:0x0023, B:27:0x005c, B:29:0x0060, B:16:0x002b, B:24:0x004b, B:21:0x003e), top: B:47:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[Catch: CancellationException -> 0x002f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0013, B:33:0x0084, B:35:0x008c, B:37:0x009b, B:39:0x00a7, B:40:0x00aa, B:41:0x00ad, B:42:0x00b3, B:13:0x0023, B:27:0x005c, B:29:0x0060, B:16:0x002b, B:24:0x004b, B:21:0x003e), top: B:47:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                li.c.O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
                goto L84
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
                goto L5c
            L27:
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
                goto L4b
            L2f:
                r12 = move-exception
                goto Lbb
            L32:
                li.c.O(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2f
                r11.label = r4     // Catch: java.util.concurrent.CancellationException -> L2f
                r5 = r1
                r8 = r11
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L2f
                if (r12 != r0) goto L4b
                return r0
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> L2f
                long r4 = r12.getId()     // Catch: java.util.concurrent.CancellationException -> L2f
                r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2f
                r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L2f
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m285awaitLongPressOrCancellationrnUCldI(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L2f
                if (r12 != r0) goto L5c
                return r0
            L5c:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> L2f
                if (r12 == 0) goto Lb8
                kj.l<androidx.compose.ui.geometry.Offset, kotlin.j> r3 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L2f
                long r4 = r12.getPosition()     // Catch: java.util.concurrent.CancellationException -> L2f
                androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m2574boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L2f
                r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L2f
                long r3 = r12.getId()     // Catch: java.util.concurrent.CancellationException -> L2f
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch: java.util.concurrent.CancellationException -> L2f
                kj.p<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.j> r5 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> L2f
                r12.<init>()     // Catch: java.util.concurrent.CancellationException -> L2f
                r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2f
                r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L2f
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m295dragjO51t88(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L2f
                if (r12 != r0) goto L83
                return r0
            L83:
                r0 = r1
            L84:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L2f
                boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2f
                if (r12 == 0) goto Lb3
                androidx.compose.ui.input.pointer.PointerEvent r12 = r0.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L2f
                java.util.List r12 = r12.getChanges()     // Catch: java.util.concurrent.CancellationException -> L2f
                int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L2f
                r1 = 0
            L99:
                if (r1 >= r0) goto Lad
                java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L2f
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2     // Catch: java.util.concurrent.CancellationException -> L2f
                boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r2)     // Catch: java.util.concurrent.CancellationException -> L2f
                if (r3 == 0) goto Laa
                r2.consume()     // Catch: java.util.concurrent.CancellationException -> L2f
            Laa:
                int r1 = r1 + 1
                goto L99
            Lad:
                kj.a<kotlin.j> r12 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L2f
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L2f
                goto Lb8
            Lb3:
                kj.a<kotlin.j> r12 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L2f
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L2f
            Lb8:
                kotlin.j r12 = kotlin.j.a
                return r12
            Lbb:
                kj.a<kotlin.j> r0 = r11.$onDragCancel
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C01695.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {539, 541, 552}, m = "invokeSuspend")
    public static final class C01735 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ kj.a<j> $onDragCancel;
        final /* synthetic */ kj.a<j> $onDragEnd;
        final /* synthetic */ l<Offset, j> $onDragStart;
        final /* synthetic */ p<PointerInputChange, Float, j> $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01735(l<? super Offset, j> lVar, p<? super PointerInputChange, ? super Float, j> pVar, kj.a<j> aVar, kj.a<j> aVar2, dj.c<? super C01735> cVar) {
            super(2, cVar);
            this.$onDragStart = lVar;
            this.$onHorizontalDrag = pVar;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01735 c01735 = new C01735(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, cVar);
            c01735.L$0 = obj;
            return c01735;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                li.c.O(r13)
                goto La6
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                li.c.O(r13)
                goto L70
            L28:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r13)
                goto L4b
            L30:
                li.c.O(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r12.L$0 = r13
                r12.label = r4
                r5 = r13
                r8 = r12
                java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L48
                return r0
            L48:
                r11 = r1
                r1 = r13
                r13 = r11
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
                r10.<init>()
                long r5 = r13.getId()
                int r7 = r13.getType()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                r8.<init>()
                r12.L$0 = r1
                r12.L$1 = r10
                r12.label = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m283awaitHorizontalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L6e
                return r0
            L6e:
                r3 = r1
                r1 = r10
            L70:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lb9
                kj.l<androidx.compose.ui.geometry.Offset, kotlin.j> r4 = r12.$onDragStart
                long r5 = r13.getPosition()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m2574boximpl(r5)
                r4.invoke(r5)
                kj.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.j> r4 = r12.$onHorizontalDrag
                float r1 = r1.element
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
                kj.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.j> r1 = r12.$onHorizontalDrag
                r13.<init>()
                r1 = 0
                r12.L$0 = r1
                r12.L$1 = r1
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m296horizontalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La6
                return r0
            La6:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb4
                kj.a<kotlin.j> r13 = r12.$onDragEnd
                r13.invoke()
                goto Lb9
            Lb4:
                kj.a<kotlin.j> r13 = r12.$onDragCancel
                r13.invoke()
            Lb9:
                kotlin.j r13 = kotlin.j.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C01735.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {391, 393, TypedValues.CycleType.TYPE_CURVE_FIT}, m = "invokeSuspend")
    public static final class C01775 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ kj.a<j> $onDragCancel;
        final /* synthetic */ kj.a<j> $onDragEnd;
        final /* synthetic */ l<Offset, j> $onDragStart;
        final /* synthetic */ p<PointerInputChange, Float, j> $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01775(l<? super Offset, j> lVar, p<? super PointerInputChange, ? super Float, j> pVar, kj.a<j> aVar, kj.a<j> aVar2, dj.c<? super C01775> cVar) {
            super(2, cVar);
            this.$onDragStart = lVar;
            this.$onVerticalDrag = pVar;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01775 c01775 = new C01775(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, cVar);
            c01775.L$0 = obj;
            return c01775;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                li.c.O(r13)
                goto La6
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                li.c.O(r13)
                goto L70
            L28:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r13)
                goto L4b
            L30:
                li.c.O(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r12.L$0 = r13
                r12.label = r4
                r5 = r13
                r8 = r12
                java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L48
                return r0
            L48:
                r11 = r1
                r1 = r13
                r13 = r11
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
                r10.<init>()
                long r5 = r13.getId()
                int r7 = r13.getType()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                r8.<init>()
                r12.L$0 = r1
                r12.L$1 = r10
                r12.label = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m291awaitVerticalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L6e
                return r0
            L6e:
                r3 = r1
                r1 = r10
            L70:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lb9
                kj.l<androidx.compose.ui.geometry.Offset, kotlin.j> r4 = r12.$onDragStart
                long r5 = r13.getPosition()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m2574boximpl(r5)
                r4.invoke(r5)
                kj.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.j> r4 = r12.$onVerticalDrag
                float r1 = r1.element
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
                kj.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.j> r1 = r12.$onVerticalDrag
                r13.<init>()
                r1 = 0
                r12.L$0 = r1
                r12.L$1 = r1
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m299verticalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La6
                return r0
            La6:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb4
                kj.a<kotlin.j> r13 = r12.$onDragEnd
                r13.invoke()
                goto Lb9
            Lb4:
                kj.a<kotlin.j> r13 = r12.$onDragCancel
                r13.invoke()
            Lb9:
                kotlin.j r13 = kotlin.j.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C01775.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        float fM5267constructorimpl = Dp.m5267constructorimpl((float) 0.125d);
        mouseSlop = fM5267constructorimpl;
        float fM5267constructorimpl2 = Dp.m5267constructorimpl(18);
        defaultTouchSlop = fM5267constructorimpl2;
        mouseToTouchSlopRatio = fM5267constructorimpl / fM5267constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m280awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m280awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, dj.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m281awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, l<? super PointerInputChange, Boolean> lVar, dj.c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            PointerInputChange pointerInputChange2 = null;
            PointerEvent pointerEvent = (PointerEvent) androidx.compose.ui.input.pointer.a.t(awaitPointerEventScope, null, cVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m4114equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i2);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                longRef.element = pointerInputChange5.getId();
            } else if (((Boolean) lVar.invoke(pointerInputChange3)).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if ((!(androidx.compose.ui.geometry.Offset.m2585getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f)) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m282awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m282awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014a -> B:64:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a8 -> B:60:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01f6 -> B:64:0x01be). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m283awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, kj.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.j> r25, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m283awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kj.p, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014d -> B:20:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01af -> B:60:0x01b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01fb -> B:64:0x01c3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m284awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, kj.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.j> r23, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m284awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.p, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m285awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            li.c.O(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L99
            goto La2
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            li.c.O(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m297isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L47
            return r4
        L47:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L54:
            if (r5 >= r2) goto L6b
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.getId()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m4114equalsimpl0(r7, r10)
            if (r7 == 0) goto L68
            goto L6c
        L68:
            int r5 = r5 + 1
            goto L54
        L6b:
            r6 = r4
        L6c:
            r10 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L72
            return r4
        L72:
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r10
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r0.L$0 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r0.L$1 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            java.lang.Object r9 = r9.withTimeout(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L98
            if (r9 != r1) goto La2
            return r1
        L98:
            r9 = r11
        L99:
            java.lang.Object r9 = r9.element
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto La1
            r4 = r10
            goto La2
        La1:
            r4 = r9
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m285awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01a8 -> B:63:0x01ac). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m286awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, androidx.compose.foundation.gestures.PointerDirectionConfig r25, boolean r26, kj.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.j> r27, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r28) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m286awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, kj.p, dj.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU$$forInline, reason: not valid java name */
    private static final Object m287awaitPointerSlopOrCancellationwtdNQyU$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, int i2, PointerDirectionConfig pointerDirectionConfig, boolean z, p<? super PointerInputChange, ? super Offset, j> pVar, dj.c<? super PointerInputChange> cVar) {
        float f;
        PointerInputChange pointerInputChange;
        long jM2589minusMKHz9U;
        float f2;
        PointerInputChange pointerInputChange2;
        if (m297isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM298pointerSlopE8SPZFQ = m298pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f3 = 0.0f;
        float fMo300crossAxisDeltak4lQ0M = 0.0f;
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) androidx.compose.ui.input.pointer.a.t(awaitPointerEventScope, null, cVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    f = f3;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                f = f3;
                int i4 = i3;
                if (Boolean.valueOf(PointerId.m4114equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i3 = i4 + 1;
                f3 = f;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i5);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i5++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
                f2 = f;
            } else {
                long jM4129getPositionF1C5BW0 = pointerInputChange3.getPosition();
                long jM4130getPreviousPositionF1C5BW0 = pointerInputChange3.getPreviousPosition();
                float fMo301mainAxisDeltak4lQ0M = f + (pointerDirectionConfig.mo301mainAxisDeltak4lQ0M(jM4129getPositionF1C5BW0) - pointerDirectionConfig.mo301mainAxisDeltak4lQ0M(jM4130getPreviousPositionF1C5BW0));
                fMo300crossAxisDeltak4lQ0M += pointerDirectionConfig.mo300crossAxisDeltak4lQ0M(jM4129getPositionF1C5BW0) - pointerDirectionConfig.mo300crossAxisDeltak4lQ0M(jM4130getPreviousPositionF1C5BW0);
                float fAbs = z ? Math.abs(fMo301mainAxisDeltak4lQ0M) : Offset.m2583getDistanceimpl(pointerDirectionConfig.mo302offsetFromChangesdBAh8RU(fMo301mainAxisDeltak4lQ0M, fMo300crossAxisDeltak4lQ0M));
                if (fAbs < fM298pointerSlopE8SPZFQ) {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, cVar);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f2 = fMo301mainAxisDeltak4lQ0M;
                } else {
                    if (z) {
                        jM2589minusMKHz9U = pointerDirectionConfig.mo302offsetFromChangesdBAh8RU(fMo301mainAxisDeltak4lQ0M - (Math.signum(fMo301mainAxisDeltak4lQ0M) * fM298pointerSlopE8SPZFQ), fMo300crossAxisDeltak4lQ0M);
                    } else {
                        long jMo302offsetFromChangesdBAh8RU = pointerDirectionConfig.mo302offsetFromChangesdBAh8RU(fMo301mainAxisDeltak4lQ0M, fMo300crossAxisDeltak4lQ0M);
                        jM2589minusMKHz9U = Offset.m2589minusMKHz9U(jMo302offsetFromChangesdBAh8RU, Offset.m2592timestuRUvjQ(Offset.m2580divtuRUvjQ(jMo302offsetFromChangesdBAh8RU, fAbs), fM298pointerSlopE8SPZFQ));
                    }
                    pVar.invoke(pointerInputChange3, Offset.m2574boximpl(jM2589minusMKHz9U));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f2 = 0.0f;
                    fMo300crossAxisDeltak4lQ0M = 0.0f;
                    f3 = f2;
                }
            }
            f3 = f2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        r9 = r2.mo302offsetFromChangesdBAh8RU(r10 - (java.lang.Math.signum(r10) * r5), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e9, code lost:
    
        r10 = r2.mo302offsetFromChangesdBAh8RU(r10, r11);
        r9 = androidx.compose.ui.geometry.Offset.m2589minusMKHz9U(r10, androidx.compose.ui.geometry.Offset.m2592timestuRUvjQ(androidx.compose.ui.geometry.Offset.m2580divtuRUvjQ(r10, r9), r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
    
        r24.invoke(r4, androidx.compose.ui.geometry.Offset.m2574boximpl(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        if (r4.isConsumed() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m288awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, int r21, androidx.compose.foundation.gestures.PointerDirectionConfig r22, boolean r23, kj.p r24, dj.c r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m288awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, kj.p, dj.c, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014e -> B:20:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b3 -> B:60:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01fe -> B:64:0x01c9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m289awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, kj.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.j> r22, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r23) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m289awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.p, dj.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if ((!(androidx.compose.ui.geometry.Offset.m2586getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f)) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m290awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m290awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014a -> B:64:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a8 -> B:60:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01f6 -> B:64:0x01be). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m291awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, kj.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.j> r25, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m291awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kj.p, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014d -> B:20:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01af -> B:60:0x01b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01fb -> B:64:0x01c3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m292awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, kj.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.j> r23, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m292awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.p, dj.c):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, l<? super Offset, j> lVar, kj.a<j> aVar, kj.a<j> aVar2, p<? super PointerInputChange, ? super Offset, j> pVar, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass5(lVar, pVar, aVar2, aVar, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, l lVar, kj.a aVar, kj.a aVar2, p pVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m303invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m303invokek4lQ0M(long j) {
                }
            };
        }
        l lVar2 = lVar;
        if ((i2 & 2) != 0) {
            aVar = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m304invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m304invoke();
                    return j.a;
                }
            };
        }
        kj.a aVar3 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m305invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m305invoke();
                    return j.a;
                }
            };
        }
        return detectDragGestures(pointerInputScope, lVar2, aVar3, aVar2, pVar, cVar);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, l<? super Offset, j> lVar, kj.a<j> aVar, kj.a<j> aVar2, p<? super PointerInputChange, ? super Offset, j> pVar, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C01695(lVar, aVar, aVar2, pVar, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, l lVar, kj.a aVar, kj.a aVar2, p pVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m306invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m306invokek4lQ0M(long j) {
                }
            };
        }
        l lVar2 = lVar;
        if ((i2 & 2) != 0) {
            aVar = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m307invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m307invoke();
                    return j.a;
                }
            };
        }
        kj.a aVar3 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m308invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m308invoke();
                    return j.a;
                }
            };
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, lVar2, aVar3, aVar2, pVar, cVar);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, l<? super Offset, j> lVar, kj.a<j> aVar, kj.a<j> aVar2, p<? super PointerInputChange, ? super Float, j> pVar, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C01735(lVar, pVar, aVar, aVar2, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, l lVar, kj.a aVar, kj.a aVar2, p pVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m309invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m309invokek4lQ0M(long j) {
                }
            };
        }
        l lVar2 = lVar;
        if ((i2 & 2) != 0) {
            aVar = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m310invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m310invoke();
                    return j.a;
                }
            };
        }
        kj.a aVar3 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m311invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m311invoke();
                    return j.a;
                }
            };
        }
        return detectHorizontalDragGestures(pointerInputScope, lVar2, aVar3, aVar2, pVar, cVar);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, l<? super Offset, j> lVar, kj.a<j> aVar, kj.a<j> aVar2, p<? super PointerInputChange, ? super Float, j> pVar, dj.c<? super j> cVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C01775(lVar, pVar, aVar, aVar2, null), cVar);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : j.a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, l lVar, kj.a aVar, kj.a aVar2, p pVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<Offset, j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m312invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m312invokek4lQ0M(long j) {
                }
            };
        }
        l lVar2 = lVar;
        if ((i2 & 2) != 0) {
            aVar = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m313invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m313invoke();
                    return j.a;
                }
            };
        }
        kj.a aVar3 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m314invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m314invoke();
                    return j.a;
                }
            };
        }
        return detectVerticalDragGestures(pointerInputScope, lVar2, aVar3, aVar2, pVar, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        if ((!(((java.lang.Number) r2.invoke(r15)).floatValue() == 0.0f)) != false) goto L52;
     */
    /* JADX WARN: Path cross not found for [B:46:0x00f7, B:35:0x00ce], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:23:0x0093). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m293dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.j> r22, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float> r23, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m293dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.l, kj.l, kj.l, dj.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m294dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, l<? super PointerInputChange, j> lVar, l<? super PointerInputChange, Float> lVar2, l<? super PointerInputChange, Boolean> lVar3, dj.c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long jM4128getIdJ3iCeTQ = j;
        if (m297isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM4128getIdJ3iCeTQ)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = jM4128getIdJ3iCeTQ;
            while (true) {
                PointerEvent pointerEvent = (PointerEvent) androidx.compose.ui.input.pointer.a.t(awaitPointerEventScope, null, cVar, 1, null);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (Boolean.valueOf(PointerId.m4114equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.getId();
                } else {
                    if (Boolean.valueOf(1 ^ (((Number) lVar2.invoke(pointerInputChange2)).floatValue() == 0.0f ? 1 : 0)).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || ((Boolean) lVar3.invoke(pointerInputChange2)).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            lVar.invoke(pointerInputChange2);
            jM4128getIdJ3iCeTQ = pointerInputChange2.getId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m295dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.j> r7, dj.c<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            kj.l r4 = (kj.l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            li.c.O(r8)
            r7 = r4
            r4 = r5
            goto L49
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            li.c.O(r8)
        L3c:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m280awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m295dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.l, dj.c):java.lang.Object");
    }

    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if ((!(androidx.compose.ui.geometry.Offset.m2585getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f)) != false) goto L52;
     */
    /* JADX WARN: Path cross not found for [B:46:0x00dc, B:35:0x00b3], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:23:0x0081). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m296horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.j> r21, dj.c<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m296horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.l, dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m297isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i2);
            if (PointerId.m4114equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m298pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i2) {
        m.h(viewConfiguration, "$this$pointerSlop");
        return PointerType.m4187equalsimpl0(i2, PointerType.INSTANCE.m4192getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    public static final PointerDirectionConfig toPointerDirectionConfig(Orientation orientation) {
        m.h(orientation, "<this>");
        return orientation == Orientation.Vertical ? VerticalPointerDirectionConfig : HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if ((!(androidx.compose.ui.geometry.Offset.m2586getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f)) != false) goto L52;
     */
    /* JADX WARN: Path cross not found for [B:46:0x00dc, B:35:0x00b3], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:23:0x0081). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m299verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.j> r21, dj.c<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m299verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kj.l, dj.c):java.lang.Object");
    }
}
