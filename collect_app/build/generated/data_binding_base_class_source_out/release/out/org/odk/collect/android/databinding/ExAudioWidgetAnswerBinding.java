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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ExAudioWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AudioPlayerLayoutBinding audioPlayer;

  @NonNull
  public final MaterialButton launchExternalAppButton;

  private ExAudioWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull AudioPlayerLayoutBinding audioPlayer,
      @NonNull MaterialButton launchExternalAppButton) {
    this.rootView = rootView;
    this.audioPlayer = audioPlayer;
    this.launchExternalAppButton = launchExternalAppButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExAudioWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExAudioWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ex_audio_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExAudioWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.audio_player;
      View audioPlayer = rootView.findViewById(id);
      if (audioPlayer == null) {
        break missingId;
      }
      AudioPlayerLayoutBinding binding_audioPlayer = AudioPlayerLayoutBinding.bind(audioPlayer);

      id = R.id.launch_external_app_button;
      MaterialButton launchExternalAppButton = rootView.findViewById(id);
      if (launchExternalAppButton == null) {
        break missingId;
      }

      return new ExAudioWidgetAnswerBinding((LinearLayout) rootView, binding_audioPlayer,
          launchExternalAppButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
