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

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/Menu Sertifikasi'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/Sertifikasi Halal'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/Tombol Buat Sertifikat'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/NIB.EditText'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

Mobile.hideKeyboard()

//Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/UploadNIB'), 0)

//Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/android.widget.Button - Documents'), 0)

//Mobile.scrollToText('NIB', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/NPWP.EditText'), 0)

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

Mobile.hideKeyboard()

//Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/UploadNPWP'), 0)

//Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/android.widget.Button - Documents'), 0)

//Mobile.scrollToText('NPWP', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/Total Karyawan.EditText'), 0)

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))

driver.pressKey(new KeyEvent(AndroidKey.ENTER))


//Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/Jenis Layanan'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/JenisLayanan.Minuman'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/JenisLayanan.Simpan'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/PenyeliaHalal'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/PenyeliaHalal.True'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/JenisLayanan.Simpan'), 0)

Mobile.tap(findTestObject('Mobile/Sertifikat/Step1/TombolSelanjutnya'), 0)

