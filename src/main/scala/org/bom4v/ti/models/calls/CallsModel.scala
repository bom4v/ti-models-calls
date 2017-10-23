package org.bom4v.ti.models.calls

/**
 * CallsModel 
 */
object CallsModel {

  /**
   * CallEvent
   */
  case class CallEvent(
    timestamp: org.joda.time.LocalDateTime,
    eventType: String,
    emitterMSISDN: Option[String],
    receiverMSISDN: Option[String],
    duration: Option[org.joda.time.Duration]
  )
}

