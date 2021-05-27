package validators;

import java.util.ArrayList;
import java.util.List;

import models.Message;

public class MessageValidator {
    public static List<String> validate(Message m){
        List<String> errors=new ArrayList<String>();

        String content_error=_validateContent(m.getContent());
        if(!content_error.equals("")){
            errors.add(content_error);
        }
        return errors;
    }
    private static String _validateTitle(String title){
        if(title==null||title.equals("")){
            return"タイトルを入力して下さい。";
        }
        return"";
    }
    private static String _validateContent(String content){
        if(content==null||content.equals("")){
            return"メッセージを入力して下さい。";
        }
        return"";
    }

}
