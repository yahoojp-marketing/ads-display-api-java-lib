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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceSearchTargetオブジェクトは、サーチターゲティング設定情報を保持します。br&gt;ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがSEARCH_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceSearchTarget object is a container for storing search targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is SEARCH_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceSearchTargetオブジェクトは、サーチターゲティング設定情報を保持します。br>ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがSEARCH_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceSearchTarget object is a container for storing search targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is SEARCH_TARGET, this field is required. </div> ")

public class AdGroupTargetServiceSearchTarget   {
  @JsonProperty("searchKeywordListName")
  private JsonNullable<String> searchKeywordListName = JsonNullable.undefined();

  public AdGroupTargetServiceSearchTarget searchKeywordListName(String searchKeywordListName) {
    this.searchKeywordListName = JsonNullable.of(searchKeywordListName);
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Search Keyword List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return searchKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Search Keyword List name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getSearchKeywordListName() {
    return searchKeywordListName;
  }

  public void setSearchKeywordListName(JsonNullable<String> searchKeywordListName) {
    this.searchKeywordListName = searchKeywordListName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceSearchTarget adGroupTargetServiceSearchTarget = (AdGroupTargetServiceSearchTarget) o;
    return Objects.equals(this.searchKeywordListName, adGroupTargetServiceSearchTarget.searchKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceSearchTarget {\n");
    
    sb.append("    searchKeywordListName: ").append(toIndentedString(searchKeywordListName)).append("\n");
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

