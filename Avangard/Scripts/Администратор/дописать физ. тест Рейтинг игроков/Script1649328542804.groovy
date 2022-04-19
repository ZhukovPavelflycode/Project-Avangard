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

WebUI.callTestCase(findTestCase('Администратор/Авторизация админ'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Рейтинг игроков'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/rank palyer'))

not_run: WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/school rank'))

'Вводим школу'
WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/input__rank'), 
    '"Авангард" Академия')

WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/input__rank'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/team rank'))

'Вводим команду'
WebUI.setText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/input__react-select-4-input'), 
    GlobalVariable.school)

WebUI.sendKeys(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/input__react-select-4-input'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Univarsal player'), 0)

WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Univarsal player'))

'Попросить Настю добавить атрибут Фамилию к рейтингу чтобы тест написать'
WebUI.comment('')

not_run: if (WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/team rank'), 
    'Авангард-2005', FailureHandling.OPTIONAL) == true) {
    WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Vlasenko rank'), 
        0)

    point = WebUI.getText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/grade points rank'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Vlasenko rank'))
} else {
    WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Ganin rank'), 0)

    point = WebUI.getText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/grade points rank'), 
        FailureHandling.STOP_ON_FAILURE)

    'Открываем детальный рейтинг игрока'
    WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Ganin rank'))
}

not_run: WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/grade points rank'), 
    point)

'Дописать проверки на физ. тестирование'
not_run: WebUI.comment('')

'Вкладка Оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/button grade skill rank'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/Etap 1 rank'), 
    'Этап №1')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/speed rank'), 'Ускорение')

'Вкладка Игровая статистика'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/button game stat rank'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/math rank'), 'Матчи')

WebUI.verifyElementVisible(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/grade math rank'))

'Вкладка Оценка игры'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/button grade game tank'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Рейтинг игроков)/average grade rank'), 
    'СРЕДНЯЯ ОЦЕНКА')

