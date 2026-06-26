package android.view.compose;

import android.view.result.ActivityResultCallback;
import android.view.result.ActivityResultLauncher;
import android.view.result.ActivityResultRegistry;
import android.view.result.ActivityResultRegistryOwner;
import android.view.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.UUID;
import kj.a;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Lkotlin/Function1;", "Lkotlin/j;", "onResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "rememberLauncherForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Lkj/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
public final class ActivityResultRegistryKt {
    @Composable
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(final ActivityResultContract<I, O> activityResultContract, l<? super O, j> lVar, Composer composer, int i2) {
        m.h(activityResultContract, "contract");
        m.h(lVar, "onResult");
        composer.startReplaceableGroup(-1408504823);
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, 8);
        final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i2 >> 3) & 14);
        Object objM2460rememberSaveable = RememberSaveableKt.m2460rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (a<? extends Object>) new a<String>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }, composer, 3080, 6);
        m.g(objM2460rememberSaveable, "rememberSaveable { UUID.randomUUID().toString() }");
        final String str = (String) objM2460rememberSaveable;
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        final ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ActivityResultLauncherHolder();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) objRememberedValue2;
        EffectsKt.DisposableEffect(activityResultRegistry, str, activityResultContract, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                m.h(disposableEffectScope, "$this$DisposableEffect");
                ActivityResultLauncherHolder<I> activityResultLauncherHolder2 = activityResultLauncherHolder;
                ActivityResultRegistry activityResultRegistry2 = activityResultRegistry;
                String str2 = str;
                ActivityResultContract<I, O> activityResultContract2 = activityResultContract;
                final State<l<O, j>> state = stateRememberUpdatedState2;
                activityResultLauncherHolder2.setLauncher((ActivityResultLauncher<I>) activityResultRegistry2.register(str2, activityResultContract2, new ActivityResultCallback<O>() { // from class: androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.1.1
                    @Override // android.view.result.ActivityResultCallback
                    public final void onActivityResult(O o) {
                        state.getValue().invoke(o);
                    }
                }));
                final ActivityResultLauncherHolder<I> activityResultLauncherHolder3 = activityResultLauncherHolder;
                return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        activityResultLauncherHolder3.unregister();
                    }
                };
            }
        }, composer, 520);
        composer.endReplaceableGroup();
        return managedActivityResultLauncher;
    }
}
