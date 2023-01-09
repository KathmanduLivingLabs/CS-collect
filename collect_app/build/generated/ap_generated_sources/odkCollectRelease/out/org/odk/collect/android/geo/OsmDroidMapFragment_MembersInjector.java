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
public final class OsmDroidMapFragment_MembersInjector implements MembersInjector<OsmDroidMapFragment> {
  private final Provider<MapProvider> mapProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public OsmDroidMapFragment_MembersInjector(Provider<MapProvider> mapProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    this.mapProvider = mapProvider;
    this.storagePathProvider = storagePathProvider;
  }

  public static MembersInjector<OsmDroidMapFragment> create(Provider<MapProvider> mapProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new OsmDroidMapFragment_MembersInjector(mapProvider, storagePathProvider);
  }

  @Override
  public void injectMembers(OsmDroidMapFragment instance) {
    injectMapProvider(instance, mapProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.OsmDroidMapFragment.mapProvider")
  public static void injectMapProvider(OsmDroidMapFragment instance, MapProvider mapProvider) {
    instance.mapProvider = mapProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.OsmDroidMapFragment.storagePathProvider")
  public static void injectStoragePathProvider(OsmDroidMapFragment instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }
}