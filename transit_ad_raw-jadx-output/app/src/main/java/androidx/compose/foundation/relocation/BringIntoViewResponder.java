package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import dj.c;
import kotlin.Metadata;
import kotlin.j;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H'J#\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "", "Landroidx/compose/ui/geometry/Rect;", "localRect", "calculateRectForParent", "Lkotlin/Function0;", "Lkotlin/j;", "bringChildIntoView", "(Lkj/a;Ldj/c;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0})
public interface BringIntoViewResponder {
    @ExperimentalFoundationApi
    Object bringChildIntoView(kj.a<Rect> aVar, c<? super j> cVar);

    @ExperimentalFoundationApi
    Rect calculateRectForParent(Rect localRect);
}
