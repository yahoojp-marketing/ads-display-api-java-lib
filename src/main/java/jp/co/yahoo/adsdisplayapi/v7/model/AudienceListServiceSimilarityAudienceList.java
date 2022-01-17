package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceSize;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceSizeReaches;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 類似ユーザーターゲットの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがSIMILARITYの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceSimilarityAudienceList object is a container for storing the information of Targeting information of users (similar).&lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is SIMILARITY, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> 類似ユーザーターゲットの情報を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※audienceListTypeがSIMILARITYの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceSimilarityAudienceList object is a container for storing the information of Targeting information of users (similar).<br> This field is optional in ADD and SET operation. <br> *If audienceListType is SIMILARITY, this field is required in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceSimilarityAudienceList   {
  @JsonProperty("audienceListId")
  private Long audienceListId = null;

  @JsonProperty("audienceListSize")
  private AudienceListServiceSize audienceListSize = null;

  @JsonProperty("audienceListSizeReaches")
  @Valid
  private List<AudienceListServiceSizeReaches> audienceListSizeReaches = null;

  public AudienceListServiceSimilarityAudienceList audienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリスト（類似ユーザー）を作成する基となるオーディエンスリストIDです。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。 </div> <div lang=\"en\"> Audience list ID that is the basis for creating the audience list (similar users).<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation. </div> 
   * @return audienceListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリスト（類似ユーザー）を作成する基となるオーディエンスリストIDです。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。 </div> <div lang=\"en\"> Audience list ID that is the basis for creating the audience list (similar users).<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation. </div> ")


  public Long getAudienceListId() {
    return audienceListId;
  }

  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }

  public AudienceListServiceSimilarityAudienceList audienceListSize(AudienceListServiceSize audienceListSize) {
    this.audienceListSize = audienceListSize;
    return this;
  }

  /**
   * Get audienceListSize
   * @return audienceListSize
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceSize getAudienceListSize() {
    return audienceListSize;
  }

  public void setAudienceListSize(AudienceListServiceSize audienceListSize) {
    this.audienceListSize = audienceListSize;
  }

  public AudienceListServiceSimilarityAudienceList audienceListSizeReaches(List<AudienceListServiceSizeReaches> audienceListSizeReaches) {
    this.audienceListSizeReaches = audienceListSizeReaches;
    return this;
  }

  public AudienceListServiceSimilarityAudienceList addAudienceListSizeReachesItem(AudienceListServiceSizeReaches audienceListSizeReachesItem) {
    if (this.audienceListSizeReaches == null) {
      this.audienceListSizeReaches = new ArrayList<>();
    }
    this.audienceListSizeReaches.add(audienceListSizeReachesItem);
    return this;
  }

  /**
   * Get audienceListSizeReaches
   * @return audienceListSizeReaches
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=10) 
  public List<AudienceListServiceSizeReaches> getAudienceListSizeReaches() {
    return audienceListSizeReaches;
  }

  public void setAudienceListSizeReaches(List<AudienceListServiceSizeReaches> audienceListSizeReaches) {
    this.audienceListSizeReaches = audienceListSizeReaches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceSimilarityAudienceList audienceListServiceSimilarityAudienceList = (AudienceListServiceSimilarityAudienceList) o;
    return Objects.equals(this.audienceListId, audienceListServiceSimilarityAudienceList.audienceListId) &&
        Objects.equals(this.audienceListSize, audienceListServiceSimilarityAudienceList.audienceListSize) &&
        Objects.equals(this.audienceListSizeReaches, audienceListServiceSimilarityAudienceList.audienceListSizeReaches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListId, audienceListSize, audienceListSizeReaches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceSimilarityAudienceList {\n");
    
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListSize: ").append(toIndentedString(audienceListSize)).append("\n");
    sb.append("    audienceListSizeReaches: ").append(toIndentedString(audienceListSizeReaches)).append("\n");
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

