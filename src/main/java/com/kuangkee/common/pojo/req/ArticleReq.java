package com.kuangkee.common.pojo.req;

import java.util.Date;

public class ArticleReq {
	
    private Integer articleId;

    private String brandId;

    private String brandName;

    private String errorCode;

    private String title;

    private String subTitle;

    private String url;

    private String sourceUrl;

    private String isSearchable;

    private String creater;

    private String createrDesc;

    private String readTimes;

    private Date createTime;

    private Date updateTime;

    private String content;

    //--extends req param
    private String searchStartDate ; //搜索开始时间
    
    private String searchEndDate ; //搜索结束时间

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getIsSearchable() {
		return isSearchable;
	}

	public void setIsSearchable(String isSearchable) {
		this.isSearchable = isSearchable;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getCreaterDesc() {
		return createrDesc;
	}

	public void setCreaterDesc(String createrDesc) {
		this.createrDesc = createrDesc;
	}

	public String getReadTimes() {
		return readTimes;
	}

	public void setReadTimes(String readTimes) {
		this.readTimes = readTimes;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSearchStartDate() {
		return searchStartDate;
	}

	public void setSearchStartDate(String searchStartDate) {
		this.searchStartDate = searchStartDate;
	}

	public String getSearchEndDate() {
		return searchEndDate;
	}

	public void setSearchEndDate(String searchEndDate) {
		this.searchEndDate = searchEndDate;
	}

	@Override
	public String toString() {
		return "ArticleReq [articleId=" + articleId + ", brandId=" + brandId + ", brandName=" + brandName
				+ ", errorCode=" + errorCode + ", title=" + title + ", subTitle=" + subTitle + ", url=" + url
				+ ", sourceUrl=" + sourceUrl + ", isSearchable=" + isSearchable + ", creater=" + creater
				+ ", createrDesc=" + createrDesc + ", readTimes=" + readTimes + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", content=" + content + ", searchStartDate=" + searchStartDate
				+ ", searchEndDate=" + searchEndDate + "]";
	}
    
}