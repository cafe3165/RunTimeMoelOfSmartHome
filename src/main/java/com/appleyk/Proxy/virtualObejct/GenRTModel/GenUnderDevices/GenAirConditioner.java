package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Gree;
import com.appleyk.Proxy.device.Panasonic;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.virtualObejct.AirConditioners;

public class GenAirConditioner {
	public static List<Object> genAirConditioner(Map<Object, Object> objMaps, Map<String, Object> idObjmaps, Map<String, String> idmaps,
			Map<String, Object> uidMaps, AirConditioners airConditioners) throws Exception {
		List<Object> dList=new ArrayList<Object>();
		
		// 底层设备生成 返回一个运行时对象
		AirCondition gree = (AirCondition) Relation.generate(Gree.class.getName());
		AirCondition panasonic = (AirCondition) Relation.generate(Panasonic.class.getName());

		// 运行时对象调用

		panasonic.setID("D1");
		panasonic.setDName("air conditioner");
		panasonic.setType("Panasonic");
		panasonic.setLName("sittingroom");
		panasonic.setT(0.0);
		panasonic.setStatus("off");
		idObjmaps.put(String.valueOf(panasonic.hashCode()), objMaps.get(panasonic));
		idmaps.put(panasonic.getID(), String.valueOf(panasonic.hashCode()));
		
		Object dObject = findUtil.findUnderDByRuntimeD(objMaps.get(gree), objMaps);
		AirCondition ndAirCondition = (AirCondition) dObject;
		ndAirCondition.setID("D5");
		ndAirCondition.setDName("air conditioner");
		ndAirCondition.setType("Gree");
		ndAirCondition.getID();
		ndAirCondition.setT(0.0);
		ndAirCondition.setLName("bedroom");
		ndAirCondition.setStatus("off");
		idObjmaps.put(String.valueOf(ndAirCondition.hashCode()), objMaps.get(gree));
		idmaps.put(gree.getID(), String.valueOf(ndAirCondition.hashCode()));

		// 运行时空调对象集合，有添加空调的方法addlist和列出运行时空调的方法list
//				Devices airConditions = new Devices();
		// 遍历运行时对象标识与底层设备id的映射，添加运行时设备对应的底层设备id
		for (Map.Entry<String, String> mEntry : idmaps.entrySet()) {
			airConditioners.addlist(mEntry.getKey());
		}
		// 列出运行时的空调对应的底层空调
//				System.out.println("当前设备为：");
		List<String> airCList = airConditioners.list(false);
//				根据设备id获得所有设备的属性
//				System.out.println("设备属性列表：");
//				for (String underDeviceId : airCList) {
//					System.out.println("---------------------------");
//					airConditioners.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps,true);
//					
//		
//				}

		uidMaps.put(ndAirCondition.getID(), ndAirCondition);
		uidMaps.put(panasonic.getID(), panasonic);
		dList.add(ndAirCondition);
		dList.add(panasonic);
		
		return dList;
	}

}
