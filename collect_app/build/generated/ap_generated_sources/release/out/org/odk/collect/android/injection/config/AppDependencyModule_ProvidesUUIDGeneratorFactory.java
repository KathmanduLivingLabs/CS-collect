// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.odk.collect.shared.strings.UUIDGenerator;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesUUIDGeneratorFactory implements Factory<UUIDGenerator> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesUUIDGeneratorFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public UUIDGenerator get() {
    return providesUUIDGenerator(module);
  }

  public static AppDependencyModule_ProvidesUUIDGeneratorFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesUUIDGeneratorFactory(module);
  }

  public static UUIDGenerator providesUUIDGenerator(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesUUIDGenerator());
  }
}