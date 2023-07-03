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

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.EditText (1)'), 'Pertalite', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.EditText (3)'), 'Pertalite Super', 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.TextView'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.AutoCompleteTextView - Search'), 'IMG-20230521-WA0008', 
    0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.RadioButton'), 0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

if (Mobile.verifyElementNotChecked(findTestObject('Mobile/Journey/Step 3/Sertifikasi CheckBox 1'), 4)) {
    Mobile.checkElement(findTestObject('Mobile/Journey/Step 3/Sertifikasi CheckBox 1'), 5)
}

Mobile.tap(findTestObject('Object Repository/Mobile/Journey/Step 3/android.widget.Button (2)'), 0)

