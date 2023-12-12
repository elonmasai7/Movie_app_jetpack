package com.rizz.mandiri.assignment.features.movie.data.model.response;

import com.google.gson.annotations.SerializedName;
import com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCompanyEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.ProductionCountryEntity;
import com.rizz.mandiri.assignment.features.movie.domain.entities.SpokenLanguageEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bb\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00dd\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\tj\b\u0012\u0004\u0012\u00020\u0016`\u000b\u0012\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\tj\b\u0012\u0004\u0012\u00020\u0018`\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\tj\b\u0012\u0004\u0012\u00020\u001d`\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010$J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0019\u0010f\u001a\u0012\u0012\u0004\u0012\u00020\u00160\tj\b\u0012\u0004\u0012\u00020\u0016`\u000bH\u00c6\u0003J\u0019\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u00180\tj\b\u0012\u0004\u0012\u00020\u0018`\u000bH\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010j\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0019\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\tj\b\u0012\u0004\u0012\u00020\u001d`\u000bH\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010q\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010s\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0019\u0010t\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00e6\u0002\u0010z\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\tj\b\u0012\u0004\u0012\u00020\u0016`\u000b2\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\tj\b\u0012\u0004\u0012\u00020\u0018`\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\tj\b\u0012\u0004\u0012\u00020\u001d`\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020\u00032\b\u0010}\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010~\u001a\u00020\u0007H\u00d6\u0001J\u0007\u0010\u007f\u001a\u00030\u0080\u0001J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010+\"\u0004\b>\u0010-R \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R.\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\tj\b\u0012\u0004\u0012\u00020\u0016`\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R.\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\tj\b\u0012\u0004\u0012\u00020\u0018`\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u00104\"\u0004\bM\u00106R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010+\"\u0004\bO\u0010-R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\bP\u0010/\"\u0004\bQ\u00101R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\bR\u0010/\"\u0004\bS\u00101R.\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\tj\b\u0012\u0004\u0012\u00020\u001d`\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u00104\"\u0004\bU\u00106R \u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010+\"\u0004\bW\u0010-R \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010+\"\u0004\bY\u0010-R \u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010-R\"\u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b\\\u0010&\"\u0004\b]\u0010(R\"\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\b^\u0010D\"\u0004\b_\u0010FR\"\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b`\u0010/\"\u0004\ba\u00101\u00a8\u0006\u0082\u0001"}, d2 = {"Lcom/rizz/mandiri/assignment/features/movie/data/model/response/DetailMovieResponse;", "", "adult", "", "backdropPath", "", "budget", "", "genres", "Ljava/util/ArrayList;", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/Genres;", "Lkotlin/collections/ArrayList;", "homepage", "id", "imdbId", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "productionCompanies", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ProductionCompanies;", "productionCountries", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/ProductionCountries;", "releaseDate", "revenue", "runtime", "spokenLanguages", "Lcom/rizz/mandiri/assignment/features/movie/data/model/response/SpokenLanguages;", "status", "tagline", "title", "video", "voteAverage", "voteCount", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAdult", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getBudget", "()Ljava/lang/Integer;", "setBudget", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGenres", "()Ljava/util/ArrayList;", "setGenres", "(Ljava/util/ArrayList;)V", "getHomepage", "setHomepage", "getId", "setId", "getImdbId", "setImdbId", "getOriginalLanguage", "setOriginalLanguage", "getOriginalTitle", "setOriginalTitle", "getOverview", "setOverview", "getPopularity", "()Ljava/lang/Double;", "setPopularity", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPosterPath", "setPosterPath", "getProductionCompanies", "setProductionCompanies", "getProductionCountries", "setProductionCountries", "getReleaseDate", "setReleaseDate", "getRevenue", "setRevenue", "getRuntime", "setRuntime", "getSpokenLanguages", "setSpokenLanguages", "getStatus", "setStatus", "getTagline", "setTagline", "getTitle", "setTitle", "getVideo", "setVideo", "getVoteAverage", "setVoteAverage", "getVoteCount", "setVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/rizz/mandiri/assignment/features/movie/data/model/response/DetailMovieResponse;", "equals", "other", "hashCode", "toEntity", "Lcom/rizz/mandiri/assignment/features/movie/domain/entities/DetailMovieEntity;", "toString", "app_debug"})
public final class DetailMovieResponse {
    @com.google.gson.annotations.SerializedName(value = "adult")
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean adult;
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    @org.jetbrains.annotations.Nullable
    private java.lang.String backdropPath;
    @com.google.gson.annotations.SerializedName(value = "budget")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer budget;
    @com.google.gson.annotations.SerializedName(value = "genres")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.Genres> genres;
    @com.google.gson.annotations.SerializedName(value = "homepage")
    @org.jetbrains.annotations.Nullable
    private java.lang.String homepage;
    @com.google.gson.annotations.SerializedName(value = "id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.String imdbId;
    @com.google.gson.annotations.SerializedName(value = "original_language")
    @org.jetbrains.annotations.Nullable
    private java.lang.String originalLanguage;
    @com.google.gson.annotations.SerializedName(value = "original_title")
    @org.jetbrains.annotations.Nullable
    private java.lang.String originalTitle;
    @com.google.gson.annotations.SerializedName(value = "overview")
    @org.jetbrains.annotations.Nullable
    private java.lang.String overview;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    @org.jetbrains.annotations.Nullable
    private java.lang.Double popularity;
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    @org.jetbrains.annotations.Nullable
    private java.lang.String posterPath;
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCompanies> productionCompanies;
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCountries> productionCountries;
    @com.google.gson.annotations.SerializedName(value = "release_date")
    @org.jetbrains.annotations.Nullable
    private java.lang.String releaseDate;
    @com.google.gson.annotations.SerializedName(value = "revenue")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer revenue;
    @com.google.gson.annotations.SerializedName(value = "runtime")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer runtime;
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.SpokenLanguages> spokenLanguages;
    @com.google.gson.annotations.SerializedName(value = "status")
    @org.jetbrains.annotations.Nullable
    private java.lang.String status;
    @com.google.gson.annotations.SerializedName(value = "tagline")
    @org.jetbrains.annotations.Nullable
    private java.lang.String tagline;
    @com.google.gson.annotations.SerializedName(value = "title")
    @org.jetbrains.annotations.Nullable
    private java.lang.String title;
    @com.google.gson.annotations.SerializedName(value = "video")
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean video;
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    @org.jetbrains.annotations.Nullable
    private java.lang.Double voteAverage;
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer voteCount;
    
    public DetailMovieResponse(@org.jetbrains.annotations.Nullable
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable
    java.lang.Integer budget, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.Genres> genres, @org.jetbrains.annotations.Nullable
    java.lang.String homepage, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.Nullable
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCompanies> productionCompanies, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCountries> productionCountries, @org.jetbrains.annotations.Nullable
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable
    java.lang.Integer revenue, @org.jetbrains.annotations.Nullable
    java.lang.Integer runtime, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.SpokenLanguages> spokenLanguages, @org.jetbrains.annotations.Nullable
    java.lang.String status, @org.jetbrains.annotations.Nullable
    java.lang.String tagline, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable
    java.lang.Integer voteCount) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    public final void setAdult(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getBudget() {
        return null;
    }
    
    public final void setBudget(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.Genres> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.Genres> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final void setHomepage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    public final void setOriginalLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    public final void setOriginalTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    public final void setPopularity(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCompanies> getProductionCompanies() {
        return null;
    }
    
    public final void setProductionCompanies(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCompanies> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCountries> getProductionCountries() {
        return null;
    }
    
    public final void setProductionCountries(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCountries> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRevenue() {
        return null;
    }
    
    public final void setRevenue(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    public final void setRuntime(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.SpokenLanguages> getSpokenLanguages() {
        return null;
    }
    
    public final void setSpokenLanguages(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.SpokenLanguages> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTagline() {
        return null;
    }
    
    public final void setTagline(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    public final void setVideo(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    public final void setVoteAverage(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    public final void setVoteCount(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rizz.mandiri.assignment.features.movie.domain.entities.DetailMovieEntity toEntity() {
        return null;
    }
    
    public DetailMovieResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCompanies> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCountries> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.SpokenLanguages> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.Genres> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
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
    public final com.rizz.mandiri.assignment.features.movie.data.model.response.DetailMovieResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable
    java.lang.Integer budget, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.Genres> genres, @org.jetbrains.annotations.Nullable
    java.lang.String homepage, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.Nullable
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCompanies> productionCompanies, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.ProductionCountries> productionCountries, @org.jetbrains.annotations.Nullable
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable
    java.lang.Integer revenue, @org.jetbrains.annotations.Nullable
    java.lang.Integer runtime, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rizz.mandiri.assignment.features.movie.data.model.response.SpokenLanguages> spokenLanguages, @org.jetbrains.annotations.Nullable
    java.lang.String status, @org.jetbrains.annotations.Nullable
    java.lang.String tagline, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable
    java.lang.Integer voteCount) {
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