// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ArbitraryFileWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView arbitraryFileAnswerText;

  @NonNull
  public final MaterialButton arbitraryFileButton;

  private ArbitraryFileWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView arbitraryFileAnswerText,
      @NonNull MaterialButton arbitraryFileButton) {
    this.rootView = rootView;
    this.arbitraryFileAnswerText = arbitraryFileAnswerText;
    this.arbitraryFileButton = arbitraryFileButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ArbitraryFileWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ArbitraryFileWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.arbitrary_file_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ArbitraryFileWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.arbitrary_file_answer_text;
      MaterialTextView arbitraryFileAnswerText = rootView.findViewById(id);
      if (arbitraryFileAnswerText == null) {
        break missingId;
      }

      id = R.id.arbitrary_file_button;
      MaterialButton arbitraryFileButton = rootView.findViewById(id);
      if (arbitraryFileButton == null) {
        break missingId;
      }

      return new ArbitraryFileWidgetAnswerBinding((LinearLayout) rootView, arbitraryFileAnswerText,
          arbitraryFileButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
