package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceData;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceLogicalOperator;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceCombinationオブジェクトは、オーディエンスリストの組み合わせに関する情報を格納するコンテナです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCombination object is a container for storing combination of audience list information. &lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceCombinationオブジェクトは、オーディエンスリストの組み合わせに関する情報を格納するコンテナです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceCombination object is a container for storing combination of audience list information. <br> This field is required in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceCombination   {
  @JsonProperty("logicalOperator")
  private AudienceListServiceLogicalOperator logicalOperator = null;

  @JsonProperty("audienceLists")
  @Valid
  private List<AudienceListServiceData> audienceLists = null;

  public AudienceListServiceCombination logicalOperator(AudienceListServiceLogicalOperator logicalOperator) {
    this.logicalOperator = logicalOperator;
    return this;
  }

  /**
   * Get logicalOperator
   * @return logicalOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceLogicalOperator getLogicalOperator() {
    return logicalOperator;
  }

  public void setLogicalOperator(AudienceListServiceLogicalOperator logicalOperator) {
    this.logicalOperator = logicalOperator;
  }

  public AudienceListServiceCombination audienceLists(List<AudienceListServiceData> audienceLists) {
    this.audienceLists = audienceLists;
    return this;
  }

  public AudienceListServiceCombination addAudienceListsItem(AudienceListServiceData audienceListsItem) {
    if (this.audienceLists == null) {
      this.audienceLists = new ArrayList<>();
    }
    this.audienceLists.add(audienceListsItem);
    return this;
  }

  /**
   * Get audienceLists
   * @return audienceLists
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AudienceListServiceData> getAudienceLists() {
    return audienceLists;
  }

  public void setAudienceLists(List<AudienceListServiceData> audienceLists) {
    this.audienceLists = audienceLists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceCombination audienceListServiceCombination = (AudienceListServiceCombination) o;
    return Objects.equals(this.logicalOperator, audienceListServiceCombination.logicalOperator) &&
        Objects.equals(this.audienceLists, audienceListServiceCombination.audienceLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalOperator, audienceLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceCombination {\n");
    
    sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
    sb.append("    audienceLists: ").append(toIndentedString(audienceLists)).append("\n");
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

