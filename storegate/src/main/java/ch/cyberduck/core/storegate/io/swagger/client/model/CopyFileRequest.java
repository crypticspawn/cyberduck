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
 * A CopyRequest object
 */
@ApiModel(description = "A CopyRequest object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class CopyFileRequest {
  @JsonProperty("parentID")
  private String parentID = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Copy mode
   */
  public enum ModeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    ModeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = null;

  public CopyFileRequest parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * The id of the folder to copy to
   * @return parentID
  **/
  @ApiModelProperty(value = "The id of the folder to copy to")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public CopyFileRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Optional new name
   * @return name
  **/
  @ApiModelProperty(value = "Optional new name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CopyFileRequest mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Copy mode
   * @return mode
  **/
  @ApiModelProperty(value = "Copy mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyFileRequest copyFileRequest = (CopyFileRequest) o;
    return Objects.equals(this.parentID, copyFileRequest.parentID) &&
        Objects.equals(this.name, copyFileRequest.name) &&
        Objects.equals(this.mode, copyFileRequest.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentID, name, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyFileRequest {\n");
    
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

