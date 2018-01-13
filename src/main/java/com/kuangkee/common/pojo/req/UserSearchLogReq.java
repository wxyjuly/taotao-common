package com.kuangkee.common.pojo.req ;

import java.util.Date;

public class UserSearchLogReq {
	
    private Integer logId;

    private Integer userId;

    private Integer brandId;

    private String brandName;

    private String originalContent;

    private String searchContent;

    private String userName;

    private String phone;

    private String status;

    private String isMatch;

    private String longitude;

    private String latitude;

    private String ip;

    private Date createTime;

    private Date updateTime;
    
    //--extends req param
    private String searchStartDate ; //搜索开始时间
    
    private String searchEndDate ; //搜索结束时间

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOriginalContent() {
		return originalContent;
	}

	public void setOriginalContent(String originalContent) {
		this.originalContent = originalContent;
	}

	public String getSearchContent() {
		return searchContent;
	}

	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsMatch() {
		return isMatch;
	}

	public void setIsMatch(String isMatch) {
		this.isMatch = isMatch;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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
		return "UserSearchLogReq [logId=" + logId + ", userId=" + userId + ", brandId=" + brandId + ", brandName="
				+ brandName + ", originalContent=" + originalContent + ", searchContent=" + searchContent
				+ ", userName=" + userName + ", phone=" + phone + ", status=" + status + ", isMatch=" + isMatch
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", ip=" + ip + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", searchStartDate=" + searchStartDate + ", searchEndDate="
				+ searchEndDate + "]";
	}
    
}