package com.appleyk.Proxy.runtime;

public class LightImpl implements Light {
	private double brightness;
	private String type;
	private String ID;
	private String locationName;
	private String deviceName;
	private String status;

	@Override
	public void illumine() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setB(double brightness) {
		// TODO Auto-generated method stub
		this.brightness = brightness;
	}

	@Override
	public double getB() {
		// TODO Auto-generated method stub
		return brightness;
	}

	@Override
	public void setID(String ID) {
		// TODO Auto-generated method stub
		this.ID = ID;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void setLName(String LName) {
		// TODO Auto-generated method stub
		this.locationName = LName;
	}

	@Override
	public String getLName() {
		// TODO Auto-generated method stub
		return locationName;
	}

	@Override
	public void setDName(String DName) {
		// TODO Auto-generated method stub
		this.deviceName = DName;
	}

	@Override
	public String getDName() {
		// TODO Auto-generated method stub
		return deviceName;
	}

	@Override
	public void setStatus(String Status) {
		// TODO Auto-generated method stub
		this.status = Status;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public void setType(String Type) {
		// TODO Auto-generated method stub
		this.type = Type;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
