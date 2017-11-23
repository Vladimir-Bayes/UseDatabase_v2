package com.terabits.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terabits.meta.bo.TelAndBalanceBo;
import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.bo.TimeTelMarkAndImeiBo;
import com.terabits.meta.po.ConsumptionPo;
import com.terabits.meta.po.MetaTest3Po;
import com.terabits.meta.po.MetaTestPo;

public interface DaoTest {
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<MetaTestPo> selectAllItems() throws Exception;
	
	/**
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<MetaTestPo> selectAllItemsByUser(@Param("name") String name) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<MetaTest3Po> selectAllItems3() throws Exception;
	
	/**
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<MetaTest3Po> selectAllItemsByUser3(@Param("name") String name) throws Exception;
	
	/**
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public List<MetaTest3Po> selectAllItemsByPhone3(@Param("phone") String phone) throws Exception;
	
	/**
	 * @param timeSpanBo
	 * @return
	 * @throws Exception
	 */
	public List<MetaTest3Po> selectAllItemsByTime3(TimeSpanBo timeSpanBo) throws Exception;
	
	/**
	 * @param timeSpanAndPhoneBo
	 * @return
	 * @throws Exception
	 */
	public List<MetaTest3Po> selectAllItemsByTimeAndPhone3(TimeSpanAndPhoneBo timeSpanAndPhoneBo) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptions() throws Exception;
	
	/**
	 * @param mark
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptionsByMark(@Param("mark") String mark) throws Exception;
	
	/**
	 * @param imei
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptionsByImei(@Param("imei") String imei) throws Exception;
	
	/**
	 * @param tel
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptionsByTel(@Param("tel") String tel) throws Exception;
	
	/**
	 * @param timeSpanBo
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptionsByTime(TimeSpanBo timeSpanBo) throws Exception;
	
	/**
	 * @param timeSpanAndPhoneBo
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptionsByTimeAndTel(TimeSpanAndPhoneBo timeSpanAndPhoneBo) throws Exception;
	
	/**
	 * @param telMarkAndImeiBo
	 * @return
	 * @throws Exception
	 */
	public List<ConsumptionPo> selectAllConsumptionsByTimeTelMarkAndImei(TimeTelMarkAndImeiBo telMarkAndImeiBo) throws Exception;
	
	/**
	 * @param metaTest3Po
	 * @return
	 * @throws Exception
	 */
	public int insertPayment(MetaTest3Po metaTest3Po) throws Exception;
	
	/**
	 * @param telAndBalanceBo
	 * @return
	 * @throws Exception
	 */
	public int undateBalance(TelAndBalanceBo telAndBalanceBo) throws Exception;

}
