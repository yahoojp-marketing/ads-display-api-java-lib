package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAudienceCategoryオブジェクトは、オーディエンスカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAudienceCategory object contains audience category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAudienceCategoryオブジェクトは、オーディエンスカテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceAudienceCategory object contains audience category information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceAudienceCategory   {
  @JsonProperty("audienceCategoryType")
  private String audienceCategoryType = null;

  @JsonProperty("isGuaranteedPermitted")
  private String isGuaranteedPermitted = null;

  @JsonProperty("child")
  @Valid
  private List<DictionaryServiceAudienceCategory> child = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reach")
  private Long reach = null;

  public DictionaryServiceAudienceCategory audienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
    return this;
  }

  /**
   * <div lang=\"ja\">提供されるカテゴリの種別を表します。</div> <div lang=\"en\">Audience category information.</div> <dl class=term>   <dt class=\"term__item\">AFFINITY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">興味関心です。</span><span lang=\"en\">Affinity.</span></dd>   <dt class=\"term__item\">IN_MARKET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購買意向です。</span><span lang=\"en\">In-market.</span></dd>   <dt class=\"term__item\">ATTRIBUTE_LIFE_EVENTS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">属性ライフイベントです。</span><span lang=\"en\">Attribute-life-events.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
   * @return audienceCategoryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">提供されるカテゴリの種別を表します。</div> <div lang=\"en\">Audience category information.</div> <dl class=term>   <dt class=\"term__item\">AFFINITY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">興味関心です。</span><span lang=\"en\">Affinity.</span></dd>   <dt class=\"term__item\">IN_MARKET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購買意向です。</span><span lang=\"en\">In-market.</span></dd>   <dt class=\"term__item\">ATTRIBUTE_LIFE_EVENTS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">属性ライフイベントです。</span><span lang=\"en\">Attribute-life-events.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> ")


  public String getAudienceCategoryType() {
    return audienceCategoryType;
  }

  public void setAudienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
  }

  public DictionaryServiceAudienceCategory isGuaranteedPermitted(String isGuaranteedPermitted) {
    this.isGuaranteedPermitted = isGuaranteedPermitted;
    return this;
  }

  /**
   * <div lang=\"ja\">予約型販売対象を表します</div> <div lang=\"en\">Indicates that it is subject to guaranteed sale.</div> 
   * @return isGuaranteedPermitted
  */
  @ApiModelProperty(value = "<div lang=\"ja\">予約型販売対象を表します</div> <div lang=\"en\">Indicates that it is subject to guaranteed sale.</div> ")


  public String getIsGuaranteedPermitted() {
    return isGuaranteedPermitted;
  }

  public void setIsGuaranteedPermitted(String isGuaranteedPermitted) {
    this.isGuaranteedPermitted = isGuaranteedPermitted;
  }

  public DictionaryServiceAudienceCategory child(List<DictionaryServiceAudienceCategory> child) {
    this.child = child;
    return this;
  }

  public DictionaryServiceAudienceCategory addChildItem(DictionaryServiceAudienceCategory childItem) {
    if (this.child == null) {
      this.child = new ArrayList<>();
    }
    this.child.add(childItem);
    return this;
  }

  /**
   * <div lang=\"ja\">子要素としてDictionaryServiceAudienceCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceAudienceCategory object is used.</div> 
   * @return child
  */
  @ApiModelProperty(value = "<div lang=\"ja\">子要素としてDictionaryServiceAudienceCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceAudienceCategory object is used.</div> ")

  @Valid

  public List<DictionaryServiceAudienceCategory> getChild() {
    return child;
  }

  public void setChild(List<DictionaryServiceAudienceCategory> child) {
    this.child = child;
  }

  public DictionaryServiceAudienceCategory code(String code) {
    this.code = code;
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code</div> 
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code</div> ")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DictionaryServiceAudienceCategory fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name (A formal name including category name and sub category name.)</div> 
   * @return fullName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name (A formal name including category name and sub category name.)</div> ")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public DictionaryServiceAudienceCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Sub-category name</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Sub-category name</div> ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionaryServiceAudienceCategory reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\">リーチ数です。</div> <div lang=\"en\">Reach record number</div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リーチ数です。</div> <div lang=\"en\">Reach record number</div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceAudienceCategory dictionaryServiceAudienceCategory = (DictionaryServiceAudienceCategory) o;
    return Objects.equals(this.audienceCategoryType, dictionaryServiceAudienceCategory.audienceCategoryType) &&
        Objects.equals(this.isGuaranteedPermitted, dictionaryServiceAudienceCategory.isGuaranteedPermitted) &&
        Objects.equals(this.child, dictionaryServiceAudienceCategory.child) &&
        Objects.equals(this.code, dictionaryServiceAudienceCategory.code) &&
        Objects.equals(this.fullName, dictionaryServiceAudienceCategory.fullName) &&
        Objects.equals(this.name, dictionaryServiceAudienceCategory.name) &&
        Objects.equals(this.reach, dictionaryServiceAudienceCategory.reach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryType, isGuaranteedPermitted, child, code, fullName, name, reach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceAudienceCategory {\n");
    
    sb.append("    audienceCategoryType: ").append(toIndentedString(audienceCategoryType)).append("\n");
    sb.append("    isGuaranteedPermitted: ").append(toIndentedString(isGuaranteedPermitted)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
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

