package org.bom4v.ti.models.calls

import scala.Array.canBuildFrom

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
    eventType: Option[Double],
    imsi: Option[Int],
    imei: Option[Int],
    callEventStartTimeStamp: Option[String],
    utcTimeOffset: Option[Int],
    callEventDuration: Option[Double],
    causeForTermination: Option[Int],
    accessPointNameNI: Option[Int],
    accessPointNameOI:  Option[Int],
    dataVolumeIncoming: Option[Int],
    dataVolumeOutgoing: Option[Int],
    sgsnAddress: Option[String],
    ggsnAddress: Option[Double],
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
    servingNetwork: Option[String])
}

