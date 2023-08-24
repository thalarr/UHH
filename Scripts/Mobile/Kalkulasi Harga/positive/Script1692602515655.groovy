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

WebUI.callTestCase(findTestCase('Mobile/Preparation'), [:], FailureHandling.STOP_ON_FAILURE)

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Width Height and Store in device_Width variable'
device_Height = Mobile.getDeviceHeight()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/MenuCertificate'), 0)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/OnBoardingSertificate'), 0)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/NIB'), 0)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/NIB'), '3211231300007', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/NPWP'), 0)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/NPWP'), '3211231300008', 0)

Mobile.hideKeyboard()

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/JenisProduk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/Minuman'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/TotalKaryawan1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/TotalKaryawan1'), '2', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/JumlahArmada'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/JumlahArmada'), '2', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/OmsetUsaha'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/OmsetUsaha'), '20000000', 0)

Mobile.hideKeyboard()

'Swipe Vertical from top to bottom'
Mobile.delay(4)

WebUI.callTestCase(findTestCase('Mobile/Kalkulasi Harga/masukkan outlet'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mobile/Kalkulasi Harga/masukkan gudang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mobile/Kalkulasi Harga/masukkan produk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/KalkulasiHarga'), 0, FailureHandling.STOP_ON_FAILURE)

