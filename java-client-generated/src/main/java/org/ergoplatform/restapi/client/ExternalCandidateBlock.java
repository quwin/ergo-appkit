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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Candidate block info for external miner
 */
@Schema(description = "Candidate block info for external miner")

public class ExternalCandidateBlock {
  @SerializedName("msg")
  private String msg = null;

  @SerializedName("b")
  private Integer b = null;

  @SerializedName("pk")
  private String pk = null;

  public ExternalCandidateBlock msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Base16-encoded block bytes without pow
   * @return msg
  **/
  @Schema(example = "0350e25cee8562697d55275c96bb01b34228f9bd68fd9933f2a25ff195526864f5", required = true, description = "Base16-encoded block bytes without pow")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public ExternalCandidateBlock b(Integer b) {
    this.b = b;
    return this;
  }

   /**
   * Get b
   * @return b
  **/
  @Schema(example = "987654321", required = true, description = "")
  public Integer getB() {
    return b;
  }

  public void setB(Integer b) {
    this.b = b;
  }

  public ExternalCandidateBlock pk(String pk) {
    this.pk = pk;
    return this;
  }

   /**
   * Base16-encoded public key
   * @return pk
  **/
  @Schema(example = "0350e25cee8562697d55275c96bb01b34228f9bd68fd9933f2a25ff195526864f5", required = true, description = "Base16-encoded public key")
  public String getPk() {
    return pk;
  }

  public void setPk(String pk) {
    this.pk = pk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalCandidateBlock externalCandidateBlock = (ExternalCandidateBlock) o;
    return Objects.equals(this.msg, externalCandidateBlock.msg) &&
        Objects.equals(this.b, externalCandidateBlock.b) &&
        Objects.equals(this.pk, externalCandidateBlock.pk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, b, pk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalCandidateBlock {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
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
