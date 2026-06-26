package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;
import androidx.constraintlayout.core.widgets.Optimizer;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public class Cache {
    Pools.Pool<ArrayRow> optimizedArrayRowPool = new Pools.SimplePool(Optimizer.OPTIMIZATION_CACHE_MEASURES);
    Pools.Pool<ArrayRow> arrayRowPool = new Pools.SimplePool(Optimizer.OPTIMIZATION_CACHE_MEASURES);
    Pools.Pool<SolverVariable> solverVariablePool = new Pools.SimplePool(Optimizer.OPTIMIZATION_CACHE_MEASURES);
    SolverVariable[] mIndexedVariables = new SolverVariable[32];
}
