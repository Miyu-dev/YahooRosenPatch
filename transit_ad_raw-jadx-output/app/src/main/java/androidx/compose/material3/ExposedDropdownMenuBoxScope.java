package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kj.q;
import kotlin.Metadata;
import kotlin.j;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H&J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&JH\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "menuAnchor", "", "matchTextFieldWidth", "exposedDropdownSize", "expanded", "Lkotlin/Function0;", "Lkotlin/j;", "onDismissRequest", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenu", "(ZLkj/a;Landroidx/compose/ui/Modifier;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public interface ExposedDropdownMenuBoxScope {

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public final /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @androidx.compose.runtime.Composable
        @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void a(final androidx.compose.material3.ExposedDropdownMenuBoxScope r23, final boolean r24, final kj.a r25, androidx.compose.ui.Modifier r26, final kj.q r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
            /*
                Method dump skipped, instruction units count: 449
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.CC.a(androidx.compose.material3.ExposedDropdownMenuBoxScope, boolean, kj.a, androidx.compose.ui.Modifier, kj.q, androidx.compose.runtime.Composer, int, int):void");
        }

        public static /* synthetic */ Modifier b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i2 & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z, kj.a<j> aVar, Modifier modifier, q<? super ColumnScope, ? super Composer, ? super Integer, j> qVar, Composer composer, int i2, int i3);

    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    Modifier menuAnchor(Modifier modifier);
}
