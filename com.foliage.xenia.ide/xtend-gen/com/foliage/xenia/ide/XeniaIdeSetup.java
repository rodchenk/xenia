/**
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.ide;

import com.foliage.xenia.XeniaRuntimeModule;
import com.foliage.xenia.XeniaStandaloneSetup;
import com.foliage.xenia.ide.XeniaIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XeniaIdeSetup extends XeniaStandaloneSetup {
  @Override
  public Injector createInjector() {
    XeniaRuntimeModule _xeniaRuntimeModule = new XeniaRuntimeModule();
    XeniaIdeModule _xeniaIdeModule = new XeniaIdeModule();
    return Guice.createInjector(Modules2.mixin(_xeniaRuntimeModule, _xeniaIdeModule));
  }
}
