package androidx.compose.runtime;

import dj.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001aC\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0012\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Ldj/c;", "", "block", "withRunningRecomposer", "(Lkj/q;Ldj/c;)Ljava/lang/Object;", "K", "V", "", "", "key", "value", "", "addMultiValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "RecomposerCompoundHashKey", "I", "ProduceAnotherFrame", "Ljava/lang/Object;", "FramePending", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_editTextBackground, androidx.appcompat.R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2<R> extends SuspendLambda implements p<CoroutineScope, dj.c<? super R>, Object> {
        final /* synthetic */ q<CoroutineScope, Recomposer, dj.c<? super R>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ Recomposer $recomposer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Recomposer recomposer, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$recomposer = recomposer;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new AnonymousClass1(this.$recomposer, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    Recomposer recomposer = this.$recomposer;
                    this.label = 1;
                    if (recomposer.runRecomposeAndApplyChanges(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                }
                return j.a;
            }

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(q<? super CoroutineScope, ? super Recomposer, ? super dj.c<? super R>, ? extends Object> qVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = qVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invokeSuspend(Object obj) {
            Recomposer recomposer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                recomposer = new Recomposer(coroutineScope.getCoroutineContext());
                BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(recomposer, null), 3, (Object) null);
                q<CoroutineScope, Recomposer, dj.c<? super R>, Object> qVar = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = qVar.invoke(coroutineScope, recomposer, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.L$0;
                    li.c.O(obj);
                    return obj2;
                }
                recomposer = (Recomposer) this.L$0;
                li.c.O(obj);
            }
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == coroutineSingletons ? coroutineSingletons : obj;
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super R> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    public static final <K, V> boolean addMultiValue(Map<K, List<V>> map, K k, V v) {
        m.h(map, "<this>");
        List<V> arrayList = map.get(k);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k, arrayList);
        }
        return arrayList.add(v);
    }

    public static final <K, V> V removeLastMultiValue(Map<K, List<V>> map, K k) {
        m.h(map, "<this>");
        List<V> list = map.get(k);
        if (list == null) {
            return null;
        }
        V v = (V) u.g1(list);
        if (!list.isEmpty()) {
            return v;
        }
        map.remove(k);
        return v;
    }

    public static final <R> Object withRunningRecomposer(q<? super CoroutineScope, ? super Recomposer, ? super dj.c<? super R>, ? extends Object> qVar, dj.c<? super R> cVar) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(qVar, null), cVar);
    }
}
