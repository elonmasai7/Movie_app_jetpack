package com.rizz.mandiri.assignment.features.movie.data.model.request;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001J\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060 J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/model/request/MovieQuery;", "", "includeAdult", "", "includeVideo", "language", "", "page", "", "sortBy", "withGenres", "(ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getIncludeAdult", "()Z", "getIncludeVideo", "getLanguage", "()Ljava/lang/String;", "getPage", "()I", "getSortBy", "getWithGenres", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toMap", "", "toString", "app_debug"})
public final class MovieQuery {
    @com.google.gson.annotations.SerializedName(value = "include_adult")
    private final boolean includeAdult = false;
    @com.google.gson.annotations.SerializedName(value = "include_video")
    private final boolean includeVideo = false;
    @com.google.gson.annotations.SerializedName(value = "language")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String language = null;
    @com.google.gson.annotations.SerializedName(value = "page")
    private final int page = 0;
    @com.google.gson.annotations.SerializedName(value = "sort_by")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sortBy = null;
    @com.google.gson.annotations.SerializedName(value = "with_genres")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String withGenres = null;
    
    public MovieQuery(boolean includeAdult, boolean includeVideo, @org.jetbrains.annotations.NotNull
    java.lang.String language, int page, @org.jetbrains.annotations.NotNull
    java.lang.String sortBy, @org.jetbrains.annotations.NotNull
    java.lang.String withGenres) {
        super();
    }
    
    public final boolean getIncludeAdult() {
        return false;
    }
    
    public final boolean getIncludeVideo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSortBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWithGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> toMap() {
        return null;
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.data.model.request.MovieQuery copy(boolean includeAdult, boolean includeVideo, @org.jetbrains.annotations.NotNull
    java.lang.String language, int page, @org.jetbrains.annotations.NotNull
    java.lang.String sortBy, @org.jetbrains.annotations.NotNull
    java.lang.String withGenres) {
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