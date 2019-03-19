package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.virtualObejct.User;
import com.appleyk.Proxy.virtualObejct.Users;
import com.appleyk.Proxy.virtualObejct.init.initConcept;

public class genUser {

	public static void genU(Map<String, String> locIdNameMap, Map<String, Object> userMap,
			Map<String, String> userIdNameMap, Users users) {

		String UName1 = "Jack";
		String UId1 = "U1";
		String ULName1 = "sittingroom";
		List<String> uclist1 = new ArrayList<>();
		uclist1.add("C11");
		uclist1.add("C13");
		uclist1.add("C14");

		String UName2 = "Ken";
		String UId2 = "U2";
		String ULName2 = "bedroom";
		List<String> uclist2 = new ArrayList<>();
		uclist2.add("C21");
		uclist2.add("C23");
		uclist2.add("C24");

		String UName3 = "Sansevieria";
		String UId3 = "U3";
		String ULName3 = "sittingroom";
		List<String> uclist3 = new ArrayList<>();
		uclist3.add("C31");
		uclist3.add("C33");

		String UName4 = "Cactus";
		String UId4 = "U4";
		String ULName4 = "balcony";
		List<String> uclist4 = new ArrayList<>();
		uclist4.add("C42");
		uclist4.add("C43");

		String UName5 = "Lily";
		String UId5 = "U5";
		String ULName5 = "balcony";
		List<String> uclist5 = new ArrayList<>();
		uclist5.add("C52");
		uclist5.add("C53");

		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		User u5 = new User();

		u1 = (User) initConcept.initUser(UName1, ULName1, UId1, u1, locIdNameMap, uclist1);
		u2 = (User) initConcept.initUser(UName2, ULName2, UId2, u2, locIdNameMap, uclist2);
		u3 = (User) initConcept.initUser(UName3, ULName3, UId3, u3, locIdNameMap, uclist3);
		u4 = (User) initConcept.initUser(UName4, ULName4, UId4, u4, locIdNameMap, uclist4);
		u5 = (User) initConcept.initUser(UName5, ULName5, UId5, u5, locIdNameMap, uclist5);

//		用户id与用户对象映射
		userMap.put(u1.getUId(), u1);
		userMap.put(u2.getUId(), u2);
		userMap.put(u3.getUId(), u3);
		userMap.put(u4.getUId(), u4);
		userMap.put(u5.getUId(), u5);
//		用户名字与用户id映射，便于快速找到用户
		userIdNameMap.put(UName1, UId1);
		userIdNameMap.put(UName2, UId2);
		userIdNameMap.put(UName3, UId3);
		userIdNameMap.put(UName4, UId4);
		userIdNameMap.put(UName5, UId5);

		users.addlist(u1.getUId());
		users.addlist(u2.getUId());
		users.addlist(u3.getUId());
		users.addlist(u4.getUId());
		users.addlist(u5.getUId());
//		列出用户的属性
//		for (String uid : users.list(false)) {
//			User tempUser = (User) userMap.get(uid);
//			users.ListProperties(tempUser.getUId(), userMap);
//		}
	}

}
