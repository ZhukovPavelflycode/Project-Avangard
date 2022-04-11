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

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/span_'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/ganin player'), 'Ганин')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/bulavchuk player'), 'Булавчук')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/Kocubailo  palyer'), 'Коцюбайло')

not_run: WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/leuka palayer'), 'Леука')

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/home palyer ganin'))

WebUI.closeBrowser()

