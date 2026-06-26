package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;R5\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR5\u0010\u0013\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00110\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR/\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR/\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR;\u0010\u001b\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001a0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR/\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR)\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000bR)\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u000bR)\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b%\u0010\u000bR)\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u000bR)\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b)\u0010\u000bR)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR)\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000bR#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u0010\u000bR)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000bR)\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b5\u0010\u000bR)\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b7\u0010\u000bR)\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b9\u0010\u000b¨\u0006<"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "GetTextLayoutResult", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "Lkotlin/Function2;", "", "ScrollBy", "getScrollBy", "", "ScrollToIndex", "getScrollToIndex", "SetProgress", "getSetProgress", "Lkotlin/Function3;", "SetSelection", "getSetSelection", "Landroidx/compose/ui/text/AnnotatedString;", "SetText", "getSetText", "CopyText", "getCopyText", "CutText", "getCutText", "PasteText", "getPasteText", "Expand", "getExpand", "Collapse", "getCollapse", "Dismiss", "getDismiss", "RequestFocus", "getRequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "getCustomActions", "PageUp", "getPageUp", "PageLeft", "getPageLeft", "PageDown", "getPageDown", "PageRight", "getPageRight", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsActions {
    public static final int $stable = 0;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> ScrollBy;
    private static final SemanticsPropertyKey<AccessibilityAction<l<Integer, Boolean>>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<l<Float, Boolean>>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> SetText;

    static {
        SemanticsPropertiesKt.AnonymousClass1 anonymousClass1 = SemanticsPropertiesKt.AnonymousClass1.INSTANCE;
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", anonymousClass1);
        OnClick = new SemanticsPropertyKey<>("OnClick", anonymousClass1);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", anonymousClass1);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", anonymousClass1);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", anonymousClass1);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", anonymousClass1);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", anonymousClass1);
        SetText = new SemanticsPropertyKey<>("SetText", anonymousClass1);
        CopyText = new SemanticsPropertyKey<>("CopyText", anonymousClass1);
        CutText = new SemanticsPropertyKey<>("CutText", anonymousClass1);
        PasteText = new SemanticsPropertyKey<>("PasteText", anonymousClass1);
        Expand = new SemanticsPropertyKey<>("Expand", anonymousClass1);
        Collapse = new SemanticsPropertyKey<>("Collapse", anonymousClass1);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", anonymousClass1);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", anonymousClass1);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", null, 2, null);
        PageUp = new SemanticsPropertyKey<>("PageUp", anonymousClass1);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", anonymousClass1);
        PageDown = new SemanticsPropertyKey<>("PageDown", anonymousClass1);
        PageRight = new SemanticsPropertyKey<>("PageRight", anonymousClass1);
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<kj.a<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }
}
