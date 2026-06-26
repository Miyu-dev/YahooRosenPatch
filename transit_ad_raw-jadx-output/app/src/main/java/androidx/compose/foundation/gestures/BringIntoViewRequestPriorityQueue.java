package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kj.l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CancellableContinuation;
import qj.f;

/* JADX INFO: compiled from: BringIntoViewRequestPriorityQueue.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J-\u0010\u000b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\f\u001a\u00020\tJ-\u0010\r\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "", "isEmpty", "Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "request", "enqueue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/j;", "block", "forEachFromSmallest", "resumeAndRemoveAll", "resumeAndRemoveWhile", "", "cause", "cancelAndRemoveAll", "Landroidx/compose/runtime/collection/MutableVector;", "requests", "Landroidx/compose/runtime/collection/MutableVector;", "", "getSize", "()I", "size", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class BringIntoViewRequestPriorityQueue {
    private final MutableVector<ContentInViewModifier.Request> requests = new MutableVector<>(new ContentInViewModifier.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[size];
        for (int i2 = 0; i2 < size; i2++) {
            cancellableContinuationArr[i2] = mutableVector.getContent()[i2].getContinuation();
        }
        for (int i3 = 0; i3 < size; i3++) {
            cancellableContinuationArr[i3].cancel(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean enqueue(final ContentInViewModifier.Request request) {
        m.h(request, "request");
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            request.getContinuation().resumeWith(Result.constructor-impl(j.a));
            return false;
        }
        request.getContinuation().invokeOnCancellation(new l<Throwable, j>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.enqueue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return j.a;
            }

            public final void invoke(Throwable th) {
                BringIntoViewRequestPriorityQueue.this.requests.remove(request);
            }
        });
        int i2 = ((qj.d) new f(0, this.requests.getSize() - 1)).b;
        if (i2 >= 0) {
            while (true) {
                Rect rect2 = (Rect) this.requests.getContent()[i2].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect rectIntersect = rect.intersect(rect2);
                    if (m.c(rectIntersect, rect)) {
                        this.requests.add(i2 + 1, request);
                        return true;
                    }
                    if (!m.c(rectIntersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= i2) {
                            while (true) {
                                this.requests.getContent()[i2].getContinuation().cancel(cancellationException);
                                if (size == i2) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (i2 == 0) {
                    break;
                }
                i2--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(l<? super Rect, j> lVar) {
        m.h(lVar, "block");
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                lVar.invoke(((ContentInViewModifier.Request) content[i2]).getCurrentBounds().invoke());
                i2--;
            } while (i2 >= 0);
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        int i2 = 0;
        int i3 = ((qj.d) new f(0, this.requests.getSize() - 1)).b;
        if (i3 >= 0) {
            while (true) {
                this.requests.getContent()[i2].getContinuation().resumeWith(Result.constructor-impl(j.a));
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(l<? super Rect, Boolean> lVar) {
        m.h(lVar, "block");
        while (this.requests.isNotEmpty() && ((Boolean) lVar.invoke(((ContentInViewModifier.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewModifier.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(Result.constructor-impl(j.a));
        }
    }
}
