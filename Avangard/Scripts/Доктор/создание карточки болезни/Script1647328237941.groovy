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

WebUI.callTestCase(findTestCase('Доктор/Авторизация врач'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_add'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/school'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/avanguard'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/team'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/var_team'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/player'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/var_player'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/tip'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/travma'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/stady 1'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/choise_stady'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/tip travm'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/choise_travm'))

WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/dop opisanie'), 'автотестирование ')

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_save'))

WebUI.verifyTextPresent('Карточка успешно сохранена', false)

WebUI.callTestCase(findTestCase('Доктор/Проверка в профиле статуса (переиспользуется в Создание карточки болезни)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Доктор/Вкладки удаление (переиспользуется в Создание карточки болезни)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Доктор/Проверка доступности игрока (переиспользуется Создание карточки болезни)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

