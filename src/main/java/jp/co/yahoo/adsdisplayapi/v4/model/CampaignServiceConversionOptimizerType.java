package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceConversionOptimizerTypeは、コンバージョン最適化タイプを表します。<br> このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。<br> ※SET時、目的ありの場合は設定不可となります。 </div> <div lang=\"en\"> CampaignServiceConversionOptimizerType displays the type of Conversion Optimization.<br> This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. <br> *For campaign with campaign goal, this field cannot be set in SET operation. </div> <dl class=term>   <dt class=\"term__item\">MANUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札です。</span><span lang=\"en\">Manual Bidding.</span></dd>   <dt class=\"term__item\">AUTO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札です。</span><span lang=\"en\">Auto Bidding.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceConversionOptimizerType {
  
  MANUAL("MANUAL"),
  
  AUTO("AUTO"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceConversionOptimizerType(String value) {
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
  public static CampaignServiceConversionOptimizerType fromValue(String value) {
    for (CampaignServiceConversionOptimizerType b : CampaignServiceConversionOptimizerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

