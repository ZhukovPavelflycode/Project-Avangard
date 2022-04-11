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

'Вкладка отчеты'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Отчеты по навыкам)/span_reports'))

'Отчет по навыкам'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Отчеты по навыкам)/div_report_skills'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Отчеты по навыкам)/div_8'), '8')

'Проверка имени'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Игрок)/Case (Отчеты по навыкам)/div_name'), 
    GlobalVariable.player_for_test)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Case (Отчеты по навыкам)/speed'), 'Скорость')

