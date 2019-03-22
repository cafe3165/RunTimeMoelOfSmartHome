package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Gree;
import com.appleyk.Proxy.device.Panasonic;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.virtualObejct.AirConditioners;
import com.appleyk.Proxy.virtualObejct.Lights;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenAirConditioner;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenLight;

public class genDevice {

	public static Map<String, List<Object>> genD(Map<Object, Object> objMaps, Map<String, Object> idObjmaps, Map<String, String> idmaps,
			Map<String, Object> uidMaps,Map<String, Object> typeMap) throws Exception {

		
//		AirConditioners airConditioners;
		Map<String, List<Object>> dmaps=new HashMap<String, List<Object>>();
		List<Object> aList=new ArrayList<>();
		List<Object> lList=new ArrayList<>();
		List<Object> pmList=new ArrayList<>();
		
		
		aList=GenAirConditioner.genAirConditioner(objMaps, idObjmaps, idmaps, uidMaps, (AirConditioners) typeMap.get("AirConditioners"));
		dmaps.put("airConditioner", aList);
		lList=GenLight.genLight(objMaps, idObjmaps, idmaps, uidMaps, (Lights)typeMap.get("Lights"));
		dmaps.put("light", lList);
//		pmList=.genLight(objMaps, idObjmaps, idmaps, uidMaps, (Lights)typeMap.get("Lights"));
//		dmaps.put("light", pmList);
		
		
		
		return dmaps;
	}

}
