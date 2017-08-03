package org.bom4v.ti.models.calls

/**
 * CallsModel 
 */
object CallsModel {

  /**
   * CalssEvent
   */
  case class CallEvent(
    timestamp: org.joda.time.LocalDateTime,
    eventType: String,
    emitterMSISDN: Option[String],
    reciverMSISDN: Option[String],
    duration: Option[org.joda.time.Duration]
  )
}

