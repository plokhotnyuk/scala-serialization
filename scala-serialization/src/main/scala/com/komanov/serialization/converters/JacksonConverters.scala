package com.komanov.serialization.converters

import java.time.Instant

import com.fasterxml.jackson.core.{JsonFactory, JsonGenerator, JsonParser, Version}
import com.fasterxml.jackson.databind.Module.SetupContext
import com.fasterxml.jackson.databind._
import com.fasterxml.jackson.databind.module.{SimpleDeserializers, SimpleSerializers}
import com.fasterxml.jackson.dataformat.cbor.{CBORFactory, CBORGenerator}
import com.fasterxml.jackson.dataformat.smile.SmileFactory
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.komanov.serialization.domain.{Site, SiteEvent}

/** https://github.com/FasterXML/jackson */
object JacksonJsonConverter extends JacksonConverter(new JsonFactory())

object JacksonCborConverter extends JacksonConverter(new CBORFactory().disable(CBORGenerator.Feature.WRITE_MINIMAL_INTS))

object JacksonSmileConverter extends JacksonConverter(new SmileFactory())

abstract class JacksonConverter(jsonFactory: JsonFactory) extends MyConverter {
  private object InstantModule extends Module {
    override def getModuleName: String = "Instant"

    override def setupModule(context: SetupContext): Unit = {
      val serializers = new SimpleSerializers
      serializers.addSerializer(classOf[Instant], new JsonSerializer[Instant] {
        override def serialize(value: Instant, gen: JsonGenerator, serializers: SerializerProvider): Unit = {
          gen.writeNumber(value.toEpochMilli)
        }
      })

      val deserializers = new SimpleDeserializers
      deserializers.addDeserializer(classOf[Instant], new JsonDeserializer[Instant] {
        override def deserialize(p: JsonParser, ctxt: DeserializationContext): Instant = {
          Instant.ofEpochMilli(p.getLongValue)
        }
      })

      context.addSerializers(serializers)
      context.addDeserializers(deserializers)
    }

    override def version(): Version = new Version(1, 0, 0, "RELEASE", "group", "artifact")
  }

  private val objectMapper = {
    val om = new ObjectMapper(jsonFactory)
    om.registerModule(new DefaultScalaModule)
    om.registerModule(InstantModule)
    om
  }
  private val siteReader: ObjectReader = objectMapper.readerFor(classOf[Site])
  private val siteWriter: ObjectWriter = objectMapper.writerFor(classOf[Site])

  override def toByteArray(site: Site): Array[Byte] = {
    siteWriter.writeValueAsBytes(site)
  }

  override def fromByteArray(bytes: Array[Byte]): Site = {
    siteReader.readValue(bytes)
  }

  override def toByteArray(event: SiteEvent): Array[Byte] = {
    objectMapper.writeValueAsBytes(event)
  }

  override def siteEventFromByteArray(clazz: Class[_], bytes: Array[Byte]): SiteEvent = {
    objectMapper.readValue(bytes, clazz).asInstanceOf[SiteEvent]
  }

}
