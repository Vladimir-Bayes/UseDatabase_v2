package com.terabits.controller;

import java.util.ArrayList;
import java.util.List;

import com.terabits.meta.bo.TimeSpanAndPhoneBo;
import com.terabits.meta.bo.TimeSpanBo;
import com.terabits.meta.bo.TimeTelMarkAndImeiBo;
import com.terabits.meta.po.ConsumptionPo;
import com.terabits.meta.po.MetaTest3Po;
import com.terabits.meta.po.MetaTestPo;
import com.terabits.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import net.sf.json.JSONArray;

@Controller
public class ControllerTest {
	
	@Autowired
	private ServiceTest serviceTest;
	
	@RequestMapping(value="/controllertest")
	public String controllertest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<MetaTestPo> allitems = new ArrayList<MetaTestPo>();
		allitems=serviceTest.getAllItems();
		//JSONArray jsonArray = JSONArray.fromObject(allitems);
		//response.getWriter().println(allitems.get(0).name);
		
		for (int i = 0; i < allitems.size(); i++) {
//			System.out.println(allitems.get(i).getUserId()+"");
//			System.out.println(allitems.get(i).getName());
//			System.out.println(allitems.get(i).getTel());
			System.out.println(allitems.get(i).getUserId()+" " + allitems.get(i).getName()+"  "+allitems.get(i).getTel());
			
		}
		
//		System.out.println(allitems.get(1).name);
//		System.out.println(allitems.get(1).getUserId()+"");
		
		return "11";
	}
	
	@RequestMapping(value="/controllertestuser")
	public String controllertestuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		List<MetaTestPo> allitemsbyuser = new ArrayList<MetaTestPo>();
		allitemsbyuser=serviceTest.getAllItemsByUser(name);
		System.out.println(allitemsbyuser.get(0).getName());
		System.out.println(allitemsbyuser.get(0).getTel());
		System.out.println(allitemsbyuser.get(0).getUserId());
		
		return "22";
	}
	
	@RequestMapping(value="/controllertest3")
	public String controllertest3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<MetaTest3Po> allitems3 = new ArrayList<MetaTest3Po>();
		allitems3 = serviceTest.getAllItems3();
		for (int i = 0; i < allitems3.size(); i++) {
			System.out.println(allitems3.get(i).getUserId()+" " + allitems3.get(i).getName()+"  "+allitems3.get(i).getTel());			
		}
		return "33";
	}
	
	@RequestMapping(value="/controllertestuser3")
	public String controllertestuser3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		List<MetaTest3Po> allitemsbyuser3 = new ArrayList<MetaTest3Po>();
		allitemsbyuser3=serviceTest.getAllItemsByUser3(name);
		for (int i = 0; i < allitemsbyuser3.size(); i++) {
			System.out.println(allitemsbyuser3.get(i).getCreateTime());			
			System.out.println(allitemsbyuser3.get(i).getUserId()+" " + allitemsbyuser3.get(i).getName()+"  "+allitemsbyuser3.get(i).getTel());

		}
		return "44";
	}
	
	@RequestMapping(value="/controllertestphone3")
	public String controllertestphone3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String phone = request.getParameter("phone");
		List<MetaTest3Po> allitemsbyphone3 = new ArrayList<MetaTest3Po>();
		allitemsbyphone3 = serviceTest.getAllItemsByPhone3(phone);
		for (int i = 0; i < allitemsbyphone3.size(); i++) {
			System.out.println(allitemsbyphone3.get(i).getUserId()+"  "+allitemsbyphone3.get(i).getName()+"  "+allitemsbyphone3.get(i).getTel()+"  "+allitemsbyphone3.get(i).getCreateTime()+"  "+allitemsbyphone3.get(i).getPayment());
		}
		return "55";
	}
	
	@RequestMapping(value="/controllertesttime3")
	public String controllertesttime3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		List<MetaTest3Po> allitemsbytime3 = new ArrayList<MetaTest3Po>();
		if (beginTime.equals("0")) {
			allitemsbytime3 = serviceTest.getAllItems3();
		} else {
			TimeSpanBo timeSpanBo = new TimeSpanBo(beginTime,endTime);
			allitemsbytime3 = serviceTest.getAllItemsByTime3(timeSpanBo);
		}
		
		for (int i = 0; i < allitemsbytime3.size(); i++) {
			System.out.println(allitemsbytime3.get(i).getUserId()+"  "+allitemsbytime3.get(i).getName()+"  "+allitemsbytime3.get(i).getTel()+"  "+allitemsbytime3.get(i).getCreateTime()+"  "+allitemsbytime3.get(i).getPayment());
		}
		return "66";
	}
	
	@RequestMapping(value="/controllertesttimeandphone3")
	public String controllertesttimeandphone3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		String phone = request.getParameter("phone");
		List<MetaTest3Po> allitemsbytimeandphone3 = new ArrayList<MetaTest3Po>();
		if (beginTime.equals("0")) {
			allitemsbytimeandphone3 = serviceTest.getAllItemsByPhone3(phone);			
		} else {
			TimeSpanAndPhoneBo timeSpanAndPhoneBo = new TimeSpanAndPhoneBo(beginTime, endTime, phone);
			allitemsbytimeandphone3 = serviceTest.getAllItemsByTimeAndPhone3(timeSpanAndPhoneBo);
		}
		for (int i = 0; i < allitemsbytimeandphone3.size(); i++) {
			System.out.println(allitemsbytimeandphone3.get(i).getUserId()+"  "+allitemsbytimeandphone3.get(i).getName()+"  "+allitemsbytimeandphone3.get(i).getTel()+"  "+allitemsbytimeandphone3.get(i).getCreateTime()+"  "+allitemsbytimeandphone3.get(i).getPayment());
		}
		return "77";
 	}
	
	@RequestMapping(value="/consumption")
	public String consumption(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptions();
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "88";
	}
	
	@RequestMapping(value="/consumptiontel")
	public String consumptiontel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String tel = request.getParameter("tel");
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptionsByTel(tel);
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "99";
	}
	
	@RequestMapping(value="/consumptionmark")
	public String consumptionmark(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mark = request.getParameter("mark");
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptionsByMark(mark);
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "100";
	}
	
	@RequestMapping(value="/consumptionimei")
	public String consumptionimei(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String imei = request.getParameter("imei");
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptionsByImei(imei);
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "101";
 	}
	
	@RequestMapping(value="/consumptiontime")
	public String consumptiontime(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		TimeSpanBo timeSpanBo = new TimeSpanBo(beginTime,endTime);
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptionsByTime(timeSpanBo);
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "102";
	}
	
	@RequestMapping(value="/consumptiontimetel")
	public String consumptiontimetel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		String tel = request.getParameter("tel");
		TimeSpanAndPhoneBo timeSpanAndPhoneBo = new TimeSpanAndPhoneBo(beginTime,endTime,tel);
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptionsByTimeAndTel(timeSpanAndPhoneBo);
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "103";
	}
	
	@RequestMapping(value="/consumptiontimetelmarkimei")
	public String consumptiontimetelmarkimei(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		String tel = request.getParameter("tel");
		String mark = request.getParameter("mark");
		String imei = request.getParameter("imei");
		TimeTelMarkAndImeiBo timeTelMarkAndImeiBo = new TimeTelMarkAndImeiBo(beginTime, endTime, tel, mark, imei);
		List<ConsumptionPo> consumptionPos = new ArrayList<ConsumptionPo>();
		consumptionPos = serviceTest.getAllConsumptionsByTimeTelMarkAndImei(timeTelMarkAndImeiBo);
		for (int i = 0; i < consumptionPos.size(); i++) {
			System.out.println(consumptionPos.get(i).getUserId()+"  "+consumptionPos.get(i).getName()+"  "+consumptionPos.get(i).getTel()+"  "+consumptionPos.get(i).getCreateTime()+"  "+consumptionPos.get(i).getConsumption()+"  "+consumptionPos.get(i).getImei()+"  "+consumptionPos.get(i).getMark());
		}
		return "104";
	}


}
