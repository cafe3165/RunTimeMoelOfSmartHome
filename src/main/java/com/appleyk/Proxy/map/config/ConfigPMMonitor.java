package com.appleyk.Proxy.map.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Philips;
import com.appleyk.Proxy.runtime.AirMonitor;
import com.appleyk.Proxy.runtime.AirMonitorImpl;

public class ConfigPMMonitor {
	public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {

//		类映射
		classMaps.put(Philips.class.getName(), AirMonitorImpl.class.getName());

		// 方法之间的映射关系

		// 1.1空气检测仪的设置获取PM2.5方法
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setPM2_5", double.class).getName(),
				Arrays.asList(new String[] {
						Philips.class.getName() + "." + Philips.class.getMethod("setPM2_5", double.class).getName() }));

		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getPM2_5").getName(), Arrays.asList(
				new String[] { Philips.class.getName() + "." + Philips.class.getMethod("getPM2_5").getName() }));

		// 1.2空气检测仪的设置、获取id方法
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setId", String.class).getName(),
				Arrays.asList(new String[] {
						Philips.class.getName() + "." + Philips.class.getMethod("setId", String.class).getName() }));
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getId").getName(), Arrays
				.asList(new String[] { Philips.class.getName() + "." + Philips.class.getMethod("getId").getName() }));
		// 1.3空气检测仪的设置获取地点方法
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setLName", String.class).getName(),
				Arrays.asList(new String[] { Philips.class.getName() + "."
						+ Philips.class.getMethod("setLocationName", String.class).getName() }));
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getLName").getName(), Arrays.asList(
				new String[] { Philips.class.getName() + "." + Philips.class.getMethod("getLocationName").getName() }));
		// 1.4空气检测仪的状态设置获取方法
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setStatus", String.class).getName(),
				Arrays.asList(new String[] { Philips.class.getName() + "."
						+ Philips.class.getMethod("setStatus", String.class).getName() }));
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getStatus").getName(), Arrays.asList(
				new String[] { Philips.class.getName() + "." + Philips.class.getMethod("getStatus").getName() }));

		// 1.5空气检测仪的名字设置获取方法
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setDName", String.class).getName(),
				Arrays.asList(new String[] { Philips.class.getName() + "."
						+ Philips.class.getMethod("setDeviceName", String.class).getName() }));
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getDName").getName(), Arrays.asList(
				new String[] { Philips.class.getName() + "." + Philips.class.getMethod("getDeviceName").getName() }));
		// 1.6空气检测仪设置获取品牌方法
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setType", String.class).getName(),
				Arrays.asList(new String[] {
						Philips.class.getName() + "." + Philips.class.getMethod("setType", String.class).getName() }));
		apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getType").getName(), Arrays
				.asList(new String[] { Philips.class.getName() + "." + Philips.class.getMethod("getType").getName() }));

	}

}
