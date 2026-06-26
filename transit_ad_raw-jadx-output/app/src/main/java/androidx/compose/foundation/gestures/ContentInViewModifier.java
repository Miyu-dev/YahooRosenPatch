package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.concurrent.CancellationException;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: ContentInViewModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001OB'\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u00020\u0012¢\u0006\u0004\bM\u0010NJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J%\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u0012*\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\"\u0010!\u001a\u00020\u001e*\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\"\u0010!\u001a\u00020\u001e*\u00020\"2\u0006\u0010\u001d\u001a\u00020\"H\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0016J#\u0010'\u001a\u00020\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040&H\u0096@ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016J\u001d\u0010.\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109R\u001f\u0010B\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00109R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/geometry/Rect;", "getFocusedChildBounds", "Lkotlin/j;", "launchAnimation", "", "calculateScrollDelta", "findBringIntoViewRequest", "childBounds", "Landroidx/compose/ui/unit/IntSize;", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "computeDestination", "size", "", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "isMaxVisible", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "relocationOffset", "leadingEdge", "trailingEdge", "relocationDistance", "other", "", "compareTo-TemP2vQ", "(JJ)I", "compareTo", "Landroidx/compose/ui/geometry/Size;", "compareTo-iLBOSCw", "localRect", "calculateRectForParent", "Lkotlin/Function0;", "bringChildIntoView", "(Lkj/a;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onPlaced", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "Z", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "trackingFocusedChild", "viewportSize", "J", "isAnimationRunning", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "animationState", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    private final UpdatableAnimationState animationState;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests;
    private LayoutCoordinates coordinates;
    private LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;
    private final Modifier modifier;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final CoroutineScope scope;
    private final ScrollableState scrollState;
    private boolean trackingFocusedChild;
    private long viewportSize;

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "", "", "toString", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lkj/a;", "getCurrentBounds", "()Lkj/a;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/j;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "<init>", "(Lkj/a;Lkotlinx/coroutines/CancellableContinuation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Request {
        private final CancellableContinuation<j> continuation;
        private final kj.a<Rect> currentBounds;

        public Request(kj.a<Rect> aVar, CancellableContinuation<? super j> cancellableContinuation) {
            m.h(aVar, "currentBounds");
            m.h(cancellableContinuation, "continuation");
            this.currentBounds = aVar;
            this.continuation = cancellableContinuation;
        }

        public final CancellableContinuation<j> getContinuation() {
            return this.continuation;
        }

        public final kj.a<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public String toString() {
            String strE;
            CoroutineName coroutineName = this.continuation.getContext().get(CoroutineName.Key);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            li.c.g(16);
            String string = Integer.toString(iHashCode, 16);
            m.g(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            if (name == null || (strE = android.support.v4.media.a.e("[", name, "](")) == null) {
                strE = "(";
            }
            sb.append(strE);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1, reason: invalid class name */
    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", l = {193}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ContentInViewModifier.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", l = {198}, m = "invokeSuspend")
        public static final class C00241 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
            final /* synthetic */ Job $animationJob;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00241(ContentInViewModifier contentInViewModifier, Job job, dj.c<? super C00241> cVar) {
                super(2, cVar);
                this.this$0 = contentInViewModifier;
                this.$animationJob = job;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C00241 c00241 = new C00241(this.this$0, this.$animationJob, cVar);
                c00241.L$0 = obj;
                return c00241;
            }

            public final Object invoke(ScrollScope scrollScope, dj.c<? super j> cVar) {
                return create(scrollScope, cVar).invokeSuspend(j.a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    final ScrollScope scrollScope = (ScrollScope) this.L$0;
                    this.this$0.animationState.setValue(this.this$0.calculateScrollDelta());
                    UpdatableAnimationState updatableAnimationState = this.this$0.animationState;
                    final ContentInViewModifier contentInViewModifier = this.this$0;
                    final Job job = this.$animationJob;
                    l<Float, j> lVar = new l<Float, j>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke(((Number) obj2).floatValue());
                            return j.a;
                        }

                        public final void invoke(float f) {
                            float f2 = contentInViewModifier.reverseDirection ? 1.0f : -1.0f;
                            float fScrollBy = scrollScope.scrollBy(f2 * f) * f2;
                            if (fScrollBy < f) {
                                JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fScrollBy + " < " + f + ')', (Throwable) null, 2, (Object) null);
                            }
                        }
                    };
                    final ContentInViewModifier contentInViewModifier2 = this.this$0;
                    kj.a<j> aVar = new kj.a<j>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.2
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m274invoke();
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m274invoke() {
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewModifier2.bringIntoViewRequests;
                            ContentInViewModifier contentInViewModifier3 = contentInViewModifier2;
                            while (true) {
                                if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                                    break;
                                }
                                Rect rect = (Rect) ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                if (!(rect == null ? true : ContentInViewModifier.m271isMaxVisibleO0kMr_c$default(contentInViewModifier3, rect, 0L, 1, null))) {
                                    break;
                                } else {
                                    ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.constructor-impl(j.a));
                                }
                            }
                            if (contentInViewModifier2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewModifier2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewModifier.m271isMaxVisibleO0kMr_c$default(contentInViewModifier2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewModifier2.trackingFocusedChild = false;
                                }
                            }
                            contentInViewModifier2.animationState.setValue(contentInViewModifier2.calculateScrollDelta());
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(lVar, aVar, this) == coroutineSingletons) {
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
        }

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = ContentInViewModifier.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
                try {
                    if (i2 == 0) {
                        li.c.O(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                        ContentInViewModifier.this.isAnimationRunning = true;
                        ScrollableState scrollableState = ContentInViewModifier.this.scrollState;
                        C00241 c00241 = new C00241(ContentInViewModifier.this, job, null);
                        this.label = 1;
                        if (c.e(scrollableState, null, c00241, this, 1, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                    }
                    ContentInViewModifier.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewModifier.this.isAnimationRunning = false;
                    ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewModifier.this.trackingFocusedChild = false;
                    return j.a;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                ContentInViewModifier.this.isAnimationRunning = false;
                ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                ContentInViewModifier.this.trackingFocusedChild = false;
                throw th;
            }
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    public ContentInViewModifier(CoroutineScope coroutineScope, Orientation orientation, ScrollableState scrollableState, boolean z) {
        m.h(coroutineScope, "scope");
        m.h(orientation, "orientation");
        m.h(scrollableState, "scrollState");
        this.scope = coroutineScope;
        this.orientation = orientation;
        this.scrollState = scrollableState;
        this.reverseDirection = z;
        this.bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
        this.viewportSize = IntSize.INSTANCE.m5432getZeroYbymL2g();
        this.animationState = new UpdatableAnimationState();
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new l<LayoutCoordinates, j>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier$modifier$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return j.a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                this.this$0.focusedChild = layoutCoordinates;
            }
        }), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float calculateScrollDelta() throws NoWhenBranchMatchedException {
        if (IntSize.m5425equalsimpl0(this.viewportSize, IntSize.INSTANCE.m5432getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM5437toSizeozmzZPI = IntSizeKt.m5437toSizeozmzZPI(this.viewportSize);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return relocationDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom(), Size.m2651getHeightimpl(jM5437toSizeozmzZPI));
        }
        if (i2 == 2) {
            return relocationDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight(), Size.m2654getWidthimpl(jM5437toSizeozmzZPI));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m267compareToTemP2vQ(long j, long j2) throws NoWhenBranchMatchedException {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return m.j(IntSize.m5426getHeightimpl(j), IntSize.m5426getHeightimpl(j2));
        }
        if (i2 == 2) {
            return m.j(IntSize.m5427getWidthimpl(j), IntSize.m5427getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m268compareToiLBOSCw(long j, long j2) throws NoWhenBranchMatchedException {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return Float.compare(Size.m2651getHeightimpl(j), Size.m2651getHeightimpl(j2));
        }
        if (i2 == 2) {
            return Float.compare(Size.m2654getWidthimpl(j), Size.m2654getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m269computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        return childBounds.m2622translatek4lQ0M(Offset.m2594unaryMinusF1C5BW0(m272relocationOffsetBMxPBkI(childBounds, containerSize)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i2 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect rect2 = (Rect) ((Request) content[i2]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    if (m268compareToiLBOSCw(rect2.m2618getSizeNHjbRc(), IntSizeKt.m5437toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect;
                    }
                    rect = rect2;
                }
                i2--;
            } while (i2 >= 0);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m270isMaxVisibleO0kMr_c(Rect rect, long j) {
        return Offset.m2582equalsimpl0(m272relocationOffsetBMxPBkI(rect, j), Offset.INSTANCE.m2601getZeroF1C5BW0());
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m271isMaxVisibleO0kMr_c$default(ContentInViewModifier contentInViewModifier, Rect rect, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = contentInViewModifier.viewportSize;
        }
        return contentInViewModifier.m270isMaxVisibleO0kMr_c(rect, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (!(!this.isAnimationRunning)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        BuildersKt.launch$default(this.scope, (dj.e) null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null), 1, (Object) null);
    }

    private final float relocationDistance(float leadingEdge, float trailingEdge, float containerSize) {
        if ((leadingEdge >= 0.0f && trailingEdge <= containerSize) || (leadingEdge < 0.0f && trailingEdge > containerSize)) {
            return 0.0f;
        }
        float f = trailingEdge - containerSize;
        return Math.abs(leadingEdge) < Math.abs(f) ? leadingEdge : f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m272relocationOffsetBMxPBkI(Rect childBounds, long containerSize) throws NoWhenBranchMatchedException {
        long jM5437toSizeozmzZPI = IntSizeKt.m5437toSizeozmzZPI(containerSize);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return OffsetKt.Offset(0.0f, relocationDistance(childBounds.getTop(), childBounds.getBottom(), Size.m2651getHeightimpl(jM5437toSizeozmzZPI)));
        }
        if (i2 == 2) {
            return OffsetKt.Offset(relocationDistance(childBounds.getLeft(), childBounds.getRight(), Size.m2654getWidthimpl(jM5437toSizeozmzZPI)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(kj.a<Rect> aVar, dj.c<? super j> cVar) {
        Rect rect = (Rect) aVar.invoke();
        boolean z = false;
        if (rect != null && !m271isMaxVisibleO0kMr_c$default(this, rect, 0L, 1, null)) {
            z = true;
        }
        if (!z) {
            return j.a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(li.c.D(cVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(aVar, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : j.a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        m.h(localRect, "localRect");
        if (!IntSize.m5425equalsimpl0(this.viewportSize, IntSize.INSTANCE.m5432getZeroYbymL2g())) {
            return m269computeDestinationO0kMr_c(localRect, this.viewportSize);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        m.h(layoutCoordinates, "coordinates");
        this.coordinates = layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo273onRemeasuredozmzZPI(long size) {
        Rect focusedChildBounds;
        long j = this.viewportSize;
        this.viewportSize = size;
        if (m267compareToTemP2vQ(size, j) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m270isMaxVisibleO0kMr_c(rect, j) && !m270isMaxVisibleO0kMr_c(focusedChildBounds, size)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
