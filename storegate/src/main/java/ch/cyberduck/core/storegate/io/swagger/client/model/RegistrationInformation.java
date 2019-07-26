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
import ch.cyberduck.core.storegate.io.swagger.client.model.Country;
import ch.cyberduck.core.storegate.io.swagger.client.model.PaymentMethod;
import ch.cyberduck.core.storegate.io.swagger.client.model.PaymentPeriod;
import ch.cyberduck.core.storegate.io.swagger.client.model.UpgradeSalepackage;
import ch.cyberduck.core.storegate.io.swagger.client.model.UserData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class RegistrationInformation {
  @JsonProperty("salepackage")
  private UpgradeSalepackage salepackage = null;

  @JsonProperty("trialLength")
  private Integer trialLength = null;

  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("retailerId")
  private String retailerId = null;

  @JsonProperty("isDirect")
  private Boolean isDirect = null;

  @JsonProperty("userData")
  private UserData userData = null;

  @JsonProperty("countries")
  private List<Country> countries = null;

  @JsonProperty("paymentMethods")
  private List<PaymentMethod> paymentMethods = null;

  @JsonProperty("paymentPeriods")
  private List<PaymentPeriod> paymentPeriods = null;

  public RegistrationInformation salepackage(UpgradeSalepackage salepackage) {
    this.salepackage = salepackage;
    return this;
  }

   /**
   * Information about the salepackage
   * @return salepackage
  **/
  @ApiModelProperty(value = "Information about the salepackage")
  public UpgradeSalepackage getSalepackage() {
    return salepackage;
  }

  public void setSalepackage(UpgradeSalepackage salepackage) {
    this.salepackage = salepackage;
  }

  public RegistrationInformation trialLength(Integer trialLength) {
    this.trialLength = trialLength;
    return this;
  }

   /**
   * Length of trial. 0 if not available
   * @return trialLength
  **/
  @ApiModelProperty(value = "Length of trial. 0 if not available")
  public Integer getTrialLength() {
    return trialLength;
  }

  public void setTrialLength(Integer trialLength) {
    this.trialLength = trialLength;
  }

  public RegistrationInformation partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * The partnerId
   * @return partnerId
  **/
  @ApiModelProperty(value = "The partnerId")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public RegistrationInformation retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * The retailerId
   * @return retailerId
  **/
  @ApiModelProperty(value = "The retailerId")
  public String getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  public RegistrationInformation isDirect(Boolean isDirect) {
    this.isDirect = isDirect;
    return this;
  }

   /**
   * Use the direct flow
   * @return isDirect
  **/
  @ApiModelProperty(value = "Use the direct flow")
  public Boolean isIsDirect() {
    return isDirect;
  }

  public void setIsDirect(Boolean isDirect) {
    this.isDirect = isDirect;
  }

  public RegistrationInformation userData(UserData userData) {
    this.userData = userData;
    return this;
  }

   /**
   * User data to be included
   * @return userData
  **/
  @ApiModelProperty(value = "User data to be included")
  public UserData getUserData() {
    return userData;
  }

  public void setUserData(UserData userData) {
    this.userData = userData;
  }

  public RegistrationInformation countries(List<Country> countries) {
    this.countries = countries;
    return this;
  }

  public RegistrationInformation addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<Country>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * List of countries
   * @return countries
  **/
  @ApiModelProperty(value = "List of countries")
  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  public RegistrationInformation paymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public RegistrationInformation addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<PaymentMethod>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * List of payment medthods
   * @return paymentMethods
  **/
  @ApiModelProperty(value = "List of payment medthods")
  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public RegistrationInformation paymentPeriods(List<PaymentPeriod> paymentPeriods) {
    this.paymentPeriods = paymentPeriods;
    return this;
  }

  public RegistrationInformation addPaymentPeriodsItem(PaymentPeriod paymentPeriodsItem) {
    if (this.paymentPeriods == null) {
      this.paymentPeriods = new ArrayList<PaymentPeriod>();
    }
    this.paymentPeriods.add(paymentPeriodsItem);
    return this;
  }

   /**
   * List of payemnt periods
   * @return paymentPeriods
  **/
  @ApiModelProperty(value = "List of payemnt periods")
  public List<PaymentPeriod> getPaymentPeriods() {
    return paymentPeriods;
  }

  public void setPaymentPeriods(List<PaymentPeriod> paymentPeriods) {
    this.paymentPeriods = paymentPeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationInformation registrationInformation = (RegistrationInformation) o;
    return Objects.equals(this.salepackage, registrationInformation.salepackage) &&
        Objects.equals(this.trialLength, registrationInformation.trialLength) &&
        Objects.equals(this.partnerId, registrationInformation.partnerId) &&
        Objects.equals(this.retailerId, registrationInformation.retailerId) &&
        Objects.equals(this.isDirect, registrationInformation.isDirect) &&
        Objects.equals(this.userData, registrationInformation.userData) &&
        Objects.equals(this.countries, registrationInformation.countries) &&
        Objects.equals(this.paymentMethods, registrationInformation.paymentMethods) &&
        Objects.equals(this.paymentPeriods, registrationInformation.paymentPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salepackage, trialLength, partnerId, retailerId, isDirect, userData, countries, paymentMethods, paymentPeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationInformation {\n");
    
    sb.append("    salepackage: ").append(toIndentedString(salepackage)).append("\n");
    sb.append("    trialLength: ").append(toIndentedString(trialLength)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    isDirect: ").append(toIndentedString(isDirect)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    paymentPeriods: ").append(toIndentedString(paymentPeriods)).append("\n");
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

