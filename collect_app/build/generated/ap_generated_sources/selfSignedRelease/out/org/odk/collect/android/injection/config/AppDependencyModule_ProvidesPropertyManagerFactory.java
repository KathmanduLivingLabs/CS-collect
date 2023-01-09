// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.events.RxEventBus;
import org.odk.collect.android.logic.PropertyManager;
import org.odk.collect.android.permissions.PermissionsProvider;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.utilities.DeviceDetailsProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesPropertyManagerFactory implements Factory<PropertyManager> {
  private final AppDependencyModule module;

  private final Provider<RxEventBus> eventBusProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<DeviceDetailsProvider> deviceDetailsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesPropertyManagerFactory(AppDependencyModule module,
      Provider<RxEventBus> eventBusProvider, Provider<PermissionsProvider> permissionsProvider,
      Provider<DeviceDetailsProvider> deviceDetailsProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.eventBusProvider = eventBusProvider;
    this.permissionsProvider = permissionsProvider;
    this.deviceDetailsProvider = deviceDetailsProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public PropertyManager get() {
    return providesPropertyManager(module, eventBusProvider.get(), permissionsProvider.get(), deviceDetailsProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesPropertyManagerFactory create(
      AppDependencyModule module, Provider<RxEventBus> eventBusProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<DeviceDetailsProvider> deviceDetailsProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesPropertyManagerFactory(module, eventBusProvider, permissionsProvider, deviceDetailsProvider, settingsProvider);
  }

  public static PropertyManager providesPropertyManager(AppDependencyModule instance,
      RxEventBus eventBus, PermissionsProvider permissionsProvider,
      DeviceDetailsProvider deviceDetailsProvider, SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesPropertyManager(eventBus, permissionsProvider, deviceDetailsProvider, settingsProvider));
  }
}
