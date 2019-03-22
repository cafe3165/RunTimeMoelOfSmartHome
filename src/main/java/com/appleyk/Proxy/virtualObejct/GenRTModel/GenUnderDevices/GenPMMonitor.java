package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.appleyk.Proxy.device.Philips;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.runtime.AirMonitor;
import com.appleyk.Proxy.virtualObejct.PMMonitors;

public class GenPMMonitor {
	public static List<Object> genPMMonitor(Map<Object, Object> objMaps, Map<String, Object> idObjmaps, Map<String, String> idmaps,
			Map<String, Object> uidMaps, PMMonitors pmMonitors) throws Exception {
		List<Object> dList=new ArrayList<Object>();
		
		// 底层设备生成 返回一个运行时对象
		AirMonitor philips = (AirMonitor) Relation.generate(Philips.class.getName());

		// 运行时对象调用

		philips.setId("D3");
		philips.setDName("PM2.5 monitor");
		philips.setType("Philips");
		philips.setLName("sittingroom");
		philips.setPM2_5(0.0);
		philips.setStatus("off");
		idObjmaps.put(String.valueOf(philips.hashCode()), objMaps.get(philips));
		idmaps.put(philips.getId(), String.valueOf(philips.hashCode()));
		
		// 运行时空调对象集合，有添加空调的方法addlist和列出运行时空调的方法list
//				Devices airConditions = new Devices();
		// 遍历运行时对象标识与底层设备id的映射，添加运行时设备对应的底层设备id
		for (Map.Entry<String, String> mEntry : idmaps.entrySet()) {
			pmMonitors.addlist(mEntry.getKey());
		}
		// 列出运行时的空调对应的底层空调
//				System.out.println("当前设备为：");
		List<String> pmList = pmMonitors.list(false);
//				根据设备id获得所有设备的属性
				System.out.println("设备属性列表：");
				for (String underDeviceId : pmList) {
					System.out.println("---------------------------");
					pmMonitors.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps,true);
					
		
				}

		uidMaps.put(philips.getId(), philips);
		dList.add(philips);
		
		return dList;
	}


}
