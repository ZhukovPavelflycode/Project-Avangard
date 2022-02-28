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

'Вкладка Питание'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/span_pitanie'))

'Поле введите школу'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/place_choose school'))

'Выбор Авангард'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/div_Avangard'))

'Поле ввода команды'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/place choose team'))

'Ввести Омские Ястребы'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/div_omsk'))

'Нажать кнопку редактровать'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_edit'))

'Добавить рацион Ганину'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/span_add'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/div_place recomendation1'))

'Выбрать углеводы'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/div__uglevodi1'))

WebUI.setText(findTestObject('Page_/body_1'), 'автотест питания1')

'Кнопка добавить задачу'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_task'))

'Ввод текста'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/input_task'), 'автотест питания')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_save'), 0)

'Сохраняет рацион'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_save'))

'Проверка сохранения'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/alert verif'), 'Рекомендация успешно добавлена')

'Переход на главную'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/span_home'))

'Проверки за игрока'
not_run: WebUI.callTestCase(findTestCase('Игрок/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'КОГДА БУДЕТ ГОТОВ БЛОК РЕКОМЕНДАЦИЙ НА ДАШБОРДЕ НАДО ДОПИСАТЬ ТЕСТ ПРОВЕРКУ '
not_run: WebUI.comment('')

WebUI.callTestCase(findTestCase('Тренер/Рекомендации (переиспользуется в проверке Питания у доктора)'), [:], FailureHandling.STOP_ON_FAILURE)

'Удаление рациона за врача'
WebUI.callTestCase(findTestCase('Доктор/Авторизация врач'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Питание'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/span_pitanie'))

'Поле введите школу'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/place_choose school'))

'Выбор Авангард'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/div_Avangard'))

'Поле ввода команды'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/place choose team'))

'Ввести Омские Ястребы'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/div_omsk'))

'Нажать кнопку редактровать'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_edit'))

'Кнопка посмотреть '
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/span_look ganin'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_delete'), 0)

'Удаляем рацион'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/button_delete'))

'Проверяем алерт удаления'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/alert delete'), 'Рекомендация успешно удалена')

'Проверка, что пропала кнопка посмотреть рацон'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Питание)/span_add'), 'Добавить рацион')

