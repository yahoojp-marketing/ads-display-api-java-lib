package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAudienceCategoryオブジェクトは、オーディエンスカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAudienceCategory object contains audience category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAudienceCategoryオブジェクトは、オーディエンスカテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceAudienceCategory object contains audience category information.</div> ")

public class DictionaryServiceAudienceCategory   {
  @JsonProperty("audienceCategoryType")
  private JsonNullable<String> audienceCategoryType = JsonNullable.undefined();

  @JsonProperty("isGuaranteedPermitted")
  private JsonNullable<String> isGuaranteedPermitted = JsonNullable.undefined();

  @JsonProperty("child")
  @Valid
  private JsonNullable<List<DictionaryServiceAudienceCategory>> child = JsonNullable.undefined();

  @JsonProperty("code")
  private JsonNullable<String> code = JsonNullable.undefined();

  @JsonProperty("fullName")
  private JsonNullable<String> fullName = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("reach")
  private JsonNullable<Long> reach = JsonNullable.undefined();

  public DictionaryServiceAudienceCategory audienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = JsonNullable.of(audienceCategoryType);
    return this;
  }

  /**
   * <div lang=\"ja\">提供されるカテゴリの種別を表します。</div> <div lang=\"en\">Audience category information.</div> <dl class=term>   <dt class=\"term__item\">AFFINITY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">興味関心です。</span><span lang=\"en\">Affinity.</span></dd>   <dt class=\"term__item\">IN_MARKET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購買意向です。</span><span lang=\"en\">In-market.</span></dd>   <dt class=\"term__item\">ATTRIBUTE_LIFE_EVENTS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">属性ライフイベントです。</span><span lang=\"en\">Attribute-life-events.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
   * @return audienceCategoryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">提供されるカテゴリの種別を表します。</div> <div lang=\"en\">Audience category information.</div> <dl class=term>   <dt class=\"term__item\">AFFINITY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">興味関心です。</span><span lang=\"en\">Affinity.</span></dd>   <dt class=\"term__item\">IN_MARKET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購買意向です。</span><span lang=\"en\">In-market.</span></dd>   <dt class=\"term__item\">ATTRIBUTE_LIFE_EVENTS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">属性ライフイベントです。</span><span lang=\"en\">Attribute-life-events.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> ")


  public JsonNullable<String> getAudienceCategoryType() {
    return audienceCategoryType;
  }

  public void setAudienceCategoryType(JsonNullable<String> audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
  }

  public DictionaryServiceAudienceCategory isGuaranteedPermitted(String isGuaranteedPermitted) {
    this.isGuaranteedPermitted = JsonNullable.of(isGuaranteedPermitted);
    return this;
  }

  /**
   * <div lang=\"ja\">予約型販売対象を表します</div> <div lang=\"en\">Indicates that it is subject to guaranteed sale.</div> 
   * @return isGuaranteedPermitted
  */
  @ApiModelProperty(value = "<div lang=\"ja\">予約型販売対象を表します</div> <div lang=\"en\">Indicates that it is subject to guaranteed sale.</div> ")


  public JsonNullable<String> getIsGuaranteedPermitted() {
    return isGuaranteedPermitted;
  }

  public void setIsGuaranteedPermitted(JsonNullable<String> isGuaranteedPermitted) {
    this.isGuaranteedPermitted = isGuaranteedPermitted;
  }

  public DictionaryServiceAudienceCategory child(List<DictionaryServiceAudienceCategory> child) {
    this.child = JsonNullable.of(child);
    return this;
  }

  public DictionaryServiceAudienceCategory addChildItem(DictionaryServiceAudienceCategory childItem) {
    if (this.child == null || !this.child.isPresent()) {
      this.child = JsonNullable.of(new ArrayList<>());
    }
    this.child.get().add(childItem);
    return this;
  }

  /**
   * <div lang=\"ja\">子要素としてDictionaryServiceAudienceCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceAudienceCategory object is used.</div> 
   * @return child
  */
  @ApiModelProperty(value = "<div lang=\"ja\">子要素としてDictionaryServiceAudienceCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceAudienceCategory object is used.</div> ")

  @Valid

  public JsonNullable<List<DictionaryServiceAudienceCategory>> getChild() {
    return child;
  }

  public void setChild(JsonNullable<List<DictionaryServiceAudienceCategory>> child) {
    this.child = child;
  }

  public DictionaryServiceAudienceCategory code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code</div> 
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code</div> ")


  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
    this.code = code;
  }

  public DictionaryServiceAudienceCategory fullName(String fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name (A formal name including category name and sub category name.)</div> 
   * @return fullName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name (A formal name including category name and sub category name.)</div> ")


  public JsonNullable<String> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public DictionaryServiceAudienceCategory name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * <div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Sub-category name</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Sub-category name</div> ")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public DictionaryServiceAudienceCategory reach(Long reach) {
    this.reach = JsonNullable.of(reach);
    return this;
  }

  /**
   * <div lang=\"ja\">リーチ数です。</div> <div lang=\"en\">Reach record number</div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リーチ数です。</div> <div lang=\"en\">Reach record number</div> ")


  public JsonNullable<Long> getReach() {
    return reach;
  }

  public void setReach(JsonNullable<Long> reach) {
    this.reach = reach;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

