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

'Выбор отчета психофиз'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/psyxofiz report'))

'Проверка названия отчета'
WebUI.verifyTextPresent('ОТЧЕТ ПСИХОЛОГИЧЕСКОГО ПРОФИЛЯ', true)

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/scool'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/div_'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/team'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/oya'))

'заполнение фильтров'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (проверка вкладки питание)/input__ganin'), GlobalVariable.player_for_test)

'заполнение фильтров'
WebUI.sendKeys(findTestObject('Object Repository/admin/Global player'), Keys.chord(Keys.ENTER))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/season'))

'заполнение фильтров'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/div_21-22'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Администратор)/name (Реакция на сложный стимул)'), 
    0)

WebUI.verifyTextPresent('Реакция на сложный стимул', false)

WebUI.verifyTextPresent('Реакция на простой стимул', false)

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/season (1)'), 
    0)

'Нажать на вкладку индивидуально-тополигический'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/topologic'))

'Нажимаю на поле сезон'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/season (1)'))

'Выбираю сезон'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/20-21'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Администратор)/name (Спонтанность)'), 0)

WebUI.verifyTextPresent('Спонтанность', false)

WebUI.verifyTextPresent('Стеничность', false)

WebUI.verifyTextPresent('Экстраверсия', false)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '50.jpg')

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (проверка вкладки питание)/root'))

WebUI.closeBrowser()

