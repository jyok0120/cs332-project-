package Master

import org.apache.logging.log4j.scala.Logging

import Master.MasterServer

object Main extends Logging{
  def main(args: Array[String]): Unit = {
    logger.info("Master start")
    // Start Networking Service
    MasterServer.startserver

    // Check Master - Worker register
    logger.info("Waiting for workers")
    
    Thread.sleep(3000)

    // Master's state machine


    // End Networking Service
    MasterServer.stopserver
    logger.info("Master finish")
  }
}