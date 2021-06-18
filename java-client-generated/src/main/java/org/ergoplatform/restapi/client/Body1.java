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
 * Body1
 */


public class Body1 {
  @SerializedName("pass")
  private String pass = null;

  @SerializedName("mnemonic")
  private String mnemonic = null;

  @SerializedName("mnemonicPass")
  private String mnemonicPass = null;

  public Body1 pass(String pass) {
    this.pass = pass;
    return this;
  }

   /**
   * Password to encrypt wallet file with
   * @return pass
  **/
  @Schema(required = true, description = "Password to encrypt wallet file with")
  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public Body1 mnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
    return this;
  }

   /**
   * Mnemonic seed
   * @return mnemonic
  **/
  @Schema(required = true, description = "Mnemonic seed")
  public String getMnemonic() {
    return mnemonic;
  }

  public void setMnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
  }

  public Body1 mnemonicPass(String mnemonicPass) {
    this.mnemonicPass = mnemonicPass;
    return this;
  }

   /**
   * Optional pass to password-protect mnemonic seed
   * @return mnemonicPass
  **/
  @Schema(description = "Optional pass to password-protect mnemonic seed")
  public String getMnemonicPass() {
    return mnemonicPass;
  }

  public void setMnemonicPass(String mnemonicPass) {
    this.mnemonicPass = mnemonicPass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.pass, body1.pass) &&
        Objects.equals(this.mnemonic, body1.mnemonic) &&
        Objects.equals(this.mnemonicPass, body1.mnemonicPass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pass, mnemonic, mnemonicPass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    mnemonic: ").append(toIndentedString(mnemonic)).append("\n");
    sb.append("    mnemonicPass: ").append(toIndentedString(mnemonicPass)).append("\n");
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
