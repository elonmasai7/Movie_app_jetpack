package com.rizz.mandiri.assignment.features.movie.domain.entities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fH\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00104\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00ba\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u00c6\u0001\u00a2\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001d\u00a8\u0006?"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "", "id", "", "title", "", "overview", "releaseDate", "popularity", "", "voteAverage", "voteCount", "backdropPath", "posterPath", "genres", "", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/GenreEntity;", "productionCompanies", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ProductionCompanyEntity;", "productionCountries", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/ProductionCountryEntity;", "spokenLanguages", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/SpokenLanguageEntity;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBackdropPath", "()Ljava/lang/String;", "getGenres", "()Ljava/util/List;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterPath", "getProductionCompanies", "getProductionCountries", "getReleaseDate", "getSpokenLanguages", "getTitle", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class DetailMovieEntity {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double popularity = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double voteAverage = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer voteCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity> genres = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCompanyEntity> productionCompanies = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCountryEntity> productionCountries = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.SpokenLanguageEntity> spokenLanguages = null;
    
    public DetailMovieEntity(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.Nullable
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity> genres, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCompanyEntity> productionCompanies, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCountryEntity> productionCountries, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.SpokenLanguageEntity> spokenLanguages) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCompanyEntity> getProductionCompanies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCountryEntity> getProductionCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.SpokenLanguageEntity> getSpokenLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCompanyEntity> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCountryEntity> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.SpokenLanguageEntity> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.Nullable
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.GenreEntity> genres, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCompanyEntity> productionCompanies, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCountryEntity> productionCountries, @org.jetbrains.annotations.NotNull
    java.util.List<com.rizz.mandiri.assignment.features.movie.domain.entities.SpokenLanguageEntity> spokenLanguages) {
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