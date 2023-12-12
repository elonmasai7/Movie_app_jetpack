package com.rizz.mandiri.assignment.features.movie.data.model.response;

import com.google.gson.annotations.SerializedName;
import com.rizz.mandiri.assignment.features.movie.domain.entities.AuthorDetailsEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJX\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010&\u001a\u00020\'J\t\u0010(\u001a\u00020)H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR.\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f\u00a8\u0006*"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ReviewMovieResponse;", "", "id", "", "page", "results", "Ljava/util/ArrayList;", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ResultsReviewMovie;", "Lkotlin/collections/ArrayList;", "totalPages", "totalResults", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPage", "setPage", "getResults", "()Ljava/util/ArrayList;", "setResults", "(Ljava/util/ArrayList;)V", "getTotalPages", "setTotalPages", "getTotalResults", "setTotalResults", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ReviewMovieResponse;", "equals", "", "other", "hashCode", "toEntity", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewEntity;", "toString", "", "app_debug"})
public final class ReviewMovieResponse {
    @com.google.gson.annotations.SerializedName(value = "id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    @com.google.gson.annotations.SerializedName(value = "page")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer page;
    @com.google.gson.annotations.SerializedName(value = "results")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsReviewMovie> results;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalPages;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalResults;
    
    public ReviewMovieResponse(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsReviewMovie> results, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsReviewMovie> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsReviewMovie> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    public final void setTotalPages(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    public final void setTotalResults(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewEntity toEntity() {
        return null;
    }
    
    public ReviewMovieResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsReviewMovie> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.data.model.response.ReviewMovieResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ResultsReviewMovie> results, @org.jetbrains.annotations.Nullable
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