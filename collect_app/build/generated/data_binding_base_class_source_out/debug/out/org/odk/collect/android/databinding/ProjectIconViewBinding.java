// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.odk.collect.android.R;

public final class ProjectIconViewBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView projectIconText;

  private ProjectIconViewBinding(@NonNull TextView rootView, @NonNull TextView projectIconText) {
    this.rootView = rootView;
    this.projectIconText = projectIconText;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ProjectIconViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProjectIconViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.project_icon_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProjectIconViewBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView projectIconText = (TextView) rootView;

    return new ProjectIconViewBinding((TextView) rootView, projectIconText);
  }
}
