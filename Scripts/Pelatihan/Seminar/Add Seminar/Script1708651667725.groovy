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

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/p_Pelatihan'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/p_Seminar'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/button_Buat Seminar'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_JudulNama Seminar_title'), 
    'Menjadi Kebal Dalam 1 Malam')

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/Page_UHH Back Office/button_Tanggal Seminar'))

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/Page_UHH Back Office/button_27'))

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/button_Jam Seminar (Mulai)'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/button_Jam Seminar (Selesai)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/Page_UHH Back Office/div_'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/li_Product Developing'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_Jumlah Maksimal Peserta_max_quota'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_Harga_price'), 
    'IDR 500,000')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_Harga Diskon_discounted_price'), 
    'IDR 400,000')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/textarea_Ini deskripsinya'), 
    'Ini deskripsinya')

WebUI.click(findTestObject('Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/Page_UHH Back Office/div_Online'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/li_Online'))

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_Meeting ID_meeting_id'), 
    'meeting ID')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_Passcode_pass_code'), 
    'passcode')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input_Link ZoomGmeet_url'), 
    'link zoom')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/textarea_ini syaratnya'), 
    'ini syaratnya')

WebUI.setText(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/textarea_ini peraturannya'), 
    'ini peraturannya')

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/button_Pilih Pembicara'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input__PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/input__PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_UHH Back Office/Pelatihan/Seminar/Page_UHH Back Office/button_Buat Seminar_1'))

