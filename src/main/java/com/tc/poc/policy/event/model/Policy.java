package com.tc.poc.policy.event.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Policy {
	
	private String policyId;
	private String baseLocation;
	private Double premium;
	private String packageCode;
	private String policyNumber;
	private Boolean isQuote;
	private String policyEffDate;
	private String policyExpDate;
	private String lastVisitedPage;
	
	public Policy(@JsonProperty("policyId") String policyId, 
					@JsonProperty("baseLocation") String baseLocation, 
					@JsonProperty("premium") Double premium, 
					@JsonProperty("packageCode")String packageCode, 
					@JsonProperty("policyNumber") String policyNumber,
					@JsonProperty("isQuote") Boolean isQuote, 
					@JsonProperty("policyEffDate") String policyEffDate, 
					@JsonProperty("policyExpDate") String policyExpDate, 
					@JsonProperty("lastVisitedPage") String lastVisitedPage) {
		this.policyId = policyId;
		this.baseLocation = baseLocation;
		this.premium = premium;
		this.packageCode = packageCode;
		this.policyNumber = policyNumber;
		this.isQuote = isQuote;
		this.policyEffDate = policyEffDate;
		this.policyExpDate = policyExpDate;
		this.lastVisitedPage = lastVisitedPage;
	}
	public String getPolicyId() {
		return policyId;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public Double getPremium() {
		return premium;
	}
	public String getPackageCode() {
		return packageCode;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public Boolean getIsQuote() {
		return isQuote;
	}
	public String getPolicyEffDate() {
		return policyEffDate;
	}
	public String getPolicyExpDate() {
		return policyExpDate;
	}
	public String getLastVisitedPage() {
		return lastVisitedPage;
	}
	@Override
	public String toString() {
		return String.format(
				"Policy [policyId=%s, baseLocation=%s, premium=%s, packageCode=%s, policyNumber=%s, isQuote=%s, policyEffDate=%s, policyExpDate=%s, lastVisitedPage=%s]",
				policyId, baseLocation, premium, packageCode, policyNumber, isQuote, policyEffDate, policyExpDate,
				lastVisitedPage);
	}
			

}
