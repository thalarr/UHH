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

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/Selanjutnya 1'), 0)

Mobile.tap(findTestObject('Mobile/Register 1/Selanjutnya 2'), 0)

Mobile.tap(findTestObject('Mobile/Register 1/Gabung Sekarang'), 0)

Mobile.tap(findTestObject('Mobile/Register 1/Email'), 0)

Mobile.setText(findTestObject('Mobile/Register 1/Email'), 'syaifulanwar@peler.tech', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.view.View (2)'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Register 1/android.widget.EditText (3)'), '08999999999', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Register 1/android.widget.EditText (5)'), 'Mr Goo', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.widget.EditText (6)'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Register 1/android.widget.EditText (7)'), 'password', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register 1/android.view.View (4)'), 0)

