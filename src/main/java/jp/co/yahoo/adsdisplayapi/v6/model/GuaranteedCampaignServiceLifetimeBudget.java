package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceLifetimeBudgetオブジェクトは、キャンペーンの通期予算に関する情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceLifetimeBudget object describes the information of campaign&#39;s lifetime budget.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceLifetimeBudgetオブジェクトは、キャンペーンの通期予算に関する情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedCampaignServiceLifetimeBudget object describes the information of campaign's lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServiceLifetimeBudget   {
  @JsonProperty("amount")
  private Long amount = null;

  public GuaranteedCampaignServiceLifetimeBudget amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return amount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceLifetimeBudget guaranteedCampaignServiceLifetimeBudget = (GuaranteedCampaignServiceLifetimeBudget) o;
    return Objects.equals(this.amount, guaranteedCampaignServiceLifetimeBudget.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceLifetimeBudget {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

