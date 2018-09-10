package com.codecool.zibi.superchargetestapp.model;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("adult")
    Boolean adult;

    @SerializedName("backdrop_path")
    String backdropPath;

    @SerializedName("belongs_to_collection")
    Object belongsToCollection;

    public Movie(Boolean adult, String backdropPath, Object belongsToCollection, Integer budget, Object[] genres, String homepage, Integer id, String imdbID, String originalLanguage, String originalTitle, String overview, Integer popularity, Object[] productionCompanies, Object[] productionCountries, String releaseDate, Integer revenue, Integer runtime, Object[] spokenLanguages, String status, String tagline, String title, Boolean video, Integer voteAverage, Integer voteCount) {
        this.adult = adult;
        this.backdropPath = backdropPath;
        this.belongsToCollection = belongsToCollection;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.id = id;
        this.imdbID = imdbID;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.productionCompanies = productionCompanies;
        this.productionCountries = productionCountries;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.spokenLanguages = spokenLanguages;
        this.status = status;
        this.tagline = tagline;
        this.title = title;
        this.video = video;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    @SerializedName("budget")
    Integer budget;

    @SerializedName("genres")
    Object[] genres;

    @SerializedName("homepage")
    String homepage;

    @SerializedName("id")
    Integer id;

    @SerializedName("imdb_id")
    String imdbID;

    @SerializedName("original_language")
    String originalLanguage;

    @SerializedName("original_title")
    String originalTitle;

    @SerializedName("overview")
    String overview;

    @SerializedName("popularity")
    Integer popularity;

    @SerializedName("production_companies")
    Object[] productionCompanies;

    @SerializedName("production_countries")
    Object[] productionCountries;

    @SerializedName("release_date")
    String releaseDate;

    @SerializedName("revenue")
    Integer revenue;

    @SerializedName("runtime")
    Integer runtime;

    @SerializedName("spoken_languages")
    Object[] spokenLanguages;

    @SerializedName("status")
    String status;

    @SerializedName("tagline")
    String tagline;

    @SerializedName("title")
    String title;

    @SerializedName("video")
    Boolean video;

    @SerializedName("vote_average")
    Integer voteAverage;

    @SerializedName("vote_count")
    Integer voteCount;

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Object[] getGenres() {
        return genres;
    }

    public void setGenres(Object[] genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Object[] getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(Object[] productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public Object[] getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(Object[] productionCountries) {
        this.productionCountries = productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Object[] getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(Object[] spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Integer getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Integer voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}
