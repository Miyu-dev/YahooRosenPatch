package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aT\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\r\u001a^\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u000f\u001ah\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u0011\u001ab\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u0014\u001a\u0012\u0010\u0017\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lkj/l;Lkj/q;)Landroidx/compose/ui/Modifier;", "", "fullyQualifiedName", "", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lkj/l;Lkj/q;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lkj/l;Lkj/q;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkj/l;Lkj/q;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lkj/l;Lkj/q;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materialize", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier, l<? super InspectorInfo, j> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "inspectorInfo");
        m.h(qVar, "factory");
        return modifier.then(new ComposedModifier(lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, l lVar, q qVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, lVar, qVar);
    }

    public static final Modifier materialize(final Composer composer, Modifier modifier) {
        m.h(composer, "<this>");
        m.h(modifier, "modifier");
        if (modifier.all(new l<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt.materialize.1
            public final Boolean invoke(Modifier.Element element) {
                m.h(element, "it");
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.INSTANCE, new p<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                m.h(modifier3, "acc");
                m.h(element, "element");
                boolean z = element instanceof ComposedModifier;
                Modifier modifierMaterialize = element;
                if (z) {
                    q<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
                    m.f(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    v.e(3, factory);
                    modifierMaterialize = ComposedModifierKt.materialize(composer, (Modifier) factory.invoke(Modifier.INSTANCE, composer, 0));
                }
                return modifier3.then(modifierMaterialize);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, l<? super InspectorInfo, j> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        m.h(modifier, "<this>");
        m.h(str, "fullyQualifiedName");
        m.h(lVar, "inspectorInfo");
        m.h(qVar, "factory");
        return modifier.then(new KeyedComposedModifier1(str, obj, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, l lVar, q qVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (l<? super InspectorInfo, j>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, l<? super InspectorInfo, j> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        m.h(modifier, "<this>");
        m.h(str, "fullyQualifiedName");
        m.h(lVar, "inspectorInfo");
        m.h(qVar, "factory");
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, l lVar, q qVar, int i2, Object obj3) {
        if ((i2 & 8) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, lVar, qVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, l<? super InspectorInfo, j> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        m.h(modifier, "<this>");
        m.h(str, "fullyQualifiedName");
        m.h(lVar, "inspectorInfo");
        m.h(qVar, "factory");
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, l lVar, q qVar, int i2, Object obj4) {
        if ((i2 & 16) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, lVar, qVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, l<? super InspectorInfo, j> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        m.h(modifier, "<this>");
        m.h(str, "fullyQualifiedName");
        m.h(objArr, "keys");
        m.h(lVar, "inspectorInfo");
        m.h(qVar, "factory");
        return modifier.then(new KeyedComposedModifierN(str, objArr, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, l lVar, q qVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (l<? super InspectorInfo, j>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }
}
