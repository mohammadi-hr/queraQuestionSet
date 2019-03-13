package _11_codeConvension.ir.javacup.convension;

/**
 * Created by Mohammadi-HR on 3/13/2019.
 */
public class CodeConventionUtil {
    public String getFieldsName(String... params){
        String fieldName = new String();
        for(String s:params)
            fieldName += s;
        return fieldName;
    }

    public String getMethodsName(String... params){
        return "";
    }

    public String getClassName(String... params){
        return "";
    }

    public String getConstantsName(String... params){
        return "";
    }
}
