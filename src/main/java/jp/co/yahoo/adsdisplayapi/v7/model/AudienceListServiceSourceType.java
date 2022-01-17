package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AudienceListServiceSourceTypeは、ソースタイプの種別を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AudienceListServiceSourceType describes the source type.<br> Although this field will be returned in the response, it will be ignored on input.  </div> <dl class=term>   <dt class=\"term__item\">SITE_RETARGETING_TAG</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティングタグです。</span><span lang=\"en\">Site retargeting tag.</span></dd>   <dt class=\"term__item\">CUSTOMER_DATA_FILE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">顧客データファイルです。</span><span lang=\"en\">Customer data file.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AudienceListServiceSourceType {
  
  SITE_RETARGETING_TAG("SITE_RETARGETING_TAG"),
  
  CUSTOMER_DATA_FILE("CUSTOMER_DATA_FILE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceSourceType(String value) {
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
  public static AudienceListServiceSourceType fromValue(String value) {
    for (AudienceListServiceSourceType b : AudienceListServiceSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

