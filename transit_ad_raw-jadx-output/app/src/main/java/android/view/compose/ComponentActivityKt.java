package android.view.compose;

import android.R;
import android.view.ComponentActivity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\f\u0010\t\u001a\u00020\u0004*\u00020\u0000H\u0002\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkj/p;)V", "setOwners", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
public final class ComponentActivityKt {
    private static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setContent(ComponentActivity componentActivity, CompositionContext compositionContext, p<? super Composer, ? super Integer, j> pVar) {
        m.h(componentActivity, "<this>");
        m.h(pVar, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(pVar);
        setOwners(componentActivity);
        componentActivity.setContentView(composeView2, DefaultActivityContentLayoutParams);
    }

    public static /* synthetic */ void setContent$default(ComponentActivity componentActivity, CompositionContext compositionContext, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            compositionContext = null;
        }
        setContent(componentActivity, compositionContext, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void setOwners(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        m.g(decorView, "window.decorView");
        if (ViewTreeLifecycleOwner.get(decorView) == null) {
            ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.get(decorView) == null) {
            ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.set(decorView, componentActivity);
        }
    }
}
