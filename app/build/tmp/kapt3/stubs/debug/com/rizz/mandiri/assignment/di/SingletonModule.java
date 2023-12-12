package com.rizz.mandiri.assignment.di;

import com.rizz.mandiri.assignment.core.http.AuthInterceptor;
import com.rizz.mandiri.assignment.core.http.OkHttpClientFactory;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi;
import com.rizz.mandiri.assignment.features.movie.data.repositories.MovieRepositoryImpl;
import com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetDetailMoviesByIdUseCase;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetGenresUseCase;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetMoviesUseCase;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetReviewByMovieIdUseCase;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetVideoByMovieIdUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0016H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/rizz/mandiri/assignment/di/SingletonModule;", "", "()V", "provideGetDetailMovieUseCase", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetDetailMoviesByIdUseCase;", "repository", "Lcom/rizz/mandiri/assignment/features/movie/domain/repositories/MovieRepository;", "provideGetGenresUseCase", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetGenresUseCase;", "provideGetMoviesUseCase", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetMoviesUseCase;", "provideGetReviewsUseCase", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetReviewByMovieIdUseCase;", "provideGetVideosUseCase", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetVideoByMovieIdUseCase;", "provideMovieAPI", "Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;", "retrofit", "Lretrofit2/Retrofit;", "provideMovieRepository", "api", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofitBuilder", "okHttpClient", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class SingletonModule {
    
    public SingletonModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofitBuilder(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi provideMovieAPI(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetGenresUseCase provideGetGenresUseCase(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetMoviesUseCase provideGetMoviesUseCase(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetDetailMoviesByIdUseCase provideGetDetailMovieUseCase(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetReviewByMovieIdUseCase provideGetReviewsUseCase(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetVideoByMovieIdUseCase provideGetVideosUseCase(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository) {
        return null;
    }
}