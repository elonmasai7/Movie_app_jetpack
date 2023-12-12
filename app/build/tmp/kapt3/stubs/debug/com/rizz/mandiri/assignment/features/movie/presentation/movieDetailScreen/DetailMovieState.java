package com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen;

import androidx.paging.PagingData;
import com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.VideoResultEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0017\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fH\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003Js\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieDetailScreen/DetailMovieState;", "", "isDialogOpen", "", "movie", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "isFetchingDetail", "isFetchingReviewers", "isFetchingTrailers", "detailMovie", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "reviewers", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewResultEntity;", "trailers", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/VideoResultEntity;", "(ZLcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;ZZZLcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;Lkotlinx/coroutines/flow/Flow;Ljava/util/List;)V", "getDetailMovie", "()Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "()Z", "getMovie", "()Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "getReviewers", "()Lkotlinx/coroutines/flow/Flow;", "getTrailers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class DetailMovieState {
    private final boolean isDialogOpen = false;
    @org.jetbrains.annotations.Nullable
    private final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie = null;
    private final boolean isFetchingDetail = false;
    private final boolean isFetchingReviewers = false;
    private final boolean isFetchingTrailers = false;
    @org.jetbrains.annotations.Nullable
    private final com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity detailMovie = null;
    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> reviewers = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoResultEntity> trailers = null;
    
    public DetailMovieState(boolean isDialogOpen, @org.jetbrains.annotations.Nullable
    com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie, boolean isFetchingDetail, boolean isFetchingReviewers, boolean isFetchingTrailers, @org.jetbrains.annotations.Nullable
    com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity detailMovie, @org.jetbrains.annotations.Nullable
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> reviewers, @org.jetbrains.annotations.Nullable
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoResultEntity> trailers) {
        super();
    }
    
    public final boolean isDialogOpen() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity getMovie() {
        return null;
    }
    
    public final boolean isFetchingDetail() {
        return false;
    }
    
    public final boolean isFetchingReviewers() {
        return false;
    }
    
    public final boolean isFetchingTrailers() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity getDetailMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> getReviewers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoResultEntity> getTrailers() {
        return null;
    }
    
    public DetailMovieState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoResultEntity> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieState copy(boolean isDialogOpen, @org.jetbrains.annotations.Nullable
    com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie, boolean isFetchingDetail, boolean isFetchingReviewers, boolean isFetchingTrailers, @org.jetbrains.annotations.Nullable
    com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity detailMovie, @org.jetbrains.annotations.Nullable
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity>> reviewers, @org.jetbrains.annotations.Nullable
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoResultEntity> trailers) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}