package com.rizz.mandiri.assignment.features.movie.data.repositories;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.rizz.mandiri.assignment.core.repository.BaseRepository;
import com.rizz.mandiri.assignment.core.utils.Resource;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.MoviesPagingSource;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.ReviewersPagingSource;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi;
import com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery;
import com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.VideoEntity;
import com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/repositories/MovieRepositoryImpl;", "Lcom/rizz/mandiri/assignment/features/movie/domain/repositories/MovieRepository;", "Lcom/rizz/mandiri/assignment/core/repository/BaseRepository;", "api", "Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;", "(Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;)V", "getMovieDetail", "Lcom/rizz/mandiri/assignment/core/utils/Resource;", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieGenre", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/GenreEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "query", "Lcom/rizz/mandiri/assignment/features/movie/data/model/request/MovieQuery;", "getMovieReview", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewResultEntity;", "getMovieVideo", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/VideoEntity;", "app_debug"})
public final class MovieRepositoryImpl extends com.rizz.mandiri.assignment.core.repository.BaseRepository implements com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository {
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api = null;
    
    @javax.inject.Inject
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity>> getMovieList(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery query) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMovieDetail(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rizz.mandiri.assignment.core.utils.Resource<com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> getMovieReview(int movieId) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMovieVideo(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rizz.mandiri.assignment.core.utils.Resource<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMovieGenre(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rizz.mandiri.assignment.core.utils.Resource<? extends java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity>>> $completion) {
        return null;
    }
}