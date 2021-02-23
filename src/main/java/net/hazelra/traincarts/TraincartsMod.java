package net.hazelra.traincarts;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TraincartsMod implements ModInitializer {
  public static final Logger log = LogManager.getLogger("Train Carts");
  public static final String logPrefix = "[Train Carts]";

  public void onInitialize() { log.info(logPrefix + "Hello, blocky world!"); }
}
