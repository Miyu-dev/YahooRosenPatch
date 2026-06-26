package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements q<PressGestureScope, Offset, dj.c<? super j>, Object> {
    int label;

    public TapGestureDetectorKt$NoPressGesture$1(dj.c<? super TapGestureDetectorKt$NoPressGesture$1> cVar) {
        super(3, cVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m374invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m374invoked4ec7I(PressGestureScope pressGestureScope, long j, dj.c<? super j> cVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        li.c.O(obj);
        return j.a;
    }
}
