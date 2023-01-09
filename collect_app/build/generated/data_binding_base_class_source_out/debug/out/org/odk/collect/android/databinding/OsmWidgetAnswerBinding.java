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

public final class OsmWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView errorText;

  @NonNull
  public final MultiClickSafeButton launchOpenMapKitButton;

  @NonNull
  public final MaterialTextView osmFileHeaderText;

  @NonNull
  public final MaterialTextView osmFileText;

  private OsmWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView errorText, @NonNull MultiClickSafeButton launchOpenMapKitButton,
      @NonNull MaterialTextView osmFileHeaderText, @NonNull MaterialTextView osmFileText) {
    this.rootView = rootView;
    this.errorText = errorText;
    this.launchOpenMapKitButton = launchOpenMapKitButton;
    this.osmFileHeaderText = osmFileHeaderText;
    this.osmFileText = osmFileText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OsmWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OsmWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.osm_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OsmWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.error_text;
      MaterialTextView errorText = rootView.findViewById(id);
      if (errorText == null) {
        break missingId;
      }

      id = R.id.launch_open_map_kit_button;
      MultiClickSafeButton launchOpenMapKitButton = rootView.findViewById(id);
      if (launchOpenMapKitButton == null) {
        break missingId;
      }

      id = R.id.osm_file_header_text;
      MaterialTextView osmFileHeaderText = rootView.findViewById(id);
      if (osmFileHeaderText == null) {
        break missingId;
      }

      id = R.id.osm_file_text;
      MaterialTextView osmFileText = rootView.findViewById(id);
      if (osmFileText == null) {
        break missingId;
      }

      return new OsmWidgetAnswerBinding((LinearLayout) rootView, errorText, launchOpenMapKitButton,
          osmFileHeaderText, osmFileText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}