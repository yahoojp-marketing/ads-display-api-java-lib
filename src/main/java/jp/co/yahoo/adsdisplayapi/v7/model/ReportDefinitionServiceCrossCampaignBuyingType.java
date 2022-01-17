package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   ReportDefinitionServiceCrossCampaignBuyingTypeは、横断リーチレポートの組み合わせの対象となるキャンペーン購入タイプを示します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、crossCampaignTypeが<code>CAMPAIGN_BUYING_TYPE</code>の場合は必須です。 </div> <div lang=\"en\">   ReportDefinitionServiceCrossCampaignBuyingType indicates the campaign purchase type that is subject to combination of Cross-campaign Reach Report.<br>    This field is optional in ADD operation, and will be ignored in REMOVE operation.<br>   *If crossCampaignType is <code>CAMPAIGN_BUYING_TYPE</code>, this field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">AUCTION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">運用型です。</span><span lang=\"en\">Auction.</span></dd>   <dt class=\"term__item\">GUARANTEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約型です。</span><span lang=\"en\">Guaranteed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceCrossCampaignBuyingType {
  
  AUCTION("AUCTION"),
  
  GUARANTEED("GUARANTEED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceCrossCampaignBuyingType(String value) {
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
  public static ReportDefinitionServiceCrossCampaignBuyingType fromValue(String value) {
    for (ReportDefinitionServiceCrossCampaignBuyingType b : ReportDefinitionServiceCrossCampaignBuyingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

