package androidx.compose.runtime;

import androidx.appcompat.widget.s;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dj.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kj.l;
import kj.p;
import kj.q;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.n;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0082\u0003\u0083\u0003B¯\u0001\u0012\f\u0010û\u0001\u001a\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0007\u0010ÿ\u0001\u001a\u00020G\u0012\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002\u0012\u000f\u0010\u0086\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u0002\u00123\u0010\u0088\u0002\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010¹\u0001\u00123\u0010\u008a\u0002\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010¹\u0001\u0012\b\u0010\u008b\u0002\u001a\u00030Å\u0001¢\u0006\u0006\b\u0080\u0003\u0010\u0081\u0003J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0017J\b\u0010\u0007\u001a\u00020\u0004H\u0017J\b\u0010\b\u001a\u00020\u0004H\u0017J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\b\u0010\f\u001a\u00020\u0004H\u0017J\u000f\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u001c\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\u001a\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H\u0016J=\u0010)\u001a\u00020\u0004\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010\u00192\u0006\u0010&\u001a\u00028\u00002\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040'H\u0016¢\u0006\u0004\b)\u0010*J\u001c\u0010-\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010\tH\u0017J\n\u0010.\u001a\u0004\u0018\u00010\tH\u0001J\u0012\u0010/\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\tH\u0017J\u0012\u00100\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\tH\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u000201H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u000202H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u000203H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u000204H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u000205H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u000206H\u0017J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0002H\u0017J/\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0006\u00107\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\tH\u0001J\u0012\u0010;\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\tH\u0001J\u0016\u0010=\u001a\u00020\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016J#\u0010A\u001a\u00020\u00042\u0012\u0010@\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030?0>H\u0017¢\u0006\u0004\bA\u0010BJ\b\u0010C\u001a\u00020\u0004H\u0017J#\u0010E\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000DH\u0017¢\u0006\u0004\bE\u0010FJ\b\u0010H\u001a\u00020GH\u0016J!\u0010N\u001a\u00020\u00132\u0006\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\bL\u0010MJ\u000f\u0010Q\u001a\u00020\u0002H\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020\u0004H\u0017J\b\u0010S\u001a\u00020\u0004H\u0017J\u0010\u0010T\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0013H\u0017J\u0010\u0010U\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\n\u0010W\u001a\u0004\u0018\u00010VH\u0017J\u001e\u0010Z\u001a\u00020\u00042\n\u0010&\u001a\u0006\u0012\u0002\b\u00030X2\b\u0010Y\u001a\u0004\u0018\u00010\tH\u0017J$\u0010_\u001a\u00020\u00042\u001a\u0010^\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020]\u0012\u0006\u0012\u0004\u0018\u00010]0\\0[H\u0017J\u0010\u0010a\u001a\u00020\u00042\u0006\u0010a\u001a\u00020`H\u0017J\u0018\u0010b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`H\u0017J\b\u0010c\u001a\u00020\u0004H\u0017J\b\u0010d\u001a\u00020\u0004H\u0016J>\u0010l\u001a\u00020\u00042\u001a\u0010g\u001a\u0016\u0012\u0004\u0012\u00020I\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010f0e2\u0011\u0010i\u001a\r\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0002\bhH\u0000¢\u0006\u0004\bj\u0010kJ\u001d\u0010o\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0000¢\u0006\u0004\bm\u0010nJ+\u0010r\u001a\u00020\u00132\u001a\u0010g\u001a\u0016\u0012\u0004\u0012\u00020I\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010f0eH\u0000¢\u0006\u0004\bp\u0010qJ\u000f\u0010t\u001a\u00020\u0004H\u0000¢\u0006\u0004\bs\u0010\u000eJ\n\u0010u\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010v\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010x\u001a\u00020\u00042\u0006\u0010J\u001a\u00020wH\u0016J\b\u0010y\u001a\u00020\u0004H\u0002J\b\u0010z\u001a\u00020\u0004H\u0002J\b\u0010{\u001a\u00020\u0004H\u0002J\u0010\u0010|\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010|\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010}\u001a\u00020\u0004H\u0002J\b\u0010~\u001a\u00020\u0004H\u0002J+\u0010\u0082\u0001\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u0001H\u0002J4\u0010\u0082\u0001\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0002H\u0002J\u0081\u0001\u0010\u0086\u0001\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u00012)\u0010\u0084\u0001\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u00012)\u0010\u0085\u0001\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u0001H\u0002JP\u0010\u0087\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000D2(\u0010J\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020\u0004H\u0002J\t\u0010\u008a\u0001\u001a\u00020\u0004H\u0002J\u001d\u0010\u008d\u0001\u001a\u00020\u00042\u0007\u0010\u008b\u0001\u001a\u00020\u00132\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\tH\u0002J@\u0010\u0093\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\t2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\u00042\u0007\u0010\u008b\u0001\u001a\u00020\u00132\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0002J\u001b\u0010\u0099\u0001\u001a\u00020\u00042\u0007\u0010\u0097\u0001\u001a\u00020\u00022\u0007\u0010\u0098\u0001\u001a\u00020\u0013H\u0002J\u0012\u0010\u009a\u0001\u001a\u00020\u00042\u0007\u0010\u008b\u0001\u001a\u00020\u0013H\u0002J\t\u0010\u009b\u0001\u001a\u00020\u0004H\u0002J\u0012\u0010\u009d\u0001\u001a\u00020\u00022\u0007\u0010\u009c\u0001\u001a\u00020\u0002H\u0002J\u001b\u0010\u009f\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u0007\u0010\u009e\u0001\u001a\u00020\u0002H\u0002J-\u0010£\u0001\u001a\u00020\u00022\u0007\u0010 \u0001\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u0007\u0010¡\u0001\u001a\u00020\u00022\u0007\u0010¢\u0001\u001a\u00020\u0002H\u0002J\u0012\u0010¤\u0001\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u0002H\u0002J\u001b\u0010¦\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u0002H\u0002J\t\u0010§\u0001\u001a\u00020\u0004H\u0002J$\u0010«\u0001\u001a\u00020\u00042\u0007\u0010¨\u0001\u001a\u00020\u00022\u0007\u0010©\u0001\u001a\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020\u0002H\u0002J\u001b\u0010\u00ad\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u0007\u0010¬\u0001\u001a\u00020\u0002H\u0002J$\u0010¯\u0001\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u0007\u0010¡\u0001\u001a\u00020\u00022\u0007\u0010®\u0001\u001a\u00020\u0002H\u0002J\u0017\u0010±\u0001\u001a\u00020\u0002*\u00030°\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0002H\u0002J\t\u0010²\u0001\u001a\u00020\u0004H\u0002J\t\u0010³\u0001\u001a\u00020\u0004H\u0002JW\u0010¶\u0001\u001a\u00020\u00042\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0X2)\u0010´\u0001\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u00012\b\u0010Y\u001a\u0004\u0018\u00010\t2\u0007\u0010µ\u0001\u001a\u00020\u0013H\u0002J%\u0010·\u0001\u001a\u00020\u00042\u001a\u0010^\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020]\u0012\u0006\u0012\u0004\u0018\u00010]0\\0[H\u0002J]\u0010À\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010¸\u000123\u0010¿\u0001\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010¹\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0082\b¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J2\u0010Ã\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010¸\u00012\b\u0010Â\u0001\u001a\u00030°\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0082\b¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001Ju\u0010É\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010¸\u00012\f\b\u0002\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00012\f\b\u0002\u0010Ç\u0001\u001a\u0005\u0018\u00010Å\u00012\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00022#\b\u0002\u0010È\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020I\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010f0\\0[2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JB\u0010Ë\u0001\u001a\u00020\u00042\u001a\u0010g\u001a\u0016\u0012\u0004\u0012\u00020I\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010f0e2\u0013\u0010i\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a¢\u0006\u0002\bhH\u0002¢\u0006\u0005\bË\u0001\u0010kJ\u0019\u0010Ì\u0001\u001a\u0004\u0018\u00010\t*\u00030°\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u0002H\u0002J\t\u0010Í\u0001\u001a\u00020\u0004H\u0002J\t\u0010Î\u0001\u001a\u00020\u0004H\u0002J7\u0010Ð\u0001\u001a\u00020\u00042,\u0010Ï\u0001\u001a'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001H\u0002J7\u0010Ñ\u0001\u001a\u00020\u00042,\u0010Ï\u0001\u001a'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001H\u0002J7\u0010Ò\u0001\u001a\u00020\u00042,\u0010Ï\u0001\u001a'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001H\u0002JB\u0010Ô\u0001\u001a\u00020\u00042\t\b\u0002\u0010Ó\u0001\u001a\u00020\u00132,\u0010Ï\u0001\u001a'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001H\u0002J\t\u0010Õ\u0001\u001a\u00020\u0004H\u0002J#\u0010×\u0001\u001a\u00020\u00042\u000f\u0010Ö\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0>H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\t\u0010×\u0001\u001a\u00020\u0004H\u0002J\u0014\u0010Ú\u0001\u001a\u00020\u00042\t\u0010Ù\u0001\u001a\u0004\u0018\u00010\tH\u0002J\t\u0010Û\u0001\u001a\u00020\u0004H\u0002J\u0014\u0010Ü\u0001\u001a\u00020\u00042\t\b\u0002\u0010Ó\u0001\u001a\u00020\u0013H\u0002J\u0013\u0010ß\u0001\u001a\u00020\u00042\b\u0010Þ\u0001\u001a\u00030Ý\u0001H\u0002J7\u0010à\u0001\u001a\u00020\u00042,\u0010Ï\u0001\u001a'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001H\u0002J7\u0010á\u0001\u001a\u00020\u00042,\u0010Ï\u0001\u001a'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001H\u0002J\t\u0010â\u0001\u001a\u00020\u0004H\u0002J\t\u0010ã\u0001\u001a\u00020\u0004H\u0002J\u0012\u0010å\u0001\u001a\u00020\u00042\u0007\u0010ä\u0001\u001a\u00020\u0002H\u0002J\u001c\u0010è\u0001\u001a\u00020\u00042\u0007\u0010æ\u0001\u001a\u00020]2\b\u0010ç\u0001\u001a\u00030¼\u0001H\u0002J\t\u0010é\u0001\u001a\u00020\u0004H\u0002J\u0012\u0010ë\u0001\u001a\u00020\u00042\u0007\u0010ê\u0001\u001a\u00020\u0002H\u0002J\t\u0010ì\u0001\u001a\u00020\u0004H\u0002J\t\u0010í\u0001\u001a\u00020\u0004H\u0002J\t\u0010î\u0001\u001a\u00020\u0004H\u0002J\t\u0010ï\u0001\u001a\u00020\u0004H\u0002J\t\u0010ð\u0001\u001a\u00020\u0004H\u0002J\u001b\u0010ò\u0001\u001a\u00020\u00042\u0007\u0010ñ\u0001\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u0002H\u0002J$\u0010ó\u0001\u001a\u00020\u00042\u0007\u0010Æ\u0001\u001a\u00020\u00022\u0007\u0010Ç\u0001\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u0002H\u0002J\t\u0010ô\u0001\u001a\u00020\u0004H\u0002J'\u0010ö\u0001\u001a\u00020\u00042\u0007\u0010õ\u0001\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010ø\u0001\u001a\u00020\u00042\u0007\u0010÷\u0001\u001a\u00020\u0002H\u0002J'\u0010ù\u0001\u001a\u00020\u00042\u0007\u0010õ\u0001\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010ú\u0001\u001a\u00020\u00042\u0007\u0010õ\u0001\u001a\u00020\u0002H\u0002R$\u0010û\u0001\u001a\u0007\u0012\u0002\b\u00030»\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R\u0017\u0010ÿ\u0001\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u0018\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001f\u0010\u0086\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002RE\u0010\u0088\u0002\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002RE\u0010\u008a\u0002\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u0089\u0002R \u0010\u008b\u0002\u001a\u00030Å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R!\u0010\u0090\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u00010\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001c\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0019\u0010ñ\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010\u0094\u0002R\u001a\u0010\u0096\u0002\u001a\u00030\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0019\u0010\u0098\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0094\u0002R\u001a\u0010\u0099\u0002\u001a\u00030\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u0097\u0002R\u001c\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R;\u0010\u009f\u0002\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u009d\u0002j\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u0017\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010¡\u0002R\u0019\u0010¢\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010¡\u0002R\u0019\u0010£\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010¡\u0002R\u001f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00020¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0089\u0002R\u0018\u0010¥\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010\u0097\u0002R;\u0010¦\u0002\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R@\u0010©\u0002\u001a+\u0012&\u0012$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u00010\u007fj\u0003`\u0081\u00010¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u0019\u0010«\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¡\u0002R\u0018\u0010¬\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u0097\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010¡\u0002R\u0019\u0010®\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010\u0094\u0002R\u0019\u0010¯\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010\u0094\u0002R\u001a\u0010±\u0002\u001a\u00030°\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u0019\u0010³\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010\u0094\u0002R\u0019\u0010´\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010¡\u0002R\u001e\u0010µ\u0002\u001a\t\u0012\u0004\u0012\u00020I0\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010\u0091\u0002R)\u0010·\u0002\u001a\u00020\u00132\u0007\u0010¶\u0002\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b·\u0002\u0010¡\u0002\u001a\u0005\b¸\u0002\u0010\u0015R)\u0010¹\u0002\u001a\u00020\u00132\u0007\u0010¶\u0002\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b¹\u0002\u0010¡\u0002\u001a\u0005\bº\u0002\u0010\u0015R\u001a\u0010Â\u0001\u001a\u00030°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010»\u0002R*\u0010¼\u0002\u001a\u00030\u0081\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¼\u0002\u0010\u0083\u0002\u001a\u0006\b½\u0002\u0010¾\u0002\"\u0006\b¿\u0002\u0010À\u0002R\u001a\u0010Á\u0002\u001a\u00030¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u0019\u0010Ã\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010¡\u0002R?\u0010Ä\u0002\u001a(\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0D\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0080\u0001\u0018\u00010\u007fj\u0005\u0018\u0001`\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010§\u0002RW\u0010Å\u0002\u001a0\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u0001\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0002\u0010\u0089\u0002\u001a\u0006\bÆ\u0002\u0010Ç\u0002\"\u0006\bÈ\u0002\u0010É\u0002R\u001a\u0010Ê\u0002\u001a\u00030Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002RC\u0010Ì\u0002\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0002\u0010\u0089\u0002R0\u0010\u0098\u0001\u001a\u00020\u00132\u0007\u0010¶\u0002\u001a\u00020\u00138\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\b\u0098\u0001\u0010¡\u0002\u0012\u0005\bÎ\u0002\u0010\u000e\u001a\u0005\bÍ\u0002\u0010\u0015R0\u0010Ï\u0002\u001a\u00020\u00022\u0007\u0010¶\u0002\u001a\u00020\u00028\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\bÏ\u0002\u0010\u0094\u0002\u0012\u0005\bÑ\u0002\u0010\u000e\u001a\u0005\bÐ\u0002\u0010PR\u0019\u0010Ò\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010\u0094\u0002R\"\u0010Ó\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u008f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010\u0091\u0002R\u0019\u0010Ô\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010\u0094\u0002R\u0019\u0010Õ\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0002\u0010¡\u0002R\u0019\u0010Ö\u0002\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0002\u0010¡\u0002R\u0018\u0010×\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0002\u0010\u0097\u0002RC\u0010Ø\u0002\u001a.\u0012)\u0012'\u0012\t\u0012\u0007\u0012\u0002\b\u00030»\u0001\u0012\u0005\u0012\u00030¼\u0001\u0012\u0005\u0012\u00030½\u0001\u0012\u0004\u0012\u00020\u00040º\u0001j\u0003`¾\u00010\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0002\u0010\u0091\u0002R\u0019\u0010Ù\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010\u0094\u0002R\u0019\u0010Ú\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010\u0094\u0002R\u0019\u0010Û\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010\u0094\u0002R\u0019\u0010Ü\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0002\u0010\u0094\u0002R\u0016\u0010Þ\u0002\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0002\u0010\u0015R\u0016\u0010à\u0002\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bß\u0002\u0010\u0015R\u0018\u0010ä\u0002\u001a\u00030á\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010ã\u0002R\u001d\u0010ç\u0002\u001a\u00020\u00138VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bæ\u0002\u0010\u000e\u001a\u0005\bå\u0002\u0010\u0015R\u001d\u0010ê\u0002\u001a\u00020\u00138VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bé\u0002\u0010\u000e\u001a\u0005\bè\u0002\u0010\u0015R\u0016\u0010ì\u0002\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bë\u0002\u0010PR\u0018\u0010ð\u0002\u001a\u00030í\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0002\u0010ï\u0002R\u0016\u0010ò\u0002\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bñ\u0002\u0010PR\u0019\u0010õ\u0002\u001a\u0004\u0018\u00010I8@X\u0080\u0004¢\u0006\b\u001a\u0006\bó\u0002\u0010ô\u0002R\u0013\u0010÷\u0002\u001a\u00020\u00138F¢\u0006\u0007\u001a\u0005\bö\u0002\u0010\u0015R\u0019\u0010ú\u0002\u001a\u0004\u0018\u00010w8VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0002\u0010ù\u0002R\u0019\u0010ý\u0002\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\bû\u0002\u0010ü\u0002R\u001e\u0010Ù\u0001\u001a\u0004\u0018\u00010\t*\u00030°\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ÿ\u0002\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0084\u0003"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "", "key", "Lkotlin/j;", "startReplaceableGroup", "endReplaceableGroup", "startDefaults", "endDefaults", "", "dataKey", "startMovableGroup", "endMovableGroup", "changesApplied$runtime_release", "()V", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", "V", "value", "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lkj/p;)V", "left", "right", "joinKey", "nextSlot", "changed", "changedInstance", "", "", "", "", "", "", "invalid", "cache", "(ZLkj/a;)Ljava/lang/Object;", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContent", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "disableSourceInformation", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "content", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkj/p;)V", "composeContent", "prepareCompose$runtime_release", "(Lkj/a;)V", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)Z", "recompose", "verifyConsistent$runtime_release", "verifyConsistent", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "startRoot", "endRoot", "abortRoot", "startGroup", "endGroup", "skipGroup", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalScope", "group", "parentScope", "currentProviders", "updateProviderMapGroup", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "ensureWriter", "createFreshInsertTable", "isNode", "data", "startReaderGroup", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "expectedNodeCount", "inserting", "exitGroup", "end", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "newCount", "updateNodeCountOverrides", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "nearestCommonRoot", "doRecordDownsFor", "recomposeKey", "compoundKeyOf", "Landroidx/compose/runtime/SlotReader;", "groupCompoundKeyPart", "skipReaderToGroupEnd", "addRecomposeScope", "locals", "force", "invokeMovableContentLambda", "insertMovableContentGuarded", "R", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/Change;", "newChanges", "withChanges", "(Ljava/util/List;Lkj/a;)Ljava/lang/Object;", "reader", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkj/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "invalidations", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkj/a;)Ljava/lang/Object;", "doCompose", "nodeAt", "validateNodeExpected", "validateNodeNotExpected", "change", "record", "recordApplierOperation", "recordSlotEditingOperation", "forParent", "recordSlotTableOperation", "realizeUps", "nodes", "realizeDowns", "([Ljava/lang/Object;)V", "node", "recordDown", "recordUp", "realizeOperationLocation", "Landroidx/compose/runtime/Anchor;", "anchor", "recordInsert", "recordFixup", "recordInsertUpFixup", "registerInsertUpFixup", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", "reference", "slots", "releaseMovableGroupAtCurrent", "reportAllMovableContent", "location", "recordReaderMoving", "recordSlotEditing", "recordEndGroup", "recordEndRoot", "finalizeCompose", "cleanUpCompose", "nodeIndex", "recordRemoveNode", "recordMoveNode", "realizeMovement", "groupKey", "updateCompoundKeyWhenWeEnterGroup", "keyHash", "updateCompoundKeyWhenWeEnterGroupKeyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "applier", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "changes", "Ljava/util/List;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Landroidx/compose/runtime/Stack;", "pending", "Landroidx/compose/runtime/Pending;", "I", "Landroidx/compose/runtime/IntStack;", "nodeIndexStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "", "nodeCountOverrides", "[I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Z", "forciblyRecompose", "nodeExpected", "Landroidx/compose/runtime/Invalidation;", "entersStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/collection/IntMap;", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "compositionToken", "sourceInformationEnabled", "invalidateStack", "<set-?>", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "Landroidx/compose/runtime/SlotReader;", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime_release", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "(Ljava/util/List;)V", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "getInserting", "getInserting$annotations", "compoundKeyHash", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "implicitRootStart", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Ldj/e;", "getApplyCoroutineContext", "()Ldj/e;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "recomposeScopeIdentity", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ComposerImpl implements Composer {
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private List<q<Applier<?>, SlotWriter, RememberManager, j>> changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private List<q<Applier<?>, SlotWriter, RememberManager, j>> deferredChanges;
    private Stack<Object> downNodes;
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private IntStack groupNodeCountStack;
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private final List<q<Applier<?>, SlotWriter, RememberManager, j>> insertFixups;
    private SlotTable insertTable;
    private final Stack<q<Applier<?>, SlotWriter, RememberManager, j>> insertUpFixups;
    private boolean inserting;
    private final Stack<RecomposeScopeImpl> invalidateStack;
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    private List<q<Applier<?>, SlotWriter, RememberManager, j>> lateChanges;
    private int[] nodeCountOverrides;
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private IntStack nodeIndexStack;
    private final CompositionContext parentContext;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider;
    private Pending pending;
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> providerCache;
    private final IntMap<PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates;
    private boolean providersInvalid;
    private final IntStack providersInvalidStack;
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    private final SlotTable slotTable;
    private Snapshot snapshot;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public ComposerImpl(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, List<q<Applier<?>, SlotWriter, RememberManager, j>> list, List<q<Applier<?>, SlotWriter, RememberManager, j>> list2, ControlledComposition controlledComposition) throws KotlinNothingValueException {
        m.h(applier, "applier");
        m.h(compositionContext, "parentContext");
        m.h(slotTable, "slotTable");
        m.h(set, "abandonSet");
        m.h(list, "changes");
        m.h(list2, "lateChanges");
        m.h(controlledComposition, "composition");
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = list;
        this.lateChanges = list2;
        this.composition = controlledComposition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new IntMap<>(0, 1, null);
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.sourceInformationEnabled = true;
        this.invalidateStack = new Stack<>();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void abortRoot() throws KotlinNothingValueException {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void addRecomposeScope() throws KotlinNothingValueException {
        RecomposeScopeImpl recomposeScopeImpl;
        if (getInserting()) {
            ControlledComposition composition = getComposition();
            m.f(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition);
            this.invalidateStack.push(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.start(this.compositionToken);
            return;
        }
        Invalidation invalidationRemoveLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (m.c(next, Composer.INSTANCE.getEmpty())) {
            ControlledComposition composition2 = getComposition();
            m.f(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition2);
            updateValue(recomposeScopeImpl);
        } else {
            m.f(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        recomposeScopeImpl.setRequiresRecompose(invalidationRemoveLocation != null);
        this.invalidateStack.push(recomposeScopeImpl);
        recomposeScopeImpl.start(this.compositionToken);
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iGroupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
        return iGroupCompoundKeyPart == 126665345 ? iGroupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ iGroupCompoundKeyPart;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void createFreshInsertTable() throws KotlinNothingValueException {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope() {
        PersistentMap persistentMap = this.providerCache;
        return persistentMap != null ? persistentMap : currentCompositionLocalScope(this.reader.getParent());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r11 = r10.invalidations;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r11.size() <= 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        kotlin.collections.t.V0(r11, new androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10.nodeIndex = 0;
        r10.isComposing = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        startRoot();
        r11 = nextSlot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r11 == r12) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r12 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        updateValue(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        androidx.compose.runtime.SnapshotStateKt.observeDerivedStateRecalculations(new androidx.compose.runtime.ComposerImpl$doCompose$2$3(r10), new androidx.compose.runtime.ComposerImpl$doCompose$2$4(r10), new androidx.compose.runtime.ComposerImpl$doCompose$2$5(r12, r10, r11));
        endRoot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r10.isComposing = false;
        r10.invalidations.clear();
        r11 = kotlin.j.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r10.isComposing = false;
        r10.invalidations.clear();
        abortRoot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void doCompose(androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> r11, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r12) throws kotlin.KotlinNothingValueException {
        /*
            r10 = this;
            boolean r0 = r10.isComposing
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto Lae
            java.lang.String r0 = "Compose:recompose"
            androidx.compose.runtime.Trace r2 = androidx.compose.runtime.Trace.INSTANCE
            java.lang.Object r0 = r2.beginSection(r0)
            androidx.compose.runtime.snapshots.Snapshot r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot()     // Catch: java.lang.Throwable -> La7
            r10.snapshot = r2     // Catch: java.lang.Throwable -> La7
            int r2 = r2.getId()     // Catch: java.lang.Throwable -> La7
            r10.compositionToken = r2     // Catch: java.lang.Throwable -> La7
            androidx.compose.runtime.collection.IntMap<androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>>> r2 = r10.providerUpdates     // Catch: java.lang.Throwable -> La7
            r2.clear()     // Catch: java.lang.Throwable -> La7
            int r2 = r11.getSize()     // Catch: java.lang.Throwable -> La7
            r3 = 0
            r4 = r3
        L25:
            if (r4 >= r2) goto L5a
            java.lang.Object[] r5 = r11.getKeys()     // Catch: java.lang.Throwable -> La7
            r5 = r5[r4]     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            kotlin.jvm.internal.m.f(r5, r6)     // Catch: java.lang.Throwable -> La7
            java.lang.Object[] r6 = r11.getValues()     // Catch: java.lang.Throwable -> La7
            r6 = r6[r4]     // Catch: java.lang.Throwable -> La7
            androidx.compose.runtime.collection.IdentityArraySet r6 = (androidx.compose.runtime.collection.IdentityArraySet) r6     // Catch: java.lang.Throwable -> La7
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> La7
            androidx.compose.runtime.Anchor r7 = r5.getAnchor()     // Catch: java.lang.Throwable -> La7
            if (r7 == 0) goto L54
            int r7 = r7.getLocation()     // Catch: java.lang.Throwable -> La7
            java.util.List<androidx.compose.runtime.Invalidation> r8 = r10.invalidations     // Catch: java.lang.Throwable -> La7
            androidx.compose.runtime.Invalidation r9 = new androidx.compose.runtime.Invalidation     // Catch: java.lang.Throwable -> La7
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> La7
            r8.add(r9)     // Catch: java.lang.Throwable -> La7
            int r4 = r4 + 1
            goto L25
        L54:
            androidx.compose.runtime.Trace r11 = androidx.compose.runtime.Trace.INSTANCE
            r11.endSection(r0)
            return
        L5a:
            java.util.List<androidx.compose.runtime.Invalidation> r11 = r10.invalidations     // Catch: java.lang.Throwable -> La7
            int r2 = r11.size()     // Catch: java.lang.Throwable -> La7
            if (r2 <= r1) goto L6a
            androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1 r2 = new androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1     // Catch: java.lang.Throwable -> La7
            r2.<init>()     // Catch: java.lang.Throwable -> La7
            kotlin.collections.t.V0(r11, r2)     // Catch: java.lang.Throwable -> La7
        L6a:
            r10.nodeIndex = r3     // Catch: java.lang.Throwable -> La7
            r10.isComposing = r1     // Catch: java.lang.Throwable -> La7
            r10.startRoot()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r11 = r10.nextSlot()     // Catch: java.lang.Throwable -> L9b
            if (r11 == r12) goto L7c
            if (r12 == 0) goto L7c
            r10.updateValue(r12)     // Catch: java.lang.Throwable -> L9b
        L7c:
            androidx.compose.runtime.ComposerImpl$doCompose$2$3 r1 = new androidx.compose.runtime.ComposerImpl$doCompose$2$3     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ComposerImpl$doCompose$2$4 r2 = new androidx.compose.runtime.ComposerImpl$doCompose$2$4     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ComposerImpl$doCompose$2$5 r4 = new androidx.compose.runtime.ComposerImpl$doCompose$2$5     // Catch: java.lang.Throwable -> L9b
            r4.<init>()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SnapshotStateKt.observeDerivedStateRecalculations(r1, r2, r4)     // Catch: java.lang.Throwable -> L9b
            r10.endRoot()     // Catch: java.lang.Throwable -> L9b
            r10.isComposing = r3     // Catch: java.lang.Throwable -> La7
            java.util.List<androidx.compose.runtime.Invalidation> r11 = r10.invalidations     // Catch: java.lang.Throwable -> La7
            r11.clear()     // Catch: java.lang.Throwable -> La7
            kotlin.j r11 = kotlin.j.a     // Catch: java.lang.Throwable -> La7
            goto L54
        L9b:
            r11 = move-exception
            r10.isComposing = r3     // Catch: java.lang.Throwable -> La7
            java.util.List<androidx.compose.runtime.Invalidation> r12 = r10.invalidations     // Catch: java.lang.Throwable -> La7
            r12.clear()     // Catch: java.lang.Throwable -> La7
            r10.abortRoot()     // Catch: java.lang.Throwable -> La7
            throw r11     // Catch: java.lang.Throwable -> La7
        La7:
            r11 = move-exception
            androidx.compose.runtime.Trace r12 = androidx.compose.runtime.Trace.INSTANCE
            r12.endSection(r0)
            throw r11
        Lae:
            java.lang.String r11 = "Reentrant composition is not supported"
            kotlin.KotlinNothingValueException r11 = androidx.appcompat.widget.s.k(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.doCompose(androidx.compose.runtime.collection.IdentityArrayMap, kj.p):void");
    }

    private final void doRecordDownsFor(int i2, int i3) {
        if (i2 <= 0 || i2 == i3) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i2), i3);
        if (this.reader.isNode(i2)) {
            recordDown(nodeAt(this.reader, i2));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void end(boolean z) throws KotlinNothingValueException {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i2 = this.groupNodeCount;
        Pending pending = this.pending;
        int i3 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i4 = 0;
            int i5 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i4 < size2) {
                KeyInfo keyInfo = keyInfos.get(i4);
                if (setFastToSet.contains(keyInfo)) {
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i5 < size) {
                            KeyInfo keyInfo2 = used.get(i5);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    recordMoveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i4++;
                            }
                            i5++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            used = list;
                        }
                    }
                    i3 = 0;
                } else {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i3);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), this.reader.groupSize(keyInfo.getLocation()) + keyInfo.getLocation());
                }
                i4++;
                i3 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i6 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            recordRemoveNode(i6, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z) {
                registerInsertUpFixup();
                i2 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i2);
                }
            }
        } else {
            if (z) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i2 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i2);
            }
            if (z) {
                i2 = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i2, inserting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void endGroup() throws KotlinNothingValueException {
        end(false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void endRoot() throws KotlinNothingValueException {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i2, boolean z) {
        Pending pendingPop = this.pendingStack.pop();
        if (pendingPop != null && !z) {
            pendingPop.setGroupIndex(pendingPop.getGroupIndex() + 1);
        }
        this.pending = pendingPop;
        this.nodeIndex = this.nodeIndexStack.pop() + i2;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void finalizeCompose() throws KotlinNothingValueException {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            throw s.k("Start/end imbalance");
        }
        if (!this.startedGroups.isEmpty()) {
            throw s.k("Missed recording an endGroup()");
        }
        cleanUpCompose();
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i2) {
        Object objGroupAux;
        if (slotReader.hasObjectKey(i2)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i2);
            if (objGroupObjectKey != null) {
                return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
            }
            return 0;
        }
        int iGroupKey = slotReader.groupKey(i2);
        if (iGroupKey == 207 && (objGroupAux = slotReader.groupAux(i2)) != null && !m.c(objGroupAux, Composer.INSTANCE.getEmpty())) {
            iGroupKey = objGroupAux.hashCode();
        }
        return iGroupKey;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        SlotTable slotTable;
        Anchor anchor;
        final SlotReader slotReaderOpenReader;
        List list2;
        SlotTable slotTable2;
        List<q<Applier<?>, SlotWriter, RememberManager, j>> list3 = this.lateChanges;
        List list4 = this.changes;
        try {
            this.changes = list3;
            record(ComposerKt.resetSlotsInstance);
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i3);
                final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.component1();
                final MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component2();
                final Anchor anchor2 = movableContentStateReference.getAnchor();
                int iAnchorIndex = movableContentStateReference.getSlotTable().anchorIndex(anchor2);
                final Ref.IntRef intRef = new Ref.IntRef();
                realizeUps();
                record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                        intRef.element = ComposerImpl.insertMovableContentGuarded$positionToInsert(slotWriter, anchor2, applier);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                        return j.a;
                    }
                });
                if (movableContentStateReference2 == null) {
                    if (m.c(movableContentStateReference.getSlotTable(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    slotReaderOpenReader = movableContentStateReference.getSlotTable().openReader();
                    try {
                        slotReaderOpenReader.reposition(iAnchorIndex);
                        this.writersReaderDelta = iAnchorIndex;
                        final ArrayList arrayList = new ArrayList();
                        recomposeMovableContent$default(this, null, null, null, null, new kj.a<j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            public /* bridge */ /* synthetic */ Object invoke() {
                                m2404invoke();
                                return j.a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m2404invoke() {
                                ComposerImpl composerImpl = this.this$0;
                                List<q<Applier<?>, SlotWriter, RememberManager, j>> list5 = arrayList;
                                SlotReader slotReader = slotReaderOpenReader;
                                MovableContentStateReference movableContentStateReference3 = movableContentStateReference;
                                List list6 = composerImpl.changes;
                                try {
                                    composerImpl.changes = list5;
                                    SlotReader slotReader2 = composerImpl.reader;
                                    int[] iArr = composerImpl.nodeCountOverrides;
                                    composerImpl.nodeCountOverrides = null;
                                    try {
                                        composerImpl.reader = slotReader;
                                        composerImpl.invokeMovableContentLambda(movableContentStateReference3.getContent$runtime_release(), movableContentStateReference3.getLocals$runtime_release(), movableContentStateReference3.getParameter(), true);
                                        j jVar = j.a;
                                    } finally {
                                        composerImpl.reader = slotReader2;
                                        composerImpl.nodeCountOverrides = iArr;
                                    }
                                } finally {
                                    composerImpl.changes = list6;
                                }
                            }
                        }, 15, null);
                        if (!arrayList.isEmpty()) {
                            record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "slots", rememberManager, "rememberManager");
                                    int i4 = intRef.element;
                                    if (i4 > 0) {
                                        applier = new OffsetApplier(applier, i4);
                                    }
                                    List<q<Applier<?>, SlotWriter, RememberManager, j>> list5 = arrayList;
                                    int size2 = list5.size();
                                    for (int i5 = 0; i5 < size2; i5++) {
                                        list5.get(i5).invoke(applier, slotWriter, rememberManager);
                                    }
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                                    return j.a;
                                }
                            });
                        }
                        j jVar = j.a;
                        slotReaderOpenReader.close();
                    } finally {
                    }
                } else {
                    final MovableContentState movableContentStateMovableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference2);
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null) {
                        slotTable = movableContentStateReference2.getSlotTable();
                    }
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null || (anchor = slotTable2.anchor(i2)) == null) {
                        anchor = movableContentStateReference2.getAnchor();
                    }
                    final List listCollectNodesFrom = ComposerKt.collectNodesFrom(slotTable, anchor);
                    if (!listCollectNodesFrom.isEmpty()) {
                        record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                                int i4 = intRef.element;
                                List<Object> list5 = listCollectNodesFrom;
                                int size2 = list5.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    Object obj = list5.get(i5);
                                    int i6 = i4 + i5;
                                    applier.insertBottomUp(i6, obj);
                                    applier.insertTopDown(i6, obj);
                                }
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                                return j.a;
                            }
                        });
                        if (m.c(movableContentStateReference.getSlotTable(), this.slotTable)) {
                            int iAnchorIndex2 = this.slotTable.anchorIndex(anchor2);
                            updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                        }
                    }
                    record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                            androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                            MovableContentState movableContentStateMovableContentStateResolve$runtime_release2 = movableContentStateMovableContentStateResolve$runtime_release;
                            if (movableContentStateMovableContentStateResolve$runtime_release2 == null && (movableContentStateMovableContentStateResolve$runtime_release2 = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference2)) == null) {
                                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                                throw new KotlinNothingValueException();
                            }
                            List<Anchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release2.getSlotTable(), 2);
                            if (!listMoveIntoGroupFrom.isEmpty()) {
                                ControlledComposition composition = movableContentStateReference.getComposition();
                                m.f(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                                CompositionImpl compositionImpl = (CompositionImpl) composition;
                                int size2 = listMoveIntoGroupFrom.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Object objSlot = slotWriter.slot(listMoveIntoGroupFrom.get(i4), 0);
                                    RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                                    if (recomposeScopeImpl != null) {
                                        recomposeScopeImpl.adoptedBy(compositionImpl);
                                    }
                                }
                            }
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                            return j.a;
                        }
                    });
                    slotReaderOpenReader = slotTable.openReader();
                    try {
                        SlotReader slotReader = this.reader;
                        int[] iArr = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        try {
                            this.reader = slotReaderOpenReader;
                            int iAnchorIndex3 = slotTable.anchorIndex(anchor);
                            slotReaderOpenReader.reposition(iAnchorIndex3);
                            this.writersReaderDelta = iAnchorIndex3;
                            final ArrayList arrayList2 = new ArrayList();
                            List list5 = this.changes;
                            try {
                                this.changes = arrayList2;
                                list2 = list5;
                                try {
                                    recomposeMovableContent(movableContentStateReference2.getComposition(), movableContentStateReference.getComposition(), Integer.valueOf(slotReaderOpenReader.getCurrentGroup()), movableContentStateReference2.getInvalidations$runtime_release(), new kj.a<j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                                        public /* bridge */ /* synthetic */ Object invoke() throws KotlinNothingValueException {
                                            m2405invoke();
                                            return j.a;
                                        }

                                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m2405invoke() throws KotlinNothingValueException {
                                            this.this$0.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter(), true);
                                        }
                                    });
                                    j jVar2 = j.a;
                                    this.changes = list2;
                                    if (!arrayList2.isEmpty()) {
                                        record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "slots", rememberManager, "rememberManager");
                                                int i4 = intRef.element;
                                                if (i4 > 0) {
                                                    applier = new OffsetApplier(applier, i4);
                                                }
                                                List<q<Applier<?>, SlotWriter, RememberManager, j>> list6 = arrayList2;
                                                int size2 = list6.size();
                                                for (int i5 = 0; i5 < size2; i5++) {
                                                    list6.get(i5).invoke(applier, slotWriter, rememberManager);
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                                                return j.a;
                                            }
                                        });
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    this.changes = list2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list2 = list5;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                record(ComposerKt.skipToGroupEndInstance);
                i3++;
                i2 = 0;
            }
            record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$2
                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                    m.h(applier, "applier");
                    m.h(slotWriter, "slots");
                    m.h(rememberManager, "<anonymous parameter 2>");
                    ComposerImpl.insertMovableContentGuarded$positionToParentOf(slotWriter, applier, 0);
                    slotWriter.endGroup();
                }
            });
            this.writersReaderDelta = 0;
            j jVar3 = j.a;
        } finally {
            this.changes = list4;
        }
    }

    private static final int insertMovableContentGuarded$currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (slotWriter.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final int insertMovableContentGuarded$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) throws KotlinNothingValueException {
        int iAnchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < iAnchorIndex);
        insertMovableContentGuarded$positionToParentOf(slotWriter, applier, iAnchorIndex);
        int iInsertMovableContentGuarded$currentNodeIndex = insertMovableContentGuarded$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iInsertMovableContentGuarded$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                iInsertMovableContentGuarded$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == iAnchorIndex);
        return iInsertMovableContentGuarded$currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void insertMovableContentGuarded$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i2) throws KotlinNothingValueException {
        while (!slotWriter.indexInParent(i2)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void invokeMovableContentLambda(final MovableContent<Object> movableContent, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, final Object obj, boolean z) throws KotlinNothingValueException {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        changed(obj);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z2 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !m.c(this.reader.getGroupAux(), persistentMap)) {
                z2 = true;
            }
            if (z2) {
                this.providerUpdates.set(this.reader.getCurrentGroup(), persistentMap);
            }
            m2402startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m2417getGroupULZAiWs(), persistentMap);
            if (!getInserting() || z) {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(694380496, true, new p<Composer, Integer, j>() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return j.a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i2) {
                        if ((i2 & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(694380496, i2, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2967)");
                        }
                        movableContent.getContent().invoke(obj, composer, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z3;
            } else {
                this.writerHasAProvider = true;
                this.providerCache = null;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), EmptyList.INSTANCE, currentCompositionLocalScope()));
            }
        } finally {
            endGroup();
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        }
    }

    private final Object nodeAt(SlotReader slotReader, int i2) {
        return slotReader.node(i2);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void realizeDowns(final Object[] nodes) {
        record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.realizeDowns.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                int length = nodes.length;
                for (int i2 = 0; i2 < length; i2++) {
                    applier.down(nodes[i2]);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        });
    }

    private final void realizeMovement() {
        final int i2 = this.previousCount;
        this.previousCount = 0;
        if (i2 > 0) {
            final int i3 = this.previousRemove;
            if (i3 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                        applier.remove(i3, i2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                        return j.a;
                    }
                });
                return;
            }
            final int i4 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i5 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                    applier.move(i4, i5, i2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void realizeOperationLocation(boolean z) throws KotlinNothingValueException {
        int parent = z ? this.reader.getParent() : this.reader.getCurrentGroup();
        final int i2 = parent - this.writersReaderDelta;
        if (!(i2 >= 0)) {
            throw s.k("Tried to seek backward");
        }
        if (i2 > 0) {
            record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.realizeOperationLocation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                    androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                    slotWriter.advanceBy(i2);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z, int i2, Object obj) throws KotlinNothingValueException {
        if ((i2 & 1) != 0) {
            z = false;
        }
        composerImpl.realizeOperationLocation(z);
    }

    private final void realizeUps() {
        final int i2 = this.pendingUps;
        if (i2 > 0) {
            this.pendingUps = 0;
            record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.realizeUps.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                    int i3 = i2;
                    for (int i4 = 0; i4 < i3; i4++) {
                        applier.up();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }
            });
        }
    }

    private final <R> R recomposeMovableContent(ControlledComposition from, ControlledComposition to, Integer index, List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations, kj.a<? extends R> block) {
        R r;
        boolean z = this.implicitRootStart;
        boolean z2 = this.isComposing;
        int i2 = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i3 = 0; i3 < size; i3++) {
                Pair<RecomposeScopeImpl, IdentityArraySet<Object>> pair = invalidations.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.component1();
                IdentityArraySet identityArraySet = (IdentityArraySet) pair.component2();
                if (identityArraySet != null) {
                    int size2 = identityArraySet.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        tryImminentInvalidation$runtime_release(recomposeScopeImpl, identityArraySet.get(i4));
                    }
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImpl, null);
                }
            }
            if (from != null) {
                r = (R) from.delegateInvalidations(to, index != null ? index.intValue() : -1, block);
                if (r == null) {
                }
                return r;
            }
            r = (R) block.invoke();
            return r;
        } finally {
            this.implicitRootStart = z;
            this.isComposing = z2;
            this.nodeIndex = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, kj.a aVar, int i2, Object obj) {
        ControlledComposition controlledComposition3 = (i2 & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i2 & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) != 0) {
            list = EmptyList.INSTANCE;
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, aVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recomposeToGroupEnd() throws KotlinNothingValueException {
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i2 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i3 = this.groupNodeCount;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        boolean z2 = false;
        int i4 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i4, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i2);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                invalidationFirstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i4 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z2) {
            recordUpsAndDowns(i4, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i2 + iUpdatedNodeCount;
            this.groupNodeCount = i3 + iUpdatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void record(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, j> qVar) {
        this.changes.add(qVar);
    }

    private final void recordApplierOperation(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, j> qVar) {
        realizeUps();
        realizeDowns();
        record(qVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordDelete() throws KotlinNothingValueException {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta = this.reader.getGroupSize() + this.writersReaderDelta;
    }

    private final void recordDown(Object obj) {
        this.downNodes.push(obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordEndGroup() throws KotlinNothingValueException {
        int parent = this.reader.getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            throw s.k("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordEndRoot() throws KotlinNothingValueException {
        if (this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, j> qVar) {
        this.insertFixups.add(qVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordInsert(final Anchor anchor) throws KotlinNothingValueException {
        if (this.insertFixups.isEmpty()) {
            final SlotTable slotTable = this.insertTable;
            recordSlotEditingOperation(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

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
                    slotWriter.beginInsert();
                    SlotTable slotTable2 = slotTable;
                    slotWriter.moveFrom(slotTable2, anchor.toIndexFor(slotTable2));
                    slotWriter.endInsert();
                }
            });
            return;
        }
        final ArrayList arrayListY1 = y.Y1(this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        final SlotTable slotTable2 = this.insertTable;
        recordSlotEditingOperation(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "slots", rememberManager, "rememberManager");
                SlotTable slotTable3 = slotTable2;
                List<q<Applier<?>, SlotWriter, RememberManager, j>> list = arrayListY1;
                SlotWriter slotWriterOpenWriter = slotTable3.openWriter();
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).invoke(applier, slotWriterOpenWriter, rememberManager);
                    }
                    j jVar = j.a;
                    slotWriterOpenWriter.close();
                    slotWriter.beginInsert();
                    SlotTable slotTable4 = slotTable2;
                    slotWriter.moveFrom(slotTable4, anchor.toIndexFor(slotTable4));
                    slotWriter.endInsert();
                } catch (Throwable th) {
                    slotWriterOpenWriter.close();
                    throw th;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        });
    }

    private final void recordInsertUpFixup(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, j> qVar) {
        this.insertUpFixups.push(qVar);
    }

    private final void recordMoveNode(int i2, int i3, int i4) {
        if (i4 > 0) {
            int i5 = this.previousCount;
            if (i5 > 0 && this.previousMoveFrom == i2 - i5 && this.previousMoveTo == i3 - i5) {
                this.previousCount = i5 + i4;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = i2;
            this.previousMoveTo = i3;
            this.previousCount = i4;
        }
    }

    private final void recordReaderMoving(int i2) {
        this.writersReaderDelta = i2 - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordRemoveNode(int i2, int i3) throws KotlinNothingValueException {
        if (i3 > 0) {
            if (!(i2 >= 0)) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + i2).toString());
                throw new KotlinNothingValueException();
            }
            if (this.previousRemove == i2) {
                this.previousCount += i3;
                return;
            }
            realizeMovement();
            this.previousRemove = i2;
            this.previousCount = i3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordSlotEditing() throws KotlinNothingValueException {
        SlotReader slotReader;
        int parent;
        if (this.reader.getGroupsSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            recordSlotTableOperation$default(this, false, ComposerKt.startRootGroup, 1, null);
            this.startedGroup = true;
        }
        if (parent > 0) {
            final Anchor anchor = slotReader.anchor(parent);
            this.startedGroups.push(parent);
            recordSlotTableOperation$default(this, false, new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.recordSlotEditing.1
                {
                    super(3);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                    androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                    slotWriter.ensureStarted(anchor);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordSlotEditingOperation(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, j> qVar) throws KotlinNothingValueException {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(qVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void recordSlotTableOperation(boolean z, q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, j> qVar) throws KotlinNothingValueException {
        realizeOperationLocation(z);
        record(qVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z, q qVar, int i2, Object obj) throws KotlinNothingValueException {
        if ((i2 & 1) != 0) {
            z = false;
        }
        composerImpl.recordSlotTableOperation(z, qVar);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int i2, int i3, int i4) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i2, i3, i4);
        while (i2 > 0 && i2 != iNearestCommonRootOf) {
            if (slotReader.isNode(i2)) {
                recordUp();
            }
            i2 = slotReader.parent(i2);
        }
        doRecordDownsFor(i3, iNearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void releaseMovableGroupAtCurrent(MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) throws KotlinNothingValueException {
        SlotTable slotTable = new SlotTable();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter());
            slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            j jVar = j.a;
            slotWriterOpenWriter.close();
            this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, new MovableContentState(slotTable));
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ArrayList arrayList = new ArrayList();
            this.deferredChanges = arrayList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                List list = this.changes;
                try {
                    this.changes = arrayList;
                    reportFreeMovableContent(0);
                    realizeUps();
                    if (this.startedGroup) {
                        record(ComposerKt.skipToGroupEndInstance);
                        recordEndRoot();
                    }
                    j jVar = j.a;
                } finally {
                    this.changes = list;
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void reportFreeMovableContent(int i2) throws KotlinNothingValueException {
        reportFreeMovableContent$reportGroup(this, i2, false, 0);
        realizeMovement();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final int reportFreeMovableContent$reportGroup(final ComposerImpl composerImpl, int i2, boolean z, int i3) throws KotlinNothingValueException {
        if (!composerImpl.reader.hasMark(i2)) {
            if (!composerImpl.reader.containsMark(i2)) {
                return composerImpl.reader.nodeCount(i2);
            }
            int iGroupSize = composerImpl.reader.groupSize(i2) + i2;
            int iGroupSize2 = i2 + 1;
            int iReportFreeMovableContent$reportGroup = 0;
            while (iGroupSize2 < iGroupSize) {
                boolean zIsNode = composerImpl.reader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordDown(composerImpl.reader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, iGroupSize2, zIsNode || z, zIsNode ? 0 : i3 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
                iGroupSize2 += composerImpl.reader.groupSize(iGroupSize2);
            }
            return iReportFreeMovableContent$reportGroup;
        }
        int iGroupKey = composerImpl.reader.groupKey(i2);
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i2);
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof MovableContent)) {
            if (iGroupKey != 206 || !m.c(objGroupObjectKey, ComposerKt.getReference())) {
                return composerImpl.reader.nodeCount(i2);
            }
            Object objGroupGet = composerImpl.reader.groupGet(i2, 0);
            CompositionContextHolder compositionContextHolder = objGroupGet instanceof CompositionContextHolder ? (CompositionContextHolder) objGroupGet : null;
            if (compositionContextHolder != null) {
                Iterator<T> it = compositionContextHolder.getRef().getComposers().iterator();
                while (it.hasNext()) {
                    ((ComposerImpl) it.next()).reportAllMovableContent();
                }
            }
            return composerImpl.reader.nodeCount(i2);
        }
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet2 = composerImpl.reader.groupGet(i2, 0);
        Anchor anchor = composerImpl.reader.anchor(i2);
        List listFilterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i2, composerImpl.reader.groupSize(i2) + i2);
        ArrayList arrayList = new ArrayList(listFilterToRange.size());
        int size = listFilterToRange.size();
        for (int i4 = 0; i4 < size; i4++) {
            Invalidation invalidation = (Invalidation) listFilterToRange.get(i4);
            arrayList.add(new Pair(invalidation.getScope(), invalidation.getInstances()));
        }
        final MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, objGroupGet2, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i2));
        composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        composerImpl.recordSlotEditing();
        composerImpl.record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                this.this$0.releaseMovableGroupAtCurrent(movableContentStateReference, slotWriter);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        });
        if (!z) {
            return composerImpl.reader.nodeCount(i2);
        }
        composerImpl.realizeMovement();
        composerImpl.realizeUps();
        composerImpl.realizeDowns();
        int iNodeCount = composerImpl.reader.isNode(i2) ? 1 : composerImpl.reader.nodeCount(i2);
        if (iNodeCount <= 0) {
            return 0;
        }
        composerImpl.recordRemoveNode(i3, iNodeCount);
        return 0;
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> key, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
        return ComposerKt.contains(scope, key) ? (T) ComposerKt.getValueOf(scope, key) : key.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void skipReaderToGroupEnd() throws KotlinNothingValueException {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m2402startBaiHCIY(int key, Object objectKey, int kind, Object data) throws KotlinNothingValueException {
        Object empty = objectKey;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(key, objectKey, data);
        GroupKind.Companion companion = GroupKind.INSTANCE;
        boolean z = kind != companion.m2417getGroupULZAiWs();
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(key, Composer.INSTANCE.getEmpty());
            } else if (data != null) {
                SlotWriter slotWriter = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(key, empty, data);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(key, empty);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z, null);
            return;
        }
        boolean z2 = !(kind != companion.m2418getNodeULZAiWs()) && this.reusing;
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z2 && groupKey == key && m.c(objectKey, this.reader.getGroupObjectKey())) {
                startReaderGroup(z, data);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(key, objectKey);
            if (z2 || next == null) {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(key, Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(key, empty, data);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(key, empty);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
            } else {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int iSlotPositionOf = pending3.slotPositionOf(next);
                final int groupIndex = iSlotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(iSlotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$start$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                        public final void invoke(Applier<?> applier, SlotWriter slotWriter5, RememberManager rememberManager) throws KotlinNothingValueException {
                            androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter5, "slots", rememberManager, "<anonymous parameter 2>");
                            slotWriter5.moveGroup(groupIndex);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                            return j.a;
                        }
                    });
                }
                startReaderGroup(z, data);
            }
        }
        enterGroup(z, pending);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void startGroup(int i2) throws KotlinNothingValueException {
        m2402startBaiHCIY(i2, null, GroupKind.INSTANCE.m2417getGroupULZAiWs(), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void startReaderGroup(boolean z, final Object obj) throws KotlinNothingValueException {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            recordSlotTableOperation$default(this, false, new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.startReaderGroup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                    androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                    slotWriter.updateAux(obj);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) throws KotlinNothingValueException {
                    invoke((Applier<?>) obj2, (SlotWriter) obj3, (RememberManager) obj4);
                    return j.a;
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void startRoot() throws KotlinNothingValueException {
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i2, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i2 != 207 || m.c(obj2, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(i2);
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i2) {
        this.compoundKeyHash = i2 ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i2, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i2 != 207 || m.c(obj2, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeExitGroupKeyHash(i2);
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i2) {
        this.compoundKeyHash = Integer.rotateRight(i2 ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int i2, int i3) {
        if (updatedNodeCount(i2) != i3) {
            if (i2 < 0) {
                HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
                if (map == null) {
                    map = new HashMap<>();
                    this.nodeCountVirtualOverrides = map;
                }
                map.put(Integer.valueOf(i2), Integer.valueOf(i3));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                n.w0(iArr, -1, 0, 6);
                this.nodeCountOverrides = iArr;
            }
            iArr[i2] = i3;
        }
    }

    private final void updateNodeCountOverrides(int i2, int i3) {
        int iUpdatedNodeCount = updatedNodeCount(i2);
        if (iUpdatedNodeCount != i3) {
            int i4 = i3 - iUpdatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i2 != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(i2) + i4;
                updateNodeCount(i2, iUpdatedNodeCount2);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        Pending pendingPeek = this.pendingStack.peek(i5);
                        if (pendingPeek != null && pendingPeek.updateNodeCount(i2, iUpdatedNodeCount2)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.reader.getParent();
                } else if (this.reader.isNode(i2)) {
                    return;
                } else {
                    i2 = this.reader.parent(i2);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentScope, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentProviders) throws KotlinNothingValueException {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentMap persistentMapBuild = builder.build();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        changed(persistentMapBuild);
        changed(currentProviders);
        endGroup();
        return persistentMapBuild;
    }

    private final int updatedNodeCount(int group) {
        int i2;
        Integer num;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i2 = iArr[group]) < 0) ? this.reader.nodeCount(group) : i2;
        }
        HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
        if (map == null || (num = map.get(Integer.valueOf(group))) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void validateNodeExpected() throws KotlinNothingValueException {
        if (!this.nodeExpected) {
            throw s.k("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void validateNodeNotExpected() throws KotlinNothingValueException {
        if (!(!this.nodeExpected)) {
            throw s.k("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final <R> R withChanges(List<q<Applier<?>, SlotWriter, RememberManager, j>> newChanges, kj.a<? extends R> block) {
        List list = this.changes;
        try {
            this.changes = newChanges;
            return (R) block.invoke();
        } finally {
            this.changes = list;
        }
    }

    private final <R> R withReader(SlotReader reader, kj.a<? extends R> block) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = reader;
            return (R) block.invoke();
        } finally {
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(final V value, final p<? super T, ? super V, j> block) {
        m.h(block, "block");
        q<Applier<?>, SlotWriter, RememberManager, j> qVar = new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                block.invoke(applier.getCurrent(), value);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        };
        if (getInserting()) {
            recordFixup(qVar);
        } else {
            recordApplierOperation(qVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() throws KotlinNothingValueException {
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, kj.a<? extends T> block) throws KotlinNothingValueException {
        m.h(block, "block");
        T t = (T) nextSlot();
        if (t != Composer.INSTANCE.getEmpty() && !invalid) {
            return t;
        }
        T t2 = (T) block.invoke();
        updateValue(t2);
        return t2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object value) throws KotlinNothingValueException {
        if (m.c(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object value) throws KotlinNothingValueException {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, p<? super Composer, ? super Integer, j> content) throws KotlinNothingValueException {
        m.h(invalidationsRequested, "invalidationsRequested");
        m.h(content, "content");
        if (!this.changes.isEmpty()) {
            throw s.k("Expected applyChanges() to have been called");
        }
        doCompose(invalidationsRequested, content);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(CompositionLocal<T> key) {
        m.h(key, "key");
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(final kj.a<? extends T> aVar) throws KotlinNothingValueException {
        m.h(aVar, "factory");
        validateNodeExpected();
        if (!getInserting()) {
            throw s.k("createNode() can only be called when inserting");
        }
        final int iPeek = this.nodeIndexStack.peek();
        SlotWriter slotWriter = this.writer;
        final Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        recordFixup(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) throws KotlinNothingValueException {
                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter2, "slots", rememberManager, "<anonymous parameter 2>");
                Object objInvoke = aVar.invoke();
                slotWriter2.updateNode(anchor, objInvoke);
                applier.insertTopDown(iPeek, objInvoke);
                applier.down(objInvoke);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws KotlinNothingValueException {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        });
        recordInsertUpFixup(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                androidx.appcompat.view.menu.a.m(applier, "applier", slotWriter2, "slots", rememberManager, "<anonymous parameter 2>");
                Object objNode = slotWriter2.node(anchor);
                applier.up();
                applier.insertBottomUp(iPeek, objNode);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) throws KotlinNothingValueException {
        if (!(this.groupNodeCount == 0)) {
            throw s.k("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        for (final int i2 = currentGroup; i2 < currentEnd; i2++) {
            if (this.reader.isNode(i2)) {
                final Object objNode = this.reader.node(i2);
                if (objNode instanceof ComposeNodeLifecycleCallback) {
                    record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "<anonymous parameter 1>", rememberManager, "rememberManager");
                            rememberManager.deactivating((ComposeNodeLifecycleCallback) objNode);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                            return j.a;
                        }
                    });
                }
            }
            this.reader.forEachData$runtime_release(i2, new p<Integer, Object, j>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
                    invoke(((Number) obj).intValue(), obj2);
                    return j.a;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public final void invoke(final int i3, final Object obj) throws KotlinNothingValueException {
                    if (obj instanceof RememberObserver) {
                        ComposerImpl.this.reader.reposition(i2);
                        ComposerImpl composerImpl = ComposerImpl.this;
                        final int i4 = i2;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl, false, new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                                androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "rememberManager");
                                if (!m.c(obj, slotWriter.slot(i4, i3))) {
                                    throw s.k("Slot table is out of sync");
                                }
                                rememberManager.forgetting((RememberObserver) obj);
                                slotWriter.set(i3, Composer.INSTANCE.getEmpty());
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) throws KotlinNothingValueException {
                                invoke((Applier<?>) obj2, (SlotWriter) obj3, (RememberManager) obj4);
                                return j.a;
                            }
                        }, 1, null);
                        return;
                    }
                    if (obj instanceof RecomposeScopeImpl) {
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        CompositionImpl composition = recomposeScopeImpl.getComposition();
                        if (composition != null) {
                            composition.setPendingInvalidScopes$runtime_release(true);
                            recomposeScopeImpl.release();
                        }
                        ComposerImpl.this.reader.reposition(i2);
                        ComposerImpl composerImpl2 = ComposerImpl.this;
                        final int i5 = i2;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl2, false, new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                                androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "<anonymous parameter 2>");
                                if (!m.c(obj, slotWriter.slot(i5, i3))) {
                                    throw s.k("Slot table is out of sync");
                                }
                                slotWriter.set(i3, Composer.INSTANCE.getEmpty());
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) throws KotlinNothingValueException {
                                invoke((Applier<?>) obj2, (SlotWriter) obj3, (RememberManager) obj4);
                                return j.a;
                            }
                        }, 1, null);
                    }
                }
            });
        }
        ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.reposition(currentGroup);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            j jVar = j.a;
            trace.endSection(objBeginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() throws KotlinNothingValueException {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() throws KotlinNothingValueException {
        endGroup();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void endNode() throws KotlinNothingValueException {
        end(true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() throws KotlinNothingValueException {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() throws KotlinNothingValueException {
        endGroup();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() throws KotlinNothingValueException {
        Anchor anchor;
        final l<Composition, j> lVarEnd;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (lVarEnd = recomposeScopeImplPop.end(this.compositionToken)) != null) {
            record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "<anonymous parameter 1>", rememberManager, "<anonymous parameter 2>");
                    lVarEnd.invoke(this.getComposition());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }
            });
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() throws KotlinNothingValueException {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i2) throws KotlinNothingValueException {
        if (i2 < 0) {
            int i3 = -i2;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i3) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i2) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public e getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    public final List<q<Applier<?>, SlotWriter, RememberManager, j>> getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    /* JADX INFO: renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (getInserting() || this.reusing || this.providersInvalid) {
            return false;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return (currentRecomposeScope$runtime_release != null && !currentRecomposeScope$runtime_release.getRequiresRecompose()) && !this.forciblyRecompose;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) throws KotlinNothingValueException {
        m.h(movableContent, "value");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) throws KotlinNothingValueException {
        m.h(list, "references");
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    /* JADX INFO: renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object left, Object right) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object nextSlot() throws KotlinNothingValueException {
        if (!getInserting()) {
            return this.reusing ? Composer.INSTANCE.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.INSTANCE.getEmpty();
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(kj.a<j> block) {
        m.h(block, "block");
        if (!(!this.isComposing)) {
            throw s.k("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) throws KotlinNothingValueException {
        m.h(invalidationsRequested, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            throw s.k("Expected applyChanges() to have been called");
        }
        if (!invalidationsRequested.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
            return false;
        }
        doCompose(invalidationsRequested, null);
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(final kj.a<j> aVar) {
        m.h(aVar, "effect");
        record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.recordSideEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "<anonymous parameter 1>", rememberManager, "rememberManager");
                rememberManager.sideEffect(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return j.a;
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope) {
        m.h(recomposeScope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlot();
    }

    public final void setDeferredChanges$runtime_release(List<q<Applier<?>, SlotWriter, RememberManager, j>> list) {
        this.deferredChanges = list;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable) {
        m.h(slotTable, "<set-?>");
        this.insertTable = slotTable;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() throws KotlinNothingValueException {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() throws KotlinNothingValueException {
        if (!(this.groupNodeCount == 0)) {
            throw s.k("No nodes can be emitted before calling skipAndEndGroup");
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String str) throws KotlinNothingValueException {
        m.h(str, "sourceInformation");
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.insertAux(str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() throws KotlinNothingValueException {
        if (this.sourceInformationEnabled) {
            end(false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i2, String str) throws KotlinNothingValueException {
        m.h(str, "sourceInformation");
        if (this.sourceInformationEnabled) {
            m2402startBaiHCIY(i2, null, GroupKind.INSTANCE.m2417getGroupULZAiWs(), str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() throws KotlinNothingValueException {
        m2402startBaiHCIY(-127, null, GroupKind.INSTANCE.m2417getGroupULZAiWs(), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i2, Object obj) throws KotlinNothingValueException {
        m2402startBaiHCIY(i2, obj, GroupKind.INSTANCE.m2417getGroupULZAiWs(), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void startNode() throws KotlinNothingValueException {
        m2402startBaiHCIY(125, null, GroupKind.INSTANCE.m2418getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(final ProvidedValue<?>[] values) throws KotlinNothingValueException {
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapUpdateProviderMapGroup;
        m.h(values, "values");
        final PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        startGroup(ComposerKt.providerValuesKey, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ActualJvm_jvmKt.invokeComposableForResult(this, new p<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((Composer) obj, ((Number) obj2).intValue());
            }

            @Composable
            public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(Composer composer, int i2) {
                composer.startReplaceableGroup(935231726);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(935231726, i2, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:2002)");
                }
                PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCompositionLocalMapOf = ComposerKt.compositionLocalMapOf(values, persistentMapCurrentCompositionLocalScope, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return persistentMapCompositionLocalMapOf;
            }
        });
        endGroup();
        boolean z = false;
        if (getInserting()) {
            persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            m.f(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            m.f(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap persistentMap3 = (PersistentMap) objGroupGet2;
            if (getSkipping() && m.c(persistentMap3, persistentMap)) {
                skipGroup();
                persistentMapUpdateProviderMapGroup = persistentMap2;
            } else {
                persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
                z = !m.c(persistentMapUpdateProviderMapGroup, persistentMap2);
            }
        }
        if (z && !getInserting()) {
            this.providerUpdates.set(this.reader.getCurrentGroup(), persistentMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.providerCache = persistentMapUpdateProviderMapGroup;
        m2402startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m2417getGroupULZAiWs(), persistentMapUpdateProviderMapGroup);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i2) throws KotlinNothingValueException {
        m2402startBaiHCIY(i2, null, GroupKind.INSTANCE.m2417getGroupULZAiWs(), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int key) throws KotlinNothingValueException {
        m2402startBaiHCIY(key, null, GroupKind.INSTANCE.m2417getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i2, Object obj) throws KotlinNothingValueException {
        if (this.reader.getGroupKey() == i2 && !m.c(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m2402startBaiHCIY(i2, null, GroupKind.INSTANCE.m2417getGroupULZAiWs(), obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() throws KotlinNothingValueException {
        m2402startBaiHCIY(125, null, GroupKind.INSTANCE.m2419getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl scope, Object instance) {
        m.h(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void updateCachedValue(Object obj) throws KotlinNothingValueException {
        updateValue(obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) throws KotlinNothingValueException {
        updateValue(obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void updateValue(final Object obj) throws KotlinNothingValueException {
        if (!getInserting()) {
            final int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (obj instanceof RememberObserver) {
                this.abandonSet.add(obj);
            }
            recordSlotTableOperation(true, new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws KotlinNothingValueException {
                    RecomposeScopeImpl recomposeScopeImpl;
                    CompositionImpl composition;
                    androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "slots", rememberManager, "rememberManager");
                    Object obj2 = obj;
                    if (obj2 instanceof RememberObserver) {
                        rememberManager.remembering((RememberObserver) obj2);
                    }
                    Object obj3 = slotWriter.set(groupSlotIndex, obj);
                    if (obj3 instanceof RememberObserver) {
                        rememberManager.forgetting((RememberObserver) obj3);
                    } else {
                        if (!(obj3 instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) obj3).getComposition()) == null) {
                            return;
                        }
                        recomposeScopeImpl.release();
                        composition.setPendingInvalidScopes$runtime_release(true);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) throws KotlinNothingValueException {
                    invoke((Applier<?>) obj2, (SlotWriter) obj3, (RememberManager) obj4);
                    return j.a;
                }
            });
            return;
        }
        this.writer.update(obj);
        if (obj instanceof RememberObserver) {
            record(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    androidx.appcompat.view.menu.a.m(applier, "<anonymous parameter 0>", slotWriter, "<anonymous parameter 1>", rememberManager, "rememberManager");
                    rememberManager.remembering((RememberObserver) obj);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    invoke((Applier<?>) obj2, (SlotWriter) obj3, (RememberManager) obj4);
                    return j.a;
                }
            });
            this.abandonSet.add(obj);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    public void useNode() throws KotlinNothingValueException {
        validateNodeExpected();
        if (!(!getInserting())) {
            throw s.k("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        recordDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            recordApplierOperation(new q<Applier<?>, SlotWriter, RememberManager, j>() { // from class: androidx.compose.runtime.ComposerImpl.useNode.2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return j.a;
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    m.h(applier, "applier");
                    m.h(slotWriter, "<anonymous parameter 1>");
                    m.h(rememberManager, "<anonymous parameter 2>");
                    Object current = applier.getCurrent();
                    m.f(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
                    ((ComposeNodeLifecycleCallback) current).onReuse();
                }
            });
        }
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startGroup(int i2, Object obj) throws KotlinNothingValueException {
        m2402startBaiHCIY(i2, obj, GroupKind.INSTANCE.m2417getGroupULZAiWs(), null);
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope(int group) {
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && m.c(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    m.f(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap = (PersistentMap) objGroupAux;
                    this.providerCache = persistentMap;
                    return persistentMap;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && m.c(this.reader.groupObjectKey(group), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = this.providerUpdates.get(group);
                    if (persistentMap2 == null) {
                        Object objGroupAux2 = this.reader.groupAux(group);
                        m.f(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        persistentMap2 = (PersistentMap) objGroupAux2;
                    }
                    this.providerCache = persistentMap2;
                    return persistentMap2;
                }
                group = this.reader.parent(group);
            }
        }
        PersistentMap persistentMap3 = this.parentProvider;
        this.providerCache = persistentMap3;
        return persistentMap3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/j;", "onRemembered", "onAbandoned", "onForgotten", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class CompositionContextHolder implements RememberObserver {
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            m.h(compositionContextImpl, "ref");
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\ba\u0010bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u000eJ*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010&\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#H\u0010¢\u0006\u0004\b$\u0010%J.\u0010'\u001a\u00020\u00022&\u0010\u001b\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#J\u001d\u0010-\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020\u0002H\u0010¢\u0006\u0004\b.\u0010/J\u000f\u00102\u001a\u00020\u0002H\u0010¢\u0006\u0004\b1\u0010/J\u0017\u00107\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b8\u00106J\u0019\u0010=\u001a\u0004\u0018\u00010:2\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u0010>\u001a\u00020:H\u0010¢\u0006\u0004\b?\u0010@R\u001a\u0010C\u001a\u00020B8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR0\u0010L\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010,R\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0(8\u0006¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010ORk\u0010Y\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#2&\u0010T\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\b&\u0010%\"\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010`\u001a\u00020Z8PX\u0090\u0004¢\u0006\f\u0012\u0004\b_\u0010/\u001a\u0004\b^\u0010\\¨\u0006c"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/j;", "dispose", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkj/p;)V", "composeInitial", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime_release", "()V", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "", "compoundHashKey", "I", "getCompoundHashKey$runtime_release", "()I", "", "collectingParameterInformation", "Z", "getCollectingParameterInformation$runtime_release", "()Z", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope", "Ldj/e;", "getEffectCoroutineContext$runtime_release", "()Ldj/e;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        private final MutableState compositionLocalScope = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;

        public CompositionContextImpl(int i2, boolean z) {
            this.compoundHashKey = i2;
            this.collectingParameterInformation = z;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope.getValue();
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(ControlledComposition composition, p<? super Composer, ? super Integer, j> content) {
            m.h(composition, "composition");
            m.h(content, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
            m.h(reference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        Iterator<Set<CompositionData>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release */
        public e getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public e getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
            m.h(reference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition composition) {
            m.h(composition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
            m.h(scope, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
            m.h(reference, "reference");
            m.h(data, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
            m.h(reference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
            m.h(table, "table");
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            m.h(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition composition) {
            m.h(composition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            m.h(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            v.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition composition) {
            m.h(composition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            m.h(persistentMap, "scope");
            setCompositionLocalScope(persistentMap);
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Float) {
            if (value == ((Number) objNextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Double) {
            if (value == ((Number) objNextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) throws KotlinNothingValueException {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
