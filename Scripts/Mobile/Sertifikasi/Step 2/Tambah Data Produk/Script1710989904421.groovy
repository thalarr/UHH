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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

Mobile.startExistingApplication('com.goorita.uhhmobile_apps')

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/TambahDataProduk'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/NamaProduk'), 0)

Mobile.setText(findTestObject('Mobile/Sertifikat/Step2/NamaProduk'), 'Caramel', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/JenisProduk2'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/JenisProduk.value1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/Simpan.Botton'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/DeskripsiProduk'), 0)

Mobile.setText(findTestObject('Mobile/Sertifikat/Step2/DeskripsiProduk'), 'Ini adalah gura aren terbaik se indonesia', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/JmlBahanBaku'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))

driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/Kapasitas'), 0)

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/Satuan'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/Satuan.kg'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/Simpan.Botton'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step2/SimpanProduk.Botton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mobile/Sertifikasi/Step 2/Tambah Lokasi Produksi'), [:], FailureHandling.STOP_ON_FAILURE)

