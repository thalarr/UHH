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

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/TambahDataKaryawanBotton'), 0)

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/NamaKaryawan'), 0)

Mobile.setText(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/NamaKaryawan'), 'Imam Thalar', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/JabatanKaryawan'), 0)

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/Pimpinan'), 0)

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/EmailKaryawan'), 0)

Mobile.setText(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/EmailKaryawan'), 'thalarr@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/NomotKTP'), 0)

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))

driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/NoHPKaryawan'), 0, FailureHandling.STOP_ON_FAILURE)

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))

driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/TimManajemenHalalTRUE'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/TandaTangan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/SimpanTTD'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Dokumen Halal/Informasi Umum/Pendaftaran awal/SimpanKaryawanButton'), 0, FailureHandling.STOP_ON_FAILURE)

