package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a.\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0000H\u0086\bø\u0001\u0000\u001a(\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0001\"#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "definitions", "debugInspectorInfo", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "wrapped", "inspectableWrapper", "NoInspectorInfo", "Lkj/l;", "getNoInspectorInfo", "()Lkj/l;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class InspectableValueKt {
    private static final kj.l<InspectorInfo, kotlin.j> NoInspectorInfo = new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void invoke(InspectorInfo inspectorInfo) {
            kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return kotlin.j.a;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final kj.l<InspectorInfo, kotlin.j> debugInspectorInfo(final kj.l<? super InspectorInfo, kotlin.j> lVar) {
        kotlin.jvm.internal.m.h(lVar, "definitions");
        return isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                lVar.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    public static final kj.l<InspectorInfo, kotlin.j> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final Modifier inspectable(Modifier modifier, kj.l<? super InspectorInfo, kotlin.j> lVar, kj.l<? super Modifier, ? extends Modifier> lVar2) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(lVar, "inspectorInfo");
        kotlin.jvm.internal.m.h(lVar2, "factory");
        return inspectableWrapper(modifier, lVar, (Modifier) lVar2.invoke(Modifier.INSTANCE));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, kj.l<? super InspectorInfo, kotlin.j> lVar, Modifier modifier2) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(lVar, "inspectorInfo");
        kotlin.jvm.internal.m.h(modifier2, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(lVar);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }
}
