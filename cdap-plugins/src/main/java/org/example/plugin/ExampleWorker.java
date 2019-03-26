package org.example.plugin;

import co.cask.cdap.api.plugin.PluginProperties;
import co.cask.cdap.api.worker.AbstractWorker;

public class ExampleWorker extends AbstractWorker {

	  @Override
	  public void configure() {
	    usePlugin("runnable", "noop", "id", PluginProperties.builder()
	      .add("message", "Hello CDAP!")
	      .build());
	  }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
