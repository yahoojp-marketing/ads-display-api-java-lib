package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountAuthorityオブジェクトは、アカウント権限情報を示します。&lt;br&gt; authoritiesで返却される値は、以下のとおりです。   &lt;table border&#x3D;&#39;1&#39;&gt;     &lt;tr&gt;       &lt;th&gt;accountAuthorities&lt;/th&gt;       &lt;th&gt;説明&lt;/th&gt;       &lt;th&gt;権限種別&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;WEBSITE_TRAFFIC&lt;/td&gt;       &lt;td&gt;運用型：サイト誘導&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;VIDEO_VIEW&lt;/td&gt;       &lt;td&gt;運用型：動画再生&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;APP_PROMOTION&lt;/td&gt;       &lt;td&gt;運用型：アプリ訴求&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CONVERSION&lt;/td&gt;       &lt;td&gt;運用型：コンバージョン&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ITEM_LIST&lt;/td&gt;       &lt;td&gt;運用型：商品リスト訴求&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS&lt;/td&gt;       &lt;td&gt;運用型：ブランド認知&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS_GUARANTEED&lt;/td&gt;       &lt;td&gt;予約型：ブランド認知&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;STORE_VISIT&lt;/td&gt;       &lt;td&gt;来店促進&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAYPAY_GIFT&lt;/td&gt;       &lt;td&gt;PayPayギフト&lt;/td&gt;       &lt;td&gt;キャンペーン目的&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHOPPING_ADS&lt;/td&gt;       &lt;td&gt;eコマース&lt;/td&gt;       &lt;td&gt;キャンペーン掲載タイプ&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SALES_PROMOTION&lt;/td&gt;       &lt;td&gt;セールスプロモーション&lt;/td&gt;       &lt;td&gt;キャンペーン掲載タイプ&lt;/td&gt;     &lt;/tr&gt;   &lt;/table&gt; それぞれのキャンペーン目的の詳細については、&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;ja&amp;aid&#x3D;51512\&quot;&gt;目的別キャンペーン作成について&lt;/a&gt;をご確認ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountAuthority objects serve account authority information.&lt;br&gt; Responded values of &#x60;authorities&#x60; are as follows.   &lt;table border&#x3D;&#39;1&#39;&gt;     &lt;tr&gt;       &lt;th&gt;accountAuthorities&lt;/th&gt;       &lt;th&gt;description&lt;/th&gt;       &lt;th&gt;authority type&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;WEBSITE_TRAFFIC&lt;/td&gt;       &lt;td&gt;AUCTION : Website traffic&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;VIDEO_VIEW&lt;/td&gt;       &lt;td&gt;AUCTION : Video view&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;APP_PROMOTION&lt;/td&gt;       &lt;td&gt;AUCTION : App promotion&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CONVERSION&lt;/td&gt;       &lt;td&gt;AUCTION : Conversion&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ITEM_LIST&lt;/td&gt;       &lt;td&gt;AUCTION : Item list promotion&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS&lt;/td&gt;       &lt;td&gt;AUCTION : Brand awareness&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BRAND_AWARENESS_GUARANTEED&lt;/td&gt;       &lt;td&gt;GUARANTEED : Brand awareness&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;STORE_VISIT&lt;/td&gt;       &lt;td&gt;Store Visit&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAYPAY_GIFT&lt;/td&gt;       &lt;td&gt;PayPay Gift&lt;/td&gt;       &lt;td&gt;Campaign goal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHOPPING_ADS&lt;/td&gt;       &lt;td&gt;Ecommerce&lt;/td&gt;       &lt;td&gt;Campaign delivery type&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SALES_PROMOTION&lt;/td&gt;       &lt;td&gt;Sales Promotion&lt;/td&gt;       &lt;td&gt;Campaign delivery type&lt;/td&gt;     &lt;/tr&gt;   &lt;/table&gt; Details of these campaign goal are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;ja&amp;aid&#x3D;51512\&quot;&gt;目的別キャンペーン作成について&lt;/a&gt; (Japanese context only). &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountAuthorityオブジェクトは、アカウント権限情報を示します。<br> authoritiesで返却される値は、以下のとおりです。   <table border='1'>     <tr>       <th>accountAuthorities</th>       <th>説明</th>       <th>権限種別</th>     </tr>     <tr>       <td>WEBSITE_TRAFFIC</td>       <td>運用型：サイト誘導</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>VIDEO_VIEW</td>       <td>運用型：動画再生</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>APP_PROMOTION</td>       <td>運用型：アプリ訴求</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>CONVERSION</td>       <td>運用型：コンバージョン</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>ITEM_LIST</td>       <td>運用型：商品リスト訴求</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>BRAND_AWARENESS</td>       <td>運用型：ブランド認知</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>BRAND_AWARENESS_GUARANTEED</td>       <td>予約型：ブランド認知</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>STORE_VISIT</td>       <td>来店促進</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>PAYPAY_GIFT</td>       <td>PayPayギフト</td>       <td>キャンペーン目的</td>     </tr>     <tr>       <td>SHOPPING_ADS</td>       <td>eコマース</td>       <td>キャンペーン掲載タイプ</td>     </tr>     <tr>       <td>SALES_PROMOTION</td>       <td>セールスプロモーション</td>       <td>キャンペーン掲載タイプ</td>     </tr>   </table> それぞれのキャンペーン目的の詳細については、<a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=ja&aid=51512\">目的別キャンペーン作成について</a>をご確認ください。 </div> <div lang=\"en\">AccountAuthority objects serve account authority information.<br> Responded values of `authorities` are as follows.   <table border='1'>     <tr>       <th>accountAuthorities</th>       <th>description</th>       <th>authority type</th>     </tr>     <tr>       <td>WEBSITE_TRAFFIC</td>       <td>AUCTION : Website traffic</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>VIDEO_VIEW</td>       <td>AUCTION : Video view</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>APP_PROMOTION</td>       <td>AUCTION : App promotion</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>CONVERSION</td>       <td>AUCTION : Conversion</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>ITEM_LIST</td>       <td>AUCTION : Item list promotion</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>BRAND_AWARENESS</td>       <td>AUCTION : Brand awareness</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>BRAND_AWARENESS_GUARANTEED</td>       <td>GUARANTEED : Brand awareness</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>STORE_VISIT</td>       <td>Store Visit</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>PAYPAY_GIFT</td>       <td>PayPay Gift</td>       <td>Campaign goal</td>     </tr>     <tr>       <td>SHOPPING_ADS</td>       <td>Ecommerce</td>       <td>Campaign delivery type</td>     </tr>     <tr>       <td>SALES_PROMOTION</td>       <td>Sales Promotion</td>       <td>Campaign delivery type</td>     </tr>   </table> Details of these campaign goal are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=ja&aid=51512\">目的別キャンペーン作成について</a> (Japanese context only). </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountAuthority   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("authorities")
  @Valid
  private List<String> authorities = null;

  public AccountAuthority accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

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
   * <div lang=\"ja\">アカウント権限です。</div> <div lang=\"en\">Account authority.</div> 
   * @return authorities
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント権限です。</div> <div lang=\"en\">Account authority.</div> ")


  public List<String> getAuthorities() {
    return authorities;
  }

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

