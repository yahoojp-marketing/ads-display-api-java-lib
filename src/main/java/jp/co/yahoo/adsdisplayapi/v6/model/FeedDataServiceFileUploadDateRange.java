package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FileUploadDataRangeオブジェクトは、アップロードした日付を範囲指定する情報を保持する&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FileUploadDataRange object retains specific term of file upload date information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FileUploadDataRangeオブジェクトは、アップロードした日付を範囲指定する情報を保持する</div> <div lang=\"en\">FileUploadDataRange object retains specific term of file upload date information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedDataServiceFileUploadDateRange   {
  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public FeedDataServiceFileUploadDateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">終了日 yyyyMMdd形式</div> <div lang=\"en\">End Date.<br>Format: yyyyMMdd</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">終了日 yyyyMMdd形式</div> <div lang=\"en\">End Date.<br>Format: yyyyMMdd</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public FeedDataServiceFileUploadDateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">開始日 yyyyMMdd形式</div> <div lang=\"en\">Start date.<br>Format: yyyyMMdd</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">開始日 yyyyMMdd形式</div> <div lang=\"en\">Start date.<br>Format: yyyyMMdd</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDataServiceFileUploadDateRange feedDataServiceFileUploadDateRange = (FeedDataServiceFileUploadDateRange) o;
    return Objects.equals(this.endDate, feedDataServiceFileUploadDateRange.endDate) &&
        Objects.equals(this.startDate, feedDataServiceFileUploadDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDataServiceFileUploadDateRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

