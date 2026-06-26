package androidx.compose.foundation.text;

import a.b;
import a6.h;
import androidx.appcompat.widget.v;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HeightInLinesModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\"\u0014\u0010\t\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "minLines", "maxLines", "heightInLines", "Lkotlin/j;", "validateMinMaxLines", "DefaultMinLines", "I", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static final Modifier heightInLines(Modifier modifier, final TextStyle textStyle, final int i2, final int i3) {
        m.h(modifier, "<this>");
        m.h(textStyle, "textStyle");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                b.d(inspectorInfo, "$this$null", "heightInLines").set("minLines", Integer.valueOf(i2));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i3));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i4) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 408240218)) {
                    ComposerKt.traceEventStart(408240218, i4, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i2, i3);
                if (i2 == 1 && i3 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle2 = textStyle;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(textStyle2) | composer.changed(layoutDirection);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextStyle textStyle3 = (TextStyle) objRememberedValue;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM4833getFontStyle4Lr2A7w = textStyle3.m4833getFontStyle4Lr2A7w();
                    int iM4900unboximpl = fontStyleM4833getFontStyle4Lr2A7w != null ? fontStyleM4833getFontStyle4Lr2A7w.m4900unboximpl() : FontStyle.INSTANCE.m4902getNormal_LCdwA();
                    FontSynthesis fontSynthesisM4834getFontSynthesisZQGJjVo = textStyle3.m4834getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo4872resolveDPcqOEQ(fontFamily, fontWeight, iM4900unboximpl, fontSynthesisM4834getFontSynthesisZQGJjVo != null ? fontSynthesisM4834getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m4912getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                State state = (State) objRememberedValue2;
                Object[] objArr = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                boolean zChanged3 = false;
                for (int i5 = 0; i5 < 5; i5++) {
                    zChanged3 |= composer.changed(objArr[i5]);
                }
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m5426getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                int iIntValue = ((Number) objRememberedValue3).intValue();
                Object[] objArr2 = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                boolean zChanged4 = false;
                for (int i6 = 0; i6 < 5; i6++) {
                    zChanged4 |= composer.changed(objArr2[i6]);
                }
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf(IntSize.m5426getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                int i7 = i2;
                Integer numValueOf = i7 == 1 ? null : Integer.valueOf(((i7 - 1) * iIntValue2) + iIntValue);
                int i8 = i3;
                Integer numValueOf2 = i8 != Integer.MAX_VALUE ? Integer.valueOf(((i8 - 1) * iIntValue2) + iIntValue) : null;
                Modifier modifierM491heightInVpY3zN4 = SizeKt.m491heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo345toDpu2uoSUM(numValueOf.intValue()) : Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo345toDpu2uoSUM(numValueOf2.intValue()) : Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM491heightInVpY3zN4;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 1;
        }
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i2, i3);
    }

    public static final void validateMinMaxLines(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            throw new IllegalArgumentException(v.f("both minLines ", i2, " and maxLines ", i3, " must be greater than zero").toString());
        }
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException(h.d("minLines ", i2, " must be less than or equal to maxLines ", i3).toString());
        }
    }
}
