package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
final class AppCompatTextClassifierHelper {

    @Nullable
    private TextClassifier mTextClassifier;

    @NonNull
    private TextView mTextView;

    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public static final class Api26Impl {
        private Api26Impl() {
        }

        @NonNull
        @DoNotInline
        public static TextClassifier getTextClassifier(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(@NonNull TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    @NonNull
    @RequiresApi(api = R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        return textClassifier == null ? Api26Impl.getTextClassifier(this.mTextView) : textClassifier;
    }

    @RequiresApi(api = R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }
}
