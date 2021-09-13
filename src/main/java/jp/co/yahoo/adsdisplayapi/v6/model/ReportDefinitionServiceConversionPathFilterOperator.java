package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   ReportDefinitionServiceConversionPathFilterOperatorは、コンバージョン経路レポートにおけるフィルター条件の項目を示します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\">   ReportDefinitionServiceConversionPathFilterOperator indicates the filter condition item of Conversion Path Report. <br>    This field is optional in ADD operation, and will be ignored in REMOVE operation.  </div> <dl class=term>   <dt class=\"term__item\">EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完全一致する対象を含む経路です。</span><span lang=\"en\">A path that includes an exact match target.</span></dd>   <dt class=\"term__item\">NOT_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完全一致する対象を含まない経路です。</span><span lang=\"en\">A path that does not include an exact match target.</span></dd>   <dt class=\"term__item\">CONTAINS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分一致する対象を含む経路です。</span><span lang=\"en\">A path that includes a broad match target.</span></dd>   <dt class=\"term__item\">NOT_CONTAINS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分一致する対象を含まない経路です。</span><span lang=\"en\">A path that does not include a broad match target.</span></dd>   <dt class=\"term__item\">START_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">前方一致する対象を含む経路です。</span><span lang=\"en\">A path that includes prefix match target.</span></dd>   <dt class=\"term__item\">END_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">後方一致する対象を含む経路です。</span><span lang=\"en\">A path that includes backward match target. </span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceConversionPathFilterOperator {
  
  EQUALS("EQUALS"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  CONTAINS("CONTAINS"),
  
  NOT_CONTAINS("NOT_CONTAINS"),
  
  START_WITH("START_WITH"),
  
  END_WITH("END_WITH"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceConversionPathFilterOperator(String value) {
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
  public static ReportDefinitionServiceConversionPathFilterOperator fromValue(String value) {
    for (ReportDefinitionServiceConversionPathFilterOperator b : ReportDefinitionServiceConversionPathFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

