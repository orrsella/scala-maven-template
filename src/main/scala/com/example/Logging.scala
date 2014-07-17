package com.example

import org.slf4j.LoggerFactory

trait Logging {
  def log = LoggerFactory.getLogger(this.getClass.getName.replace("$", ""))

  // to print some logback info for debug:
  // import ch.qos.logback.classic.LoggerContext
  // StatusPrinter.print((LoggerFactory.getILoggerFactory).asInstanceOf[LoggerContext])
}
