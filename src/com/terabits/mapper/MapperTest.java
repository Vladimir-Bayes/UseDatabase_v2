package com.terabits.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terabits.meta.po.*;


public interface MapperTest {

	/**
	 * @return
	 * @throws Exception
	 */
	public List<MetaTestPo> selectAllItems() throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<MetaTestPo> selectAllItemsByUser(@Param("name") String name) throws Exception;
	
}
