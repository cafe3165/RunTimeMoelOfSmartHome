package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.virtualObejct.AirConditioners;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;
import com.appleyk.Proxy.virtualObejct.init.initConcept;

public class genService {

	public static void genS(Map<String, String> idmaps, Map<String, String> SerDevMaps, Map<String, Object> serMap,
			Map<String, List<Object>> dmap, Services services) {
		List<Object> curDlist = new ArrayList<>();
		
		
		for (Object d : dmap.get("AirConditioner")) {
			AirCondition aCondition = (AirCondition) d;
			curDlist.add(aCondition);
		}
//		松下空调 卧室
		String ServiceId11 = "S11";
		String DName11 = "air conditioner";
		String Type11 = "Panasonic";
		String CType11 = "temperature";
		String Effect11 = "Monitor";
		String DeviceId11 = findUtil.findUnderid(curDlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId11 = String.valueOf(curDlist.get(1).hashCode());

		String ServiceId12 = "S12";
		String DName12 = "air conditioner";
		String Type12 = "Panasonic";
		String CType12 = "temperature";
		String Effect12 = "Increase";
		String DeviceId12 = findUtil.findUnderid(curDlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId12 = String.valueOf(curDlist.get(1).hashCode());

		String ServiceId13 = "S13";
		String DName13 = "air conditioner";
		String Type13 = "Panasonic";
		String CType13 = "temperature";
		String Effect13 = "Reduce";
		String DeviceId13 = findUtil.findUnderid(curDlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId13 = String.valueOf(curDlist.get(1).hashCode());

		String ServiceId14 = "S14";
		String DName14 = "air conditioner";
		String Type14 = "Panasonic";
		String CType14 = "temperature";
		String Effect14 = "Asssign";
		String DeviceId14 = findUtil.findUnderid(curDlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId14 = String.valueOf(curDlist.get(1).hashCode());
////////////////////////////////////////////////////////////////////////////////////////////////////
//		格力空调 卧室
		String ServiceId51 = "S51";
		String DName51 = "air conditioner";
		String Type51 = "Gree";
		String CType51 = "temperature";
		String Effect51 = "Monitor";
		String DeviceId51 = findUtil.findUnderid(curDlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId51 = String.valueOf(curDlist.get(0).hashCode());

		String ServiceId52 = "S52";
		String DName52 = "air conditioner";
		String Type52 = "Gree";
		String CType52 = "temperature";
		String Effect52 = "Increase";
		String DeviceId52 = findUtil.findUnderid(curDlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId52 = String.valueOf(curDlist.get(0).hashCode());

		String ServiceId53 = "S53";
		String DName53 = "air conditioner";
		String Type53 = "Gree";
		String CType53 = "temperature";
		String Effect53 = "Reduce";
		String DeviceId53 = findUtil.findUnderid(curDlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId53 = String.valueOf(curDlist.get(0).hashCode());

		String ServiceId54 = "S54";
		String DName54 = "air conditioner";
		String Type54 = "Gree";
		String CType54 = "temperature";
		String Effect54 = "Assign";
		String DeviceId54 = findUtil.findUnderid(curDlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId54 = String.valueOf(curDlist.get(0).hashCode());
////////////////////////////////////////////////////////////////////////////////////////////////////
//		服务初始化
		Service Service11 = new Service();
		Service S11 = (Service) initConcept.initService(ServiceId11, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect11, Type11, Service11);
		Service Service12 = new Service();
		Service S12 = (Service) initConcept.initService(ServiceId12, DeviceId12, RutimeDeviceId12, DName12, CType12,
				Effect12, Type12,Service12);
		Service Service13 = new Service();
		Service S13 = (Service) initConcept.initService(ServiceId13, DeviceId13, RutimeDeviceId13, DName13, CType13,
				Effect13, Type13,Service13);
		Service Service14 = new Service();
		Service S14 = (Service) initConcept.initService(ServiceId14, DeviceId14, RutimeDeviceId14, DName14, CType14,
				Effect14,Type14, Service14);
		
		Service Service51 = new Service();
		Service S51 = (Service) initConcept.initService(ServiceId51, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect51, Type51, Service51);
		Service Service52 = new Service();
		Service S52 = (Service) initConcept.initService(ServiceId52, DeviceId52, RutimeDeviceId52, DName52, CType52,
				Effect52, Type52, Service52);
		Service Service53 = new Service();
		Service S53 = (Service) initConcept.initService(ServiceId53, DeviceId53, RutimeDeviceId53, DName53, CType53,
				Effect53, Type53, Service53);
		Service Service54 = new Service();
		Service S54 = (Service) initConcept.initService(ServiceId54, DeviceId54, RutimeDeviceId54, DName54, CType54,
				Effect54, Type54, Service54);

		AirCondition ndAirCondition = (AirCondition) curDlist.get(0);
		AirCondition panasonic = (AirCondition) curDlist.get(1);
//		服务配置
		initConcept.serConfig(panasonic, S11, SerDevMaps, serMap);
		initConcept.serConfig(panasonic, S12, SerDevMaps, serMap);
		initConcept.serConfig(panasonic, S13, SerDevMaps, serMap);
		initConcept.serConfig(panasonic, S14, SerDevMaps, serMap);
		
		initConcept.serConfig(ndAirCondition, S51, SerDevMaps, serMap);
		initConcept.serConfig(ndAirCondition, S52, SerDevMaps, serMap);
		initConcept.serConfig(ndAirCondition, S53, SerDevMaps, serMap);
		initConcept.serConfig(ndAirCondition, S54, SerDevMaps, serMap);
		
		

		services.addlist(SerDevMaps);
//		List<String> SList = services.list(true);
		outPutSer(services, serMap, false);

	}

//	服务输出操作
	public static void outPutSer(Services services, Map<String, Object> serMap, boolean f) {

		for (String sid : services.list(f)) {
			services.ListProperties(sid, serMap, f);
		}

	}

}
