package com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen;

import com.rizz.mandiri.assignment.core.presentation.UiEvent;
import com.rizz.mandiri.assignment.core.utils.Resource.Error;
import com.rizz.mandiri.assignment.core.utils.Resource.Loading;
import com.rizz.mandiri.assignment.core.utils.Resource.Success;
import com.rizz.mandiri.assignment.core.viewModel.BaseViewModel;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetDetailMoviesByIdUseCase;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetReviewByMovieIdUseCase;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetVideoByMovieIdUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieDetailScreen/DetailMovieViewModel;", "Lcom/rizz/mandiri/assignment/core/viewModel/BaseViewModel;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieDetailScreen/DetailMovieState;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieDetailScreen/DetailMovieEvent;", "getDetailMovie", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetDetailMoviesByIdUseCase;", "getReviewers", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetReviewByMovieIdUseCase;", "getTrailers", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetVideoByMovieIdUseCase;", "(Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetDetailMoviesByIdUseCase;Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetReviewByMovieIdUseCase;Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetVideoByMovieIdUseCase;)V", "defaultState", "onEvent", "", "event", "onGetDetailMovie", "Lkotlinx/coroutines/Job;", "onGetReviewers", "onGetTrailers", "onSetMovie", "movie", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailMovieViewModel extends com.rizz.mandiri.assignment.core.viewModel.BaseViewModel<com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieState, com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieEvent> {
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetDetailMoviesByIdUseCase getDetailMovie = null;
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetReviewByMovieIdUseCase getReviewers = null;
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetVideoByMovieIdUseCase getTrailers = null;
    
    @javax.inject.Inject
    public DetailMovieViewModel(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.usecases.GetDetailMoviesByIdUseCase getDetailMovie, @org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.usecases.GetReviewByMovieIdUseCase getReviewers, @org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.usecases.GetVideoByMovieIdUseCase getTrailers) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieState defaultState() {
        return null;
    }
    
    @java.lang.Override
    public void onEvent(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieEvent event) {
    }
    
    private final void onSetMovie(com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie) {
    }
    
    private final kotlinx.coroutines.Job onGetReviewers() {
        return null;
    }
    
    private final kotlinx.coroutines.Job onGetTrailers() {
        return null;
    }
    
    private final kotlinx.coroutines.Job onGetDetailMovie() {
        return null;
    }
}