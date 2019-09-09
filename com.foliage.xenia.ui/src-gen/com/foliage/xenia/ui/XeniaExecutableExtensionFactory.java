/*
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.ui;

import com.foliage.xenia.ui.internal.XeniaActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XeniaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XeniaActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XeniaActivator activator = XeniaActivator.getInstance();
		return activator != null ? activator.getInjector(XeniaActivator.COM_FOLIAGE_XENIA_XENIA) : null;
	}

}
