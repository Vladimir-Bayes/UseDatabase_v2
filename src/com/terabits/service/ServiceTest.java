package com.terabits.service;

import java.util.List;

import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.bo.TimeTelMarkAndImeiBo;
import com.terabits.meta.po.*;;

public interface ServiceTest {
	/**
	 * @return
	 */
	public List<MetaTestPo> getAllItems();
	/**
	 * @param name
	 * @return
	 */
	public List<MetaTestPo> getAllItemsByUser(String name);
	/**
	 * @return
	 */
	public List<MetaTest3Po> getAllItems3();
	/**
	 * @param name
	 * @return
	 */
	public List<MetaTest3Po> getAllItemsByUser3(String name);
	
	/**
	 * @param phone
	 * @return
	 */
	public List<MetaTest3Po> getAllItemsByPhone3(String phone);
	
	/**
	 * @param timeSpanBo
	 * @return
	 */
	public List<MetaTest3Po> getAllItemsByTime3(TimeSpanBo timeSpanBo);
	
	/**
	 * @param timeSpanAndPhoneBo
	 * @return
	 */
	public List<MetaTest3Po> getAllItemsByTimeAndPhone3(TimeSpanAndPhoneBo timeSpanAndPhoneBo);
	
	/**
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptions();
	
	/**
	 * @param tel
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptionsByTel(String tel);
	
	/**
	 * @param mark
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptionsByMark(String mark);
	
	/**
	 * @param imei
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptionsByImei(String imei);
	
	/**
	 * @param timeSpanBo
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptionsByTime(TimeSpanBo timeSpanBo);
	
	/**
	 * @param timeSpanAndPhoneBo
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptionsByTimeAndTel(TimeSpanAndPhoneBo timeSpanAndPhoneBo);
	
	/**
	 * @param telMarkAndImeiBo
	 * @return
	 */
	public List<ConsumptionPo> getAllConsumptionsByTimeTelMarkAndImei(TimeTelMarkAndImeiBo telMarkAndImeiBo);
	
}
