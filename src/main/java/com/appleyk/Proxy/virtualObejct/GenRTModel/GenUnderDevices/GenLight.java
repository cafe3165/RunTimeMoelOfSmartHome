package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Midea;
import com.appleyk.Proxy.device.Opple;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.runtime.Light;
import com.appleyk.Proxy.virtualObejct.Lights;

public class GenLight {
	public static List<Object> genLight(Map<Object, Object> objMaps, Map<String, Object> idObjmaps,
			Map<String, String> idmaps, Map<String, Object> uidMaps, Lights lights) throws Exception {
		List<Object> dList = new ArrayList<Object>();

		// 底层设备生成 返回一个运行时对象
		Light Midea = (Light) Relation.generate(Midea.class.getName());
		Light Opple = (Light) Relation.generate(Opple.class.getName());
		// 运行时对象调用

		Midea.setID("D2");
		Midea.setDName("light");
		Midea.setType("Midea");
		Midea.setLName("sittingroom");
		Midea.setB(0.0);
		Midea.setStatus("off");
		idObjmaps.put(String.valueOf(Midea.hashCode()), objMaps.get(Midea));
		idmaps.put(Midea.getID(), String.valueOf(Midea.hashCode()));

		Opple.setID("D6");
		Opple.setDName("light");
		Opple.setType("Opple");
		Opple.setLName("bedroom");
		Opple.setB(0.0);
		Opple.setStatus("off");
		idObjmaps.put(String.valueOf(Opple.hashCode()), objMaps.get(Opple));
		idmaps.put(Opple.getID(), String.valueOf(Opple.hashCode()));

		lights.addlist(Midea.getID());
		lights.addlist(Opple.getID());

		List<String> lList = lights.list(false);
//		for (String underDeviceId : lList) {
//			System.out.println("---------------------------");
//			lights.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps, true);
//
//		}

		uidMaps.put(Midea.getID(), Midea);
		uidMaps.put(Opple.getID(), Opple);

		dList.add(Midea);
		dList.add(Opple);
		return dList;
	}

}
