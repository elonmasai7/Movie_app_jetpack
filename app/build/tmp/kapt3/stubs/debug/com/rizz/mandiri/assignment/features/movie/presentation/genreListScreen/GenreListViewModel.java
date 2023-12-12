package com.rizz.mandiri.assignment.features.movie.presentation.genreListScreen;

import com.rizz.mandiri.assignment.core.presentation.UiEvent;
import com.rizz.mandiri.assignment.core.utils.Resource;
import com.rizz.mandiri.assignment.core.viewModel.BaseViewModel;
import com.rizz.mandiri.assignment.features.movie.domain.usecases.GetGenresUseCase;
import com.rizz.mandiri.assignment.route.MovieNav;
import dagger.hilt.android.lifecycle.HiltViewModel;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/genreListScreen/GenreListViewModel;", "Lcom/rizz/mandiri/assignment/core/viewModel/BaseViewModel;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/genreListScreen/GenreListState;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/genreListScreen/GenreListEvent;", "getGenres", "Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetGenresUseCase;", "(Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetGenresUseCase;)V", "defaultState", "onEvent", "", "event", "onGetGenres", "Lkotlinx/coroutines/Job;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class GenreListViewModel extends com.rizz.mandiri.assignment.core.viewModel.BaseViewModel<com.rizz.mandiri.assignment.features.movie.presentation.genreListScreen.GenreListState, com.rizz.mandiri.assignment.features.movie.presentation.genreListScreen.GenreListEvent> {
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.domain.usecases.GetGenresUseCase getGenres = null;
    
    @javax.inject.Inject
    public GenreListViewModel(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.usecases.GetGenresUseCase getGenres) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.rizz.mandiri.assignment.features.movie.presentation.genreListScreen.GenreListState defaultState() {
        return null;
    }
    
    @java.lang.Override
    public void onEvent(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.presentation.genreListScreen.GenreListEvent event) {
    }
    
    private final kotlinx.coroutines.Job onGetGenres() {
        return null;
    }
}