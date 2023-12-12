// Generated by Dagger (https://dagger.dev).
package com.rizz.mandiri.assignment.features.movie.data.repositories;

import com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MovieRepositoryImpl_Factory implements Factory<MovieRepositoryImpl> {
  private final Provider<MovieApi> apiProvider;

  public MovieRepositoryImpl_Factory(Provider<MovieApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public MovieRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static MovieRepositoryImpl_Factory create(Provider<MovieApi> apiProvider) {
    return new MovieRepositoryImpl_Factory(apiProvider);
  }

  public static MovieRepositoryImpl newInstance(MovieApi api) {
    return new MovieRepositoryImpl(api);
  }
}
