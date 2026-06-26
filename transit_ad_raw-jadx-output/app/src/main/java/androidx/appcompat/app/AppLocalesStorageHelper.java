package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
class AppLocalesStorageHelper {
    static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final String LOCALE_RECORD_FILE_TAG = "locales";
    static final String TAG = "AppLocalesStorageHelper";

    public static class SerialExecutor implements Executor {
        Runnable mActive;
        final Executor mExecutor;
        private final Object mLock = new Object();
        final Queue<Runnable> mTasks = new ArrayDeque();

        public SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$execute$0(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.mLock) {
                this.mTasks.add(new Runnable() { // from class: androidx.appcompat.app.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f117a.lambda$execute$0(runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        public void scheduleNext() {
            synchronized (this.mLock) {
                Runnable runnablePoll = this.mTasks.poll();
                this.mActive = runnablePoll;
                if (runnablePoll != null) {
                    this.mExecutor.execute(runnablePoll);
                }
            }
        }
    }

    public static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void persistLocales(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull java.lang.String r9) {
        /*
            java.lang.String r0 = "locales"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : app-locales: "
            java.lang.String r3 = "Storing App Locales : Failed to persist app-locales: "
            java.lang.String r4 = ""
            boolean r4 = r9.equals(r4)
            java.lang.String r5 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r4 == 0) goto L17
            r8.deleteFile(r5)
            return
        L17:
            r4 = 0
            java.io.FileOutputStream r8 = r8.openFileOutput(r5, r4)     // Catch: java.io.FileNotFoundException -> L67
            org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
            r5 = 0
            r4.setOutput(r8, r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r6 = "UTF-8"
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.startDocument(r6, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.startTag(r5, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r6 = "application_locales"
            r4.attribute(r5, r6, r9)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.endTag(r5, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.endDocument()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.append(r9)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r2 = " persisted successfully."
            r0.append(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r8 == 0) goto L60
        L4f:
            r8.close()     // Catch: java.io.IOException -> L60
            goto L60
        L53:
            r9 = move-exception
            goto L61
        L55:
            r0 = move-exception
            java.lang.String r9 = r3.concat(r9)     // Catch: java.lang.Throwable -> L53
            android.util.Log.w(r1, r9, r0)     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L60
            goto L4f
        L60:
            return
        L61:
            if (r8 == 0) goto L66
            r8.close()     // Catch: java.io.IOException -> L66
        L66:
            throw r9
        L67:
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r5
            java.lang.String r9 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r8 = java.lang.String.format(r9, r8)
            android.util.Log.w(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppLocalesStorageHelper.persistLocales(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r2 = r4.getAttributeValue(null, androidx.appcompat.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043 A[EXC_TOP_SPLITTER, PHI: r2
  0x0043: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:24:0x004e, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readLocales(@androidx.annotation.NonNull android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L41
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r8 <= r5) goto L41
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L41:
            if (r3 == 0) goto L51
        L43:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L47:
            r9 = move-exception
            goto L65
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L51
            goto L43
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppLocalesStorageHelper.readLocales(android.content.Context):java.lang.String");
    }

    public static void syncLocalesToFramework(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AppCompatDelegate.getApplicationLocales().isEmpty()) {
                    String locales = readLocales(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(systemService, AppCompatDelegate.Api24Impl.localeListForLanguageTags(locales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
