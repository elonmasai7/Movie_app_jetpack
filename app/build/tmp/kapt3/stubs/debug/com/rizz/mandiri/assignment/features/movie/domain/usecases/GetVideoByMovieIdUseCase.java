package com.rizz.mandiri.assignment.features.movie.domain.usecases;

import com.rizz.mandiri.assignment.core.utils.Resource;
import com.rizz.mandiri.assignment.features.movie.domain.entities.VideoEntity;
import com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/domain/usecases/GetVideoByMovieIdUseCase;", "", "repository", "Lcom/rizz/mandiri/assignment/features/movie/domain/repositories/MovieRepository;", "(Lcom/rizz/mandiri/assignment/features/movie/domain/repositories/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rizz/mandiri/assignment/core/utils/Resource;", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/VideoEntity;", "movieID", "", "app_debug"})
public final class GetVideoByMovieIdUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository = null;
    
    public GetVideoByMovieIdUseCase(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.domain.repositories.MovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.rizz.mandiri.assignment.core.utils.Resource<com.rizz.mandiri.assignment.features.movie.domain.entities.VideoEntity>> invoke(int movieID) {
        return null;
    }
}