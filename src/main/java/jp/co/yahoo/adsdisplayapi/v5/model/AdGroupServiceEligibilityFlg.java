package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceEligibilityFlgは、コンバージョン最適化利用可否フラグを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※DISABLEの場合は自動入札（コンバージョン最適化）は使えません。 </div> <div lang=\"en\"> AdGroupServiceEligibilityFlg serves whether conversion optimization is available.<br> Although this field will be returned in the response, it will be ignored on input.<br> *If this field value is 'DISABLE', this AdGroup cannot use Auto Bidding(Conversion Optimization). </div> <dl class=term>   <dt class=\"term__item\">ENABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン最適化利用可能</span><span lang=\"en\">Can use the Conversion Optimization functions.</span></dd>   <dt class=\"term__item\">DISABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン最適化利用不可</span><span lang=\"en\">Cannot use the Conversion Optimization functions.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceEligibilityFlg {
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceEligibilityFlg(String value) {
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
  public static AdGroupServiceEligibilityFlg fromValue(String value) {
    for (AdGroupServiceEligibilityFlg b : AdGroupServiceEligibilityFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

