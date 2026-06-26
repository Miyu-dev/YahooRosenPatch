package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
public final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements p<CoroutineScope, dj.c<? super kotlin.j>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {358}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super kotlin.j>, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2, int i3, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$current = i2;
            this.$target = i3;
            this.$flingAmount = f;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
            this.this$0 = windowInsetsNestedScrollConnection;
        }

        public final dj.c<kotlin.j> create(Object obj, dj.c<?> cVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, this.this$0, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float f = new Float(this.$target);
                Float f2 = new Float(this.$flingAmount);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                kj.l<Animatable<Float, AnimationVector1D>, kotlin.j> lVar = new kj.l<Animatable<Float, AnimationVector1D>, kotlin.j>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Animatable<Float, AnimationVector1D>) obj2);
                        return kotlin.j.a;
                    }

                    public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                        kotlin.jvm.internal.m.h(animatable, "$this$animateTo");
                        windowInsetsNestedScrollConnection.adjustInsets(animatable.getValue().floatValue());
                    }
                };
                this.label = 1;
                if (Animatable.animateTo$default(animatableAnimatable$default, f, null, f2, lVar, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            this.$animationController.finish(this.$targetShown);
            this.this$0.animationController = null;
            return kotlin.j.a;
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super kotlin.j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(kotlin.j.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i2, int i3, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, dj.c<? super WindowInsetsNestedScrollConnection$fling$3> cVar) {
        super(2, cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i2;
        this.$target = i3;
        this.$flingAmount = f;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    public final dj.c<kotlin.j> create(Object obj, dj.c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, cVar);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        li.c.O(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
        windowInsetsNestedScrollConnection.animationJob = BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, windowInsetsNestedScrollConnection, null), 3, (Object) null);
        return kotlin.j.a;
    }

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super kotlin.j> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(kotlin.j.a);
    }
}
