package com.appleyk.Proxy.runtime;

public interface AirMonitor {
	public double getPM2_5() ;
	public void setPM2_5(double pM2_5);
	public String getId() ;
	public void setId(String id);
	public String getLName() ;
	public void setLName(String locationName) ;
	public String getDName() ;
	public void setDName(String deviceName);
	public String getStatus() ;
	public void setStatus(String status);
	public String getType();
	public void setType(String type);


}
