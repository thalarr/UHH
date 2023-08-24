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

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/masukkanProduk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/produk-NamaProduk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/produk-NamaProduk'), 'dodol bakar', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/produk-JenisProduk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/produk-makanan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/produk-Deskripsi'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/produk-Deskripsi'), 'dodol ueenak', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/BahanBakuPCS'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/BahanBakuPCS'), '2', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/KapasitasProduksi'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/Kalkulasi Harga/KapasitasProduksi'), '100', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/produk-Simpan2'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Kalkulasi Harga/produk-simpan1'), 0, FailureHandling.STOP_ON_FAILURE)

