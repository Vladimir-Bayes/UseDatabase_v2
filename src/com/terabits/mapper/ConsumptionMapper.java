package com.terabits.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.bo.TimeTelMarkAndImeiBo;
import com.terabits.meta.po.ConsumptionPo;

public interface ConsumptionMapper {
	
	public List<ConsumptionPo> selectAllConsumptions() throws Exception;
	
	public List<ConsumptionPo> selectAllConsumptionsByMark(@Param("mark") String mark) throws Exception;
	
	public List<ConsumptionPo> selectAllConsumptionsByImei(@Param("imei") String imei) throws Exception;
	
	public List<ConsumptionPo> selectAllConsumptionsByTel(@Param("tel") String tel) throws Exception;
	
	public List<ConsumptionPo> selectAllConsumptionsByTime(TimeSpanBo timeSpanBo) throws Exception;
	
	public List<ConsumptionPo> selectAllConsumptionsByTimeAndTel(TimeSpanAndPhoneBo timeSpanAndPhoneBo) throws Exception;
	
	public List<ConsumptionPo> selectAllConsumptionsByTimeTelMarkAndImei(TimeTelMarkAndImeiBo telMarkAndImeiBo) throws Exception;

}
