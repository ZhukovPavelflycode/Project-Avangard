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

'переход на вкладку рейтинг игроков'
WebUI.click(findTestObject('Object Repository/admin/rating/grating'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '34.jpg')

'выбор школы'
WebUI.click(findTestObject('Object Repository/admin/Page_/shkool'))

WebUI.click(findTestObject('Object Repository/admin/Page_/div_ (2)'))

'выбор команды'
WebUI.click(findTestObject('Object Repository/admin/Page_/team'))

WebUI.click(findTestObject('Object Repository/admin/Page_/omsk'))

'выбор игрока (Давыдов Тимофей) '
WebUI.scrollToElement(findTestObject('Object Repository/admin/Page_/top1'), 0)

'выбор игрока (Давыдов Тимофей) '
WebUI.click(findTestObject('Object Repository/admin/Page_/top1'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '37.jpg', FailureHandling.CONTINUE_ON_FAILURE)

'просмотр владки оценка навыков'
WebUI.click(findTestObject('Object Repository/admin/Page_/skill'))

WebUI.verifyTextPresent('Ускорение', true)

WebUI.verifyTextPresent('Скорость', true)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '39.jpg', FailureHandling.CONTINUE_ON_FAILURE)

'просмотр владки игровой статистики'
WebUI.click(findTestObject('Object Repository/admin/Page_/stat'))

WebUI.verifyTextPresent('Матчи', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Ранг', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '40.jpg', FailureHandling.CONTINUE_ON_FAILURE)

'просмотр владки физ тестирования '
WebUI.click(findTestObject('Object Repository/admin/Page_/ptest'))

WebUI.verifyTextPresent('СРЕДНЯЯ ОЦЕНКА', true)

WebUI.verifyTextPresent('Список навыков и характеристики', true)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '38.jpg', FailureHandling.CONTINUE_ON_FAILURE)

'переход в главное меню'
WebUI.click(findTestObject('Object Repository/admin/Page_/root'))

'конец теста'
WebUI.closeBrowser()

