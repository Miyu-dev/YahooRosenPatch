package androidx.compose.ui.platform;

import androidx.appcompat.R;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableValue;", "", "Luj/h;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Luj/h;", "inspectableElements", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface InspectableValue {

    /* JADX INFO: compiled from: InspectableValue.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static uj.h<ValueElement> getInspectableElements(InspectableValue inspectableValue) {
            return l.a(inspectableValue);
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return l.b(inspectableValue);
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return l.c(inspectableValue);
        }
    }

    uj.h<ValueElement> getInspectableElements();

    String getNameFallback();

    Object getValueOverride();
}
