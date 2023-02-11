package com.example.quoteapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class QuoteResponse extends BaseObservable {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("lastItemIndex")
    @Expose
    private Integer lastItemIndex;
    @SerializedName("results")
    @Expose
    private List<Quote> results;



    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getLastItemIndex() {
        return lastItemIndex;
    }

    public void setLastItemIndex(Integer lastItemIndex) {
        this.lastItemIndex = lastItemIndex;
    }

    public List<Quote> getResults() {
        return results;
    }

    public void setResults(List<Quote> results) {
        this.results = results;
    }

}
