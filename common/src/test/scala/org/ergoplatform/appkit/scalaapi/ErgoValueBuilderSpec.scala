package org.ergoplatform.appkit.scalaapi

import org.ergoplatform.appkit.{BoxAttachment, BoxAttachmentGeneric, ErgoValue, TestingBase, ErgoType, AppkitTestingCommon}
import special.collection.Coll

import java.lang.{Boolean => JBoolean, Short => JShort, Integer => JInt, Long => JLong, Byte => JByte}

class ErgoValueBuilderSpec extends TestingBase with AppkitTestingCommon {
  property("buildFor") {

    val vByte = ErgoValueBuilder.buildFor(10.toByte)
    val jByte = ErgoValue.of(10.toByte)
    vByte shouldBe jByte

    val vShort = ErgoValueBuilder.buildFor(10.toShort)
    val jShort = ErgoValue.of(10.toShort)
    vShort shouldBe jShort

    val vInt = ErgoValueBuilder.buildFor(10)
    val jInt = ErgoValue.of(10)
    vInt shouldBe jInt

    val vLong = ErgoValueBuilder.buildFor(10L)
    val jLong = ErgoValue.of(10L)
    vLong shouldBe jLong

    val vBoolean = ErgoValueBuilder.buildFor(true)
    val jBoolean = ErgoValue.of(true)
    vBoolean shouldBe jBoolean

    val vPair = ErgoValueBuilder.buildFor((10, 10L))
    val jPair = ErgoValue.pairOf(jInt, jLong)
    vPair shouldBe jPair

    val vCollInt = ErgoValueBuilder.buildFor(Coll(10, 20))
    val jCollInt = ErgoValue.of(Coll(10, 20).asInstanceOf[Coll[Integer]], ErgoType.integerType())
    vCollInt shouldBe jCollInt

    val vCollPair = ErgoValueBuilder.buildFor(Coll((10, 10L), (20, 20L)))
    val jCollPair = ErgoValue.of(
      Coll((10, 10L), (20, 20L)).asInstanceOf[Coll[(Integer, java.lang.Long)]],
      ErgoType.pairType(ErgoType.integerType(), ErgoType.longType())
    )
    vCollPair shouldBe jCollPair

    val x: ErgoValue[Coll[(Coll[(JByte, JLong)], Coll[JShort])]] = ErgoValueBuilder.buildFor(
      Coll(
        (Coll((1.toByte, 10L), (2.toByte, 20L)), Coll[Short](1, 2, 3)),
        (Coll((1.toByte, 10L), (2.toByte, 20L)), Coll[Short](1, 2, 3))
      )
    )
    x should not be null
  }

  property("Use ErgoValueBuilder in Appkit API") {
    // attachment format is (Coll[0x50, 0x52, 0x50], Tuple2(Int, Coll[Byte])
    val bytes = Coll[Byte](1, 2, 3)
    val ergoValue = ErgoValueBuilder.buildFor(
      (Coll[Byte](0x50, 0x52, 0x50), (BoxAttachment.Type.PLAIN_TEXT.toTypeRawValue, bytes)))
    val backFromValue: BoxAttachment = BoxAttachmentGeneric.createFromErgoValue(ergoValue)
    backFromValue should not be null
  }
}
