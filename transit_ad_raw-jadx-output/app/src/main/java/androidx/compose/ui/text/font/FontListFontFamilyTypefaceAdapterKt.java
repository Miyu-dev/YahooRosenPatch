package androidx.compose.ui.text.font;

import a.f;
import androidx.appcompat.R;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.j;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object objLoadBlocking;
        Object objM4862unboximpl;
        int size = list.size();
        ArrayList arrayListX = null;
        for (int i2 = 0; i2 < size; i2++) {
            Font font = list.get(i2);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m4884equalsimpl0(loadingStrategy, companion.m4889getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                    }
                    if (asyncTypefaceResult != null) {
                        objLoadBlocking = asyncTypefaceResult.m4862unboximpl();
                    } else {
                        j jVar = j.a;
                        try {
                            objLoadBlocking = platformFontLoader.loadBlocking(font);
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objLoadBlocking, false, 8, null);
                        } catch (Exception e) {
                            throw new IllegalStateException("Unable to load font " + font, e);
                        }
                    }
                }
                if (objLoadBlocking != null) {
                    return new Pair<>(arrayListX, FontSynthesis_androidKt.m4916synthesizeTypefaceFxwP2eA(typefaceRequest.m4939getFontSynthesisGVVA2EU(), objLoadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m4938getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m4884equalsimpl0(loadingStrategy, companion.m4890getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        objM4862unboximpl = asyncTypefaceResult2.m4862unboximpl();
                    } else {
                        j jVar2 = j.a;
                        try {
                            objM4862unboximpl = Result.constructor-impl(platformFontLoader.loadBlocking(font));
                        } catch (Throwable th) {
                            objM4862unboximpl = Result.constructor-impl(li.c.l(th));
                        }
                        if (Result.isFailure-impl(objM4862unboximpl)) {
                            objM4862unboximpl = null;
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objM4862unboximpl, false, 8, null);
                    }
                }
                if (objM4862unboximpl != null) {
                    return new Pair<>(arrayListX, FontSynthesis_androidKt.m4916synthesizeTypefaceFxwP2eA(typefaceRequest.m4939getFontSynthesisGVVA2EU(), objM4862unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m4938getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m4884equalsimpl0(loadingStrategy, companion.m4888getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM4854get1ASDuI8 = asyncTypefaceCache.m4854get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM4854get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m4860isPermanentFailureimpl(asyncTypefaceResultM4854get1ASDuI8.m4862unboximpl()) && asyncTypefaceResultM4854get1ASDuI8.m4862unboximpl() != null) {
                        return new Pair<>(arrayListX, FontSynthesis_androidKt.m4916synthesizeTypefaceFxwP2eA(typefaceRequest.m4939getFontSynthesisGVVA2EU(), asyncTypefaceResultM4854get1ASDuI8.m4862unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m4938getFontStyle_LCdwA()));
                    }
                } else if (arrayListX == null) {
                    arrayListX = f.X(font);
                } else {
                    arrayListX.add(font);
                }
            }
        }
        return new Pair<>(arrayListX, lVar.invoke(typefaceRequest));
    }
}
