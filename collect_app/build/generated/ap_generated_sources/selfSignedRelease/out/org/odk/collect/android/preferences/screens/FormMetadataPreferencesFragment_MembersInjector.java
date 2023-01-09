// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.configure.SettingsChangeHandler;
import org.odk.collect.android.logic.PropertyManager;
import org.odk.collect.android.permissions.PermissionsProvider;
import org.odk.collect.android.preferences.PreferenceVisibilityHandler;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.utilities.AdminPasswordProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FormMetadataPreferencesFragment_MembersInjector implements MembersInjector<FormMetadataPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  private final Provider<SettingsStore> generalSettingsStoreProvider;

  private final Provider<AdminPasswordProvider> adminPasswordProvider;

  private final Provider<ProjectPreferencesViewModel.Factory> factoryProvider;

  private final Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  public FormMetadataPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<PropertyManager> propertyManagerProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.currentProjectProvider = currentProjectProvider;
    this.generalSettingsStoreProvider = generalSettingsStoreProvider;
    this.adminPasswordProvider = adminPasswordProvider;
    this.factoryProvider = factoryProvider;
    this.preferenceVisibilityHandlerProvider = preferenceVisibilityHandlerProvider;
    this.permissionsProvider = permissionsProvider;
    this.propertyManagerProvider = propertyManagerProvider;
  }

  public static MembersInjector<FormMetadataPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<PropertyManager> propertyManagerProvider) {
    return new FormMetadataPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, currentProjectProvider, generalSettingsStoreProvider, adminPasswordProvider, factoryProvider, preferenceVisibilityHandlerProvider, permissionsProvider, propertyManagerProvider);
  }

  @Override
  public void injectMembers(FormMetadataPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectCurrentProjectProvider(instance, currentProjectProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, generalSettingsStoreProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandlerProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectPropertyManager(instance, propertyManagerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.FormMetadataPreferencesFragment.permissionsProvider")
  public static void injectPermissionsProvider(FormMetadataPreferencesFragment instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.FormMetadataPreferencesFragment.propertyManager")
  public static void injectPropertyManager(FormMetadataPreferencesFragment instance,
      PropertyManager propertyManager) {
    instance.propertyManager = propertyManager;
  }
}
