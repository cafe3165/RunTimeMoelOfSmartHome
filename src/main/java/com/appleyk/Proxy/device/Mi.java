package com.appleyk.Proxy.device;

public class Mi {
	
	private double PM2_5;
	private String id;
	private String locationName;
	private String deviceName;
	private String status;
	private String type;
	
	public double getPM2_5() {
		return PM2_5;
	}
	public void setPM2_5(double pM2_5) {
		PM2_5 = pM2_5;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void purify() {
		PM2_5-=1.0;
	}

}
