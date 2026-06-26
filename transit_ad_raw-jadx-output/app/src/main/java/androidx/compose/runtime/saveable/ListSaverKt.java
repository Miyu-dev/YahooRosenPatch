package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: ListSaver.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aZ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¨\u0006\u000b"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "", "listSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(final p<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> pVar, l<? super List<? extends Saveable>, ? extends Original> lVar) {
        m.h(pVar, "save");
        m.h(lVar, "restore");
        p<SaverScope, Original, Object> pVar2 = new p<SaverScope, Original, Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt.listSaver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final Object invoke(SaverScope saverScope, Original original) {
                m.h(saverScope, "$this$Saver");
                List list = (List) pVar.invoke(saverScope, original);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = list.get(i2);
                    if (obj != null && !saverScope.canBeSaved(obj)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                List list2 = list;
                if (!list2.isEmpty()) {
                    return new ArrayList(list2);
                }
                return null;
            }
        };
        v.e(1, lVar);
        return SaverKt.Saver(pVar2, lVar);
    }
}
