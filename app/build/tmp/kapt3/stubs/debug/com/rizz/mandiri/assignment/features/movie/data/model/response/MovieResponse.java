package com.rizz.mandiri.assignment.features.movie.data.model.response;

import com.google.gson.annotations.SerializedName;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.MovieResultEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/model/response/MovieResponse;", "", "page", "", "results", "Ljava/util/ArrayList;", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ResultsMovie;", "Lkotlin/collections/ArrayList;", "totalPages", "totalResults", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResults", "()Ljava/util/ArrayList;", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/rizz/mandiri/assignment/features/movie/data/model/response/MovieResponse;", "equals", "", "other", "hashCode", "toEntity", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/MovieEntity;", "toString", "", "app_debug"})
public final class MovieResponse {
    @com.google.gson.annotations.SerializedName(value = "page")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer page = null;
    @com.google.gson.annotations.SerializedName(value = "results")
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsMovie> results = null;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalPages = null;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalResults = null;
    
    public MovieResponse(@org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsMovie> results, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsMovie> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.MovieEntity toEntity() {
        return null;
    }
    
    public MovieResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsMovie> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.data.model.response.MovieResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsMovie> results, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
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