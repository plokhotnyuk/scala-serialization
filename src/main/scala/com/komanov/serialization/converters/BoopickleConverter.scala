package com.komanov.serialization.converters

import java.nio.ByteBuffer
import java.time.Instant
import java.util

import boopickle.Default._
import com.komanov.serialization.domain._

/** https://github.com/ochrons/boopickle */
object BoopickleConverter extends MyConverter {

  override def toByteArray(site: Site): Array[Byte] = {
    bbToArray(Pickle.intoBytes(site))
  }

  override def fromByteArray(bytes: Array[Byte]): Site = {
    Unpickle[Site].fromBytes(ByteBuffer.wrap(bytes))
  }

  override def toByteArray(event: SiteEvent): Array[Byte] = {
    bbToArray(Pickle.intoBytes(event))
  }

  override def siteEventFromByteArray(clazz: Class[_], bytes: Array[Byte]): SiteEvent = {
    Unpickle[SiteEvent].fromBytes(ByteBuffer.wrap(bytes))
  }

  private def bbToArray(bb: ByteBuffer) = {
    util.Arrays.copyOfRange(bb.array(), 0, bb.limit())
  }

  implicit val instantPickler = transformPickler[Instant, Long](t => Instant.ofEpochMilli(t))(_.toEpochMilli)

  implicit val pageComponentTypePickler = transformPickler(PageComponentType.valueOf)(_.name())
  implicit val siteFlagPickler = transformPickler(SiteFlag.valueOf)(_.name())
  implicit val siteTypePickler = transformPickler(SiteType.valueOf)(_.name())

  implicit val entryPointPickler = compositePickler[EntryPoint]
    .addConcreteType[DomainEntryPoint]
    .addConcreteType[FreeEntryPoint]

  implicit val pageComponentDataPickler = compositePickler[PageComponentData]
    .addConcreteType[TextComponentData]
    .addConcreteType[ButtonComponentData]
    .addConcreteType[BlogComponentData]

  implicit val siteEventPickler = compositePickler[SiteEvent]
    .addConcreteType[SiteCreated]
    .addConcreteType[SiteNameSet]
    .addConcreteType[SiteDescriptionSet]
    .addConcreteType[SiteRevisionSet]
    .addConcreteType[SitePublished]
    .addConcreteType[SiteUnpublished]
    .addConcreteType[SiteFlagAdded]
    .addConcreteType[SiteFlagRemoved]
    .addConcreteType[DomainAdded]
    .addConcreteType[DomainRemoved]
    .addConcreteType[PrimaryDomainSet]
    .addConcreteType[DefaultMetaTagAdded]
    .addConcreteType[DefaultMetaTagRemoved]
    .addConcreteType[PageAdded]
    .addConcreteType[PageRemoved]
    .addConcreteType[PageNameSet]
    .addConcreteType[PageMetaTagAdded]
    .addConcreteType[PageMetaTagRemoved]
    .addConcreteType[PageComponentAdded]
    .addConcreteType[PageComponentRemoved]
    .addConcreteType[PageComponentPositionSet]
    .addConcreteType[PageComponentPositionReset]
    .addConcreteType[TextComponentDataSet]
    .addConcreteType[ButtonComponentDataSet]
    .addConcreteType[BlogComponentDataSet]
    .addConcreteType[DomainEntryPointAdded]
    .addConcreteType[FreeEntryPointAdded]
    .addConcreteType[EntryPointRemoved]
    .addConcreteType[PrimaryEntryPointSet]
}
