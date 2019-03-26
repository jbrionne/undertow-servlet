package org.example.plugin;

import javax.annotation.Nullable;

import co.cask.cdap.api.annotation.Macro;
import co.cask.cdap.api.annotation.Name;
import co.cask.cdap.api.annotation.Plugin;
import co.cask.cdap.api.plugin.PluginConfig;

@Plugin(type = "runnable")
@Name("noop")
public class NoOpRunnable implements Runnable {
	
  private final Conf conf;

  public static class Conf extends PluginConfig {
    @Nullable
    @Macro
    private String message;

    public Conf() {
      this.message = "Hello World!";
    }
  }

  public NoOpRunnable(Conf conf) {
    this.conf = conf;
  }

  public void run() {
    System.out.println(conf.message);
  }
}
