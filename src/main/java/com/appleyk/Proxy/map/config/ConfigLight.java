package com.appleyk.Proxy.map.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Midea;
import com.appleyk.Proxy.device.Opple;
import com.appleyk.Proxy.runtime.LightImpl;
import com.appleyk.Proxy.runtime.Light;

public class ConfigLight {
	public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {

		classMaps.put(Midea.class.getName(), LightImpl.class.getName());
		classMaps.put(Opple.class.getName(), LightImpl.class.getName());

		// 方法之间的映射关系

		// 1.1点灯的点亮操作
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("illumine").getName(),
				Arrays.asList(
						new String[] { Midea.class.getName() + "." + Midea.class.getMethod("RaiseBrightness").getName(),
								Opple.class.getName() + "." + Opple.class.getMethod("RaiseBrightness").getName() }));

		// 1.2电灯的设置亮度获取亮度方法 相当于assign 和monitor
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setB", double.class).getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("setBrightness", double.class).getName(),
						Opple.class.getName() + "."
								+ Opple.class.getMethod("setBrightness", double.class).getName() }));

		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getB").getName(),
				Arrays.asList(
						new String[] { Midea.class.getName() + "." + Midea.class.getMethod("getBrightness").getName(),
								Opple.class.getName() + "." + Opple.class.getMethod("getBrightness").getName() }));

		// 1.3电灯的设置、获取id方法
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setID", String.class).getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("setId", String.class).getName(),
						Opple.class.getName() + "." + Opple.class.getMethod("setId", String.class).getName() }));
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getID").getName(),
				Arrays.asList(new String[] { Midea.class.getName() + "." + Midea.class.getMethod("getId").getName(),
						Opple.class.getName() + "." + Opple.class.getMethod("getId").getName() }));
		// 1.4电灯的设置获取地点方法
		apiMaps.put(
				Light.class.getName() + "." + Light.class.getMethod("setLName", String.class).getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("setLocationName", String.class).getName(),
						Opple.class.getName() + "."
								+ Opple.class.getMethod("setLocationName", String.class).getName() }));
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getLName").getName(),
				Arrays.asList(new String[] { Midea.class.getName() + "." + Midea.class.getMethod("getLocationName").getName(),
						Opple.class.getName() + "." + Opple.class.getMethod("getLocationName").getName() }));
		// 1.5电灯的状态设置获取方法
		apiMaps.put(
				Light.class.getName() + "." + Light.class.getMethod("setStatus", String.class).getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("setStatus", String.class).getName(),
						Opple.class.getName() + "."
								+ Opple.class.getMethod("setStatus", String.class).getName() }));
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getStatus").getName(),
				Arrays.asList(new String[] { Midea.class.getName() + "." + Midea.class.getMethod("getStatus").getName(),
						Opple.class.getName() + "." + Opple.class.getMethod("getStatus").getName() }));

		// 1.5电灯的名字设置获取方法
		apiMaps.put(
				Light.class.getName() + "." + Light.class.getMethod("setDName", String.class).getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("setDeviceName", String.class).getName(),
						Opple.class.getName() + "."
								+ Opple.class.getMethod("setDeviceName", String.class).getName() }));
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getDName").getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("getDeviceName").getName(),
						Opple.class.getName() + "." + Opple.class.getMethod("getDeviceName").getName() }));
		// 1.6电灯设置获取品牌方法
		apiMaps.put(
				Light.class.getName() + "." + Light.class.getMethod("setType", String.class).getName(),
				Arrays.asList(new String[] {
						Midea.class.getName() + "." + Midea.class.getMethod("setType", String.class).getName(),
						Opple.class.getName() + "."
								+ Opple.class.getMethod("setType", String.class).getName() }));
		apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getType").getName(),
				Arrays.asList(new String[] { Midea.class.getName() + "." + Midea.class.getMethod("getType").getName(),
						Opple.class.getName() + "." + Opple.class.getMethod("getType").getName() }));

	}

}
