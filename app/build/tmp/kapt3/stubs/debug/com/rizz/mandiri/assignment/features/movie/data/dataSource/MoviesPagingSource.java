package com.rizz.mandiri.assignment.features.movie.data.dataSource;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi;
import com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/MoviesPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "api", "Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;", "query", "Lcom/rizz/mandiri/assignment/features/movie/data/model/request/MovieQuery;", "(Lcom/rizz/mandiri/assignment/features/movie/data/dataSource/remote/MovieApi;Lcom/rizz/mandiri/assignment/features/movie/data/model/request/MovieQuery;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MoviesPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity> {
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api = null;
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery query = null;
    
    public MoviesPagingSource(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi api, @org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery query) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity> state) {
        return null;
    }
}