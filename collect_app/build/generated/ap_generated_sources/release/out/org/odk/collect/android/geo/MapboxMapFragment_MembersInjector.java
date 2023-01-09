// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.geo;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.storage.StoragePathProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapboxMapFragment_MembersInjector implements MembersInjector<MapboxMapFragment> {
  private final Provider<MapProvider> mapProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public MapboxMapFragment_MembersInjector(Provider<MapProvider> mapProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    this.mapProvider = mapProvider;
    this.storagePathProvider = storagePathProvider;
  }

  public static MembersInjector<MapboxMapFragment> create(Provider<MapProvider> mapProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new MapboxMapFragment_MembersInjector(mapProvider, storagePathProvider);
  }

  @Override
  public void injectMembers(MapboxMapFragment instance) {
    injectMapProvider(instance, mapProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.MapboxMapFragment.mapProvider")
  public static void injectMapProvider(MapboxMapFragment instance, MapProvider mapProvider) {
    instance.mapProvider = mapProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.MapboxMapFragment.storagePathProvider")
  public static void injectStoragePathProvider(MapboxMapFragment instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }
}