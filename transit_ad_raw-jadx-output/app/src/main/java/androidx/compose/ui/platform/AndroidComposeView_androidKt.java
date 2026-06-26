package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a!\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\"\u0018\u0010 \u001a\u00020\u0002*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirectionFromInt", "Landroidx/compose/ui/graphics/Matrix;", "other", "Lkotlin/j;", "preTransform-JiSxe2E", "([F[F)V", "preTransform", "m1", "row", "m2", "column", "", "dot-p89u6pk", "([FI[FI)F", "dot", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputServiceFactory", "Lkj/l;", "getTextInputServiceFactory", "()Lkj/l;", "setTextInputServiceFactory", "(Lkj/l;)V", "getTextInputServiceFactory$annotations", "()V", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidComposeView_androidKt {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static kj.l<? super PlatformTextInputService, ? extends TextInputService> textInputServiceFactory = new kj.l<PlatformTextInputService, TextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1
        public final TextInputService invoke(PlatformTextInputService platformTextInputService) {
            kotlin.jvm.internal.m.h(platformTextInputService, "it");
            return new TextInputService(platformTextInputService);
        }
    };

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m4526dotp89u6pk(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4 + 0] * fArr2[0 + i3]);
    }

    public static final LayoutDirection getLocaleLayoutDirection(Configuration configuration) {
        kotlin.jvm.internal.m.h(configuration, "<this>");
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    public static final kj.l<PlatformTextInputService, TextInputService> getTextInputServiceFactory() {
        return textInputServiceFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i2) {
        return i2 != 0 ? i2 != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl : LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m4527preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM4526dotp89u6pk = m4526dotp89u6pk(fArr2, 0, fArr, 0);
        float fM4526dotp89u6pk2 = m4526dotp89u6pk(fArr2, 0, fArr, 1);
        float fM4526dotp89u6pk3 = m4526dotp89u6pk(fArr2, 0, fArr, 2);
        float fM4526dotp89u6pk4 = m4526dotp89u6pk(fArr2, 0, fArr, 3);
        float fM4526dotp89u6pk5 = m4526dotp89u6pk(fArr2, 1, fArr, 0);
        float fM4526dotp89u6pk6 = m4526dotp89u6pk(fArr2, 1, fArr, 1);
        float fM4526dotp89u6pk7 = m4526dotp89u6pk(fArr2, 1, fArr, 2);
        float fM4526dotp89u6pk8 = m4526dotp89u6pk(fArr2, 1, fArr, 3);
        float fM4526dotp89u6pk9 = m4526dotp89u6pk(fArr2, 2, fArr, 0);
        float fM4526dotp89u6pk10 = m4526dotp89u6pk(fArr2, 2, fArr, 1);
        float fM4526dotp89u6pk11 = m4526dotp89u6pk(fArr2, 2, fArr, 2);
        float fM4526dotp89u6pk12 = m4526dotp89u6pk(fArr2, 2, fArr, 3);
        float fM4526dotp89u6pk13 = m4526dotp89u6pk(fArr2, 3, fArr, 0);
        float fM4526dotp89u6pk14 = m4526dotp89u6pk(fArr2, 3, fArr, 1);
        float fM4526dotp89u6pk15 = m4526dotp89u6pk(fArr2, 3, fArr, 2);
        float fM4526dotp89u6pk16 = m4526dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM4526dotp89u6pk;
        fArr[1] = fM4526dotp89u6pk2;
        fArr[2] = fM4526dotp89u6pk3;
        fArr[3] = fM4526dotp89u6pk4;
        fArr[4] = fM4526dotp89u6pk5;
        fArr[5] = fM4526dotp89u6pk6;
        fArr[6] = fM4526dotp89u6pk7;
        fArr[7] = fM4526dotp89u6pk8;
        fArr[8] = fM4526dotp89u6pk9;
        fArr[9] = fM4526dotp89u6pk10;
        fArr[10] = fM4526dotp89u6pk11;
        fArr[11] = fM4526dotp89u6pk12;
        fArr[12] = fM4526dotp89u6pk13;
        fArr[13] = fM4526dotp89u6pk14;
        fArr[14] = fM4526dotp89u6pk15;
        fArr[15] = fM4526dotp89u6pk16;
    }

    public static final void setTextInputServiceFactory(kj.l<? super PlatformTextInputService, ? extends TextInputService> lVar) {
        kotlin.jvm.internal.m.h(lVar, "<set-?>");
        textInputServiceFactory = lVar;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getTextInputServiceFactory$annotations() {
    }
}
