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

Mobile.startExistingApplication('com.goorita.uhhmobile_apps')

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/LokasiMaklonFalse'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/TambahLokasiMaklon'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/NamaTempatProduksi'), 0)

Mobile.setText(findTestObject('Mobile/Sertifikat/Step2/NamaTempatProduksi'), 'Gudang 01', 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/PinpointLokasi'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/CariLokasi'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/TulisNamaTempat'), 0)

Mobile.setText(findTestObject('Mobile/Sertifikat/Step2/TulisNamaTempat'), 'Cikini', 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/HasilLokasiPertama (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/SimpanLokasiButton'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/SimpanPinpoint'), 0)

