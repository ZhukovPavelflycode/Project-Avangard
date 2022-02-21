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

WebUI.click(findTestObject('Object Repository/manager/reports/stats/Page_/div_'))

WebUI.verifyTextPresent('ОТЧЕТ ПО ОСНОВНЫМ ПОКАЗАТЕЛЯМ СТАТИСТИКИ', true)

WebUI.takeScreenshot('managerstat.jpg')

WebUI.setText(findTestObject('Object Repository/manager/reports/stats/Page_/input__react-select-2-input'), 'ака')

WebUI.sendKeys(findTestObject('Object Repository/manager/reports/stats/Page_/input__react-select-2-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/manager/reports/stats/Page_/input__react-select-3-input'), 'омс')

WebUI.sendKeys(findTestObject('Object Repository/manager/reports/stats/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Object Repository/manager/reports/stats/Page_/div_ qqq'))

WebUI.click(findTestObject('Object Repository/manager/reports/stats/Page_/div_09.10   -'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/manager/reports/stats/Page_/div_       .  09.10   -      13 047  5548  _27ca72'))

WebUI.verifyTextPresent('Броски и блокшоты в матче', true)

WebUI.verifyTextPresent('Владение шайбой при игре 5 на 5', true)

WebUI.verifyTextPresent('Средняя длина смены', true)

WebUI.verifyTextPresent('Счет матча', true)

WebUI.click(findTestObject('manager/alhimov/Page_/root'))

WebUI.closeBrowser()

