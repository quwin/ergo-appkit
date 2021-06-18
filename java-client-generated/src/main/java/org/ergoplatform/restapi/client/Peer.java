/*
 * Ergo Node API
 * API docs for Ergo Node. Models are shared between all Ergo products
 *
 * OpenAPI spec version: 0.1
 * Contact: ergoplatform@protonmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.restapi.client;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Peer
 */


public class Peer {
  @SerializedName("address")
  private String address = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lastSeen")
  private Integer lastSeen = null;

  /**
   * Gets or Sets connectionType
   */
  @JsonAdapter(ConnectionTypeEnum.Adapter.class)
  public enum ConnectionTypeEnum {
    INCOMING("Incoming"),
    OUTGOING("Outgoing");

    private String value;

    ConnectionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConnectionTypeEnum fromValue(String text) {
      for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConnectionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConnectionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConnectionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("connectionType")
  private ConnectionTypeEnum connectionType = null;

  public Peer address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(example = "127.0.0.1:5673", required = true, description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Peer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "mynode", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Peer lastSeen(Integer lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @Schema(description = "")
  public Integer getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Integer lastSeen) {
    this.lastSeen = lastSeen;
  }

  public Peer connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @Schema(description = "")
  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peer peer = (Peer) o;
    return Objects.equals(this.address, peer.address) &&
        Objects.equals(this.name, peer.name) &&
        Objects.equals(this.lastSeen, peer.lastSeen) &&
        Objects.equals(this.connectionType, peer.connectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, lastSeen, connectionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peer {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
