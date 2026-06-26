package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"max", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class Float16Kt {
    /* JADX INFO: renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m2959maxAoSsdG0(short s, short s2) {
        return (Float16.m2932isNaNimpl(s) || Float16.m2932isNaNimpl(s2)) ? Float16.INSTANCE.m2954getNaNslo4al4() : Float16.m2919compareTo41bOqos(s, s2) >= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m2960minAoSsdG0(short s, short s2) {
        return (Float16.m2932isNaNimpl(s) || Float16.m2932isNaNimpl(s2)) ? Float16.INSTANCE.m2954getNaNslo4al4() : Float16.m2919compareTo41bOqos(s, s2) <= 0 ? s : s2;
    }
}
