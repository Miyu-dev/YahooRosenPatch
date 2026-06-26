package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ProgressSemantics.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Lqj/b;", "valueRange", "", "steps", "progressSemantics", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class ProgressSemanticsKt {
    @Stable
    public static final Modifier progressSemantics(Modifier modifier, final float f, final qj.b<Float> bVar, final int i2) {
        m.h(modifier, "<this>");
        m.h(bVar, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) a.l.k(Float.valueOf(f), bVar)).floatValue(), bVar, i2));
            }
        });
    }

    public static Modifier progressSemantics$default(Modifier modifier, float f, qj.b bVar, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bVar = new qj.a(0.0f, 1.0f);
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return progressSemantics(modifier, f, bVar, i2);
    }

    @Stable
    public static final Modifier progressSemantics(Modifier modifier) {
        m.h(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.INSTANCE.getIndeterminate());
            }
        });
    }
}
