package androidx.compose.runtime.reflect;

import a.l;
import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import jj.a;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: ComposableMethod.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0002H\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002\u001a7\u0010\u0010\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\n\"\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", "T", "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final ComposableMethod asComposableMethod(Method method) {
        m.h(method, "<this>");
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i2, int i3) {
        if (i2 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i2 + i3)) / 10.0d);
    }

    private static final int defaultParamCount(int i2) {
        return (int) Math.ceil(((double) i2) / 31.0d);
    }

    private static final <T> T[] dup(T t, int i2) {
        f fVarC = l.C(0, i2);
        ArrayList arrayList = new ArrayList(a.Q0(fVarC, 10));
        f0 it = fVarC.iterator();
        while (it.hasNext()) {
            it.nextInt();
            arrayList.add(t);
        }
        m.n();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        m.g(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (m.c(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int iChangedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i3 = length + 1 + iChangedParamCount;
        int length2 = method.getParameterTypes().length;
        int iDefaultParamCount = (length2 != i3) != false ? defaultParamCount(length) : 0;
        return new ComposableInfo(i3 + iDefaultParamCount == length2, length, iChangedParamCount, iDefaultParamCount);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method declaredMethod;
        m.h(cls, "<this>");
        m.h(str, "methodName");
        m.h(clsArr, "args");
        int iChangedParamCount = changedParamCount(clsArr.length, 0);
        try {
            m.l lVar = new m.l(3);
            lVar.b(clsArr);
            lVar.a(Composer.class);
            Class cls2 = Integer.TYPE;
            f fVarC = l.C(0, iChangedParamCount);
            ArrayList arrayList = new ArrayList(a.Q0(fVarC, 10));
            f0 it = fVarC.iterator();
            while (it.hasNext()) {
                it.nextInt();
                arrayList.add(cls2);
            }
            lVar.b(arrayList.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) lVar.e(new Class[lVar.c()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(clsArr.length);
            try {
                m.l lVar2 = new m.l(4);
                lVar2.b(clsArr);
                lVar2.a(Composer.class);
                Class cls3 = Integer.TYPE;
                f fVarC2 = l.C(0, iChangedParamCount);
                ArrayList arrayList2 = new ArrayList(a.Q0(fVarC2, 10));
                f0 it2 = fVarC2.iterator();
                while (it2.hasNext()) {
                    it2.nextInt();
                    arrayList2.add(cls3);
                }
                lVar2.b(arrayList2.toArray(new Class[0]));
                Class cls4 = Integer.TYPE;
                f fVarC3 = l.C(0, iDefaultParamCount);
                ArrayList arrayList3 = new ArrayList(a.Q0(fVarC3, 10));
                f0 it3 = fVarC3.iterator();
                while (it3.hasNext()) {
                    it3.nextInt();
                    arrayList3.add(cls4);
                }
                lVar2.b(arrayList3.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) lVar2.e(new Class[lVar2.c()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            ComposableMethod composableMethodAsComposableMethod = asComposableMethod(declaredMethod);
            m.e(composableMethodAsComposableMethod);
            return composableMethodAsComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }
}
