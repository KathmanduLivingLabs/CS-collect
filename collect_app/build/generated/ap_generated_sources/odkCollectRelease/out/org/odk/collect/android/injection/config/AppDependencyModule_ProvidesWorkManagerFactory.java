// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.content.Context;
import androidx.work.WorkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesWorkManagerFactory implements Factory<WorkManager> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  public AppDependencyModule_ProvidesWorkManagerFactory(AppDependencyModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public WorkManager get() {
    return providesWorkManager(module, contextProvider.get());
  }

  public static AppDependencyModule_ProvidesWorkManagerFactory create(AppDependencyModule module,
      Provider<Context> contextProvider) {
    return new AppDependencyModule_ProvidesWorkManagerFactory(module, contextProvider);
  }

  public static WorkManager providesWorkManager(AppDependencyModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesWorkManager(context));
  }
}