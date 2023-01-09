// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.ExistingSettingsMigrator;
import org.odk.collect.android.application.initialization.SettingsMigrator;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.projects.ProjectsRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesExistingSettingsMigratorFactory implements Factory<ExistingSettingsMigrator> {
  private final AppDependencyModule module;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<SettingsMigrator> settingsMigratorProvider;

  public AppDependencyModule_ProvidesExistingSettingsMigratorFactory(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<SettingsMigrator> settingsMigratorProvider) {
    this.module = module;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.settingsMigratorProvider = settingsMigratorProvider;
  }

  @Override
  public ExistingSettingsMigrator get() {
    return providesExistingSettingsMigrator(module, projectsRepositoryProvider.get(), settingsProvider.get(), settingsMigratorProvider.get());
  }

  public static AppDependencyModule_ProvidesExistingSettingsMigratorFactory create(
      AppDependencyModule module, Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<SettingsMigrator> settingsMigratorProvider) {
    return new AppDependencyModule_ProvidesExistingSettingsMigratorFactory(module, projectsRepositoryProvider, settingsProvider, settingsMigratorProvider);
  }

  public static ExistingSettingsMigrator providesExistingSettingsMigrator(
      AppDependencyModule instance, ProjectsRepository projectsRepository,
      SettingsProvider settingsProvider, SettingsMigrator settingsMigrator) {
    return Preconditions.checkNotNullFromProvides(instance.providesExistingSettingsMigrator(projectsRepository, settingsProvider, settingsMigrator));
  }
}
