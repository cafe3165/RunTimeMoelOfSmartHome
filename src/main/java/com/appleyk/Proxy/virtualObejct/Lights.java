package com.appleyk.Proxy.virtualObejct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.runtime.Light;

public class Lights {
	public List<String> IdList = new ArrayList<String>();

	public void addlist(String deviceId) {
		IdList.add(deviceId);
	}

	public List<String> list(boolean f) {
		if (f) {
			System.out.println(IdList);
		}

		return IdList;

	}

//	列出设备的所有属性
	public Object ListProperties(String UnderDeviceId, Map<Object, Object> objMaps, Map<String, Object> idObjmaps,
			Map<String, String> idmaps, boolean f) {

//		根据底层设备id 如A0找到对应的运行时设备对象id
		String RuntimeDeviceId = "";
		
		for (String rid : idmaps.keySet()) {
			if (rid.equals(UnderDeviceId)) {
				RuntimeDeviceId = idmaps.get(rid);
			}

		}

		Object destinDevice = null;
//		运行时对象标识id与运行时对象的映射
//		{2101973421=com.appleyk.Proxy.device.Gree@1b6d3586, 685325104=com.appleyk.Proxy.device.Panasonic@4554617c}
//		通过运行时对象标识id映射寻找目标运行时对象设备destinDevice
		for (String iString : idObjmaps.keySet()) {
			if (iString.equals(RuntimeDeviceId))
				destinDevice = idObjmaps.get(iString);
		}

		Object underDevice = null;
//		{null=com.appleyk.Proxy.device.Gree@1b6d3586, null=com.appleyk.Proxy.device.Panasonic@4554617c}
//		通过底层设备与运行时设备的映射找到底层设备对象underDevice
		for (Object o : objMaps.keySet()) {
			if (objMaps.get(o).hashCode() == destinDevice.hashCode()) {
				underDevice = o;
			}
		}
//		将找到的底层设备实例化为运行时空调
		Object runtimeDevice = underDevice;
		Light light = (Light) runtimeDevice;

		if (f) {
			System.out.println("DId: " + light.getID());
			System.out.println("DName: " + light.getDName());
			System.out.println("Type: " + light.getType());
			System.out.println("LName: " + light.getLName());
			System.out.println("Status: " + light.getStatus());
			System.out.println("Value: " + light.getB());
		}

		return light;
	}

}
