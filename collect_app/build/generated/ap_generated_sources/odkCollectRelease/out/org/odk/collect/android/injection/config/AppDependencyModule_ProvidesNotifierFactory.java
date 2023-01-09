// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.android.preferences.source.SettingsProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesNotifierFactory implements Factory<Notifier> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesNotifierFactory(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public Notifier get() {
    return providesNotifier(module, applicationProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesNotifierFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesNotifierFactory(module, applicationProvider, settingsProvider);
  }

  public static Notifier providesNotifier(AppDependencyModule instance, Application application,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesNotifier(application, settingsProvider));
  }
}
