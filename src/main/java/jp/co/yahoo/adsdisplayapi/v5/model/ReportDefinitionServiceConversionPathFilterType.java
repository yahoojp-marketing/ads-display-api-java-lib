package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   ReportDefinitionServiceConversionPathFilterTypeは、コンバージョン経路レポートにおけるフィルター条件の項目を示します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\">   ReportDefinitionServiceConversionPathFilterType indicates the filter condition item of Conversion Path Report. <br>    This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンIDです。</span><span lang=\"en\">Campaign ID.</span></dd>   <dt class=\"term__item\">CAMPAIGN_NAME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン名です。</span><span lang=\"en\">Campaign name.</span></dd>   <dt class=\"term__item\">CAMPAIGN_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンIDです。</span><span lang=\"en\">Conversion ID.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceConversionPathFilterType {
  
  CAMPAIGN_ID("CAMPAIGN_ID"),
  
  CAMPAIGN_NAME("CAMPAIGN_NAME"),
  
  CONVERSION_ID("CONVERSION_ID"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceConversionPathFilterType(String value) {
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
  public static ReportDefinitionServiceConversionPathFilterType fromValue(String value) {
    for (ReportDefinitionServiceConversionPathFilterType b : ReportDefinitionServiceConversionPathFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

