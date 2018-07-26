package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL1
     
    /**
     * <p></p>
     */
    public static Object UName
     
    /**
     * <p></p>
     */
    public static Object Password
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL1' : 'https://opensource-demo.orangehrmlive.com/', 'UName' : 'admin', 'Password' : 'admin123'])
        allVariables.put('Reg', allVariables['default'] + ['URL1' : 'https://opensource-demo.orangehrmlive.com/', 'UName' : 'adminreg', 'Password' : 'admin123'])
        allVariables.put('qa', allVariables['default'] + ['URL1' : 'https://opensource-demo.orangehrmlive.com/', 'UName' : 'adminqa', 'Password' : 'admin123'])
        allVariables.put('stg', allVariables['default'] + ['URL1' : 'https://opensource-demo.orangehrmlive.com/', 'UName' : 'admin', 'Password' : 'admin123'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        URL1 = selectedVariables['URL1']
        UName = selectedVariables['UName']
        Password = selectedVariables['Password']
        
    }
}
