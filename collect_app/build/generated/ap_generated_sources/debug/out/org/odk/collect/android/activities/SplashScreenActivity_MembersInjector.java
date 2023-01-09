// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.activities.viewmodels.SplashScreenViewModel;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashScreenActivity_MembersInjector implements MembersInjector<SplashScreenActivity> {
  private final Provider<SplashScreenViewModel.Factory> splashScreenViewModelFactoryFactoryProvider;

  public SplashScreenActivity_MembersInjector(
      Provider<SplashScreenViewModel.Factory> splashScreenViewModelFactoryFactoryProvider) {
    this.splashScreenViewModelFactoryFactoryProvider = splashScreenViewModelFactoryFactoryProvider;
  }

  public static MembersInjector<SplashScreenActivity> create(
      Provider<SplashScreenViewModel.Factory> splashScreenViewModelFactoryFactoryProvider) {
    return new SplashScreenActivity_MembersInjector(splashScreenViewModelFactoryFactoryProvider);
  }

  @Override
  public void injectMembers(SplashScreenActivity instance) {
    injectSplashScreenViewModelFactoryFactory(instance, splashScreenViewModelFactoryFactoryProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.SplashScreenActivity.splashScreenViewModelFactoryFactory")
  public static void injectSplashScreenViewModelFactoryFactory(SplashScreenActivity instance,
      SplashScreenViewModel.Factory splashScreenViewModelFactoryFactory) {
    instance.splashScreenViewModelFactoryFactory = splashScreenViewModelFactoryFactory;
  }
}