package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0004R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "Lkotlin/j;", "reset", "", "encodedString", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "", "byte", "", "int", "", TypedValues.Custom.S_FLOAT, "Lkotlin/i;", "uLong", "encode-VKZWuLQ", TypedValues.Custom.S_STRING, "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class EncodeHelper {
    private Parcel parcel;

    public EncodeHelper() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.m.g(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }

    public final void encode(SpanStyle spanStyle) {
        kotlin.jvm.internal.m.h(spanStyle, "spanStyle");
        long jM4770getColor0d7_KjU = spanStyle.m4770getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m2819equalsimpl0(jM4770getColor0d7_KjU, companion.m2854getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4577encode8_81llA(spanStyle.m4770getColor0d7_KjU());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.m5445equalsimpl0(fontSize, companion2.m5459getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4574encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iM4900unboximpl = fontStyle.m4900unboximpl();
            encode((byte) 4);
            m4579encodenzbMABs(iM4900unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m4576encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m5445equalsimpl0(spanStyle.getLetterSpacing(), companion2.m5459getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4574encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fM5065unboximpl = baselineShift.m5065unboximpl();
            encode((byte) 8);
            m4575encode4Dl_Bck(fM5065unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2819equalsimpl0(spanStyle.getBackground(), companion.m2854getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4577encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m4574encodeR2X_6o(long textUnit) {
        long jM5447getTypeUIouoOA = TextUnit.m5447getTypeUIouoOA(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b = 0;
        if (!TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5482getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5481getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5480getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(textUnit), companion.m5482getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m5448getValueimpl(textUnit));
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m4575encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m4576encode6p3vJLY(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b = 0;
        if (!FontSynthesis.m4906equalsimpl0(fontSynthesis, companion.m4913getNoneGVVA2EU())) {
            if (FontSynthesis.m4906equalsimpl0(fontSynthesis, companion.m4912getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m4906equalsimpl0(fontSynthesis, companion.m4915getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m4906equalsimpl0(fontSynthesis, companion.m4914getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m4577encode8_81llA(long color) {
        m4578encodeVKZWuLQ(color);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m4578encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m4579encodenzbMABs(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b = 0;
        if (!FontStyle.m4897equalsimpl0(fontStyle, companion.m4902getNormal_LCdwA()) && FontStyle.m4897equalsimpl0(fontStyle, companion.m4901getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    public final String encodedString() {
        String strEncodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        kotlin.jvm.internal.m.g(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.m.g(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }

    public final void encode(FontWeight fontWeight) {
        kotlin.jvm.internal.m.h(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        kotlin.jvm.internal.m.h(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        kotlin.jvm.internal.m.h(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        kotlin.jvm.internal.m.h(shadow, "shadow");
        m4577encode8_81llA(shadow.getColor());
        encode(Offset.m2585getXimpl(shadow.getOffset()));
        encode(Offset.m2586getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(int i2) {
        this.parcel.writeInt(i2);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    public final void encode(String str) {
        kotlin.jvm.internal.m.h(str, TypedValues.Custom.S_STRING);
        this.parcel.writeString(str);
    }
}
