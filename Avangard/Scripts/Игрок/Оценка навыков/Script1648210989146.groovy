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

WebUI.callTestCase(findTestCase('Игрок/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/skill'))

'Установить оценку 1 в ускорении'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Оценка навыков)/span_1'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/fast fast'), 'Ускорение')

WebUI.scrollToElement(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/button_save'), 0)

'Сохранить'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/button_save'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/alert skill'), 'Оценки успешно сохранены.')

'Вкладка Отчеты'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Оценка навыков)/report'))

'Отчеты по навыкам'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Оценка навыков)/repor skill'))

'Проверка оценки 1'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/div_1'), '1')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/div_katanie'), 'Катание')

'Вкладка оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/skill'))

'Поставить оценку 8'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Оценка навыков)/span_8'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/button_save'), 0)

'Сохранить'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/button_save'))

'Проверить алерт'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Оценка навыков)/alert skill'), 'Оценки успешно сохранены.')

WebUI.closeBrowser()

