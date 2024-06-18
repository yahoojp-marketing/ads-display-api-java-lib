package jp.co.yahoo.adsdisplayapi.v14.api;

import jp.co.yahoo.adsdisplayapi.v14.ApiClient;

import jp.co.yahoo.adsdisplayapi.v14.model.AppLinkServiceGetResponse;
import jp.co.yahoo.adsdisplayapi.v14.model.AppLinkServiceSelector;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("jp.co.yahoo.adsdisplayapi.v14.api.AppLinkServiceApi")
public class AppLinkServiceApi {
    private ApiClient apiClient;

    public AppLinkServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppLinkServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ連携に関する情報の取得を行います。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLinkService retrieves the app link information.&lt;/div&gt; 
     * <p><b>503</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0099&lt;/td&gt;&lt;td&gt;Out of service.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;APIがメンテナンス中、またはご利用できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;API is under maintenance or not available to use.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>500</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0002&lt;/td&gt;&lt;td&gt;An internal error has occurred.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;内部エラーが発生しました。再度操作を実行してください。 &lt;br&gt;もし、問題が解決しない場合は、お問い合わせページをご利用ください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;An internal error has occurred. Please try again later. &lt;br&gt;If the problem continues, please contact the support team via Inquiry page for assistance. &lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>403</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0098&lt;/td&gt;&lt;td&gt;Permission denied.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;権限がありません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Permission denied.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0003&lt;/td&gt;&lt;td&gt;Frequency limit exceeded. Please try your request again later&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセス頻度が上限値に達しました。時間をおいて再度実行してください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Frequency limit exceeded. Please try your request again later.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>401</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0110&lt;/td&gt;&lt;td&gt;Require access token.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンがリクエストヘッダに存在していません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;There is no access token in the request header.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0111&lt;/td&gt;&lt;td&gt;Authentication failed.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンの認証に失敗しました。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token authentication failed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0112&lt;/td&gt;&lt;td&gt;Account not found.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが見つかりませんでした。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account can not found.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0113&lt;/td&gt;&lt;td&gt;Deactivated account.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account is deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>400</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0114&lt;/td&gt;&lt;td&gt;Invalid scope.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>200</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0001&lt;/td&gt;&lt;td&gt;Invalid Request.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;さまざまな要因が考えられます。&lt;br&gt;主な要因は、パラメータの値が不正か、誤りがあるためにオペレーションが完了できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;This error can result for a variety of reasons. &lt;br&gt;Typically because one of the parameter values in the request is wrong or invalid and the operation cannot be completed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;R0001&lt;/td&gt;&lt;td&gt;Require.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;必須です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;It is missing required parameter.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;V0001&lt;/td&gt;&lt;td&gt;Invalid value.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値が無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;I0001&lt;/td&gt;&lt;td&gt;Deactivated Id.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;IDが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The ID is Deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;L0002&lt;/td&gt;&lt;td&gt;Over list size.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;配列の要素数が上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of elements in the array exceeds the upper limit.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;D0001&lt;/td&gt;&lt;td&gt;Duplicate.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;一意な値が重複しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The unique value is duplicated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;120020&lt;/td&gt;&lt;td&gt;Can not set value.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値を設定することができません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Value cannot be set.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;F0001&lt;/td&gt;&lt;td&gt;Invalid format.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値の形式が不正です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value format is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;LT001&lt;/td&gt;&lt;td&gt;Over limit.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録できる上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The upper limit value that can be registered is exceeded.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;RL001&lt;/td&gt;&lt;td&gt;Invalid relation.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;リクエストの関連性が矛盾しています。&lt;br&gt; たとえば、開始＞終了の日付指定を行なっているなど&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The relation of the request is contradictory.&lt;br&gt; For example, you are specifying the date of start &gt; end.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * @param xZBaseAccountId &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDを指定してください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Specify Account ID.&lt;/div&gt;  (required)
     * @param appLinkServiceSelector  (optional)
     * @return AppLinkServiceGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppLinkServiceGetResponse appLinkServiceGetPost(Long xZBaseAccountId, AppLinkServiceSelector appLinkServiceSelector) throws RestClientException {
        return appLinkServiceGetPostWithHttpInfo(xZBaseAccountId, appLinkServiceSelector).getBody();
    }

    /**
     * 
     * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ連携に関する情報の取得を行います。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLinkService retrieves the app link information.&lt;/div&gt; 
     * <p><b>503</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0099&lt;/td&gt;&lt;td&gt;Out of service.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;APIがメンテナンス中、またはご利用できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;API is under maintenance or not available to use.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>500</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0002&lt;/td&gt;&lt;td&gt;An internal error has occurred.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;内部エラーが発生しました。再度操作を実行してください。 &lt;br&gt;もし、問題が解決しない場合は、お問い合わせページをご利用ください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;An internal error has occurred. Please try again later. &lt;br&gt;If the problem continues, please contact the support team via Inquiry page for assistance. &lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>403</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0098&lt;/td&gt;&lt;td&gt;Permission denied.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;権限がありません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Permission denied.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0003&lt;/td&gt;&lt;td&gt;Frequency limit exceeded. Please try your request again later&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセス頻度が上限値に達しました。時間をおいて再度実行してください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Frequency limit exceeded. Please try your request again later.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>401</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0110&lt;/td&gt;&lt;td&gt;Require access token.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンがリクエストヘッダに存在していません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;There is no access token in the request header.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0111&lt;/td&gt;&lt;td&gt;Authentication failed.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンの認証に失敗しました。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token authentication failed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0112&lt;/td&gt;&lt;td&gt;Account not found.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが見つかりませんでした。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account can not found.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0113&lt;/td&gt;&lt;td&gt;Deactivated account.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account is deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>400</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0114&lt;/td&gt;&lt;td&gt;Invalid scope.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>200</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0001&lt;/td&gt;&lt;td&gt;Invalid Request.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;さまざまな要因が考えられます。&lt;br&gt;主な要因は、パラメータの値が不正か、誤りがあるためにオペレーションが完了できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;This error can result for a variety of reasons. &lt;br&gt;Typically because one of the parameter values in the request is wrong or invalid and the operation cannot be completed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;R0001&lt;/td&gt;&lt;td&gt;Require.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;必須です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;It is missing required parameter.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;V0001&lt;/td&gt;&lt;td&gt;Invalid value.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値が無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;I0001&lt;/td&gt;&lt;td&gt;Deactivated Id.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;IDが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The ID is Deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;L0002&lt;/td&gt;&lt;td&gt;Over list size.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;配列の要素数が上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of elements in the array exceeds the upper limit.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;D0001&lt;/td&gt;&lt;td&gt;Duplicate.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;一意な値が重複しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The unique value is duplicated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;120020&lt;/td&gt;&lt;td&gt;Can not set value.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値を設定することができません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Value cannot be set.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;F0001&lt;/td&gt;&lt;td&gt;Invalid format.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値の形式が不正です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value format is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;LT001&lt;/td&gt;&lt;td&gt;Over limit.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録できる上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The upper limit value that can be registered is exceeded.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;RL001&lt;/td&gt;&lt;td&gt;Invalid relation.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;リクエストの関連性が矛盾しています。&lt;br&gt; たとえば、開始＞終了の日付指定を行なっているなど&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The relation of the request is contradictory.&lt;br&gt; For example, you are specifying the date of start &gt; end.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * @param xZBaseAccountId &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDを指定してください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Specify Account ID.&lt;/div&gt;  (required)
     * @param appLinkServiceSelector  (optional)
     * @return ResponseEntity&lt;AppLinkServiceGetResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppLinkServiceGetResponse> appLinkServiceGetPostWithHttpInfo(Long xZBaseAccountId, AppLinkServiceSelector appLinkServiceSelector) throws RestClientException {
        Object postBody = appLinkServiceSelector;
        
        // verify the required parameter 'xZBaseAccountId' is set
        if (xZBaseAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xZBaseAccountId' when calling appLinkServiceGetPost");
        }
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xZBaseAccountId != null)
        headerParams.add("x-z-base-account-id", apiClient.parameterToString(xZBaseAccountId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oAuth" };

        ParameterizedTypeReference<AppLinkServiceGetResponse> returnType = new ParameterizedTypeReference<AppLinkServiceGetResponse>() {};
        return apiClient.invokeAPI("/AppLinkService/get", HttpMethod.POST, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
