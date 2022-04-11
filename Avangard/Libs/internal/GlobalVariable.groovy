package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1040;&#1076;&#1084;&#1080;&#1085;
Profile 2005 team stage : &#1040;&#1076;&#1084;&#1080;&#1085;
Profile Manager : &#1045;&#1088;&#1086;&#1085;&#1082;&#1086;</p>
     */
    public static Object admin_login
     
    /**
     * <p></p>
     */
    public static Object admin_password
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1040;&#1075;&#1077;&#1077;&#1074;
Profile 2005 team stage : &#1051;&#1077;&#1074;&#1072;&#1096;&#1086;&#1074;</p>
     */
    public static Object coach_login
     
    /**
     * <p></p>
     */
    public static Object coach_password
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1043;&#1072;&#1085;&#1080;&#1085;
Profile 2005 team stage : &#1042;&#1083;&#1072;&#1089;&#1077;&#1085;&#1082;&#1086;</p>
     */
    public static Object player_login
     
    /**
     * <p></p>
     */
    public static Object player_password
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1044;&#1086;&#1082;&#1090;&#1086;&#1088;
Profile 2005 team stage : &#1044;&#1086;&#1082;&#1090;&#1086;&#1088;</p>
     */
    public static Object doktor_login
     
    /**
     * <p></p>
     */
    public static Object doktor_password
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1045;&#1088;&#1086;&#1085;&#1082;&#1086;
Profile 2005 team stage : &#1045;&#1088;&#1086;&#1085;&#1082;&#1086;</p>
     */
    public static Object manager_login
     
    /**
     * <p></p>
     */
    public static Object manager_password
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object player_for_test
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1050;&#1086;&#1084;&#1072;&#1085;&#1076;&#1072;
Profile 2005 team stage : &#1050;&#1086;&#1084;&#1072;&#1085;&#1076;&#1072;</p>
     */
    public static Object school
     
    /**
     * <p></p>
     */
    public static Object player_for_test_1
     
    /**
     * <p></p>
     */
    public static Object school_1
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1058;&#1088;&#1077;&#1085;&#1077;&#1088; &#1054;&#1060;&#1055;
Profile 2005 team stage : &#1058;&#1088;&#1077;&#1085;&#1077;&#1088; &#1054;&#1060;&#1055;</p>
     */
    public static Object OFP_trainer_login
     
    /**
     * <p>Profile omskie yastrebi STAGE (Ageev) : &#1058;&#1088;&#1077;&#1085;&#1077;&#1088; &#1054;&#1060;&#1055;
Profile 2005 team stage : &#1058;&#1088;&#1077;&#1085;&#1077;&#1088; &#1054;&#1060;&#1055;</p>
     */
    public static Object OFP_trainer_password
     
    /**
     * <p></p>
     */
    public static Object event
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            admin_login = selectedVariables['admin_login']
            admin_password = selectedVariables['admin_password']
            coach_login = selectedVariables['coach_login']
            coach_password = selectedVariables['coach_password']
            player_login = selectedVariables['player_login']
            player_password = selectedVariables['player_password']
            doktor_login = selectedVariables['doktor_login']
            doktor_password = selectedVariables['doktor_password']
            manager_login = selectedVariables['manager_login']
            manager_password = selectedVariables['manager_password']
            url = selectedVariables['url']
            player_for_test = selectedVariables['player_for_test']
            school = selectedVariables['school']
            player_for_test_1 = selectedVariables['player_for_test_1']
            school_1 = selectedVariables['school_1']
            OFP_trainer_login = selectedVariables['OFP_trainer_login']
            OFP_trainer_password = selectedVariables['OFP_trainer_password']
            event = selectedVariables['event']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
