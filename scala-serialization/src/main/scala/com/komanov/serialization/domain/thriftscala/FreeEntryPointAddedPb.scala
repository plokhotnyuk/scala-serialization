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


object FreeEntryPointAddedPb extends ThriftStructCodec3[FreeEntryPointAddedPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("FreeEntryPointAddedPb")
  val UserNameField = new TField("userName", TType.STRING, 1)
  val UserNameFieldManifest = implicitly[Manifest[String]]
  val SiteNameField = new TField("siteName", TType.STRING, 2)
  val SiteNameFieldManifest = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      UserNameField,
      true,
      false,
      UserNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      SiteNameField,
      true,
      false,
      SiteNameFieldManifest,
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
  def validate(_item: FreeEntryPointAddedPb): Unit = {
  }

  def withoutPassthroughFields(original: FreeEntryPointAddedPb): FreeEntryPointAddedPb =
    new Immutable(
      userName =
        {
          val field = original.userName
          field.map { field =>
            field
          }
        },
      siteName =
        {
          val field = original.siteName
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: FreeEntryPointAddedPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): FreeEntryPointAddedPb = {

    var userNameOffset: Int = -1
    var siteNameOffset: Int = -1

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
              case TType.STRING =>
                userNameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'userName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                siteNameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'siteName' (expected=%s, actual=%s).".format(
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
      userNameOffset,
      siteNameOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): FreeEntryPointAddedPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): FreeEntryPointAddedPb = {
    var userName: _root_.scala.Option[String] = _root_.scala.None
    var siteName: _root_.scala.Option[String] = _root_.scala.None
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
              case TType.STRING =>
                userName = _root_.scala.Some(readUserNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'userName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                siteName = _root_.scala.Some(readSiteNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'siteName' (expected=%s, actual=%s).".format(
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
      userName,
      siteName,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    userName: _root_.scala.Option[String] = _root_.scala.None,
    siteName: _root_.scala.Option[String] = _root_.scala.None
  ): FreeEntryPointAddedPb =
    new Immutable(
      userName,
      siteName
    )

  def unapply(_item: FreeEntryPointAddedPb): _root_.scala.Option[scala.Product2[Option[String], Option[String]]] = _root_.scala.Some(_item)


  @inline private def readUserNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeUserNameField(userName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(UserNameField)
    writeUserNameValue(userName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeUserNameValue(userName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(userName_item)
  }

  @inline private def readSiteNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeSiteNameField(siteName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(SiteNameField)
    writeSiteNameValue(siteName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeSiteNameValue(siteName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(siteName_item)
  }


  object Immutable extends ThriftStructCodec3[FreeEntryPointAddedPb] {
    override def encode(_item: FreeEntryPointAddedPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): FreeEntryPointAddedPb = FreeEntryPointAddedPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[FreeEntryPointAddedPb] = FreeEntryPointAddedPb.metaData
  }

  /**
   * The default read-only implementation of FreeEntryPointAddedPb.  You typically should not need to
   * directly reference this class; instead, use the FreeEntryPointAddedPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val userName: _root_.scala.Option[String],
      val siteName: _root_.scala.Option[String],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends FreeEntryPointAddedPb {
    def this(
      userName: _root_.scala.Option[String] = _root_.scala.None,
      siteName: _root_.scala.Option[String] = _root_.scala.None
    ) = this(
      userName,
      siteName,
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
      userNameOffset: Int,
      siteNameOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends FreeEntryPointAddedPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val userName: _root_.scala.Option[String] =
      if (userNameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, userNameOffset))
      }
    lazy val siteName: _root_.scala.Option[String] =
      if (siteNameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, siteNameOffset))
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
   * This Proxy trait allows you to extend the FreeEntryPointAddedPb trait with additional state or
   * behavior and implement the read-only methods from FreeEntryPointAddedPb using an underlying
   * instance.
   */
  trait Proxy extends FreeEntryPointAddedPb {
    protected def _underlying_FreeEntryPointAddedPb: FreeEntryPointAddedPb
    override def userName: _root_.scala.Option[String] = _underlying_FreeEntryPointAddedPb.userName
    override def siteName: _root_.scala.Option[String] = _underlying_FreeEntryPointAddedPb.siteName
    override def _passthroughFields = _underlying_FreeEntryPointAddedPb._passthroughFields
  }
}

trait FreeEntryPointAddedPb
  extends ThriftStruct
  with scala.Product2[Option[String], Option[String]]
  with java.io.Serializable
{
  import FreeEntryPointAddedPb._

  def userName: _root_.scala.Option[String]
  def siteName: _root_.scala.Option[String]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = userName
  def _2 = siteName


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
              if (userName.isDefined) {
                writeUserNameValue(userName.get, _oprot)
                _root_.scala.Some(FreeEntryPointAddedPb.UserNameField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (siteName.isDefined) {
                writeSiteNameValue(siteName.get, _oprot)
                _root_.scala.Some(FreeEntryPointAddedPb.SiteNameField)
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
  def setField(_blob: TFieldBlob): FreeEntryPointAddedPb = {
    var userName: _root_.scala.Option[String] = this.userName
    var siteName: _root_.scala.Option[String] = this.siteName
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        userName = _root_.scala.Some(readUserNameValue(_blob.read))
      case 2 =>
        siteName = _root_.scala.Some(readSiteNameValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      userName,
      siteName,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): FreeEntryPointAddedPb = {
    var userName: _root_.scala.Option[String] = this.userName
    var siteName: _root_.scala.Option[String] = this.siteName

    _fieldId match {
      case 1 =>
        userName = _root_.scala.None
      case 2 =>
        siteName = _root_.scala.None
      case _ =>
    }
    new Immutable(
      userName,
      siteName,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetUserName: FreeEntryPointAddedPb = unsetField(1)

  def unsetSiteName: FreeEntryPointAddedPb = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    FreeEntryPointAddedPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (userName.isDefined) writeUserNameField(userName.get, _oprot)
    if (siteName.isDefined) writeSiteNameField(siteName.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    userName: _root_.scala.Option[String] = this.userName,
    siteName: _root_.scala.Option[String] = this.siteName,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): FreeEntryPointAddedPb =
    new Immutable(
      userName,
      siteName,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[FreeEntryPointAddedPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[FreeEntryPointAddedPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.userName
    case 1 => this.siteName
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "FreeEntryPointAddedPb"
}