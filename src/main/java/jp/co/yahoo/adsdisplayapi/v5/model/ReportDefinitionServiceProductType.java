package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceProductTypeは、アカウントのプロダクトタイプを表します。 </div> <div lang=\"en\"> ReportDefinitionServiceProductType describes product type of the account. </div> <dl class=term>   <dt class=\"term__item\">YDA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">YDAです。</span><span lang=\"en\">YDA.</span></dd>   <dt class=\"term__item\">YSA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">YSAです。</span><span lang=\"en\">YSA.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceProductType {
  
  YDA("YDA"),
  
  YSA("YSA"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceProductType(String value) {
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
  public static ReportDefinitionServiceProductType fromValue(String value) {
    for (ReportDefinitionServiceProductType b : ReportDefinitionServiceProductType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

