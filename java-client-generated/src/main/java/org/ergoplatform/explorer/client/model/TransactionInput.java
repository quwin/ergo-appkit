/*
 * Ergo blockchain explorer
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.explorer.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.ergoplatform.explorer.client.model.TransactionInputSpendingProof;
/**
 * TransactionInput
 */


public class TransactionInput {
  @SerializedName("id")
  private String id = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("value")
  private Integer value = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("outputTransactionId")
  private String outputTransactionId = null;

  @SerializedName("spendingProof")
  private TransactionInputSpendingProof spendingProof = null;

  public TransactionInput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionInput address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(required = true, description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public TransactionInput value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Number of coins captured in input
   * minimum: 0
   * @return value
  **/
  @Schema(example = "1230044", required = true, description = "Number of coins captured in input")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public TransactionInput transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @Schema(required = true, description = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TransactionInput outputTransactionId(String outputTransactionId) {
    this.outputTransactionId = outputTransactionId;
    return this;
  }

   /**
   * Get outputTransactionId
   * @return outputTransactionId
  **/
  @Schema(required = true, description = "")
  public String getOutputTransactionId() {
    return outputTransactionId;
  }

  public void setOutputTransactionId(String outputTransactionId) {
    this.outputTransactionId = outputTransactionId;
  }

  public TransactionInput spendingProof(TransactionInputSpendingProof spendingProof) {
    this.spendingProof = spendingProof;
    return this;
  }

   /**
   * Get spendingProof
   * @return spendingProof
  **/
  @Schema(required = true, description = "")
  public TransactionInputSpendingProof getSpendingProof() {
    return spendingProof;
  }

  public void setSpendingProof(TransactionInputSpendingProof spendingProof) {
    this.spendingProof = spendingProof;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInput transactionInput = (TransactionInput) o;
    return Objects.equals(this.id, transactionInput.id) &&
        Objects.equals(this.address, transactionInput.address) &&
        Objects.equals(this.value, transactionInput.value) &&
        Objects.equals(this.transactionId, transactionInput.transactionId) &&
        Objects.equals(this.outputTransactionId, transactionInput.outputTransactionId) &&
        Objects.equals(this.spendingProof, transactionInput.spendingProof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, value, transactionId, outputTransactionId, spendingProof);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    outputTransactionId: ").append(toIndentedString(outputTransactionId)).append("\n");
    sb.append("    spendingProof: ").append(toIndentedString(spendingProof)).append("\n");
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
