package tj;

import kj.p;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import rj.f;

/* JADX INFO: compiled from: reflectLambda.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a extends FunctionReference implements p<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f169a = new a();

    public a() {
        super(2);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final f getOwner() {
        return q.a(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf.Function function = (ProtoBuf.Function) obj2;
        m.h(memberDeserializer, "p0");
        m.h(function, "p1");
        return memberDeserializer.loadFunction(function);
    }
}
