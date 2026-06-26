package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 h2\u00020\u0001:\u0001hB]\b\u0000\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010G\u001a\u00020@\u0012\u0006\u0010O\u001a\u00020@\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\bZ\u0010[BA\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\\\u001a\u00020\u0002\u0012\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E\u0012\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E¢\u0006\u0004\bZ\u0010]BY\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E\u0012\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b¢\u0006\u0004\bZ\u0010^B!\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\\\u001a\u00020\u0002\u0012\u0006\u0010_\u001a\u000206¢\u0006\u0004\bZ\u0010`B)\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010_\u001a\u000206¢\u0006\u0004\bZ\u0010aB1\b\u0010\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010_\u001a\u000206\u0012\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\bZ\u0010bB!\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\\\u001a\u00020\u0002\u0012\u0006\u0010c\u001a\u00020F¢\u0006\u0004\bZ\u0010dB)\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010c\u001a\u00020F¢\u0006\u0004\bZ\u0010eBA\b\u0010\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010c\u001a\u00020F\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b\u0012\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\bZ\u0010fB!\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bZ\u0010gJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010-\u001a\u00020\tH\u0016R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0019\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b>\u0010=R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b?\u0010=R\u001a\u0010A\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010DR\u001a\u0010M\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0E8\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010JR\u001a\u0010Q\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010DR\u001a\u0010S\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bS\u0010UR\u001a\u0010V\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bV\u0010U\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006i"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "getPrimaries", "getTransform", "getInverseTransform", "primaries", "transform", "inverseTransform", "", "component", "", "getMinValue", "getMaxValue", "r", "g", "b", "toLinear", "v", "fromLinear", "toXyz", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "F", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics_release", "()[F", "getTransform$ui_graphics_release", "getInverseTransform$ui_graphics_release", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetfOrig", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "Lkotlin/Function1;", "", "oetf", "Lkj/l;", "getOetf", "()Lkj/l;", "oetfFunc", "getOetfFunc$ui_graphics_release", "eotfOrig", "getEotfOrig$ui_graphics_release", "eotf", "getEotf", "eotfFunc", "getEotfFunc$ui_graphics_release", "isWideGamut", "Z", "()Z", "isSrgb", "", HintConstants.AUTOFILL_HINT_NAME, "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "(Ljava/lang/String;[FLkj/l;Lkj/l;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkj/l;Lkj/l;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new d(0);
    private final kj.l<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final kj.l<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* JADX INFO: compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] primaries) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean compare(double point, DoubleFunction a2, DoubleFunction b) {
            return Math.abs(a2.invoke(point) - b.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, ((1.0f - f) - f2) * f20, f21 * f3, f18, ((1.0f - f3) - f4) * f21, f22 * f5, f17, ((1.0f - f5) - f6) * f22};
        }

        private final boolean contains(float[] p1, float[] p2) {
            float f = p1[0] - p2[0];
            float f2 = p1[1] - p2[1];
            float[] fArr = {f, f2, p1[2] - p2[2], p1[3] - p2[3], p1[4] - p2[4], p1[5] - p2[5]};
            return cross(f, f2, p2[0] - p2[4], p2[1] - p2[5]) >= 0.0f && cross(p2[0] - p2[2], p2[1] - p2[3], fArr[0], fArr[1]) >= 0.0f && cross(fArr[2], fArr[3], p2[2] - p2[0], p2[3] - p2[1]) >= 0.0f && cross(p2[2] - p2[4], p2[3] - p2[5], fArr[2], fArr[3]) >= 0.0f && cross(fArr[4], fArr[5], p2[4] - p2[2], p2[5] - p2[3]) >= 0.0f && cross(p2[4] - p2[0], p2[5] - p2[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (!(min == 0.0f)) {
                return false;
            }
            if (!(max == 1.0f)) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, OETF, srgb.getOetfOrig()) || !compare(d, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            return (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (min < 0.0f && max > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f = primaries[0];
                float f2 = primaries[1];
                float f3 = f + f2 + primaries[2];
                fArr[0] = f / f3;
                fArr[1] = f2 / f3;
                float f4 = primaries[3];
                float f5 = primaries[4];
                float f6 = f4 + f5 + primaries[5];
                fArr[2] = f4 / f6;
                fArr[3] = f5 / f6;
                float f7 = primaries[6];
                float f8 = primaries[7];
                float f9 = f7 + f8 + primaries[8];
                fArr[4] = f7 / f9;
                fArr[5] = f8 / f9;
            } else {
                kotlin.collections.n.p0(primaries, fArr, 6, 6);
            }
            return fArr;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] toXYZ) {
            kotlin.jvm.internal.m.h(toXYZ, "toXYZ");
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            float f4 = fArrMul3x3Float32[0] + fArrMul3x3Float32[1] + fArrMul3x3Float32[2];
            float f5 = fArrMul3x3Float33[0] + fArrMul3x3Float33[1] + fArrMul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, fArrMul3x3Float32[0] / f4, fArrMul3x3Float32[1] / f4, fArrMul3x3Float33[0] / f5, fArrMul3x3Float33[1] / f5};
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i2) {
        super(str, ColorModel.INSTANCE.m3202getRgbxdoWZVw(), i2, null);
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "primaries");
        kotlin.jvm.internal.m.h(whitePoint, "whitePoint");
        kotlin.jvm.internal.m.h(doubleFunction, "oetf");
        kotlin.jvm.internal.m.h(doubleFunction2, "eotf");
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new kj.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }

            public final Double invoke(double d) {
                return Double.valueOf(a.l.g(this.this$0.getOetfOrig().invoke(d), this.this$0.min, this.this$0.max));
            }
        };
        int i3 = 0;
        this.oetfFunc = new j(this, i3);
        this.eotfOrig = doubleFunction2;
        this.eotf = new kj.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }

            public final Double invoke(double d) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(a.l.g(d, this.this$0.min, this.this$0.max)));
            }
        };
        this.eotfFunc = new k(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f, f2);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(kj.l lVar, double d) {
        kotlin.jvm.internal.m.h(lVar, "$oetf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(kj.l lVar, double d) {
        kotlin.jvm.internal.m.h(lVar, "$eotf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(kj.l lVar, double d) {
        kotlin.jvm.internal.m.h(lVar, "$oetf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(kj.l lVar, double d) {
        kotlin.jvm.internal.m.h(lVar, "$eotf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters, double d) {
        kotlin.jvm.internal.m.h(transferParameters, "$function");
        return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters, double d) {
        kotlin.jvm.internal.m.h(transferParameters, "$function");
        return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters, double d) {
        kotlin.jvm.internal.m.h(transferParameters, "$function");
        return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters, double d) {
        kotlin.jvm.internal.m.h(transferParameters, "$function");
        return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d) {
        kotlin.jvm.internal.m.h(rgb, "this$0");
        return rgb.eotfOrig.invoke(a.l.g(d, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        kotlin.jvm.internal.m.h(rgb, "this$0");
        return a.l.g(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !kotlin.jvm.internal.m.c(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return kotlin.jvm.internal.m.c(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (kotlin.jvm.internal.m.c(this.oetfOrig, rgb.oetfOrig)) {
            return kotlin.jvm.internal.m.c(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    public final float[] fromLinear(float r, float g, float b) {
        return fromLinear(new float[]{r, g, b});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        kotlin.jvm.internal.m.h(v, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v);
        v[0] = (float) this.oetfFunc.invoke(v[0]);
        v[1] = (float) this.oetfFunc.invoke(v[1]);
        v[2] = (float) this.oetfFunc.invoke(v[2]);
        return v;
    }

    public final kj.l<Double, Double> getEotf() {
        return this.eotf;
    }

    /* JADX INFO: renamed from: getEotfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.m.g(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* JADX INFO: renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    public final kj.l<Double, Double> getOetf() {
        return this.oetf;
    }

    /* JADX INFO: renamed from: getOetfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.m.g(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* JADX INFO: renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.m.g(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* JADX INFO: renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.min;
        int iFloatToIntBits = (iHashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f2 == 0.0f) ? Float.floatToIntBits(f2) : 0)) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float r, float g, float b) {
        return toLinear(new float[]{r, g, b});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v0);
        float fInvoke2 = (float) this.eotfFunc.invoke(v1);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        return (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(this.transform, fInvoke, fInvoke2, fInvoke3))) << 32) | (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(this.transform, fInvoke, fInvoke2, fInvoke3))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        kotlin.jvm.internal.m.h(v, "v");
        v[0] = (float) this.eotfFunc.invoke(v[0]);
        v[1] = (float) this.eotfFunc.invoke(v[1]);
        v[2] = (float) this.eotfFunc.invoke(v[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke(v0), (float) this.eotfFunc.invoke(v1), (float) this.eotfFunc.invoke(v2));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3205xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a2, ColorSpace colorSpace) {
        kotlin.jvm.internal.m.h(colorSpace, "colorSpace");
        return ColorKt.Color((float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, x, y, z)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, x, y, z)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, x, y, z)), a2, colorSpace);
    }

    public final float[] fromLinear(float[] v) {
        kotlin.jvm.internal.m.h(v, "v");
        v[0] = (float) this.oetfFunc.invoke(v[0]);
        v[1] = (float) this.oetfFunc.invoke(v[1]);
        v[2] = (float) this.oetfFunc.invoke(v[2]);
        return v;
    }

    public final float[] getInverseTransform(float[] inverseTransform) {
        kotlin.jvm.internal.m.h(inverseTransform, "inverseTransform");
        kotlin.collections.n.p0(this.inverseTransform, inverseTransform, 0, 14);
        return inverseTransform;
    }

    public final float[] getPrimaries(float[] primaries) {
        kotlin.jvm.internal.m.h(primaries, "primaries");
        kotlin.collections.n.p0(this.primaries, primaries, 0, 14);
        return primaries;
    }

    public final float[] getTransform(float[] transform) {
        kotlin.jvm.internal.m.h(transform, "transform");
        kotlin.collections.n.p0(this.transform, transform, 0, 14);
        return transform;
    }

    public final float[] toLinear(float[] v) {
        kotlin.jvm.internal.m.h(v, "v");
        v[0] = (float) this.eotfFunc.invoke(v[0]);
        v[1] = (float) this.eotfFunc.invoke(v[1]);
        v[2] = (float) this.eotfFunc.invoke(v[2]);
        return v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, kj.l<? super Double, Double> lVar, kj.l<? super Double, Double> lVar2) {
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "toXYZ");
        kotlin.jvm.internal.m.h(lVar, "oetf");
        kotlin.jvm.internal.m.h(lVar2, "eotf");
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, new h(lVar), new i(lVar2), 0.0f, 1.0f, null, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d) {
        return d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, kj.l<? super Double, Double> lVar, kj.l<? super Double, Double> lVar2, float f, float f2) {
        this(str, fArr, whitePoint, null, new c(lVar), new g(lVar2), f, f2, null, -1);
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "primaries");
        kotlin.jvm.internal.m.h(whitePoint, "whitePoint");
        kotlin.jvm.internal.m.h(lVar, "oetf");
        kotlin.jvm.internal.m.h(lVar2, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "toXYZ");
        kotlin.jvm.internal.m.h(transferParameters, "function");
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "primaries");
        kotlin.jvm.internal.m.h(whitePoint, "whitePoint");
        kotlin.jvm.internal.m.h(transferParameters, "function");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(java.lang.String r14, float[] r15, androidx.compose.ui.graphics.colorspace.WhitePoint r16, androidx.compose.ui.graphics.colorspace.TransferParameters r17, int r18) {
        /*
            r13 = this;
            r9 = r17
            java.lang.String r0 = "name"
            r1 = r14
            kotlin.jvm.internal.m.h(r14, r0)
            java.lang.String r0 = "primaries"
            r2 = r15
            kotlin.jvm.internal.m.h(r15, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r16
            kotlin.jvm.internal.m.h(r3, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.m.h(r9, r0)
            r4 = 0
            double r5 = r17.getE()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L2d
            r0 = r5
            goto L2e
        L2d:
            r0 = r6
        L2e:
            if (r0 == 0) goto L43
            double r10 = r17.getF()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L3a
            r0 = r5
            goto L3b
        L3a:
            r0 = r6
        L3b:
            if (r0 == 0) goto L43
            androidx.compose.ui.graphics.colorspace.l r0 = new androidx.compose.ui.graphics.colorspace.l
            r0.<init>(r9, r6)
            goto L48
        L43:
            androidx.compose.ui.graphics.colorspace.m r0 = new androidx.compose.ui.graphics.colorspace.m
            r0.<init>(r9)
        L48:
            r10 = r0
            double r11 = r17.getE()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L53
            r0 = r5
            goto L54
        L53:
            r0 = r6
        L54:
            if (r0 == 0) goto L68
            double r11 = r17.getF()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L5f
            goto L60
        L5f:
            r5 = r6
        L60:
            if (r5 == 0) goto L68
            androidx.compose.ui.graphics.colorspace.n r0 = new androidx.compose.ui.graphics.colorspace.n
            r0.<init>(r9)
            goto L6d
        L68:
            androidx.compose.ui.graphics.colorspace.o r0 = new androidx.compose.ui.graphics.colorspace.o
            r0.<init>(r9)
        L6d:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r10
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, double d) {
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "toXYZ");
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d) {
        this(str, fArr, whitePoint, d, 0.0f, 1.0f, -1);
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "primaries");
        kotlin.jvm.internal.m.h(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i2) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        kotlin.jvm.internal.m.h(fArr, "primaries");
        kotlin.jvm.internal.m.h(whitePoint, "whitePoint");
        if (d == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.e
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return Rgb._init_$lambda$10(d, d2);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.f
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return Rgb._init_$lambda$11(d, d2);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
        kotlin.jvm.internal.m.h(rgb, "colorSpace");
        kotlin.jvm.internal.m.h(fArr, "transform");
        kotlin.jvm.internal.m.h(whitePoint, "whitePoint");
    }
}
