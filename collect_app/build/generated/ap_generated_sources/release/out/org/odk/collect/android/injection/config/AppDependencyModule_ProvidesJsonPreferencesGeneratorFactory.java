// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.configure.qr.AppConfigurationGenerator;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory implements Factory<AppConfigurationGenerator> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  @Override
  public AppConfigurationGenerator get() {
    return providesJsonPreferencesGenerator(module, settingsProvider.get(), currentProjectProvider.get());
  }

  public static AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory(module, settingsProvider, currentProjectProvider);
  }

  public static AppConfigurationGenerator providesJsonPreferencesGenerator(
      AppDependencyModule instance, SettingsProvider settingsProvider,
      CurrentProjectProvider currentProjectProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesJsonPreferencesGenerator(settingsProvider, currentProjectProvider));
  }
}
