// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.MultiClickSafeButton;

public final class AudioWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AudioPlayerLayoutBinding audioPlayer;

  @NonNull
  public final MultiClickSafeButton captureButton;

  @NonNull
  public final MultiClickSafeButton chooseButton;

  private AudioWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull AudioPlayerLayoutBinding audioPlayer, @NonNull MultiClickSafeButton captureButton,
      @NonNull MultiClickSafeButton chooseButton) {
    this.rootView = rootView;
    this.audioPlayer = audioPlayer;
    this.captureButton = captureButton;
    this.chooseButton = chooseButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AudioWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AudioWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.audio_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AudioWidgetAnswerBinding bind(@NonNull View rootView) {
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

      id = R.id.capture_button;
      MultiClickSafeButton captureButton = rootView.findViewById(id);
      if (captureButton == null) {
        break missingId;
      }

      id = R.id.choose_button;
      MultiClickSafeButton chooseButton = rootView.findViewById(id);
      if (chooseButton == null) {
        break missingId;
      }

      return new AudioWidgetAnswerBinding((LinearLayout) rootView, binding_audioPlayer,
          captureButton, chooseButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
