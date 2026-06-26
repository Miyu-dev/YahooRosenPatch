package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u000e\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0000\u001a\f\u0010\u000e\u001a\u00020\f*\u00020\u0002H\u0000\"\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/ViewAdapter;", "T", "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", "getOrAddAdapter", "(Landroid/view/View;ILkj/a;)Landroidx/compose/ui/node/ViewAdapter;", "", "key", "tagKey", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "getViewAdapter", "viewAdaptersKey", "I", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends ViewAdapter> T getOrAddAdapter(View view, int i2, kj.a<? extends T> aVar) {
        ViewAdapter viewAdapter;
        m.h(view, "<this>");
        m.h(aVar, "factory");
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i3);
            if (viewAdapter.getId() == i2) {
                break;
            }
            i3++;
        }
        T t = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T t2 = (T) aVar.invoke();
        viewAdapter2.getAdapters().add(t2);
        return t2;
    }

    public static final MergedViewAdapter getViewAdapter(View view) {
        m.h(view, "<this>");
        int i2 = viewAdaptersKey;
        Object tag = view.getTag(i2);
        MergedViewAdapter mergedViewAdapter = tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
        view.setTag(i2, mergedViewAdapter2);
        return mergedViewAdapter2;
    }

    public static final MergedViewAdapter getViewAdapterIfExists(View view) {
        m.h(view, "<this>");
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(String str) {
        m.h(str, "key");
        return str.hashCode() | 50331648;
    }
}
