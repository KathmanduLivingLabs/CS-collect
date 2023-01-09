// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.formmanagement.InstancesAppState;
import org.odk.collect.android.gdrive.GoogleAccountsManager;
import org.odk.collect.android.gdrive.GoogleApiProvider;
import org.odk.collect.android.instancemanagement.InstanceAutoSender;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.android.permissions.PermissionsProvider;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesInstanceAutoSenderFactory implements Factory<InstanceAutoSender> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<ChangeLockProvider> changeLockProvider;

  private final Provider<Notifier> notifierProvider;

  private final Provider<Analytics> analyticsProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<GoogleAccountsManager> googleAccountsManagerProvider;

  private final Provider<GoogleApiProvider> googleApiProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<InstancesAppState> instancesAppStateProvider;

  public AppDependencyModule_ProvidesInstanceAutoSenderFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<ChangeLockProvider> changeLockProvider,
      Provider<Notifier> notifierProvider, Provider<Analytics> analyticsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<GoogleAccountsManager> googleAccountsManagerProvider,
      Provider<GoogleApiProvider> googleApiProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<InstancesAppState> instancesAppStateProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.changeLockProvider = changeLockProvider;
    this.notifierProvider = notifierProvider;
    this.analyticsProvider = analyticsProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.googleAccountsManagerProvider = googleAccountsManagerProvider;
    this.googleApiProvider = googleApiProvider;
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
    this.instancesAppStateProvider = instancesAppStateProvider;
  }

  @Override
  public InstanceAutoSender get() {
    return providesInstanceAutoSender(module, contextProvider.get(), changeLockProvider.get(), notifierProvider.get(), analyticsProvider.get(), formsRepositoryProvider.get(), instancesRepositoryProvider.get(), googleAccountsManagerProvider.get(), googleApiProvider.get(), permissionsProvider.get(), settingsProvider.get(), instancesAppStateProvider.get());
  }

  public static AppDependencyModule_ProvidesInstanceAutoSenderFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<ChangeLockProvider> changeLockProvider, Provider<Notifier> notifierProvider,
      Provider<Analytics> analyticsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<GoogleAccountsManager> googleAccountsManagerProvider,
      Provider<GoogleApiProvider> googleApiProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<InstancesAppState> instancesAppStateProvider) {
    return new AppDependencyModule_ProvidesInstanceAutoSenderFactory(module, contextProvider, changeLockProvider, notifierProvider, analyticsProvider, formsRepositoryProvider, instancesRepositoryProvider, googleAccountsManagerProvider, googleApiProvider, permissionsProvider, settingsProvider, instancesAppStateProvider);
  }

  public static InstanceAutoSender providesInstanceAutoSender(AppDependencyModule instance,
      Context context, ChangeLockProvider changeLockProvider, Notifier notifier,
      Analytics analytics, FormsRepositoryProvider formsRepositoryProvider,
      InstancesRepositoryProvider instancesRepositoryProvider,
      GoogleAccountsManager googleAccountsManager, GoogleApiProvider googleApiProvider,
      PermissionsProvider permissionsProvider, SettingsProvider settingsProvider,
      InstancesAppState instancesAppState) {
    return Preconditions.checkNotNullFromProvides(instance.providesInstanceAutoSender(context, changeLockProvider, notifier, analytics, formsRepositoryProvider, instancesRepositoryProvider, googleAccountsManager, googleApiProvider, permissionsProvider, settingsProvider, instancesAppState));
  }
}
