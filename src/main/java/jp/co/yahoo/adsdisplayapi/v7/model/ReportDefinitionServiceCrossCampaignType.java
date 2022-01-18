package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   ReportDefinitionServiceCrossCampaignTypeは、横断リーチレポートの組み合わせの種別を示します。<br>   このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\">   ReportDefinitionServiceCrossCampaignType indicates the combination type of Cross-campaign Reach Report. <br>    This field is required in ADD operation.  </div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンIDの組み合わせです。</span><span lang=\"en\">Combination of campaign ID.</span></dd>   <dt class=\"term__item\">CAMPAIGN_GOAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン目的の組み合わせです。</span><span lang=\"en\">Combination of campaign goal.</span></dd>   <dt class=\"term__item\">CAMPAIGN_BUYING_TYPE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン購入タイプの組み合わせです。</span><span lang=\"en\">Combination of campaign buying type.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceCrossCampaignType {
  
  CAMPAIGN_ID("CAMPAIGN_ID"),
  
  CAMPAIGN_GOAL("CAMPAIGN_GOAL"),
  
  CAMPAIGN_BUYING_TYPE("CAMPAIGN_BUYING_TYPE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceCrossCampaignType(String value) {
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
  public static ReportDefinitionServiceCrossCampaignType fromValue(String value) {
    for (ReportDefinitionServiceCrossCampaignType b : ReportDefinitionServiceCrossCampaignType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

