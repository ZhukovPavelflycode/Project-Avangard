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

WebUI.callTestCase(findTestCase('Тренер/Авторизация тренер'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Рекомендации'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/span_recomendation'))

'Ввод текста\r\n'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/input__react-select-4-input'), GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/input__react-select-4-input'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/eat'), 'Корректировки в питании')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/sport'), 'Физическая подготовка')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/health'), 'Восстановление (болезнь/травма)')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/job'), 'Работа с навыками')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/psixolog job'), 
    'Психологическая работа')

'Проверка названия рекомендации'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/name_recomend'), 
    'автотест питания1')

'Кнопка подробнее'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/button_podrobnee'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/name rec'), 'автотест питания1')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/tast name'), 
    'автотест питания')

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/button_close'))

'Закрытие всплывашки у доктора в рационе питания'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации)/button_your approved domains_tox-notificati_9cc765'))

