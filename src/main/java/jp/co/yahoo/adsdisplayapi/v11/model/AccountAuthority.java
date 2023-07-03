/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountAuthorityオブジェクトは、アカウント権限情報を示します。&lt;br&gt; authoritiesで返却される値は、以下のとおりです。   &lt;table border&#x3D;&#39;1&#39;&gt;     &lt;tr&gt;       &lt;th&gt;accountAuthorities&lt;/th&gt;       &lt;th&gt;説明&lt;/th&gt;       &lt;th&gt;権限種別&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;WEBSITE_TRAFFIC&lt;/td&gt;       &lt;td&gt;運用型：サイト誘導&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;VIDEO_VIEW&lt;/td&gt;       &lt;td&gt;運用型：動画再生&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;APP_PROMOTION&lt;/td&gt;       &lt;td&gt;運用型：アプリ訴求&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CONVERSION&lt;/td&gt;       &lt;td&gt;運用型：コンバージョン&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ITEM_LIST&lt;/td&gt;       &lt;td&gt;運用型：商品リスト訴求&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS&lt;/td&gt;       &lt;td&gt;運用型：ブランド認知&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS_GUARANTEED&lt;/td&gt;       &lt;td&gt;予約型：ブランド認知&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;STORE_VISIT&lt;/td&gt;       &lt;td&gt;来店促進&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAYPAY_GIFT&lt;/td&gt;       &lt;td&gt;PayPayギフト&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHOPPING_ADS&lt;/td&gt;       &lt;td&gt;eコマース&lt;/td&gt;       &lt;td&gt;キャンペーン掲載タイプ&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SALES_PROMOTION&lt;/td&gt;       &lt;td&gt;セールスプロモーション&lt;/td&gt;       &lt;td&gt;キャンペーン掲載タイプ&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_CV&lt;/td&gt;       &lt;td&gt;コンバージョン最大化&lt;/td&gt;       &lt;td&gt;入札戦略&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_CLICK&lt;/td&gt;       &lt;td&gt;クリック最大化&lt;/td&gt;       &lt;td&gt;入札戦略&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_VIEW&lt;/td&gt;       &lt;td&gt;動画再生最大化&lt;/td&gt;       &lt;td&gt;入札戦略&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_VIMPS&lt;/td&gt;       &lt;td&gt;vimps最大化&lt;/td&gt;       &lt;td&gt;入札戦略&lt;/td&gt;     &lt;/tr&gt;   &lt;/table&gt; それぞれのキャンペーン目的の詳細については、&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;ja&amp;aid&#x3D;51512\&quot;&gt;目的別キャンペーン作成について&lt;/a&gt;をご確認ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountAuthority objects serve account authority information.&lt;br&gt; Responded values of &#x60;authorities&#x60; are as follows.   &lt;table border&#x3D;&#39;1&#39;&gt;     &lt;tr&gt;       &lt;th&gt;accountAuthorities&lt;/th&gt;       &lt;th&gt;description&lt;/th&gt;       &lt;th&gt;authority type&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;WEBSITE_TRAFFIC&lt;/td&gt;       &lt;td&gt;AUCTION : Website traffic&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;VIDEO_VIEW&lt;/td&gt;       &lt;td&gt;AUCTION : Video view&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;APP_PROMOTION&lt;/td&gt;       &lt;td&gt;AUCTION : App promotion&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CONVERSION&lt;/td&gt;       &lt;td&gt;AUCTION : Conversion&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ITEM_LIST&lt;/td&gt;       &lt;td&gt;AUCTION : Item list promotion&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS&lt;/td&gt;       &lt;td&gt;AUCTION : Brand awareness&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;STORE_VISIT&lt;/td&gt;       &lt;td&gt;Store Visit&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAYPAY_GIFT&lt;/td&gt;       &lt;td&gt;PayPay Gift&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS_GUARANTEED&lt;/td&gt;       &lt;td&gt;GUARANTEED : Brand awareness&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHOPPING_ADS&lt;/td&gt;       &lt;td&gt;Ecommerce&lt;/td&gt;       &lt;td&gt;Campaign delivery type&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SALES_PROMOTION&lt;/td&gt;       &lt;td&gt;Sales Promotion&lt;/td&gt;       &lt;td&gt;Campaign delivery type&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_CV&lt;/td&gt;       &lt;td&gt;Specify maximum conversion&lt;/td&gt;       &lt;td&gt;Bid strategy&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_CLICK&lt;/td&gt;       &lt;td&gt;Specify maximum click&lt;/td&gt;       &lt;td&gt;Bid strategy&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_VIEW&lt;/td&gt;       &lt;td&gt;Specify maximum video view&lt;/td&gt;       &lt;td&gt;Bid strategy&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;MAX_VIMPS&lt;/td&gt;       &lt;td&gt;Specify maximum vimps&lt;/td&gt;       &lt;td&gt;Bid strategy&lt;/td&gt;     &lt;/tr&gt;   &lt;/table&gt; Details of these campaign goal are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;ja&amp;aid&#x3D;51512\&quot;&gt;目的別キャンペーン作成について&lt;/a&gt; (Japanese context only). &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AccountAuthority.JSON_PROPERTY_ACCOUNT_ID,
  AccountAuthority.JSON_PROPERTY_AUTHORITIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountAuthority {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AUTHORITIES = "authorities";
  private List<String> authorities;

  public AccountAuthority() {
  }

  public AccountAuthority accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AccountAuthority authorities(List<String> authorities) {
    
    this.authorities = authorities;
    return this;
  }

  public AccountAuthority addAuthoritiesItem(String authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント権限です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account authority.&lt;/div&gt; 
   * @return authorities
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAuthorities() {
    return authorities;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAuthority accountAuthority = (AccountAuthority) o;
    return Objects.equals(this.accountId, accountAuthority.accountId) &&
        Objects.equals(this.authorities, accountAuthority.authorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, authorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAuthority {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

