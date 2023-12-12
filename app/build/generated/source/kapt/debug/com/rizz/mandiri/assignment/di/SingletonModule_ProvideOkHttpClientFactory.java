// Generated by Dagger (https://dagger.dev).
package com.rizz.mandiri.assignment.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SingletonModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final SingletonModule module;

  public SingletonModule_ProvideOkHttpClientFactory(SingletonModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module);
  }

  public static SingletonModule_ProvideOkHttpClientFactory create(SingletonModule module) {
    return new SingletonModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient provideOkHttpClient(SingletonModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClient());
  }
}
