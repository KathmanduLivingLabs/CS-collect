// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.javarosa.core.reference.ReferenceManager;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesReferenceManagerFactory implements Factory<ReferenceManager> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesReferenceManagerFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ReferenceManager get() {
    return providesReferenceManager(module);
  }

  public static AppDependencyModule_ProvidesReferenceManagerFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesReferenceManagerFactory(module);
  }

  public static ReferenceManager providesReferenceManager(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesReferenceManager());
  }
}
