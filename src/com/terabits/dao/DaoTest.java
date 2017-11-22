package com.terabits.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
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

}
