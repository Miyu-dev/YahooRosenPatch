package androidx.compose.runtime.internal;

import a.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kj.x;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\r\"\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "Lkotlin/j;", "trackWrite", "Landroidx/compose/runtime/Composer;", "composer", "trackRead", "", "params", "realParamCount", "", "block", "update", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "key", "I", "getKey", "()I", "", "tracked", "Z", "arity", "getArity", "_block", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "", "scopes", "Ljava/util/List;", "<init>", "(IZI)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i2, boolean z, int i3) {
        this.key = i2;
        this.tracked = z;
        this.arity = i3;
    }

    private final int realParamCount(int params) {
        int i2 = (params - 1) - 1;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (ComposableLambdaKt.replacableWith(list.get(i2), recomposeScope)) {
                list.set(i2, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN
    public Object invoke(final Object... args) {
        m.h(args, "args");
        final int iRealParamCount = realParamCount(args.length);
        Object obj = args[iRealParamCount];
        m.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = p.Q0(args, l.C(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        m.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        m.f(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        m.l lVar = new m.l(2);
        lVar.b(array);
        lVar.a(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((x) obj3).invoke(lVar.e(new Object[lVar.c()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kj.p<Composer, Integer, j>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((Composer) obj4, ((Number) obj5).intValue());
                    return j.a;
                }

                public final void invoke(Composer composer, int i2) {
                    m.h(composer, "nc");
                    Object[] array2 = p.Q0(args, l.C(0, iRealParamCount)).toArray(new Object[0]);
                    Object obj4 = args[iRealParamCount + 1];
                    m.f(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Object[] objArr = args;
                    Object[] array3 = p.Q0(objArr, l.C(iRealParamCount + 2, objArr.length)).toArray(new Object[0]);
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    m.l lVar2 = new m.l(4);
                    lVar2.b(array2);
                    lVar2.a(composer);
                    lVar2.a(Integer.valueOf(iIntValue2 | 1));
                    lVar2.b(array3);
                    composableLambdaNImpl.invoke(lVar2.e(new Object[lVar2.c()]));
                }
            });
        }
        return objInvoke;
    }

    public final void update(Object obj) {
        m.h(obj, "block");
        if (m.c(obj, this._block)) {
            return;
        }
        boolean z = this._block == null;
        this._block = (x) obj;
        if (z) {
            return;
        }
        trackWrite();
    }
}
