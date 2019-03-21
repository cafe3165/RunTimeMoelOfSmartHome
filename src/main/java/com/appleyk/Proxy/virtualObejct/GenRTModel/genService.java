package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.runtime.Light;
import com.appleyk.Proxy.virtualObejct.AirConditioners;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;
import com.appleyk.Proxy.virtualObejct.init.initConcept;

public class genService {

	public static void genS(Map<String, String> idmaps, Map<String, String> SerDevMaps, Map<String, Object> serMap,
			Map<String, List<Object>> dmap, Services services) {
		List<Object> airlist = new ArrayList<>();
		List<Object> lightlist = new ArrayList<>();

		for (Object d : dmap.get("airConditioner")) {
			AirCondition aCondition = (AirCondition) d;
			airlist.add(aCondition);
		}
		for (Object d : dmap.get("light")) {
			Light li = (Light) d;
			lightlist.add(li);
		}
//		Light tLight=(Light)lightlist.get(1);
//		System.out.println(tLight.getType());

//		松下空调 卧室
		String ServiceId11 = "S11";
		String DName11 = "air conditioner";
		String Type11 = "Panasonic";
		String CType11 = "Temperature";
		String Effect11 = "Monitor";
		String DeviceId11 = findUtil.findUnderid(airlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId11 = String.valueOf(airlist.get(1).hashCode());

		String ServiceId12 = "S12";
		String Effect12 = "Increase";

		String ServiceId13 = "S13";
		String Effect13 = "Reduce";

		String ServiceId14 = "S14";
		String Effect14 = "Asssign";
////////////////////////////////////////////////////////////////////////////////////////////////////
//		格力空调 卧室
		String ServiceId51 = "S51";
		String DName51 = "air conditioner";
		String Type51 = "Gree";
		String CType51 = "Temperature";
		String Effect51 = "Monitor";
		String DeviceId51 = findUtil.findUnderid(airlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId51 = String.valueOf(airlist.get(0).hashCode());

		String ServiceId52 = "S52";
		String Effect52 = "Increase";

		String ServiceId53 = "S53";
		String Effect53 = "Reduce";

		String ServiceId54 = "S54";
		String Effect54 = "Assign";

//		midea电灯
		String ServiceId21 = "S21";
		String DName21 = "light";
		String Type21 = "Midea";
		String CType21 = "Brightness";
		String Effect21 = "Monitor";
		String DeviceId21 = findUtil.findUnderid(lightlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId21 = String.valueOf(lightlist.get(0).hashCode());

		String ServiceId22 = "S22";
		String Effect22 = "Increase";

		String ServiceId23 = "S23";
		String Effect23 = "Assign";

//		Opple电灯
		String ServiceId61 = "S61";
		String DName61 = "light";
		String Type61 = "Opple";
		String CType61 = "Brightness";
		String Effect61 = "Monitor";
		String DeviceId61 = findUtil.findUnderid(lightlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId61 = String.valueOf(lightlist.get(1).hashCode());

		String ServiceId62 = "S62";
		String Effect62 = "Increase";

		String ServiceId63 = "S63";
		String Effect63 = "Assign";

////////////////////////////////////////////////////////////////////////////////////////////////////
//		服务初始化
		Service Service11 = new Service();
		Service S11 = (Service) initConcept.initService(ServiceId11, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect11, Type11, Service11);
		Service Service12 = new Service();
		Service S12 = (Service) initConcept.initService(ServiceId12, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect12, Type11, Service12);
		Service Service13 = new Service();
		Service S13 = (Service) initConcept.initService(ServiceId13, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect13, Type11, Service13);
		Service Service14 = new Service();
		Service S14 = (Service) initConcept.initService(ServiceId14, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect14, Type11, Service14);

		Service Service51 = new Service();
		Service S51 = (Service) initConcept.initService(ServiceId51, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect51, Type51, Service51);
		Service Service52 = new Service();
		Service S52 = (Service) initConcept.initService(ServiceId52, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect52, Type51, Service52);
		Service Service53 = new Service();
		Service S53 = (Service) initConcept.initService(ServiceId53, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect53, Type51, Service53);
		Service Service54 = new Service();
		Service S54 = (Service) initConcept.initService(ServiceId54, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect54, Type51, Service54);

		Service Service21 = new Service();
		Service S21 = (Service) initConcept.initService(ServiceId21, DeviceId21, RutimeDeviceId21, DName21, CType21,
				Effect21, Type21, Service21);
		Service Service22 = new Service();
		Service S22 = (Service) initConcept.initService(ServiceId22, DeviceId21, RutimeDeviceId21, DName21, CType21,
				Effect22, Type21, Service22);
		Service Service23 = new Service();
		Service S23 = (Service) initConcept.initService(ServiceId23, DeviceId21, RutimeDeviceId21, DName21, CType21,
				Effect23, Type21, Service23);

		Service Service61 = new Service();
		Service S61 = (Service) initConcept.initService(ServiceId61, DeviceId61, RutimeDeviceId61, DName61, CType61,
				Effect61, Type61, Service61);
		Service Service62 = new Service();
		Service S62 = (Service) initConcept.initService(ServiceId62, DeviceId61, RutimeDeviceId61, DName61, CType61,
				Effect22, Type21, Service22);
		Service Service63 = new Service();
		Service S63 = (Service) initConcept.initService(ServiceId63, DeviceId61, RutimeDeviceId61, DName61, CType61,
				Effect23, Type21, Service23);
		
		
		
		AirCondition ndAirCondition = (AirCondition) airlist.get(0);
		AirCondition panasonic = (AirCondition) airlist.get(1);

		Light midea = (Light) lightlist.get(0);
		Light opple = (Light) lightlist.get(1);

//		服务配置
		initConcept.serConfig(panasonic, S11, SerDevMaps, serMap);
		initConcept.serConfig(panasonic, S12, SerDevMaps, serMap);
		initConcept.serConfig(panasonic, S13, SerDevMaps, serMap);
		initConcept.serConfig(panasonic, S14, SerDevMaps, serMap);

		initConcept.serConfig(ndAirCondition, S51, SerDevMaps, serMap);
		initConcept.serConfig(ndAirCondition, S52, SerDevMaps, serMap);
		initConcept.serConfig(ndAirCondition, S53, SerDevMaps, serMap);
		initConcept.serConfig(ndAirCondition, S54, SerDevMaps, serMap);

		initConcept.serConfig(midea, S21, SerDevMaps, serMap);
		initConcept.serConfig(midea, S22, SerDevMaps, serMap);
		initConcept.serConfig(midea, S23, SerDevMaps, serMap);
		
		initConcept.serConfig(opple, S61, SerDevMaps, serMap);
		initConcept.serConfig(opple, S62, SerDevMaps, serMap);
		initConcept.serConfig(opple, S63, SerDevMaps, serMap);

		services.addlist(SerDevMaps);
//		List<String> SList = services.list(true);
		outPutSer(services, serMap, true);

	}

//	服务输出操作
	public static void outPutSer(Services services, Map<String, Object> serMap, boolean f) {

		for (String sid : services.list(f)) {
			services.ListProperties(sid, serMap, f);
		}

	}

}
