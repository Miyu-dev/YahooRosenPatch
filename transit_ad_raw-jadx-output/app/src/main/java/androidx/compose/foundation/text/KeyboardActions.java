package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0097\u0001\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Lkotlin/j;", "onDone", "Lkj/l;", "getOnDone", "()Lkj/l;", "onGo", "getOnGo", "onNext", "getOnNext", "onPrevious", "getOnPrevious", "onSearch", "getOnSearch", "onSend", "getOnSend", "<init>", "(Lkj/l;Lkj/l;Lkj/l;Lkj/l;Lkj/l;Lkj/l;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class KeyboardActions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final l<KeyboardActionScope, j> onDone;
    private final l<KeyboardActionScope, j> onGo;
    private final l<KeyboardActionScope, j> onNext;
    private final l<KeyboardActionScope, j> onPrevious;
    private final l<KeyboardActionScope, j> onSearch;
    private final l<KeyboardActionScope, j> onSend;

    /* JADX INFO: compiled from: KeyboardActions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardActions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) other;
        return m.c(this.onDone, keyboardActions.onDone) && m.c(this.onGo, keyboardActions.onGo) && m.c(this.onNext, keyboardActions.onNext) && m.c(this.onPrevious, keyboardActions.onPrevious) && m.c(this.onSearch, keyboardActions.onSearch) && m.c(this.onSend, keyboardActions.onSend);
    }

    public final l<KeyboardActionScope, j> getOnDone() {
        return this.onDone;
    }

    public final l<KeyboardActionScope, j> getOnGo() {
        return this.onGo;
    }

    public final l<KeyboardActionScope, j> getOnNext() {
        return this.onNext;
    }

    public final l<KeyboardActionScope, j> getOnPrevious() {
        return this.onPrevious;
    }

    public final l<KeyboardActionScope, j> getOnSearch() {
        return this.onSearch;
    }

    public final l<KeyboardActionScope, j> getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        l<KeyboardActionScope, j> lVar = this.onDone;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<KeyboardActionScope, j> lVar2 = this.onGo;
        int iHashCode2 = (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<KeyboardActionScope, j> lVar3 = this.onNext;
        int iHashCode3 = (iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<KeyboardActionScope, j> lVar4 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        l<KeyboardActionScope, j> lVar5 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        l<KeyboardActionScope, j> lVar6 = this.onSend;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(l<? super KeyboardActionScope, j> lVar, l<? super KeyboardActionScope, j> lVar2, l<? super KeyboardActionScope, j> lVar3, l<? super KeyboardActionScope, j> lVar4, l<? super KeyboardActionScope, j> lVar5, l<? super KeyboardActionScope, j> lVar6) {
        this.onDone = lVar;
        this.onGo = lVar2;
        this.onNext = lVar3;
        this.onPrevious = lVar4;
        this.onSearch = lVar5;
        this.onSend = lVar6;
    }

    public /* synthetic */ KeyboardActions(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : lVar, (i2 & 2) != 0 ? null : lVar2, (i2 & 4) != 0 ? null : lVar3, (i2 & 8) != 0 ? null : lVar4, (i2 & 16) != 0 ? null : lVar5, (i2 & 32) != 0 ? null : lVar6);
    }
}
