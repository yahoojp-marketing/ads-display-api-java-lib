package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceOptimizerTypeは、コンバージョン最適化タイプを表します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceOptimizerType displays the type of conversion optimization.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンの入札方法を適用します。</span><span lang=\"en\">Apply same Bidding with campaign.</span></dd>   <dt class=\"term__item\">MANUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札です。</span><span lang=\"en\">Manual Bidding.</span></dd>   <dt class=\"term__item\">AUTO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札です。</span><span lang=\"en\">Auto Bidding.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceOptimizerType {
  
  NONE("NONE"),
  
  MANUAL("MANUAL"),
  
  AUTO("AUTO"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceOptimizerType(String value) {
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
  public static AdGroupServiceOptimizerType fromValue(String value) {
    for (AdGroupServiceOptimizerType b : AdGroupServiceOptimizerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

