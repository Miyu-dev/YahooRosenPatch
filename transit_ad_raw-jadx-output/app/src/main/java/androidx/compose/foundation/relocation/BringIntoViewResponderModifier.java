package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import dj.e;
import ej.c;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewChildModifier;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "Lkotlin/j;", "bringChildIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkj/a;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/foundation/relocation/BringIntoViewParent;", "value", "defaultParent", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewParent;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class BringIntoViewResponderModifier extends BringIntoViewChildModifier implements ModifierLocalProvider<BringIntoViewParent>, BringIntoViewParent {
    public BringIntoViewResponder responder;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2, reason: invalid class name */
    /* JADX INFO: compiled from: BringIntoViewResponder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super Job>, Object> {
        final /* synthetic */ kj.a<Rect> $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        final /* synthetic */ kj.a<Rect> $parentRect;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: BringIntoViewResponder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {162}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ kj.a<Rect> $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            int label;
            final /* synthetic */ BringIntoViewResponderModifier this$0;

            /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: BringIntoViewResponder.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            public /* synthetic */ class C00451 extends FunctionReferenceImpl implements kj.a<Rect> {
                final /* synthetic */ kj.a<Rect> $boundsProvider;
                final /* synthetic */ LayoutCoordinates $childCoordinates;
                final /* synthetic */ BringIntoViewResponderModifier this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00451(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, kj.a<Rect> aVar) {
                    super(0, m.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.this$0 = bringIntoViewResponderModifier;
                    this.$childCoordinates = layoutCoordinates;
                    this.$boundsProvider = aVar;
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Rect m749invoke() {
                    return BringIntoViewResponderModifier.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, kj.a<Rect> aVar, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = bringIntoViewResponderModifier;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = aVar;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    BringIntoViewResponder responder = this.this$0.getResponder();
                    C00451 c00451 = new C00451(this.this$0, this.$childCoordinates, this.$boundsProvider);
                    this.label = 1;
                    if (responder.bringChildIntoView(c00451, this) == coroutineSingletons) {
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

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BringIntoViewResponder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {171}, m = "invokeSuspend")
        public static final class C00462 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ kj.a<Rect> $parentRect;
            int label;
            final /* synthetic */ BringIntoViewResponderModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00462(BringIntoViewResponderModifier bringIntoViewResponderModifier, kj.a<Rect> aVar, dj.c<? super C00462> cVar) {
                super(2, cVar);
                this.this$0 = bringIntoViewResponderModifier;
                this.$parentRect = aVar;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new C00462(this.this$0, this.$parentRect, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    BringIntoViewParent parent = this.this$0.getParent();
                    LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return j.a;
                    }
                    kj.a<Rect> aVar = this.$parentRect;
                    this.label = 1;
                    if (parent.bringChildIntoView(layoutCoordinates, aVar, this) == coroutineSingletons) {
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

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LayoutCoordinates layoutCoordinates, kj.a<Rect> aVar, kj.a<Rect> aVar2, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = aVar;
            this.$parentRect = aVar2;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = BringIntoViewResponderModifier.this.new AnonymousClass2(this.$childCoordinates, this.$boundsProvider, this.$parentRect, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(BringIntoViewResponderModifier.this, this.$childCoordinates, this.$boundsProvider, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new C00462(BringIntoViewResponderModifier.this, this.$parentRect, null), 3, (Object) null);
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super Job> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(BringIntoViewParent bringIntoViewParent) {
        super(bringIntoViewParent);
        m.h(bringIntoViewParent, "defaultParent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, kj.a<Rect> aVar) {
        Rect rect;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderModifier.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rect = (Rect) aVar.invoke()) == null) {
            return null;
        }
        return BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, rect);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(final LayoutCoordinates layoutCoordinates, final kj.a<Rect> aVar, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(layoutCoordinates, aVar, new kj.a<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Rect m750invoke() {
                Rect rectBringChildIntoView$localRect = BringIntoViewResponderModifier.bringChildIntoView$localRect(this.this$0, layoutCoordinates, aVar);
                if (rectBringChildIntoView$localRect != null) {
                    return this.this$0.getResponder().calculateRectForParent(rectBringChildIntoView$localRect);
                }
                return null;
            }
        }, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BringIntoViewParent> getKey() {
        return BringIntoViewKt.getModifierLocalBringIntoViewParent();
    }

    public final BringIntoViewResponder getResponder() {
        BringIntoViewResponder bringIntoViewResponder = this.responder;
        if (bringIntoViewResponder != null) {
            return bringIntoViewResponder;
        }
        m.o("responder");
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BringIntoViewParent getValue() {
        return this;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        m.h(bringIntoViewResponder, "<set-?>");
        this.responder = bringIntoViewResponder;
    }
}
