--------------------------------
【概要】
--------------------------------
このライブラリは、Javaを使用して各APIを呼び出す際に利用するエンティティ(model)が含まれています。

--------------------------------
【必須環境】
--------------------------------
* Java 1.8+
* Maven 3.0+

--------------------------------
【利用方法】
--------------------------------
pom.xmlに下記の記述をしてください。

```xml
...
<repositories>
  <repository>
    <id>ads-display-api-lib</id>
    <url>https://raw.githubusercontent.com/yahoojp-marketing/ads-display-api-java-lib/mvn-repo</url>
  </repository>
</repositories>
...
<dependency>
  <groupId>jp.co.yahoo</groupId>
  <artifactId>ads-display-api-lib</artifactId>
  <version>0.0.1</version>
</dependency>
...
```

--------------------------------
ご注意：Yahoo!広告 ディスプレイ広告 API - ライブラリの利用に関して
--------------------------------

Yahoo! JAPANの提供するAPIに関するライブラリは、別途Yahoo! JAPANとの間で締結いただいた当該APIの提供に関する契約に基づき、APIユーザー様に提供されるものであり、Yahoo! JAPANとの間で当該契約を締結いただいていない場合は、ライブラリをご利用いただけません。  
また、APIユーザー様に予め通知することなく、ライブラリの内容や仕様の変更または提供の停止もしくは中止をする場合があります。ご了承のうえご利用ください。  