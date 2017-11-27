package org.bom4v.ti.models.calls

/**
  * CallsModel 
  */
object CallsModel {

  /**
    * CallEvent
    */
  case class CallEvent (
    specificationVersionNumber: Option[Int],
    releaseVersionNumber: Option[Int],
    fileName: Option[String],
    fileAvailableTimeStamp: Option[java.sql.Timestamp],
    fileUtcTimeOffset: Option[Int],
    sender: Option[String],
    recipient: Option[String],
    sequenceNumber: Option[Int],
    callEventsCount: Option[String],
    eventType: Option[String],
    imsi: Option[Long],
    imei: Option[Long],
    callEventStartTimeStamp: Option[java.sql.Timestamp],
    utcTimeOffset: Option[Int],
    callEventDuration: Option[Double],
    causeForTermination: Option[Int],
    accessPointNameNI: Option[String],
    accessPointNameOI:  Option[String],
    dataVolumeIncoming: Option[String],
    dataVolumeOutgoing: Option[String],
    sgsnAddress: Option[String],
    ggsnAddress: Option[String],
    chargingId: Option[String],
    chargeAmount: Option[Double],
    teleServiceCode: Option[Int],
    bearerServiceCode: Option[String],
    supplementaryServiceCode: Option[String],
    dialledDigits: Option[String],
    connectedNumber: Option[String],
    thirdPartyNumber: Option[String],
    callingNumber: Option[String],
    recEntityId: Option[String],
    callReference: Option[String],
    locationArea: Option[String],
    cellId: Option[String],
    msisdn: Option[String],
    servingNetwork: Option[String]
  )
}

