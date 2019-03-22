package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.virtualObejct.Context;
import com.appleyk.Proxy.virtualObejct.Contexts;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;
import com.appleyk.Proxy.virtualObejct.init.initConcept;

public class genContext {

	public static void genC(Map<String, String> serConMap, Map<String, String> userIdNameMap,
			Map<String, Object> userMap, Map<String, Object> serMap, Map<String, Object> contMap, Services services,
			Contexts contexts) {
		Context c11 = new Context();
		Context c13 = new Context();
		Context c21 = new Context();
		Context c23 = new Context();

		String CUName11 = "Jack";
		String CCType11 = "Temperature";
		double RMin11 = 19.0;
		double RMax11 = 22.0;
		String CID11 = "C11";

		String CCType13 = "Brightness";
		double RMin13 = 20.0;
		double RMax13 = 100.0;
		String CID13 = "C12";

		String CUName21 = "Ken";
		String CCType21 = "Temperature";
		double RMin21 = 22.0;
		double RMax21 = 26.0;
		String CID21 = "C21";

		String CCType23 = "Brightness";
		double RMin23 = 20.0;
		double RMax23 = 100.0;
		String CID23 = "C23";

		List<String> CIDList = new ArrayList<String>();
		CIDList.add(CID11);
		CIDList.add(CID13);
		CIDList.add(CID21);
		CIDList.add(CID23);

//		服务与环境的绑定
		int index = 0;
		for (String s : services.list(false)) {
			Service ts = new Service();
			ts = (Service) services.ListProperties(s, serMap, false);
			if (ts.getEffect().equals("Monitor")) {
				serConMap.put(CIDList.get(index), ts.getServiceId());
				index++;

			} else {
				continue;
			}
		}
		System.out.println(serConMap);
		c11 = (Context) initConcept.initContext(CUName11, CCType11, RMin11, RMax11, CID11, c11, userIdNameMap, userMap,
				serConMap, serMap);
		c13 = (Context) initConcept.initContext(CUName11, CCType13, RMin13, RMax13, CID13, c13, userIdNameMap, userMap,
				serConMap, serMap);

		c21 = (Context) initConcept.initContext(CUName21, CCType21, RMin21, RMax21, CID21, c21, userIdNameMap, userMap,
				serConMap, serMap);
		c23 = (Context) initConcept.initContext(CUName21, CCType23, RMin23, RMax23, CID23, c23, userIdNameMap, userMap,
				serConMap, serMap);

		contMap.put(c11.getCId(), c11);
		contMap.put(c21.getCId(), c21);
		contMap.put(c13.getCId(), c13);
		contMap.put(c23.getCId(), c23);
		contexts.addlist(CID11);
		contexts.addlist(CID13);
		contexts.addlist(CID21);
		contexts.addlist(CID23);
		for (String cid : contexts.list(true)) {
			System.out.println("------------------");
			contexts.ListProperties(cid, contMap, true);

		}

	}

}
