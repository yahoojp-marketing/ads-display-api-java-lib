package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   ReportDefinitionServiceIncludeViewInteractionFlgは、コンバージョン経路レポートにおいてビューインタラクションを含めるかどうかを表すフラグです。<br>   このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\">   ReportDefinitionServiceIncludeViewInteractionFlg is a flag which indicates whether to include view interaction in Conversion Path Report.<br>   This field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ビューインタラクションを含めます。</span><span lang=\"en\">Includes view interaction.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ビューインタラクションを含めません。</span><span lang=\"en\">Does not includes view interaction.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceIncludeViewInteractionFlg {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceIncludeViewInteractionFlg(String value) {
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
  public static ReportDefinitionServiceIncludeViewInteractionFlg fromValue(String value) {
    for (ReportDefinitionServiceIncludeViewInteractionFlg b : ReportDefinitionServiceIncludeViewInteractionFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

