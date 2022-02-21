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

'переход в меню "документы"\r\n\r\n'
WebUI.click(findTestObject('Avangard New/Object (Менеджер)/documents (Вкладка)'))

'ожидание загрузки страницы '
WebUI.waitForPageLoad(10)

'Нажимает на документ\r\n'
WebUI.click(findTestObject('Avangard New/Object (Менеджер)/document (Сам документ)'))

'Проверяет кликабельность кнопки скачать\r\n'
WebUI.verifyElementClickable(findTestObject('Avangard New/Object (Менеджер)/button download'))

not_run: WebUI.sendKeys(findTestObject('Avangard New/Object (Менеджер)/button download'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Avangard New/Object (Менеджер)/exit (Выход с формы)'))

'Переход на главную страницу'
WebUI.click(findTestObject('Avangard New/Object (Менеджер)/home (Главная)'))

'закрыть браузер'
WebUI.closeBrowser()

