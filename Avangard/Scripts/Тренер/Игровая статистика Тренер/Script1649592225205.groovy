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

WebUI.callTestCase(findTestCase('Тренер/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Отчеты'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/report'))

'Игровая статистика'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/game stat'))

'Ввод фильтра'
not_run: WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Сase (Игровая статистика)/input__school game stat'), 
    'Академия')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/input__school game stat'), 
    Keys.chord(Keys.ENTER))

'Ввод фильтра 2'
not_run: WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Сase (Игровая статистика)/input__team school game'), 
    GlobalVariable.school)

not_run: WebUI.sendKeys(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/input__team school game'), 
    Keys.chord(Keys.ENTER))

'Ввод фильтра 3'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/input__amplua'), 
    'Нападающий')

WebUI.sendKeys(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/input__amplua'), 
    Keys.chord(Keys.ENTER))

'Проверки ниже'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Сase (Игровая статистика)/match stat'), 'Матчи')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Сase (Игровая статистика)/game stat time'), 
    'Игр. время')

'Проверка что баллы отображается'
WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/stat mach number'))

'Проверка что оценка отображается'
WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/grade stat gamne'))

WebUI.closeBrowser()

