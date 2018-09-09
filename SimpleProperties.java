package scripts.napi.datatypes;

import java.util.Properties;

public class SimpleProperties extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4787764817339584076L;
	
	/**
	 * Will attempt to call String.valueOf() on the parameterized type
	 * @param key
	 * @param value
	 */
	public <T> void setProperty(String key, T value) {
		super.setProperty(key, String.valueOf(value));
	}
	
	public boolean getBoolean(String key) {
		return Boolean.valueOf(super.getProperty(key));
	}
	
	// I'm lazy so I made this shorter
	public boolean getBool(String key) {
		return getBoolean(key);
	}
	
	public int getInt(String key) {
		return Integer.parseInt(super.getProperty(key));
	}
	
	public double getDouble(String key) {
		return Double.parseDouble(super.getProperty(key));
	}
	
	public long getLong(String key) {
		return Long.parseLong(super.getProperty(key));
	}

}
