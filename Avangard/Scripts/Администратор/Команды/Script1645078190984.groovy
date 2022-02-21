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

'переход на вкладку команды'
WebUI.click(findTestObject('Object Repository/admin/school/Page_/Page_/teams'))

'сделать скриншот'
WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '4.jpg')

'выбор команды ( Омские Ястребы) '
WebUI.scrollToElement(findTestObject('Object Repository/admin/school/Page_/Page_/td_'), 0)

'выбор команды ( Омские Ястребы) '
WebUI.click(findTestObject('Object Repository/admin/school/Page_/Page_/td_'))

'сделать скриншот\r\n'
WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '5.jpg')

WebUI.verifyTextPresent('ИНФОРМАЦИЯ О КОМАНДЕ', false)

'просмотр вкладок (Все игроки)'
WebUI.click(findTestObject('Object Repository/admin/school/Page_/Page_/all'))

WebUI.click(findTestObject('Object Repository/admin/school/Page_/Page_/game-estimation'))

WebUI.verifyTextPresent('ОЦЕНКА ИГРЫ ПО АМПЛУА', false)

WebUI.verifyTextPresent('ОЦЕНКА ИГРЫ ПО КОМАНДЕ', false)

WebUI.click(findTestObject('Object Repository/admin/school/Page_/Page_/lesson'))

WebUI.verifyTextPresent('ДОБАВИТЬ МЕРОПРИЯТИЕ', false)

'переход на главную'
WebUI.click(findTestObject('Object Repository/admin/school/Page_/Page_/div_'))

'конец теста'
WebUI.closeBrowser()

