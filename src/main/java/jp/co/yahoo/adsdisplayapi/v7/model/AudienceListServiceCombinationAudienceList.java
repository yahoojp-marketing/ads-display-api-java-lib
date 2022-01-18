package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceCombination;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceCombinationAudienceListオブジェクトは、オーディエンスリストの組み合わせ情報のリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがCOMBINATIONの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCombinationAudienceList object is a container for storing list of combination of audience list information. &lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is COMBINATION, this field is required in  ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceCombinationAudienceListオブジェクトは、オーディエンスリストの組み合わせ情報のリストを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※audienceListTypeがCOMBINATIONの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceCombinationAudienceList object is a container for storing list of combination of audience list information. <br> This field is optional in ADD and SET operation. <br> *If audienceListType is COMBINATION, this field is required in  ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceCombinationAudienceList   {
  @JsonProperty("combinations")
  @Valid
  private List<AudienceListServiceCombination> combinations = null;

  public AudienceListServiceCombinationAudienceList combinations(List<AudienceListServiceCombination> combinations) {
    this.combinations = combinations;
    return this;
  }

  public AudienceListServiceCombinationAudienceList addCombinationsItem(AudienceListServiceCombination combinationsItem) {
    if (this.combinations == null) {
      this.combinations = new ArrayList<>();
    }
    this.combinations.add(combinationsItem);
    return this;
  }

  /**
   * Get combinations
   * @return combinations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AudienceListServiceCombination> getCombinations() {
    return combinations;
  }

  public void setCombinations(List<AudienceListServiceCombination> combinations) {
    this.combinations = combinations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceCombinationAudienceList audienceListServiceCombinationAudienceList = (AudienceListServiceCombinationAudienceList) o;
    return Objects.equals(this.combinations, audienceListServiceCombinationAudienceList.combinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceCombinationAudienceList {\n");
    
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
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

