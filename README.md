# Yahoo! JAPAN Ads Display Ads API Client Library for Java

## 概要

このライブラリは、Javaを使用して各APIを呼び出すクライアントが含まれています。

## 必須環境

* Java 17+
* Maven 3.9.0+

## 利用方法

### Installation

pom.xmlに下記の記述をしてください。
```xml
...
<dependency>
  <groupId>jp.co.yahoo.api-ads</groupId>
  <artifactId>ads-display-api-lib</artifactId>
  <version>x.y.z</version>
</dependency>
...
```
versionはこちらを参照してください。https://mvnrepository.com/artifact/jp.co.yahoo.api-ads/ads-display-api-lib

### Set Up Authentication

クライアントID、クライアントシークレット、リフレッシュトークンを指定してクライアントを作成します。
```java
String clientId = "INSERT_CLIENT_ID_HERE";
String clientSecret = "INSERT_CLIENT_SECRET_HERE";
String refreshToken = "INSERT_REFRESH_TOKEN_HERE";
YahooJapanAdsApiClient yahooJapanAdsApiClient = new YahooJapanAdsApiClient(clientId, clientSecret, refreshToken);
```
それぞれの値はこちらを参照してください。https://ads-developers.yahoo.co.jp/ja/ads-api/startup-guide/api-call.html

### アカウントの取得(AccountService/get)

```Java
// Get the AccountService.
AccountServiceApi accountService = new AccountServiceApi(yahooJapanAdsApiClient);

// Create the AccountServiceSelector.
AccountServiceSelector accountServiceSelector = new AccountServiceSelector();

// Get the account.
AccountServiceGetResponse accountServiceGetResponse = accountService.accountServiceGetPost(accountServiceSelector);
```

### レポートのダウンロード(ReportDefinitionService/add, ReportDefinitionService/download) 

```java
// Get the ReportDefinitionService.
ReportDefinitionServiceApi reportDefinitionService = new ReportDefinitionServiceApi(yahooJapanAdsApiClient);

// Create the ReportDefinitionServiceOperation.
ReportDefinition reportDefinition = new ReportDefinition();
reportDefinition.setReportDateRangeType(ReportDefinitionServiceReportDateRangeType.LAST_7_DAYS);
reportDefinition.addFieldsItem("ACCOUNT_ID");
reportDefinition.addFieldsItem("ACCOUNT_NAME");

ReportDefinitionServiceOperation reportDefinitionServiceOperation = new ReportDefinitionServiceOperation();
reportDefinitionServiceOperation.setAccountId(INSERT_ACCOUNT_ID_HERE);
reportDefinitionServiceOperation.addOperandItem(reportDefinition);

// Create the Report.
ReportDefinitionServiceMutateResponse reportDefinitionServiceMutateResponse = reportDefinitionService.reportDefinitionServiceAddPost(reportDefinitionServiceOperation);

// Wait for the report to be completed.

// Create the ReportDefinitionServiceDownloadSelector.
Long reportJobId = reportDefinitionServiceMutateResponse.getRval().getValues().get(0).getReportDefinition().getReportJobId();

ReportDefinitionServiceDownloadSelector reportDefinitionServiceDownloadSelector = new ReportDefinitionServiceDownloadSelector();
reportDefinitionServiceDownloadSelector.setAccountId(INSERT_ACCOUNT_ID_HERE);
reportDefinitionServiceDownloadSelector.setReportJobId(reportJobId);

// Get the report.
Resource report = reportDefinitionService.reportDefinitionServiceDownloadPost(reportDefinitionServiceDownloadSelector);
```

### ビデオのアップロード(VideoService/upload)

```java
// Get the VideoService.
VideoServiceApi videoService = new VideoServiceApi(yahooJapanAdsApiClient);

// Create the Parameter of VideoService.
Long accountId = INSERT_ACCOUNT_ID_HERE;
String videoName = "INSERT_VIDEO_NAME_HERE";
String videoTitle = "INSERT_VIDEO_TITLE_HERE";
VideoServiceUserStatus userStatus = VideoServiceUserStatus.ACTIVE; // Specify the userStatus.

// Create the Request body of VideoService.
Resource file = new FileSystemResource("/path/to/video.mp4");

// Upload the video.
VideoServiceUploadResponse videoServiceUploadResponse = videoService.videoServiceUploadPost(accountId, videoName, videoTitle, userStatus, file);
```

### オーディエンスリストのアップロード(AudienceListService/uploadUserList)

```java
// Get the AudienceListService.
AudienceListServiceApi audienceListService = new AudienceListServiceApi(yahooJapanAdsApiClient);

// Create the Parameter of AudienceListService.
Long accountId = INSERT_ACCOUNT_ID_HERE;
String retargetingTagId = "INSERT_RETARGETING_TAG_ID_HERE";
Long audienceListId = INSERT_AUDIENCE_LIST_ID_HERE;
AudienceListServiceUploadUserListUploadType uploadType = AudienceListServiceUploadUserListUploadType.CUSTOM_UID_KEY; // Specify the uploadType.
AudienceListServiceUploadUserListCompressType compressType = AudienceListServiceUploadUserListCompressType.NONE; // Specify the compressType.
String customUidKey = "INSERT_CUSTOM_UID_KEY_HERE";
String customEntityId = "INSERT_CUSTOM_ENTITY_ID_HERE";

// Create the Request body of AudienceListService.
Resource file = new FileSystemResource("/path/to/userlist.txt");

// Upload the audienceList.
AudienceListServiceUploadUserListResponse audienceListServiceUploadUserListResponse = audienceListService.audienceListServiceUploadUserListPost(accountId, retargetingTagId, audienceListId, uploadType, compressType, customUidKey, customEntityId, file); 
```

### Retry Settings
アクセストークン更新時のコール単位でリトライの設定を  
デフォルトから変更するにはシステムプロパティを使用します。
```java
System.setProperty("jp.co.yahoo.adsdisplayapi.oauth2.retry.max_attempts", "3");
System.setProperty("jp.co.yahoo.adsdisplayapi.oauth2.retry.initial_interval", "1000");
System.setProperty("jp.co.yahoo.adsdisplayapi.oauth2.retry.multiplier", "2");
System.setProperty("jp.co.yahoo.adsdisplayapi.oauth2.retry.max_interval", "2000");
```
リトライをしない場合は下記のように設定します。
```java
System.setProperty("jp.co.yahoo.adsdisplayapi.oauth2.retry.max_attempts", "1");
```

## ご注意：Yahoo!広告 ディスプレイ広告 API - ライブラリの利用に関して

LINEヤフー株式会社の提供するAPIに関するライブラリは、別途LINEヤフー株式会社との間で締結いただいた当該APIの提供に関する契約に基づき、APIユーザー様に提供されるものであり、LINEヤフー株式会社との間で当該契約を締結いただいていない場合は、ライブラリをご利用いただけません。  
また、APIユーザー様に予め通知することなく、ライブラリの内容や仕様の変更または提供の停止もしくは中止をする場合があります。ご了承のうえご利用ください。  
