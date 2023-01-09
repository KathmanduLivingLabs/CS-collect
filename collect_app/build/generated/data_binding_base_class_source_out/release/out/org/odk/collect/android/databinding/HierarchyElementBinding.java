// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class HierarchyElementBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final TextView primaryText;

  @NonNull
  public final TextView secondaryText;

  private HierarchyElementBinding(@NonNull RelativeLayout rootView, @NonNull ImageView icon,
      @NonNull TextView primaryText, @NonNull TextView secondaryText) {
    this.rootView = rootView;
    this.icon = icon;
    this.primaryText = primaryText;
    this.secondaryText = secondaryText;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HierarchyElementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HierarchyElementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.hierarchy_element, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HierarchyElementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.icon;
      ImageView icon = rootView.findViewById(id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.primary_text;
      TextView primaryText = rootView.findViewById(id);
      if (primaryText == null) {
        break missingId;
      }

      id = R.id.secondary_text;
      TextView secondaryText = rootView.findViewById(id);
      if (secondaryText == null) {
        break missingId;
      }

      return new HierarchyElementBinding((RelativeLayout) rootView, icon, primaryText,
          secondaryText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
