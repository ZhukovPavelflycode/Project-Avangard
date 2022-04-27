import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Менеджер (старый архив)/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('manager/staff/Page_/staff'))

WebUI.click(findTestObject('manager/staff/Page_/ageev'))

'агеев\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('manager/staff/Page_/button_'))

WebUI.verifyElementVisible(findTestObject('manager/staff/Page_/div__sc-gzVnrw kaPVmr'))

WebUI.click(findTestObject('manager/staff/Page_/alikov'))

'аликов'
WebUI.takeScreenshot()

WebUI.click(findTestObject('manager/staff/Page_/button_'))

WebUI.click(findTestObject('manager/staff/Page_/add'))

WebUI.click(findTestObject('manager/staff/Page_/div__sidebar__overlay sidebar__overlay_visible'))

WebUI.closeBrowser()

