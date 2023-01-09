// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class OdkViewBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView groupText;

  @NonNull
  public final MaterialButton launchIntentButton;

  @NonNull
  public final NestedScrollView odkViewContainer;

  @NonNull
  public final LinearLayout widgets;

  private OdkViewBinding(@NonNull NestedScrollView rootView, @NonNull TextView groupText,
      @NonNull MaterialButton launchIntentButton, @NonNull NestedScrollView odkViewContainer,
      @NonNull LinearLayout widgets) {
    this.rootView = rootView;
    this.groupText = groupText;
    this.launchIntentButton = launchIntentButton;
    this.odkViewContainer = odkViewContainer;
    this.widgets = widgets;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static OdkViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OdkViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.odk_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OdkViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.group_text;
      TextView groupText = rootView.findViewById(id);
      if (groupText == null) {
        break missingId;
      }

      id = R.id.launchIntentButton;
      MaterialButton launchIntentButton = rootView.findViewById(id);
      if (launchIntentButton == null) {
        break missingId;
      }

      NestedScrollView odkViewContainer = (NestedScrollView) rootView;

      id = R.id.widgets;
      LinearLayout widgets = rootView.findViewById(id);
      if (widgets == null) {
        break missingId;
      }

      return new OdkViewBinding((NestedScrollView) rootView, groupText, launchIntentButton,
          odkViewContainer, widgets);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
