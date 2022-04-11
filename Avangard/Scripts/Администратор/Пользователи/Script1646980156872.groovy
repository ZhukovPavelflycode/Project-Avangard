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

WebUI.callTestCase(findTestCase('Администратор/Создание пользователя (переиспользуется в Пользователи)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка пользователи'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/span users'))

'Поле ввода Школа'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__scool'))

s = WebUI.getText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__academy avangard'))

'Академия Авангард'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__academy avangard'))

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/place school'), 
    s)

'Поле ввода Роль'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__role'))

r = WebUI.getText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__trainer'))

'Роль тренер'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__trainer'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/div__player'), r)

'Ввод в поиск Тарасов'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/input__Tarasov'), 
    'Test')

WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__name'), 
    'User Test')

WebUI.callTestCase(findTestCase('Администратор/Редактирование и удаление (переиспользуется в Пользователи)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

