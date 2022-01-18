package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceFilterOperatorオブジェクトは、フィルターで指定できる演算子を表します。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> ReportDefinitionServiceFilterOperator object displays the operator to be specified by filter. <br> This field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">NOT_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">≠</span><span lang=\"en\">≠</span></dd>   <dt class=\"term__item\">CONTAINS_ANY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定したいずれかの値を含む（リスト項目専用）</span><span lang=\"en\">Contains any of specified values (used for list only)</span></dd>   <dt class=\"term__item\">EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">=</span><span lang=\"en\">=</span></dd>   <dt class=\"term__item\">GREATER_THAN_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">≧</span><span lang=\"en\">≧</span></dd>   <dt class=\"term__item\">LESS_THAN_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">≦</span><span lang=\"en\">≦</span></dd>   <dt class=\"term__item\">GREATER_THAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">＞</span><span lang=\"en\">＞</span></dd>   <dt class=\"term__item\">LESS_THAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">＜</span><span lang=\"en\">＜</span></dd>   <dt class=\"term__item\">CONTAINS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分一致</span><span lang=\"en\">contains</span></dd>   <dt class=\"term__item\">IN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">いずれかに一致</span><span lang=\"en\">in</span></dd>   <dt class=\"term__item\">CONTAINS_ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定した全ての値を含む（リスト項目専用）</span><span lang=\"en\">Contains all of specified values (used for list only)</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceFilterOperator {
  
  EQUALS("EQUALS"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
  
  CONTAINS("CONTAINS"),
  
  IN("IN"),
  
  CONTAINS_ALL("CONTAINS_ALL"),
  
  CONTAINS_ANY("CONTAINS_ANY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceFilterOperator(String value) {
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
  public static ReportDefinitionServiceFilterOperator fromValue(String value) {
    for (ReportDefinitionServiceFilterOperator b : ReportDefinitionServiceFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

