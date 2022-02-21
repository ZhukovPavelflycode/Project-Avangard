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

WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/reports/reports/report'))

WebUI.click(findTestObject('Object Repository/admin/reports/reporti/Page_/div_'))

WebUI.verifyTextPresent('ОТЧЕТ ИНДИВИДУАЛЬНОГО ПЛАНА', true)

WebUI.click(findTestObject('Object Repository/manager/Page_/season'))

WebUI.click(findTestObject('Object Repository/manager/Page_/div_ 20-21'))

WebUI.takeScreenshot('managerpl.jpg')

WebUI.setText(findTestObject('Object Repository/admin/reports/reporti/Page_/input__react-select-3-input'), 'ака')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/reporti/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/reporti/Page_/input__react-select-4-input'), 'ом')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/reporti/Page_/input__react-select-4-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/reporti/Page_/input__react-select-5-input'), GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/reporti/Page_/input__react-select-5-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/admin/reports/reporti/Page_/group'))

WebUI.click(findTestObject('Object Repository/admin/reports/reporti/Page_/mental'))

WebUI.click(findTestObject('Object Repository/manager/Page_/root'))

WebUI.closeBrowser()

