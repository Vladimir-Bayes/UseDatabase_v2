package com.terabits.meta.bo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeSpanAndPhoneBo {
	private String beginTime;
    private String endTime;
    private String phone;
    
    public TimeSpanAndPhoneBo() {
    	this.beginTime = "2000-01-01 00:0:00";
        this.endTime = "2999-12-12 23:59:59";
    }
    
    public TimeSpanAndPhoneBo(String beginTime, String endTime) {
    	this.beginTime=beginTime;
    	this.endTime=endTime;
    }
    
    public TimeSpanAndPhoneBo(String beginTime, String endTime, String phone) {
    	this.beginTime=beginTime;
    	this.endTime=endTime;
    	this.phone=phone;
    }
    
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public TimeSpanAndPhoneBo setTimeYesterday() {
		Date date = new Date();//ȡʱ��
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE, -1);//��������ǰ����һ�죬��������������һ���򽫸�����Ϊ����
		date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
		String dateString = formatter.format(date);
		String beginTime = dateString + "00:00:00";
		String endTime = dateString + "23:59:59";
		return new TimeSpanAndPhoneBo(beginTime, endTime);
	}

	@Override
	public String toString() {
		return "TimeSpanBO[" +
				"beginTime='" + beginTime + '\'' +
				", endTime='" + endTime + '\'' +
				']';
	}

}
