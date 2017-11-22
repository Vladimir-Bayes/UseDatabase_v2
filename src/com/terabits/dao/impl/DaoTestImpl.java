package com.terabits.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import com.terabits.dao.DaoTest;
import com.terabits.mapper.MapperTest;
import com.terabits.mapper.MapperTest3;
import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.po.MetaTest3Po;
import com.terabits.meta.po.MetaTestPo;
import com.terabits.utils.DBTools;
import org.springframework.stereotype.Repository;

@Repository("daoTest")
public class DaoTestImpl implements DaoTest  {
	
	public List<MetaTestPo> selectAllItems() {
		SqlSession session = DBTools.getSession();
		MapperTest mapper = session.getMapper(MapperTest.class);
		List<MetaTestPo> metaTestPos = new ArrayList<MetaTestPo>();
		try {
			metaTestPos=mapper.selectAllItems();
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
		return metaTestPos;
	}
	
	public List<MetaTestPo> selectAllItemsByUser(String name) throws Exception {
		SqlSession session = DBTools.getSession();
		MapperTest mapper = session.getMapper(MapperTest.class);
		List<MetaTestPo> metaTestPos = new ArrayList<MetaTestPo>();
		try {
			metaTestPos = mapper.selectAllItemsByUser(name);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return metaTestPos;
	}
	
	public List<MetaTest3Po> selectAllItems3() throws Exception {
		SqlSession session = DBTools.getSession();
		MapperTest3 mapper = session.getMapper(MapperTest3.class);
		List<MetaTest3Po> metaTest3Pos = new ArrayList<MetaTest3Po>();
		try {
			metaTest3Pos = mapper.selectAllItems3();
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return metaTest3Pos;
	}
	
	public List<MetaTest3Po> selectAllItemsByUser3(@Param("name") String name) throws Exception {
		SqlSession session = DBTools.getSession();
		MapperTest3 mapper = session.getMapper(MapperTest3.class);
		List<MetaTest3Po> metaTest3Pos = new ArrayList<MetaTest3Po>();
		try {
			metaTest3Pos = mapper.selectAllItemsByUser3(name);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return metaTest3Pos;
	}
	
	public List<MetaTest3Po> selectAllItemsByPhone3(String phone) throws Exception {
		SqlSession session = DBTools.getSession();
		MapperTest3 mapper = session.getMapper(MapperTest3.class);
		List<MetaTest3Po> metaTest3Pos = new ArrayList<MetaTest3Po>();
		try {
			metaTest3Pos = mapper.selectAllItemsByPhone3(phone);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return metaTest3Pos;
	}
	
	public List<MetaTest3Po> selectAllItemsByTime3(TimeSpanBo timeSpanBo) throws Exception {
		SqlSession session = DBTools.getSession();
		MapperTest3 mapper = session.getMapper(MapperTest3.class);
		List<MetaTest3Po> metaTest3Pos = new ArrayList<MetaTest3Po>();
		try {
			metaTest3Pos = mapper.selectAllItemsByTime3(timeSpanBo);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return metaTest3Pos;
	}
	
	public List<MetaTest3Po> selectAllItemsByTimeAndPhone3(TimeSpanAndPhoneBo timeSpanAndPhoneBo) throws Exception {
		SqlSession session = DBTools.getSession();
		MapperTest3 mapper = session.getMapper(MapperTest3.class);
		List<MetaTest3Po> metaTest3Pos = new ArrayList<MetaTest3Po>();
		try {
			metaTest3Pos = mapper.selectAllItemsByTimeAndPhone3(timeSpanAndPhoneBo);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return metaTest3Pos;
	}

}
