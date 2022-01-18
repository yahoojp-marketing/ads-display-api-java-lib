package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AudienceListServiceIsOpenは、リーチ蓄積の有無を表します。<br> このフィールドは、audienceListTypeがRULEの場合は、ADD時に必須となり、SET時に省略可能となります。<br> DEFAULT_LISTの場合は、SET時に省略可能です。<br> その他の場合は、無視されます。 </div> <div lang=\"en\"> AudienceListServiceIsOpen display the setting of store of reaches to Audience List. <br> If audienceListType is RULE, this field is required in ADD operation, and is optional in SET operation.<br> If audienceListType is DEFAULT_LIST, this field is optional in SET operation.<br> For other cases, this field will be ignored. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスリストに対してリーチを貯めます。</span><span lang=\"en\">Store Reaches to Audience List.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスリストに対してリーチを貯めません。</span><span lang=\"en\">Do not store Reaches to Audience List.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AudienceListServiceIsOpen {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceIsOpen(String value) {
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
  public static AudienceListServiceIsOpen fromValue(String value) {
    for (AudienceListServiceIsOpen b : AudienceListServiceIsOpen.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

