package com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.window.DialogProperties;
import androidx.paging.LoadState;
import com.rizz.mandiri.assignment.core.utils.Constants;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0003\u001a4\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u00a8\u0006\u000e"}, d2 = {"DetailMovieScreen", "", "state", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieDetailScreen/DetailMovieState;", "onEvent", "Lkotlin/Function1;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieDetailScreen/DetailMovieEvent;", "Preview", "ReviewsDialog", "openDialog", "", "onCloseDialog", "Lkotlin/Function0;", "onRetry", "app_debug"})
@kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
public final class DetailMovieScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void DetailMovieScreen(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieEvent, kotlin.Unit> onEvent) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ReviewsDialog(boolean openDialog, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCloseDialog, @org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.features.movie.presentation.movieDetailScreen.DetailMovieState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRetry) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable
    private static final void Preview() {
    }
}