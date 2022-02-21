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

WebUI.callTestCase(findTestCase('Администратор/Отчет для тк'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/reports/skill/Page_/div_'))

WebUI.verifyTextPresent('ОТЧЕТ ПО ОЦЕНКЕ НАВЫКОВ', true)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '25.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/admin/reports/skill/Page_/input_ _react-select-3-input'), 'фоку')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/skill/Page_/input_ _react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/skill/Page_/input__react-select-5-input'), GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/skill/Page_/input__react-select-5-input'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/reports/skill/Page_/div_ 20-21'))

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/reports/skill/Page_/div_ 01.09.202001.11.2020    6.86.86.86.8 7_6415ae'))

WebUI.verifyTextPresent('1 В 1 В ОБОРОНЕ', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '26.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/Page_/root'))

WebUI.closeBrowser()

