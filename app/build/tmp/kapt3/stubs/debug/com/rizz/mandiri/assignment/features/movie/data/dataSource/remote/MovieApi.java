package com.rizz.mandiri.assignment.features.movie.data.dataSource.remote;

import com.rizz.mandiri.assignment.features.movie.data.model.response.DetailMovieResponse;
import com.rizz.mandiri.assignment.features.movie.data.model.response.GenreResponse;
import com.rizz.mandiri.assignment.features.movie.data.model.response.MovieResponse;
import com.rizz.mandiri.assignment.features.movie.data.model.response.ReviewMovieResponse;
import com.rizz.mandiri.assignment.features.movie.data.model.response.VideoMovieResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\u0014\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;", "", "getDetailMovie", "Lretrofit2/Response;", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/DetailMovieResponse;", "movieId", "", "language", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGenres", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/GenreResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/MovieResponse;", "query", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReviews", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ReviewMovieResponse;", "page", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideos", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/VideoMovieResponse;", "app_debug"})
public abstract interface MovieApi {
    
    @retrofit2.http.GET(value = "genre/movie/list")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGenres(@retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull
    java.lang.String language, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.rizz.mandiri.assignment.features.movie.data.model.response.GenreResponse>> $completion);
    
    @retrofit2.http.GET(value = "discover/movie")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovies(@retrofit2.http.QueryMap
    @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.rizz.mandiri.assignment.features.movie.data.model.response.MovieResponse>> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetailMovie(@retrofit2.http.Path(value = "movie_id")
    int movieId, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull
    java.lang.String language, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.rizz.mandiri.assignment.features.movie.data.model.response.DetailMovieResponse>> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}/videos")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getVideos(@retrofit2.http.Path(value = "movie_id")
    int movieId, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull
    java.lang.String language, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.rizz.mandiri.assignment.features.movie.data.model.response.VideoMovieResponse>> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}/reviews")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getReviews(@retrofit2.http.Path(value = "movie_id")
    int movieId, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.rizz.mandiri.assignment.features.movie.data.model.response.ReviewMovieResponse>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}