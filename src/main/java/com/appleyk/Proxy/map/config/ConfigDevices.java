package com.appleyk.Proxy.map.config;

import java.util.List;
import java.util.Map;

public class ConfigDevices {
	
	public static void config(Map<String, String> classMaps,Map<String, List<String>> apiMaps) throws Exception {
		ConfigAirConditioner.config(classMaps, apiMaps);
		ConfigLight.config(classMaps, apiMaps);
		ConfigPMMonitor.config(classMaps, apiMaps);
//		ConfigAir2s.config(classMaps, apiMaps);
		
	}
	

}
