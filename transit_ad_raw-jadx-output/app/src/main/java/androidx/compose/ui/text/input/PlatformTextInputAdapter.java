package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTextInputAdapter.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "Lkotlin/j;", "onDisposed", "Landroidx/compose/ui/text/input/TextInputForTests;", "getInputForTests", "()Landroidx/compose/ui/text/input/TextInputForTests;", "inputForTests", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public interface PlatformTextInputAdapter {
    InputConnection createInputConnection(EditorInfo outAttrs);

    TextInputForTests getInputForTests();

    void onDisposed();
}
