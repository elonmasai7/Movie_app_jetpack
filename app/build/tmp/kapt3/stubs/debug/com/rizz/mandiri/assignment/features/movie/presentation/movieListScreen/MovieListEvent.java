package com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen;

import com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent;", "", "GetMovies", "NavigateBack", "NavigateToDetail", "SetGenre", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$GetMovies;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$NavigateBack;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$NavigateToDetail;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$SetGenre;", "app_debug"})
public abstract interface MovieListEvent {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$GetMovies;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class GetMovies implements com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent.GetMovies INSTANCE = null;
        
        private GetMovies() {
            super();
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$NavigateBack;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class NavigateBack implements com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent.NavigateBack INSTANCE = null;
        
        private NavigateBack() {
            super();
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$NavigateToDetail;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent;", "movie", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "(Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;)V", "getMovie", "()Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieResultEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class NavigateToDetail implements com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent {
        @org.jetbrains.annotations.NotNull
        private final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie = null;
        
        public NavigateToDetail(@org.jetbrains.annotations.NotNull
        com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity getMovie() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent.NavigateToDetail copy(@org.jetbrains.annotations.NotNull
        com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity movie) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent$SetGenre;", "Lcom/rizz/mandiri/assignment/features/movie/presentation/movieListScreen/MovieListEvent;", "genre", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/GenreEntity;", "(Lcom/rizz/mandiri/assignment/features/movie/domain/entities/GenreEntity;)V", "getGenre", "()Lcom/rizz/mandiri/assignment/features/movie/domain/entities/GenreEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetGenre implements com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent {
        @org.jetbrains.annotations.Nullable
        private final com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity genre = null;
        
        public SetGenre(@org.jetbrains.annotations.Nullable
        com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity genre) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity getGenre() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.rizz.mandiri.assignment.features.movie.presentation.movieListScreen.MovieListEvent.SetGenre copy(@org.jetbrains.annotations.Nullable
        com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity genre) {
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
}