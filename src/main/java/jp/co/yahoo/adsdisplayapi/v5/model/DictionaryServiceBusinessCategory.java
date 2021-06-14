package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceBusinessCategoryオブジェクトは、ビジネスカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceBusinessCategory object contains ad category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceBusinessCategoryオブジェクトは、ビジネスカテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceBusinessCategory object contains ad category information.</div> ")

public class DictionaryServiceBusinessCategory   {
  @JsonProperty("businessCategoryId")
  private JsonNullable<String> businessCategoryId = JsonNullable.undefined();

  @JsonProperty("businessCategoryName")
  private JsonNullable<String> businessCategoryName = JsonNullable.undefined();

  public DictionaryServiceBusinessCategory businessCategoryId(String businessCategoryId) {
    this.businessCategoryId = JsonNullable.of(businessCategoryId);
    return this;
  }

  /**
   * <div lang=\"ja\">ビジネスカテゴリIDを表します。</div> <div lang=\"en\">Business category ID.</div> 
   * @return businessCategoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビジネスカテゴリIDを表します。</div> <div lang=\"en\">Business category ID.</div> ")


  public JsonNullable<String> getBusinessCategoryId() {
    return businessCategoryId;
  }

  public void setBusinessCategoryId(JsonNullable<String> businessCategoryId) {
    this.businessCategoryId = businessCategoryId;
  }

  public DictionaryServiceBusinessCategory businessCategoryName(String businessCategoryName) {
    this.businessCategoryName = JsonNullable.of(businessCategoryName);
    return this;
  }

  /**
   * <div lang=\"ja\">ビジネスカテゴリ名を表します。</div> <div lang=\"en\">Business category name.</div> 
   * @return businessCategoryName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビジネスカテゴリ名を表します。</div> <div lang=\"en\">Business category name.</div> ")


  public JsonNullable<String> getBusinessCategoryName() {
    return businessCategoryName;
  }

  public void setBusinessCategoryName(JsonNullable<String> businessCategoryName) {
    this.businessCategoryName = businessCategoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

