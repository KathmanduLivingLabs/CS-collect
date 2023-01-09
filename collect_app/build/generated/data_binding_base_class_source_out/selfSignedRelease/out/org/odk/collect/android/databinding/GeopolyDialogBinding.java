// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class GeopolyDialogBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Spinner accuracyThreshold;

  @NonNull
  public final Spinner autoInterval;

  @NonNull
  public final LinearLayout autoOptions;

  @NonNull
  public final RadioButton automaticMode;

  @NonNull
  public final RadioButton manualMode;

  @NonNull
  public final RadioButton placementMode;

  @NonNull
  public final RadioGroup radioGroup;

  private GeopolyDialogBinding(@NonNull ScrollView rootView, @NonNull Spinner accuracyThreshold,
      @NonNull Spinner autoInterval, @NonNull LinearLayout autoOptions,
      @NonNull RadioButton automaticMode, @NonNull RadioButton manualMode,
      @NonNull RadioButton placementMode, @NonNull RadioGroup radioGroup) {
    this.rootView = rootView;
    this.accuracyThreshold = accuracyThreshold;
    this.autoInterval = autoInterval;
    this.autoOptions = autoOptions;
    this.automaticMode = automaticMode;
    this.manualMode = manualMode;
    this.placementMode = placementMode;
    this.radioGroup = radioGroup;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static GeopolyDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GeopolyDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.geopoly_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GeopolyDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accuracy_threshold;
      Spinner accuracyThreshold = rootView.findViewById(id);
      if (accuracyThreshold == null) {
        break missingId;
      }

      id = R.id.auto_interval;
      Spinner autoInterval = rootView.findViewById(id);
      if (autoInterval == null) {
        break missingId;
      }

      id = R.id.auto_options;
      LinearLayout autoOptions = rootView.findViewById(id);
      if (autoOptions == null) {
        break missingId;
      }

      id = R.id.automatic_mode;
      RadioButton automaticMode = rootView.findViewById(id);
      if (automaticMode == null) {
        break missingId;
      }

      id = R.id.manual_mode;
      RadioButton manualMode = rootView.findViewById(id);
      if (manualMode == null) {
        break missingId;
      }

      id = R.id.placement_mode;
      RadioButton placementMode = rootView.findViewById(id);
      if (placementMode == null) {
        break missingId;
      }

      id = R.id.radio_group;
      RadioGroup radioGroup = rootView.findViewById(id);
      if (radioGroup == null) {
        break missingId;
      }

      return new GeopolyDialogBinding((ScrollView) rootView, accuracyThreshold, autoInterval,
          autoOptions, automaticMode, manualMode, placementMode, radioGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
