package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceEnterpriseType;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceEnterpriseTypePosition;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServicePrefectureCode;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceUrlType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AccountManagementServiceClientオブジェクトは、広告主情報を表します。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AccountManagementServiceClient object describes the client information.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AccountManagementServiceClientオブジェクトは、広告主情報を表します。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。 </div> <div lang=\"en\"> AccountManagementServiceClient object describes the client information.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceClient   {
  @JsonProperty("building")
  private String building = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("clientPersonName")
  private String clientPersonName = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("companyNameKana")
  private String companyNameKana = null;

  @JsonProperty("enterpriseType")
  private AccountManagementServiceEnterpriseType enterpriseType = null;

  @JsonProperty("enterpriseTypePosition")
  private AccountManagementServiceEnterpriseTypePosition enterpriseTypePosition = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("prefectureCode")
  private AccountManagementServicePrefectureCode prefectureCode = null;

  @JsonProperty("street1")
  private String street1 = null;

  @JsonProperty("street2")
  private String street2 = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("urlType")
  private AccountManagementServiceUrlType urlType = null;

  @JsonProperty("zip")
  private String zip = null;

  public AccountManagementServiceClient building(String building) {
    this.building = building;
    return this;
  }

  /**
   * <div lang=\"ja\"> ビル名です。<br> このフィールドは、ADD時に省略可能となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Building name.<br> This field is optional in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return building
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビル名です。<br> このフィールドは、ADD時に省略可能となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Building name.<br> This field is optional in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")


  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public AccountManagementServiceClient city(String city) {
    this.city = city;
    return this;
  }

  /**
   * <div lang=\"ja\"> 市区町村名です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> City name.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return city
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 市区町村名です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> City name.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountManagementServiceClient clientPersonName(String clientPersonName) {
    this.clientPersonName = clientPersonName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告主の担当者氏名です。<br> このフィールドは、ADD時に省略可能となり、SET時に無視されます。 </div> <div lang=\"en\"> Client person name.<br> This field is optional in ADD operation, and will be ignored in SET operation. </div> 
   * @return clientPersonName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告主の担当者氏名です。<br> このフィールドは、ADD時に省略可能となり、SET時に無視されます。 </div> <div lang=\"en\"> Client person name.<br> This field is optional in ADD operation, and will be ignored in SET operation. </div> ")


  public String getClientPersonName() {
    return clientPersonName;
  }

  public void setClientPersonName(String clientPersonName) {
    this.clientPersonName = clientPersonName;
  }

  public AccountManagementServiceClient companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告主名です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Company name.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations.</div> 
   * @return companyName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告主名です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Company name.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations.</div> ")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public AccountManagementServiceClient companyNameKana(String companyNameKana) {
    this.companyNameKana = companyNameKana;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告主名カナです。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Kana characters of company name.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return companyNameKana
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告主名カナです。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Kana characters of company name.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")


  public String getCompanyNameKana() {
    return companyNameKana;
  }

  public void setCompanyNameKana(String companyNameKana) {
    this.companyNameKana = companyNameKana;
  }

  public AccountManagementServiceClient enterpriseType(AccountManagementServiceEnterpriseType enterpriseType) {
    this.enterpriseType = enterpriseType;
    return this;
  }

  /**
   * Get enterpriseType
   * @return enterpriseType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceEnterpriseType getEnterpriseType() {
    return enterpriseType;
  }

  public void setEnterpriseType(AccountManagementServiceEnterpriseType enterpriseType) {
    this.enterpriseType = enterpriseType;
  }

  public AccountManagementServiceClient enterpriseTypePosition(AccountManagementServiceEnterpriseTypePosition enterpriseTypePosition) {
    this.enterpriseTypePosition = enterpriseTypePosition;
    return this;
  }

  /**
   * Get enterpriseTypePosition
   * @return enterpriseTypePosition
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceEnterpriseTypePosition getEnterpriseTypePosition() {
    return enterpriseTypePosition;
  }

  public void setEnterpriseTypePosition(AccountManagementServiceEnterpriseTypePosition enterpriseTypePosition) {
    this.enterpriseTypePosition = enterpriseTypePosition;
  }

  public AccountManagementServiceClient phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * <div lang=\"ja\"> 電話番号です。<br> ※xxxxx-xxxxx-xxxxx形式です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Phone number.<br> * In xxxxx-xxxxx-xxxxx format.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return phoneNumber
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 電話番号です。<br> ※xxxxx-xxxxx-xxxxx形式です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Phone number.<br> * In xxxxx-xxxxx-xxxxx format.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")

@Pattern(regexp="^\\d{1,5}-\\d{1,5}-\\d{1,5}$") 
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AccountManagementServiceClient prefectureCode(AccountManagementServicePrefectureCode prefectureCode) {
    this.prefectureCode = prefectureCode;
    return this;
  }

  /**
   * Get prefectureCode
   * @return prefectureCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServicePrefectureCode getPrefectureCode() {
    return prefectureCode;
  }

  public void setPrefectureCode(AccountManagementServicePrefectureCode prefectureCode) {
    this.prefectureCode = prefectureCode;
  }

  public AccountManagementServiceClient street1(String street1) {
    this.street1 = street1;
    return this;
  }

  /**
   * <div lang=\"ja\"> 町・字名です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Street1.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return street1
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 町・字名です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Street1.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")


  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public AccountManagementServiceClient street2(String street2) {
    this.street2 = street2;
    return this;
  }

  /**
   * <div lang=\"ja\"> 丁目・番地・号です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Street2.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return street2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 丁目・番地・号です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Street2.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")


  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public AccountManagementServiceClient url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告掲載を希望するサイトのURLです。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。 </div> <div lang=\"en\"> Site URL for placing advertisement.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告掲載を希望するサイトのURLです。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。 </div> <div lang=\"en\"> Site URL for placing advertisement.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AccountManagementServiceClient urlType(AccountManagementServiceUrlType urlType) {
    this.urlType = urlType;
    return this;
  }

  /**
   * Get urlType
   * @return urlType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceUrlType getUrlType() {
    return urlType;
  }

  public void setUrlType(AccountManagementServiceUrlType urlType) {
    this.urlType = urlType;
  }

  public AccountManagementServiceClient zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * <div lang=\"ja\"> 郵便番号です。<br> ※xxx-xxxx形式です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Zip code.<br> * In xxx-xxxx format.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> 
   * @return zip
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 郵便番号です。<br> ※xxx-xxxx形式です。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> Zip code.<br> * In xxx-xxxx format.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> ")

@Pattern(regexp="^\\d{3}-\\d{4}$") 
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagementServiceClient accountManagementServiceClient = (AccountManagementServiceClient) o;
    return Objects.equals(this.building, accountManagementServiceClient.building) &&
        Objects.equals(this.city, accountManagementServiceClient.city) &&
        Objects.equals(this.clientPersonName, accountManagementServiceClient.clientPersonName) &&
        Objects.equals(this.companyName, accountManagementServiceClient.companyName) &&
        Objects.equals(this.companyNameKana, accountManagementServiceClient.companyNameKana) &&
        Objects.equals(this.enterpriseType, accountManagementServiceClient.enterpriseType) &&
        Objects.equals(this.enterpriseTypePosition, accountManagementServiceClient.enterpriseTypePosition) &&
        Objects.equals(this.phoneNumber, accountManagementServiceClient.phoneNumber) &&
        Objects.equals(this.prefectureCode, accountManagementServiceClient.prefectureCode) &&
        Objects.equals(this.street1, accountManagementServiceClient.street1) &&
        Objects.equals(this.street2, accountManagementServiceClient.street2) &&
        Objects.equals(this.url, accountManagementServiceClient.url) &&
        Objects.equals(this.urlType, accountManagementServiceClient.urlType) &&
        Objects.equals(this.zip, accountManagementServiceClient.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(building, city, clientPersonName, companyName, companyNameKana, enterpriseType, enterpriseTypePosition, phoneNumber, prefectureCode, street1, street2, url, urlType, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceClient {\n");
    
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    clientPersonName: ").append(toIndentedString(clientPersonName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyNameKana: ").append(toIndentedString(companyNameKana)).append("\n");
    sb.append("    enterpriseType: ").append(toIndentedString(enterpriseType)).append("\n");
    sb.append("    enterpriseTypePosition: ").append(toIndentedString(enterpriseTypePosition)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    prefectureCode: ").append(toIndentedString(prefectureCode)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

