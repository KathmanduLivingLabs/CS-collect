// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.external;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.projects.ProjectsRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FormUriActivity_MembersInjector implements MembersInjector<FormUriActivity> {
  private final Provider<CurrentProjectProvider> currentProjectProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  public FormUriActivity_MembersInjector(Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    this.currentProjectProvider = currentProjectProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
  }

  public static MembersInjector<FormUriActivity> create(
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    return new FormUriActivity_MembersInjector(currentProjectProvider, projectsRepositoryProvider);
  }

  @Override
  public void injectMembers(FormUriActivity instance) {
    injectCurrentProjectProvider(instance, currentProjectProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.currentProjectProvider")
  public static void injectCurrentProjectProvider(FormUriActivity instance,
      CurrentProjectProvider currentProjectProvider) {
    instance.currentProjectProvider = currentProjectProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.projectsRepository")
  public static void injectProjectsRepository(FormUriActivity instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }
}