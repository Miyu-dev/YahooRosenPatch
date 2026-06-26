package androidx.compose.runtime;

import androidx.appcompat.widget.s;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kj.l;
import kj.q;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0080\u0001\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042.\u0010\b\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a@\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001aG\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ak\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\u0012\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u00102&\u0010\u0013\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a \u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\b\u0010\"\u001a\u00020\fH\u0007\u001a\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eH\u0007\u001a(\u0010$\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eH\u0007\u001a\b\u0010'\u001a\u00020\u0007H\u0007\u001a\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0016H\u0007\u001a\u0014\u0010,\u001a\u00020\u0007*\u00020)2\u0006\u0010+\u001a\u00020*H\u0000\u001aP\u00103\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000100j\b\u0012\u0004\u0012\u00028\u0001`10/j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000100j\b\u0012\u0004\u0012\u00028\u0001`1`2\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.H\u0002\u001aa\u00105\u001a\u00020\f\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001000/j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000100j\b\u0012\u0004\u0012\u00028\u0001`1`22\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0002¢\u0006\u0004\b5\u00106\u001ac\u00107\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001000/j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000100j\b\u0012\u0004\u0012\u00028\u0001`1`22\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0002¢\u0006\u0004\b7\u00108\u001a[\u00109\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001000/j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u000100j\b\u0012\u0004\u0012\u00028\u0001`1`22\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:\u001a(\u0010=\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u001a\u0010A\u001a\u00020 *\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020 H\u0002\u001a\u001a\u0010B\u001a\u00020 *\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020 H\u0002\u001a,\u0010F\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020 2\u0006\u0010D\u001a\u00020C2\b\u0010E\u001a\u0004\u0018\u00010\u0002H\u0002\u001a$\u0010I\u001a\u0004\u0018\u00010?*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 H\u0002\u001a\u001c\u0010J\u001a\u0004\u0018\u00010?*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020 H\u0002\u001a\"\u0010K\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 H\u0002\u001a(\u0010L\u001a\b\u0012\u0004\u0012\u00020?0>*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 H\u0002\u001a\f\u0010M\u001a\u00020 *\u00020\fH\u0002\u001a\f\u0010N\u001a\u00020\f*\u00020 H\u0002\u001a\u001c\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020R*\u00020O2\u0006\u0010Q\u001a\u00020PH\u0002\u001a\u001c\u0010W\u001a\u00020 *\u00020T2\u0006\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020 H\u0002\u001a$\u0010[\u001a\u00020 *\u00020T2\u0006\u0010X\u001a\u00020 2\u0006\u0010Y\u001a\u00020 2\u0006\u0010Z\u001a\u00020 H\u0002\u001a\"\u0010]\u001a\u00020\u00072\u0006\u00104\u001a\u00020\f2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0080\bø\u0001\u0000\u001a\u0010\u0010]\u001a\u00020\u00072\u0006\u00104\u001a\u00020\fH\u0000\u001a\u0010\u0010`\u001a\u00020_2\u0006\u0010^\u001a\u00020\u001eH\u0000\"\u001e\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bb\u0010c\u0012\u0004\bd\u0010e\"4\u0010i\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070fj\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j\"4\u0010k\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070fj\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010j\"4\u0010l\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070fj\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010j\"4\u0010m\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070fj\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010j\"4\u0010n\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070fj\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010j\"\u0014\u0010o\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010p\"\u0014\u0010q\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010p\"\u0014\u0010r\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\br\u0010p\"\u001a\u0010s\u001a\u00020 8\u0000X\u0081T¢\u0006\f\n\u0004\bs\u0010p\u0012\u0004\bt\u0010e\" \u0010u\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bu\u0010v\u0012\u0004\by\u0010e\u001a\u0004\bw\u0010x\"\u001a\u0010z\u001a\u00020 8\u0000X\u0081T¢\u0006\f\n\u0004\bz\u0010p\u0012\u0004\b{\u0010e\" \u0010|\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010v\u0012\u0004\b~\u0010e\u001a\u0004\b}\u0010x\"\u001b\u0010\u007f\u001a\u00020 8\u0000X\u0081T¢\u0006\r\n\u0004\b\u007f\u0010p\u0012\u0005\b\u0080\u0001\u0010e\"$\u0010\u0081\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010v\u0012\u0005\b\u0083\u0001\u0010e\u001a\u0005\b\u0082\u0001\u0010x\"\u001d\u0010\u0084\u0001\u001a\u00020 8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010p\u0012\u0005\b\u0085\u0001\u0010e\"$\u0010\u0086\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010v\u0012\u0005\b\u0088\u0001\u0010e\u001a\u0005\b\u0087\u0001\u0010x\"\u001d\u0010\u0089\u0001\u001a\u00020 8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010p\u0012\u0005\b\u008a\u0001\u0010e\"$\u0010\u008b\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010v\u0012\u0005\b\u008d\u0001\u0010e\u001a\u0005\b\u008c\u0001\u0010x\"\u001d\u0010\u008e\u0001\u001a\u00020 8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010p\u0012\u0005\b\u008f\u0001\u0010e\"$\u0010\u0090\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010v\u0012\u0005\b\u0092\u0001\u0010e\u001a\u0005\b\u0091\u0001\u0010x\"\u001d\u0010\u0093\u0001\u001a\u00020 8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010p\u0012\u0005\b\u0094\u0001\u0010e\"\u0016\u0010\u0095\u0001\u001a\u00020 8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010p\"\u001c\u0010\u0099\u0001\u001a\u00020\u0002*\u00030\u0096\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001*E\b\u0000\u0010\u009a\u0001\"\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070f2\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030g\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070f*E\b\u0000\u0010\u009b\u0001\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009c\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "Lkotlin/Function1;", "", "Lkotlin/j;", "mutator", "mutate", "T", "key", "", "contains", "getValueOf", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "parentScope", "compositionLocalMapOf", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/Composer;", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", "cache", "(Landroidx/compose/runtime/Composer;ZLkj/a;)Ljava/lang/Object;", "composer", "", "sourceInformation", "", "sourceInformationMarkerStart", "isTraceInProgress", "info", "traceEventStart", "dirty1", "dirty2", "traceEventEnd", "sourceInformationMarkerEnd", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "K", "V", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "multiMap", "value", "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/j;", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "left", "right", "getKey", "", "Landroidx/compose/runtime/Invalidation;", "location", "findLocation", "findInsertLocation", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "insertIfMissing", "start", "end", "firstInRange", "removeLocation", "removeRange", "filterToRange", "asInt", "asBool", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "", "collectNodesFrom", "Landroidx/compose/runtime/SlotReader;", "index", "root", "distanceFrom", "a", "b", "common", "nearestCommonRootOf", "lazyMessage", "runtimeCheck", "message", "", "composeRuntimeError", "Landroidx/compose/runtime/CompositionTracer;", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "()V", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/Change;", "removeCurrentGroupInstance", "Lkj/q;", "skipToGroupEndInstance", "endGroupInstance", "startRootGroup", "resetSlotsInstance", "rootKey", "I", "nodeKey", "defaultsKey", "invocationKey", "getInvocationKey$annotations", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", "reference", "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "invalidGroupLocation", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "Change", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final q<Applier<?>, SlotWriter, RememberManager, j> removeCurrentGroupInstance = new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerKt$removeCurrentGroupInstance$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
            return j.a;
        }

        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            m.h(applier, "<anonymous parameter 0>");
            m.h(slotWriter, "slots");
            m.h(rememberManager, "rememberManager");
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    };
    private static final q<Applier<?>, SlotWriter, RememberManager, j> skipToGroupEndInstance = new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerKt$skipToGroupEndInstance$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
            return j.a;
        }

        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            m.h(applier, "<anonymous parameter 0>");
            m.h(slotWriter, "slots");
            m.h(rememberManager, "<anonymous parameter 2>");
            slotWriter.skipToGroupEnd();
        }
    };
    private static final q<Applier<?>, SlotWriter, RememberManager, j> endGroupInstance = new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerKt$endGroupInstance$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
            return j.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
            m.h(applier, "<anonymous parameter 0>");
            m.h(slotWriter, "slots");
            m.h(rememberManager, "<anonymous parameter 2>");
            slotWriter.endGroup();
        }
    };
    private static final q<Applier<?>, SlotWriter, RememberManager, j> startRootGroup = new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerKt$startRootGroup$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
            return j.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
            m.h(applier, "<anonymous parameter 0>");
            m.h(slotWriter, "slots");
            m.h(rememberManager, "<anonymous parameter 2>");
            slotWriter.ensureStarted(0);
        }
    };
    private static final q<Applier<?>, SlotWriter, RememberManager, j> resetSlotsInstance = new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerKt$resetSlotsInstance$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
            return j.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
            m.h(applier, "<anonymous parameter 0>");
            m.h(slotWriter, "slots");
            m.h(rememberManager, "<anonymous parameter 2>");
            slotWriter.reset();
        }
    };
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i2) {
        return i2 != 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z, kj.a<? extends T> aVar) {
        m.h(composer, "<this>");
        m.h(aVar, "block");
        T t = (T) composer.rememberedValue();
        if (!z && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T t2 = (T) aVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            j jVar = j.a;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i2) {
        if (slotReader.isNode(i2)) {
            list.add(slotReader.node(i2));
            return;
        }
        int iGroupSize = i2 + 1;
        int iGroupSize2 = slotReader.groupSize(i2) + i2;
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final Void composeRuntimeError(String str) {
        m.h(str, "message");
        throw new ComposeRuntimeError(android.support.v4.media.a.e("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i2) {
        composer.startReplaceableGroup(721128344);
        if (isTraceInProgress()) {
            traceEventStart(721128344, i2, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        PersistentMap.Builder builder = ExtensionsKt.persistentHashMapOf().builder();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            composer.startReplaceableGroup(680853375);
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
                m.f(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(compositionLocal, providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 8));
            }
            composer.endReplaceableGroup();
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapBuild = builder.build();
        if (isTraceInProgress()) {
            traceEventEnd();
        }
        composer.endReplaceableGroup();
        return persistentMapBuild;
    }

    public static final <T> boolean contains(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, CompositionLocal<T> compositionLocal) {
        m.h(persistentMap, "<this>");
        m.h(compositionLocal, "key");
        return persistentMap.containsKey(compositionLocal);
    }

    private static final int distanceFrom(SlotReader slotReader, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = slotReader.parent(i2);
            i4++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i2); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i3) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i2) {
        int iFindLocation = findLocation(list, i2);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iJ = m.j(list.get(i4).getLocation(), i2);
            if (iJ < 0) {
                i3 = i4 + 1;
            } else {
                if (iJ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i2, int i3) {
        int iFindInsertLocation = findInsertLocation(list, i2);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i3) {
            return invalidation;
        }
        return null;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getInvocation() {
        return invocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!m.c(joinedKey.getLeft(), obj2) || !m.c(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final <T> T getValueOf(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, CompositionLocal<T> compositionLocal) {
        m.h(persistentMap, "<this>");
        m.h(compositionLocal, "key");
        State<? extends Object> state = persistentMap.get(compositionLocal);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i2, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i2);
        IdentityArraySet identityArraySet = null;
        if (iFindLocation < 0) {
            int i3 = -(iFindLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i3, new Invalidation(recomposeScopeImpl, i2, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(iFindLocation).setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = list.get(iFindLocation).getInstances();
        if (instances != null) {
            instances.add(obj);
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, l<? super Map<CompositionLocal<Object>, State<Object>>, j> lVar) {
        m.h(persistentMap, "<this>");
        m.h(lVar, "mutator");
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        lVar.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i2, int i3, int i4) {
        if (i2 == i3) {
            return i2;
        }
        if (i2 == i4 || i3 == i4) {
            return i4;
        }
        if (slotReader.parent(i2) == i3) {
            return i3;
        }
        if (slotReader.parent(i3) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == slotReader.parent(i3)) {
            return slotReader.parent(i2);
        }
        int iDistanceFrom = distanceFrom(slotReader, i2, i4);
        int iDistanceFrom2 = distanceFrom(slotReader, i3, i4);
        int i5 = iDistanceFrom - iDistanceFrom2;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = slotReader.parent(i2);
        }
        int i7 = iDistanceFrom2 - iDistanceFrom;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = slotReader.parent(i3);
        }
        while (i2 != i3) {
            i2 = slotReader.parent(i2);
            i3 = slotReader.parent(i3);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> map, K k) {
        V v;
        LinkedHashSet<V> linkedHashSet = map.get(k);
        if (linkedHashSet == null || (v = (V) y.s1(linkedHashSet)) == null) {
            return null;
        }
        remove(map, k, v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> map, K k, V v) {
        LinkedHashSet<V> linkedHashSet = map.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> j remove(HashMap<K, LinkedHashSet<V>> map, K k, V v) {
        LinkedHashSet<V> linkedHashSet = map.get(k);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            map.remove(k);
        }
        return j.a;
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl composition;
        m.h(slotWriter, "<this>");
        m.h(rememberManager, "rememberManager");
        Iterator<Object> itGroupSlots = slotWriter.groupSlots();
        while (itGroupSlots.hasNext()) {
            Object next = itGroupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            }
            if ((next instanceof RecomposeScopeImpl) && (composition = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.release();
            }
        }
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i2) {
        int iFindLocation = findLocation(list, i2);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i2, int i3) {
        int iFindInsertLocation = findInsertLocation(list, i2);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i3) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (!z) {
            throw s.k("Check failed");
        }
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        m.h(composer, "composer");
        m.h(str, "sourceInformation");
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        m.h(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i2, String str) {
        m.h(composer, "composer");
        m.h(str, "sourceInformation");
        composer.sourceInformationMarkerStart(i2, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final /* synthetic */ void traceEventStart(int i2, String str) {
        m.h(str, "info");
        traceEventStart(i2, -1, -1, str);
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i2, int i3, int i4, String str) {
        m.h(str, "info");
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i2, i3, i4, str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void runtimeCheck(boolean z, kj.a<? extends Object> aVar) throws KotlinNothingValueException {
        m.h(aVar, "lazyMessage");
        if (z) {
            return;
        }
        composeRuntimeError(aVar.invoke().toString());
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }
}
