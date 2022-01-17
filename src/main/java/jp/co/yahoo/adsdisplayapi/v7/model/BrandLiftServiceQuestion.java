package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.BrandLiftServiceGoal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BrandLiftServiceQuestionオブジェクトは、ブランドリフト調査項目を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BrandLiftServiceQuestion objects describes the brand lift survey contents.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BrandLiftServiceQuestionオブジェクトは、ブランドリフト調査項目を表します。</div> <div lang=\"en\">BrandLiftServiceQuestion objects describes the brand lift survey contents.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BrandLiftServiceQuestion   {
  @JsonProperty("questionId")
  private Long questionId = null;

  @JsonProperty("goal")
  private BrandLiftServiceGoal goal = null;

  @JsonProperty("preApproveId")
  private String preApproveId = null;

  @JsonProperty("question")
  private String question = null;

  @JsonProperty("answerOption1")
  private String answerOption1 = null;

  @JsonProperty("answerOption2")
  private String answerOption2 = null;

  @JsonProperty("answerOption3")
  private String answerOption3 = null;

  @JsonProperty("answerOption4")
  private String answerOption4 = null;

  @JsonProperty("answerOption5")
  private String answerOption5 = null;

  public BrandLiftServiceQuestion questionId(Long questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * <div lang=\"ja\">調査IDです。</div> <div lang=\"en\">Question ID. </div> 
   * @return questionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">調査IDです。</div> <div lang=\"en\">Question ID. </div> ")


  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public BrandLiftServiceQuestion goal(BrandLiftServiceGoal goal) {
    this.goal = goal;
    return this;
  }

  /**
   * Get goal
   * @return goal
  */
  @ApiModelProperty(value = "")

  @Valid

  public BrandLiftServiceGoal getGoal() {
    return goal;
  }

  public void setGoal(BrandLiftServiceGoal goal) {
    this.goal = goal;
  }

  public BrandLiftServiceQuestion preApproveId(String preApproveId) {
    this.preApproveId = preApproveId;
    return this;
  }

  /**
   * <div lang=\"ja\">事前承認IDです。</div> <div lang=\"en\">Preapprove ID. </div> 
   * @return preApproveId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">事前承認IDです。</div> <div lang=\"en\">Preapprove ID. </div> ")


  public String getPreApproveId() {
    return preApproveId;
  }

  public void setPreApproveId(String preApproveId) {
    this.preApproveId = preApproveId;
  }

  public BrandLiftServiceQuestion question(String question) {
    this.question = question;
    return this;
  }

  /**
   * <div lang=\"ja\">設問です。</div> <div lang=\"en\">Question. </div> 
   * @return question
  */
  @ApiModelProperty(value = "<div lang=\"ja\">設問です。</div> <div lang=\"en\">Question. </div> ")


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public BrandLiftServiceQuestion answerOption1(String answerOption1) {
    this.answerOption1 = answerOption1;
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢1です。</div> <div lang=\"en\">Answer Option1. </div> 
   * @return answerOption1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢1です。</div> <div lang=\"en\">Answer Option1. </div> ")


  public String getAnswerOption1() {
    return answerOption1;
  }

  public void setAnswerOption1(String answerOption1) {
    this.answerOption1 = answerOption1;
  }

  public BrandLiftServiceQuestion answerOption2(String answerOption2) {
    this.answerOption2 = answerOption2;
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢2です。</div> <div lang=\"en\">Answer Option2. </div> 
   * @return answerOption2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢2です。</div> <div lang=\"en\">Answer Option2. </div> ")


  public String getAnswerOption2() {
    return answerOption2;
  }

  public void setAnswerOption2(String answerOption2) {
    this.answerOption2 = answerOption2;
  }

  public BrandLiftServiceQuestion answerOption3(String answerOption3) {
    this.answerOption3 = answerOption3;
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢3です。</div> <div lang=\"en\">Answer Option3. </div> 
   * @return answerOption3
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢3です。</div> <div lang=\"en\">Answer Option3. </div> ")


  public String getAnswerOption3() {
    return answerOption3;
  }

  public void setAnswerOption3(String answerOption3) {
    this.answerOption3 = answerOption3;
  }

  public BrandLiftServiceQuestion answerOption4(String answerOption4) {
    this.answerOption4 = answerOption4;
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢4です。</div> <div lang=\"en\">Answer Option4. </div> 
   * @return answerOption4
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢4です。</div> <div lang=\"en\">Answer Option4. </div> ")


  public String getAnswerOption4() {
    return answerOption4;
  }

  public void setAnswerOption4(String answerOption4) {
    this.answerOption4 = answerOption4;
  }

  public BrandLiftServiceQuestion answerOption5(String answerOption5) {
    this.answerOption5 = answerOption5;
    return this;
  }

  /**
   * <div lang=\"ja\">回答選択肢5です。</div> <div lang=\"en\">Answer Option5. </div> 
   * @return answerOption5
  */
  @ApiModelProperty(value = "<div lang=\"ja\">回答選択肢5です。</div> <div lang=\"en\">Answer Option5. </div> ")


  public String getAnswerOption5() {
    return answerOption5;
  }

  public void setAnswerOption5(String answerOption5) {
    this.answerOption5 = answerOption5;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandLiftServiceQuestion brandLiftServiceQuestion = (BrandLiftServiceQuestion) o;
    return Objects.equals(this.questionId, brandLiftServiceQuestion.questionId) &&
        Objects.equals(this.goal, brandLiftServiceQuestion.goal) &&
        Objects.equals(this.preApproveId, brandLiftServiceQuestion.preApproveId) &&
        Objects.equals(this.question, brandLiftServiceQuestion.question) &&
        Objects.equals(this.answerOption1, brandLiftServiceQuestion.answerOption1) &&
        Objects.equals(this.answerOption2, brandLiftServiceQuestion.answerOption2) &&
        Objects.equals(this.answerOption3, brandLiftServiceQuestion.answerOption3) &&
        Objects.equals(this.answerOption4, brandLiftServiceQuestion.answerOption4) &&
        Objects.equals(this.answerOption5, brandLiftServiceQuestion.answerOption5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, goal, preApproveId, question, answerOption1, answerOption2, answerOption3, answerOption4, answerOption5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLiftServiceQuestion {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    preApproveId: ").append(toIndentedString(preApproveId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answerOption1: ").append(toIndentedString(answerOption1)).append("\n");
    sb.append("    answerOption2: ").append(toIndentedString(answerOption2)).append("\n");
    sb.append("    answerOption3: ").append(toIndentedString(answerOption3)).append("\n");
    sb.append("    answerOption4: ").append(toIndentedString(answerOption4)).append("\n");
    sb.append("    answerOption5: ").append(toIndentedString(answerOption5)).append("\n");
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

