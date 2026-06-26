package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ShaderBrushSpan.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R'\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/j;", "updateDrawState", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "", "alpha", "F", "getAlpha", "()F", "Landroidx/compose/ui/geometry/Size;", "size", "J", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "Lkotlin/Pair;", "Landroid/graphics/Shader;", "cachedShader", "Lkotlin/Pair;", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    private final float alpha;
    private Pair<Size, ? extends Shader> cachedShader;
    private final ShaderBrush shaderBrush;
    private long size;

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        m.h(shaderBrush, "shaderBrush");
        this.shaderBrush = shaderBrush;
        this.alpha = f;
        this.size = Size.INSTANCE.m2662getUnspecifiedNHjbRc();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m5058setSizeuvyYCjk(long j) {
        this.size = j;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m.h(textPaint, "textPaint");
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        if (this.size == Size.INSTANCE.m2662getUnspecifiedNHjbRc()) {
            return;
        }
        Pair<Size, ? extends Shader> pair = this.cachedShader;
        Shader shaderMo2793createShaderuvyYCjk = (pair == null || !Size.m2650equalsimpl0(((Size) pair.getFirst()).getPackedValue(), this.size)) ? this.shaderBrush.mo2793createShaderuvyYCjk(this.size) : (Shader) pair.getSecond();
        textPaint.setShader(shaderMo2793createShaderuvyYCjk);
        this.cachedShader = new Pair<>(Size.m2642boximpl(this.size), shaderMo2793createShaderuvyYCjk);
    }
}
