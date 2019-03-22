package com.appleyk.Proxy.runtime;

public class AirMonitorImpl implements AirMonitor {
	private double PM2_5;
	private String id;
	private String locationName;
	private String deviceName;
	private String status;
	private String type;

	@Override
	public double getPM2_5() {
		// TODO Auto-generated method stub
		return PM2_5;
	}

	@Override
	public void setPM2_5(double pM2_5) {
		// TODO Auto-generated method stub
		this.PM2_5 = pM2_5;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public String getLName() {
		// TODO Auto-generated method stub
		return locationName;
	}

	@Override
	public void setLName(String locationName) {
		// TODO Auto-generated method stub
		this.locationName = locationName;
	}

	@Override
	public String getDName() {
		// TODO Auto-generated method stub
		return deviceName;
	}

	@Override
	public void setDName(String deviceName) {
		// TODO Auto-generated method stub
		this.deviceName = deviceName;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;
	}

}
