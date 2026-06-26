package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ArchTaskExecutor extends TaskExecutor {

    @NonNull
    private static final Executor sIOThreadExecutor;
    private static volatile ArchTaskExecutor sInstance;

    @NonNull
    private static final Executor sMainThreadExecutor;

    @NonNull
    private final TaskExecutor mDefaultTaskExecutor;

    @NonNull
    private TaskExecutor mDelegate;

    static {
        final int i2 = 0;
        sMainThreadExecutor = new Executor() { // from class: androidx.arch.core.executor.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                switch (i2) {
                    case 0:
                        ArchTaskExecutor.lambda$static$0(runnable);
                        break;
                    case 1:
                        runnable.run();
                        break;
                    case 2:
                        runnable.run();
                        break;
                    case 3:
                        runnable.run();
                        break;
                    default:
                        runnable.run();
                        break;
                }
            }
        };
        sIOThreadExecutor = new Executor() { // from class: androidx.arch.core.executor.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                switch (i2) {
                    case 0:
                        ArchTaskExecutor.lambda$static$1(runnable);
                        break;
                    default:
                        runnable.run();
                        break;
                }
            }
        };
    }

    private ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.mDefaultTaskExecutor = defaultTaskExecutor;
        this.mDelegate = defaultTaskExecutor;
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
        return sIOThreadExecutor;
    }

    @NonNull
    public static ArchTaskExecutor getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (ArchTaskExecutor.class) {
            if (sInstance == null) {
                sInstance = new ArchTaskExecutor();
            }
        }
        return sInstance;
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
        return sMainThreadExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
        getInstance().postToMainThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Runnable runnable) {
        getInstance().executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable) {
        this.mDelegate.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.mDelegate.isMainThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable) {
        this.mDelegate.postToMainThread(runnable);
    }

    public void setDelegate(@Nullable TaskExecutor taskExecutor) {
        if (taskExecutor == null) {
            taskExecutor = this.mDefaultTaskExecutor;
        }
        this.mDelegate = taskExecutor;
    }
}
