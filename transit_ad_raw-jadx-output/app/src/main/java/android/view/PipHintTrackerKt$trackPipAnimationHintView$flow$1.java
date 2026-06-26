package android.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.R;
import ej.c;
import kj.a;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/graphics/Rect;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@c(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", l = {R.styleable.AppCompatTheme_panelMenuListTheme}, m = "invokeSuspend")
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements p<ProducerScope<? super Rect>, dj.c<? super j>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, dj.c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> cVar) {
        super(2, cVar);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 == i6 && i4 == i8 && i3 == i7 && i5 == i9) {
            return;
        }
        m.g(view, "v");
        producerScope.trySend-JP2dKIU(Activity.trackPipAnimationHintView$positionInWindow(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(ProducerScope producerScope, View view) {
        producerScope.trySend-JP2dKIU(Activity.trackPipAnimationHintView$positionInWindow(view));
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, cVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View$OnAttachStateChangeListener, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.i
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(producerScope, view, i3, i4, i5, i6, i7, i8, i9, i10);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.j
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(producerScope, view);
                }
            };
            final ?? r5 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    m.h(view2, "v");
                    producerScope.trySend-JP2dKIU(Activity.trackPipAnimationHintView$positionInWindow(view));
                    view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    m.h(view2, "v");
                    view2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                producerScope.trySend-JP2dKIU(Activity.trackPipAnimationHintView$positionInWindow(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r5);
            final View view2 = this.$view;
            a<j> aVar = new a<j>() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m8invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m8invoke() {
                    view2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    view2.removeOnAttachStateChangeListener(r5);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
        }
        return j.a;
    }

    public final Object invoke(ProducerScope<? super Rect> producerScope, dj.c<? super j> cVar) {
        return create(producerScope, cVar).invokeSuspend(j.a);
    }
}
