package edu.berkeley.sparrow.daemon;

/**
 * Configuration parameters for sparrow.
 */
public class SparrowConf {
  public final static String ZK_SERVERS = "zk.server.string";
  public final static String ZK_TIMEOUT = "zk.timeout";
  public final static String SCHEDULER_THRIFT_PORT = "scheduler.thrift.port";
  public final static String SCHEDULER_THRIFT_THREADS =
      "scheduler.thrift.threads";
  // Listen port for the state store --> scheduler interface
  public final static String SCHEDULER_STATE_THRIFT_PORT = "scheduler.state.thrift.port";
  public final static String SCHEDULER_STATE_THRIFT_THREADS =
      "scheduler.state.thrift.threads";
  public final static String NM_THRIFT_PORT = "agent.thrift.port";
  public final static String NM_THRIFT_THREADS = "agent.thrift.threads";
  public final static String INTERNAL_THRIFT_PORT =
      "internal_agent.thrift.port";
  public final static String INTERNAL_THRIFT_THREADS =
      "internal_agent.thrift.threads";
  
  // Values: "production", "standalone", "configbased"
  public final static String DEPLYOMENT_MODE = "deployment.mode";
  
  // Parameters for static operation (least usable system tests).
  // Expects a comma-separated list of host:port pairs describing the address of the
  // internal interface of the node monitors.
  public final static String STATIC_NODE_MONITORS = "static.node_monitors";
  public final static String STATIC_MEM_PER_BACKEND = "static.mem.per.backend";
  public final static String STATIC_CPU_PER_BACKEND = "static.cpu.per.backend";
  public final static String STATIC_APP_NAME = "static.app.name";
  public final static String STATIC_SCHEDULERS = "static.frontends";
}
