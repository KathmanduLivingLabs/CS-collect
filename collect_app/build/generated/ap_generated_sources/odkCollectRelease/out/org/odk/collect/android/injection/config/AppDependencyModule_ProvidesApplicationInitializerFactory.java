// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.application.initialization.AnalyticsInitializer;
import org.odk.collect.android.application.initialization.ApplicationInitializer;
import org.odk.collect.android.application.initialization.upgrade.AppUpgrader;
import org.odk.collect.android.logic.PropertyManager;
import org.odk.collect.android.utilities.LaunchState;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.utilities.UserAgentProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesApplicationInitializerFactory implements Factory<ApplicationInitializer> {
  private final AppDependencyModule module;

  private final Provider<Application> contextProvider;

  private final Provider<UserAgentProvider> userAgentProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<Analytics> analyticsProvider;

  private final Provider<LaunchState> launchStateProvider;

  private final Provider<AppUpgrader> appUpgraderProvider;

  private final Provider<AnalyticsInitializer> analyticsInitializerProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  public AppDependencyModule_ProvidesApplicationInitializerFactory(AppDependencyModule module,
      Provider<Application> contextProvider, Provider<UserAgentProvider> userAgentProvider,
      Provider<PropertyManager> propertyManagerProvider, Provider<Analytics> analyticsProvider,
      Provider<LaunchState> launchStateProvider, Provider<AppUpgrader> appUpgraderProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.userAgentProvider = userAgentProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.analyticsProvider = analyticsProvider;
    this.launchStateProvider = launchStateProvider;
    this.appUpgraderProvider = appUpgraderProvider;
    this.analyticsInitializerProvider = analyticsInitializerProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
  }

  @Override
  public ApplicationInitializer get() {
    return providesApplicationInitializer(module, contextProvider.get(), userAgentProvider.get(), propertyManagerProvider.get(), analyticsProvider.get(), launchStateProvider.get(), appUpgraderProvider.get(), analyticsInitializerProvider.get(), projectsRepositoryProvider.get());
  }

  public static AppDependencyModule_ProvidesApplicationInitializerFactory create(
      AppDependencyModule module, Provider<Application> contextProvider,
      Provider<UserAgentProvider> userAgentProvider,
      Provider<PropertyManager> propertyManagerProvider, Provider<Analytics> analyticsProvider,
      Provider<LaunchState> launchStateProvider, Provider<AppUpgrader> appUpgraderProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    return new AppDependencyModule_ProvidesApplicationInitializerFactory(module, contextProvider, userAgentProvider, propertyManagerProvider, analyticsProvider, launchStateProvider, appUpgraderProvider, analyticsInitializerProvider, projectsRepositoryProvider);
  }

  public static ApplicationInitializer providesApplicationInitializer(AppDependencyModule instance,
      Application context, UserAgentProvider userAgentProvider, PropertyManager propertyManager,
      Analytics analytics, LaunchState launchState, AppUpgrader appUpgrader,
      AnalyticsInitializer analyticsInitializer, ProjectsRepository projectsRepository) {
    return Preconditions.checkNotNullFromProvides(instance.providesApplicationInitializer(context, userAgentProvider, propertyManager, analytics, launchState, appUpgrader, analyticsInitializer, projectsRepository));
  }
}
