package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class g {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "transitionFlags":
                return TypedValues.TransitionType.TYPE_TRANSITION_FLAGS;
            case "duration":
                return TypedValues.TransitionType.TYPE_DURATION;
            case "motionInterpolator":
                return TypedValues.TransitionType.TYPE_INTERPOLATOR;
            case "autoTransition":
                return TypedValues.TransitionType.TYPE_AUTO_TRANSITION;
            case "to":
                return TypedValues.TransitionType.TYPE_TO;
            case "from":
                return TypedValues.TransitionType.TYPE_FROM;
            case "pathMotionArc":
                return 509;
            case "staggered":
                return TypedValues.TransitionType.TYPE_STAGGERED;
            default:
                return -1;
        }
    }

    public static int b(int i2) {
        if (i2 == 509) {
            return 2;
        }
        switch (i2) {
            case TypedValues.TransitionType.TYPE_DURATION /* 700 */:
                return 2;
            case TypedValues.TransitionType.TYPE_FROM /* 701 */:
            case TypedValues.TransitionType.TYPE_TO /* 702 */:
                return 8;
            default:
                switch (i2) {
                    case TypedValues.TransitionType.TYPE_INTERPOLATOR /* 705 */:
                    case TypedValues.TransitionType.TYPE_TRANSITION_FLAGS /* 707 */:
                        return 8;
                    case TypedValues.TransitionType.TYPE_STAGGERED /* 706 */:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
