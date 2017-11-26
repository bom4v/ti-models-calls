package org.bom4v.ti.models.calls

import scala.Array.canBuildFrom

/**
  * CallsModel 
  */
object CallsModel {

  /**
    * CallEvent
    * 
    * This class has got over the Scala limit of 22 fields. So, as a work-around,
    * the class has to extend the Product class, and override three functions.
    * That was inspired from http://github.com/arunma/ScalaDataAnalysisCookbook/blob/master/chapter3-data-loading/src/main/scala/com/packt/dataload/model/Student.scala
    */
  class CallEvent (
    specificationVersionNumber: Option[Int],
    releaseVersionNumber: Option[Int],
    fileName: Option[String],
    fileAvailableTimeStamp: Option[org.joda.time.LocalDateTime],
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
    callEventDuration: Option[org.joda.time.Duration],
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
    servingNetwork: Option[String]

  ) extends Product {

    @throws(classOf[IndexOutOfBoundsException])
    override def productElement(n: Int): Any = n match {
      case 0 => specificationVersionNumber
      case 1 => releaseVersionNumber
      case 2 => fileName
      case 3 => fileAvailableTimeStamp
      case 4 => fileUtcTimeOffset
      case 5 => sender
      case 6 => recipient
      case 7 => sequenceNumber
      case 8 => callEventsCount
      case 9 => eventType
      case 10 => imsi
      case 11 => imei
      case 12 => callEventStartTimeStamp
      case 13 => utcTimeOffset
      case 14 => callEventDuration
      case 15 => causeForTermination
      case 16 => accessPointNameNI
      case 17 => accessPointNameOI
      case 18 => dataVolumeIncoming
      case 19 => dataVolumeOutgoing
      case 20 => sgsnAddress
      case 21 => ggsnAddress
      case 22 => chargingId
      case 23 => chargeAmount
      case 24 => teleServiceCode
      case 25 => bearerServiceCode
      case 26 => supplementaryServiceCode
      case 27 => dialledDigits
      case 28 => connectedNumber
      case 29 => thirdPartyNumber
      case 30 => callingNumber
      case 31 => recEntityId
      case 32 => callReference
      case 33 => locationArea
      case 34 => cellId
      case 35 => msisdn
      case 36 => servingNetwork
      case _ => throw new IndexOutOfBoundsException(n.toString())
    }

    override def productArity: Int = 37

    override def canEqual(that: Any): Boolean = that.isInstanceOf[CallEvent]
  }

  object CallEvent {

    def apply (str: String): Option[CallEvent] = {
      // Few values have extra double quotes around it
      val paramArray = str.split(";")
        .map (param => param.replaceAll ("\"", ""))

      scala.util.Try (

        new CallEvent (
          scala.util.Try (paramArray(0).toInt).toOption,
          scala.util.Try (paramArray(1).toInt).toOption,
          scala.util.Try (paramArray(2)).toOption,
          scala.util.Try (org.joda.time.LocalDateTime.parse (paramArray(3))).toOption,
          scala.util.Try (paramArray(4).toInt).toOption,
          scala.util.Try (paramArray(5)).toOption,
          scala.util.Try (paramArray(6)).toOption,
          scala.util.Try (paramArray(7).toInt).toOption,
          scala.util.Try (paramArray(8)).toOption,
          scala.util.Try (paramArray(9).toDouble).toOption,
          scala.util.Try (paramArray(10).toInt).toOption,
          scala.util.Try (paramArray(11).toInt).toOption,
          scala.util.Try (paramArray(12)).toOption,
          scala.util.Try (paramArray(13).toInt).toOption,
          scala.util.Try (org.joda.time.Duration.parse (paramArray(14))).toOption,
          scala.util.Try (paramArray(15).toInt).toOption,
          scala.util.Try (paramArray(16).toInt).toOption,
          scala.util.Try (paramArray(17).toInt).toOption,
          scala.util.Try (paramArray(18).toInt).toOption,
          scala.util.Try (paramArray(19).toInt).toOption,
          scala.util.Try (paramArray(20)).toOption,
          scala.util.Try (paramArray(21).toDouble).toOption,
          scala.util.Try (paramArray(22)).toOption,
          scala.util.Try (paramArray(23).toDouble).toOption,
          scala.util.Try (paramArray(24).toInt).toOption,
          scala.util.Try (paramArray(25)).toOption,
          scala.util.Try (paramArray(26)).toOption,
          scala.util.Try (paramArray(27)).toOption,
          scala.util.Try (paramArray(28)).toOption,
          scala.util.Try (paramArray(29)).toOption,
          scala.util.Try (paramArray(30)).toOption,
          scala.util.Try (paramArray(31)).toOption,
          scala.util.Try (paramArray(32)).toOption,
          scala.util.Try (paramArray(33)).toOption,
          scala.util.Try (paramArray(34)).toOption,
          scala.util.Try (paramArray(35)).toOption,
          scala.util.Try (paramArray(36)).toOption
        )

      ) match {
        case scala.util.Success(student) => Some(student)
        case scala.util.Failure(throwable) => {
          println (throwable.getMessage())
          None
        }
      }
    }
  }
}

