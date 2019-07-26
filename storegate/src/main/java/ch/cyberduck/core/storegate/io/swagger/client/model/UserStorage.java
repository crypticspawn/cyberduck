/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Storageinformation
 */
@ApiModel(description = "Storageinformation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class UserStorage {
  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("available")
  private Long available = null;

  @JsonProperty("used")
  private Long used = null;

  @JsonProperty("reserved")
  private Long reserved = null;

  @JsonProperty("totalUsed")
  private Long totalUsed = null;

  public UserStorage size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The accounts total storage size.
   * @return size
  **/
  @ApiModelProperty(value = "The accounts total storage size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public UserStorage available(Long available) {
    this.available = available;
    return this;
  }

   /**
   * Available storage for this user.
   * @return available
  **/
  @ApiModelProperty(value = "Available storage for this user.")
  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
    this.available = available;
  }

  public UserStorage used(Long used) {
    this.used = used;
    return this;
  }

   /**
   * Used storage by this user.
   * @return used
  **/
  @ApiModelProperty(value = "Used storage by this user.")
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }

  public UserStorage reserved(Long reserved) {
    this.reserved = reserved;
    return this;
  }

   /**
   * Reserved storage for this user.
   * @return reserved
  **/
  @ApiModelProperty(value = "Reserved storage for this user.")
  public Long getReserved() {
    return reserved;
  }

  public void setReserved(Long reserved) {
    this.reserved = reserved;
  }

  public UserStorage totalUsed(Long totalUsed) {
    this.totalUsed = totalUsed;
    return this;
  }

   /**
   * Used storage by all user.
   * @return totalUsed
  **/
  @ApiModelProperty(value = "Used storage by all user.")
  public Long getTotalUsed() {
    return totalUsed;
  }

  public void setTotalUsed(Long totalUsed) {
    this.totalUsed = totalUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStorage userStorage = (UserStorage) o;
    return Objects.equals(this.size, userStorage.size) &&
        Objects.equals(this.available, userStorage.available) &&
        Objects.equals(this.used, userStorage.used) &&
        Objects.equals(this.reserved, userStorage.reserved) &&
        Objects.equals(this.totalUsed, userStorage.totalUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, available, used, reserved, totalUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStorage {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    totalUsed: ").append(toIndentedString(totalUsed)).append("\n");
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

