package com.terabits.meta.bo;

public class TimeTelMarkAndImeiBo {
	private String beginTime;
    private String endTime;
    private String tel;
    private String mark;
    private String imei;
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public TimeTelMarkAndImeiBo(String beginTime, String endTime) {
		super();
		this.beginTime = beginTime;
		this.endTime = endTime;
	}
	
	public TimeTelMarkAndImeiBo(String beginTime, String endTime, String tel, String mark, String imei) {
		super();
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.tel = tel;
		this.mark = mark;
		this.imei = imei;
	}
    
    
    
}
