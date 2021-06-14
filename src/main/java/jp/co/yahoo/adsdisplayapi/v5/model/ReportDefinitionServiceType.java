package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   ReportDefinitionServiceTypeは、レポートタイプを表します。<br>   ADD時、ReportDefinitionServiceTypeの指定は不要です。ただし、以下のレポートを取得する場合は、対応するReportDefinitionServiceTypeをReportDefinitionServiceReportTypeConditionで指定する必要があります。<br>   - コンバージョン経路レポートの場合: <code>CONVERSION_PATH</code><br>   - 横断リーチレポートの場合: <code>CROSS_CAMPAIGN_REACHES</code><br>   - リーチフリークエンシーレポートの場合: <code>FREQUENCY</code><br>   - リーチレポートの場合: <code>REACH</code><br> </div> <div lang=\"en\">   ReportDefinitionServiceType serves category type of report.<br>   No need to specify ReportDefinitionServiceType in ADD operation. However, if you want to get the following report, you need to specify the corresponding ReportDefinitionServiceType in ReportDefinitionServiceReportTypeCondition.<br>   - Conversion Path Report: <code>CONVERSION_PATH</code><br>   - Cross-campaign Reach Report: <code>CROSS_CAMPAIGN_REACHES</code><br>   - Reach Frequency Report: <code>FREQUENCY</code><br>   - Reach Report: <code>REACH</code><br>   Only <code>CONVERSION_PATH</code>,<code>CROSS_CAMPAIGN_REACHES</code>,<code>FREQUENCY</code> and <code>REACH</code> can be specified in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">以下のレポートを表します：<br>・アカウントレポート<br>・キャンペーンレポート<br>・広告グループレポート<br>・広告レポート<br>・リンク先URLレポート<br></span><span lang=\"en\">Represents the type of report below:<br>・Account Report<br>・Campaign Report<br>・Ad Group Report<br>・Ad Report<br>・Destination URL Report<br></span></dd>   <dt class=\"term__item\">AUDIENCE_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスカテゴリーレポートです。</span><span lang=\"en\">Audience Category Report.</span></dd>   <dt class=\"term__item\">CONVERSION_PATH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン経路レポートです。</span><span lang=\"en\">Conversion Path Report.</span></dd>   <dt class=\"term__item\">CROSS_CAMPAIGN_REACHES</dt>   <dd class=\"term__desc\"><span lang=\"ja\">横断リーチレポートです。</span><span lang=\"en\">Cross-campaign Reach Report. </span></dd>   <dt class=\"term__item\">FREQUENCY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リーチフリークエンシーレポートです。</span><span lang=\"en\">Reach Frequency Report.</span></dd>   <dt class=\"term__item\">INTEREST_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インタレストカテゴリーレポートです。</span><span lang=\"en\">Interest Category Report.</span></dd>   <dt class=\"term__item\">SITE_RETARGETING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティングレポートです。</span><span lang=\"en\">Site Retargeting Report.</span></dd>   <dt class=\"term__item\">SEARCH_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サーチターゲティングレポートです。</span><span lang=\"en\">Search Targeting Report.</span></dd>   <dt class=\"term__item\">PLACEMENT_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントターゲティングレポートです。</span><span lang=\"en\">Placement Targeting Report.</span></dd>   <dt class=\"term__item\">LABEL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ラベル</span><span lang=\"en\">Label.</span></dd>   <dt class=\"term__item\">SITE_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトカテゴリーレポートです。</span><span lang=\"en\">Site Category Report.</span></dd>   <dt class=\"term__item\">REACH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リーチレポートです。</span><span lang=\"en\">Reach Report.</span></dd>   <dt class=\"term__item\">URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信先URLレポートです。</span><span lang=\"en\">Ad Delivery URL Report.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceType {
  
  AD("AD"),
  
  AUDIENCE_CATEGORY("AUDIENCE_CATEGORY"),
  
  CONVERSION_PATH("CONVERSION_PATH"),
  
  CROSS_CAMPAIGN_REACHES("CROSS_CAMPAIGN_REACHES"),
  
  FREQUENCY("FREQUENCY"),
  
  INTEREST_CATEGORY("INTEREST_CATEGORY"),
  
  SITE_RETARGETING("SITE_RETARGETING"),
  
  SEARCH_TARGET("SEARCH_TARGET"),
  
  PLACEMENT_TARGET("PLACEMENT_TARGET"),
  
  LABEL("LABEL"),
  
  REACH("REACH"),
  
  SITE_CATEGORY("SITE_CATEGORY"),
  
  URL("URL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceType(String value) {
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
  public static ReportDefinitionServiceType fromValue(String value) {
    for (ReportDefinitionServiceType b : ReportDefinitionServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

