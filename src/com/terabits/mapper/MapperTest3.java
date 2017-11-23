package com.terabits.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terabits.meta.bo.TelAndBalanceBo;
import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.po.MetaTest3Po;

public interface MapperTest3 {

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
