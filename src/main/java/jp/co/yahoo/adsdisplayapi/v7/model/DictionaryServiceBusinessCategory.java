package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceBusinessCategoryオブジェクトは、ビジネスカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceBusinessCategory object contains ad category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceBusinessCategoryオブジェクトは、ビジネスカテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceBusinessCategory object contains ad category information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceBusinessCategory   {
  @JsonProperty("businessCategoryId")
  private String businessCategoryId = null;

  @JsonProperty("businessCategoryName")
  private String businessCategoryName = null;

  public DictionaryServiceBusinessCategory businessCategoryId(String businessCategoryId) {
    this.businessCategoryId = businessCategoryId;
    return this;
  }

  /**
   * <div lang=\"ja\">ビジネスカテゴリIDを表します。</div> <div lang=\"en\">Business category ID.</div> 
   * @return businessCategoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビジネスカテゴリIDを表します。</div> <div lang=\"en\">Business category ID.</div> ")


  public String getBusinessCategoryId() {
    return businessCategoryId;
  }

  public void setBusinessCategoryId(String businessCategoryId) {
    this.businessCategoryId = businessCategoryId;
  }

  public DictionaryServiceBusinessCategory businessCategoryName(String businessCategoryName) {
    this.businessCategoryName = businessCategoryName;
    return this;
  }

  /**
   * <div lang=\"ja\">ビジネスカテゴリ名を表します。</div> <div lang=\"en\">Business category name.</div> 
   * @return businessCategoryName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビジネスカテゴリ名を表します。</div> <div lang=\"en\">Business category name.</div> ")


  public String getBusinessCategoryName() {
    return businessCategoryName;
  }

  public void setBusinessCategoryName(String businessCategoryName) {
    this.businessCategoryName = businessCategoryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceBusinessCategory dictionaryServiceBusinessCategory = (DictionaryServiceBusinessCategory) o;
    return Objects.equals(this.businessCategoryId, dictionaryServiceBusinessCategory.businessCategoryId) &&
        Objects.equals(this.businessCategoryName, dictionaryServiceBusinessCategory.businessCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessCategoryId, businessCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceBusinessCategory {\n");
    
    sb.append("    businessCategoryId: ").append(toIndentedString(businessCategoryId)).append("\n");
    sb.append("    businessCategoryName: ").append(toIndentedString(businessCategoryName)).append("\n");
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

