// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.fragments;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SavedFormListFragment_MembersInjector implements MembersInjector<SavedFormListFragment> {
  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public SavedFormListFragment_MembersInjector(Provider<SettingsProvider> settingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.settingsProvider = settingsProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  public static MembersInjector<SavedFormListFragment> create(
      Provider<SettingsProvider> settingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new SavedFormListFragment_MembersInjector(settingsProvider, instancesRepositoryProvider, formsRepositoryProvider, currentProjectProvider);
  }

  @Override
  public void injectMembers(SavedFormListFragment instance) {
    AppListFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectCurrentProjectProvider(instance, currentProjectProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.SavedFormListFragment.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(SavedFormListFragment instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.SavedFormListFragment.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(SavedFormListFragment instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.SavedFormListFragment.currentProjectProvider")
  public static void injectCurrentProjectProvider(SavedFormListFragment instance,
      CurrentProjectProvider currentProjectProvider) {
    instance.currentProjectProvider = currentProjectProvider;
  }
}
