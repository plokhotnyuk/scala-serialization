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


object ButtonComponentDataSetPb extends ThriftStructCodec3[ButtonComponentDataSetPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("ButtonComponentDataSetPb")
  val IdField = new TField("id", TType.STRING, 1)
  val IdFieldManifest = implicitly[Manifest[ByteBuffer]]
  val NameField = new TField("name", TType.STRING, 2)
  val NameFieldManifest = implicitly[Manifest[String]]
  val TextField = new TField("text", TType.STRING, 3)
  val TextFieldManifest = implicitly[Manifest[String]]
  val ActionField = new TField("action", TType.STRING, 4)
  val ActionFieldManifest = implicitly[Manifest[ByteBuffer]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      IdField,
      true,
      false,
      IdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      NameField,
      true,
      false,
      NameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      TextField,
      true,
      false,
      TextFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      ActionField,
      true,
      false,
      ActionFieldManifest,
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
  def validate(_item: ButtonComponentDataSetPb): Unit = {
  }

  def withoutPassthroughFields(original: ButtonComponentDataSetPb): ButtonComponentDataSetPb =
    new Immutable(
      id =
        {
          val field = original.id
          field.map { field =>
            field
          }
        },
      name =
        {
          val field = original.name
          field.map { field =>
            field
          }
        },
      text =
        {
          val field = original.text
          field.map { field =>
            field
          }
        },
      action =
        {
          val field = original.action
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: ButtonComponentDataSetPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): ButtonComponentDataSetPb = {

    var id: Option[ByteBuffer] = None
    var nameOffset: Int = -1
    var textOffset: Int = -1
    var action: Option[ByteBuffer] = None

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
    
                id = Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                nameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                textOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'text' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
    
                action = Some(readActionValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'action' (expected=%s, actual=%s).".format(
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
      id,
      nameOffset,
      textOffset,
      action,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): ButtonComponentDataSetPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): ButtonComponentDataSetPb = {
    var id: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    var name: _root_.scala.Option[String] = _root_.scala.None
    var text: _root_.scala.Option[String] = _root_.scala.None
    var action: _root_.scala.Option[ByteBuffer] = _root_.scala.None
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
                id = _root_.scala.Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                name = _root_.scala.Some(readNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                text = _root_.scala.Some(readTextValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'text' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                action = _root_.scala.Some(readActionValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'action' (expected=%s, actual=%s).".format(
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
      id,
      name,
      text,
      action,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
    name: _root_.scala.Option[String] = _root_.scala.None,
    text: _root_.scala.Option[String] = _root_.scala.None,
    action: _root_.scala.Option[ByteBuffer] = _root_.scala.None
  ): ButtonComponentDataSetPb =
    new Immutable(
      id,
      name,
      text,
      action
    )

  def unapply(_item: ButtonComponentDataSetPb): _root_.scala.Option[scala.Product4[Option[ByteBuffer], Option[String], Option[String], Option[ByteBuffer]]] = _root_.scala.Some(_item)


  @inline private def readIdValue(_iprot: TProtocol): ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeIdField(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IdField)
    writeIdValue(id_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIdValue(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(id_item)
  }

  @inline private def readNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeNameField(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NameField)
    writeNameValue(name_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNameValue(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(name_item)
  }

  @inline private def readTextValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeTextField(text_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TextField)
    writeTextValue(text_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTextValue(text_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(text_item)
  }

  @inline private def readActionValue(_iprot: TProtocol): ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeActionField(action_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ActionField)
    writeActionValue(action_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeActionValue(action_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(action_item)
  }


  object Immutable extends ThriftStructCodec3[ButtonComponentDataSetPb] {
    override def encode(_item: ButtonComponentDataSetPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): ButtonComponentDataSetPb = ButtonComponentDataSetPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[ButtonComponentDataSetPb] = ButtonComponentDataSetPb.metaData
  }

  /**
   * The default read-only implementation of ButtonComponentDataSetPb.  You typically should not need to
   * directly reference this class; instead, use the ButtonComponentDataSetPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val id: _root_.scala.Option[ByteBuffer],
      val name: _root_.scala.Option[String],
      val text: _root_.scala.Option[String],
      val action: _root_.scala.Option[ByteBuffer],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ButtonComponentDataSetPb {
    def this(
      id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
      name: _root_.scala.Option[String] = _root_.scala.None,
      text: _root_.scala.Option[String] = _root_.scala.None,
      action: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    ) = this(
      id,
      name,
      text,
      action,
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
      val id: _root_.scala.Option[ByteBuffer],
      nameOffset: Int,
      textOffset: Int,
      val action: _root_.scala.Option[ByteBuffer],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ButtonComponentDataSetPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val name: _root_.scala.Option[String] =
      if (nameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, nameOffset))
      }
    lazy val text: _root_.scala.Option[String] =
      if (textOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, textOffset))
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
   * This Proxy trait allows you to extend the ButtonComponentDataSetPb trait with additional state or
   * behavior and implement the read-only methods from ButtonComponentDataSetPb using an underlying
   * instance.
   */
  trait Proxy extends ButtonComponentDataSetPb {
    protected def _underlying_ButtonComponentDataSetPb: ButtonComponentDataSetPb
    override def id: _root_.scala.Option[ByteBuffer] = _underlying_ButtonComponentDataSetPb.id
    override def name: _root_.scala.Option[String] = _underlying_ButtonComponentDataSetPb.name
    override def text: _root_.scala.Option[String] = _underlying_ButtonComponentDataSetPb.text
    override def action: _root_.scala.Option[ByteBuffer] = _underlying_ButtonComponentDataSetPb.action
    override def _passthroughFields = _underlying_ButtonComponentDataSetPb._passthroughFields
  }
}

trait ButtonComponentDataSetPb
  extends ThriftStruct
  with scala.Product4[Option[ByteBuffer], Option[String], Option[String], Option[ByteBuffer]]
  with java.io.Serializable
{
  import ButtonComponentDataSetPb._

  def id: _root_.scala.Option[ByteBuffer]
  def name: _root_.scala.Option[String]
  def text: _root_.scala.Option[String]
  def action: _root_.scala.Option[ByteBuffer]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = id
  def _2 = name
  def _3 = text
  def _4 = action


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
              if (id.isDefined) {
                writeIdValue(id.get, _oprot)
                _root_.scala.Some(ButtonComponentDataSetPb.IdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (name.isDefined) {
                writeNameValue(name.get, _oprot)
                _root_.scala.Some(ButtonComponentDataSetPb.NameField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (text.isDefined) {
                writeTextValue(text.get, _oprot)
                _root_.scala.Some(ButtonComponentDataSetPb.TextField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (action.isDefined) {
                writeActionValue(action.get, _oprot)
                _root_.scala.Some(ButtonComponentDataSetPb.ActionField)
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
  def setField(_blob: TFieldBlob): ButtonComponentDataSetPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var name: _root_.scala.Option[String] = this.name
    var text: _root_.scala.Option[String] = this.text
    var action: _root_.scala.Option[ByteBuffer] = this.action
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        id = _root_.scala.Some(readIdValue(_blob.read))
      case 2 =>
        name = _root_.scala.Some(readNameValue(_blob.read))
      case 3 =>
        text = _root_.scala.Some(readTextValue(_blob.read))
      case 4 =>
        action = _root_.scala.Some(readActionValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      id,
      name,
      text,
      action,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ButtonComponentDataSetPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var name: _root_.scala.Option[String] = this.name
    var text: _root_.scala.Option[String] = this.text
    var action: _root_.scala.Option[ByteBuffer] = this.action

    _fieldId match {
      case 1 =>
        id = _root_.scala.None
      case 2 =>
        name = _root_.scala.None
      case 3 =>
        text = _root_.scala.None
      case 4 =>
        action = _root_.scala.None
      case _ =>
    }
    new Immutable(
      id,
      name,
      text,
      action,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetId: ButtonComponentDataSetPb = unsetField(1)

  def unsetName: ButtonComponentDataSetPb = unsetField(2)

  def unsetText: ButtonComponentDataSetPb = unsetField(3)

  def unsetAction: ButtonComponentDataSetPb = unsetField(4)


  override def write(_oprot: TProtocol): Unit = {
    ButtonComponentDataSetPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (id.isDefined) writeIdField(id.get, _oprot)
    if (name.isDefined) writeNameField(name.get, _oprot)
    if (text.isDefined) writeTextField(text.get, _oprot)
    if (action.isDefined) writeActionField(action.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    id: _root_.scala.Option[ByteBuffer] = this.id,
    name: _root_.scala.Option[String] = this.name,
    text: _root_.scala.Option[String] = this.text,
    action: _root_.scala.Option[ByteBuffer] = this.action,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ButtonComponentDataSetPb =
    new Immutable(
      id,
      name,
      text,
      action,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ButtonComponentDataSetPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[ButtonComponentDataSetPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.id
    case 1 => this.name
    case 2 => this.text
    case 3 => this.action
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ButtonComponentDataSetPb"
}