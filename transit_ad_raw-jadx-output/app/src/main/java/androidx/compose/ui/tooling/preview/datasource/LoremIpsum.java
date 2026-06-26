package androidx.compose.ui.tooling.preview.datasource;

import a.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.List;
import kj.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import uj.c;
import uj.d;
import uj.h;
import uj.l;
import uj.s;
import uj.u;

/* JADX INFO: compiled from: LoremIpsum.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "", "words", "generateLoremIpsum", "I", "Luj/h;", "getValues", "()Luj/h;", "values", "<init>", "(I)V", "()V", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0})
public final class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i2) {
        this.words = i2;
    }

    private final String generateLoremIpsum(int words) {
        final Ref.IntRef intRef = new Ref.IntRef();
        final int size = LoremIpsumKt.LOREM_IPSUM_SOURCE.size();
        c cVarR = l.r(new a<String>() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum.generateLoremIpsum.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final String invoke() {
                List list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
                Ref.IntRef intRef2 = intRef;
                int i2 = intRef2.element;
                intRef2.element = i2 + 1;
                return (String) list.get(i2 % size);
            }
        });
        if (words >= 0) {
            return s.z(words == 0 ? d.a : cVarR instanceof c ? cVarR.b(words) : new u(cVarR, words), " ");
        }
        throw new IllegalArgumentException(b.e("Requested element count ", words, " is less than zero.").toString());
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* synthetic */ int getCount() {
        return i.a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public h<String> getValues() {
        return l.s(new String[]{generateLoremIpsum(this.words)});
    }

    public LoremIpsum() {
        this(500);
    }
}
