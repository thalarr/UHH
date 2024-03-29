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

WebUI.callTestCase(findTestCase('Login/TS_LOGIN_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/p_Halal Certification'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/input__r3'), 
    GlobalVariable.AuthNama)

WebUI.sendKeys(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/input__r3'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/button_detail'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/input_Harga Sertifikasi_Harga Sertifikasi'), 
    'IDR 3,000')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/input_Pemeriksaan Kehalalan_Pemeriksaan Kehalalan'), 
    'IDR 3,000')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/input_Akomodasi_Akomodasi'), 
    'IDR 2,000')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/input_Biaya Layanan_Biaya Layanan'), 
    'IDR 2,000')

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Confirm certificate/Page_UHH Back Office/span_Submit Harga'))

