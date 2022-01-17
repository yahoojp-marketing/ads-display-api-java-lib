package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceUploadUserListValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceUploadUserListPageオブジェクトは、取得されるユーザーリストのアップロード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceUploadUserListPage object describes upload information of the user list to be retrieved.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceUploadUserListPageオブジェクトは、取得されるユーザーリストのアップロード情報を表します。</div> <div lang=\"en\">AudienceListServiceUploadUserListPage object describes upload information of the user list to be retrieved.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceUploadUserListPage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<AudienceListServiceUploadUserListValue> values = null;

  public AudienceListServiceUploadUserListPage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public AudienceListServiceUploadUserListPage values(List<AudienceListServiceUploadUserListValue> values) {
    this.values = values;
    return this;
  }

  public AudienceListServiceUploadUserListPage addValuesItem(AudienceListServiceUploadUserListValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AudienceListServiceUploadUserListValue> getValues() {
    return values;
  }

  public void setValues(List<AudienceListServiceUploadUserListValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceUploadUserListPage audienceListServiceUploadUserListPage = (AudienceListServiceUploadUserListPage) o;
    return Objects.equals(this.totalNumEntries, audienceListServiceUploadUserListPage.totalNumEntries) &&
        Objects.equals(this.values, audienceListServiceUploadUserListPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceUploadUserListPage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

