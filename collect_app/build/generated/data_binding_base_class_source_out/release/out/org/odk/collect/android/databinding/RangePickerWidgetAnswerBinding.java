// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.MultiClickSafeButton;

public final class RangePickerWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView widgetAnswerText;

  @NonNull
  public final MultiClickSafeButton widgetButton;

  private RangePickerWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView widgetAnswerText, @NonNull MultiClickSafeButton widgetButton) {
    this.rootView = rootView;
    this.widgetAnswerText = widgetAnswerText;
    this.widgetButton = widgetButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RangePickerWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RangePickerWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.range_picker_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RangePickerWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.widget_answer_text;
      MaterialTextView widgetAnswerText = rootView.findViewById(id);
      if (widgetAnswerText == null) {
        break missingId;
      }

      id = R.id.widget_button;
      MultiClickSafeButton widgetButton = rootView.findViewById(id);
      if (widgetButton == null) {
        break missingId;
      }

      return new RangePickerWidgetAnswerBinding((LinearLayout) rootView, widgetAnswerText,
          widgetButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
