package com.terabits.service.impl;

import java.util.List;

import com.terabits.dao.DaoTest;
import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.po.MetaTest3Po;
import com.terabits.meta.po.MetaTestPo;
import com.terabits.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTestImpl implements ServiceTest {
	
	@Autowired
	private DaoTest daoTest;
	
	public List<MetaTestPo> getAllItems() {
		try {
			return daoTest.selectAllItems();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<MetaTestPo> getAllItemsByUser(String name) {
		try {
			return daoTest.selectAllItemsByUser(name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<MetaTest3Po> getAllItems3() {
		try {
			return daoTest.selectAllItems3();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<MetaTest3Po> getAllItemsByUser3(String name) {
		try {
			return daoTest.selectAllItemsByUser3(name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<MetaTest3Po> getAllItemsByPhone3(String phone) {
		try {
			return daoTest.selectAllItemsByPhone3(phone);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<MetaTest3Po> getAllItemsByTime3(TimeSpanBo timeSpanBo) {
		try {
			return daoTest.selectAllItemsByTime3(timeSpanBo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<MetaTest3Po> getAllItemsByTimeAndPhone3(TimeSpanAndPhoneBo timeSpanAndPhoneBo) {
		try {
			return daoTest.selectAllItemsByTimeAndPhone3(timeSpanAndPhoneBo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
