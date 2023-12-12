package com.rizz.mandiri.assignment.features.movie.domain.repositories;

import androidx.paging.PagingData;
import com.rizz.mandiri.assignment.core.utils.Resource;
import com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery;
import com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.VideoEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/domain/repositories/MovieRepository;", "", "getMovieDetail", "Lcom/rizz/mandiri/assignment/core/utils/Resource;", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieGenre", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/GenreEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "query", "Lcom/rizz/mandiri/assignment/features/movie/data/model/request/MovieQuery;", "getMovieReview", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewResultEntity;", "getMovieVideo", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/VideoEntity;", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity>> getMovieList(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery query);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieDetail(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rizz.mandiri.assignment.core.utils.Resource<com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity>> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> getMovieReview(int movieId);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieVideo(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rizz.mandiri.assignment.core.utils.Resource<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieGenre(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rizz.mandiri.assignment.core.utils.Resource<? extends java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity>>> $completion);
}