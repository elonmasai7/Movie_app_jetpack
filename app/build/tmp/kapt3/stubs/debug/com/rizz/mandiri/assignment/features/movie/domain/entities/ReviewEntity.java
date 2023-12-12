package com.rizz.mandiri.assignment.features.movie.domain.entities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJN\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewEntity;", "", "id", "", "page", "results", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewResultEntity;", "totalPages", "totalResults", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getResults", "()Ljava/util/List;", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ReviewEntity;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class ReviewEntity {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> results = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalPages = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalResults = null;
    
    public ReviewEntity(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> results, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> getResults() {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> component3() {
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
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewEntity copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ReviewResultEntity> results, @org.jetbrains.annotations.Nullable
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