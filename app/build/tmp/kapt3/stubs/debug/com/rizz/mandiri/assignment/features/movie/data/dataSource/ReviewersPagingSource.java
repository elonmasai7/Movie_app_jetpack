package com.rizz.mandiri.assignment.features.movie.data.dataSource;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/ReviewersPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewResultEntity;", "api", "Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;", "movieId", "(Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;I)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ReviewersPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> {
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api = null;
    private final int movieId = 0;
    
    public ReviewersPagingSource(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api, int movieId) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> state) {
        return null;
    }
}