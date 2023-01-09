// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.audio.AudioButton;

public final class AudioVideoImageTextLabelBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AudioButton audioButton;

  @NonNull
  public final RelativeLayout audioVideoImageTextLabelContainer;

  @NonNull
  public final LinearLayout imageTextLabelContainer;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout mediaButtons;

  @NonNull
  public final TextView missingImage;

  @NonNull
  public final FrameLayout textContainer;

  @NonNull
  public final TextView textLabel;

  @NonNull
  public final MaterialButton videoButton;

  private AudioVideoImageTextLabelBinding(@NonNull RelativeLayout rootView,
      @NonNull AudioButton audioButton, @NonNull RelativeLayout audioVideoImageTextLabelContainer,
      @NonNull LinearLayout imageTextLabelContainer, @NonNull ImageView imageView,
      @NonNull LinearLayout mediaButtons, @NonNull TextView missingImage,
      @NonNull FrameLayout textContainer, @NonNull TextView textLabel,
      @NonNull MaterialButton videoButton) {
    this.rootView = rootView;
    this.audioButton = audioButton;
    this.audioVideoImageTextLabelContainer = audioVideoImageTextLabelContainer;
    this.imageTextLabelContainer = imageTextLabelContainer;
    this.imageView = imageView;
    this.mediaButtons = mediaButtons;
    this.missingImage = missingImage;
    this.textContainer = textContainer;
    this.textLabel = textLabel;
    this.videoButton = videoButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AudioVideoImageTextLabelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AudioVideoImageTextLabelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.audio_video_image_text_label, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AudioVideoImageTextLabelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.audioButton;
      AudioButton audioButton = rootView.findViewById(id);
      if (audioButton == null) {
        break missingId;
      }

      RelativeLayout audioVideoImageTextLabelContainer = (RelativeLayout) rootView;

      id = R.id.image_text_label_container;
      LinearLayout imageTextLabelContainer = rootView.findViewById(id);
      if (imageTextLabelContainer == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.media_buttons;
      LinearLayout mediaButtons = rootView.findViewById(id);
      if (mediaButtons == null) {
        break missingId;
      }

      id = R.id.missingImage;
      TextView missingImage = rootView.findViewById(id);
      if (missingImage == null) {
        break missingId;
      }

      id = R.id.text_container;
      FrameLayout textContainer = rootView.findViewById(id);
      if (textContainer == null) {
        break missingId;
      }

      id = R.id.text_label;
      TextView textLabel = rootView.findViewById(id);
      if (textLabel == null) {
        break missingId;
      }

      id = R.id.videoButton;
      MaterialButton videoButton = rootView.findViewById(id);
      if (videoButton == null) {
        break missingId;
      }

      return new AudioVideoImageTextLabelBinding((RelativeLayout) rootView, audioButton,
          audioVideoImageTextLabelContainer, imageTextLabelContainer, imageView, mediaButtons,
          missingImage, textContainer, textLabel, videoButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
