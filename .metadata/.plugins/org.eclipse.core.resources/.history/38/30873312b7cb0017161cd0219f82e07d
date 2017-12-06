package com.shinobigroup.configuration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Properties;

@SuppressWarnings("serial")
public class PropertiesNotifier extends Properties {

	private PropertyChangeSupport notifier = new PropertyChangeSupport(this);
	
	public PropertiesNotifier(Properties defaults) {
		super(defaults);
	}
	
	//
	// Property change notifications
	//
	
	public PropertiesNotifier addPropertyChangeListener(PropertyChangeListener listener) {
		notifier.addPropertyChangeListener(listener);
		return this;
	}

	public PropertiesNotifier addPropertyChangeListener(String property, PropertyChangeListener listener) {
		notifier.addPropertyChangeListener(property,listener);
		return this;
	}
	
	public PropertiesNotifier removePropertyChangeListener(PropertyChangeListener listener) {
		notifier.removePropertyChangeListener(listener);
		return this;
	}

	public PropertiesNotifier removePropertyChangeListener(String property, PropertyChangeListener listener) {
		notifier.removePropertyChangeListener(property,listener);
		return this;
	}
	
	//
	// Re-implementation of Properties methods
	//
	
	@Override
	public Object setProperty(String key, String value) {
		Object previous = super.setProperty(key, value);
		notifier.firePropertyChange(key, previous, value);
		return previous;
	}
	
}
