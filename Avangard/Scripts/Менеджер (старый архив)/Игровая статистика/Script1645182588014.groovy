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

WebUI.callTestCase(findTestCase('Менеджер (старый архив)/Все отчеты'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('manager/game report/Page_/stats_report'))

WebUI.takeScreenshot('managerga.jpg')

WebUI.setText(findTestObject('manager/game report/Page_/input__react-select-3-input'), 'ом')

WebUI.sendKeys(findTestObject('manager/game report/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('manager/game report/Page_/button_  (0)'))

WebUI.click(findTestObject('manager/game report/Page_/span_'))

WebUI.click(findTestObject('manager/game report/Page_/button_'))

WebUI.click(findTestObject('manager/game report/Page_/button_._react-daterange-picker__calendar-b_487f96'))

WebUI.click(findTestObject('manager/game report/Page_/button_2'))

WebUI.click(findTestObject('manager/game report/Page_/button__1_2_3'))

WebUI.click(findTestObject('manager/game report/Page_/button__1_2_3'))

WebUI.click(findTestObject('manager/game report/Page_/button__1_2_3'))

WebUI.click(findTestObject('manager/game report/Page_/button__1_2_3'))

WebUI.click(findTestObject('manager/game report/Page_/button_31'))

WebUI.verifyTextPresent('Количество матчей', true)

WebUI.verifyTextPresent('Броски в створ', true)

WebUI.takeScreenshot('managergarep.jpg')

WebUI.takeScreenshot('managergarep.jpg')

WebUI.click(findTestObject('manager/game report/Page_/root'))

WebUI.closeBrowser()

