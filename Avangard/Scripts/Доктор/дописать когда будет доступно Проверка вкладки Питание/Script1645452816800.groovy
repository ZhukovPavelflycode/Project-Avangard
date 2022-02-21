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

'Вкладка питание'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/IMT'))

'Поле школы'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/school'))

'Выбор школы'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/div_ (2)'))

'Поле команда'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/team'))

'Выбор команды'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/OYA'))

'Нажать редактировать'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/edit'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/vrach/imt/Page_/trikozov'), 0)

'Добавить рацион Ганин'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/trikozov'))

'Открыть бургер меню типа рекомендации'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/recomend'))

'С повышенным добавлением углеродов'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/tiprecomend'))

'Добавить задачу'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/addtask'))

'Ввод текста'
WebUI.setText(findTestObject('Object Repository/vrach/imt/Page_/input_ _sc-eqIVtm fYABJt'), 'автотест проверка рекомендации')

WebUI.scrollToElement(findTestObject('Object Repository/vrach/imt/Page_/save'), 0)

'Сохранение'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/save'))

'Проверка'
WebUI.verifyTextPresent('Рекомендация успешно добавлена', true, FailureHandling.STOP_ON_FAILURE)

'Переход на главную'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/home'))

'Выход'
WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/exit'))

'Авторизация за игрока (Ганин)'
WebUI.callTestCase(findTestCase('Игрок/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/p_  _1'))

WebUI.verifyTextPresent('автотест проверка рекомендации', true)

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/close11'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/exit'))

WebUI.callTestCase(findTestCase('Доктор/Авторизация врач'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/IMT'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/school'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/div_ (2)'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/team'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/OYA'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/edit'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/trokoz1'))

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/deleteracion'))

WebUI.verifyTextPresent('Рекомендация успешно удалена', false)

WebUI.click(findTestObject('Object Repository/vrach/imt/Page_/home'))

WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('Игрок/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyTextNotPresent('автотест проверка ИМТ', false, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser()

