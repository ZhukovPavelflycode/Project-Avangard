<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>api</name>
   <tag></tag>
   <elementGuidId>35e0012b-6c61-4f31-b3eb-ca4b17a252a7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;username\&quot;:\&quot;idrisov.re@hc-avangard.com\&quot;,\&quot;password\&quot;:\&quot;!rrdT$a76Mf#MbG757SfBP\&quot;,\&quot;_method\&quot;:\&quot;GET\&quot;,\&quot;_ApplicationId\&quot;:\&quot;h1QhtsSjeoyQSa8RDQBDPvgbnI7Ix6nadHTsepwN\&quot;,\&quot;_JavaScriptKey\&quot;:\&quot;Ci34OXCgbv7TuVOiUJFOmoSwULbC7JRnxvFaT1ZI\&quot;,\&quot;_ClientVersion\&quot;:\&quot;js2.18.0\&quot;,\&quot;_InstallationId\&quot;:\&quot;49afc3ad-6189-4d0d-8278-ac436f26980a\&quot;} ${ALLTIME}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://stars-back-stage.hawk.ru:8080/statistics?metric=all&amp;schoolId=ITfD4PL0oy&amp;teamId=xFYFg1YBns&amp;seasonId=793&amp;timeStart=2020-09-01&amp;timeEnd=2021-04-14&amp;hockeyRole=defenseman</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()




</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
