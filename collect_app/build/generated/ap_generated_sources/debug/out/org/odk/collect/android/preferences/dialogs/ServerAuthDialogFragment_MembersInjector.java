// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.preferences.dialogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServerAuthDialogFragment_MembersInjector implements MembersInjector<ServerAuthDialogFragment> {
  private final Provider<SettingsProvider> settingsProvider;

  public ServerAuthDialogFragment_MembersInjector(Provider<SettingsProvider> settingsProvider) {
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<ServerAuthDialogFragment> create(
      Provider<SettingsProvider> settingsProvider) {
    return new ServerAuthDialogFragment_MembersInjector(settingsProvider);
  }

  @Override
  public void injectMembers(ServerAuthDialogFragment instance) {
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.ServerAuthDialogFragment.settingsProvider")
  public static void injectSettingsProvider(ServerAuthDialogFragment instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
