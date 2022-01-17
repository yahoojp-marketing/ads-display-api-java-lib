package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AudienceListServiceTypeは、オーディエンスリストの種別を表します。<br> このフィールドは、ADDおよびSET時に必須となります。<br> ただし、ADD時にDEFAULT_LISTを指定することはできません。 </div> <div lang=\"en\"> AudienceListServiceType serves types of audience list. <br> This field is required in ADD and SET operation.<br> However, DEFAULT_LIST cannot be specified in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">DEFAULT_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デフォルトリストです。</span><span lang=\"en\">Default List.</span></dd>   <dt class=\"term__item\">RULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ルール（条件）です。</span><span lang=\"en\">Rules (conditions).</span></dd>   <dt class=\"term__item\">COMBINATION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">組み合わせです。</span><span lang=\"en\">Combination.</span></dd>   <dt class=\"term__item\">SIMILARITY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似ユーザーです。</span><span lang=\"en\">Similar User.</span></dd>   <dt class=\"term__item\">CUSTOM_AUDIENCE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムオーディエンスです。</span><span lang=\"en\">Custom Audience.</span></dd>   <dt class=\"term__item\">WEBSITE_VISITORS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブサイト訪問ユーザーです。</span><span lang=\"en\">Website visitor.</span></dd>   <dt class=\"term__item\">CUSTOMER_DATA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">顧客データです。</span><span lang=\"en\">Customer data.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AudienceListServiceType {
  
  DEFAULT_LIST("DEFAULT_LIST"),
  
  RULE("RULE"),
  
  COMBINATION("COMBINATION"),
  
  SIMILARITY("SIMILARITY"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
  
  WEBSITE_VISITORS("WEBSITE_VISITORS"),
  
  CUSTOMER_DATA("CUSTOMER_DATA"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceListServiceType fromValue(String value) {
    for (AudienceListServiceType b : AudienceListServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

