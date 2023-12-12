package com.rizz.mandiri.assignment.features.movie.data.dataSource;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.rizz.mandiri.assignment.features.movie.data.dataSource.remote.MovieApi;
import com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"TMDB_STARTING_PAGE_INDEX", "", "app_debug"})
public final class MoviesPagingSourceKt {
    public static final int TMDB_STARTING_PAGE_INDEX = 1;
}