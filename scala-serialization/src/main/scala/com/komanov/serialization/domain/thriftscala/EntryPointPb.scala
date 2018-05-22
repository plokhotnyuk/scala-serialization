/**
 * Generated by Scrooge
 *   version: 4.7.0
 *   rev: d9d56174937f524a1981b38ebd6280eef7eeda4a
 *   built at: 20160427-121531
 */
package com.komanov.serialization.domain.thriftscala

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object EntryPointPb extends ThriftStructCodec3[EntryPointPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("EntryPointPb")
  val DomainField = new TField("domain", TType.STRUCT, 1)
  val DomainFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb]]
  val FreeField = new TField("free", TType.STRUCT, 2)
  val FreeFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      DomainField,
      true,
      false,
      DomainFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      FreeField,
      true,
      false,
      FreeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: EntryPointPb): Unit = {
  }

  def withoutPassthroughFields(original: EntryPointPb): EntryPointPb =
    new Immutable(
      domain =
        {
          val field = original.domain
          field.map { field =>
            com.komanov.serialization.domain.thriftscala.DomainEntryPointPb.withoutPassthroughFields(field)
          }
        },
      free =
        {
          val field = original.free
          field.map { field =>
            com.komanov.serialization.domain.thriftscala.FreeEntryPointPb.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: EntryPointPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): EntryPointPb = {

    var domain: Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = None
    var free: Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = None

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                domain = Some(readDomainValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'domain' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                free = Some(readFreeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'free' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      domain,
      free,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): EntryPointPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): EntryPointPb = {
    var domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = _root_.scala.None
    var free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
                domain = _root_.scala.Some(readDomainValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'domain' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                free = _root_.scala.Some(readFreeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'free' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      domain,
      free,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = _root_.scala.None,
    free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = _root_.scala.None
  ): EntryPointPb =
    new Immutable(
      domain,
      free
    )

  def unapply(_item: EntryPointPb): _root_.scala.Option[scala.Product2[Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb], Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb]]] = _root_.scala.Some(_item)


  @inline private def readDomainValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.DomainEntryPointPb = {
    com.komanov.serialization.domain.thriftscala.DomainEntryPointPb.decode(_iprot)
  }

  @inline private def writeDomainField(domain_item: com.komanov.serialization.domain.thriftscala.DomainEntryPointPb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DomainField)
    writeDomainValue(domain_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDomainValue(domain_item: com.komanov.serialization.domain.thriftscala.DomainEntryPointPb, _oprot: TProtocol): Unit = {
    domain_item.write(_oprot)
  }

  @inline private def readFreeValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.FreeEntryPointPb = {
    com.komanov.serialization.domain.thriftscala.FreeEntryPointPb.decode(_iprot)
  }

  @inline private def writeFreeField(free_item: com.komanov.serialization.domain.thriftscala.FreeEntryPointPb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FreeField)
    writeFreeValue(free_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFreeValue(free_item: com.komanov.serialization.domain.thriftscala.FreeEntryPointPb, _oprot: TProtocol): Unit = {
    free_item.write(_oprot)
  }


  object Immutable extends ThriftStructCodec3[EntryPointPb] {
    override def encode(_item: EntryPointPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): EntryPointPb = EntryPointPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[EntryPointPb] = EntryPointPb.metaData
  }

  /**
   * The default read-only implementation of EntryPointPb.  You typically should not need to
   * directly reference this class; instead, use the EntryPointPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb],
      val free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends EntryPointPb {
    def this(
      domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = _root_.scala.None,
      free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = _root_.scala.None
    ) = this(
      domain,
      free,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb],
      val free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends EntryPointPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the EntryPointPb trait with additional state or
   * behavior and implement the read-only methods from EntryPointPb using an underlying
   * instance.
   */
  trait Proxy extends EntryPointPb {
    protected def _underlying_EntryPointPb: EntryPointPb
    override def domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = _underlying_EntryPointPb.domain
    override def free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = _underlying_EntryPointPb.free
    override def _passthroughFields = _underlying_EntryPointPb._passthroughFields
  }
}

trait EntryPointPb
  extends ThriftStruct
  with scala.Product2[Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb], Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb]]
  with java.io.Serializable
{
  import EntryPointPb._

  def domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb]
  def free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = domain
  def _2 = free


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (domain.isDefined) {
                writeDomainValue(domain.get, _oprot)
                _root_.scala.Some(EntryPointPb.DomainField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (free.isDefined) {
                writeFreeValue(free.get, _oprot)
                _root_.scala.Some(EntryPointPb.FreeField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): EntryPointPb = {
    var domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = this.domain
    var free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = this.free
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        domain = _root_.scala.Some(readDomainValue(_blob.read))
      case 2 =>
        free = _root_.scala.Some(readFreeValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      domain,
      free,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): EntryPointPb = {
    var domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = this.domain
    var free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = this.free

    _fieldId match {
      case 1 =>
        domain = _root_.scala.None
      case 2 =>
        free = _root_.scala.None
      case _ =>
    }
    new Immutable(
      domain,
      free,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetDomain: EntryPointPb = unsetField(1)

  def unsetFree: EntryPointPb = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    EntryPointPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (domain.isDefined) writeDomainField(domain.get, _oprot)
    if (free.isDefined) writeFreeField(free.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    domain: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.DomainEntryPointPb] = this.domain,
    free: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.FreeEntryPointPb] = this.free,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): EntryPointPb =
    new Immutable(
      domain,
      free,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[EntryPointPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[EntryPointPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.domain
    case 1 => this.free
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "EntryPointPb"
}