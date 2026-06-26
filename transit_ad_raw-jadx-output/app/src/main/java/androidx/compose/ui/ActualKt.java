package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import bk.f;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Actual.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¨\u0006\n"}, d2 = {"", "a", "b", "", "areObjectsOfSameType", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/node/ModifierNodeElement;", "element", "Lkotlin/j;", "tryPopulateReflectively", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ActualKt {
    public static final boolean areObjectsOfSameType(Object obj, Object obj2) {
        m.h(obj, "a");
        m.h(obj2, "b");
        return obj.getClass() == obj2.getClass();
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> modifierNodeElement) {
        m.h(inspectorInfo, "<this>");
        m.h(modifierNodeElement, "element");
        Field[] declaredFields = modifierNodeElement.getClass().getDeclaredFields();
        m.g(declaredFields, "element.javaClass.declaredFields");
        List listR0 = p.R0(new Comparator() { // from class: androidx.compose.ui.ActualKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return f.d(((Field) t).getName(), ((Field) t2).getName());
            }
        }, declaredFields);
        int size = listR0.size();
        for (int i2 = 0; i2 < size; i2++) {
            Field field = (Field) listR0.get(i2);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    ValueElementSequence properties = inspectorInfo.getProperties();
                    String name = field.getName();
                    m.g(name, "field.name");
                    properties.set(name, field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
